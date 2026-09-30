// npe_guard.js — 26차: NPE 발생 자체를 차단해 스플래시→메인 전환을 유도한다.
// 배경(§27/§30): mBase=null인 isRestricted() 호출 → far=0 NPE → 크래시 처리 →
// Runtime.exit(0)(차단 시 생존하지만 스플래시 갇힘). 이 스크립트는 NPE 원천 차단:
//  1) ContextWrapper.isRestricted 오버라이드 — mBase=null이면 NPE 대신 false 반환
//     + 호출자 Java 스택 전송("누가 null-base를 호출하나" 포착)
//  2) ContextWrapper.setBase 감시 — null 세팅 시 호출자 스택(+필요시 차단 옵션)
//  3) System.exit/Runtime.exit 차단(이중 안전망) + UEH 감시
'use strict';
var DIRP = "/data/data/viva.republica.toss/";
function mark(name, extra) {
    try { var f = new File(DIRP + name, "w"); f.write("" + Date.now() + " " + (extra||"") + "\n"); f.close(); } catch (e) {}
}
var BLOCK_SETBASE_NULL = false;   // true면 setBase(null) 자체를 무시

Java.perform(function () {
    send("[+] npe_guard: VM entered");
    var Exc = Java.use("java.lang.Exception");
    function stack(tag) {
        try {
            var st = Exc.$new().getStackTrace();
            var lines = [];
            for (var i = 0; i < st.length && i < 12; i++) lines.push("    " + st[i].toString());
            send(tag + "\n" + lines.join("\n"));
        } catch (e) { send(tag + " [stack fail] " + e); }
    }

    try {
        var CW = Java.use("android.content.ContextWrapper");
        // 1) isRestricted: mBase=null → NPE 대신 false
        CW.isRestricted.implementation = function () {
            var b = this.mBase.value;
            if (b === null || b === undefined) {
                send("[isRestricted] mBase=null → false 반환(NPE 차단)");
                stack("[isRestricted caller]");
                return false;
            }
            return b.isRestricted();
        };
        // 2) setBase: null 감시
        CW.setBaseContext.implementation = function (ctx) {
            if (ctx === null || ctx === undefined) {
                send("[setBaseContext(null)] 감지!");
                stack("[setBase caller]");
                mark(".ng_setbase_null");
                if (BLOCK_SETBASE_NULL) { send("[setBase] null 세팅 차단(무시)"); return; }
            }
            this.mBase.value = ctx;
        };
        send("[+] ContextWrapper.isRestricted/setBase 후크 장착");
    } catch (e) { send("[cw hook fail] " + e); }

    // 3) exit 차단 (이중 안전망)
    try {
        var Sys = Java.use("java.lang.System");
        Sys.exit.implementation = function (c) { send("[EXIT] System.exit(" + c + ") BLOCKED"); return; };
        var Rt = Java.use("java.lang.Runtime");
        Rt.exit.overload("int").implementation = function (c) { send("[EXIT] Runtime.exit(" + c + ") BLOCKED"); return; };
        send("[+] exit 차단 장착");
    } catch (e) { send("[exit hook fail] " + e); }

    // 4) UEH 감시 (전달은 하되 관찰)
    try {
        var Thr = Java.use("java.lang.Thread");
        send("[UEH] current=" + (Thr.getDefaultUncaughtExceptionHandler() || {}).$className);
    } catch (e) {}
    mark(".ng_load");
    send("[+] npe_guard armed");
});
