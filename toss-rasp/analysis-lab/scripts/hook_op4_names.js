// §113c — the decoded guard strings flow through Class.forName/getMethod and
// the check's result returns through Method.invoke. Log those (throttled,
// deduped) + the §113 survival/afed8/id4-stack pattern. Goal: name the
// detector whose return value becomes op=4.
var dumped = false;
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
    var nMI = 0;
    var seenMI = {};
    try {
        var MI = Java.use("java.lang.reflect.Method");
        MI.invoke.overload("java.lang.Object", "[Ljava.lang.Object;").implementation = function (recv, args) {
            var r = this.invoke(recv, args);
            if (nMI < 400) {
                var ms = "" + this;
                var key = ms + "|" + r;
                if (!seenMI[key]) {
                    seenMI[key] = 1;
                    send({ev: "mi", m: ms, ret: r === null ? "null" : "" + r});
                    nMI++;
                }
            }
            return r;
        };
    } catch (e) { send({ev: "mi-err", err: "" + e}); }
    send({ev: "hooks-up"});
});
