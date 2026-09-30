// §118c — one-shot runtime table dump (immediate read on loader discovery,
// then every 1s while alive). Survival set only.
var TARGETS = [{"cls": "o.getTabBar", "fields": ["onWarmupCompleted"]}, {"cls": "o.onEngineInitSuccess", "fields": ["onNavigationEvent"]}, {"cls": "o.LiteProcessServiceManagerLiteProcessInfo", "fields": ["onMessageChannelReady"]}, {"cls": "o.IconRoundCornerProgressBarSavedState1", "fields": ["onExtraCallback"]}, {"cls": "o.s3", "fields": ["IAuthTabCallback"]}, {"cls": "o.urlEncode", "fields": ["asBinder"]}, {"cls": "o.getBooleanFromAdObject", "fields": ["onTransact"]}, {"cls": "o.isNativeConfigEnabled", "fields": ["IAuthTabCallbackStub", "onNavigationEvent"]}, {"cls": "o.setSecondaryProgress", "fields": ["IAuthTabCallbackStub"]}, {"cls": "o.getScopeType$IAuthTabCallback", "fields": ["onNavigationEvent"]}, {"cls": "o.getDjangoNearestImageSize", "fields": ["onActivityLayout"]}, {"cls": "o.s8ExternalSyntheticLambda1", "fields": ["onWarmupCompleted"]}, {"cls": "o.onLoadResult", "fields": ["onExtraCallbackWithResult"]}, {"cls": "o.bindContext", "fields": ["onNavigationEvent"]}, {"cls": "o.s3c", "fields": ["IAuthTabCallbackDefault", "onExtraCallbackWithResult"]}, {"cls": "o.onResourceReady", "fields": ["onNavigationEvent"]}, {"cls": "o.s6", "fields": ["IAuthTabCallback"]}, {"cls": "o.PKCS58", "fields": ["IAuthTabCallback_Parcel"]}, {"cls": "o.s3d", "fields": ["onExtraCallbackWithResult"]}, {"cls": "o.initWidthAndHeight", "fields": ["IAuthTabCallback"]}, {"cls": "o.internalStart", "fields": ["onExtraCallbackWithResult"]}, {"cls": "im.toss.security.impl.malware.MalwareDetectActivity$onWarmupCompleted", "fields": ["asBinder"]}, {"cls": "im.toss.security.impl.malware.MalwareDetectActivity$onTransact", "fields": ["onWarmupCompleted"]}, {"cls": "im.toss.devtool.runtime.data.util.SchemeExecutorActivity$IAuthTabCallback", "fields": ["onNavigationEvent"]}, {"cls": "im.toss.devtool.action.quickaction.QuickActionBottomSheetActivity$onWarmupCompleted", "fields": ["onExtraCallbackWithResult"]}, {"cls": "im.toss.devtool.action.presentation.DevToolActionListViewModel$IAuthTabCallbackStub", "fields": ["onNavigationEvent"]}];
var loader = null;
var done = false;
var ticks = 0;
function readPass() {
    Java.perform(function () {
        var sentAny = false;
        for (var i = 0; i < TARGETS.length; i++) {
            var t = TARGETS[i];
            var flds = [];
            try {
                var C = loader.use(t.cls);
                for (var j = 0; j < t.fields.length; j++) {
                    var fn = t.fields[j];
                    try {
                        var v = C[fn].value;
                        if (v === null || v === undefined) continue;
                        var n = v.length;
                        if (n < 4) continue;
                        var hex = "";
                        for (var q = 0; q < n; q++) hex += ("0000" + (v[q] & 0xFFFF).toString(16)).slice(-4);
                        flds.push({f: fn, n: n, hex: hex});
                        sentAny = true;
                    } catch (e) {}
                }
            } catch (e) {}
            if (flds.length) send({ev: "tbl", cls: t.cls, flds: flds});
        }
        send({ev: "pass", n: ticks});
        done = sentAny;
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
    var timer = setInterval(function () {
        ticks++;
        if (ticks > 3000 || done) { clearInterval(timer); return; }
        if (!loader) {
            Java.perform(function () {
                Java.enumerateClassLoaders({
                    onMatch: function (l) {
                        if (loader) return;
                        try {
                            var f = Java.ClassFactory.get(l);
                            f.use("o.ReusableBufferedOutputStream");
                            loader = f;
                            send({ev: "loader-found"});
                            readPass();
                        } catch (e) {}
                    },
                    onComplete: function () {}
                });
            });
            return;
        }
        if (ticks % 50 === 0) readPass();
    }, 20);
});
