// §119b — capture EVERY family decode at the native primitive: b(j,k,R,c).
// out_char = j ^ ((k*rotl64(R,6)) ^ c) — consecutive k-sequences = strings.
// No Java-layer hooks (those never fired — unresolved), pure native attach.
var attached = [];
var envH = null;
var n = 0;
Java.perform(function () {
    try { Java.use("java.lang.System").exit.implementation = function (c) { send({ev: "exit-blocked", code: c}); }; } catch (e) {}
    try { Java.use("java.lang.Runtime").exit.implementation = function (c) { send({ev: "exit-blocked", code: c}); }; } catch (e) {}
    try {
        envH = Java.vm.tryGetEnv().handle;
        var vtbl = envH.readPointer();
        var regNat = vtbl.add(215 * Process.pointerSize).readPointer();
        Interceptor.attach(regNat, {
            onEnter: function (args) {
                var count = args[3].toInt32();
                var methods = args[2];
                var cn = "?";
                try { Java.perform(function () { cn = "" + Java.cast(args[1], Java.use("java.lang.Class")).getName(); }); } catch (e) {}
                if (cn !== "o.s5a$onExtraCallbackWithResult") return;
                for (var i = 0; i < count && i < 64; i++) {
                    var m = methods.add(i * 3 * Process.pointerSize);
                    var nm = m.readPointer().readCString();
                    var sg = m.add(Process.pointerSize).readPointer().readCString();
                    if (nm === "b" && sg.indexOf("(JJJI)J") >= 0) {
                        var fp = m.add(2 * Process.pointerSize).readPointer();
                        if (attached.indexOf("" + fp) >= 0) continue;
                        attached.push("" + fp);
                        send({ev: "gotB", fn: "" + fp, nth: attached.length});
                        Interceptor.attach(fp, {
                            onEnter: function (a) {
                                if (n >= 4000) return;
                                send({ev: "b", j: a[2].toInt32() & 0xFFFF, k: a[3].toInt32(),
                                      R: a[4].toString(16), c: a[5].toInt32() & 0xFFFF, t: Date.now()});
                                n++;
                            }
                        });
                    }
                }
            }
        });
    } catch (e) { send({ev: "rn-err", err: "" + e}); }
    var natTimer = setInterval(function () {
        var base = null;
        try { base = Module.findBaseAddress("libea56.so"); } catch (e) {}
        if (!base) return;
        clearInterval(natTimer);
        try { Interceptor.replace(base.add(0x95224), new NativeCallback(function () { send({ev: "sd-blocked"}); return 0; }, "int", [])); } catch (e) {}
    }, 100);
});
