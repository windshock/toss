// §114 — decisive: capture R's actual Java args at the kill.
// Hooks o.ReusableBufferedOutputStream.R on EVERY hidden-DEX loader copy
// (run5 evidence: per-copy hooks miss the executing copy). Logs (a, b) plus
// Java stack on the first R call. Survival + afed8 census + id4 stack kept.
var hookedCount = 0;
var dumped = false;
function stackDump(tag) {
    try {
        var T = Java.use("java.lang.Thread");
        var st = T.currentThread().getStackTrace();
        var fr = [];
        for (var i = 0; i < st.length && i < 30; i++)
            fr.push(st[i].getClassName() + "." + st[i].getMethodName() + ":" + st[i].getLineNumber());
        send({ev: "stack", tag: tag, frames: fr});
    } catch (e) { send({ev: "stack-err", err: "" + e}); }
}
Java.perform(function () {
    try { Java.use("java.lang.System").exit.implementation = function (c) { send({ev: "exit-blocked", code: c}); }; } catch (e) {}
    try { Java.use("java.lang.Runtime").exit.implementation = function (c) { send({ev: "exit-blocked", code: c}); }; } catch (e) {}
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
        } catch (e) {}
        try {
            Interceptor.attach(base.add(0xafed8), {
                onEnter: function (args) {
                    var id = args[0].toInt32();
                    send({ev: "afed8", id: id});
                    if (id === 4 && !dumped) { dumped = true; stackDump("afed8-id4"); }
                }
            });
        } catch (e) {}
    }, 100);
    var tries = 0;
    var timer = setInterval(function () {
        if (tries > 3000 || hookedCount >= 3) { clearInterval(timer); return; }
        tries++;
        Java.perform(function () {
            Java.enumerateClassLoaders({
                onMatch: function (loader) {
                    try {
                        var fac = Java.ClassFactory.get(loader);
                        var R = fac.use("o.ReusableBufferedOutputStream");
                        if (R.__hooked) return;
                        R.__hooked = true;
                        hookedCount++;
                        R.R.overloads.forEach(function (ov) {
                            ov.implementation = function (a, b) {
                                send({ev: "R", a: a, b: b});
                                if (!dumped) { dumped = true; stackDump("R-entry a=" + a + " b=" + b); }
                                return ov.call(this, a, b);
                            };
                        });
                        send({ev: "R-hooked", n: hookedCount, loader: ("" + loader).slice(0, 60)});
                    } catch (e) { /* not this loader */ }
                },
                onComplete: function () {}
            });
        });
    }, 20);
});
