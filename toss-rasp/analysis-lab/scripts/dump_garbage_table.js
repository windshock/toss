// dump_garbage_table.js — dump the runtime table at garbage-producing indices
// to compare with the statically loaded table and determine if it's
// a byte-loading error or a different sub-variant.
var target_indices = [288, 677, 1148, 1932, 2345];
var dumped = false;
var hookCount = 0;

function hexArr(a, start, count) {
    var out = [];
    for (var i = 0; i < count && (start + i) < a.length; i++) {
        out.push(("0000" + (a[start + i] & 0xFFFF).toString(16)).slice(-4));
    }
    return out.join(" ");
}

function dumpTable(fac, tag) {
    if (dumped) return;
    try {
        var C = fac.use("o.ContentDataSourceContentDataSourceException");
        var tbl = C.extraCallbackWithResult.value;
        if (tbl === null || tbl.length < 8) return;
        dumped = true;
        // Dump regions around each garbage index
        for (var j = 0; j < target_indices.length; j++) {
            var idx = target_indices[j];
            var start = Math.max(0, idx - 2);
            var count = Math.min(30, tbl.length - start);
            send({ev: "table_region", index: idx, start: start,
                  hex: hexArr(tbl, start, count)});
        }
        send({ev: "table_len", len: tbl.length});
        // Also dump the literal source bytes for comparison
        send({ev: "table_full_head", hex: hexArr(tbl, 0, 40)});
    } catch (e) {
        send({ev: "dump-err", tag: tag, err: "" + e});
    }
}

// Also try: capture the tbl decoder INPUT and OUTPUT at runtime
function hookDecoder(fac) {
    try {
        var C = fac.use("o.ContentDataSourceContentDataSourceException");
        // Hook the tbl decoder: onWarmupCompleted(int, int, char, Object[])
        var methods = C.class.getDeclaredMethods();
        for (var i = 0; i < methods.length; i++) {
            var m = methods[i];
            var pn = m.getParameterTypes();
            if (pn.length === 4 && "" + pn[0] === "int" && "" + pn[1] === "int"
                && "" + pn[2] === "char" && "" + pn[3] === "class [Ljava.lang.Object;") {
                m.setAccessible(true);
                var name = m.getName();
                try {
                    C[name].overload("int", "int", "char", "[Ljava.lang.Object;")
                        .implementation = function(i, n, c, arr) {
                        var r = C[name].overload("int", "int", "char", "[Ljava.lang.Object;")
                            .call(this, i, n, c, arr);
                        hookCount++;
                        // Log calls with garbage-producing indices
                        if (target_indices.indexOf(i) >= 0 || hookCount <= 5) {
                            send({ev: "tbl_call", i: i, n: n, c: c,
                                  out: arr && arr[0] ? ("" + arr[0]).substring(0, 40) : "null"});
                        }
                        return r;
                    };
                    send({ev: "tbl_hooked", name: name});
                } catch (e) { send({ev: "tbl_hook_err", err: "" + e}); }
            }
        }
    } catch (e) { send({ev: "decoder_hook_err", err: "" + e}); }
}

Java.perform(function () {
    // survive exit
    try {
        Java.use("java.lang.System").exit.implementation = function(c) {
            send({ev: "exit-blocked", code: c});
        };
    } catch(e) {}
    try {
        Java.use("java.lang.Runtime").exit.implementation = function(c) {
            send({ev: "exit-blocked-rt", code: c});
        };
    } catch(e) {}
    // native kill blocker
    var natTimer = setInterval(function() {
        var base = null;
        try { base = Module.findBaseAddress("libea56.so"); } catch(e) {}
        if (!base) return;
        clearInterval(natTimer);
        try {
            Interceptor.replace(base.add(0x95224), new NativeCallback(function() {
                send({ev: "self-destruct-blocked"});
                return 0;
            }, "int", []));
        } catch(e) {}
    }, 100);

    var tries = 0;
    var timer = setInterval(function() {
        if (dumped || tries > 120) { clearInterval(timer); return; }
        tries++;
        Java.perform(function() {
            Java.enumerateClassLoaders({
                onMatch: function(loader) {
                    if (dumped) return;
                    try {
                        var fac = Java.ClassFactory.get(loader);
                        var probe = fac.use("o.ContentDataSourceContentDataSourceException");
                        if (probe && !dumped) {
                            dumpTable(fac, "on-match");
                            hookDecoder(fac);
                        }
                    } catch (e) {}
                },
                onComplete: function() {}
            });
        });
    }, 200);
});
