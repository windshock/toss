// §121 — dump EVERY in-memory DEX at load: hook InMemoryDexClassLoader.$init,
// read the ByteBuffer(s) (array-backed fast path / chunked get fallback),
// Base64(NO_WRAP) in ~256KB string chunks. Runs pre-resume (spawn) so all
// constructions are caught. Survival set attached.
var dexIdx = 0;
var envH = null;
var DirAddr = null, DirCap = null;
function initNative() {
    try {
        envH = Java.vm.tryGetEnv().handle;
        var vt = envH.readPointer();
        DirAddr = new NativeFunction(vt.add(169 * Process.pointerSize).readPointer(), 'pointer', ['pointer', 'pointer']);
        DirCap = new NativeFunction(vt.add(170 * Process.pointerSize).readPointer(), 'long', ['pointer', 'pointer']);
    } catch (e) { send({ev: "nat-err", err: "" + e}); }
}
function dumpBB(bb, tag) {
    try {
        initNative();
        send({ev: "dbg", tag: tag, s: "envH=" + (envH !== null) + " DirAddr=" + (DirAddr !== null) + " handle=" + (typeof bb.$handle)});
        var addr = DirAddr(envH, bb.$handle);
        var total = 0;
        var direct = !addr.isNull();
        if (direct) {
            total = parseInt(DirCap(envH, bb.$handle).toString());
        } else {
            total = bb.remaining();
        }
        if (total < 100 || total > 64 * 1024 * 1024) { send({ev: "skip", tag: tag, total: total}); return; }
        var CH = 524288;
        var off = 0;
        if (direct) {
            while (off < total) {
                var len = Math.min(CH, total - off);
                send({ev: "dexchunk", tag: tag, off: off, total: total, n: len}, Memory.readByteArray(addr.add(off), len));
                off += len;
            }
        } else {
            var d = bb.duplicate();
            var B64 = Java.use("android.util.Base64");
            var CH2 = 65536;
            while (off < total) {
                var len2 = Math.min(CH2, total - off);
                var jarr = Java.array('byte', new Array(len2).fill(0));
                d.get(jarr, 0, len2);
                send({ev: "dexchunk64", tag: tag, off: off, total: total, b64: B64.encodeToString(jarr, 2)});
                off += len2;
            }
        }
        send({ev: "dexend", tag: tag, total: total, direct: direct});
    } catch (e) { send({ev: "bb-err", tag: tag, err: ("" + e).slice(0, 120)}); }
}
var Arrays_copyOfRange = null;
Java.perform(function () {
    try {
        var ArraysCls = Java.use("java.util.Arrays");
        Arrays_copyOfRange = ArraysCls.copyOfRange.overload('[B', 'int', 'int');
    } catch (e) { send({ev: "arrays-err", err: "" + e}); }
    try { Java.use("java.lang.System").exit.implementation = function (c) { send({ev: "exit-blocked", code: c}); }; } catch (e) {}
    try { Java.use("java.lang.Runtime").exit.implementation = function (c) { send({ev: "exit-blocked", code: c}); }; } catch (e) {}
    var natTimer = setInterval(function () {
        var base = null;
        try { base = Module.findBaseAddress("libea56.so"); } catch (e) {}
        if (!base) return;
        clearInterval(natTimer);
        try { Interceptor.replace(base.add(0x95224), new NativeCallback(function () { send({ev: "sd-blocked"}); return 0; }, "int", [])); } catch (e) {}
    }, 100);
    try {
        var IMC = Java.use("dalvik.system.InMemoryDexClassLoader");
        IMC.$init.overloads.forEach(function (ov) {
            ov.implementation = function () {
                var a = arguments;
                try {
                    for (var i = 0; i < a.length; i++) {
                        if (a[i] === null || a[i] === undefined) continue;
                        if (Array.isArray(a[i])) {
                            for (var q = 0; q < a[i].length; q++) {
                                if (a[i][q] !== null && a[i][q] !== undefined) {
                                    dexIdx++;
                                    dumpBB(a[i][q], "dex" + dexIdx);
                                }
                            }
                            continue;
                        }
                        var cn = "";
                        try { cn = a[i].getClass().getName(); } catch (e) { continue; }
                        if (cn === "java.nio.ByteBuffer" || cn.indexOf("ByteBuffer") >= 0) {
                            dexIdx++;
                            dumpBB(a[i], "dex" + dexIdx);
                        }
                    }
                } catch (e) { send({ev: "imc-err", err: ("" + e).slice(0, 120)}); }
                return ov.apply(this, a);
            };
        });
        send({ev: "imc-hooked"});
        try {
            var WB = Java.use("java.nio.ByteBuffer");
            WB.wrap.overload('[B').implementation = function (arr) {
                try {
                    if (arr !== null && arr.length > 4096) {
                        dexIdx++;
                        var tag = "wrap" + dexIdx;
                        var B64 = Java.use("android.util.Base64");
                        var s = B64.encodeToString(arr, 2);
                        var total = arr.length;
                        var CHS = 786432;
                        var off = 0;
                        while (off < s.length) {
                            send({ev: "wrapchunk", tag: tag, off: off, total: total, slen: s.length, b64: s.substr(off, CHS)});
                            off += CHS;
                        }
                        send({ev: "dexend", tag: tag, total: total, src: "wrap"});
                    }
                } catch (e) { send({ev: "wrap-err", err: ("" + e).slice(0, 120)}); }
                return this.wrap(arr);
            };
            send({ev: "wrap-hooked"});
            try {
                WB.put.overload('[B').implementation = function (arr) {
                    try {
                        if (arr !== null && arr !== undefined && arr.length > 65536) {
                            dexIdx++;
                            var tag = "put" + dexIdx;
                            var B64 = Java.use("android.util.Base64");
                            var s = B64.encodeToString(arr, 2);
                            var total = arr.length;
                            var CHS = 786432;
                            var off = 0;
                            while (off < s.length) {
                                send({ev: "wrapchunk", tag: tag, off: off, total: total, slen: s.length, b64: s.substr(off, CHS)});
                                off += CHS;
                            }
                            send({ev: "dexend", tag: tag, total: total, src: "put"});
                        }
                    } catch (e) { send({ev: "put-err", err: ("" + e).slice(0, 120)}); }
                    return this.put(arr);
                };
                try {
                    WB.put.overload('[B', 'int', 'int').implementation = function (arr, off, len) {
                        try {
                            if (arr !== null && len > 65536) {
                                dexIdx++;
                                var tag = "putb" + dexIdx;
                                var B64 = Java.use("android.util.Base64");
                                var s = B64.encodeToString(arr, 2);
                                var total = arr.length;
                                var CHS = 786432;
                                var o2 = 0;
                                while (o2 < s.length) {
                                    send({ev: "wrapchunk", tag: tag, off: o2, total: total, slen: s.length, b64: s.substr(o2, CHS)});
                                    o2 += CHS;
                                }
                                send({ev: "dexend", tag: tag, total: total, src: "put3"});
                            }
                        } catch (e) { send({ev: "put3-err", err: ("" + e).slice(0, 120)}); }
                        return this.put(arr, off, len);
                    };
                } catch (e) {}
                send({ev: "put-hooked"});
            } catch (e) { send({ev: "put-hook-err", err: "" + e}); }
        } catch (e) { send({ev: "wrap-hook-err", err: "" + e}); }
    } catch (e) { send({ev: "hook-err", err: "" + e}); }
});
