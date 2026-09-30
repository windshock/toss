#!/usr/bin/env python3
"""22차: 2단계 즉시-attach 러너.
1) 설정 앱(same-zygote)에 attach → rt_sigaction 조회로 SIGSEGV 핸들러 주소 확보
2) 그 주소를 박은 sigchain_probe.js 사본으로 토스 spawn(정지 상태에서 로드=attach)
모든 관찰은 토스 앱 스레드(콜백) 구동 — Gum 타이머 불사용(토스에서 죽음, 실측).
사용: sigchain_runner.py [초(기본 60)]
"""
import sys, time, re
import frida

PACKAGE = "viva.republica.toss"
DIR = "/Users/1004276/Downloads/AppSuit/avd-camouflage/analysis/toss-rasp/session22/frida"
SECS = int(sys.argv[1]) if len(sys.argv) > 1 else 60

QUERY_JS = r"""
function q() {
    var old = Memory.alloc(256);
    var sys = new NativeFunction(Module.getExportByName("libc.so", "syscall"),
        "long", ["long", "long", "pointer", "pointer", "long"]);
    var r = sys(134, 11, NULL, old, 8);
    return old.readPointer().toString();
}
send("HANDLER=" + q());
"""

def on_message_factory(tag, store):
    def on_message(message, data):
        if message["type"] == "send":
            p = str(message["payload"])
            print("[%s] %s" % (tag, p), flush=True)
            m = re.match(r"HANDLER=(0x[0-9a-f]+)", p)
            if m:
                store.append(m.group(1))
        elif message["type"] == "error":
            print("[%s!] %s" % (tag, message.get("description", str(message))), flush=True)
    return on_message

def main():
    dev = frida.get_usb_device(timeout=10)
    # 1단계: 설정 앱에서 핸들러 주소 확보
    import subprocess
    subprocess.run(["/Users/1004276/Library/Android/sdk/platform-tools/adb", "shell",
                    "am start -a android.settings.SETTINGS"], capture_output=True)
    time.sleep(3)
    pid_out = subprocess.run(["/Users/1004276/Library/Android/sdk/platform-tools/adb", "shell",
                              "pidof com.android.settings"], capture_output=True, text=True).stdout.strip()
    if not pid_out:
        print("[!] 설정 앱 pid 획득 실패"); return
    setpid = int(pid_out.split()[0])
    print("[*] settings pid=%d" % setpid, flush=True)
    s1 = dev.attach(setpid)
    store = []
    sc1 = s1.create_script(QUERY_JS)
    sc1.on("message", on_message_factory("q", store))
    sc1.load()
    time.sleep(1.5)
    s1.detach()
    if not store:
        print("[!] 핸들러 주소 조회 실패"); return
    addr = store[0]
    print("[*] SIGSEGV handler(zygote 상속) = " + addr, flush=True)

    # 2단계: 주소를 박은 프로브로 토스 spawn
    with open(DIR + "/sigchain_probe.js") as f:
        probe_src = f.read().replace("ADDR_PLACEHOLDER", addr)
    probe_path = DIR + "/sigchain_probe_gen.js"
    with open(probe_path, "w") as f:
        f.write(probe_src)

    pid = dev.spawn([PACKAGE])
    print("[*] spawned toss pid=%d" % pid, flush=True)
    session = dev.attach(pid)
    sc2 = session.create_script(probe_src)
    sc2.on("message", on_message_factory("t", []))
    sc2.load()
    dev.resume(pid)
    print("[*] resumed", flush=True)
    deadline = time.time() + SECS
    while time.time() < deadline:
        time.sleep(1)
        try:
            dev.get_process(PACKAGE)
        except Exception:
            print("[*] process gone", flush=True)
            time.sleep(2)
            break
    try: session.detach()
    except Exception: pass
    print("[*] done", flush=True)

if __name__ == "__main__":
    main()
