// exit_trace.js — 21차: System.exit/Runtime.exit/native exit 호출자 식별
'use strict';

// 예외 추적 (frida가 SIGSEGV를 먼저 관찰 — pc/far/모듈 매핑)
Process.setExceptionHandler(function(details) {
    var line = "[EXC] type=" + details.type + " addr=0x" + details.address.toString(16);
    try {
        var m = Process.findModuleByAddress(details.address);
        if (m) line += " (FAR: " + m.name + "+0x" + (details.address - m.base).toString(16) + ")";
    } catch (e) {}
    send(line);
    try {
        var c = details.context, pc = c.pc;
        var mp = Process.findModuleByAddress(pc);
        var pcs = mp ? (mp.name + "+0x" + (pc - mp.base).toString(16)) : "0x" + pc.toString(16);
        var ml = Process.findModuleByAddress(c.lr);
        var lrs = ml ? (ml.name + "+0x" + (c.lr - ml.base).toString(16)) : "0x" + c.lr.toString(16);
        send("    pc=" + pcs + " lr=" + lrs + " sp=0x" + c.sp.toString(16) +
             " x0=0x" + c.x0.toString(16) + " x16=0x" + c.x16.toString(16));
    } catch (e) { send("[!] ctx fail: " + e); }
    return false;
});
send("[+] exception tracer armed");

function jstack() {
    var Exception = Java.use("java.lang.Exception");
    var Log = Java.use("android.util.Log");
    return Log.getStackTraceString(Exception.$new());
}

// 네이티브 exit 훅 (앱이 네이티브 경로로 빠져나가는 경우 대비)
setTimeout(function() {
    var libc = "libc.so";
    ["exit", "_exit", "abort"].forEach(function(fn) {
        try {
            Interceptor.attach(Module.getExportByName(libc, fn), {
                onEnter: function(args) {
                    var bt = Thread.backtrace(this.context, Backtracer.FUZZY)
                        .map(DebugSymbol.fromAddress).join("\n    ");
                    send("[native " + fn + "] arg0=" + args[0] + "\n    " + bt);
                }
            });
        } catch (e) { send("[!] " + fn + " fail: " + e); }
    });
    ["kill", "tgkill"].forEach(function(fn) {
        try {
            Interceptor.attach(Module.getExportByName(libc, fn), {
                onEnter: function(args) {
                    send("[native " + fn + "] " + args[0] + "," + args[1] + "," + args[2]);
                }
            });
        } catch (e) { send("[!] " + fn + " fail: " + e); }
    });
}, 0);

Java.perform(function() {
    try {
        var System = Java.use("java.lang.System");
        System.exit.implementation = function(status) {
            send("[System.exit] status=" + status + "\n" + jstack());
            return this.exit(status);
        };
        send("[+] System.exit hooked");
    } catch (e) { send("[!] System.exit fail: " + e); }

    try {
        var Rt = Java.use("java.lang.Runtime");
        Rt.exit.implementation = function(status) {
            send("[Runtime.exit] status=" + status + "\n" + jstack());
            return this.exit(status);
        };
        Rt.halt.implementation = function(status) {
            send("[Runtime.halt] status=" + status + "\n" + jstack());
            return this.halt(status);
        };
        send("[+] Runtime.exit/halt hooked");
    } catch (e) { send("[!] Runtime fail: " + e); }

    try {
        var PM = Java.use("android.os.PowerManager");
        PM.reboot.overload("java.lang.String").implementation = function(reason) {
            send("[PM.reboot] reason=" + reason + "\n" + jstack());
            return this.reboot(reason);
        };
        send("[+] PowerManager.reboot hooked");
    } catch (e) { send("[!] PM.reboot fail: " + e); }

    // 미포착 예외 감시 — 어떤 예외가 앱을 죽이는지
    try {
        var Th = Java.use("java.lang.Thread");
        Th.dispatchUncaughtException.implementation = function(t) {
            send("[dispatchUncaughtException] thread=" + t.getName());
            return this.dispatchUncaughtException(t);
        };
        send("[+] dispatchUncaughtException hooked");
    } catch (e) { send("[!] UEH dispatch fail: " + e); }

    // 토스 자체 크래시 핸들러 람다 + Bugsnag 핸들러 훅 (21차)
    try {
        var L17 = Java.use("im.toss.TossApplication$$ExternalSyntheticLambda17");
        L17.uncaughtException.implementation = function(t, e) {
            send("[TossLambda17 UEH] thread=" + t.getName() +
                 " exc=" + e.$className + " msg=" + e.getMessage() +
                 "\n" + jstack());
            return this.uncaughtException(t, e);
        };
        send("[+] TossLambda17 hooked");
    } catch (e) { send("[!] TossLambda17 fail: " + e); }

    try {
        var BEH = Java.use("com.bugsnag.android.ExceptionHandler");
        BEH.uncaughtException.implementation = function(t, e) {
            send("[Bugsnag UEH] exc=" + e.$className + " msg=" + e.getMessage());
            return this.uncaughtException(t, e);
        };
        send("[+] Bugsnag UEH hooked");
    } catch (e) { send("[!] Bugsnag UEH fail: " + e); }

    // 언캐트 핸들러 교체 감시 — 가드/Bugsnag가 설치하는 핸들러 확인
    try {
        var Thread = Java.use("java.lang.Thread");
        var origSet = Thread.setDefaultUncaughtExceptionHandler;
        Thread.setDefaultUncaughtExceptionHandler.implementation = function(h) {
            send("[setDefaultUEH] handler=" + (h === null ? "null" : h.$className));
            return origSet.call(this, h);
        };
        var cur = Thread.getDefaultUncaughtExceptionHandler();
        send("[UEH current] " + (cur === null ? "null" : cur.$className));
    } catch (e) { send("[!] UEH fail: " + e); }
});
