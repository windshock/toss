#!/usr/bin/env python3
"""attach_run.py — am start 후 지연 attach로 훅 스크립트 주입 (§151 Phase-1).
Usage: attach_run.py <script.js> <attach_delay_s> <duration_s>
패턴: exit_trap(25차) 검증 — spawn은 무력화, attach(1.5s)는 생존."""
import sys, time, subprocess, frida

PKG = "viva.republica.toss"
ACT = "viva.republica.toss/.splash.SplashActivity"
script_path, delay, duration = sys.argv[1], float(sys.argv[2]), float(sys.argv[3])

def sh(cmd):
    subprocess.run(cmd, shell=True, capture_output=True)

sh("adb shell am force-stop " + PKG)
time.sleep(1)
sh("adb shell am start -n " + ACT)
print("[+] launched, polling for pid…", flush=True)

dev = frida.get_device_manager().add_remote_device("127.0.0.1:39871")
pid = None
t0 = time.time()
while time.time() - t0 < delay + 3:
    out = subprocess.run("adb shell pidof " + PKG, shell=True, capture_output=True, text=True).stdout.strip()
    if out:
        pid = int(out.split()[0])
        break
    time.sleep(0.1)
if not pid:
    print("[!] no pid within window"); sys.exit(1)
print(f"[+] attach pid={pid}", flush=True)
session = dev.attach(pid)
script = session.create_script(open(script_path).read())
script.on("message", lambda m, d: print(f"[MSG] {m.get('payload', m)}", flush=True))
script.load()
print("[+] script loaded", flush=True)
time.sleep(duration)
print("[+] done", flush=True)
try:
    session.detach()
except Exception:
    pass
