// §139-E1 — redroid 클린화(스푸핑) + ftrace 정렬 마커 syscall
// hook_spoof_battery.js 기반:
//  1) __system_property_get 스푸핑(§138 목록 그대로)
//  2) afed8 id 센서스
//  3) ★ ftrace 타임라인 정렬용 마커: 배터리 진입/종료 시 openat 마커 파일 생성
//     (마커 = sys_enter의 openat+close 쌍 → 트레이스에서 즉시 식별)
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
var ncap = 0;
var afed8_ids = {};

// --- ftrace 정렬 마커 (openat = 트레이스에 남는 사실) ---
var _open = null, _close = null;
function marker(tag) {
    try {
        if (!_open) {
            _open = new NativeFunction(Module.getExportByName("libc.so", "open"), "int", ["pointer", "int", "int"]);
            _close = new NativeFunction(Module.getExportByName("libc.so", "close"), "int", ["int"]);
        }
        var p = Memory.allocUtf8String("/data/local/tmp/__m_" + tag);
        var fd = _open(p, 0x241, 0x1a4); // O_WRONLY|O_CREAT|O_TRUNC, 0644
        if (fd >= 0) _close(fd);
    } catch (e) {}
}

Java.perform(function () {
    try { Java.use("java.lang.System").exit.implementation = function (c) { marker("exitblk"); send({ev: "exit-blocked", code: c}); }; } catch (e) {}
    try { Java.use("java.lang.Runtime").exit.implementation = function (c) { marker("exitblk"); send({ev: "exit-blocked", code: c}); }; } catch (e) {}
    var natTimer = setInterval(function () {
        var base = null;
        try { base = Module.findBaseAddress("libea56.so"); } catch (e) {}
        if (!base) return;
        clearInterval(natTimer);
        send({ev: "base", b: "" + base});

        var propGet = Module.findExportByName("libc.so", "__system_property_get");
        if (propGet) {
            Interceptor.attach(propGet, {
                onEnter: function (a) { this.nm = a[0].readCString(); this.buf = a[1]; },
                onLeave: function (r) {
                    if (this.nm in SPOOF) {
                        this.buf.writeUtf8String(SPOOF[this.nm]);
                        if (armed && ncap < 400) { send({ev: "pg", name: this.nm, v: SPOOF[this.nm]}); ncap++; }
                        return SPOOF[this.nm].length + 1;
                    }
                    if (armed && ncap < 400) {
                        var val = "";
                        try { val = this.buf.readCString() || ""; } catch (e) {}
                        send({ev: "pg", name: this.nm, val: val.substring(0, 50)});
                        ncap++;
                    }
                }
            });
        }

        // afed8 센서스 — id별 카운트 + 배터리(4) 진입/복귀 마커
        try {
            Interceptor.attach(base.add(0xafed8), {
                onEnter: function (a) {
                    var id = a[0].toInt32();
                    afed8_ids[id] = (afed8_ids[id] || 0) + 1;
                    if (id === 4 && !armed) {
                        armed = true;
                        marker("batstart");
                        send({ev: "★BATTERY_ARMED"});
                    }
                }
            });
        } catch (e) { send({ev: "afed8-err", err: "" + e}); }

        send({ev: "ready"});
    }, 100);

    // 프로세스 끝(블록된 exit 이후 등) 주기 요약
    setTimeout(function () {
        send({ev: "census", afed8: afed8_ids, armed: armed});
    }, 25000);
});
