// hook_devid2.js — §188: digest 인스턴스별 update 바이트 누적 추적 → 314872ec 파생 입력 확정
'use strict';
Java.perform(function () {
    try { var Sys = Java.use("java.lang.System");
        Sys.exit.implementation = function (code) { send("[EXIT] System.exit(" + code + ") BLOCKED"); return; };
    } catch(e) {}

    function hx(bytes, max) {
        max = max || 128;
        var s = "";
        for (var i = 0; i < bytes.length && i < max; i++) {
            var b = bytes[i] & 0xff; s += (b<16?"0":"") + b.toString(16);
        }
        return s;
    }
    function asc(bytes, max) {
        max = max || 128;
        var s = "";
        for (var i = 0; i < bytes.length && i < max; i++) {
            var b = bytes[i] & 0xff; s += (b>=32&&b<127)?String.fromCharCode(b):".";
        }
        return s;
    }

    var instCount = 0;
    var MD = Java.use("java.security.MessageDigest");

    // getInstance 캡처 → 알고리즘 태깅
    MD.getInstance.overload("java.lang.String").implementation = function (algo) {
        var inst = this.getInstance(algo);
        return inst;
    };

    MD.update.overload("[B").implementation = function (input) {
        this._fed = (this._fed || "") + hx(input, 256);
        this._fedasc = (this._fedasc || "") + asc(input, 256);
        return this.update(input);
    };
    MD.update.overload("[B", "int", "int").implementation = function (input, off, len) {
        var sub = Java.array("byte", Array.prototype.slice.call(input, off, off + len));
        this._fed = (this._fed || "") + hx(sub, 256);
        this._fedasc = (this._fedasc || "") + asc(sub, 256);
        return this.update(input, off, len);
    };

    try {
        MD.update.overload("java.nio.ByteBuffer").implementation = function (bb) {
            try {
                var n = bb.remaining();
                var sub = Java.array("byte", Array.prototype.slice.call(bb.array ? (function(){var a=[];while(bb.hasRemaining()){a.push(bb.get());}return a;})() : [], 0));
                this._fed = (this._fed || "") + hx(sub, 256);
                this._fedasc = (this._fedasc || "") + asc(sub, 256);
            } catch(e) { this._fed = (this._fed||"") + "<bb-err>"; }
            return this.update(bb);
        };
        send("[+] bb update armed");
    } catch(e) { send("[!] bb: " + e); }

    MD.digest.overload().implementation = function () {
        var out = this.digest();
        var algo = this.getAlgorithm();
        var st = Java.use("java.lang.Thread").currentThread().getStackTrace();
        var fr = "";
        for (var i = 2; i < Math.min(st.length, 6); i++) fr += st[i].getClassName().substring(0,36) + "." + st[i].getMethodName() + ":" + st[i].getLineNumber() + " <- ";
        var outHex = hx(out, 64);
        // device_id 후보 (314872ec로 시작하는 MD5) 강조
        if (outHex.indexOf("314872ec") === 0 || outHex.indexOf("555d7960") === 0) {
            send("***[TARGET-DIGEST]*** algo=" + algo + " fed_hex=" + (this._fed || "<no-update>") +
                 " fed_asc=" + (this._fedasc || "") + " out=" + outHex + " | " + fr);
        } else if (fr.indexOf("EstimateFace") >= 0 || fr.indexOf("RealDraw") >= 0 || fr.indexOf("GetFeature") >= 0) {
            send("[DIGEST-T] algo=" + algo + " fed_asc=" + (this._fedasc || "").substring(0,120) + " out=" + outHex + " | " + fr);
        }
        delete this._fed; delete this._fedasc;
        return out;
    };
    send("[+] digest tracker armed");
});
