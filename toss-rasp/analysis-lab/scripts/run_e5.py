#!/usr/bin/env python3
import json, time, frida
PKG = "viva.republica.toss"
JS = "/Users/1004276/Downloads/toss/toss-rasp/analysis-lab/scripts/hook_pvm_e5.js"
OUT = "/Users/1004276/Downloads/toss/toss-rasp/analysis-lab/artifacts/android/e5_pvm.log"
dev = frida.get_device_manager().get_device("localhost:5556", timeout=8)
pid = dev.spawn([PKG])
print("pid=", pid, flush=True)
s = dev.attach(pid)
logf = open(OUT, "w")
def on_message(m, d):
    line = "%.3f %s" % (time.time(), json.dumps(m.get("payload") or m, ensure_ascii=False))
    logf.write(line + "\n"); logf.flush()
    p = m.get("payload")
    if isinstance(p, dict):
        print("[E]", json.dumps(p, ensure_ascii=False)[:250], flush=True)
    else:
        print("[!]", str(m)[:200], flush=True)
sc = s.create_script(open(JS).read())
sc.on("message", on_message)
sc.load()
dev.resume(pid)
deadline = time.time() + 30
while time.time() < deadline:
    time.sleep(1)
    try: dev.get_process(PKG)
    except Exception:
        print("[*] gone", flush=True); time.sleep(1); break
try: s.detach()
except Exception: pass
logf.close()
print("[*] ->", OUT, flush=True)
