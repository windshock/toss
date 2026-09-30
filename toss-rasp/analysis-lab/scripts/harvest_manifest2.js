// harvest_manifest2.js — S114 v2: fix v1's two blind spots.
// (1) v1 hooked the decoders too late — the guard's checks ran within ~1s of
//     hidden-loader load. v2 hooks the 4 priority classes (check engine, enum,
//     VENV, debugger helper) synchronously on first loader match, then the rest.
// (2) v1 only saw java.io.File — libea56 does file checks via libc syscalls.
//     v2 hooks libc openat/statx/faccessat, filtered to system paths only.
// Survival + observation hooks carried over from v1 / dump_dexguard_keys2.js.

var decoderHooked = false;
var decoderCount = 0;

function S(v) {
    try {
        if (v === null || v === undefined) return null;
        if (typeof v === "string") return v;
        var s = "" + v;
        return s.length > 300 ? s.slice(0, 300) : s;
    } catch (e) { return null; }
}

function cstr(p) {
    if (p.isNull()) return null;
    try { return Memory.readCString(p); } catch (e) { return null; }
}

// ---------- native libc syscall surface (system paths only) ----------
var SYS_PREFIX = ["/proc", "/sys", "/system", "/vendor", "/apex", "/dev",
                  "/sbin", "/su", "/data/local", "/etc", "/odm", "/product", "/xbin"];
function sysPath(p) {
    if (p === null) return false;
    for (var i = 0; i < SYS_PREFIX.length; i++) if (p.indexOf(SYS_PREFIX[i]) === 0) return true;
    if (p.indexOf("su") !== -1 || p.indexOf("superuser") !== -1 || p.indexOf("magisk") !== -1) return true;
    return false;
}
var seenSys = {};
function noteSys(op, path, ret) {
    if (!sysPath(path)) return;
    var k = op + ":" + path;
    if (seenSys[k] === undefined) {
        seenSys[k] = 1;
        send({ ev: "nat", op: op, path: path, ret: ret });
    } else { seenSys[k]++; }
}
function hookLibc() {
    var names = ["libc.so"];
    var libc = names.map(function (n) { try { return Module.findBaseAddress(n); } catch (e) { return null; } })[0];
    ["openat", "open", "stat", "statx", "lstat", "access", "faccessat", "readlink"].forEach(function (fn) {
        var addr = null;
        try { addr = Module.findExportByName("libc.so", fn); } catch (e) {}
        if (!addr) return;
        Interceptor.attach(addr, {
            onEnter: function (args) {
                try {
                    var p = null;
                    if (fn === "openat" || fn === "faccessat") p = cstr(args[1]);
                    else if (fn === "open" || fn === "stat" || fn === "lstat" || fn === "access" || fn === "readlink") p = cstr(args[0]);
                    else if (fn === "statx") p = cstr(args[1]);
                    this._p = p;
                } catch (e) { this._p = null; }
            },
            onLeave: function (r) {
                try { noteSys(fn, this._p, r.toInt32()); } catch (e) {}
            }
        });
    });
    send({ ev: "libc-hooked" });
}
hookLibc();

// ---------- survival + app-side observation ----------
Java.perform(function () {
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

    var seenProps = {};
    try {
        var SP = Java.use("android.os.SystemProperties");
        SP.get.overload("java.lang.String").implementation = function (k) {
            var v = this.get(k), key = S(k);
            if (seenProps[key] === undefined) { seenProps[key] = 1; send({ ev: "prop", key: key, val: S(v) }); }
            else seenProps[key]++;
            return v;
        };
        SP.get.overload("java.lang.String", "java.lang.String").implementation = function (k, d) {
            var v = this.get(k, d), key = S(k);
            if (seenProps[key] === undefined) { seenProps[key] = 1; send({ ev: "prop", key: key, val: S(v), def: S(d) }); }
            else seenProps[key]++;
            return v;
        };
    } catch (e) {}
    try {
        var Os = Java.use("android.system.Os");
        Os.uname.overload().implementation = function () {
            var u = this.uname();
            send({ ev: "uname", release: S(u.release), machine: S(u.machine), nodename: S(u.nodename) });
            return u;
        };
    } catch (e) {}
    try {
        var F = Java.use("java.io.File");
        var seenFiles = {};
        function noteFile(p, op) {
            var path = S(p);
            if (path === null || path.length > 400) return;
            var k = op + ":" + path;
            if (seenFiles[k] === undefined) { seenFiles[k] = 1; send({ ev: "file", op: op, path: path }); }
            else seenFiles[k]++;
        }
        F.exists.implementation = function () { noteFile(this.getPath(), "exists"); return this.exists(); };
        F.canExecute.implementation = function () { noteFile(this.getPath(), "canExec"); return this.canExecute(); };
        F.canRead.implementation = function () { noteFile(this.getPath(), "canRead"); return this.canRead(); };
        F.length.implementation = function () { noteFile(this.getPath(), "length"); return this.length(); };
    } catch (e) {}
    try {
        var Rt2 = Java.use("java.lang.Runtime");
        Rt2.exec.overloads.forEach(function (ov) {
            ov.implementation = function () {
                var a = [];
                for (var i = 0; i < arguments.length && i < 2; i++) a.push(S(arguments[i]));
                send({ ev: "exec", args: a });
                return ov.apply(this, arguments);
            };
        });
    } catch (e) {}
    try {
        var PM = Java.use("android.app.ApplicationPackageManager");
        var seenPkgs = {};
        PM.getPackageInfo.overload("java.lang.String", "int").implementation = function (n, f) {
            var key = S(n);
            if (seenPkgs[key] === undefined) { seenPkgs[key] = 1; send({ ev: "pkg", name: key, flags: f }); }
            else seenPkgs[key]++;
            return this.getPackageInfo(n, f);
        };
    } catch (e) { send({ ev: "hook-err", what: "PM", err: "" + e }); }
    try {
        var Dbg = Java.use("android.os.Debug");
        Dbg.isDebuggerConnected.implementation = function () {
            var r = this.isDebuggerConnected();
            send({ ev: "debug-api", api: "isDebuggerConnected", ret: r });
            return r;
        };
    } catch (e) {}

    // native survival
    var natTimer = setInterval(function () {
        var base = null;
        try { base = Module.findBaseAddress("libea56.so"); } catch (e) {}
        if (!base) return;
        clearInterval(natTimer);
        send({ ev: "libea56-base", base: "" + base });
        try {
            Interceptor.replace(base.add(0x95224), new NativeCallback(function () {
                send({ ev: "self-destruct-blocked" });
                return 0;
            }, "int", []));
        } catch (e) {}
        try {
            Interceptor.attach(base.add(0xafed8), {
                onEnter: function (args) { send({ ev: "afed8", id: args[0].toInt32() }); }
            });
        } catch (e) {}
    }, 100);
});

// ---------- decoder hooks (fast, priority first) ----------
var PRIORITY = [
    "o.DataSourceBitmapLoaderExternalSyntheticLambda0",  // shared check engine
    "o.s8ExternalSyntheticLambda1",                      // DetectType enum
    "o.AudioFocusManagerExternalSyntheticLambda0",       // VENV
    "o.DataSourceBitmapLoaderExternalSyntheticLambda2",  // debugger helper
    "o.s3",
    "o.AppLovinAdBase",
    "o.IconRoundCornerProgressBarOnIconClickListener",
    "o.ExoPlayerBuilderExternalSyntheticLambda14",
    "o.ExoPlayerBuilderExternalSyntheticLambda17",
    "o.ContentDataSourceContentDataSourceException"
];

function hookClassDecoders(fac, name) {
    var cls;
    try { cls = fac.use(name); } catch (e) { return 0; }
    var hooked = 0, methods;
    try { methods = cls.class.getDeclaredMethods(); } catch (e) { return 0; }
    for (var i = 0; i < methods.length; i++) {
        try {
            var m = methods[i];
            var mod = m.getModifiers();
            var M = Java.use("java.lang.reflect.Modifier");
            if (!M.isStatic(mod)) continue;
            if ("" + m.getReturnType() !== "void") continue;
            var ps = m.getParameterTypes();
            if (ps.length === 0) continue;
            if ("" + ps[ps.length - 1] !== "class [Ljava.lang.Object;") continue;
            var mname = m.getName();
            cls[mname].overloads.forEach(function (ov) {
                var ats = ov.argumentTypes;
                if (ats.length === 0) return;
                if ("" + ats[ats.length - 1].className !== "[Ljava.lang.Object;") return;
                if ("" + ov.returnType.className !== "void") return;
                ov.implementation = function () {
                    var r = ov.apply(this, arguments);
                    try {
                        var arr = arguments[arguments.length - 1];
                        if (arr !== null && arr.length > 0 && arr[0] !== null && arr[0] !== undefined) {
                            var out = [];
                            for (var k = 0; k < Math.min(arr.length, 3); k++) out.push(S(arr[k]));
                            var a = [];
                            for (var k2 = 0; k2 < Math.min(arguments.length - 1, 4); k2++) a.push(S(arguments[k2]));
                            send({ ev: "dec", cls: name.replace(/^o\./, ""), m: mname, args: a, out: out });
                            decoderCount++;
                        }
                    } catch (e) {}
                    return r;
                };
                hooked++;
            });
        } catch (e) { /* skip */ }
    }
    return hooked;
}

var tries = 0;
var hookedLoaders = {};   // S113b 법칙: 숨은 DEX 로더는 3개 사본 — 전부 훅해야 실행 사본을 놓치지 않는다
var poll = setInterval(function () {
    if (tries > 400 || Object.keys(hookedLoaders).length >= 3) { clearInterval(poll); return; }
    tries++;
    Java.perform(function () {
        Java.enumerateClassLoaders({
            onMatch: function (loader) {
                var key = "" + loader;
                if (hookedLoaders[key]) return;
                try {
                    var fac = Java.ClassFactory.get(loader);
                    fac.use("o.ReusableBufferedOutputStream");
                    send({ ev: "loader-found", loader: key });
                    var n = 0;
                    PRIORITY.forEach(function (cn) { n += hookClassDecoders(fac, cn); });
                    hookedLoaders[key] = n;
                    send({ ev: "decoders-hooked", loader: key, count: n, totalLoaders: Object.keys(hookedLoaders).length });
                } catch (e) { /* not this loader */ }
            },
            onComplete: function () {}
        });
    });
}, 100);
