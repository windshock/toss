// harvest2.js — round-2 Android API constants (settings app, no RASP).
Java.perform(function () {
    var VC = Java.use("android.view.ViewConfiguration");
    var KF = Java.use("android.view.KeyEvent");
    var TU = Java.use("android.text.TextUtils");
    var out = {};
    function T(name, fn) { try { out[name] = "" + fn(); } catch (e) { out[name] = "ERR"; } }
    T("getScrollBarSize", function(){ return VC.getScrollBarSize(); });
    T("getTapTimeout", function(){ return VC.getTapTimeout(); });
    T("getLongPressTimeout", function(){ return VC.getLongPressTimeout(); });
    T("getKeyRepeatDelay", function(){ return VC.getKeyRepeatDelay(); });
    T("getKeyRepeatTimeout", function(){ return VC.getKeyRepeatTimeout(); });
    T("getMaximumFlingVelocity", function(){ return VC.getMaximumFlingVelocity(); });
    T("getMinimumFlingVelocity", function(){ return VC.getMinimumFlingVelocity(); });
    T("getScaledTouchSlop", function(){ return VC.getScaledTouchSlop(); });
    T("getScaledPagingTouchSlop", function(){ return VC.getScaledPagingTouchSlop(); });
    T("getMaxKeyCode", function(){ return KF.getMaxKeyCode(); });  // static? maybe instance-only
    T("getCapsMode", function(){ return TU.getCapsMode("", 0, 0); });
    T("indexOf2", function(){ return TU.indexOf("", ""); });
    send({ev: "consts2", values: out});
});
