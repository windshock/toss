// npe_fix4 — 26차 말: mBase 사전 교정. rpc.scan()을 호스트가 주기 호출한다.
// Java.choose로 mBase=null인 ContextWrapper를 찾아 유효 context로 교정.
'use strict';
var CW = null, fixed = 0;
Java.perform(function () {
    CW = Java.use("android.content.ContextWrapper");
    // isRestricted 후크(방어막 — Java 경유 호출도 잡기)
    CW.isRestricted.implementation = function () {
        var b = this.mBase.value;
        if (b === null || b === undefined) { send("[HIT-java] mBase=null → false"); return false; }
        return b.isRestricted();
    };
    var Sys = Java.use("java.lang.System");
    Sys.exit.implementation = function (c) { send("[EXIT] System.exit("+c+") B"); return; };
    var Rt = Java.use("java.lang.Runtime");
    Rt.exit.overload("int").implementation = function (c) { send("[EXIT] Runtime.exit("+c+") B"); return; };
    send("[+] armed (isRestricted+exit)");
});
rpc.exports = {
    scan: function () {
        var found = 0, patched = 0, donor = null;
        Java.perform(function () {
            Java.choose("android.content.ContextWrapper", {
                onMatch: function (inst) {
                    try {
                        var b = inst.mBase.value;
                        if (b === null || b === undefined) {
                            found++;
                            if (donor !== null) { try { inst.mBase.value = donor; patched++; send("[FIX] mBase 주입: " + inst.$className); } catch (e) { send("[FIX-err] " + e); } }
                        } else if (donor === null) { donor = b; }
                    } catch (e) {}
                },
                onComplete: function () {}
            });
        });
        return { nullBase: found, patched: patched };
    }
};
