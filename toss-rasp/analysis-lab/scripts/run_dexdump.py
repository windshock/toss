#!/usr/bin/env python3
"""run_dexdump.py — spawn Toss on the lab, run dump_inmemory_dex.js, save DEX
buffers to artifacts/android/inmemory_dex/. Usage: run_dexdump.py [seconds]"""
import sys, os, json, base64, time
import frida

SERIAL = "localhost:5555"
PKG = "viva.republica.toss"
HERE = os.path.dirname(os.path.abspath(__file__))
OUTDIR = os.path.join(HERE, "..", "artifacts", "android", "inmemory_dex")
os.makedirs(OUTDIR, exist_ok=True)

secs = int(sys.argv[1]) if len(sys.argv) > 1 else 75
js = open(os.path.join(HERE, "dump_inmemory_dex.js")).read()

dev = frida.get_device(SERIAL, timeout=15)
try: dev.kill(PKG)
except Exception: pass
time.sleep(1.0)

bufs = {}   # key → file object (append as chunks arrive)
meta = []

def on_message(msg, data):
    if msg.get("type") == "error":
        print("[script-error]", msg.get("description", "")[:300], file=sys.stderr)
        return
    p = msg.get("payload", {})
    ev = p.get("ev")
    if ev == "dex-start":
        meta.append(p); print(f"[+] dex {p['dexFile']} begin={p['begin']} size={p['size']}", file=sys.stderr)
        path = os.path.join(OUTDIR, f"dex_{p['dexFile'][:12]}_{p['size']}.dex")
        bufs[p["dexFile"]] = open(path, "wb")
        bufs[p["dexFile"] + "|path"] = path
    elif ev == "dex-chunk":
        f = bufs.get(p["key"])
        if f: f.write(base64.b64decode(p["b64"]))
    elif ev == "dex-error":
        print(f"[dex-error] {p.get('key')} off={p.get('off')}: {p.get('err')}", file=sys.stderr)
    elif ev == "dex-end":
        f = bufs.get(p["dexFile"])
        if f:
            f.close()
            path = bufs.get(p["dexFile"] + "|path")
            head = open(path, "rb").read(4)
            magic_ok = head == b"dex\n"
            print(f"[saved] {path} ({os.path.getsize(path)} bytes, magic_ok={magic_ok})", file=sys.stderr)
            bufs.pop(p["dexFile"]); bufs.pop(p["dexFile"] + "|path")
    elif ev in ("no-begin", "bad-size", "loader-err", "loader-done", "scan-done"):
        print(f"[{ev}] {json.dumps(p, ensure_ascii=False)[:200]}", file=sys.stderr)

pid = dev.spawn([PKG])
session = dev.attach(pid)
script = session.create_script(js)
script.on("message", on_message)
script.load()
dev.resume(pid)
print(f"[+] running {secs}s (pid {pid})", file=sys.stderr)
t0 = time.time()
while time.time() - t0 < secs:
    time.sleep(5)
    print(f"    t={int(time.time()-t0)}s dex={len(bufs)}", file=sys.stderr)
try: session.detach()
except Exception: pass
with open(os.path.join(OUTDIR, "meta.json"), "w") as f:
    json.dump(meta, f, indent=1)
print(f"[+] done: {len(bufs)} dex buffers -> {OUTDIR}")
