// §152 — MediaDrm deviceUniqueId verifier/spoofer.
//
// Purpose:
//   Confirm whether Toss logstore device_id is derived from
//   MediaDrm(WIDEVINE_UUID).getPropertyByteArray("deviceUniqueId"), and make
//   a minimal one-method spoof available for controlled A/B tests.
//
// Safety notes:
//   - This is deliberately narrower than hidden-DEX class hooks.
//   - Default mode is observe-only.
//   - Set SPOOF_HEX through run_mediadrm_device_id.py --spoof-hex to return
//     replacement raw bytes for only the "deviceUniqueId" property.

var SPOOF_HEX = "__SPOOF_HEX__";
var WANT_STACK = "__WANT_STACK__" === "1";
var BLOCK_EXIT = "__BLOCK_EXIT__" === "1";

function cleanHex(s) {
    if (!s) return "";
    return ("" + s).replace(/^0x/, "").replace(/[^0-9a-fA-F]/g, "").toLowerCase();
}

function jbytesToUnsignedArray(arr) {
    var out = [];
    if (arr === null) return out;
    for (var i = 0; i < arr.length; i++) {
        out.push(arr[i] & 0xff);
    }
    return out;
}

function unsignedArrayToJavaByteArray(vals) {
    var signed = [];
    for (var i = 0; i < vals.length; i++) {
        var v = vals[i] & 0xff;
        signed.push(v > 127 ? v - 256 : v);
    }
    return Java.array("byte", signed);
}

function hexToUnsignedArray(hex) {
    hex = cleanHex(hex);
    if ((hex.length % 2) !== 0) throw new Error("odd-length hex");
    var out = [];
    for (var i = 0; i < hex.length; i += 2) {
        out.push(parseInt(hex.substring(i, i + 2), 16));
    }
    return out;
}

function toHex(vals) {
    var s = "";
    for (var i = 0; i < vals.length; i++) {
        s += ("0" + (vals[i] & 0xff).toString(16)).slice(-2);
    }
    return s;
}

function digestHex(alg, vals) {
    try {
        var MessageDigest = Java.use("java.security.MessageDigest");
        var md = MessageDigest.getInstance(alg);
        md.update(unsignedArrayToJavaByteArray(vals));
        return toHex(jbytesToUnsignedArray(md.digest()));
    } catch (e) {
        return "ERR:" + e;
    }
}

function stackFrames(limit) {
    var out = [];
    try {
        var Thread = Java.use("java.lang.Thread");
        var st = Thread.currentThread().getStackTrace();
        for (var i = 0; i < st.length && i < limit; i++) {
            out.push(st[i].getClassName() + "." + st[i].getMethodName() + ":" + st[i].getLineNumber());
        }
    } catch (e) {
        out.push("STACK_ERR:" + e);
    }
    return out;
}

Java.perform(function () {
    if (BLOCK_EXIT) {
        try {
            Java.use("java.lang.System").exit.implementation = function (code) {
                send({ev: "system-exit-blocked", code: code});
            };
        } catch (e) {
            send({ev: "system-exit-hook-err", err: "" + e});
        }
        try {
            Java.use("java.lang.Runtime").exit.implementation = function (code) {
                send({ev: "runtime-exit-blocked", code: code});
            };
        } catch (e) {
            send({ev: "runtime-exit-hook-err", err: "" + e});
        }
        var natTimer = setInterval(function () {
            var base = null;
            try { base = Module.findBaseAddress("libea56.so"); } catch (e) {}
            if (!base) return;
            clearInterval(natTimer);
            send({ev: "libea56-base", base: "" + base});
            try {
                Interceptor.replace(base.add(0x95224), new NativeCallback(function () {
                    send({ev: "poison-blocked", at: "libea56+0x95224"});
                    return 0;
                }, "int", []));
                send({ev: "poison-hooked", at: "libea56+0x95224"});
            } catch (e) {
                send({ev: "poison-hook-err", err: "" + e});
            }
        }, 50);
    }

    var MediaDrm = Java.use("android.media.MediaDrm");
    var overload = MediaDrm.getPropertyByteArray.overload("java.lang.String");
    var spoof = cleanHex(SPOOF_HEX);
    send({
        ev: "mediadrm-hook-ready",
        spoof_len: spoof.length / 2,
        stack: WANT_STACK
    });

    overload.implementation = function (propertyName) {
        var prop = "" + propertyName;
        var original = overload.call(this, propertyName);
        if (prop !== "deviceUniqueId") {
            return original;
        }

        var raw = jbytesToUnsignedArray(original);
        var rec = {
            ev: "deviceUniqueId",
            len: raw.length,
            raw_hex: toHex(raw),
            md5: digestHex("MD5", raw),
            sha1: digestHex("SHA-1", raw),
            sha256: digestHex("SHA-256", raw)
        };
        if (WANT_STACK) rec.stack = stackFrames(24);
        send(rec);

        if (spoof.length > 0) {
            var repl = hexToUnsignedArray(spoof);
            send({
                ev: "deviceUniqueId-spoof",
                len: repl.length,
                raw_hex: toHex(repl),
                md5: digestHex("MD5", repl),
                sha1: digestHex("SHA-1", repl),
                sha256: digestHex("SHA-256", repl)
            });
            return unsignedArrayToJavaByteArray(repl);
        }
        return original;
    };
});
