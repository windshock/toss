// §122 — dump direct-buffer in-memory DEXes via the ART cookie route:
// loader → pathList.dexElements[].dexFile.mCookie (long[]) → cookie[1] =
// art::DexFile* → begin_/size_ read + "dex\n" magic validation → binary send.
var doneLoaders = [];
var dumped = [];
var nchunk = 0;
function tryDumpDexFile(dexFileObj, tag) {
    try {
        var cookie = dexFileObj.mCookie.value;
        if (cookie === null || cookie === undefined) { send({ev: "dbg", tag: tag, s: "cookie null"}); return; }
        var RArr = Java.use("java.lang.reflect.Array");
        var clen = 0;
        try { clen = RArr.getLength(cookie); } catch (eL) { send({ev: "dbg", tag: tag, s: "getLength err " + eL}); return; }
        if (clen < 2) { send({ev: "dbg", tag: tag, s: "clen=" + clen}); return; }
        send({ev: "dbg", tag: tag, s: "cookieLen=" + clen});
        for (var ci = 1; ci < clen && ci < 8; ci++) {
            var c = null;
            try { c = RArr.getLong(cookie, ci).toString(); } catch (eG) { continue; }
            if (c === null) continue;
            var p;
            try { p = ptr(c); } catch (e) { continue; }
            if (p.isNull()) continue;
            // locate begin_/size_: try (0,8) then scan
            var begin = null, size = 0;
            function looksDex(b) {
                try {
                    if (b.readU32() === 0x0a786564) return true;             // "dex\n"
                    if (b.add(0x24).readU32() === 0x70 && b.add(0x28).readU32() === 0x78563412) return true;  // scrubbed magic
                } catch (e) {}
                return false;
            }
            try {
                var b0 = p.readPointer();
                if (looksDex(b0)) { begin = b0; size = p.add(Process.pointerSize).readU64().toNumber(); }
            } catch (e) {}
            if (begin === null) {
                for (var off = 0; off <= 0x48; off += Process.pointerSize) {
                    try {
                        var cand = p.add(off).readPointer();
                        if (looksDex(cand)) {
                            var sz = p.add(off + Process.pointerSize).readU64().toNumber();
                            if (sz > 0x70 && sz < 0x4000000) { begin = cand; size = sz; break; }
                        }
                    } catch (e) {}
                }
            }
            if (begin === null) continue;
            var key = begin.toString() + ":" + size;
            if (dumped.indexOf(key) >= 0) continue;
            dumped.push(key);
            var CH = 524288;
            var off2 = 0;
            while (off2 < size) {
                var len = Math.min(CH, size - off2);
                if (nchunk >= 600) { send({ev: "cap"}); return; }
                send({ev: "dexchunk", tag: tag, off: off2, total: size, n: len},
                     Memory.readByteArray(begin.add(off2), len));
                nchunk++;
                off2 += len;
            }
            send({ev: "dexend", tag: tag, total: size, begin: "" + begin});
        }
    } catch (e) { send({ev: "df-err", tag: tag, err: ("" + e).slice(0, 120)}); }
}
function walkLoader(loaderObj, tag) {
    try {
        var cn = "";
        try { cn = "" + loaderObj.getClass().getName(); } catch (e) {}
        var pl = loaderObj.pathList.value;
        if (pl === null || pl === undefined) { send({ev: "pl-null", cls: cn}); return; }
        var els = pl.dexElements.value;
        if (els === null || els === undefined) { send({ev: "els-null", cls: cn}); return; }
        var n = els.length;
        for (var i = 0; i < n; i++) {
            var el = els[i];
            if (el === null || el === undefined) continue;
            var df = null;
            try { df = el.dexFile.value; } catch (e) { continue; }
            if (df === null || df === undefined) continue;
            tryDumpDexFile(df, tag + "_e" + i);
        }
        send({ev: "walked", cls: cn, elements: n, dumped: dumped.length});
    } catch (e) { send({ev: "walk-err", err: ("" + e).slice(0, 150)}); }
}
Java.perform(function () {
    try { Java.use("java.lang.System").exit.implementation = function (c) { send({ev: "exit-blocked", code: c}); }; } catch (e) {}
    try { Java.use("java.lang.Runtime").exit.implementation = function (c) { send({ev: "exit-blocked", code: c}); }; } catch (e) {}
    var natTimer = setInterval(function () {
        var base = null;
        try { base = Module.findBaseAddress("libea56.so"); } catch (e) {}
        if (!base) return;
        clearInterval(natTimer);
        try { Interceptor.replace(base.add(0x95224), new NativeCallback(function () {
            send({ev: "sd-blocked"});
            dumped = [];   // allow re-dump of same dexes (post-init contents)
            // POSTWALK: guard fully initialized at kill moment -> re-walk for post-init dumps
            Java.perform(function () {
                Java.enumerateClassLoaders({
                    onMatch: function (l) {
                        var cn = "";
                        try { cn = "" + l.getClass().getName(); } catch (e) { return; }
                        if (cn !== "dalvik.system.InMemoryDexClassLoader") return;
                        var key = "";
                        try { key = "P" + l.hashCode(); } catch (e) { return; }
                        if (doneLoaders.indexOf(key) >= 0) return;
                        doneLoaders.push(key);
                        var wrapped = l;
                        try { wrapped = Java.cast(l, Java.use("dalvik.system.InMemoryDexClassLoader")); } catch (e2) {}
                        walkLoader(wrapped, "POST" + doneLoaders.length);
                    },
                    onComplete: function () {}
                });
            });
            return 0; }, "int", [])); } catch (e) {}
    }, 100);
    var ticks = 0;
    var timer = setInterval(function () {
        ticks++;
        if (ticks > 2500 || nchunk >= 600) { clearInterval(timer); return; }
        Java.perform(function () {
            Java.enumerateClassLoaders({
                onMatch: function (l) {
                    var cn = "";
                    try { cn = "" + l.getClass().getName(); } catch (e) { return; }
                    if (cn !== "dalvik.system.InMemoryDexClassLoader") return;
                    var key = "";
                    try { key = "" + l.hashCode(); } catch (e) { key = "" + dumped.length + "_" + ticks; }
                    if (doneLoaders.indexOf(key) >= 0) return;
                    doneLoaders.push(key);
                    var wrapped = l;
                    try {
                        wrapped = Java.cast(l, Java.use("dalvik.system.InMemoryDexClassLoader"));
                    } catch (e2) { send({ev: "cast-err", err: ("" + e2).slice(0, 90)}); }
                    walkLoader(wrapped, "L" + doneLoaders.length);
                },
                onComplete: function () {}
            });
        });
    }, 30);
});
