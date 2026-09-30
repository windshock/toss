#!/usr/bin/env python3
"""21차: 토스 spawn + exit 호출자 추적 (frida)"""
import sys, time
import frida

PACKAGE = "viva.republica.toss"
SCRIPT = sys.argv[1] if len(sys.argv) > 1 else "exit_trace.js"
SECS = int(sys.argv[2]) if len(sys.argv) > 2 else 150

def on_message(message, data):
    if message["type"] == "send":
        print("[*] " + str(message["payload"]), flush=True)
    elif message["type"] == "error":
        print("[!] " + message.get("description", str(message)), flush=True)

device = frida.get_usb_device(timeout=10)
pid = device.spawn([PACKAGE])
print(f"[*] spawned pid={pid}", flush=True)
session = device.attach(pid)
with open(SCRIPT) as f:
    script = session.create_script(f.read())
script.on("message", on_message)
script.load()
device.resume(pid)
print("[*] resumed", flush=True)
deadline = time.time() + SECS
try:
    while time.time() < deadline:
        time.sleep(1)
        # 스크립트가 죽었는지(프로세스 사망) 감지
        try:
            device.get_process(PACKAGE)
        except Exception:
            print("[*] process gone", flush=True)
            break
except KeyboardInterrupt:
    pass
try:
    session.detach()
except Exception:
    pass
print("[*] done", flush=True)
