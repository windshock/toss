// §117 — capture the guard's reflected method names: Class.getMethod /
// getDeclaredMethod (low-frequency, context-safe — unlike forName/Method.invoke
// global hooks which break/kill the flow §113). Installed only after the first
// hidden-DEX loader appears; logs class+name pairs around the kill, plus the
// proven-safe census set (survival + afed8 + stub/owc5 args).
var installed = false;
var nGM = 0;
var nInner = 0;
var dumped = false;
function hookLoader(fac) {
    try {
        var C = fac.use("o.ContentDataSourceContentDataSourceException");
        var owc5 = 0, stub = 0;
        C.onWarmupCompleted.overloads.forEach(function (ov) {
            if (ov.argumentTypes.length !== 5) return;
            ov.implementation = function (a, b, c, d, e) {
                if (owc5 < 50) { send({ev: "owc5", a0: a, a1: b, a2: c}); owc5++; }
                return ov.call(this, a, b, c, d, e);
            };
        });
        var G = fac.use("o.getBooleanFromAdObject");
        G.IAuthTabCallbackStub.overloads.forEach(function (ov) {
            ov.implementation = function () {
                if (stub < 20) { send({ev: "stub"}); stub++; }
                return ov.apply(this, arguments);
            };
        });
        send({ev: "helper-hooked"});
    } catch (e) { send({ev: "helper-err", err: ("" + e).slice(0, 80)}); }
}
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
                onEnter: function (args) {
                    var id = args[0].toInt32();
                    send({ev: "afed8", id: id});
                    if (id === 0 && !installed) {
                        installed = true;
                        send({ev: "refl-hooks-up"});
                        Java.perform(function () {
                            var NOISE = ["java.lang.ClassLoader", "java.lang.Runtime", "java.lang.String"];
                            try {
                                var K = Java.use("java.lang.Class");
                                K.getMethod.overload("java.lang.String", "[Ljava.lang.Class;").implementation = function (n, ps) {
                                    if (nGM < 300) {
                                        var cn = "?";
                                        try { cn = this.getName(); } catch (e) {}
                                        var bad = false;
                                        for (var q = 0; q < NOISE.length; q++) if (cn.indexOf(NOISE[q]) === 0) bad = true;
                                        if (!bad && cn.indexOf("o.") === 0) {
                                            if (nInner < 60) { send({ev: "gin", cls: cn, name: "" + n}); nInner++; }
                                        } else if (!bad) {
                                            if (nGM < 500) { send({ev: "gm", cls: cn, name: "" + n}); nGM++; }
                                        }
                                    }
                                    return this.getMethod(n, ps);
                                };
                                K.getDeclaredMethod.overload("java.lang.String", "[Ljava.lang.Class;").implementation = function (n, ps) {
                                    if (nGM < 300) {
                                        var cn = "?";
                                        try { cn = this.getName(); } catch (e) {}
                                        var bad = false;
                                        for (var q = 0; q < NOISE.length; q++) if (cn.indexOf(NOISE[q]) === 0) bad = true;
                                        if (!bad && cn.indexOf("o.") === 0) {
                                            if (nInner < 60) { send({ev: "gin", cls: cn, name: "" + n}); nInner++; }
                                        } else if (!bad) {
                                            if (nGM < 500) { send({ev: "gdm", cls: cn, name: "" + n}); nGM++; }
                                        }
                                    }
                                    return this.getDeclaredMethod(n, ps);
                                };
                            } catch (e) { send({ev: "refl-err", err: "" + e}); }
                        });
                    }
                }
            });
        } catch (e) {}
    }, 100);
    var tries = 0;
    var timer = setInterval(function () {
        if (tries > 3000) { clearInterval(timer); return; }
        tries++;
        Java.perform(function () {
            Java.enumerateClassLoaders({
                onMatch: function (loader) {
                    try {
                        var fac = Java.ClassFactory.get(loader);
                        fac.use("o.ReusableBufferedOutputStream");
                        if (!fac.__s117) {
                            fac.__s117 = true;
                            hookLoader(fac);
                        }
                    } catch (e) { return; }

                },
                onComplete: function () {}
            });
        });
    }, 20);
});
