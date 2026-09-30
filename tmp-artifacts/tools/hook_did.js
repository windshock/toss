// hook_did.js v2 — MediaDrm 레벨 deviceUniqueId 교체 (§151 Phase-1)
// 근거: 실측상 device_id lazy 계산이 attach(~1.5s) 이후 ~2-3s에 MediaDrm 호출 → 원천 교체 가능
// 원본 길이(32B) 유지 고정값 → Toss hash·TNK Base64 자동 정합
'use strict';
var DIRP = "/data/data/viva.republica.toss/";

// 고정 32바이트 신원 (재현성; 런마다 바꾸려면 randomize=true)
var randomize = false;
var FIXED = [0x11,0x22,0x33,0x44,0x55,0x66,0x77,0x88,0x99,0xaa,0xbb,0xcc,0xdd,0xee,0x0f,0x1e,
             0x2d,0x3c,0x4b,0x5a,0x69,0x78,0x87,0x96,0xa5,0xb4,0xc3,0xd2,0xe1,0xf0,0x01,0x10];

function mark(name, extra) {
    try { var f = new File(DIRP + name, "w"); f.write("" + Date.now() + " " + (extra||"") + "\n"); f.close(); } catch(e){}
}

mark(".did_load", "v2 mediadrm-swap");
send("[+] hook_did v2 loaded");

Java.perform(function () {
    var swapped = 0;

    // 1) MediaDrm.getPropertyByteArray("deviceUniqueId") → 교체 (32B 동일 길이)
    var MD = Java.use("android.media.MediaDrm");
    MD.getPropertyByteArray.implementation = function (name) {
        if (name === "deviceUniqueId") {
            swapped++;
            var out;
            if (randomize) {
                out = [];
                for (var i = 0; i < 32; i++) out.push(Math.floor(Math.random()*256));
            } else out = FIXED;
            var jb = Java.array('byte', out.map(function(b){ return (b>127)? b-256 : b; }));
            send("[MEDIADRM] SWAP #" + swapped + " deviceUniqueId → " + out.slice(0,8).map(function(b){return ("0"+b.toString(16)).slice(-2);}).join("") + "…");
            mark(".did_swap", "n=" + swapped);
            return jb;
        }
        return this.getPropertyByteArray(name);
    };
    send("[+] MediaDrm swap armed");

    // 2) securityLevel은 L3 관찰만 (교체 없음 — 변수 통제)
    try {
        MD.getPropertyString.implementation = function (name) {
            var r = this.getPropertyString(name);
            if (name === "securityLevel") { send("[MEDIADRM] securityLevel=" + r); mark(".did_level", "level=" + r); }
            return r;
        };
    } catch(e) { send("[!] level observe fail: " + e); }

    // 2b) System.exit 차단 (25차 exit_trap 패턴 — 플로우 진행 확보)
    var Sys = Java.use("java.lang.System");
    Sys.exit.implementation = function (code) {
        send("[EXIT] System.exit(" + code + ") BLOCKED");
        mark(".did_exit_blocked", "code=" + code);
        return;
    };
    var Rt = Java.use("java.lang.Runtime");
    Rt.exit.overload("int").implementation = function (code) {
        send("[EXIT] Runtime.exit(" + code + ") BLOCKED"); return;
    };
    send("[+] exit blocker armed");

    // 3) okhttp URL 관찰 — 로더 열거로 앱 로더 확보 후 시도
    setTimeout(function(){ Java.perform(function(){
        Java.enumerateClassLoaders({
            onMatch: function(loader){
                try {
                    loader.findClass("okhttp3.OkHttpClient");
                    Java.classFactory.loader = loader;
                    var OC = Java.use("okhttp3.OkHttpClient");
                    OC.newCall.implementation = function (req) {
                        try {
                            var u = req.url().toString();
                            if (u.indexOf("toss.im") >= 0) send("[HTTP] " + req.method() + " " + u.substring(0,120));
                        } catch(e){}
                        return this.newCall(req);
                    };
                    // 응답 코드 캡처
                    var Chain = Java.use("okhttp3.internal.http.RealInterceptorChain");
                    Chain.proceed.overload("okhttp3.Request").implementation = function(req){
                        var resp = this.proceed(req);
                        try {
                            var u = req.url().toString();
                            if (u.indexOf("toss.im") >= 0) {
                                var code = resp.code();
                                send("[RESP] " + code + " ← " + u.substring(8, 100));
                                if (code >= 400) {
                                    try {
                                        var pb = resp.peekBody(600);
                                        send("[BODY] " + pb.string().substring(0, 500));
                                    } catch(e2) {}
                                }
                            }
                        } catch(e){}
                        return resp;
                    };
                    send("[+] response-code observer armed");
                    send("[+] okhttp observer armed (loader=" + loader.toString().substring(0,60) + ")");
                } catch(e) {}
            },
            onComplete: function(){ send("[+] loader enumeration done"); }
        });
    });}, 1500);
});
