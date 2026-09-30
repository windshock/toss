// §141 — 앱 내부 시점 fd 뷰 검증: LKM dpath 세탁이 앱에게 실제로 보이는가
// 훅 없음(무관측) — 순수 readlinkat 호출만: /proc/self/fd/* 전수 열거
var _readlinkat = new NativeFunction(Module.getExportByName("libc.so", "readlinkat"),
    'int', ['int', 'pointer', 'pointer', 'int']);
var _opendir = new NativeFunction(Module.getExportByName("libc.so", "opendir"), 'pointer', ['pointer']);
var _readdir = new NativeFunction(Module.getExportByName("libc.so", "readdir"), 'pointer', ['pointer']);
var _close = new NativeFunction(Module.getExportByName("libc.so", "close"), 'int', ['int']);

function fdview(tag) {
    var out = [];
    var dirp = _opendir(Memory.allocUtf8String("/proc/self/fd"));
    if (!dirp.isNull()) {
        for (var i = 0; i < 256; i++) {
            var ent = _readdir(dirp);
            if (ent.isNull()) break;
            // struct dirent: d_ino(8) d_off(8) d_reclen(2) d_type(1) d_name(19~)
            var name = ent.add(19).readCString();
            if (!name || name === "." || name === "..") continue;
            var fd = parseInt(name);
            if (isNaN(fd)) continue;
            var buf = Memory.alloc(512);
            var n = _readlinkat(-100, Memory.allocUtf8String("/proc/self/fd/" + name), buf, 511);
            if (n > 0) {
                var t = buf.readCString();
                if (t.indexOf("ashmem") >= 0 || t.indexOf("memfd") >= 0 || t.indexOf("goldfish") >= 0 ||
                    t.indexOf("qemu") >= 0 || t.indexOf("ranchu") >= 0 || t.indexOf("emulation") >= 0 ||
                    t.indexOf("emu") >= 0)
                    out.push(fd + "->" + t);
            }
        }
        _close(0); // dirp 해제는 closedir 생략(1회성)
    }
    send({ev: "fdview", tag: tag, interesting: out, n: out.length});
}

setTimeout(function () { fdview("t+3s"); }, 3000);
setTimeout(function () { fdview("t+8s"); }, 8000);
