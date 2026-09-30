// 39차 fds_hook.js — 부모측 FDS 로거(o.ComputeLandmarkConfidence.onNavigationEvent)
// 인자 직독 + logstore JSON 내용 캡처(쓰기 시점).
'use strict';
function stackStr() {
    try {
        var st = Java.use("java.lang.Exception").$new().getStackTrace();
        var out = [];
        for (var i = 0; i < st.length && i < 25; i++) out.push("    at " + st[i].toString());
        return out.join("\n");
    } catch (e) { return "?"; }
}
Java.perform(function () {
    // 1) FDS 로거 진입(스택에 보인 2개 프레임) 훅 — 인자 전수 덤프
    ["o.ComputeLandmarkConfidence", "o.GetDetectingInterval"].forEach(function (cn) {
        try {
            var C = Java.use(cn);
            var dm = C.class.getDeclaredMethods();
            for (var i = 0; i < dm.length; i++) {
                var mn = dm[i].getName();
                try {
                    C[mn].overloads.forEach(function (ov) {
                        ov.implementation = function () {
                            var a = [];
                            for (var q = 0; q < arguments.length; q++) {
                                try { a.push(String(arguments[q])); } catch (e2) { a.push("?"); }
                            }
                            send("[FDS] " + cn + "." + mn + "(\n      " + a.join(",\n      ") + "\n)");
                            return ov.apply(this, arguments);
                        };
                    });
                    send("[+] hooked " + cn + "." + mn);
                } catch (e) {}
            }
        } catch (e) { send("[hook fail] " + cn + ": " + e); }
    });

    // 2) logstore 파일 write 시 내용 캡처 — FOS.write(byte[]) 가로채기
    try {
        var FOS = Java.use("java.io.FileOutputStream");
        var pathOf = {};   // this.toString → 경로
        FOS.$init.overloads.forEach(function (ov) {
            ov.implementation = function () {
                for (var q = 0; q < arguments.length; q++) {
                    try {
                        var aq = arguments[q];
                        if (aq && aq.getAbsolutePath) {
                            var p = String(aq.getAbsolutePath());
                            pathOf[this.hashCode()] = p;
                        }
                    } catch (e2) {}
                }
                return ov.apply(this, arguments);
            };
        });
        var BAOS = Java.use("java.lang.String");
        FOS.write.overload("[B").implementation = function (b) {
            var p = pathOf[this.hashCode()];
            if (p && p.indexOf("logstore") >= 0) {
                try {
                    var s = Java.use("java.lang.String").$new(b, "UTF-8");
                    send("[LOGJSON] " + s);
                } catch (e3) {}
            }
            return this.write(b);
        };
        send("[+] logstore content capture armed");
    } catch (e) { send("[cap fail] " + e); }
});
