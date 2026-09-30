// 42차 teleo_spoof.js — TelephonyManager 전 표면 한국 실기기값 스푸프 + exit 트랩
// + logstore 판정 캡처. [EMULATOR] 판정이 사라지면 트리거 확정.
'use strict';
var FAKE = {
    deviceId: "356941058192736",        // 삼성성 TAC 356941 + Luhn
    imei: "356941058192736",
    imeiSv: "54",
    meid: "A1000064B1E3C2",
    line1: "+821012345678",
    simSerial: "8982100123456789012",    // 89(telecom) 82(kr)
    subscriberId: "450050123456789",     // SKT MCC450 MNC05
    simCountry: "kr",
    networkCountry: "kr",
    operator: "SKT",
    operatorNum: "45005",
};
function stackStr(n) {
    try {
        var st = Java.use("java.lang.Exception").$new().getStackTrace();
        var out = [];
        for (var i = 0; i < st.length && i < (n || 12); i++) out.push("    at " + st[i].toString());
        return out.join("\n");
    } catch (e) { return "?"; }
}
function fakeRet(cn, mn, val, wantLog) {
    try {
        var C = Java.use(cn);
        C[mn].overloads.forEach(function (ov) {
            ov.implementation = function () {
                if (wantLog) send("[TELEO] " + cn.split(".").pop() + "." + mn + " 원본→위장 " + val + "\n" + stackStr(6));
                return val;
            };
        });
        send("[+] " + mn + " → " + val);
    } catch (e) { send("[skip] " + mn + ": " + e); }
}
Java.perform(function () {
    // exit 트랩
    try {
        Java.use("java.lang.System").exit.implementation = function (c) { send("[EXIT] System.exit(" + c + ")\n" + stackStr(20)); return; };
        Java.use("java.lang.Runtime").exit.overload("int").implementation = function (c) { send("[EXIT] Runtime.exit(" + c + ")\n" + stackStr(20)); return; };
        send("[+] exit traps armed");
    } catch (e) {}

    var T = "android.telephony.TelephonyManager";
    fakeRet(T, "getDeviceId", FAKE.deviceId, true);
    fakeRet(T, "getImei", FAKE.imei, true);
    fakeRet(T, "getMeid", FAKE.meid, false);
    fakeRet(T, "getLine1Number", FAKE.line1, true);
    fakeRet(T, "getSimSerialNumber", FAKE.simSerial, true);
    fakeRet(T, "getSubscriberId", FAKE.subscriberId, true);
    fakeRet(T, "getSimCountryIso", FAKE.simCountry, false);
    fakeRet(T, "getNetworkCountryIso", FAKE.networkCountry, false);
    fakeRet(T, "getSimOperatorName", FAKE.operator, false);
    fakeRet(T, "getNetworkOperatorName", FAKE.operator, false);
    fakeRet(T, "getSimOperator", FAKE.operatorNum, false);
    fakeRet(T, "getNetworkOperator", FAKE.operatorNum, false);

    // logstore 폴링 캡처 (39차 확립 패턴)
    var seenLogs = {};
    var readFile = function (p) {
        try {
            var FIS = Java.use("java.io.FileInputStream");
            var fis = FIS.$new(p);
            var BA = Java.use("java.io.ByteArrayOutputStream");
            var baos = BA.$new();
            var buf = Java.array("byte", new Array(4096).fill(0));
            var n;
            while ((n = fis.read(buf)) > 0) baos.write(buf, 0, n);
            fis.close();
            send("[LOGJSON] " + baos.toString("UTF-8"));
        } catch (e) {}
    };
    setInterval(function () {
        try {
            var F = Java.use("java.io.File");
            var dir = F.$new("/data/data/viva.republica.toss/files/logstore/logitems");
            var list = dir.listFiles();
            if (list) for (var i = 0; i < list.length; i++) {
                var nm = String(list[i].getName());
                if (!seenLogs[nm]) { seenLogs[nm] = true; readFile("/data/data/viva.republica.toss/files/logstore/logitems/" + nm); }
            }
        } catch (e) {}
    }, 250);
    send("[+] teleo spoof + logstore capture armed");
});
