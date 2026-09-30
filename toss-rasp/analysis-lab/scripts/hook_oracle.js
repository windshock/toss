// §117c — decoder ORACLE: once the hidden DEX is loaded, directly call
// o.getBooleanFromAdObject.a(i,n,c,Object[]) for all known tuples of this
// class (run6/7 live set) and read the decrypted names. Also sample the
// native primitives getPageByNodeId.c(int) and s5a$...b(long,long,long,int)
// for offline algorithm recovery. Survival set only (no kill needed).
var done = false;
Java.perform(function () {
    try { Java.use("java.lang.System").exit.implementation = function (c) { send({ev: "exit-blocked", code: c}); }; } catch (e) {}
    try { Java.use("java.lang.Runtime").exit.implementation = function (c) { send({ev: "exit-blocked", code: c}); }; } catch (e) {}
    var natTimer = setInterval(function () {
        var base = null;
        try { base = Module.findBaseAddress("libea56.so"); } catch (e) {}
        if (!base) return;
        clearInterval(natTimer);
        try {
            Interceptor.replace(base.add(0x95224), new NativeCallback(function () {
                send({ev: "self-destruct-blocked"}); return 0;
            }, "int", []));
        } catch (e) {}
    }, 100);
    var tries = 0;
    var timer = setInterval(function () {
        if (tries > 3000 || done) { clearInterval(timer); return; }
        tries++;
        Java.perform(function () {
            if (done) return;
            Java.enumerateClassLoaders({
                onMatch: function (loader) {
                    if (done) return;
                    try {
                        var fac = Java.ClassFactory.get(loader);
                        var G = fac.use("o.getBooleanFromAdObject");
                        done = true;
                        clearInterval(timer);
                        send({ev: "oracle-start"});
                        var tuples = [[9,22,0],[31,15,12332],[90,16,0],[106,16,57845],
                                      [1169,108,0],[46,26,11928],[72,18,20191],
                                      [466,126,65138],[592,92,0],[684,93,0],
                                      [818,113,56955],[931,107,0]];
                        // sanity oracle on the 4 known pairs first
                        for (var ti = 0; ti < tuples.length; ti++) {
                            try {
                                var t = tuples[ti];
                                var arr = Java.array("java.lang.Object", [null]);
                                G.a(t[0], t[1], String.fromCharCode(t[2]), arr);
                                var s = null;
                                try { s = "" + arr[0]; } catch (e) { s = "<readerr>"; }
                                send({ev: "dec", i: t[0], n: t[1], c: t[2], s: s});
                            } catch (e) { send({ev: "dec-err", t: tuples[ti], err: ("" + e).slice(0, 100)}); }
                        }
                        // primitive probes: c(int)
                        try {
                            var P = fac.use("o.getPageByNodeId");
                            var probes = [];
                            for (var i = 0; i <= 4096; i += 64) probes.push([i, "" + P.c(i)]);
                            send({ev: "cprobe", n: probes.length, d: probes.slice(0, 24)});
                        } catch (e) { send({ev: "c-err", err: ("" + e).slice(0, 80)}); }
                        // primitive probes: b(long,long,long,int)
                        try {
                            var S = fac.use("o.s5a");
                            var onn = S.onExtraCallbackWithResult.value;  // static field holder?
                        } catch (e) {}
                        try {
                            // b is declared on s5a$onExtraCallbackWithResult (inner class)
                            var SIC = fac.use("o.s5a$onExtraCallbackWithResult");
                            var R = -3122170889257122399;
                            var bs = [];
                            for (var k = 0; k < 24; k++) {
                                var j = (0x1234 + k * 257) & 0xFFFF;
                                bs.push([j, k, "" + SIC.b(j, k, R, 0)]);
                            }
                            send({ev: "bprobe", d: bs});
                        } catch (e) { send({ev: "b-err", err: ("" + e).slice(0, 120)}); }
                        send({ev: "oracle-done"});
                    } catch (e) { /* not this loader */ }
                },
                onComplete: function () {}
            });
        });
    }, 20);
});
