#!/usr/bin/env python3
"""Attach early for a read-only Java bridge class/method inventory."""

import subprocess
import time
from pathlib import Path

import frida


ADB = "/Users/1004276/Library/Android/sdk/platform-tools/adb"
UID = "10176"
PKG = "viva.republica.toss"
JS = Path(__file__).with_suffix(".js")


def shell(command):
    return subprocess.run([ADB, "shell", command], capture_output=True, text=True).stdout


def app_processes():
    found = []
    for line in shell("/system/xbin/su 0 ps -A -o UID,PID,NAME").splitlines():
        parts = line.split()
        if len(parts) >= 3 and parts[0] == UID and parts[2] not in ("zygote_reactjs", "crash_dump64"):
            found.append((int(parts[1]), parts[2]))
    return sorted(found)


def on_message(message, _data):
    when = time.monotonic() - t0
    if message["type"] == "send":
        print(f"[{when:.2f}s] {message['payload']}", flush=True)
    elif message["type"] == "error":
        print(f"[{when:.2f}s ERROR] {message}", flush=True)


device = frida.get_usb_device(timeout=10)
shell(f"am force-stop {PKG}")
time.sleep(0.3)
t0 = time.monotonic()
print(shell(f"am start -n {PKG}/.splash.SplashActivity").strip(), flush=True)
pid = None
while time.monotonic() - t0 < 3:
    candidates = app_processes()
    if candidates:
        pid = candidates[0][0]
        print(f"[{time.monotonic() - t0:.2f}s] parent pid={pid} name={candidates[0][1]}", flush=True)
        break
    time.sleep(0.05)
if pid is None:
    raise SystemExit("parent not found")

try:
    session = device.attach(pid)
    script = session.create_script(JS.read_text())
    script.on("message", on_message)
    script.load()
    print(f"[{time.monotonic() - t0:.2f}s] script loaded", flush=True)
    while time.monotonic() - t0 < 10 and any(p == pid for p, _ in app_processes()):
        time.sleep(0.2)
    print(f"[{time.monotonic() - t0:.2f}s] observation complete", flush=True)
    session.detach()
except Exception as exc:
    print(f"[{time.monotonic() - t0:.2f}s] attach/inventory failed: {exc}", flush=True)
