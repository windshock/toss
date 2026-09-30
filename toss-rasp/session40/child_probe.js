// 40차 child_probe.js — 가드 fork 자식에 주입: DexguardRasp/DetectType 직접 열거+후킹.
'use strict';
send("[child] probe loaded pid=" + Process.id);

function dumpClass(cn) {
    try {
        var C = Java.use(cn);
        // 정적 필드 전수
        try {
            var fl = C.class.getDeclaredFields();
            for (var i = 0; i < fl.length; i++) {
                try {
                    fl[i].setAccessible(true);
                    var v = fl[i].get(null);
                    send("[child] FIELD " + cn + "." + fl[i].getName() + " = " + String(v));
                } catch (e2) {}
            }
        } catch (e) {}
        // 메서드 일람+후킹
        var dm = C.class.getDeclaredMethods();
        var names = {};
        for (var i = 0; i < dm.length; i++) names[dm[i].getName()] = true;
        Object.keys(names).forEach(function (mn) {
            if (mn.indexOf("$") >= 0) return;
            try {
                C[mn].overloads.forEach(function (ov) {
                    ov.implementation = function () {
                        var a = [];
                        for (var q = 0; q < arguments.length; q++) {
                            try { a.push(String(arguments[q])); } catch (e3) { a.push("?"); }
                        }
                        var r = ov.apply(this, arguments);
                        try { send("[child] CALL " + cn + "." + mn + "(" + a.join(",") + ") -> " + String(r)); } catch (e4) {}
                        return r;
                    };
                });
            } catch (e) {}
        });
        send("[child] hooked " + cn + " (" + Object.keys(names).length + " method names)");
    } catch (e) { send("[child] dump " + cn + " fail: " + e); }
}

Java.perform(function () {
    // 1) 클래스 존재 확인 + DetectType enum 값
    Java.enumerateLoadedClasses({
        onMatch: function (name) {
            if (/selfprotect|Dexguard|DetectType/i.test(name)) send("[child] CLS " + name);
        },
        onComplete: function () { send("[child] enum done"); }
    });
    ["im.toss.selfprotect.DetectType", "im.toss.selfprotect.DexguardRasp",
     "im.toss.selfprotect.DexguardWrapper"].forEach(function (cn) {
        // DetectType values() 특별 처리
        if (cn.indexOf("DetectType") >= 0) {
            try {
                var D = Java.use(cn);
                var vals = D.values();
                var out = [];
                for (var i = 0; i < vals.length; i++) { try { out.push(String(vals[i])); } catch (e) { out.push("?"); } }
                send("[child] ★ DetectType.values: " + JSON.stringify(out));
            } catch (e) { send("[child] DetectType values fail: " + e); }
        }
        dumpClass(cn);
    });
    // 2) 재열거 인터벌(자식에서 늦게 로드되는 경우)
    var n = 0;
    var iv = setInterval(function () {
        n++;
        if (n > 30) { clearInterval(iv); return; }
        Java.perform(function () {
            Java.enumerateLoadedClasses({
                onMatch: function (name) {
                    if (/selfprotect|Dexguard|DetectType/i.test(name)) send("[child] CLS+ " + name);
                },
                onComplete: function () {}
            });
        });
    }, 300);
});
