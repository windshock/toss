// probe_health2.js — 24차: 무력화 양상 구분용 이중 채널 프로브.
// 22차 probe_health는 파일 마킹만 있어 "콜백 무발화 vs 파일차단"을 구분 못 했다.
// 이번은 콜백마다 send(채널A) + 파일 마킹(채널B)을 동시에 시도:
//   send만 옴  = 콜백 생존, 파일 I/O 차단
//   둘 다 없음 = 콜백 자체 무력화(트램폴린/스케줄러)
'use strict';

var DIRP = "/data/data/viva.republica.toss/";
var counts = { openat: 0, java: 0, exit: 0, file_ok: 0, file_err: 0 };
function mark(name, extra) {
    try {
        var f = new File(DIRP + name, "w");
        f.write("" + Date.now() + " " + (extra || "") + "\n");
        f.close();
        counts.file_ok++;
        send("[mark-ok] " + name);
    } catch (e) {
        counts.file_err++;
        send("[mark-fail] " + name + ": " + e);
    }
}
mark(".probe2_load");
send("[+] probe2 armed (load)");

Interceptor.attach(Module.getExportByName("libc.so", "openat"), {
    onEnter: function () {
        if (counts.openat === 0) {
            counts.openat++;
            send("[cb] openat first hit");
            mark(".probe2_openat");
        } else if (counts.openat < 5) {
            counts.openat++;
        }
    }
});

Java.perform(function () {
    counts.java++;
    send("[cb] Java.perform entered");
    mark(".probe2_java");
    try {
        var Sys = Java.use("java.lang.System");
        Sys.exit.implementation = function (code) {
            counts.exit++;
            send("[cb] System.exit(" + code + ")");
            mark(".probe2_sysexit", "code=" + code);
            return this.exit(code);
        };
        send("[cb] System.exit hook armed");
    } catch (e) { send("[cb] java hook fail: " + e); }
});
send("[+] probe2 init done");
