#!/usr/bin/env python3
"""Compare child /proc/PID/io syscall totals with libc hooks in one run."""

import subprocess
import time
from pathlib import Path

import frida


ADB = "/Users/1004276/Library/Android/sdk/platform-tools/adb"
UID = "10176"
PKG = "viva.republica.toss"
HERE = Path(__file__).resolve().parent


def shell(command):
    return subprocess.run([ADB, "shell", command], capture_output=True, text=True).stdout


def procs():
    result = {}
    for line in shell("/system/xbin/su 0 ps -A -o UID,PID,NAME").splitlines():
        fields = line.split()
        if len(fields) >= 3 and fields[0] == UID:
            result[fields[1]] = fields[2]
    return result


def io(pid):
    raw = shell(f"/system/xbin/su 0 cat /proc/{pid}/io")
    values = {}
    for line in raw.splitlines():
        if ": " in line:
            k, v = line.split(": ", 1)
            if v.isdigit():
                values[k] = int(v)
    return values


def on_message(label):
    def callback(message, _data):
        if message["type"] == "send":
            print(f"[{time.monotonic() - t0:.1f}s {label}] {message['payload']}", flush=True)
        elif message["type"] == "error":
            print(f"[{time.monotonic() - t0:.1f}s {label} ERROR] {message}", flush=True)
    return callback


device = frida.get_usb_device(timeout=10)
t0 = time.monotonic()
shell(f"am force-stop {PKG}")
time.sleep(0.5)
shell(f"am start -n {PKG}/.splash.SplashActivity")
print("[start] app launched", flush=True)

parent = None
for _ in range(100):
    matches = [pid for pid, name in procs().items() if name == PKG]
    if matches:
        parent = matches[0]
        break
    time.sleep(0.1)
if parent is None:
    raise SystemExit("parent not found")
print(f"[parent] pid={parent}", flush=True)
time.sleep(1.8)
parent_session = device.attach(int(parent))
parent_script = parent_session.create_script((HERE.parent / "session54" / "parent_min.js").read_text())
parent_script.on("message", on_message("parent"))
parent_script.load()

children = {}
sessions = [parent_session]
deadline = time.monotonic() + 35
next_sample = 0
while time.monotonic() < deadline:
    current = procs()
    for pid, name in current.items():
        if pid == parent or pid in children or name != "zygote_reactjs":
            continue
        before = io(pid)
        print(f"[{time.monotonic() - t0:.1f}s child] pid={pid} before={before}", flush=True)
        try:
            session = device.attach(int(pid))
            script = session.create_script((HERE / "child_io_audit.js").read_text())
            script.on("message", on_message(f"child-{pid}"))
            script.load()
            sessions.append(session)
            children[pid] = before
            print(f"[{time.monotonic() - t0:.1f}s child] hooks loaded pid={pid}", flush=True)
        except Exception as exc:
            children[pid] = before
            print(f"[{time.monotonic() - t0:.1f}s child] attach failed: {exc}", flush=True)
    if time.monotonic() >= next_sample:
        for pid, before in children.items():
            now = io(pid)
            if now:
                print(f"[{time.monotonic() - t0:.1f}s io] pid={pid} syscw_delta={now.get('syscw', 0) - before.get('syscw', 0)} wchar_delta={now.get('wchar', 0) - before.get('wchar', 0)}", flush=True)
        next_sample = time.monotonic() + 2
    if parent not in current and children:
        print(f"[{time.monotonic() - t0:.1f}s parent] gone", flush=True)
        break
    time.sleep(0.2)
print(f"[{time.monotonic() - t0:.1f}s done]", flush=True)
