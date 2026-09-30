// §143-E4 — camo33(실대상) 관측: GL 문자열 실물 + fd 워크 앱뷰 + uname(LKM 스푸프 검증)
// + Java Display.getOwnerPackageName(§131 잔여). 스푸핑 없음 — 순수 관측.
var armed = false, ncap = 0, CAP = 3000;
function send2(o) { if (ncap < CAP) { send(o); ncap++; } }

Java.perform(function () {
    // §131: Display.getOwnerPackageName — 실기기=제조사 패키지, 에뮬=Google/空白 의심
    try {
        var Disp = Java.use("android.view.Display");
        Disp.getOwnerPackageName.implementation = function () {
            var v = this.getOwnerPackageName();
            send2({ev: "getOwnerPackageName", val: "" + v});
            return v;
        };
        Disp.getName.implementation = function () {
            var v = this.getName();
            send2({ev: "getDisplay.getName", val: "" + v});
            return v;
        };
    } catch (e) { send2({ev: "display-hook-err", err: "" + e}); }

    var natTimer = setInterval(function () {
        var base = null;
        try { base = Module.findBaseAddress("libea56.so"); } catch (e) {}
        if (!base) return;
        clearInterval(natTimer);
        send2({ev: "base", b: "" + base});

        // 배터리 마커
        try {
            Interceptor.attach(base.add(0xafed8), {
                onEnter: function (a) {
                    var id = a[0].toInt32();
                    send2({ev: "afed8", id: id});
                    if (id === 4 && !armed) { armed = true; send2({ev: "★BATTERY_ARMED"}); }
                }
            });
        } catch (e) { send2({ev: "afed8-err", err: "" + e}); }

        // uname — LKM 스푸프가 실제로 통과하는지 관측
        var un = Module.findExportByName("libc.so", "uname");
        if (un) Interceptor.attach(un, {
            onEnter: function (a) { this.p = a[0]; },
            onLeave: function (r) {
                try { send2({ev: "uname", release: (this.p.add(130).readCString() || "").substring(0, 50)}); } catch (e) {}
            }
        });

        // readlinkat — fd 워크의 앱 뷰 (LKM 세탁 검증 포함)
        var rl = Module.findExportByName("libc.so", "readlinkat");
        if (rl) Interceptor.attach(rl, {
            onEnter: function (a) {
                this.p = ""; try { this.p = a[1].readCString() || ""; } catch (e) {}
                this.buf = a[2];
            },
            onLeave: function (r) {
                var n = r.toInt32();
                var t = "";
                if (n > 0 && this.buf) { try { t = this.buf.readCString(n) || ""; } catch (e) {} }
                if (this.p.indexOf("/proc/self/fd/") === 0 || t.indexOf("ashmem") >= 0 ||
                    t.indexOf("goldfish") >= 0 || t.indexOf("qemu") >= 0 || t.indexOf("memfd") >= 0 ||
                    t.indexOf(".wq517h") >= 0 || t.indexOf(".tr482w") >= 0)
                    send2({ev: "readlinkat", path: this.p, target: t});
            }
        });

        // dlsym — 가드의 런타임 심볼 결정 (심볼 NUL 정확 종료)
        var dls = Module.findExportByName("libc.so", "dlsym");
        if (dls) Interceptor.attach(dls, {
            onEnter: function (a) { this.s = ""; try { this.s = a[1].readCString() || ""; } catch (e) {} },
            onLeave: function (r) { if (armed && this.s.length > 2) send2({ev: "dlsym", sym: this.s.substring(0, 64), ret: r.toString()}); }
        });

        // ★ GL 문자열 — dlsym 동적 해결로 실제 주소를 잡아 훅 (모듈명 무관)
        var dlsymFn = new NativeFunction(dls, "pointer", ["pointer", "pointer"]);
        var hookedGl = {};
        function tryHookGl(fnName, nargs) {
            try {
                if (hookedGl[fnName]) return;
                var addr = dlsymFn(ptr(0), Memory.allocUtf8String(fnName)); // RTLD_DEFAULT=0
                if (addr.isNull()) { return; }  // GL 미로드 — 타이머 재시도
                Interceptor.attach(addr, {
                    onEnter: function (a) { this.nm = a[0].toInt32(); this.idx = nargs > 1 ? a[1].toInt32() : -1; },
                    onLeave: function (r) {
                        var v = "(null)";
                        if (!r.isNull()) { try { v = r.readCString(600) || ""; } catch (e) {} }
                        send2({ev: "glstr", fn: fnName, name: this.nm, idx: this.idx, val: v.substring(0, 500)});
                    }
                });
                hookedGl[fnName] = true;
                send2({ev: "glres", fn: fnName, found: true, at: addr.toString()});
            } catch (e) { send2({ev: "glres-err", fn: fnName, err: "" + e}); }
        }
        var glTimer = setInterval(function () {
            tryHookGl("glGetString", 1);
            tryHookGl("glGetStringi", 2);
            if (hookedGl.glGetString && hookedGl.glGetStringi) { clearInterval(glTimer); send2({ev: "glhook_done"}); }
        }, 400);
        tryHookGl("glGetString", 1);
        tryHookGl("glGetStringi", 2);
        try {
            var eglq = dlsymFn(ptr(0), Memory.allocUtf8String("eglQueryString"));
            if (!eglq.isNull()) Interceptor.attach(eglq, {
                onEnter: function (a) { this.d = a[0]; this.nm = a[1].toInt32(); },
                onLeave: function (r) {
                    var v = "(null)";
                    if (!r.isNull()) { try { v = r.readCString(600) || ""; } catch (e) {} }
                    send2({ev: "eglq", name: this.nm, val: v.substring(0, 500)});
                }
            });
        } catch (e) {}

        send2({ev: "ready"});
    }, 100);
});
