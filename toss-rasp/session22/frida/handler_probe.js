// handler_probe.js — 22차: 커널(SIGACT11)이 포착한 핸들러 주소를 런타임 arm 받아
// 진입 시 siginfo/ucontext를 덤프한다. far=0 fault를 수거하는 "가드 핸들러"의
// 정체(모듈)와 핸들러가 보는 복원 pc/x16을 실측하는 것이 목적.
'use strict';

var armed = {};   // addr(str) -> true

function modOf(addr) {
    var m = Process.findModuleByAddress(addr);
    return m ? (m.name + "+0x" + addr.sub(m.base).toString(16)) : ("anon/" + addr);
}

// arm(addrStr): 호스트 러너가 dmesg SIGACT11에서 확보한 주소를 전달
rpc.exports = {
    arm: function (addrStr) {
        var a = ptr(addrStr);
        if (armed[addrStr]) return "already";
        if (a.isNull() || a.toInt32() === 1) return "skip-defl-ign";  // SIG_DFL/SIG_IGN
        armed[addrStr] = true;
        send("[ARM] " + addrStr + " (" + modOf(a) + ")");
        try {
            Interceptor.attach(a, {
                onEnter: function (args) {
                    var sig = args[0].toInt32 ? args[0].toInt32() : -1;
                    var si = args[1], uc = args[2];
                    send("[HIT] sig=" + sig + " handler=" + addrStr);
                    // siginfo: si_addr @ +0x10
                    try {
                        send("  si_addr=0x" + si.add(0x10).readPointer().toString(16) +
                             " si_code=" + si.add(0x08).readS32());
                    } catch (e) { send("  [si read fail] " + e); }
                    // ucontext: arm64 uc_mcontext @ +0x28 (sigcontext: fault@0,
                    // regs[31]@8, sp@0x100, pc@0x108). 주요 슬롯 + 인접 후보 덤프.
                    try {
                        var mc = uc.add(0x28);
                        var pc = mc.add(0x108).readPointer();
                        var sp = mc.add(0x100).readPointer();
                        var x16 = mc.add(0x88).add(16 * 8).readPointer();
                        send("  restore pc=" + modOf(pc) + " sp=0x" + sp.toString(16) +
                             " x16=" + (x16.isNull() ? "0" : modOf(x16)));
                        // 인접 후보(오프셋 이견 대비): 0xA8/0xB0/0x128/0x130
                        [0xA8, 0xB0, 0x128, 0x130].forEach(function (o) {
                            try {
                                var v = uc.add(o).readPointer();
                                if (!v.isNull() && v.compare(0x1000) > 0)
                                    send("  uctx+0x" + o.toString(16) + " = " + modOf(v));
                            } catch (e) {}
                        });
                    } catch (e) { send("  [uc read fail] " + e); }
                }
            });
            return "armed";
        } catch (e) { return "fail: " + e; }
    },
    status: function () { return Object.keys(armed); }
};
send("[+] handler probe ready (waiting for arm())");
