// S125 Task A v4 — hook ALL 6 "blr; cmp w0,#0" sub-check sites + loop presence.
var SITES = [[0x3d954,"x8"],[0x4739c,"x8"],[0xa01fc,"x8"],[0xcb2b0,"x8"],[0x3e3e4,"x9"],[0xc2700,"x9"]];
var counts = {};
Java.perform(function () {
    try { Java.use("java.lang.System").exit.implementation = function (c) { send({ev: "exit-blocked", code: c}); }; } catch (e) {}
    try { Java.use("java.lang.Runtime").exit.implementation = function (c) { send({ev: "exit-blocked", code: c}); }; } catch (e) {}
    var natTimer = setInterval(function () {
        var base = null;
        try { base = Module.findBaseAddress("libea56.so"); } catch (e) {}
        if (!base) return;
        clearInterval(natTimer);
        send({ev: "base", b: "" + base});
        SITES.forEach(function (s) {
            try {
                Interceptor.attach(base.add(s[0]), {
                    onEnter: function () {
                        this.fn = this.context["x" === s[1][0] ? s[1] : s[1]].sub(base);
                    },
                    onLeave: function (r) {
                        var k = s[0].toString(16);
                        counts[k] = counts[k] || {n: 0, nz: 0, fns: {}};
                        counts[k].n++;
                        var w0 = r.toInt32();
                        if (w0 !== 0) counts[k].nz++;
                        var fo = this.fn ? this.fn.toString(16) : "?";
                        counts[k].fns[fo + ":" + w0] = (counts[k].fns[fo + ":" + w0] || 0) + 1;
                    }
                });
            } catch (e) {}
        });
        try {
            Interceptor.attach(base.add(0xafed8), {
                onEnter: function (a) { send({ev: "afed8", id: a[0].toInt32()}); }
            });
        } catch (e) {}
        var rep = setInterval(function () { send({ev: "sites", counts: counts}); }, 1500);
    }, 100);
});
