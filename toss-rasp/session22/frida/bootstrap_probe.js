// bootstrap_probe.js — 22차: 토스의 Gum 타이머 무력화를 우회하는 부트스트랩 설계.
// 로드 시점(정지 상태)엔 sigchain 핸들러 주소가 미매핑 → libc openat 훅(앱 초기화
// 중 다수 호출, 앱 스레드 구동)을 디딤돌로 써 콜백 안에서 rt_sigaction 조회를
// 반복하고, 핸들러가 등록되는 순간(non-null) attach한다. 이후 시그널 수신 시
// 같은 콜백 체인으로 si/ucontext가 덤프된다. setTimeout/setInterval 전혀 불사용.
'use strict';

var state = "boot";   // boot -> armed -> hit
var armCount = 0;

function modOf(addr) {
    var m = Process.findModuleByAddress(addr);
    return m ? (m.name + "+0x" + addr.sub(m.base).toString(16)) : ("anon/" + addr);
}

function queryHandler() {
    var old = Memory.alloc(256);
    var sys = new NativeFunction(Module.getExportByName("libc.so", "syscall"),
        "long", ["long", "long", "pointer", "pointer", "long"]);
    var r = sys(134, 11, NULL, old, 8);   // rt_sigaction(SIGSEGV, NULL, &old, 8)
    var rc = (r && r.toInt32) ? r.toInt32() : Number(r);
    if (rc !== 0) return null;
    return old.readPointer();
}

function tryArm() {
    if (state !== "boot") return;
    var h = queryHandler();
    if (h === null) return;
    if (h.isNull() || h.toString() === "0x1") {
        // 아직 SIG_DFL/SIG_IGN — sigchain 미초기화, 다음 openat에서 재시도
        return;
    }
    var hs = h.toString();
    state = "armed";
    armCount++;
    send("[ARM#" + armCount + "] SIGSEGV handler = " + modOf(h) + " (" + hs + ")");
    Interceptor.attach(h, {
        onEnter: function (args) {
            if (state === "hit") return;
            state = "hit";
            var si = args[1], uc = args[2];
            var line = "[HIT] sigchain 진입";
            try {
                line += " si_signo=" + si.add(0x00).readS32() +
                        " si_code=" + si.add(0x08).readS32() +
                        " si_addr=0x" + si.add(0x10).readPointer().toString(16);
            } catch (e) { line += " [si fail]"; }
            try {
                var mc = uc.add(0x28);
                var pc = mc.add(0x108).readPointer();
                var sp = mc.add(0x100).readPointer();
                var x16 = mc.add(0x88).add(16 * 8).readPointer();
                var x0 = mc.add(0x88).readPointer();
                var lr = mc.add(0x88).add(30 * 8).readPointer();
                line += "\n  restore pc=" + modOf(pc) + " sp=0x" + sp.toString(16) +
                        "\n  x0=" + modOf(x0) +
                        " x16=" + (x16.isNull() ? "0(NULL)" : modOf(x16)) +
                        " lr=" + modOf(lr);
            } catch (e) { line += "\n  [uc fail " + e + "]"; }
            send(line);
            // 핸들러 교체 가능성: 진입 후 다음 쿼리로 최신 주소 재확인
            try {
                var h2 = queryHandler();
                if (h2 && !h2.isNull() && h2.toString() !== hs) {
                    send("[REARM] handler changed to " + modOf(h2));
                }
            } catch (e) {}
        }
    });
}

// 부트스트랩: openat 디딤돌 (모든 앱 초기화가 파일을 연다)
var openatAddr = Module.getExportByName("libc.so", "openat");
Interceptor.attach(openatAddr, {
    onEnter: function () {
        if (state === "boot") {
            try { tryArm(); } catch (e) { send("[arm fail] " + e); }
        }
    }
});
send("[+] bootstrap probe armed via openat (state=boot)");
