// §143-E3 — 가드 서브체크 반환값(w0) 캡처
// §139에서 발견했으나 훅한 적 없는 함수군의 onLeave 반환값/버퍼를 배터리 윈도우에 기록.
// 관측 대상: readlinkat(fd 워크 결과), getsockopt, fgetxattr, uname, sysconf,
//   dlsym(가드가 런타임 심볼 결정), dl_iterate_phdr, glGetString/eglQueryString(GL 문자열),
//   syscall(raw 경유), process_vm_readv, __system_property_foreach/find_nth.
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
var armed = false, ncap = 0, CAP = 2500;
function send2(o) { if (ncap < CAP) { send(o); ncap++; } }
function cs(p, n) { try { return p.readCString(n || 120) || ""; } catch (e) { return ""; } }

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

function hookLeave(name, fn) {
    var a = Module.findExportByName("libc.so", name);
    if (!a) { send2({ev: "noexport", fn: name}); return; }
    Interceptor.attach(a, { onEnter: fn.enter || function (a) {}, onLeave: fn.leave || function (r) {} });
}

Java.perform(function () {
    try { Java.use("java.lang.System").exit.implementation = function (c) { marker("exitblk"); send2({ev: "exit-blocked", code: c}); }; } catch (e) {}
    var natTimer = setInterval(function () {
        var base = null;
        try { base = Module.findBaseAddress("libea56.so"); } catch (e) {}
        if (!base) return;
        clearInterval(natTimer);
        send2({ev: "base", b: "" + base});

        // ── 프로퍼티 스푸핑 (§138 목록) ──
        hookLeave("__system_property_get", {
            enter: function (a) { this.nm = cs(a[0]); this.buf = a[1]; },
            leave: function (r) {
                if (this.nm in SPOOF) { this.buf.writeUtf8String(SPOOF[this.nm]); return SPOOF[this.nm].length + 1; }
            }
        });
        // ── 배터리 마커: afed8(4) ──
        try {
            Interceptor.attach(base.add(0xafed8), {
                onEnter: function (a) {
                    var id = a[0].toInt32();
                    if (id === 4 && !armed) { armed = true; marker("batstart"); send2({ev: "★BATTERY_ARMED"}); }
                }
            });
        } catch (e) { send2({ev: "afed8-err", err: "" + e}); }

        // ── §139 미훅 함수군: 반환값/버퍼 캡처 ──
        hookLeave("readlinkat", {
            enter: function (a) { this.p = cs(a[1]); this.buf = a[2]; },
            leave: function (r) {
                if (!armed) return;
                send2({ev: "readlinkat", path: this.p, ret: r.toInt32(), target: this.buf && r.toInt32() > 0 ? cs(this.buf, r.toInt32()) : ""});
            }
        });
        hookLeave("getsockopt", {
            enter: function (a) { this.fd = a[0].toInt32(); this.lv = a[1].toInt32(); this.op = a[2].toInt32(); },
            leave: function (r) { if (armed) send2({ev: "getsockopt", fd: this.fd, lv: this.lv, op: this.op, ret: r.toInt32()}); }
        });
        hookLeave("fgetxattr", {
            enter: function (a) { this.fd = a[0].toInt32(); },
            leave: function (r) { if (armed) send2({ev: "fgetxattr", fd: this.fd, ret: r.toInt32() }); }
        });
        hookLeave("getdents64", {
            leave: function (r) { if (armed) send2({ev: "getdents64", ret: r.toInt32()}); }
        });
        hookLeave("uname", {
            leave: function (r) {
                if (!armed) return;
                // new_utsname: sysname[65] nodename[65] release@130 version@195 machine@260 도메인@325
                var p = this.ctx.x0;
                try {
                    send2({ev: "uname", release: cs(p.add(130), 40), version: cs(p.add(195), 60), machine: cs(p.add(260), 30), domain: cs(p.add(325), 40)});
                } catch (e) { send2({ev: "uname", err: "" + e}); }
            },
            enter: function (a) { this.ctx = {x0: a[0]}; }
        });
        hookLeave("sysconf", {
            enter: function (a) { this.n = a[0].toInt32(); },
            leave: function (r) { if (armed) send2({ev: "sysconf", name: this.n, ret: r.toInt32()}); }
        });
        hookLeave("syscall", {
            enter: function (a) { this.nr = a[0].toInt32(); this.a1 = a[1].toInt32(); },
            leave: function (r) { if (armed && this.nr !== 98 && this.nr !== 222 && this.nr !== 63 && this.nr !== 64) send2({ev: "syscall", nr: this.nr, a1: this.a1, ret: r.toInt32()}); }
        });
        hookLeave("process_vm_readv", {
            enter: function (a) { this.pid = a[0].toInt32(); },
            leave: function (r) { if (armed) send2({ev: "pvmreadv", pid: this.pid, ret: r.toInt32()}); }
        });
        hookLeave("dl_iterate_phdr", {
            leave: function (r) { if (armed) send2({ev: "dl_iterate_phdr", ret: r.toInt32()}); }
        });
        hookLeave("dlsym", {
            enter: function (a) { this.s = cs(a[1], 80); },
            leave: function (r) { if (armed) send2({ev: "dlsym", sym: this.s, ret: r.toString()}); }
        });
        hookLeave("getppid", { leave: function (r) { if (armed) send2({ev: "getppid", ret: r.toInt32() }); } });

        // ── GL 문자열 쿼리 (guest GL 라이브러리들에서 동적 탐색) ──
        var glMods = ["libGLESv2_adreno.so", "libGLESv2_angle.so", "libGLESv2_emulation.so",
                      "libGLESv2_enc.so", "libEGL_adreno.so", "libEGL_emulation.so", "libEGL.so"];
        glMods.forEach(function (mn) {
            var m = Process.findModuleByName(mn);
            if (!m) return;
            [["glGetString", 1], ["glGetStringi", 2], ["eglQueryString", 2]].forEach(function (pair) {
                var fnName = pair[0];
                var addr = null;
                try { addr = Module.findExportByName(mn, fnName); } catch (e) {}
                if (!addr) return;
                Interceptor.attach(addr, {
                    enter: function (a) { this.nm = a[0].toInt32(); this.idx = pair[1] > 1 ? a[1].toInt32() : -1; },
                    leave: function (r) {
                        if (r.isNull()) { send2({ev: "glstr", mod: mn, fn: fnName, name: this.nm, val: "(null)"}); return; }
                        var v = "";
                        try { v = cs(r, 400); } catch (e) {}
                        send2({ev: "glstr", mod: mn, fn: fnName, name: this.nm, idx: this.idx, val: v.substring(0, 380)});
                    }
                });
                send2({ev: "glhook", mod: mn, fn: fnName});
            });
        });

        send2({ev: "ready"});
    }, 100);
});
