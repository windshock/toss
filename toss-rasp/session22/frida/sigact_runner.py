#!/usr/bin/env python3
"""22차: 커널 SIGACT11(dmesg) → frida arm() 실시간 전달 러너.
사용: sigact_runner.py [초(기본 90)] [spawn여부(기본 1)]
- spawn=1: frida spawn 모드(가드 초기화 전부터 관측)
- dmesg 폴링(5Hz)으로 pid 매칭 SIGACT11 handler 주소를 잡아 handler_probe.js에 arm.
"""
import sys, time, re, subprocess, threading
import frida

PACKAGE = "viva.republica.toss"
SECS = int(sys.argv[1]) if len(sys.argv) > 1 else 90
USE_SPAWN = (len(sys.argv) < 3 or sys.argv[2] != "0")
ADB = "/Users/1004276/Library/Android/sdk/platform-tools/adb"
DIR = "/Users/1004276/Downloads/AppSuit/avd-camouflage/analysis/toss-rasp/session22/frida"

seen = set()
script = None

def on_message(message, data):
    if message["type"] == "send":
        print("[*] " + str(message["payload"]), flush=True)
    elif message["type"] == "error":
        print("[!] " + message.get("description", str(message)), flush=True)

def poll_dmesg_and_arm(pid, stop_evt):
    """dmesg 폴링: SIGACT11 ... pid=<pid> handler=0x... 를 잡아 rpc arm.
    셸 도구(toybox)의 도배를 막기 위해 폴링 창에서만 sigact_log=1 (끝나면 0)."""
    global script
    pat = re.compile(r"SIGACT11: handler=0x([0-9a-f]+) comm=\S+ pid=%d " % pid)
    subprocess.run([ADB, "shell", "echo 1 > /sys/module/hide_kmod/parameters/sigact_log"],
                   capture_output=True, timeout=5)
    while not stop_evt.is_set():
        try:
            out = subprocess.run([ADB, "shell", "dmesg | grep SIGACT11"],
                                 capture_output=True, text=True, timeout=5).stdout
            for line in out.splitlines():
                m = pat.search(line)
                if not m:
                    continue
                addr = "0x" + m.group(1)
                if addr in seen:
                    continue
                seen.add(addr)
                print("[dmesg] " + line.strip(), flush=True)
                if script is not None:
                    try:
                        r = script.exports_sync.arm(addr)
                        print("[rpc] arm(%s) -> %s" % (addr, r), flush=True)
                    except Exception as e:
                        print("[rpc] arm fail: " + str(e), flush=True)
        except Exception:
            pass
        time.sleep(0.2)

def main():
    global script
    device = frida.get_usb_device(timeout=10)
    if USE_SPAWN:
        pid = device.spawn([PACKAGE])
        print("[*] spawned pid=%d" % pid, flush=True)
        session = device.attach(pid)
    else:
        session = device.attach(PACKAGE)
        pid = None
        for p in device.enumerate_processes():
            if p.name == PACKAGE:
                pid = p.pid
        print("[*] attached pid=%s" % pid, flush=True)
    with open(DIR + "/handler_probe.js") as f:
        script = session.create_script(f.read())
    script.on("message", on_message)
    script.load()
    stop_evt = threading.Event()
    if USE_SPAWN:
        device.resume(pid)
        print("[*] resumed", flush=True)
    t = threading.Thread(target=poll_dmesg_and_arm, args=(pid, stop_evt), daemon=True)
    t.start()
    deadline = time.time() + SECS
    try:
        while time.time() < deadline:
            time.sleep(1)
            if USE_SPAWN:
                try:
                    device.get_process(PACKAGE)
                except Exception:
                    print("[*] process gone", flush=True)
                    time.sleep(1)  # 마지막 폴링 여유
                    break
    except KeyboardInterrupt:
        pass
    stop_evt.set()
    subprocess.run([ADB, "shell", "echo 0 > /sys/module/hide_kmod/parameters/sigact_log"],
                   capture_output=True, timeout=5)
    time.sleep(0.5)
    try:
        session.detach()
    except Exception:
        pass
    print("[*] done — armed: %s" % (sorted(seen) if seen else "none"), flush=True)

if __name__ == "__main__":
    main()
