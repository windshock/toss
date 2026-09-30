// §119 — definitive capture v2: phase1 = file-level hook+key read immediately,
// phase2 = inner-class enumeration if still alive. Arg logging capped.
var SPEC = {"o.getTabBar": {"wrappers": ["a"], "keys": ["onExtraCallback"], "tables": ["onWarmupCompleted"]}, "o.onEngineInitSuccess": {"wrappers": ["a"], "keys": ["onExtraCallbackWithResult"], "tables": ["onNavigationEvent"]}, "o.LiteProcessServiceManagerLiteProcessInfo": {"wrappers": ["a"], "keys": ["onActivityResized"], "tables": ["onMessageChannelReady"]}, "o.IconRoundCornerProgressBarSavedState1": {"wrappers": ["a"], "keys": ["onExtraCallbackWithResult"], "tables": ["onExtraCallback"]}, "o.s3": {"wrappers": ["a"], "keys": ["onWarmupCompleted"], "tables": ["IAuthTabCallback"]}, "o.urlEncode": {"wrappers": ["c"], "keys": ["access000"], "tables": ["asBinder"]}, "o.getBooleanFromAdObject": {"wrappers": ["a"], "keys": ["asInterface"], "tables": ["onTransact"]}, "o.isNativeConfigEnabled": {"wrappers": ["a", "c"], "keys": ["asBinder", "onExtraCallbackWithResult"], "tables": ["IAuthTabCallbackStub", "onNavigationEvent"]}, "o.setSecondaryProgress": {"wrappers": ["a"], "keys": ["asInterface"], "tables": ["IAuthTabCallbackStub"]}, "o.getScopeType$IAuthTabCallback": {"wrappers": ["b"], "keys": ["onWarmupCompleted"], "tables": ["onNavigationEvent"]}, "o.getDjangoNearestImageSize": {"wrappers": ["b"], "keys": ["onPostMessage"], "tables": ["onActivityLayout"]}, "o.s8ExternalSyntheticLambda1": {"wrappers": ["c"], "keys": ["onExtraCallback"], "tables": ["onWarmupCompleted"]}, "o.onLoadResult": {"wrappers": ["a"], "keys": ["onWarmupCompleted"], "tables": ["onExtraCallbackWithResult"]}, "o.bindContext": {"wrappers": ["a"], "keys": ["onExtraCallbackWithResult"], "tables": ["onNavigationEvent"]}, "o.s3c": {"wrappers": ["a"], "keys": ["asInterface", "onExtraCallback"], "tables": ["IAuthTabCallbackDefault", "onExtraCallbackWithResult"]}, "o.onResourceReady": {"wrappers": ["b"], "keys": ["asInterface"], "tables": ["onNavigationEvent"]}, "o.s6": {"wrappers": ["a"], "keys": ["onExtraCallback"], "tables": ["IAuthTabCallback"]}, "o.PKCS58": {"wrappers": ["b"], "keys": ["access000"], "tables": ["IAuthTabCallback_Parcel"]}, "o.s3d": {"wrappers": ["a"], "keys": ["onWarmupCompleted"], "tables": ["onExtraCallbackWithResult"]}, "o.initWidthAndHeight": {"wrappers": ["a"], "keys": ["onWarmupCompleted"], "tables": ["IAuthTabCallback"]}, "o.internalStart": {"wrappers": ["a"], "keys": ["asInterface"], "tables": ["onExtraCallbackWithResult"]}, "im.toss.security.impl.malware.MalwareDetectActivity$onWarmupCompleted": {"wrappers": ["b"], "keys": ["IAuthTabCallbackStub"], "tables": ["asBinder"]}, "im.toss.security.impl.malware.MalwareDetectActivity$onTransact": {"wrappers": ["a"], "keys": ["IAuthTabCallback"], "tables": ["onWarmupCompleted"]}, "im.toss.devtool.runtime.data.util.SchemeExecutorActivity$IAuthTabCallback": {"wrappers": ["a"], "keys": ["onWarmupCompleted"], "tables": ["onNavigationEvent"]}, "im.toss.devtool.action.quickaction.QuickActionBottomSheetActivity$onWarmupCompleted": {"wrappers": ["a"], "keys": ["onExtraCallback"], "tables": ["onExtraCallbackWithResult"]}, "im.toss.devtool.action.presentation.DevToolActionListViewModel$IAuthTabCallbackStub": {"wrappers": ["a"], "keys": ["onExtraCallbackWithResult"], "tables": ["onNavigationEvent"]}};
var PREFIXES = Object.keys(SPEC);
var hookedCount = 0;
var nargs = 0;
var loader = null;
var phase2 = false;
var readDone = false;
function toInt(a) {
    if (typeof a === "number") return a;
    if (typeof a === "string" && a.length === 1) return a.charCodeAt(0);
    return null;
}
function hookClass(name) {
    try {
        var C = loader.use(name);
        var spec = null;
        for (var q = 0; q < PREFIXES.length; q++) {
            if (name === PREFIXES[q] || name.indexOf(PREFIXES[q] + "$") === 0) { spec = SPEC[PREFIXES[q]]; break; }
        }
        if (!spec) return;
        var nH = 0;
        for (var w = 0; w < spec.wrappers.length; w++) {
            var wn = spec.wrappers[w];
            var ovs;
            try { ovs = C[wn].overloads; } catch (e) { continue; }
            ovs.forEach(function (ov) {
                if (ov.argumentTypes.length !== 4) return;
                var t0 = ov.argumentTypes[0].className;
                if (t0 === "char[]" || t0 === "[C") return;
                try {
                    ov.implementation = function () {
                        var a = arguments;
                        var v0 = toInt(a[0]), v1 = toInt(a[1]), v2 = toInt(a[2]);
                        if (nargs < 900 && v0 !== null && v1 !== null && v2 !== null) {
                            send({ev: "call", cls: name, m: wn, a0: v0, a1: v1, a2: v2});
                            nargs++;
                        }
                        return ov.apply(this, a);
                    };
                    nH++;
                } catch (e) {}
            });
        }
        if (nH) hookedCount++;
    } catch (e) {}
}
function readKeysAndTables(pass) {
    Java.perform(function () {
        for (var q = 0; q < PREFIXES.length; q++) {
            var pc = PREFIXES[q];
            var sp = SPEC[pc];
            try {
                var C = loader.use(pc);
                var rec = {};
                for (var j = 0; j < sp.keys.length; j++) {
                    try { rec[sp.keys[j]] = "" + C[sp.keys[j]].value; } catch (e) {}
                }
                for (var j2 = 0; j2 < sp.tables.length; j2++) {
                    try {
                        var v = C[sp.tables[j2]].value;
                        if (v !== null && v !== undefined && v.length >= 4) {
                            var hex = "";
                            for (var z = 0; z < v.length; z++) hex += ("0000" + (v[z] & 0xFFFF).toString(16)).slice(-4);
                            rec["T:" + sp.tables[j2]] = v.length + ":" + hex;
                        }
                    } catch (e) {}
                }
                send({ev: "kt", cls: pc, pass: pass, d: rec});
            } catch (e) {}
        }
        send({ev: "kt-done", pass: pass});
    });
}
Java.perform(function () {
    try { Java.use("java.lang.System").exit.implementation = function (c) { send({ev: "exit-blocked", code: c}); }; } catch (e) {}
    try { Java.use("java.lang.Runtime").exit.implementation = function (c) { send({ev: "exit-blocked", code: c}); }; } catch (e) {}
    var natTimer = setInterval(function () {
        var base = null;
        try { base = Module.findBaseAddress("libea56.so"); } catch (e) {}
        if (!base) return;
        clearInterval(natTimer);
        try { Interceptor.replace(base.add(0x95224), new NativeCallback(function () { send({ev: "sd-blocked"}); return 0; }, "int", [])); } catch (e) {}
    }, 100);
    var ticks = 0;
    var timer = setInterval(function () {
        ticks++;
        if (ticks > 3000) { clearInterval(timer); return; }
        Java.perform(function () {
            Java.enumerateClassLoaders({
                onMatch: function (l) {
                    try {
                        var f = Java.ClassFactory.get(l);
                        f.use("o.ReusableBufferedOutputStream");
                        if (f.__cap_hooked) return;
                        f.__cap_hooked = true;
                        loader = f;
                        send({ev: "loader-found"});
                        var saved = loader;
                        loader = f;
                        for (var q0 = 0; q0 < PREFIXES.length; q0++) hookClass(PREFIXES[q0]);
                        if (!readDone) { readKeysAndTables(1); readDone = true; send({ev: "p1-done", hooks: hookedCount}); }
                    } catch (e) {}
                },
                onComplete: function () {}
            });
        });
        if (loader) return;
        if (!phase2 && ticks % 150 === 0) {
            phase2 = true;
            Java.perform(function () {
                Java.enumerateLoadedClasses({
                    onMatch: function (nm) {
                        if (nm.indexOf("o.") !== 0 && nm.indexOf("im.toss.") !== 0) return;
                        for (var q = 0; q < PREFIXES.length; q++) {
                            if (nm.indexOf(PREFIXES[q] + "$") === 0) { hookClass(nm); break; }
                        }
                    },
                    onComplete: function () { send({ev: "p2-done", hooks: hookedCount}); readKeysAndTables(2); }
                });
            });
        }
    }, 20);
});
