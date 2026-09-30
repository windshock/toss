// §135 — 16k battery loop runtime trace: capture every API call inside
// afed8(4)→0x95224 with arguments and return values.
// Method: hook aff98 (the blr x8 site) → capture x8 (target fn) and 
// onLeave x23 (return). Also hook the GOT API functions directly to get
// their human-readable arguments (property names, paths, etc).
var battery_armed = false;
var api_calls = [];
var got_names = {};
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

        // Build a reverse map of libc function addresses → names
        var libc = Process.findModuleByName("libc.so");
        if (libc) {
            var exports = libc.enumerateExports();
            for (var i = 0; i < exports.length; i++) {
                got_names[exports[i].address.toString()] = exports[i].name;
            }
        }
        // Also libea56 internal functions
        var libea56_exports = Process.findModuleByName("libea56.so").enumerateExports();
        for (var i = 0; i < libea56_exports.length; i++) {
            got_names[libea56_exports[i].address.toString()] = "libea56:" + libea56_exports[i].name;
        }

        // Hook the property APIs globally with name capture
        var hookPropGet = Module.findExportByName("libc.so", "__system_property_get");
        if (hookPropGet) {
            Interceptor.attach(hookPropGet, {
                onEnter: function (a) { this.nm = a[0].readCString(); this.buf = a[1]; },
                onLeave: function (r) {
                    if (!battery_armed || ncap > 500) return;
                    var val = "";
                    try { val = this.buf.readCString() || ""; } catch (e) {}
                    send({ev: "pg", name: this.nm, val: val.substring(0, 60), ret: r.toInt32()});
                    ncap++;
                }
            });
        }
        var hookPropFind = Module.findExportByName("libc.so", "__system_property_find");
        if (hookPropFind) {
            Interceptor.attach(hookPropFind, {
                onEnter: function (a) { this.nm = a[0].readCString(); },
                onLeave: function (r) {
                    if (!battery_armed || ncap > 500) return;
                    send({ev: "pf", name: this.nm, found: !r.isNull()});
                    ncap++;
                }
            });
        }
        // opendir
        var hookOpendir = Module.findExportByName("libc.so", "opendir");
        if (hookOpendir) {
            Interceptor.attach(hookOpendir, {
                onEnter: function (a) {
                    if (!battery_armed || ncap > 500) return;
                    var p = "";
                    try { p = a[0].readCString() || ""; } catch (e) {}
                    send({ev: " opendir", path: p});
                    ncap++;
                }
            });
        }
        // open (for file checks)
        var hookOpen = Module.findExportByName("libc.so", "openat");
        if (hookOpen) {
            Interceptor.attach(hookOpen, {
                onEnter: function (a) {
                    if (!battery_armed || ncap > 500) return;
                    var p = "";
                    try { p = a[1].readCString() || ""; } catch (e) {}
                    if (p.length > 2 && p[0] === '/') {
                        send({ev: "open", path: p});
                        ncap++;
                    }
                }
            });
        }
        // dl_iterate_phdr
        var hookDlIter = Module.findExportByName("libc.so", "dl_iterate_phdr");
        if (hookDlIter) {
            Interceptor.attach(hookDlIter, {
                onEnter: function (a) {
                    if (!battery_armed || ncap > 500) return;
                    send({ev: "dl_iterate_phdr"});
                    ncap++;
                }
            });
        }

        // ★ Hook the battery call site (0xaff98: ldr x8,[x8]; blr x8)
        try {
            Interceptor.attach(base.add(0xaff98), {
                onEnter: function () {
                    this.tgt = this.context.x8;
                },
                onLeave: function () {
                    if (ncap > 600) return;
                    var fn = this.tgt.toString();
                    var name = got_names[fn] || ("?" + fn.substring(fn.length - 8));
                    var ret = this.context.x23.toInt32();
                    api_calls.push({fn: name, ret: ret});
                    // Only send interesting ones (non-zero return or first few)
                    if (api_calls.length <= 20 || ret !== 0) {
                        send({ev: "bcall", fn: name, ret: ret, idx: api_calls.length});
                    }
                    ncap++;
                }
            });
            send({ev: "battery-hook-up"});
        } catch (e) { send({ev: "battery-err", err: "" + e}); }

        // Arm at afed8(4) entry
        try {
            Interceptor.attach(base.add(0xafed8), {
                onEnter: function (a) {
                    var id = a[0].toInt32();
                    send({ev: "afed8", id: id});
                    if (id === 4 && !battery_armed) {
                        battery_armed = true;
                        send({ev: "BATTERY_ARMED"});
                    }
                }
            });
        } catch (e) {}

        // Periodic flush
        var rep = setInterval(function () {
            if (api_calls.length > 0) {
                send({ev: "stats", total: api_calls.length,
                     nonzero: api_calls.filter(function(c) { return c.ret !== 0; }).length});
            }
        }, 2000);
        send({ev: "ready"});
    }, 100);
});
