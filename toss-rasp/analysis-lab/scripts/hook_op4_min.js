// §113 hook_op4_min.js — minimal-perturbation retry: same survival + census as
// the successful keys5 run, plus ONLY numeric (int,int) overloads of the
// helper class, logging the decode op; stack dump ONLY when op==4 (the poison
// dispatch). No Method-overload hooks, no per-call stack dumps (the 778 dumps
// in run2 perturbed the flow and id-4 never fired within 90s).
var hooked = false;

function stackDump(tag) {
    try {
        var T = Java.use("java.lang.Thread");
        var st = T.currentThread().getStackTrace();
        var fr = [];
        for (var i = 0; i < st.length && i < 40; i++) {
            fr.push(st[i].getClassName() + "." + st[i].getMethodName() + ":" + st[i].getLineNumber());
        }
        send({ev: "stack", tag: tag, frames: fr});
    } catch (e) { send({ev: "stack-err", err: "" + e, tag: tag}); }
}

function hookAll(fac) {
    if (hooked) return;
    try {
        var C = fac.use("o.ContentDataSourceContentDataSourceException");
        C.onWarmupCompleted.overloads.forEach(function (ov) {
            if (ov.argumentTypes.length !== 4) return;      // only the (I,I,C,L) decode dispatcher
            ov.implementation = function (a0, a1, a2, a3) {
                send({ev: "owc4", a0: a0, a1: a1});
                if ((a1 & 0x100) === 0) { send({ev: "owc4-RPATH", a0: a0, a1: a1}); }
                if (a1 === 4) stackDump("owc4-op4");
                return ov.call(this, a0, a1, a2, a3);
            };
        });
        C.IAuthTabCallback.overloads.forEach(function (ov) {
            if (ov.argumentTypes.length !== 2) return;      // only (I,I)
            if (ov.argumentTypes[0].className !== "int" || ov.argumentTypes[1].className !== "int") return;
            ov.implementation = function (a, b) {
                send({ev: "iatc2", i: a, i2: b});
                if (b === 4) stackDump("iatc-op4");
                return ov.call(this, a, b);
            };
        });
        hooked = true;
        send({ev: "hooks-up"});
    } catch (e) {
        send({ev: "hook-err", err: "" + e});
    }
}

var tries = 0;
Java.perform(function () {
    try {
        var Sys = Java.use("java.lang.System");
        Sys.exit.implementation = function (c) { send({ev: "exit-blocked", where: "System.exit", code: c}); };
    } catch (e) {}
    try {
        var Rt = Java.use("java.lang.Runtime");
        Rt.exit.implementation = function (c) { send({ev: "exit-blocked", where: "Runtime.exit", code: c}); };
    } catch (e) {}
    var natTimer = setInterval(function () {
        var base = null;
        try { base = Module.findBaseAddress("libea56.so"); } catch (e) {}
        if (!base) return;
        clearInterval(natTimer);
        send({ev: "libea56-base", base: "" + base});
        try {
            Interceptor.replace(base.add(0x95224), new NativeCallback(function () {
                send({ev: "self-destruct-blocked"});
                return 0;
            }, "int", []));
        } catch (e) { send({ev: "kill-hook-err", err: "" + e}); }
        try {
            Interceptor.attach(base.add(0xafed8), {
                onEnter: function (args) { send({ev: "afed8", id: args[0].toInt32()}); }
            });
        } catch (e) { send({ev: "afed8-hook-err", err: "" + e}); }
    }, 100);
    var timer = setInterval(function () {
        if (tries > 600) { clearInterval(timer); return; }
        tries++;
        Java.perform(function () {
            if (hooked) { clearInterval(timer); return; }
            Java.enumerateClassLoaders({
                onMatch: function (loader) {
                    if (hooked) return;
                    try {
                        var fac = Java.ClassFactory.get(loader);
                        fac.use("o.ReusableBufferedOutputStream");
                        send({ev: "loader-found"});
                        hookAll(fac);
                    } catch (e) { /* not this loader */ }
                },
                onComplete: function () {}
            });
        });
    }, 100);
});
