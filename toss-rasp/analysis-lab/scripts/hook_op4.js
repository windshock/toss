// §113 hook_op4.js — identify the decode-op call site that triggers R(4,0)/afed8(4).
// Hooks every onWarmupCompleted / IAuthTabCallback overload of the hidden-DEX
// helper class; any call whose op (a1/i2) lacks bit 0x100 takes the R() path
// (§110: i2 & 0x100 -> run(i2) else R(i2,0)), and exactly one such call fires
// per run with op=4. On those, dump the full Java stack — that stack IS the
// killer call site. Also keeps the §110 survival pattern (exit-block +
// 0x95224 replace) and the afed8 id census for correlation.
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
        var nOWC = 0;
        C.onWarmupCompleted.overloads.forEach(function (ov) {
            ov.implementation = function () {
                var args = Array.prototype.slice.call(arguments);
                var a1 = (args.length > 1 && typeof args[1] === "number") ? args[1] : null;
                if (nOWC < 60) {
                    send({ev: "owc", n: args.length,
                          a0: typeof args[0] === "number" ? args[0] : "" + args[0],
                          a1: a1 === null ? "?" : a1,
                          a2: args.length > 2 ? "" + args[2] : "-"});
                    nOWC++;
                }
                if (args.length === 4 && a1 !== null && (a1 & 0x100) === 0) {
                    send({ev: "R-PATH", a0: args[0], a1: a1, a2: "" + args[2], a3: "" + args[3]});
                    stackDump("owc-op" + a1);
                }
                return ov.apply(this, args);
            };
        });
        C.IAuthTabCallback.overloads.forEach(function (ov) {
            ov.implementation = function (a, b) {
                send({ev: "iatc", i: a, i2: b});
                if ((b & 0x100) === 0) {
                    send({ev: "IATC-R-PATH", i: a, i2: b});
                    stackDump("iatc-op" + b);
                }
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
        try {
            var RM = facHolder;
        } catch (e) {}
    }, 100);
    var facHolder = null;
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
                        facHolder = fac;
                        send({ev: "loader-found", loader: "" + loader});
                        hookAll(fac);
                        try {
                            var R = fac.use("o.ReusableBufferedOutputStream");
                            R.R.overloads.forEach(function (ov) {
                                ov.implementation = function (a, b) {
                                    send({ev: "R-call", i: a, i2: b});
                                    if ((b & 0x100) === 0) stackDump("R-op" + a);
                                    return ov.call(this, a, b);
                                };
                            });
                            send({ev: "R-hooked"});
                        } catch (e) {}
                    } catch (e) { /* not this loader */ }
                },
                onComplete: function () {}
            });
        });
    }, 100);
});
