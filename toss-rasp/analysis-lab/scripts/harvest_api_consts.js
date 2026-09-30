// harvest_api_consts.js — exact Android API constant values from THIS guest
// (needed to evaluate DexGuard call-site constant soup). Runs on a benign
// system app; no target-app involvement.
Java.perform(function () {
    var VC = Java.use("android.view.ViewConfiguration");
    var MEASURE = Java.use("android.view.View$MeasureSpec");
    var KF = Java.use("android.view.KeyEvent");
    var TU = Java.use("android.text.TextUtils");
    var IF = Java.use("android.graphics.ImageFormat");
    var DR = Java.use("android.graphics.drawable.Drawable");
    var out = {};
    function T(name, fn) { try { out[name] = fn(); } catch (e) { out[name] = 'ERR:' + e; } }
    T('getDoubleTapTimeout', function(){ return VC.getDoubleTapTimeout(); });
    T('getJumpTapTimeout', function(){ return VC.getJumpTapTimeout(); });
    try { T('getGlobalActionKeyTimeout', function(){ return VC.getGlobalActionKeyTimeout(); }); } catch (e) { T('getGlobalActionKeyTimeout', function(){ return "N/A"; }); }
    T('getPressedStateDuration', function(){ return VC.getPressedStateDuration(); });
    T('getMode0', function(){ return MEASURE.getMode(0); });
    T('getSize0', function(){ return MEASURE.getSize(0); });
    T('makeMeasureSpec00', function(){ return MEASURE.makeMeasureSpec(0, 0); });
    T('getModifierMetaStateMask', function(){ return KF.getModifierMetaStateMask(); });
    T('hasNoModifiers0', function(){ return KF.hasNoModifiers(0); });
    T('indexOf_empty', function(){ return TU.indexOf("", "", 0, 0); });
    T('getBitsPerPixel0', function(){ return IF.getBitsPerPixel(0); });
    T('resolveOpacity00', function(){ return DR.resolveOpacity(0, 0); });
    // also char/byte wrap semantics probe
    T('metaStateAsByte', function(){ return KF.getModifierMetaStateMask() & 0xFF; });
    send({ev: "consts", values: out});
});
