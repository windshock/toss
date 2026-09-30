// probe_health.js — 22차: 토스 내 frida 계층별 생존 진단.
// send 채널이 조기 단절되는지, 훅 자체가 무력화되는지 분리하기 위해
// 부수효과(앱 데이터 디렉토리 파일 생성)로 마킹한다. 런 후 루트로 파일 확인:
//   .probe_load    — 스크립트 로드 도달(기본)
//   .probe_openat  — native Interceptor(openat) 콜백 발화 여부
//   .probe_java    — Java VM 진입 + 오버라이드 장착 도달 여부
//   .probe_exit    — System.exit 오버라이드 콜백 발화(=Java 훅 살아있음)
//   .probe_hit     — 시그널 핸들러 attach 콜백 발화
'use strict';

var DIRP = "/data/data/viva.republica.toss/";
function mark(name, extra) {
    try {
        var f = new File(DIRP + name, "w");
        f.write("" + Date.now() + " " + (extra || "") + "\n");
        f.close();
    } catch (e) { }
}
function modOf(addr) {
    var m = Process.findModuleByAddress(addr);
    return m ? (m.name + "+0x" + addr.sub(m.base).toString(16)) : ("anon/" + addr);
}
function queryHandler() {
    var old = Memory.alloc(256);
    var sys = new NativeFunction(Module.getExportByName("libc.so", "syscall"),
        "long", ["long", "long", "pointer", "pointer", "long"]);
    var r = sys(134, 11, NULL, old, 8);
    var rc = (r && r.toInt32) ? r.toInt32() : Number(r);
    return rc === 0 ? old.readPointer() : null;
}

mark(".probe_load");

// 1) native 계층: openat 부트스트랩
Interceptor.attach(Module.getExportByName("libc.so", "openat"), {
    onEnter: function (a) {
        mark(".probe_openat");
        // 핸들러 등록 순간 attach
        var h = queryHandler();
        if (h && !h.isNull() && h.toString() !== "0x1" && !this.armed) {
            this.armed = true;
            mark(".probe_arm", modOf(h));
            var hs = h.toString();
            Interceptor.attach(h, {
                onEnter: function (args) {
                    mark(".probe_hit");
                    try {
                        var si = args[1], uc = args[2];
                        mark(".probe_hit_detail",
                            "si_addr=0x" + si.add(0x10).readPointer().toString(16) +
                            " pc=" + modOf(uc.add(0x28).add(0x108).readPointer()));
                    } catch (e) { }
                }
            });
        }
    }
});

// 2) Java 계층: System.exit 오버라이드
Java.perform(function () {
    mark(".probe_java");
    try {
        var Sys = Java.use("java.lang.System");
        Sys.exit.implementation = function (code) {
            mark(".probe_exit", "code=" + code);
            return this.exit(code);
        };
    } catch (e) { mark(".probe_java_err", "" + e); }
});

send("[+] probe_health armed");
