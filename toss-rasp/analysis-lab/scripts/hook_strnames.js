// §113b — capture the per-class string decoder getBooleanFromAdObject.a(i,n,c,arr)
// live: log every (i, n, c) tuple AND its decoded result (arr[0] on return).
// Plus the §113 survival pattern + afed8 census + id==4 Java stack dump.
var hooked = false;
var hookedCount = 0;
var nLogged = 0;

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
                onEnter: function (args) {
                    var id = args[0].toInt32();
                    send({ev: "afed8", id: id});
                    if (id === 4 && !dumped) { dumped = true; stackDump("afed8-id4"); }
                }
            });
        } catch (e) { send({ev: "afed8-hook-err", err: "" + e}); }
    }, 100);
    var dumped = false;
    var timer = setInterval(function () {
        if (tries > 600) { clearInterval(timer); return; }
        tries++;
        Java.perform(function () {
            if (hookedCount > 2) { clearInterval(timer); return; }
            Java.enumerateClassLoaders({
                onMatch: function (loader) {
                    try {
                        var fac = Java.ClassFactory.get(loader);
                        var C = fac.use("o.getBooleanFromAdObject");
                        try { C.IAuthTabCallbackStub.overloads.forEach(function (ov) {
                            ov.implementation = function () {
                                send({ev: "stub-enter", loader: "" + loader});
                                return ov.apply(this, arguments);
                            };
                        }); } catch (e) {}
                        C.a.overloads.forEach(function (ov) {
                            if (ov.argumentTypes.length !== 4) return;
                            ov.implementation = function (i, n, c, arr) {
                                var r = ov.call(this, i, n, c, arr);
                                if (nLogged < 150) {
                                    var out = null;
                                    try {
                                        var Arr = Java.use("java.lang.reflect.Array");
                                        var o0 = Arr.get(arr, 0);
                                        out = o0 === null ? "<null>" : "" + o0;
                                    } catch (e) { out = "<err " + e + ">"; }
                                    send({ev: "a", i: i, n: n, c: ("" + c).charCodeAt(0), out: out});
                                    nLogged++;
                                }
                                return r;
                            };
                        });
                        hookedCount++;
                        send({ev: "hooks-up", n: hookedCount});
                    } catch (e) { /* not this loader */ }
                },
                onComplete: function () {}
            });
        });
    }, 100);
});
var tries = 0;
