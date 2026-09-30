#!/usr/bin/env python3
"""36차 — ldaxr 시그니처 진입 254개 전수 실행(프로세스당 1개, 동시 6개)."""
import json, subprocess, time, sys
from concurrent.futures import ThreadPoolExecutor

BASE = "/Users/1004276/Downloads/AppSuit/avd-camouflage/analysis/toss-rasp"
ENTRIES = f"{BASE}/session36/ldaxr_entries.json"
OUT = f"{BASE}/session36/strings_all.jsonl"
LOG = f"{BASE}/session36/run_all.log"
CP = "target/classes:" + open("/Users/1004276/Downloads/AppSuit/tools/unidbg-runner/cp.txt").read().strip()

locks = json.load(open(ENTRIES))
entries = sorted(locks, key=lambda x: int(x, 16))
log = open(LOG, "w")
lock_write = __import__("threading").Lock()
done = [0]
t0 = time.time()

def run(ent):
    ent = ent[2:] if ent.startswith("0x") else ent
    try:
        r = subprocess.run(
            ["java", "-cp", CP, "com.github.unidbg.android.TossEa56Leaf", ent],
            capture_output=True, text=True, timeout=150,
            cwd="/Users/1004276/Downloads/AppSuit/tools/unidbg-runner")
        lines = []
        for line in r.stdout.splitlines():
            line = line.strip()
            if line.startswith("{"):
                try:
                    obj = json.loads(line)
                    obj["entry"] = "0x" + ent
                    obj["lock"] = locks["0x" + ent]
                    lines.append(json.dumps(obj, ensure_ascii=False))
                except json.JSONDecodeError:
                    pass
        status = (r.stderr.strip().splitlines() or ["?"])[-1][:100]
        return ent, lines, status
    except subprocess.TimeoutExpired:
        return ent, [], "TIMEOUT"

with ThreadPoolExecutor(max_workers=6) as ex, open(OUT, "w") as out:
    for ent, lines, status in ex.map(run, entries):
        with lock_write:
            for l in lines: out.write(l + "\n")
            out.flush()
            done[0] += 1
            log.write(f'[{done[0]}/{len(entries)}] 0x{ent} lock={locks["0x"+ent]} strings={len(lines)} {status}\n')
            log.flush()
            if done[0] % 20 == 0 or done[0] == len(entries):
                print(f'[{done[0]}/{len(entries)}] {time.time()-t0:.0f}s strings_total={sum(1 for _ in open(OUT))}', flush=True)
print(f"DONE {time.time()-t0:.0f}s -> {OUT}", flush=True)
