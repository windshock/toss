// 41차 dump_classes.js — DexGuard 런타임 복호화 클래스 덤프:
// ① JNIEnv DefineClass(네이티브 직접 정의) ② InMemoryDexClassLoader(메모리 dex)
// + exit 트랩(지탱). 덤프 → /data/local/tmp/ddump/
'use strict';
var DIR = "/data/local/tmp/ddump/";
try { var d = new File(DIR + ".init", "w"); d.write("x"); d.close(); } catch (e) {
    send("[!] ddump 디렉터리 필요: adb shell su 0 mkdir -p /data/local/tmp/ddump");
}
function stackStr(n) {
    try {
        var st = Java.use("java.lang.Exception").$new().getStackTrace();
        var out = [];
        for (var i = 0; i < st.length && i < (n || 15); i++) out.push("    at " + st[i].toString());
        return out.join("\n");
    } catch (e) { return "?"; }
}
send("[+] dump_classes loaded");

// ── ① JNIEnv DefineClass (테이블 인덱스 5) ──────────────────
try {
    var env = Java.vm.getEnv();
    var table = Memory.readPointer(env.handle);
    var idx = 5 * Process.pointerSize;
    var fnDefine = table.add(idx).readPointer();
    var m = Process.findModuleByAddress(fnDefine);
    send("[DC] DefineClass @ " + fnDefine + (m ? " (" + m.name + ")" : ""));
    Interceptor.attach(fnDefine, {
        onEnter: function (args) {
            try {
                var name = Memory.readCString(args[1]);
                var len = args[4].toInt32();
                if (len <= 0 || len > 8 * 1024 * 1024) return;
                var path = DIR + "dc_" + name.replace(/[^A-Za-z0-9]/g, "_") + ".class";
                var f = new File(path, "wb");
                f.write(Memory.readByteArray(args[3], len));
                f.close();
                send("[DC] DefineClass name=" + name + " len=" + len + " → " + path);
            } catch (e) { send("[DC err] " + e); }
        }
    });
    send("[+] DefineClass hooked");
} catch (e) { send("[DC hook fail] " + e); }

Java.perform(function () {
    // ── exit 트랩 ──
    try {
        var Sys = Java.use("java.lang.System");
        Sys.exit.implementation = function (c) { send("[EXIT] System.exit(" + c + ")\n" + stackStr(25)); return; };
        var Rt = Java.use("java.lang.Runtime");
        Rt.exit.overload("int").implementation = function (c) { send("[EXIT] Runtime.exit(" + c + ")\n" + stackStr(25)); return; };
        send("[+] exit traps armed");
    } catch (e) {}

    // ── ② InMemoryDexClassLoader: ByteBuffer dex 내용 덤프 ──
    try {
        var IMCL = Java.use("dalvik.system.InMemoryDexClassLoader");
        IMCL.$init.overloads.forEach(function (ov) {
            ov.implementation = function () {
                send("[IMCL] init args=" + arguments.length + "\n" + stackStr(12));
                for (var q = 0; q < arguments.length; q++) {
                    try {
                        var aq = arguments[q];
                        if (aq === null || aq === undefined) continue;
                        var cn = Java.cast(aq, Java.use("java.lang.Object")).getClass().getName();
                        send("[IMCL] arg" + q + " = " + cn);
                        // ByteBuffer 단일
                        var BB = Java.use("java.nio.ByteBuffer");
                        try {
                            var bb = Java.cast(aq, BB);
                            var dup = bb.duplicate();
                            var n = dup.remaining();
                            var arr = Java.array("byte", new Array(n).fill(0));
                            dup.get(arr);
                            var path = DIR + "imcl_" + Date.now() + "_" + q + ".dex";
                            var FOS = Java.use("java.io.FileOutputStream");
                            var fos = FOS.$new(path);
                            fos.write(arr); fos.close();
                            send("[IMCL] ★ dex dumped len=" + n + " → " + path);
                            continue;
                        } catch (e2) {}
                        // 배열 of ByteBuffer
                        try {
                            var AL = Java.use("java.util.ArrayList");
                            var sz = aq.length !== undefined ? aq.length : -1;
                        } catch (e3) {}
                    } catch (e4) { send("[IMCL arg err] " + e4); }
                }
                return ov.apply(this, arguments);
            };
        });
        send("[+] InMemoryDexClassLoader hooked");
    } catch (e) { send("[IMCL fail] " + e); }

    // ── ③ DexFile.openInMemoryDexFiles(리플렉션 경로) 감시 ──
    try {
        var DF = Java.use("dalvik.system.DexFile");
        DF.$init.overloads.forEach(function (ov) {
            ov.implementation = function () {
                send("[DEXFILE] init\n" + stackStr(8));
                return ov.apply(this, arguments);
            };
        });
    } catch (e) {}
});
