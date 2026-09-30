// handler_query.js — 22차: libc syscall() 래퍼로 rt_sigaction(SIGSEGV, NULL, &old)
// 조회(변경 없음) → 커널에 실제 등록된 핸들러 주소를 얻는다. sigchain 내부 체인
// 등록은 syscall이 없어 커널 SIGACT11로 못 보지만, 이 조회로 "최종 수신자" 주소는
// 확보된다. 주기 폴링으로 fault 전까지의 주소 변천 + attach 진입 관찰.
'use strict';

var armed = {};

function modOf(addr) {
    var m = Process.findModuleByAddress(addr);
    return m ? (m.name + "+0x" + addr.sub(m.base).toString(16)) : ("anon/" + addr);
}

function queryHandler() {
    // arm64: rt_sigaction = 134. oldact 버퍼 = struct sigaction (256B 여유).
    var old = Memory.alloc(256);
    var sys = new NativeFunction(
        Module.getExportByName("libc.so", "syscall"),
        "long", ["long", "long", "pointer", "pointer", "long"]);
    var r = sys(134, 11, NULL, old, 8);   // (nr, sig, act=NULL, oldact, sigsetsize)
    var rc = (r && r.toInt32) ? r.toInt32() : Number(r);
    if (rc !== 0) return null;            // 실패
    return old.readPointer();            // sa_handler @ offset 0
}

function attachTo(addr) {
    var key = addr.toString();
    if (armed[key]) return;
    armed[key] = true;
    send("[ARM] " + modOf(addr) + " (" + key + ")");
    try {
        Interceptor.attach(addr, {
            onEnter: function (args) {
                var si = args[1], uc = args[2];
                var line = "[HIT " + modOf(addr) + "]";
                try {
                    line += " si_addr=0x" + si.add(0x10).readPointer().toString(16) +
                            " si_code=" + si.add(0x08).readS32();
                } catch (e) { line += " [si fail]"; }
                try {
                    var mc = uc.add(0x28);
                    var pc = mc.add(0x108).readPointer();
                    var sp = mc.add(0x100).readPointer();
                    var x16 = mc.add(0x88).add(16 * 8).readPointer();
                    line += "\n  restore pc=" + modOf(pc) + " sp=0x" + sp.toString(16) +
                            " x16=" + (x16.isNull() ? "0" : modOf(x16));
                } catch (e) { line += " [uc fail " + e + "]"; }
                send(line);
            }
        });
    } catch (e) { send("[attach fail] " + e); }
}

var lastSeen = null;
function tick() {
    try {
        var h = queryHandler();
        if (h === null) { send("[q] rt_sigaction query failed"); return; }
        var hs = h.toString();
        if (hs !== lastSeen) {
            send("[q] SIGSEGV handler now: " + modOf(h) + " (" + hs + ")");
            lastSeen = hs;
            attachTo(h);
        }
    } catch (e) { send("[q] tick fail: " + e); }
}

setTimeout(function () {
    send("[dbg] first tick (t=1200ms)");
    tick();
    var iv = setInterval(tick, 700);
    // 25s 후 폴링 감속(fault는 통상 ~13s 내)
    setTimeout(function () { clearInterval(iv); iv = setInterval(tick, 2000); }, 25000);
}, 1200);
send("[+] handler query/probe ready");
