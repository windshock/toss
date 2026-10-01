// exit_trap.js — 24차: attach(초기화 중) 기반 정밀 개입.
// 발견: spawn 주입은 가드가 무력화하지만 attach(1.5s 시점)는 생존.
// 이 스크립트는 System.exit 콜백에서 (1) Java 스택 트레이스 (2) exit 차단을 시도한다.
// BLOCK_EXIT=true면 실제 차단(프로세스 생존 관찰), false면 관찰만.
'use strict';
var BLOCK_EXIT = true;

var DIRP = "/data/data/viva.republica.toss/";
function mark(name, extra) {
    try {
        var f = new File(DIRP + name, "w");
        f.write("" + Date.now() + " " + (extra || "") + "\n");
        f.close();
    } catch (e) {}
}
function modOf(a) {
    var m = Process.findModuleByAddress(ptr(a));
    return m ? m.name + "+0x" + (parseInt(a) - m.base).toString(16) : "0x" + a;
}

mark(".et_load");
send("[+] exit_trap loaded (attach mode)");

Java.perform(function () {
    send("[+] Java VM entered");
    try {
        var Sys = Java.use("java.lang.System");
        var Exc = Java.use("java.lang.Exception");
        Sys.exit.implementation = function (code) {
            send("[EXIT] System.exit(" + code + ") called — 스택:");
            try {
                var st = Exc.$new().getStackTrace();
                for (var i = 0; i < st.length && i < 30; i++)
                    send("    at " + st[i].toString());
            } catch (e) { send("[stack fail] " + e); }
            mark(".et_exit_hit", "code=" + code);
            if (BLOCK_EXIT) {
                send("[EXIT] BLOCKED — 프로세스 생존 시도");
                return;   // 종료하지 않고 리턴
            }
            return this.exit(code);
        };
        // Runtime.exit/halt도 커버
        var Rt = Java.use("java.lang.Runtime");
        Rt.exit.overload("int").implementation = function (code) {
            send("[EXIT] Runtime.exit(" + code + ") — BLOCKED");
            return;
        };
        send("[+] System.exit/Runtime.exit trapped");
    } catch (e) { send("[hook fail] " + e); }

    // 조용한 exit이 exit 없이 오는 경우 대비: UEH 교체 감시
    try {
        var Thread = Java.use("java.lang.Thread");
        var cur = Thread.getDefaultUncaughtExceptionHandler();
        send("[UEH] current=" + (cur ? cur.$className : "null"));
        Thread.setDefaultUncaughtExceptionHandler(Java.registerClass({
            name: "org.probe.WatchUEH",
            implements: [Java.use("java.lang.Thread$UncaughtExceptionHandler")],
            methods: {
                uncaughtException: function (t, e) {
                    send("[UEH-HIT] thread=" + t + " exc=" + e);
                    try {
                        var Log = Java.use("android.util.Log");
                        send(Log.getStackTraceString(e).substring(0, 3000));
                    } catch (x) {}
                    // 원래 핸들러로 전달하지 않고 흡수(차단) — 관찰 우선
                }
            }
        }).$new());
        send("[+] UEH watcher installed");
    } catch (e) { send("[ueh fail] " + e); }
});
send("[+] exit_trap init done");
