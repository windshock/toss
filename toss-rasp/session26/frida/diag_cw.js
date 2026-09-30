// ContextWrapper 메서드 노출 진단 — isRestricted/setBase가 frida에 보이는가
'use strict';
Java.perform(function () {
    try {
        var CW = Java.use("android.content.ContextWrapper");
        send("[CW] class loaded: " + CW.$className);
        var names = [];
        var methods = CW.class.getDeclaredMethods();
        for (var i = 0; i < methods.length; i++) {
            var n = methods[i].getName();
            if (n === "isRestricted" || n === "setBase" || n === "getBaseContext")
                names.push(n + "(" + methods[i].getParameterTypes().length + " args)");
        }
        send("[CW] declared target methods: " + (names.join(", ") || "NONE"));
        send("[CW] frida view: isRestricted=" + (typeof CW.isRestricted) + " setBase=" + (typeof CW.setBase));
        // 부모(Context)에는?
        var CT = Java.use("android.content.Context");
        var m2 = CT.class.getDeclaredMethods();
        var hit = [];
        for (var j = 0; j < m2.length; j++) if (m2[j].getName() === "isRestricted") hit.push("yes");
        send("[Context] isRestricted declared: " + (hit.length ? "yes" : "no") + " fruda view=" + (typeof CT.isRestricted));
    } catch (e) { send("[diag fail] " + e); }
});
