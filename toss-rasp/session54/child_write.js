// 54차 child_write.js — 가드 fork 자식의 write(fd=1) 캡처: 부모 보고 프로토콜 직독.
'use strict';
send("[cw] child_write loaded pid=" + Process.id);
var libc = Module.findExportByName(null, "write");
Interceptor.attach(libc, {
    onEnter: function (args) {
        var fd = args[0].toInt32();
        if (fd !== 1) return;
        var n = args[2].toInt32();
        if (n <= 0) return;
        var len = Math.min(n, 1024);
        try {
            var bytes = Memory.readByteArray(args[1], len);
            // 텍스트화 (프로토콜이 바이너리일 수 있어 hex도 병행)
            var s = "";
            var u8 = new Uint8Array(bytes);
            for (var i = 0; i < u8.length; i++) {
                var c = u8[i];
                s += (c >= 0x20 && c < 0x7f) ? String.fromCharCode(c) : (c === 0x0a ? "\\n" : ".");
            }
            send("[CW fd1 n=" + n + "] " + s);
            if (n > 1024) send("[CW ...truncated " + (n - 1024) + "B]");
        } catch (e) {}
    }
});
send("[cw] write hook armed");
