// harvest_manifest.js — S114: runtime harvest of the hidden-DEX detector manifest.
// Goal: decode EVERY string-engine constant the detector/engine classes use
// (their local decoders are per-class variants the static census can't parse),
// and observe the guard's actual query surface (props/files/exec/uname/debug).
// Survival: System.exit/Runtime.exit block + libea56 0x95224 self-destruct block
// (dump_dexguard_keys2.js patterns). Observation-only, lab guest.

var decoderHooked = false;
var decoderCount = 0;

function safeStr(v) {
    try {
        if (v === null || v === undefined) return null;
        return "" + v;
    } catch (e) { return "?"; }
}

// ---- 1. observation surface (app-side, available immediately) ----
Java.perform(function () {
    // exit blocking
    try {
        var Sys = Java.use("java.lang.System");
        Sys.exit.implementation = function (c) { send({ ev: "exit-blocked", where: "System.exit", code: c }); };
    } catch (e) {}
    try {
        var Rt = Java.use("java.lang.Runtime");
        Rt.exit.implementation = function (c) { send({ ev: "exit-blocked", where: "Runtime.exit", code: c }); };
    } catch (e) {}

    // props (guard reaches these via reflection — same underlying method)
    try {
        var SP = Java.use("android.os.SystemProperties");
        var seenProps = {};
        SP.get.overload("java.lang.String").implementation = function (k) {
            var v = this.get(k);
            var key = safeStr(k);
            if (seenProps[key] === undefined) {
                seenProps[key] = 1;
                send({ ev: "prop", key: key, val: safeStr(v) });
            } else { seenProps[key]++; }
            return v;
        };
        SP.get.overload("java.lang.String", "java.lang.String").implementation = function (k, d) {
            var v = this.get(k, d);
            var key = safeStr(k);
            if (seenProps[key] === undefined) {
                seenProps[key] = 1;
                send({ ev: "prop", key: key, val: safeStr(v), def: safeStr(d) });
            } else { seenProps[key]++; }
            return v;
        };
        SP.getInt.overload("java.lang.String", "int").implementation = function (k, d) {
            send({ ev: "prop-int", key: safeStr(k), def: d });
            return this.getInt(k, d);
        };
        SP.getBoolean.overload("java.lang.String", "boolean").implementation = function (k, d) {
            send({ ev: "prop-bool", key: safeStr(k), def: d });
            return this.getBoolean(k, d);
        };
    } catch (e) { send({ ev: "hook-err", what: "SystemProperties", err: "" + e }); }

    // uname
    try {
        var Os = Java.use("android.system.Os");
        Os.uname.overload().implementation = function () {
            var u = this.uname();
            send({ ev: "uname", sysname: safeStr(u.sysname), nodename: safeStr(u.nodename),
                   release: safeStr(u.release), version: safeStr(u.version), machine: safeStr(u.machine) });
            return u;
        };
    } catch (e) {}

    // file existence / reads
    var seenFiles = {};
    function noteFile(p, op) {
        var path = safeStr(p);
        if (path === null || path.length > 400) return;
        var k = op + ":" + path;
        if (seenFiles[k] === undefined) {
            seenFiles[k] = 1;
            send({ ev: "file", op: op, path: path });
        } else { seenFiles[k]++; }
    }
    try {
        var F = Java.use("java.io.File");
        F.exists.implementation = function () { noteFile(this.getPath(), "exists"); return this.exists(); };
        F.canRead.implementation = function () { noteFile(this.getPath(), "canRead"); return this.canRead(); };
        F.length.implementation = function () { noteFile(this.getPath(), "length"); return this.length(); };
    } catch (e) {}
    try {
        var FIS = Java.use("java.io.FileInputStream");
        FIS.$init.overload("java.lang.String").implementation = function (p) {
            noteFile(p, "open"); return this.$init(p);
        };
        FIS.$init.overload("java.io.File").implementation = function (f) {
            noteFile(f.getPath(), "open"); return this.$init(f);
        };
    } catch (e) {}

    // shell exec
    try {
        var Rt2 = Java.use("java.lang.Runtime");
        Rt2.exec.overloads.forEach(function (ov) {
            ov.implementation = function () {
                var a = [];
                for (var i = 0; i < arguments.length && i < 2; i++) a.push(safeStr(arguments[i]));
                send({ ev: "exec", args: a });
                return ov.apply(this, arguments);
            };
        });
    } catch (e) {}
    try {
        var PB = Java.use("java.lang.ProcessBuilder");
        PB.start.implementation = function () {
            try { send({ ev: "exec-pb", cmd: safeStr(this.command()) }); } catch (e) {}
            return this.start();
        };
    } catch (e) {}

    // debugger API
    try {
        var Dbg = Java.use("android.os.Debug");
        Dbg.isDebuggerConnected.implementation = function () {
            var r = this.isDebuggerConnected();
            send({ ev: "debug-api", api: "isDebuggerConnected", ret: r });
            return r;
        };
        Dbg.waitingForDebugger.implementation = function () {
            var r = this.waitingForDebugger();
            send({ ev: "debug-api", api: "waitingForDebugger", ret: r });
            return r;
        };
    } catch (e) {}

    // native survival: libea56 0x95224 self-destruct + afed8 census
    var natTimer = setInterval(function () {
        var base = null;
        try { base = Module.findBaseAddress("libea56.so"); } catch (e) {}
        if (!base) return;
        clearInterval(natTimer);
        send({ ev: "libea56-base", base: "" + base });
        try {
            var kill = base.add(0x95224);
            Interceptor.replace(kill, new NativeCallback(function () {
                send({ ev: "self-destruct-blocked" });
                return 0;
            }, "int", []));
        } catch (e) { send({ ev: "kill-hook-err", err: "" + e }); }
        try {
            Interceptor.attach(base.add(0xafed8), {
                onEnter: function (args) { send({ ev: "afed8", id: args[0].toInt32() }); }
            });
        } catch (e) {}
    }, 100);
});

// ---- 2. decoder harvest inside the hidden loader ----
// Hook every static void method whose last param is Object[] in the target
// classes; the plaintext lands in objArr[0] right after the call returns.
var TARGET_CLASSES = [
    "o.DataSourceBitmapLoaderExternalSyntheticLambda0",  // shared check engine
    "o.DataSourceBitmapLoaderExternalSyntheticLambda1",
    "o.DataSourceBitmapLoaderExternalSyntheticLambda2",  // debugger helper
    "o.AudioFocusManagerExternalSyntheticLambda0",       // VENV detector
    "o.s8ExternalSyntheticLambda1",                      // DetectType enum
    "o.s3",                                              // fds exit UI
    "o.AppLovinAdBase",                                  // bitmask builder
    "o.IconRoundCornerProgressBarOnIconClickListener",   // bitmask builder
    "o.ContentDataSourceContentDataSourceException",     // central string class
    "o.ExoPlayerBuilderExternalSyntheticLambda14",
    "o.ExoPlayerBuilderExternalSyntheticLambda17",
    "o.ExoPlayerBuilderExternalSyntheticLambda20",
    "o.ExoPlayerBuilderExternalSyntheticLambda23",
    "o.ConvertFloatArrayToByteArray",
    "o.HttpServletRequestBodyHttpServletRequest" // placeholder — removed if absent
];

function hookDecoders(fac) {
    if (decoderHooked) return;
    var Modifier = Java.use("java.lang.reflect.Modifier");
    var hooked = 0;
    TARGET_CLASSES.forEach(function (name) {
        var cls;
        try { cls = fac.use(name); } catch (e) { return; }
        var methods;
        try { methods = cls.class.getDeclaredMethods(); } catch (e) { return; }
        for (var i = 0; i < methods.length; i++) {
            try {
                var m = methods[i];
                var mod = m.getModifiers();
                if (!Modifier.isStatic(mod)) continue;
                if (!Modifier.isPrivate(mod) && !Modifier.isPublic(mod) && !Modifier.isProtected(mod)) {
                    // package-private ok
                }
                var rt = "" + m.getReturnType();
                if (rt !== "void") continue;
                var ps = m.getParameterTypes();
                if (ps.length === 0) continue;
                var last = "" + ps[ps.length - 1];
                if (last !== "class [Ljava.lang.Object;" && last !== "interface [Ljava.lang.Object;" &&
                    last.indexOf("[Ljava.lang.Object;") === -1) continue;
                var mname = m.getName();
                var overloads = cls[mname].overloads;
                for (var j = 0; j < overloads.length; j++) {
                    (function (ov, cname, mnm) {
                        var ats = ov.argumentTypes;
                        if (ats.length === 0) return;
                        if ("" + ats[ats.length - 1].className !== "[Ljava.lang.Object;") return;
                        if ("" + ov.returnType.className !== "void") return;
                        ov.implementation = function () {
                            var ovv = ov;
                            var r = ov.apply(this, arguments);
                            try {
                                var arr = arguments[arguments.length - 1];
                                if (arr !== null && arr.length > 0) {
                                    var out = [];
                                    for (var k = 0; k < Math.min(arr.length, 3); k++) out.push(safeStr(arr[k]));
                                    var a = [];
                                    for (var k2 = 0; k2 < Math.min(arguments.length - 1, 4); k2++) a.push(safeStr(arguments[k2]));
                                    send({ ev: "dec", cls: cname.replace(/^o\./, ""), m: mnm,
                                           args: a, out: out });
                                    decoderCount++;
                                }
                            } catch (e) {}
                            return r;
                        };
                        hooked++;
                    })(overloads[j], name, mname);
                }
            } catch (e) { /* skip method */ }
        }
    });
    if (hooked > 0) {
        decoderHooked = true;
        send({ ev: "decoders-hooked", count: hooked });
    }
}

var tries = 0;
var poll = setInterval(function () {
    if (decoderHooked || tries > 400) { if (!decoderHooked && tries > 400) send({ ev: "decoder-poll-timeout" }); clearInterval(poll); return; }
    tries++;
    Java.perform(function () {
        Java.enumerateClassLoaders({
            onMatch: function (loader) {
                if (decoderHooked) return;
                try {
                    var fac = Java.ClassFactory.get(loader);
                    var probe = fac.use("o.ReusableBufferedOutputStream");
                    if (probe) {
                        send({ ev: "loader-found", loader: "" + loader });
                        hookDecoders(fac);
                    }
                } catch (e) { /* not this loader */ }
            },
            onComplete: function () {}
        });
    });
}, 120);
