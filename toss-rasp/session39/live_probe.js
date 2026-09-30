// 39차 live_probe.js — 살아있는 프로세스에 재attach: selfprotect/DexGuard 클래스
// 열거 + 메서드 일람 + logstore 읽기. (hookAll 문제 회피: 탐색 우선)
'use strict';
send("[+] live_probe loaded");

Java.perform(function () {
    // 1) 로드된 클래스 중 관련 클래스 발견
    var hits = [];
    Java.enumerateLoadedClasses({
        onMatch: function (name) {
            if (/selfprotect|Dexguard/i.test(name)) hits.push(name);
        },
        onComplete: function () {
            send("[CLS] selfprotect/Dexguard classes: " + JSON.stringify(hits));
            // 2) 각 클래스의 declared 메서드 일람
            hits.forEach(function (cn) {
                try {
                    var C = Java.use(cn);
                    var dm = C.class.getDeclaredMethods();
                    var ms = [];
                    for (var i = 0; i < dm.length; i++) {
                        try {
                            var ps = dm[i].getParameterTypes();
                            var pt = [];
                            for (var k = 0; k < ps.length; k++) pt.push(ps[k].getName());
                            ms.push(dm[i].getName() + "(" + pt.join(",") + ")");
                        } catch (e) {}
                    }
                    send("[CLS] " + cn + " methods: " + ms.join(" | "));
                } catch (e) { send("[CLS] " + cn + " introspect fail: " + e); }
            });
        }
    });

    // 3) logstore 디렉터리 읽기
    try {
        var F = Java.use("java.io.File");
        var dir = F.$new("/data/data/viva.republica.toss/files/logstore/logitems");
        var list = dir.listFiles();
        var names = [];
        if (list) for (var i = 0; i < list.length; i++) names.push(String(list[i].getName()));
        send("[LOGSTORE] files now: " + JSON.stringify(names));
    } catch (e) { send("[LOGSTORE] fail " + e); }

    // 4) DetectType enum 값 직독 시도 (values())
    ["im.toss.selfprotect.DetectType"].forEach(function (cn) {
        try {
            var D = Java.use(cn);
            var vals = D.values();
            var out = [];
            for (var i = 0; i < vals.length; i++) { try { out.push(String(vals[i])); } catch (e) { out.push("?"); } }
            send("[DETECTTYPE] " + cn + " values: " + JSON.stringify(out));
        } catch (e) { send("[DETECTTYPE] " + cn + " fail: " + e); }
    });
});
