// hook_did3.js — §187: MediaDrm deviceUniqueId 교체 + dinitialize 요청/응답 본문 회수 통합
'use strict';
var DIRP = "/data/data/viva.republica.toss/";
var randomize = false;
var FIXED = [0x11,0x22,0x33,0x44,0x55,0x66,0x77,0x88,0x99,0xaa,0xbb,0xcc,0xdd,0xee,0x0f,0x1e,
             0x2d,0x3c,0x4b,0x5a,0x69,0x78,0x87,0x96,0xa5,0xb4,0xc3,0xd2,0xe1,0xf0,0x01,0x10];
function mark(name, extra) {
    try { var f = new File(DIRP + name, "w"); f.write("" + Date.now() + " " + (extra||"") + "\n"); f.close(); } catch(e){}
}
mark(".did3_load", "v3 swap+body");
send("[+] hook_did3 loaded");

Java.perform(function () {
    // 1) MediaDrm deviceUniqueId 교체 (32B 동일 길이)
    var MD = Java.use("android.media.MediaDrm");
    var swapped = 0;
    MD.getPropertyByteArray.implementation = function (name) {
        if (name === "deviceUniqueId") {
            swapped++;
            var jb = Java.array('byte', FIXED.map(function(b){ return (b>127)? b-256 : b; }));
            send("[MEDIADRM] SWAP #" + swapped + " deviceUniqueId -> 11223344...");
            mark(".did3_swap", "n=" + swapped);
            return jb;
        }
        return this.getPropertyByteArray(name);
    };
    try {
        MD.getPropertyString.implementation = function (name) {
            var r = this.getPropertyString(name);
            if (name === "securityLevel") send("[MEDIADRM] securityLevel=" + r);
            return r;
        };
    } catch(e) {}
    send("[+] MediaDrm swap armed");

    // 2) exit 차단
    try { var Sys = Java.use("java.lang.System");
        Sys.exit.implementation = function (code) { send("[EXIT] System.exit(" + code + ") BLOCKED"); return; };
        var Rt = Java.use("java.lang.Runtime");
        Rt.exit.overload("int").implementation = function (code) { send("[EXIT] Runtime.exit BLOCKED"); return; };
    } catch(e) {}

    // 3) okhttp 요청/응답 본문 관찰 (dinitialize 200 포함)
    setTimeout(function(){ Java.perform(function(){
        Java.enumerateClassLoaders({
            onMatch: function(loader){
                try {
                    loader.findClass("okhttp3.OkHttpClient");
                    Java.classFactory.loader = loader;
                    var CF = Java.ClassFactory.get(loader);
                    var Chain = CF.use("okhttp3.internal.http.RealInterceptorChain");
                    Chain.proceed.overload("okhttp3.Request").implementation = function(req){
                        var resp = this.proceed(req);
                        try {
                            var u = req.url().toString();
                            if (u.indexOf("toss.im") < 0) return resp;
                            var tag = u.substring(u.indexOf("toss.im"), 110);
                            try {
                                var body = req.body();
                                if (body !== null) {
                                    var Buf = CF.use("okio.Buffer");
                                    var b = Buf.$new();
                                    body.writeTo(b);
                                    var bs = b.readUtf8();
                                    if (bs.length > 0) send("[REQ-BODY] " + tag + " <- " + bs.substring(0, 900));
                                    else send("[REQ-BODY] " + tag + " <- <empty>");
                                } else send("[REQ-BODY] " + tag + " <- <null body>");
                            } catch(e1) { send("[REQ-BODY-ERR] " + tag + " " + e1); }
                            var code = resp.code();
                            send("[RESP] " + code + " <- " + tag);
                            try { send("[RESP-BODY] " + tag + " " + resp.peekBody(2048).string().substring(0, 1000)); }
                            catch(e2) { send("[RESP-BODY-ERR] " + tag + " " + e2); }
                        } catch(e0) {}
                        return resp;
                    };
                    send("[+] body observer armed");
                } catch(e) { send("[!] observer fail: " + e); }
            },
            onComplete: function(){ send("[+] loader enumeration done"); }
        });
    });}, 1200);
});
