// §117b — signature-filtered reflection capture: only
//   CHECK-candidate: getMethod(name, {Object.class})   (the :281 check idiom)
//   GATE-candidate:  getDeclaredMethod(name, {})        (the timestamp idiom)
// Ultra-low event volume -> no cap pressure, minimal perturbation.
var installed = false;
function hookLoader(fac) {
    try {
        var C = fac.use("o.ContentDataSourceContentDataSourceException");
        var owc5 = 0, stub = 0;
        C.onWarmupCompleted.overloads.forEach(function (ov) {
            if (ov.argumentTypes.length !== 5) return;
            ov.implementation = function (a, b, c, d, e) {
                if (owc5 < 10) { send({ev: "owc5", a0: a, a1: b, a2: c}); owc5++; }
                return ov.call(this, a, b, c, d, e);
            };
        });
        var G = fac.use("o.getBooleanFromAdObject");
        G.IAuthTabCallbackStub.overloads.forEach(function (ov) {
            ov.implementation = function () {
                if (stub < 10) { send({ev: "stub"}); stub++; }
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
                        send({ev: "sigrefl-up"});
                        Java.perform(function () {
                            var ObjCls = "java.lang.Object";
                            try {
                                var K = Java.use("java.lang.Class");
                                K.getMethod.overload("java.lang.String", "[Ljava.lang.Class;").implementation = function (n, ps) {
                                    try {
                                        if (ps !== null && ps.length === 1) { var pn = "?"; try { pn = ps[0].getName(); } catch (e2) {} if (pn !== "java.lang.Object") pn = "?" + pn; if (pn === "java.lang.Object") {
                                            var cn = "?";
                                            try { cn = this.getName(); } catch (e) {}
                                            send({ev: "CHECK", cls: cn, name: "" + n});
                                        } }
                                    } catch (e) {}
                                    return this.getMethod(n, ps);
                                };
                                K.getDeclaredMethod.overload("java.lang.String", "[Ljava.lang.Class;").implementation = function (n, ps) {
                                    try {
                                        if (ps !== null && ps.length === 0) {
                                            var cn = "?";
                                            try { cn = this.getName(); } catch (e) {}
                                            send({ev: "GATE", cls: cn, name: "" + n});
                                        }
                                    } catch (e) {}
                                    return this.getDeclaredMethod(n, ps);
                                };
                            } catch (e) { send({ev: "sigrefl-err", err: "" + e}); }
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
                        if (!fac.__s117b) { fac.__s117b = true; hookLoader(fac); }
                    } catch (e) {}
                },
                onComplete: function () {}
            });
        });
    }, 20);
});
