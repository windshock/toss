// §113 hook_op4_native.js — zero Java-hook perturbation. Only the survival
// pattern + native afed8 census; at the FIRST id==4 entry dump the calling
// thread's Java stack (the native dispatch runs on the calling Java thread,
// so the stack shows the hidden-DEX frames that led to R(4,0)/afed8(4)).
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
        } catch (e) { send({ev: "kill-hook-err", err: "" + e}); }
        try {
            Interceptor.attach(base.add(0xafed8), {
                onEnter: function (args) {
                    var id = args[0].toInt32();
                    send({ev: "afed8", id: id});
                    if (id === 4 && !dumped) {
                        dumped = true;
                        stackDump("afed8-id4");
                        // also dump the bridge context: invobj is arg1
                        send({ev: "afed8-id4-args", x0: "" + args[0], x1: "" + args[1], x2: "" + args[2]});
                    }
                }
            });
        } catch (e) { send({ev: "afed8-hook-err", err: "" + e}); }
    }, 100);
});
