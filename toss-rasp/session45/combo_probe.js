// 44차 argdump_probe.js — FDS 로거 메서드 인자를 리플렉션 필드 덤프
// (직렬화 라이브러리 무관) + exit 트랩.
'use strict';
function stackStr(n) {
    try {
        var st = Java.use("java.lang.Exception").$new().getStackTrace();
        var out = [];
        for (var i = 0; i < st.length && i < (n || 8); i++) out.push("    at " + st[i].toString());
        return out.join("\n");
    } catch (e) { return "?"; }
}
function dumpObj(o, depth) {
    if (o === null || o === undefined) return "null";
    if (depth > 2) return String(o);
    try {
        var JO = Java.use("java.lang.Object");
        var obj = Java.cast(o, JO);
        var cls = obj.getClass();
        var cn = String(cls.getName());
        // 기본형/문자열은 그대로
        if (cn == "java.lang.String" || cn.indexOf(".") < 0) return String(o);
        // Map은 엔트리 전개 (debugInfo 마스크의 실제 소재)
        try {
            var MAP = Java.use("java.util.Map");
            var mp = Java.cast(o, MAP);
            var es = mp.entrySet().toArray();
            var parts = [];
            for (var j = 0; j < es.length && j < 24; j++) {
                try { parts.push(String(es[j])); } catch (e5) { parts.push("?"); }
            }
            if (parts.length) return "MAP{" + parts.join(" | ") + "}";
        } catch (e4) {}
        var sb = [];
        var fl = cls.getDeclaredFields();
        for (var i = 0; i < fl.length && i < 20; i++) {
            try {
                fl[i].setAccessible(true);
                var v = fl[i].get(o);
                var vs;
                try { vs = dumpObj(v, depth + 1); } catch (e2) { vs = "?"; }
                if (vs === null) vs = "null";
                sb.push(fl[i].getName() + "=" + String(vs).substring(0, 120));
            } catch (e3) {}
        }
        return cn.split(".").pop() + "{" + sb.join(", ") + "}";
    } catch (e) { return String(o); }
}
Java.perform(function () {
    try {
        Java.use("java.lang.System").exit.implementation = function (c) { send("[EXIT] System.exit(" + c + ")\n" + stackStr(20)); return; };
        Java.use("java.lang.Runtime").exit.overload("int").implementation = function (c) { send("[EXIT] Runtime.exit(" + c + ")\n" + stackStr(20)); return; };
        send("[+] exit traps armed");
    } catch (e) {}
    ["o.ComputeLandmarkConfidence", "o.GetDetectingInterval"].forEach(function (cn) {
        try {
            var C = Java.use(cn);
            var dm = C.class.getDeclaredMethods();
            var count = 0;
            for (var i = 0; i < dm.length; i++) {
                var mn = dm[i].getName();
                if (mn.indexOf("$") >= 0) continue;
                try {
                    C[mn].overloads.forEach(function (ov) {
                        ov.implementation = function () {
                            for (var q = 0; q < arguments.length; q++) {
                                try {
                                    var d = dumpObj(arguments[q], 0);
                                    if (d.length > 3) send("[ARG] " + cn.split(".").pop() + "." + mn + " #" + q + ": " + d.substring(0, 4000));
                                } catch (e2) {}
                            }
                            return ov.apply(this, arguments);
                        };
                    
    // logstore 폴링 캡처 (42차 성공 경로)
    var seenLogs = {};
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
        } catch (e) {}
    };
    setInterval(function () {
        try {
            var F = Java.use("java.io.File");
            var dir = F.$new("/data/data/viva.republica.toss/files/logstore/logitems");
            var list = dir.listFiles();
            if (list) for (var i = 0; i < list.length; i++) {
                var nm = String(list[i].getName());
                if (!seenLogs[nm]) { seenLogs[nm] = true; readFile("/data/data/viva.republica.toss/files/logstore/logitems/" + nm); }
            }
        } catch (e) {}
    }, 200);
});
                    count++;
                } catch (e) {}
            }
            send("[+] hooked " + cn + " (" + count + ")");
        } catch (e) { send("[fail] " + cn + ": " + e); }
    });

    // logstore 폴링 캡처 (42차 성공 경로)
    var seenLogs = {};
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
        } catch (e) {}
    };
    setInterval(function () {
        try {
            var F = Java.use("java.io.File");
            var dir = F.$new("/data/data/viva.republica.toss/files/logstore/logitems");
            var list = dir.listFiles();
            if (list) for (var i = 0; i < list.length; i++) {
                var nm = String(list[i].getName());
                if (!seenLogs[nm]) { seenLogs[nm] = true; readFile("/data/data/viva.republica.toss/files/logstore/logitems/" + nm); }
            }
        } catch (e) {}
    }, 200);
});
