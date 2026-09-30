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
    // exit 트랩(차단+스택)
try {
    var Sys = Java.use("java.lang.System");
    Sys.exit.implementation = function (code) {
        send("[EXIT] System.exit(" + code + ") 스택:\n" + stackStr());
        return;  // BLOCK
    };
    var Rt = Java.use("java.lang.Runtime");
    Rt.exit.overload("int").implementation = function (code) {
        send("[EXIT] Runtime.exit(" + code + ") 스택:\n" + stackStr());
        return;  // BLOCK
    };
    send("[+] exit traps armed");
} catch (e) { send("[exit fail] " + e); }

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
    var seenLogs = {};
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
        // (write 훅은 재귀 위험 — 제거. 열림 이벤트에서 지연 읽기로 대체)
        var readFile = function (p) {
            try {
                var FIS = Java.use("java.io.FileInputStream");
                var fis = FIS.$new(p);
                var BA = Java.use("java.io.ByteArrayOutputStream");
                var baos = BA.$new();
                var buf = Java.array("byte", new Array(4096).fill(0));
                var n;
                while ((n = fis.read(buf)) > 0) baos.write(buf, 0, n);
                fis.close();
                send("[LOGJSON] " + baos.toString("UTF-8"));
            } catch (e) { send("[read fail] " + e); }
        };
        globalThis.__readLog = readFile;
        // logstore 디렉터리 폴링 읽기
        setInterval(function () {
            try {
                var F = Java.use("java.io.File");
                var dir = F.$new("/data/data/viva.republica.toss/files/logstore/logitems");
                var list = dir.listFiles();
                if (list) for (var i = 0; i < list.length; i++) {
                    var nm = String(list[i].getName());
                    if (!seenLogs[nm]) {
                        seenLogs[nm] = true;
                        globalThis.__readLog("/data/data/viva.republica.toss/files/logstore/logitems/" + nm);
                    }
                }
            } catch (e) {}
        }, 250);
        send("[+] logstore content capture armed");
    } catch (e) { send("[cap fail] " + e); }
});
