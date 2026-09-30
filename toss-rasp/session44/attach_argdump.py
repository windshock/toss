#!/usr/bin/env python3
"""39차 — am start → uid 기반 pid 탐색 → frida attach → full_trap.js 계측.
사용: python3 attach_bridge.py [관찰초(기본 90)] [attach 지연초(기본 2.0)]"""
import sys, time, subprocess, threading
import frida

UID = "10176"   # 재설치 후 신규 uid
SCRIPT = "/Users/1004276/Downloads/AppSuit/avd-camouflage/analysis/toss-rasp/session44/argdump_probe.js"
SECS = int(sys.argv[1]) if len(sys.argv) > 1 else 90
DELAY = float(sys.argv[2]) if len(sys.argv) > 2 else 2.0

ADB = "/Users/1004276/Library/Android/sdk/platform-tools/adb"

def adb(*args):
    return subprocess.run([ADB, "shell"] + list(args), capture_output=True, text=True).stdout

def find_pid():
    out = adb("su 0 sh -c 'ps -A -o UID,PID,NAME'", )
    for line in out.splitlines():
        p = line.split()
        if len(p) >= 3 and p[0] == UID and p[2] == "viva.republica.toss":
            return p[1]
    return None

def on_message(message, data):
    if message["type"] == "send":
        print("[*] " + str(message["payload"]), flush=True)
    elif message["type"] == "error":
        print("[!] " + message.get("description", str(message)), flush=True)

print("[*] am start", flush=True)
adb("am", "start", "-n", "viva.republica.toss/.splash.SplashActivity")
t0 = time.time()
pid = None
while time.time() - t0 < 10:
    pid = find_pid()
    if pid: break
    time.sleep(0.1)
if not pid:
    print("[!] 앱 프로세스 발견 실패", flush=True); sys.exit(1)
print(f"[*] pid={pid} (+{time.time()-t0:.1f}s) — {DELAY}s 대기 후 attach", flush=True)
time.sleep(DELAY)

device = frida.get_usb_device(timeout=10)
session = device.attach(int(pid))
with open(SCRIPT) as f:
    script = session.create_script(f.read())
script.on("message", on_message)
script.load()
print("[*] script loaded", flush=True)

deadline = time.time() + SECS
while time.time() < deadline:
    time.sleep(1)
    if find_pid() is None:
        print("[*] process gone", flush=True); break
try: session.detach()
except Exception: pass
print("[*] done", flush=True)
