// §143-E3b — uname 스푸핑 A/B + dlsym 심볼 정밀 캡처
// 가설: redroid 클린화(§138) 후에도 죽는 이유 = uname의 Ubuntu 커널 서명.
// A/B: uname onLeave에서 utsname 버퍼를 실기기(SM-S916N) 값으로 덮어쓰기 → 생존?
var SPOOF = {
    "ro.product.model": "SM-S916N", "ro.product.brand": "samsung",
    "ro.product.device": "s916n", "ro.product.manufacturer": "Samsung",
    "ro.product.name": "s916n", "ro.hardware": "qcom",
    "ro.hardware.gralloc": "qcom,sm8550", "ro.build.id": "UP1A.231005.007",
    "ro.build.display.id": "SM-S916N", "gsm.sim.operator.alpha": "KT",
    "gsm.operator.alpha": "KT", "gsm.sim.operator.numeric": "45005",
    "gsm.operator.numeric": "45005", "gsm.sim.operator.iso-country": "kr",
    "gsm.operator.iso-country": "kr"
};
// 실기기 SM-S916N(Android 14/OneUI 6) utsname 참고값
var FAKE_RELEASE = "5.15.104-android13-8-27358815-g7f65fdd2e339-ab11730911";
var FAKE_VERSION  = "#1 SMP PREEMPT Thu Jun 12 13:48:44 UTC 2025";
var FAKE_DOMAIN   = "localdomain";
var FAKE_NODE     = "localhost";

var armed = false, ncap = 0, CAP = 3000;
function send2(o) { if (ncap < CAP) { send(o); ncap++; } }

var _open = null, _close = null;
function marker(tag) {
    try {
        if (!_open) {
            _open = new NativeFunction(Module.getExportByName("libc.so", "open"), "int", ["pointer", "int", "int"]);
            _close = new NativeFunction(Module.getExportByName("libc.so", "close"), "int", ["int"]);
        }
        var fd = _open(Memory.allocUtf8String("/data/local/tmp/__m_" + tag), 0x241, 0x1a4);
        if (fd >= 0) _close(fd);
    } catch (e) {}
}

Java.perform(function () {
    try { Java.use("java.lang.System").exit.implementation = function (c) { marker("exitblk"); send2({ev: "exit-blocked", code: c}); }; } catch (e) {}
    var natTimer = setInterval(function () {
        var base = null;
        try { base = Module.findBaseAddress("libea56.so"); } catch (e) {}
        if (!base) return;
        clearInterval(natTimer);
        send2({ev: "base", b: "" + base});

        // 프로퍼티 스푸핑 (§138)
        var propGet = Module.findExportByName("libc.so", "__system_property_get");
        Interceptor.attach(propGet, {
            onEnter: function (a) { this.nm = a[0].readCString(); this.buf = a[1]; },
            onLeave: function (r) {
                if (this.nm in SPOOF) { this.buf.writeUtf8String(SPOOF[this.nm]); return SPOOF[this.nm].length + 1; }
            }
        });

        // ★ uname 스푸핑 (A/B 변수)
        var un = Module.findExportByName("libc.so", "uname");
        Interceptor.attach(un, {
            onEnter: function (a) { this.p = a[0]; },
            onLeave: function (r) {
                try {
                    var orig = this.p.add(130).readCString() || "";
                    // sysname[0] nodename[65] release[130] version[195] machine[260] domainname[325]
                    this.p.add(0).writeUtf8String("Linux");
                    this.p.add(65).writeUtf8String(FAKE_NODE);
                    this.p.add(130).writeUtf8String(FAKE_RELEASE);
                    this.p.add(195).writeUtf8String(FAKE_VERSION);
                    this.p.add(260).writeUtf8String("aarch64");
                    this.p.add(325).writeUtf8String(FAKE_DOMAIN);
                    send2({ev: "uname_spoofed", orig_release: orig.substring(0, 40)});
                } catch (e) { send2({ev: "uname_err", err: "" + e}); }
            }
        });

        // 배터리 마커
        try {
            Interceptor.attach(base.add(0xafed8), {
                onEnter: function (a) {
                    var id = a[0].toInt32();
                    if (id === 4 && !armed) { armed = true; marker("batstart"); send2({ev: "★BATTERY_ARMED"}); }
                }
            });
        } catch (e) {}

        // dlsym 심볼 정밀 캡처 (NUL 정지 + lr 기록)
        var dls = Module.findExportByName("libc.so", "dlsym");
        Interceptor.attach(dls, {
            onEnter: function (a) {
                this.s = "";
                try { this.s = a[1].readCString() || ""; } catch (e) {}
                this.lr = this.context.x30 ? (this.context.x30.toString()) : "?";
            },
            onLeave: function (r) {
                if (!armed || !this.s || this.s.length < 3) return;
                send2({ev: "dlsym", sym: this.s.substring(0, 60), ret: r.toString(), lr: this.lr});
            }
        });

        send2({ev: "ready"});
    }, 100);
});
