// §110 dump_dexguard_keys.js — capture the DexGuard string-decryptor state.
// Targets (from the decompiled hidden DEX, §109):
//   o.ContentDataSourceContentDataSourceException:
//     - extraCallbackWithResult : char[]  (the string table)
//     - writeTypedObject/onActivityResized/extraCallback/ICustomTabsCallback : char (TEA keys)
//     - readTypedObject : long
//     - onNavigationEvent(String,int,Object[]) : TEA decrypt entry (io corpus)
//   o.ReusableBufferedOutputStream: R(int,int) / run(int) native fetchers
// Deliverable: one dump enables OFFLINE decryption of all hidden strings.
var dumped = false;

function hexArr(a, max) {
    var out = [];
    var n = Math.min(a.length, max || a.length);
    for (var i = 0; i < n; i++) out.push(("0000" + (a[i] & 0xFFFF).toString(16)).slice(-4));
    return out.join("");
}

function dumpState(tag) {
    if (dumped) return;
    try {
        var C = Java.use("o.ContentDataSourceContentDataSourceException");
        var tbl = C.extraCallbackWithResult.value;
        if (tbl === null || tbl.length < 8) { send({ev: "dump-defer", tag: tag, len: tbl ? tbl.length : -1}); return; }
        dumped = true;
        var L = tbl.length;
        var payload = hexArr(tbl, L);
        // chunk the table so no message is oversized
        var CH = 16384;
        for (var off = 0; off < payload.length; off += CH) {
            send({ev: "table-chunk", off: off, total: payload.length, hex: payload.substr(off, CH)});
        }
        send({
            ev: "keys",
            tag: tag,
            tableLen: L,
            writeTypedObject: C.writeTypedObject.value & 0xFFFF,
            onActivityResized: C.onActivityResized.value & 0xFFFF,
            extraCallback: C.extraCallback.value & 0xFFFF,
            ICustomTabsCallback: C.ICustomTabsCallback.value & 0xFFFF,
            readTypedObject: C.readTypedObject.value.toString(),
            $$b: 59
        });
    } catch (e) {
        send({ev: "dump-err", tag: tag, err: "" + e});
    }
}

Java.perform(function () {
    // 1) R / run fetch corpus + trigger the state dump after init
    try {
        var R = Java.use("o.ReusableBufferedOutputStream");
        R.R.overloads.forEach(function (ov) {
            ov.implementation = function (a, b) {
                var r = ov.call(this, a, b);
                try {
                    var bytes = r ? hexArr(r, 4096) : null;   // char[] per jadx: byte[] -> use array read
                    send({ev: "R", i: a, i2: b, retLen: r ? r.length : -1, retHead: bytes ? bytes.slice(0, 256) : null});
                } catch (e) { send({ev: "R-log-err", err: "" + e}); }
                dumpState("after-R");
                return r;
            };
        });
        R.run.overloads.forEach(function (ov) {
            ov.implementation = function (a) {
                var r = ov.call(this, a);
                send({ev: "run", i: a, retLen: r ? r.length : -1});
                dumpState("after-run");
                return r;
            };
        });
    } catch (e) { send({ev: "R-hook-err", err: "" + e}); }

    // 2) TEA decrypt io corpus (input ciphertext, output plaintext)
    try {
        var C2 = Java.use("o.ContentDataSourceContentDataSourceException");
        // private static void onNavigationEvent(String, int, Object[])
        var methods = C2.class.getDeclaredMethods();
        for (var i = 0; i < methods.length; i++) {
            var m = methods[i];
            var pn = m.getParameterTypes();
            if (pn.length === 3 && "" + pn[0] === "class java.lang.String"
                && "" + pn[1] === "int" && "" + pn[2] === "class [Ljava.lang.Object;") {
                m.setAccessible(true);
                var name = m.getName();
                send({ev: "tea-method-found", name: name});
                // wrap via overload hook (static)
                try {
                    C2[name].overload("java.lang.String", "int", "[Ljava.lang.Object;").implementation = function (s, n, arr) {
                        var r = C2[name].overload("java.lang.String", "int", "[Ljava.lang.Object;").call(this, s, n, arr);
                        try {
                            send({ev: "tea", in: s === null ? null : ("" + s), n: n, out: arr && arr[0] ? ("" + arr[0]) : null});
                        } catch (e) {}
                        return r;
                    };
                } catch (e) { send({ev: "tea-hook-err", err: "" + e}); }
            }
        }
        // 3) also try dumping right away (class may already be initialized)
        dumpState("immediate");
    } catch (e) { send({ev: "init-err", err: "" + e}); }
});
