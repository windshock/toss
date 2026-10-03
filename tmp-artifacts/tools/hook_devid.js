// hook_devid.js — §188: 트래커 device_id 파생 입력 포착 (digest/UUID/android_id/MediaDrm)
'use strict';
Java.perform(function () {
    try { var Sys = Java.use("java.lang.System");
        Sys.exit.implementation = function (code) { send("[EXIT] System.exit(" + code + ") BLOCKED"); return; };
    } catch(e) {}

    function hx(bytes) {
        var s = "";
        for (var i = 0; i < bytes.length && i < 48; i++) {
            var b = bytes[i] & 0xff; s += (b<16?"0":"") + b.toString(16);
        }
        return s;
    }

    // 1) MessageDigest.digest — 입력+출력+직전 스택 2프레임
    try {
        var MD = Java.use("java.security.MessageDigest");
        MD.digest.overload("[B").implementation = function (input) {
            var out = this.digest(input);
            var st = Java.use("java.lang.Thread").currentThread().getStackTrace();
            var fr = "";
            for (var i = 2; i < Math.min(st.length, 5); i++) fr += st[i].getClassName().substring(0,40) + "." + st[i].getMethodName() + ":" + st[i].getLineNumber() + " <- ";
            send("[DIGEST] algo=" + this.getAlgorithm() + " in=" + hx(input) + " out=" + hx(out) + " | " + fr);
            return out;
        };
        MD.digest.overload().implementation = function () {
            var out = this.digest();
            var st = Java.use("java.lang.Thread").currentThread().getStackTrace();
            var fr = "";
            for (var i = 2; i < Math.min(st.length, 5); i++) fr += st[i].getClassName().substring(0,40) + "." + st[i].getMethodName() + ":" + st[i].getLineNumber() + " <- ";
            send("[DIGEST] algo=" + this.getAlgorithm() + " (stream) out=" + hx(out) + " | " + fr);
            return out;
        };
        send("[+] digest armed");
    } catch(e) { send("[!] digest: " + e); }

    // 2) android_id 읽기
    try {
        var SS = Java.use("android.provider.Settings$Secure");
        SS.getString.overload("android.content.ContentResolver", "java.lang.String").implementation = function (cr, name) {
            var r = this.getString(cr, name);
            if (name === "android_id") send("[ANDID] read -> " + r);
            return r;
        };
        send("[+] android_id armed");
    } catch(e) { send("[!] andid: " + e); }

    // 3) MediaDrm deviceUniqueId (원본 관찰 — 교체 없음)
    try {
        var MDM = Java.use("android.media.MediaDrm");
        MDM.getPropertyByteArray.implementation = function (name) {
            var r = this.getPropertyByteArray(name);
            if (name === "deviceUniqueId") send("[MDRM] deviceUniqueId=" + hx(r));
            return r;
        };
        send("[+] mediadrm armed");
    } catch(e) { send("[!] mdrm: " + e); }

    // 4) UUID nameUUIDFromBytes (파생 흔적)
    try {
        var U = Java.use("java.util.UUID");
        U.nameUUIDFromBytes.implementation = function (b) {
            var r = this.nameUUIDFromBytes(b);
            send("[UUIDN] in=" + hx(b) + " -> " + r.toString());
            return r;
        };
        send("[+] uuid armed");
    } catch(e) {}
    send("[+] hook_devid ready");
});
