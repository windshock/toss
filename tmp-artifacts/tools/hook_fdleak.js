// hook_fdleak.js — 가드 fd 스윕의 readlinkat 결과 캡처 (§17차 누출 경로의 현재 재검)
// 최소 훅(§143 법칙): readlinkat만. fake 노출(.pl728v/.wq517h 등) 관찰이 목적.
'use strict';
var n = 0, CAP = 800;
function send2(o) { if (n < CAP) { send(o); n++; } }

Java.perform(function () {
    var RL = Module.findExportByName("libc.so", "readlinkat");
    if (RL) {
        Interceptor.attach(RL, {
            onEnter: function (args) {
                this.buf = args[2];
                try { this.path = args[1].readCString(160) || ""; } catch (e) { this.path = "?"; }
            },
            onLeave: function (r) {
                var len = r.toInt32();
                var target = len > 0 ? (function(){ try { return this.buf.readCString(len) || ""; } catch(e){ return ""; } }).call(this) : "";
                if (target.indexOf("/dev/.") === 0 || target.indexOf("/dev/") === 0 ||
                    this.path.indexOf("/proc/self/fd") === 0) {
                    send2({ ev: "readlinkat", req: this.path, tgt: target });
                } else if (this.path.indexOf("/proc/") === 0) {
                    send2({ ev: "readlinkat_proc", req: this.path, tgt: target });
                }
            }
        });
        send("[+] readlinkat observer armed");
    } else send("[!] readlinkat not found");
});
