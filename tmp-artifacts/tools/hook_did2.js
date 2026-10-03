// hook_did2.js — §187: dinitialize 요청/응답 본문 회수 (dword 메시지 본문 [O] 항목)
// 기반: hook_did.js v2 + okhttp 요청바디(req.body→okio.Buffer)·응답바디(200 포함) 캡처
'use strict';
var DIRP = "/data/data/viva.republica.toss/";
function mark(name, extra) {
    try { var f = new File(DIRP + name, "w"); f.write("" + Date.now() + " " + (extra||"") + "\n"); f.close(); } catch(e){}
}
mark(".did2_load", "v3 body-capture");
send("[+] hook_did2 loaded");

Java.perform(function () {
    // System.exit 차단 (플로우 유지)
    try { var Sys = Java.use("java.lang.System");
        Sys.exit.implementation = function (code) { send("[EXIT] System.exit(" + code + ") BLOCKED"); return; };
        var Rt = Java.use("java.lang.Runtime");
        Rt.exit.overload("int").implementation = function (code) { send("[EXIT] Runtime.exit BLOCKED"); return; };
    } catch(e) { send("[!] exit-block fail: " + e); }

    setTimeout(function(){ Java.perform(function(){
        Java.enumerateClassLoaders({
            onMatch: function(loader){
                try {
                    loader.findClass("okhttp3.OkHttpClient");
                    Java.classFactory.loader = loader;
                    var Chain = Java.use("okhttp3.internal.http.RealInterceptorChain");
                    Chain.proceed.overload("okhttp3.Request").implementation = function(req){
                        var resp = this.proceed(req);
                        try {
                            var u = req.url().toString();
                            if (u.indexOf("toss.im") < 0) return resp;
                            var tag = u.substring(u.indexOf("toss.im"), 100);
                            // 요청 바디 (appId/deviceId 등)
                            try {
                                var body = req.body();
                                if (body !== null && body.isDuplex && !body.isDuplex()) {
                                    var Buf = Java.use("okio.Buffer");
                                    var b = Buf.$new();
                                    body.writeTo(b);
                                    var bs = b.readUtf8();
                                    if (bs.length > 0) send("[REQ-BODY] " + tag + " ← " + bs.substring(0, 700));
                                }
                            } catch(e1) {}
                            // 응답 바디 — dinitialize는 200도 회수 (dword 정책 본문)
                            var code = resp.code();
                            var wantBody = (code >= 400) || (u.indexOf("dinitialize") >= 0);
                            if (wantBody) {
                                try {
                                    var pb = resp.peekBody(2048);
                                    var body = pb.string();
                                    send("[RESP] " + code + " ← " + tag);
                                    send("[RESP-BODY] " + body.substring(0, 900));
                                } catch(e2) { send("[RESP] " + code + " ← " + tag + " (peek fail)"); }
                            } else {
                                send("[RESP] " + code + " ← " + tag);
                            }
                        } catch(e0) {}
                        return resp;
                    };
                    send("[+] body observer armed");
                } catch(e) {}
            },
            onComplete: function(){ send("[+] loader enumeration done"); }
        });
    });}, 1500);
});
