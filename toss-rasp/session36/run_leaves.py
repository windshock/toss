#!/usr/bin/env python3
"""36차 잎 24개 전수 실행 드라이버 — 잎당 JVM 1개(unicorn 크래시 격리)."""
import json, subprocess, sys, time

BASE = "/Users/1004276/Downloads/AppSuit/avd-camouflage/analysis/toss-rasp"
ENTRIES = f"{BASE}/session36/leaf_starts.json"
OUT = f"{BASE}/session36/strings2.jsonl"
LOG = f"{BASE}/session36/leaves_run.log"
CP = "target/classes:" + open("/Users/1004276/Downloads/AppSuit/tools/unidbg-runner/cp.txt").read().strip()

entries = json.load(open(ENTRIES))
log = open(LOG, "w")
out = open(OUT, "w")
t0 = time.time()
for i, ent in enumerate(entries):
    ent = ent.lstrip("0x") if ent.startswith("0x") else ent
    try:
        r = subprocess.run(
            ["java", "-cp", CP, "com.github.unidbg.android.TossEa56Leaf", ent],
            capture_output=True, text=True, timeout=240,
            cwd="/Users/1004276/Downloads/AppSuit/tools/unidbg-runner")
        nstr = 0
        for line in r.stdout.splitlines():
            line = line.strip()
            if line.startswith("{"):
                try:
                    obj = json.loads(line); obj["entry"] = "0x" + ent
                    out.write(json.dumps(obj, ensure_ascii=False) + "\n"); nstr += 1
                except json.JSONDecodeError:
                    pass
        status = (r.stderr.strip().splitlines() or ["?"])[-1]
        log.write(f"[{i+1}/24] 0x{ent} rc={r.returncode} {status}\n"); log.flush()
        print(f"[{i+1}/24] 0x{ent} strings={nstr} ({time.time()-t0:.0f}s)", flush=True)
    except subprocess.TimeoutExpired:
        log.write(f"[{i+1}/24] 0x{ent} TIMEOUT\nn"); log.flush()
        print(f"[{i+1}/24] 0x{ent} TIMEOUT", flush=True)
out.close(); log.close()
print(f"DONE {time.time()-t0:.0f}s -> {OUT}", flush=True)
