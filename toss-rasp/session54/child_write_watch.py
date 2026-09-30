#!/usr/bin/env python3
"""40차 — 부모 exit 트랩 유지 + 자식 pid 폴링 → 즉시 attach → child_probe.js.
사용: python3 child_watch.py [총 관찰초(기본 75)]"""
import frida, subprocess, sys, time, threading

ADB = "/Users/1004276/Library/Android/sdk/platform-tools/adb"
UID = "10176"
PKG = "viva.republica.toss"
DUR = int(sys.argv[1]) if len(sys.argv) > 1 else 75
PARENT_JS = "/Users/1004276/Downloads/AppSuit/avd-camouflage/analysis/toss-rasp/session54/parent_min.js"
CHILD_JS = "/Users/1004276/Downloads/AppSuit/avd-camouflage/analysis/toss-rasp/session54/child_write.js"

def sh(*a): return subprocess.run([ADB, "shell"] + list(a), capture_output=True, text=True).stdout

def procs():
    out = sh("su 0 sh -c 'ps -A -o UID,PID,NAME'")
    r = {}
    for l in out.splitlines():
        p = l.split()
        if len(p) >= 3 and p[0] == UID:
            r[p[1]] = p[2]
    return r

def on_msg(tag):
    def cb(m, d):
        if m["type"] == "send":
            print(f"[{tag}] " + str(m["payload"]), flush=True)
        elif m["type"] == "error":
            print(f"[{tag}!] " + str(m.get("description", m)), flush=True)
    return cb

device = frida.get_usb_device(timeout=10)

# 부모 기동+attach
sh("am", "force-stop", PKG); time.sleep(1)
print("[*] am start", flush=True)
sh("am", "start", "-n", PKG + "/.splash.SplashActivity")
pid = None
t0 = time.time()
while time.time() - t0 < 10:
    ps = procs()
    cand = [p for p, n in ps.items() if n == PKG]
    if cand: pid = int(cand[0]); break
    time.sleep(0.1)
if not pid: print("[!] no parent"); sys.exit(1)
print(f"[*] parent pid={pid} (+{time.time()-t0:.1f}s)", flush=True)
time.sleep(1.8)
psession = device.attach(pid)
pscript = psession.create_script(open(PARENT_JS).read())
pscript.on("message", on_msg("P"))
pscript.load()
print("[*] parent trapped", flush=True)

# 자식 감시
attached = set([str(pid)])
end = time.time() + DUR
while time.time() < end:
    ps = procs()
    for p, n in ps.items():
        if p not in attached:
            attached.add(p)
            print(f"[*] NEW child pid={p} name={n} — attach!", flush=True)
            try:
                cs = device.attach(int(p))
                cscript = cs.create_script(open(CHILD_JS).read())
                cscript.on("message", on_msg("C" + p))
                cscript.load()
            except Exception as e:
                print(f"[!] child attach fail {p}: {e}", flush=True)
    if str(pid) not in ps:
        print("[*] parent gone", flush=True)
        break
    time.sleep(0.2)
print("[*] done", flush=True)
