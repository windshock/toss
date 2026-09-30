// §149 — process_vm_readv 완전 해부: 무엇을 읽고 무엇을 찾는가
// 관측 + 선택적 스크럽(A/B) — redroid에서 실행 (frida 관측자 효과 없음)
var SCRUB = false;  // true로 바꾸면 goldfish/ANDROID_EMU를 지움
var mypid = 0;
var ncap = 0, CAP = 500;

Java.perform(function () {
    try { Java.use("java.lang.System").exit.implementation = function (c) { send({ev: "exit-blocked", code: c}); }; } catch (e) {}
    try { Java.use("java.lang.Runtime").exit.implementation = function (c) { send({ev: "exit-blocked", code: c}); }; } catch (e) {}
    var natTimer = setInterval(function () {
        var base = null;
        try { base = Module.findBaseAddress("libea56.so"); } catch (e) {}
        if (!base) return;
        clearInterval(natTimer);
        mypid = Process.id;
        send({ev: "base", b: "" + base, pid: mypid});

        // ── process_vm_readv 후킹 ──
        var pvm = Module.findExportByName("libc.so", "process_vm_readv");
        if (!pvm) { send({ev: "err", m: "no process_vm_readv"}); return; }
        Interceptor.attach(pvm, {
            onEnter: function (a) {
                this.pid = a[0].toInt32();
                this.local_iov = a[1];
                this.liovcnt = a[2].toInt32();
                this.remote_iov = a[3];
                this.riovcnt = a[4].toInt32();
                // local iov의 base/len
                this.lbase = this.local_iov.readPointer();
                this.llen = this.local_iov.add(8).readUSize();
                // remote iov의 base/len
                this.rbase = this.remote_iov.readPointer();
                this.rlen = this.remote_iov.add(8).readUSize();
            },
            onLeave: function (r) {
                var ret = r.toInt32();
                if (ret <= 0 || ncap > CAP) return;
                ncap++;
                // 읽은 데이터에서 에뮬 패턴 검색
                var data = "";
                try { data = this.lbase.readUtf8String(Math.min(ret, 4096)) || ""; } catch (e) {
                    try {
                        var bytes = this.lbase.readByteArray(Math.min(ret, 4096));
                        // 패턴 검색 (바이트 단위)
                        var arr = new Uint8Array(bytes);
                        var s = "";
                        for (var i = 0; i < arr.length && i < 4096; i++) {
                            s += String.fromCharCode(arr[i]);
                        }
                        data = s;
                    } catch (e2) { data = ""; }
                }
                var pats = ["goldfish", "ranchu", "ANDROID_EMU", "emulator", "qemu", "genymotion", "vbox", "bluestacks", "swiftshader"];
                var found = [];
                for (var p = 0; p < pats.length; p++) {
                    if (data.toLowerCase().indexOf(pats[p].toLowerCase()) !== -1) {
                        found.push(pats[p]);
                    }
                }
                // 어떤 메모리 영역인지 파악
                var mod = "?";
                try {
                    var m = Process.findModuleByAddress(ptr(this.rbase.toString()));
                    if (m) mod = m.name;
                } catch (e) {}
                send({
                    ev: "pvm",
                    n: ncap,
                    pid: this.pid,
                    self: this.pid === mypid,
                    rbase: this.rbase.toString(),
                    rlen: this.rlen,
                    ret: ret,
                    module: mod,
                    patterns: found,
                    sample: found.length > 0 ? data.substring(Math.max(0, data.toLowerCase().indexOf(found[0].toLowerCase()) - 30), data.toLowerCase().indexOf(found[0].toLowerCase()) + found[0].length + 30) : ""
                });
                // ★ 스크럽 모드: 패턴 발견 시 해당 바이트를 0으로
                if (SCRUB && found.length > 0) {
                    var arr2 = new Uint8Array(this.lbase.readByteArray(ret));
                    var scrubbed = false;
                    for (var pi = 0; pi < pats.length; pi++) {
                        var pat = pats[pi];
                        var lower = data.toLowerCase();
                        var idx = 0;
                        while ((idx = lower.indexOf(pat.toLowerCase(), idx)) !== -1) {
                            for (var j = 0; j < pat.length; j++) {
                                arr2[idx + j] = 0x78; // 'x'
                            }
                            scrubbed = true;
                            idx += pat.length;
                        }
                    }
                    if (scrubbed) {
                        this.lbase.writeByteArray(arr2.buffer);
                        send({ev: "SCRUBBED", n: ncap, patterns: found});
                    }
                }
            }
        });

        // ── 프로퍼티 스푸핑 (redroid 클린화) ──
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
        var propGet = Module.findExportByName("libc.so", "__system_property_get");
        Interceptor.attach(propGet, {
            onEnter: function (a) { this.nm = a[0].readCString(); this.buf = a[1]; },
            onLeave: function (r) {
                if (this.nm in SPOOF) {
                    this.buf.writeUtf8String(SPOOF[this.nm]);
                    return SPOOF[this.nm].length + 1;
                }
            }
        });
        // uname 스푸핑
        var un = Module.findExportByName("libc.so", "uname");
        Interceptor.attach(un, {
            onEnter: function (a) { this.p = a[0]; },
            onLeave: function (r) {
                this.p.add(0).writeUtf8String("Linux");
                this.p.add(65).writeUtf8String("localhost");
                this.p.add(130).writeUtf8String("5.15.94-android13-8-27358815-g7f65fdd2e339-ab11730911");
                this.p.add(195).writeUtf8String("#1 SMP PREEMPT Thu Jun 12 13:48:44 UTC 2025");
                this.p.add(260).writeUtf8String("aarch64");
                this.p.add(325).writeUtf8String("localdomain");
            }
        });

        send({ev: "ready", scrub: SCRUB});
    }, 100);
});
