// sigaction_watch.js — 21차: SIGSEGV 핸들러 등록 감시 + 진입 시 si_addr/복원 pc 덤프
'use strict';

function modOf(addr) {
    var m = Process.findModuleByAddress(addr);
    return m ? (m.name + "+0x" + addr.sub(m.base).toString(16)) : "anon/0x" + addr.toString(16);
}

var handlers = [];

["sigaction", "__sigaction"].forEach(function(fn) {
    try {
        Interceptor.attach(Module.getExportByName("libc.so", fn), {
            onEnter: function(args) {
                var signum = args[1].toInt32();
                if (signum !== 11) return;   // SIGSEGV만
                var act = args[2];
                if (act.isNull()) return;
                var handler = act.readPointer();
                var flags = act.add(8).readU32();
                var caller = this.returnAddress;
                var mh = Process.findModuleByAddress(handler);
                var mc = Process.findModuleByAddress(caller);
                var rec = {
                    fn: fn,
                    handler: handler.toString(),
                    hmod: mh ? mh.name : "anon",
                    caller: mc ? (mc.name + "+0x" + caller.sub(mc.base).toString(16)) : "0x" + caller.toString(16),
                    flags: "0x" + flags.toString(16)
                };
                handlers.push(rec);
                send("[SIGSEGV sigaction] via=" + fn + " handler=" + rec.handler +
                     " (" + rec.hmod + ") flags=" + rec.flags + " from=" + rec.caller);
                // 핸들러 진입 감시: siginfo(si_addr@0x10) + ucontext 복원 pc(@uctx+0x128)
                var h = handler;
                Interceptor.attach(h, {
                    onEnter: function(args) {
                        var si = args[1], uc = args[2];
                        try {
                            var siAddr = si.add(0x10).readPointer();
                            var faultAddr = uc.add(0x28).readPointer();
                            var restpc = uc.add(0x28 + 0x100).readPointer();
                            var x16 = uc.add(0x28 + 16 * 8).readPointer();
                            var mpc = Process.findModuleByAddress(restpc);
                            send("[SEGV-HANDLER ENTER] h=" + h + " si_addr=0x" + siAddr.toString(16) +
                                 " frame.fault_addr=0x" + faultAddr.toString(16) +
                                 " frame.pc=" + (mpc ? mpc.name + "+0x" + (restpc - mpc.base).toString(16) : "0x" + restpc.toString(16)) +
                                 " frame.x16=0x" + x16.toString(16));
                        } catch (e) { send("[!] si read fail: " + e); }
                    }
                });
            }
        });
    } catch (e) { send("[!] " + fn + " fail: " + e); }
});

// 예외 관찰 (frida 핸들러가 보는 것)
Process.setExceptionHandler(function(details) {
    send("[frida EXC] " + details.type + " addr=0x" + details.address.toString(16));
    return false;
});
send("[+] sigaction watcher armed");
