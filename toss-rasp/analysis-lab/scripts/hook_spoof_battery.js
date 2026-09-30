// §138 — redroid를 camo33처럼 클린화 + 배터리 w0 캡처
// 1) __system_property_get 후킹으로 model/brand/gralloc/gsm 스푸핑
// 2) 0xaff98 (배터리 blr x8) + 조건부 디스패치(0xb000c tst/csel) 훅
// 3) afed8(4) 진입 시 armed → 모든 API 콜의 함수명+반환값 기록
var SPOOF = {
    "ro.product.model": "SM-S916N",
    "ro.product.brand": "samsung",
    "ro.product.device": "s916n",
    "ro.product.manufacturer": "Samsung",
    "ro.product.name": "s916n",
    "ro.hardware": "qcom",
    "ro.hardware.gralloc": "qcom,sm8550",
    "ro.build.id": "UP1A.231005.007",
    "ro.build.display.id": "SM-S916N",
    "gsm.sim.operator.alpha": "KT",
    "gsm.operator.alpha": "KT",
    "gsm.sim.operator.numeric": "45005",
    "gsm.operator.numeric": "45005",
    "gsm.sim.operator.iso-country": "kr",
    "gsm.operator.iso-country": "kr"
};
var armed = false;
var got_names = {};
var results = [];
var ncap = 0;

Java.perform(function () {
    try { Java.use("java.lang.System").exit.implementation = function (c) { send({ev: "exit-blocked", code: c}); }; } catch (e) {}
    try { Java.use("java.lang.Runtime").exit.implementation = function (c) { send({ev: "exit-blocked", code: c}); }; } catch (e) {}
    var natTimer = setInterval(function () {
        var base = null;
        try { base = Module.findBaseAddress("libea56.so"); } catch (e) {}
        if (!base) return;
        clearInterval(natTimer);
        send({ev: "base", b: "" + base});

        // Build reverse map for fn name resolution
        var libc = Process.findModuleByName("libc.so");
        if (libc) {
            libc.enumerateExports().forEach(function (e) {
                got_names[e.address.toString()] = e.name;
            });
        }
        Process.findModuleByName("libea56.so").enumerateExports().forEach(function (e) {
            got_names[e.address.toString()] = "libea56:" + e.name;
        });

        // ★ Property spoofing
        var propGet = Module.findExportByName("libc.so", "__system_property_get");
        if (propGet) {
            Interceptor.attach(propGet, {
                onEnter: function (a) { this.nm = a[0].readCString(); this.buf = a[1]; },
                onLeave: function (r) {
                    if (this.nm in SPOOF) {
                        var v = SPOOF[this.nm];
                        this.buf.writeUtf8String(v);
                        if (armed && ncap < 300) {
                            send({ev: "pg", name: this.nm, spoofed: v});
                            ncap++;
                        }
                        return v.length + 1;
                    }
                    if (armed && ncap < 300) {
                        var val = "";
                        try { val = this.buf.readCString() || ""; } catch (e) {}
                        send({ev: "pg", name: this.nm, val: val.substring(0, 50)});
                        ncap++;
                    }
                }
            });
        }
        var propFind = Module.findExportByName("libc.so", "__system_property_find");
        if (propFind) {
            Interceptor.attach(propFind, {
                onEnter: function (a) { this.nm = a[0].readCString(); },
                onLeave: function (r) {
                    if (armed && ncap < 300) {
                        send({ev: "pf", name: this.nm, found: !r.isNull()});
                        ncap++;
                    }
                }
            });
        }
        // dl_iterate_phdr
        var dlIter = Module.findExportByName("libc.so", "dl_iterate_phdr");
        if (dlIter) {
            Interceptor.attach(dlIter, {
                onEnter: function () {
                    if (armed && ncap < 300) { send({ev: "dl_iterate"}); ncap++; }
                }
            });
        }
        // openat
        var openat = Module.findExportByName("libc.so", "openat");
        if (openat) {
            Interceptor.attach(openat, {
                onEnter: function (a) {
                    if (!armed || ncap > 300) return;
                    try {
                        var p = a[1].readCString();
                        if (p && p.length > 2 && p[0] === '/') {
                            send({ev: "open", path: p}); ncap++;
                        }
                    } catch (e) {}
                }
            });
        }

        // ★ Battery conditional dispatch hook (0xb000c: tst w8,#1)
        // 이 지점에서 w8 = "감지됨"(1) or "클린"(0)
        try {
            Interceptor.attach(base.add(0xb000c), {
                onEnter: function () {
                    if (!armed || ncap > 500) return;
                    var w8 = this.context.w8 || 0;
                    var fn = "unknown";
                    // Try to get the function that was called (x8 from aff98 context)
                    send({ev: "DISPATCH", w8: w8, detected: (w8 & 1) === 0, idx: results.length});
                    ncap++;
                }
            });
        } catch (e) { send({ev: "dispatch-err", err: "" + e}); }

        // ★ Battery ret hook (0xb0420: detected path → stack cleanup → ret)
        try {
            Interceptor.attach(base.add(0xb0420), {
                onEnter: function () {
                    if (!armed) return;
                    send({ev: "BATTERY_RET_DETECTED"});
                }
            });
        } catch (e) {}
        // ★ Battery continue hook (0xb0450: clean path → memset → continue)
        try {
            Interceptor.attach(base.add(0xb0450), {
                onEnter: function () {
                    if (!armed || ncap > 500) return;
                    send({ev: "BATTERY_CONTINUE"});
                    ncap++;
                }
            });
        } catch (e) {}

        // afed8 census
        try {
            Interceptor.attach(base.add(0xafed8), {
                onEnter: function (a) {
                    var id = a[0].toInt32();
                    send({ev: "afed8", id: id});
                    if (id === 4 && !armed) {
                        armed = true;
                        send({ev: "★BATTERY_ARMED"});
                    }
                }
            });
        } catch (e) {}

        send({ev: "ready"});
    }, 100);
});
