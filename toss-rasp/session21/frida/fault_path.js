// fault_path.js — SIGSEGV 시그니처(sp 주변 스택 워크)로 libea56 호출 경로 특정
'use strict';

function modOf(addr) {
    var m = Process.findModuleByAddress(addr);
    return m ? (m.name + "+0x" + addr.sub(m.base).toString(16)) : null;
}

Process.setExceptionHandler(function(details) {
    var c = details.context;
    send("[EXC] type=" + details.type + " addr=0x" + details.address.toString(16) +
         " pc=" + modOf(c.pc) + " (" + c.pc + ")");
    send("    x0=0x" + c.x0.toString(16) + " x16=0x" + c.x16.toString(16) +
         " x29=0x" + c.x29.toString(16) + " sp=0x" + c.sp.toString(16) +
         " lr=" + (modOf(c.lr) || ("0x" + c.lr.toString(16))));
    // 스택 워크: sp~sp+0x400에서 libea56 영역으로의 복귀주소 찾기
    try {
        var sp = c.sp;
        var found = [];
        for (var off = 0; off < 0x400; off += 8) {
            var v = ptr(sp).add(off).readPointer();
            var m = Process.findModuleByAddress(v);
            if (m && m.name.indexOf("libea56") >= 0) {
                found.push("sp+0x" + off.toString(16) + " -> libea56+0x" +
                           v.sub(m.base).toString(16));
            }
        }
        send("    libea56 return-adders on stack: " + (found.length ? "\n      " + found.join("\n      ") : "none"));
    } catch (e) { send("    [!] stack walk fail: " + e); }
    // lr 체인: x30 -> [x29] -> [[x29]] 3단 프레임 워크
    try {
        var fp = c.x29;
        for (var i = 0; i < 6 && !fp.equals(0); i++) {
            var lrv = fp.add(8).readPointer();
            var mv = Process.findModuleByAddress(lrv);
            if (mv) send("    frame" + i + ": fp=0x" + fp.toString(16) + " lr=" +
                         mv.name + "+0x" + lrv.sub(mv.base).toString(16));
            var next = fp.readPointer();
            if (next <= fp || next.sub(fp) > 0x100000) break;
            fp = next;
        }
    } catch (e) { send("    [!] frame walk end: " + e); }
    return false;
});
send("[+] fault path tracer armed");
