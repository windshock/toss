// S130b — capture ALL property/file reads during the R-tick battery.
// Hooks __system_property_get/find at libc level + open/access for files.
// Window: from first afed8(0) until death (id4 poison = battery complete).
var armed = false;
var props = {};
var files = {};
var n = 0;
Java.perform(function () {
    try { Java.use("java.lang.System").exit.implementation = function (c) { send({ev: "exit-blocked", code: c}); }; } catch (e) {}
    try { Java.use("java.lang.Runtime").exit.implementation = function (c) { send({ev: "exit-blocked", code: c}); }; } catch (e) {}
    var natTimer = setInterval(function () {
        var base = null;
        try { base = Module.findBaseAddress("libea56.so"); } catch (e) {}
        if (!base) return;
        clearInterval(natTimer);
        send({ev: "base", b: "" + base});
        var libc = Process.findModuleByName("libc.so");
        if (!libc) { send({ev: "err", m: "no libc"}); return; }

        // hook __system_property_get (the main property read API)
        var propGet = Module.findExportByName("libc.so", "__system_property_get");
        if (propGet) {
            Interceptor.attach(propGet, {
                onEnter: function (a) {
                    this.name = a[0].readCString();
                    this.buf = a[1];
                },
                onLeave: function (r) {
                    if (!armed) return;
                    var val = "";
                    try { val = this.buf.readCString() || ""; } catch (e) {}
                    var key = this.name + "=" + val;
                    if (!props[key]) {
                        props[key] = 1;
                        send({ev: "prop", name: this.name, val: val, ret: r.toInt32()});
                    } else { props[key]++; }
                }
            });
            send({ev: "hooked", fn: "__system_property_get"});
        }
        // hook __system_property_find (for find_nth chain)
        var propFind = Module.findExportByName("libc.so", "__system_property_find");
        if (propFind) {
            Interceptor.attach(propFind, {
                onEnter: function (a) {
                    this.name = a[0].readCString();
                },
                onLeave: function (r) {
                    if (!armed) return;
                    var key = "FIND:" + this.name;
                    if (!props[key]) {
                        props[key] = 1;
                        send({ev: "propfind", name: this.name, found: !r.isNull()});
                    } else { props[key]++; }
                }
            });
        }
        // hook openat for file checks
        var openat = Module.findExportByName("libc.so", "openat");
        if (openat) {
            Interceptor.attach(openat, {
                onEnter: function (a) {
                    if (!armed) return;
                    try {
                        var path = a[1].readCString();
                        if (path && path.length > 2 && path[0] === '/') {
                            if (!files[path]) {
                                files[path] = 1;
                                send({ev: "file", path: path});
                            } else { files[path]++; }
                        }
                    } catch (e) {}
                }
            });
        }
        // hook access() for existence checks
        var accessFn = Module.findExportByName("libc.so", "access");
        if (accessFn) {
            Interceptor.attach(accessFn, {
                onEnter: function (a) {
                    if (!armed) return;
                    try {
                        var path = a[0].readCString();
                        if (path && path.length > 2 && path[0] === '/') {
                            if (!files["A:" + path]) {
                                files["A:" + path] = 1;
                                send({ev: "file", path: path, via: "access"});
                            }
                        }
                    } catch (e) {}
                }
            });
        }
        // hook __system_property_read_callback
        var propReadCb = Module.findExportByName("libc.so", "__system_property_read_callback");
        if (propReadCb) {
            Interceptor.attach(propReadCb, {
                onEnter: function (a) {
                    if (!armed) return;
                    try {
                        // pi (arg0), callback (arg1), cookie (arg2)
                        // callback(name, value, serial)
                        var cb = new NativeFunction(a[1], 'void', ['pointer','pointer','int']);
                        // We can't easily intercept the callback, but we can note the call
                    } catch (e) {}
                }
            });
        }
        // afed8 census to correlate
        try {
            Interceptor.attach(base.add(0xafed8), {
                onEnter: function (a) {
                    var id = a[0].toInt32();
                    send({ev: "afed8", id: id});
                    if (id === 0 && !armed) {
                        armed = true;
                        send({ev: "armed"});
                    }
                }
            });
        } catch (e) {}
        send({ev: "ready"});
    }, 100);
});
