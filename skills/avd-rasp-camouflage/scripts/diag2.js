'use strict';
Java.perform(function () {
    var CW = Java.use("android.content.ContextWrapper");
    var all = CW.class.getDeclaredMethods();
    var names = [];
    for (var i = 0; i < all.length; i++) names.push(all[i].getName());
    send("[CW] 전체 declared: " + names.join(","));
    ["isRestricted", "setBaseContext", "setBase", "getBaseContext"].forEach(function (n) {
        try {
            var t = typeof CW[n];
            var extra = "";
            if (t === "object" || t === "function") {
                try { extra = " (overloads=" + CW[n].overloads.length + ")"; } catch (e) { extra = " (ovl err)"; }
            }
            send("[CW] " + n + " -> " + t + extra);
        } catch (e) { send("[CW] " + n + " err " + e); }
    });
    // isRestricted만 단독 후크 시도
    try {
        CW.isRestricted.implementation = function () {
            var b = this.mBase.value;
            if (b === null) { send("[HOOK-HIT] isRestricted mBase=null → false"); return false; }
            return b.isRestricted();
        };
        send("[OK] isRestricted 후크 성공!");
    } catch (e) { send("[FAIL] isRestricted 후크: " + e); }
});
