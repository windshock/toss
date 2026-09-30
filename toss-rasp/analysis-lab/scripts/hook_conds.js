// §116 — condition capture: stub entries, OWC5(IIIL..Z) args, IATC(II) args,
// on ALL hidden-DEX loader copies (poll until 3 hooked; no stack dumps —
// perturbation law §113). afed8 census confirms the kill.
var hookedLoaders = 0;
function hookLoader(fac, n) {
    var owc5 = 0, iatc = 0, stub = 0;
    try {
        var C = fac.use("o.ContentDataSourceContentDataSourceException");
        C.onWarmupCompleted.overloads.forEach(function (ov) {
            if (ov.argumentTypes.length !== 5) return;
            ov.implementation = function (a, b, c, d, e) {
                if (owc5 < 200) { send({ev: "owc5", a0: a, a1: b, a2: c}); owc5++; }
                return ov.call(this, a, b, c, d, e);
            };
        });
        C.IAuthTabCallback.overloads.forEach(function (ov) {
            if (ov.argumentTypes.length !== 2) return;
            if (ov.argumentTypes[0].className !== "int" || ov.argumentTypes[1].className !== "int") return;
            ov.implementation = function (a, b) {
                if (iatc < 200) { send({ev: "iatc2", a: a, b: b}); iatc++; }
                return ov.call(this, a, b);
            };
        });
        send({ev: "helper-hooked", n: n});
    } catch (e) { send({ev: "helper-err", err: ("" + e).slice(0, 80)}); }
    try {
        var G = fac.use("o.getBooleanFromAdObject");
        G.IAuthTabCallbackStub.overloads.forEach(function (ov) {
            ov.implementation = function () {
                if (stub < 200) { send({ev: "stub"}); stub++; }
                return ov.apply(this, arguments);
            };
        });
        send({ev: "stub-hooked", n: n});
    } catch (e) { send({ev: "stub-err", err: ("" + e).slice(0, 80)}); }
}
var dumped = false;
Java.perform(function () {
    try { Java.use("java.lang.System").exit.implementation = function (c) { send({ev: "exit-blocked", code: c}); }; } catch (e) {}
    try { Java.use("java.lang.Runtime").exit.implementation = function (c) { send({ev: "exit-blocked", code: c}); }; } catch (e) {}
    var natTimer = setInterval(function () {
        var base = null;
        try { base = Module.findBaseAddress("libea56.so"); } catch (e) {}
        if (!base) return;
        clearInterval(natTimer);
        try {
            Interceptor.replace(base.add(0x95224), new NativeCallback(function () { send({ev: "self-destruct-blocked"}); return 0; }, "int", []));
        } catch (e) {}
        try {
            Interceptor.attach(base.add(0xafed8), {
                onEnter: function (args) { send({ev: "afed8", id: args[0].toInt32()}); }
            });
        } catch (e) {}
    }, 100);
    var tries = 0;
    var timer = setInterval(function () {
        if (tries > 3000 || hookedLoaders >= 3) { clearInterval(timer); return; }
        tries++;
        Java.perform(function () {
            Java.enumerateClassLoaders({
                onMatch: function (loader) {
                    if (hookedLoaders >= 3) return;
                    try {
                        var fac = Java.ClassFactory.get(loader);
                        fac.use("o.ReusableBufferedOutputStream");
                        if (fac.__cond_hooked) return;
                        fac.__cond_hooked = true;
                        hookedLoaders++;
                        hookLoader(fac, hookedLoaders);
                    } catch (e) {}
                },
                onComplete: function () {}
            });
        });
    }, 20);
});
