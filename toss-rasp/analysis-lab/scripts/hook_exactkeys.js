// §120 — exact long keys via reflection: Field.get(null) → Long.toString()
// (Java-side stringify crosses as exact digits; frida number marshaling loses
// >2^53). Also re-reads the dynamic-3 tables late (post-population).
var SPEC = {"o.getTabBar":["onWarmupCompleted"],"o.s8ExternalSyntheticLambda1":["onWarmupCompleted"],
            "im.toss.security.impl.malware.MalwareDetectActivity$onTransact":["onWarmupCompleted","IAuthTabCallback"],
            "o.s3c":["IAuthTabCallbackDefault"]};
var loader = null;
var done = false;
function readExact() {
    Java.perform(function () {
        try {
            var F = loader.use("java.lang.reflect.Field");
            for (var cls in SPEC) {
                try {
                    var C = loader.use(cls);
                    var kc = C.class;
                    for (var j = 0; j < SPEC[cls].length; j++) {
                        var fn = SPEC[cls][j];
                        try {
                            var fld = kc.getDeclaredField(fn);
                            fld.setAccessible(true);
                            var v = fld.get(null);
                            send({ev: "key", cls: cls, f: fn, v: v === null ? "null" : "" + v.toString()});
                        } catch (e) { send({ev: "key-err", cls: cls, f: fn, err: ("" + e).slice(0, 90)}); }
                    }
                } catch (e) { send({ev: "cls-err", cls: cls, err: ("" + e).slice(0, 60)}); }
            }
            // late table re-read for the dynamic classes
            var TR = [["o.getTabBar","onWarmupCompleted"],["o.s3c","IAuthTabCallbackDefault"],
                      ["im.toss.security.impl.malware.MalwareDetectActivity$onTransact","onWarmupCompleted"]];
            for (var q = 0; q < TR.length; q++) {
                try {
                    var C2 = loader.use(TR[q][0]);
                    var v2 = C2[TR[q][1]].value;
                    if (v2 !== null && v2 !== undefined && v2.length >= 4) {
                        var hex = "";
                        for (var z = 0; z < v2.length; z++) hex += ("0000" + (v2[z] & 0xFFFF).toString(16)).slice(-4);
                        send({ev: "tbl", cls: TR[q][0], f: TR[q][1], n: v2.length, hex: hex});
                    } else {
                        send({ev: "tbl", cls: TR[q][0], f: TR[q][1], n: v2 === null ? -1 : (v2 === undefined ? -2 : 0)});
                    }
                } catch (e) {}
            }
            send({ev: "exact-done"});
            done = true;
        } catch (e) { send({ev: "fatal", err: "" + e}); }
    });
}
Java.perform(function () {
    try { Java.use("java.lang.System").exit.implementation = function (c) { send({ev: "exit-blocked", code: c}); }; } catch (e) {}
    try { Java.use("java.lang.Runtime").exit.implementation = function (c) { send({ev: "exit-blocked", code: c}); }; } catch (e) {}
    var natTimer = setInterval(function () {
        var base = null;
        try { base = Module.findBaseAddress("libea56.so"); } catch (e) {}
        if (!base) return;
        clearInterval(natTimer);
        try { Interceptor.replace(base.add(0x95224), new NativeCallback(function () { send({ev: "sd-blocked"}); return 0; }, "int", [])); } catch (e) {}
    }, 100);
    var ticks = 0;
    var timer = setInterval(function () {
        ticks++;
        if (ticks > 3000 || done) { clearInterval(timer); return; }
        if (!loader) {
            Java.perform(function () {
                Java.enumerateClassLoaders({
                    onMatch: function (l) {
                        if (loader) return;
                        try {
                            var f = Java.ClassFactory.get(l);
                            f.use("o.ReusableBufferedOutputStream");
                            loader = f;
                            send({ev: "loader-found"});
                            readExact();
                        } catch (e) {}
                    },
                    onComplete: function () {}
                });
            });
            return;
        }
        if (ticks % 250 === 0 && !done) readExact();   // retry late (post-population)
    }, 20);
});
