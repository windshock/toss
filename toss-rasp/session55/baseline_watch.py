#!/usr/bin/env python3
"""Observe Toss and fork-child I/O without injecting an agent."""

import subprocess
import time


ADB = "/Users/1004276/Library/Android/sdk/platform-tools/adb"
UID = "10176"
PKG = "viva.republica.toss"


def shell(command):
    return subprocess.run([ADB, "shell", command], capture_output=True, text=True).stdout


def processes():
    found = {}
    for line in shell("/system/xbin/su 0 ps -A -o UID,PID,NAME").splitlines():
        parts = line.split()
        if len(parts) >= 3 and parts[0] == UID:
            found[parts[1]] = parts[2]
    return found


def io_count(pid):
    values = {}
    for line in shell(f"/system/xbin/su 0 cat /proc/{pid}/io").splitlines():
        key, sep, raw = line.partition(":")
        if sep and raw.strip().isdigit():
            values[key] = int(raw.strip())
    return values


def fd1(pid):
    return shell(f"/system/xbin/su 0 readlink /proc/{pid}/fd/1").strip()


shell(f"am force-stop {PKG}")
time.sleep(0.5)
t0 = time.monotonic()
print("start:", shell(f"am start -n {PKG}/.splash.SplashActivity").strip(), flush=True)
seen = {}
last = {}
while time.monotonic() - t0 < 28:
    elapsed = time.monotonic() - t0
    current = processes()
    for pid, name in current.items():
        if pid not in seen:
            seen[pid] = name
            sample = io_count(pid)
            last[pid] = sample
            print(f"{elapsed:.2f}s NEW pid={pid} name={name} fd1={fd1(pid)} syscw={sample.get('syscw')} wchar={sample.get('wchar')}", flush=True)
        elif name != seen[pid]:
            print(f"{elapsed:.2f}s RENAME pid={pid} {seen[pid]} -> {name}", flush=True)
            seen[pid] = name
        if pid in last and name == "zygote_reactjs" and elapsed > 0.5:
            sample = io_count(pid)
            previous = last.get(pid, {})
            if sample and previous:
                print(f"{elapsed:.2f}s CHILD pid={pid} syscw={sample.get('syscw')} (+{sample.get('syscw', 0) - previous.get('syscw', 0)}) wchar={sample.get('wchar')} (+{sample.get('wchar', 0) - previous.get('wchar', 0)})", flush=True)
                last[pid] = sample
    for pid in set(seen) - set(current):
        print(f"{elapsed:.2f}s GONE pid={pid} name={seen.pop(pid)}", flush=True)
        last.pop(pid, None)
    time.sleep(0.25)
