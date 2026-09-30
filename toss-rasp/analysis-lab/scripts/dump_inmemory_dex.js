// dump_inmemory_dex.js v4 — S122. btoa absent in QuickJS → local b64encode.
var B64C = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
function b64encode(u8) {
    var out = "";
    var n = u8.length;
    for (var i = 0; i < n; i += 3) {
        var b0 = u8[i], b1 = i + 1 < n ? u8[i + 1] : 0, b2 = i + 2 < n ? u8[i + 2] : 0;
        out += B64C[b0 >> 2] + B64C[((b0 & 3) << 4) | (b1 >> 4)];
        out += (i + 1 < n) ? B64C[((b1 & 15) << 2) | (b2 >> 6)] : "=";
        out += (i + 2 < n) ? B64C[b2 & 63] : "=";
    }
    return out;
}
function dumpDex(begin, size, key) {
    var CH = 49152;
    for (var off = 0; off < size; off += CH) {
        var n = Math.min(CH, size - off);
        try {
            var u8 = new Uint8Array(Memory.readByteArray(begin.add(off), n));
            send({ ev: "dex-chunk", key: key, off: off, n: n, b64: b64encode(u8) });
        } catch (e) {
            send({ ev: "dex-error", key: key, off: off, err: ("" + e).slice(0, 150) });
            return;
        }
    }
}

function findBegin(df) {
    for (var off = 0; off < 0x140; off += 8) {
        var p;
        try { p = Memory.readPointer(df.add(off)); } catch (e) { continue; }
        if (p.isNull() || p.compare(0x1000) < 0) continue;
        try {
            var u8 = new Uint8Array(Memory.readByteArray(p, 8));
            if (u8[0] === 0x64 && u8[1] === 0x65 && u8[2] === 0x78 && u8[3] === 0x0a) return p;
        } catch (e) { continue; }
    }
    return null;
}

function longToHex(v) {
    var b = BigInt(v);
    if (b < 0n) b += (1n << 64n);
    return b.toString(16);
}

Java.perform(function () {
    // survival (lab observation only): keep the app alive so deeper nested
    // InMemory layers load as classes resolve
    try {
        Java.use("java.lang.System").exit.implementation = function (c) {
            send({ ev: "exit-blocked", where: "System.exit", code: c });
        };
    } catch (e) {}
    try {
        Java.use("java.lang.Runtime").exit.implementation = function (c) {
            send({ ev: "exit-blocked", where: "Runtime.exit", code: c });
        };
    } catch (e) {}
    var natTimer = setInterval(function () {
        var base = null;
        try { base = Module.findBaseAddress("libea56.so"); } catch (e) {}
        if (!base) return;
        clearInterval(natTimer);
        try {
            Interceptor.replace(base.add(0x95224), new NativeCallback(function () {
                send({ ev: "self-destruct-blocked" });
                return 0;
            }, "int", []));
            send({ ev: "kill-hooked" });
        } catch (e) {}
    }, 100);
    var doneLoaders = {};
    var doneDex = {};
    var tries = 0;
    var timer = setInterval(function () {
        if (tries++ > 200) { clearInterval(timer); send({ ev: "scan-done", reason: "timeout", dex: Object.keys(doneDex).length }); return; }
        Java.perform(function () {
            Java.enumerateClassLoaders({
                onMatch: function (loader) {
                    var lkey = "" + loader;
                    if (doneLoaders[lkey]) return;
                    var cls = "";
                    try { cls = loader.getClass().getName(); } catch (e) { return; }
                    if (cls.indexOf("InMemoryDexClassLoader") === -1) return;
                    try {
                        var pF = Java.use("dalvik.system.BaseDexClassLoader").class.getDeclaredField("pathList");
                        pF.setAccessible(true);
                        var pl = pF.get(loader);
                        if (pl === null) return;
                        var s = "" + pl;
                        var m = s.match(/cookie=\[([^\]]+)\]/);
                        if (!m) return;
                        var parts = m[1].split(",").map(function (x) { return x.trim(); });
                        for (var i = 0; i < parts.length; i++) {
                            var hex = longToHex(Number(parts[i]));
                            var dk = hex;
                            if (doneDex[dk]) continue;
                            var dfPtr = ptr("0x" + hex);
                            var begin = findBegin(dfPtr);
                            if (begin === null) { send({ ev: "no-begin", dexFile: dk, idx: i }); doneDex[dk] = -1; continue; }
                            var size = Memory.readU32(begin.add(0x20));
                            if (size <= 0x70 || size > 0x8000000) { send({ ev: "bad-size", dexFile: dk, size: size }); doneDex[dk] = -1; continue; }
                            doneDex[dk] = size;
                            send({ ev: "dex-start", dexFile: dk, idx: i, begin: "" + begin, size: size });
                            dumpDex(begin, size, dk);
                            send({ ev: "dex-end", dexFile: dk, size: size });
                        }
                        doneLoaders[lkey] = 1;
                        send({ ev: "loader-done", total: Object.keys(doneDex).filter(function (k) { return doneDex[k] > 0; }).length });
                    } catch (e) {
                        send({ ev: "loader-err", err: ("" + e).slice(0, 180) });
                    }
                },
                onComplete: function () {}
            });
        });
    }, 400);
});
send({ ev: "script-loaded" });
