#!/usr/bin/env python3
"""run_harvest.py — frida spawn Toss on the redroid lab, run harvest_manifest2.js,
save the message stream to JSONL. Usage: run_harvest.py [seconds] [out.jsonl]"""
import sys, os, json, time
import frida

SERIAL = "localhost:5555"
PKG = "viva.republica.toss"
HERE = os.path.dirname(os.path.abspath(__file__))

secs = int(sys.argv[1]) if len(sys.argv) > 1 else 80
out_path = sys.argv[2] if len(sys.argv) > 2 else os.path.join(HERE, "..", "artifacts", "android", "toss_manifest_harvest2.jsonl")

js = open(os.path.join(HERE, "harvest_manifest2.js")).read()

dev = frida.get_device(SERIAL, timeout=10)
# clean start
try:
    dev.kill(PKG)
except Exception:
    pass
time.sleep(1.0)

pid = dev.spawn([PKG])
session = dev.attach(pid)
script = session.create_script(js)

n = {"c": 0}
f = open(out_path, "w")

def on_message(msg, data):
    if msg.get("type") == "send":
        f.write(json.dumps(msg["payload"], ensure_ascii=False) + "\n")
        n["c"] += 1
        if n["c"] % 200 == 0:
            f.flush()
    elif msg.get("type") == "error":
        f.write(json.dumps({"ev": "script-error", "err": msg.get("description", "")[:400]}) + "\n")
        f.flush()

script.on("message", on_message)
script.load()
dev.resume(pid)
print(f"[+] running for {secs}s (pid {pid})", file=sys.stderr)

t0 = time.time()
events = []
while time.time() - t0 < secs:
    time.sleep(5)
    events.append(int(time.time() - t0))
    print(f"    t={int(time.time()-t0)}s events={n['c']}", file=sys.stderr)

try:
    session.detach()
except Exception:
    pass
f.close()
print(f"[+] {n['c']} events -> {out_path}")
