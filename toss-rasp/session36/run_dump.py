#!/usr/bin/env python3
"""36차 — 254 진입 전수: .data after-image 덤프 수집(블롭 복호 전수 확보)."""
import json, subprocess, time, os
from concurrent.futures import ThreadPoolExecutor

BASE = "/Users/1004276/Downloads/AppSuit/avd-camouflage/analysis/toss-rasp"
ENTRIES = f"{BASE}/session36/ldaxr_entries.json"
DUMPDIR = f"{BASE}/session36/dumps"
CP = "target/classes:" + open("/Users/1004276/Downloads/AppSuit/tools/unidbg-runner/cp.txt").read().strip()

os.makedirs(DUMPDIR, exist_ok=True)
locks = json.load(open(ENTRIES))
entries = sorted(locks, key=lambda x: int(x, 16))
t0 = time.time()
done = [0]

def run(ent):
    ent = ent[2:] if ent.startswith("0x") else ent
    dump = f"{DUMPDIR}/d_{ent}.bin"
    try:
        subprocess.run(
            ["java", "-cp", CP, "com.github.unidbg.android.TossEa56Leaf", ent, dump],
            capture_output=True, text=True, timeout=150,
            cwd="/Users/1004276/Downloads/AppSuit/tools/unidbg-runner")
    except subprocess.TimeoutExpired:
        pass
    return ent

with ThreadPoolExecutor(max_workers=6) as ex:
    for ent in ex.map(run, entries):
        done[0] += 1
        if done[0] % 50 == 0 or done[0] == len(entries):
            print(f'[{done[0]}/{len(entries)}] {time.time()-t0:.0f}s', flush=True)
print(f"DONE {time.time()-t0:.0f}s dumps={len(os.listdir(DUMPDIR))}", flush=True)
