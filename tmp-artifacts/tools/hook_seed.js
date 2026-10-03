// hook_seed.js v2 — §188: device_id 파생 seed 캡처 (주기 재시도 무장)
'use strict';
Java.perform(function () {
    try { var Sys = Java.use("java.lang.System");
        Sys.exit.implementation = function (code) { send("[EXIT] System.exit(" + code + ") BLOCKED"); return; };
    } catch(e) {}

    var tries = 0, armed = false;
    var iv = setInterval(function () {
        Java.perform(function () {
            if (armed) { clearInterval(iv); return; }
            if (tries > 60) { clearInterval(iv); send("[!] give up"); return; }
            tries++;
            try {
                var R = Java.use("o.RealDrawScopeSizeResolver");
                armed = true; clearInterval(iv);
                R.onTransact.implementation = function () {
                    var r = this.onTransact();
                    send("[SEED-GET] seed=\"" + r + "\" len=" + (r ? r.length : 0));
                    return r;
                };
                try {
                    var P = Java.use("o.RealDrawScopeSizeResolver$IAuthTabCallback_Parcel");
                    P.onNavigationEvent.implementation = function () {
                        var r = this.onNavigationEvent();
                        send("[SEED-GEN] new seed=\"" + r + "\"");
                        return r;
                    };
                } catch(e) { send("[!] gen hook: " + e); }
                send("[+] seed hooks armed (tries=" + tries + ")");
            } catch(e) { /* not loaded yet */ }
        });
    }, 500);
    send("[+] hook_seed v2 loaded");
});
