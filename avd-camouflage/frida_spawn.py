#!/usr/bin/env python3
"""Spawn Monimo under frida and run an instrumentation script.

Usage: frida_spawn.py <script.js> [seconds=45]

Requires: adb forward tcp:27045 tcp:27042 and frida-server running on device
    adb shell "nohup /data/local/tmp/frida-server -l 127.0.0.1:27042 &"

Why spawn: the AhnLab guard sub-process ptraces the main process
(TracerPid), so late attach is impossible; injecting at spawn time works.
Why python (not the frida CLI): the CLI REPL blocks its message pump on
piped stdin, so deferred callbacks (timers, Java.perform) never fire.
"""
import sys
import time

import frida

REMOTE = "127.0.0.1:27045"
PACKAGE = "net.ib.android.smcard"


def on_message(message, data):
    if message["type"] == "send":
        print("[*] " + str(message["payload"]), flush=True)
    elif message["type"] == "error":
        print("[!] " + message.get("description", str(message)), flush=True)
        if message.get("lineNumber") is not None:
            print("[!]   at line " + str(message.get("lineNumber")) +
                  ":" + str(message.get("columnNumber")), flush=True)
        if message.get("stack"):
            print("[!]   stack: " + str(message.get("stack"))[:2000], flush=True)
    else:
        print("[?] " + str(message), flush=True)


def on_detached(reason, crash):
    print(f"[!!!] session detached: reason={reason}", flush=True)
    if crash is not None:
        print(f"[!!!] crash: pid={crash.pid} summary={crash.summary}", flush=True)
        if getattr(crash, "report", None):
            print("===== crash report =====", flush=True)
            print(crash.report, flush=True)
            print("===== end crash report =====", flush=True)


def main():
    script_path = sys.argv[1]
    duration = int(sys.argv[2]) if len(sys.argv) > 2 else 45
    resume_delay = float(sys.argv[3]) if len(sys.argv) > 3 else 0.0
    package = sys.argv[4] if len(sys.argv) > 4 else PACKAGE

    dev = frida.get_device_manager().add_remote_device(REMOTE)
    pid = dev.spawn([package])
    print(f"[+] spawned pid={pid}", flush=True)
    session = dev.attach(pid)
    session.on("detached", on_detached)
    with open(script_path) as f:
        code = f.read()
    script = session.create_script(code)
    script.on("message", on_message)
    script.load()
    print("[+] script loaded, resuming", flush=True)
    if resume_delay > 0:
        # 호스트가 커널 추적 필터를 걸 시간을 벌어준다 (관측용)
        print(f"[+] waiting {resume_delay}s before resume (host sets up tracing)", flush=True)
        time.sleep(resume_delay)
    dev.resume(pid)

    deadline = time.time() + duration
    while time.time() < deadline:
        time.sleep(1)
    print(f"[+] {duration}s elapsed, detaching")


if __name__ == "__main__":
    main()
