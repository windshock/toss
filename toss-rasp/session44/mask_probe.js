// 44차 mask_probe.js — JSONObject.put 훅으로 FDS 로그 k/v를 직렬화 시점에 직독
// (logstore 파일 업로드 레이스 회피) + exit 트랩.
'use strict';
var KEYS = { log_name:1, debugInfo:1, detected:1, result:1, rootDetectionFlag:1,
             guardLevel:1, attendingDetectorSet:1, exitPlan:1, caller:1, value:1,
             handledExitPlanPriority:1, isNotificationEnabled:1, from:1 };
function stackStr(n) {
    try {
        var st = Java.use("java.lang.Exception").$new().getStackTrace();
        var out = [];
        for (var i = 0; i < st.length && i < (n || 8); i++) out.push("    at " + st[i].toString());
        return out.join("\n");
    } catch (e) { return "?"; }
}
Java.perform(function () {
    try {
        Java.use("java.lang.System").exit.implementation = function (c) { send("[EXIT] System.exit(" + c + ")\n" + stackStr(20)); return; };
        Java.use("java.lang.Runtime").exit.overload("int").implementation = function (c) { send("[EXIT] Runtime.exit(" + c + ")\n" + stackStr(20)); return; };
        send("[+] exit traps armed");
    } catch (e) {}
    try {
        var JO = Java.use("org.json.JSONObject");
        JO.put.overload("java.lang.String", "java.lang.Object").implementation = function (k, v) {
            try {
                if (KEYS[k]) {
                    var vs = v === null ? "null" : String(v);
                    if (vs.length < 200) send("[KV] " + k + " = " + vs);
                }
            } catch (e) {}
            return this.put(k, v);
        };
        JO.put.overload("java.lang.String", "double").implementation = function (k, v) {
            if (KEYS[k]) send("[KV] " + k + " = " + v);
            return this.put(k, v);
        };
        send("[+] JSONObject.put hooked");
    } catch (e) { send("[jo fail] " + e); }
});
