// sigchain_probe.js — 22차: 토스의 타이머 무력화를 우회하는 즉시-attach 프로브.
// 같은 부트의 같은-zygote 앱(설정 등)에서 libc syscall()으로 조회한 SIGSEGV
// 핸들러 주소(=libsigchain 진입점, zygote 상속으로 토스와 동일)를 로드 즉시
// attach한다. 모든 관찰은 앱 스레드 컨텍스트(시그널/인터셉트 콜백)에서만
// 발화 — setTimeout/setInterval 등 Gum 타이머는 토스에서 죽으므로 일절 안 씀.
'use strict';

var TARGET = "ADDR_PLACEHOLDER";   // 러너가 치환 (예: 0x7a981786d8)

function modOf(addr) {
    var m = Process.findModuleByAddress(addr);
    return m ? (m.name + "+0x" + addr.sub(m.base).toString(16)) : ("anon/" + addr);
}

function dumpHit(args, tag) {
    var si = args[1], uc = args[2];
    var line = "[HIT " + tag + "]";
    try {
        line += " si_addr=0x" + si.add(0x10).readPointer().toString(16) +
                " si_code=" + si.add(0x08).readS32() +
                " si_signo=" + si.add(0x00).readS32();
    } catch (e) { line += " [si fail]"; }
    try {
        var mc = uc.add(0x28);
        var pc = mc.add(0x108).readPointer();
        var sp = mc.add(0x100).readPointer();
        var x16 = mc.add(0x88).add(16 * 8).readPointer();
        var x0 = mc.add(0x88).readPointer();
        var lr = mc.add(0x88).add(30 * 8).readPointer();
        line += "\n  pc=" + modOf(pc) + " sp=0x" + sp.toString(16) +
                "\n  x0=" + modOf(x0) + " x16=" + (x16.isNull() ? "0" : modOf(x16)) +
                " lr=" + modOf(lr);
    } catch (e) { line += "\n  [uc fail " + e + "]"; }
    send(line);
}

(function () {
    var a = ptr(TARGET);
    send("[+] attaching " + modOf(a) + " (" + TARGET + ")");
    try {
        Interceptor.attach(a, {
            onEnter: function (args) { dumpHit(args, "sigchain"); }
        });
        send("[+] armed — 시그널 수신 시 앱 스레드에서 발화");
    } catch (e) {
        send("[!] attach fail: " + e);
    }
})();
