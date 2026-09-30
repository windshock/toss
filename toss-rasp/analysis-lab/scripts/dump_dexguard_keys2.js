// §110 dump_dexguard_keys2.js — hidden-DEX classes load via a custom ClassLoader
// (not the app path loader). Poll every 150ms: enumerate loaders, find one that
// resolves o.ReusableBufferedOutputStream, switch the factory, hook R/run/TEA,
// and dump the string table + keys the moment they are populated. Speed matters:
// the RASP exits the process a few seconds after frida detection.
var done = false;
var hookedR = false;

function hexArr(a, max) {
    var out = [];
    var n = Math.min(a.length, max || a.length);
    for (var i = 0; i < n; i++) out.push(("0000" + (a[i] & 0xFFFF).toString(16)).slice(-4));
    return out.join("");
}

function tryDump(fac, tag) {
    try {
        var C = fac.use("o.ContentDataSourceContentDataSourceException");
        var tbl = C.extraCallbackWithResult.value;
        if (tbl === null || tbl.length < 8) return false;
        // wait until populated: keys nonzero or table nonzero
        var k = (C.writeTypedObject.value & 0xFFFF) | (C.onActivityResized.value & 0xFFFF) |
                (C.extraCallback.value & 0xFFFF) | (C.ICustomTabsCallback.value & 0xFFFF);
        var nz = 0;
        for (var i = 0; i < Math.min(tbl.length, 64); i++) { if (tbl[i] & 0xFFFF) { nz++; } }
        if (k === 0 && nz === 0) return false;   // not yet populated
        var payload = hexArr(tbl, tbl.length);
        var CH = 16384;
        for (var off = 0; off < payload.length; off += CH) {
            send({ev: "table-chunk", off: off, total: payload.length, hex: payload.substr(off, CH)});
        }
        send({
            ev: "keys", tag: tag, tableLen: tbl.length,
            writeTypedObject: C.writeTypedObject.value & 0xFFFF,
            onActivityResized: C.onActivityResized.value & 0xFFFF,
            extraCallback: C.extraCallback.value & 0xFFFF,
            ICustomTabsCallback: C.ICustomTabsCallback.value & 0xFFFF,
            readTypedObject: C.readTypedObject.value.toString()
        });
        return true;
    } catch (e) {
        send({ev: "dump-err", tag: tag, err: "" + e});
        return false;
    }
}

function hookAll(fac) {
    if (hookedR) return;
    try {
        var R = fac.use("o.ReusableBufferedOutputStream");
        R.R.overloads.forEach(function (ov) {
            ov.implementation = function (a, b) {
                var r = ov.call(this, a, b);
                try {
                    send({ev: "R", i: a, i2: b, retLen: r ? r.length : -1});
                } catch (e) {}
                if (!done) done = tryDump(fac, "after-R");
                return r;
            };
        });
        R.run.overloads.forEach(function (ov) {
            ov.implementation = function (a) {
                var r = ov.call(this, a);
                send({ev: "run", i: a, retLen: r ? r.length : -1});
                if (!done) done = tryDump(fac, "after-run");
                return r;
            };
        });
        hookedR = true;
        send({ev: "hooks-up"});
    } catch (e) {
        send({ev: "hook-err", err: "" + e});
    }
}

var tries = 0;
var timer = null;
Java.perform(function () {
    // survive the RASP java-exit (25th-session pattern: 7min survival on the original app)
    try {
        var Sys = Java.use("java.lang.System");
        Sys.exit.implementation = function (c) { send({ev: "exit-blocked", where: "System.exit", code: c}); };
    } catch (e) { send({ev: "exit-hook-err", err: "" + e}); }
    try {
        var Rt = Java.use("java.lang.Runtime");
        Rt.exit.implementation = function (c) { send({ev: "exit-blocked", where: "Runtime.exit", code: c}); };
    } catch (e) {}
    // native survival: neutralize the libea56 self-destruct (0x95224, §97) and
    // log the afed8 dispatch id census — lab observation only
    var natTimer = setInterval(function () {
        var base = null;
        try { base = Module.findBaseAddress("libea56.so"); } catch (e) {}
        if (!base) return;
        clearInterval(natTimer);
        send({ev: "libea56-base", base: "" + base});
        try {
            var kill = base.add(0x95224);
            Interceptor.replace(kill, new NativeCallback(function () {
                send({ev: "self-destruct-blocked"});
                return 0;
            }, "int", []));
            send({ev: "kill-hooked", at: "" + kill});
        } catch (e) { send({ev: "kill-hook-err", err: "" + e}); }
        try {
            var afed8 = base.add(0xafed8);
            Interceptor.attach(afed8, {
                onEnter: function (args) {
                    send({ev: "afed8", id: args[0].toInt32()});
                }
            });
            send({ev: "afed8-hooked"});
        } catch (e) { send({ev: "afed8-hook-err", err: "" + e}); }
    }, 100);
    timer = setInterval(function () {
        if (tries > 300) { if (timer) clearInterval(timer); return; }
        tries++;
        Java.perform(function () {
            Java.enumerateClassLoaders({
                onMatch: function (loader) {
                    if (done || hookedR) return;
                    try {
                        var fac = Java.ClassFactory.get(loader);
                        var probe = fac.use("o.ReusableBufferedOutputStream");
                        if (probe) {
                            send({ev: "loader-found", loader: "" + loader});
                            hookAll(fac);
                            done = tryDump(fac, "on-match");
                        }
                    } catch (e) { /* not this loader */ }
                },
                onComplete: function () {}
            });
        });
    }, 150);
});
