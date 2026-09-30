// §114b — capture R's JNI-level Java args. RegisterNatives (JNIEnv vtable
// slot 215) reveals the fnPtr bound to "R"; Interceptor on that fnPtr reads
// x2/x3 = the two jint args of the static (II) native at the kill moment.
var dumped = false;
var rFn = null;
function stackDump(tag) {
    try {
        var T = Java.use("java.lang.Thread");
        var st = T.currentThread().getStackTrace();
        var fr = [];
        for (var i = 0; i < st.length && i < 24; i++)
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
});
    // JNIEnv vtable RegisterNatives (index 215)
    try {
        var env = Java.vm.tryGetEnv();
        var envPtr = env.handle;
        var vtbl = envPtr.readPointer();
        var regNat = vtbl.add(215 * Process.pointerSize).readPointer();
        send({ev: "regnat", at: "" + regNat});
        Interceptor.attach(regNat, {
        onEnter: function (args) {
            var clazz = args[1], methods = args[2], count = args[3].toInt32();
            var clsName = "";
            try { clsName = Java.cast(clazz, Java.use("java.lang.Class")).getName(); } catch (e) {}
            for (var i = 0; i < count && i < 64; i++) {
            var m = methods.add(i * 3 * Process.pointerSize);
            var nameP = m.readPointer(), sigP = m.add(Process.pointerSize).readPointer(),
                fnP = m.add(2 * Process.pointerSize).readPointer();
            var nm = nameP.readCString(), sg = sigP.readCString();
            send({ev: "reg", cls: clsName, name: nm, sig: sg, fn: "" + fnP});
            if (nm === "R" && rFn === null) {
                rFn = fnP;
                Interceptor.attach(fnP, {
                onEnter: function (a) {
                    send({ev: "R-JNI", x2: a[2].toInt32(), x3: a[3].toInt32()});
                    try {
                        var lb = Module.findBaseAddress("libea56.so");
                        var key64 = lb.add(0x1835f0).readU64();
                        var tgt = lb.add(0x17c320).readPointer();
                        send({ev: "R-KEYS",
                              slot1835f0: key64.toString(16),
                              lo32: key64.and(0xffffffff).toString(16),
                              tgt_17c320: "" + tgt,
                              tgt_off: tgt.sub(lb).toString(16)});
                    } catch (e) { send({ev: "R-KEYS-err", err: "" + e}); }
                    if (!dumped) { dumped = true; stackDump("R-JNI a=" + a[2].toInt32() + " b=" + a[3].toInt32()); }
                }
                });
                send({ev: "R-fnptr-hooked", fn: "" + fnP});
            }
            }
        }
        });
    } catch (e) { send({ev: "regnat-err", err: "" + e}); }

