// 39차 rasp_bridge.js — RASP→FDS 브리지(DexguardRasp/DexguardWrapper/DetectType)
// 후킹으로 DetectType 사유 직독 + Runtime.exit 전 스택 덤프(25차 갭 보완).
// attach 모드 전용(기동 1.5~3.5s). BLOCK_EXIT=true면 차단.
'use strict';
var BLOCK_EXIT = true;
var DIRP = "/data/data/viva.republica.toss/";
function mark(name, extra) {
    try {
        var f = new File(DIRP + name, "w");
        f.write("" + Date.now() + " " + (extra || "") + "\n");
        f.close();
    } catch (e) {}
}
function stackStr() {
    try {
        var Exc = Java.use("java.lang.Exception");
        var st = Exc.$new().getStackTrace();
        var out = [];
        for (var i = 0; i < st.length && i < 40; i++) out.push("    at " + st[i].toString());
        return out.join("\n");
    } catch (e) { return "(stack fail " + e + ")"; }
}
mark(".rb_load");
send("[+] rasp_bridge loaded");

Java.perform(function () {
    // ── 1) exit 트랩(스택 필수) ──────────────────────────────
    try {
        var Sys = Java.use("java.lang.System");
        Sys.exit.implementation = function (code) {
            send("[EXIT] System.exit(" + code + ") 스택:\n" + stackStr());
            mark(".rb_exit", "System code=" + code);
            if (BLOCK_EXIT) return;
            return this.exit(code);
        };
    } catch (e) { send("[hook sys fail] " + e); }
    try {
        var Rt = Java.use("java.lang.Runtime");
        Rt.exit.overload("int").implementation = function (code) {
            send("[EXIT] Runtime.exit(" + code + ") 스택:\n" + stackStr());
            mark(".rb_exit", "Runtime code=" + code);
            if (BLOCK_EXIT) return;
            return this.exit(code);
        };
        send("[+] exit traps armed (System+Runtime, both with stack)");
    } catch (e) { send("[hook rt fail] " + e); }

    // ── 2) DexGuard 브리지 클래스 스윕+후킹 ─────────────────
    var hooked = {};   // 클래스명 → true
    var TARGETS = [
        "im.toss.selfprotect.DexguardRasp",
        "im.toss.selfprotect.DexguardWrapper",
        "im.toss.selfprotect.DetectType"
    ];
    function hookAll(cn, factory) {
        try {
            var C = factory.use(cn);
            var dm = C.class.getDeclaredMethods();
            var n = 0;
            for (var i = 0; i < dm.length; i++) {
                var mn = dm[i].getName();
                if (mn.indexOf("$") >= 0) continue;
                try {
                    var ov = C[mn].overloads;
                    for (var k = 0; k < ov.length; k++) {
                        (function (meth, over) {
                            over.implementation = function () {
                                var a = [];
                                for (var q = 0; q < arguments.length; q++) {
                                    try { a.push(String(arguments[q])); } catch (e2) { a.push("?"); }
                                }
                                send("[BRIDGE] " + meth + "(" + a.join(", ") + ")");
                                var r = over.apply(this, arguments);
                                try { send("[BRIDGE] " + meth + " -> " + String(r)); } catch (e4) {}
                                return r;
                            };
                        })(cn + "." + mn, ov[k]);
                        n++;
                    }
                } catch (e) { /* overload 접근 불가(추상/네이티브) */ }
            }
            hooked[cn] = true;
            send("[BRIDGE] hooked " + cn + " (" + n + " overloads)");
        } catch (e) {
            // 이 로더에 없음 — 무음
        }
    }
    function sweep() {
        try {
        Java.enumerateClassLoaders({
            onLoader: function (loader) {
                TARGETS.forEach(function (cn) {
                    if (!hooked[cn]) { try { hookAll(cn, Java.ClassFactory.get(loader)); } catch (e0) {} }
                });
            },
            onComplete: function () {
                var got = TARGETS.filter(function (c) { return hooked[c]; });
                if (got.length) send("[BRIDGE] sweep: hooked=" + got.join(","));
            }
        });
        } catch (e) { send("[sweep fail] " + e); }
    }
    sweep();
    var ticks = 0;
    var iv = setInterval(function () {
        ticks++;
        if (ticks > 60 || TARGETS.every(function (c) { return hooked[c]; })) {
            clearInterval(iv);
            send("[BRIDGE] sweep end (" + ticks + " ticks)");
            return;
        }
        Java.perform(sweep);
    }, 500);

    // ── 3) 로그스토어 직전의 FDS 로그 메서드 탐조(이름 역추적) ──
    // log_name="fds_detected_debug" 문자열을 힙에서 쓰는 메서드는 알 수 없으므로,
    // 문자열 상수 등장 시점에 브리지 훅이 잡는다. (보조: File write 감시)
    try {
        var FOS = Java.use("java.io.FileOutputStream");
        var inits = FOS.$init.overloads;
        for (var wi = 0; wi < inits.length; wi++) {
            (function (over) {
                try {
                    over.implementation = function () {
                        for (var q = 0; q < arguments.length; q++) {
                            try {
                                if (String(arguments[q] && arguments[q].getAbsolutePath ? arguments[q].getAbsolutePath() : "").indexOf("logstore") >= 0) {
                                    send("[LOGSTORE] write " + arguments[q] + "\n" + stackStr().split("\n").slice(0, 12).join("\n"));
                                    mark(".rb_logstore", String(arguments[q]));
                                }
                            } catch (e2) {}
                        }
                        return over.apply(this, arguments);
                    };
                } catch (e3) {}
            })(inits[wi]);
        }
        send("[+] logstore write watcher armed (" + inits.length + " ctors)");
    } catch (e) { send("[logstore fail] " + e); }
});
