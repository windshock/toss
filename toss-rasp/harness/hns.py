#!/usr/bin/env python3
"""Query saved Toss RASP runs; never count missing evidence as a clean negative.

  hns.py index                 rebuild runs/index.json
  hns.py list                  show current run summaries
  hns.py show <id|latest>      print meta + verdict
  hns.py compare <A> <B>       compare, with capture/config warnings
  hns.py frames                frame frequencies for VALID positive/negative runs
  hns.py hypotheses            param-set outcomes (mixed/inconclusive-aware)
"""

import glob
import json
import os
import sys


ROOT = os.path.dirname(os.path.dirname(os.path.abspath(__file__)))
RUNS = os.path.join(ROOT, "runs")


def j(path):
    try:
        with open(path) as stream:
            return json.load(stream)
    except (OSError, ValueError):
        return {}


def all_runs():
    return sorted(
        os.path.basename(path) for path in glob.glob(os.path.join(RUNS, "2*"))
        if os.path.isdir(path) and os.path.isfile(os.path.join(path, "verdict.json"))
    )


def resolve(short_id):
    runs = all_runs()
    if short_id == "latest":
        return runs[-1] if runs else None
    if short_id in runs:
        return short_id
    hits = [run for run in runs if short_id in run]
    if len(hits) > 1:
        raise ValueError(f"ambiguous run id {short_id!r}: {', '.join(hits)}")
    return hits[0] if hits else None


def load(run_id):
    if run_id is None:
        raise ValueError("run not found")
    directory = os.path.join(RUNS, run_id)
    return j(os.path.join(directory, "meta.json")), j(os.path.join(directory, "verdict.json"))


def state(verdict):
    # Old verdicts encoded missing evidence as False. Do not retroactively call
    # them NOT_DETECTED or use them in support/refutation statistics.
    current = verdict.get("verdict_state")
    if not current:
        return "INCONCLUSIVE(legacy)"
    if current in ("DETECTED", "NOT_DETECTED") and (verdict.get("capture_quality") or {}).get("evidence_valid") is not True:
        return "INCONCLUSIVE"
    return current


def stable_lkm(meta):
    counters = {"gd_calls", "gd_filtered"}
    return dict(
        (key, value) for key, value in (meta.get("lkm_params") or {}).items()
        if not key.endswith("_hits") and key not in counters
    )


def environment_config(meta):
    return (
        meta.get("sdk"), meta.get("kernel"), meta.get("model"),
        meta.get("libea56_sha256_16"), meta.get("app_uid"),
        meta.get("app_reported_model"),
    )


def stable_config(meta):
    return environment_config(meta), tuple(sorted(stable_lkm(meta).items()))


def requested_keys(meta):
    return {token.split("=", 1)[0] for token in (meta.get("params") or "").split() if "=" in token}


def row(run_id):
    meta, verdict = load(run_id)
    quality = verdict.get("capture_quality") or {}
    return {
        "id": run_id,
        "label": meta.get("label"),
        "params": meta.get("params") or "",
        "state": state(verdict),
        "quality": quality.get("state", "LEGACY"),
        "observed": verdict.get("emulator_observed", verdict.get("emulator_detected")),
        "detected": verdict.get("detected"),
        "guard": verdict.get("guardLevel"),
        "exit": verdict.get("exit_caller"),
        "alive_s": verdict.get("last_alive_s"),
        "frames": list((verdict.get("libea56_stack_frames") or {}).keys()),
    }


def cmd_index():
    os.makedirs(RUNS, exist_ok=True)
    entries = [row(run) for run in all_runs()]
    with open(os.path.join(RUNS, "index.json"), "w") as stream:
        json.dump(entries, stream, indent=2, ensure_ascii=False)
    cmd_list(entries)


def cmd_list(entries=None):
    entries = entries if entries is not None else [row(run) for run in all_runs()]
    print(f"{'id':30} {'state':24} {'quality':13} {'obs':5} {'detected':12} {'guard':5} {'alive':6} frames")
    for item in entries:
        print(
            f"{item['id']:30} {item['state']:24} {item['quality']:13} "
            f"{str(item['observed']):5} {str(item['detected']):12} "
            f"{str(item['guard']):5} {str(item['alive_s']):6} "
            f"{','.join(item['frames'])}"
        )


def cmd_show(short_id):
    run_id = resolve(short_id)
    meta, verdict = load(run_id)
    print("== meta ==")
    print(json.dumps(meta, indent=2, ensure_ascii=False))
    print("== verdict ==")
    print(json.dumps(verdict, indent=2, ensure_ascii=False))


def cmd_compare(a, b):
    a, b = resolve(a), resolve(b)
    ma, va = load(a)
    mb, vb = load(b)
    print(f"A={a} [{state(va)}]  B={b} [{state(vb)}]")
    print(f"params: A={ma.get('params')!r}  B={mb.get('params')!r}")
    if environment_config(ma) != environment_config(mb):
        print("WARNING: stable environment identity differs; causal comparison may be confounded")
    la, lb = stable_lkm(ma), stable_lkm(mb)
    changed = {key for key in set(la) | set(lb) if la.get(key) != lb.get(key)}
    undeclared = changed - requested_keys(ma) - requested_keys(mb)
    if undeclared:
        print(f"WARNING: undeclared LKM drift: {', '.join(sorted(undeclared))}")
    elif changed:
        print(f"declared intervention keys: {', '.join(sorted(changed))}")
    if state(va) not in ("DETECTED", "NOT_DETECTED") or state(vb) not in ("DETECTED", "NOT_DETECTED"):
        print("WARNING: at least one run lacks a valid verdict; differences are descriptive only")
    for key in sorted(set(va) | set(vb)):
        if key.startswith("_"):
            continue
        if va.get(key) != vb.get(key):
            print(f"  {key}:\n    A: {va.get(key)}\n    B: {vb.get(key)}")


def cmd_frames():
    seen = {}
    counts = {"DETECTED": 0, "NOT_DETECTED": 0}
    for run in all_runs():
        _, verdict = load(run)
        current = state(verdict)
        if current not in counts:
            continue
        counts[current] += 1
        for offset in verdict.get("libea56_stack_frames") or {}:
            seen.setdefault(offset, {"DETECTED": 0, "NOT_DETECTED": 0})[current] += 1
    print(f"valid runs: DETECTED={counts['DETECTED']} NOT_DETECTED={counts['NOT_DETECTED']}")
    if not all(counts.values()):
        print("No two-sided contrast: frame frequency cannot attribute a detector")
    print(f"{'libea56+offset':18} {'detected':9} {'not_detected':12}")
    for offset, values in sorted(seen.items()):
        print(f"0x{offset:16} {values['DETECTED']:<9} {values['NOT_DETECTED']:<12}")


def hypothesis_rows():
    groups = {}
    for run in all_runs():
        meta, verdict = load(run)
        key = meta.get("params") or "baseline"
        group = groups.setdefault(key, {
            "runs": 0, "detected": 0, "not_detected": 0,
            "inconclusive": 0, "contaminated": 0, "config": set(),
        })
        group["runs"] += 1
        group["config"].add(stable_config(meta))
        current = state(verdict)
        if current == "DETECTED":
            group["detected"] += 1
        elif current == "NOT_DETECTED":
            group["not_detected"] += 1
        elif current == "CONTAMINATED":
            group["contaminated"] += 1
        else:
            group["inconclusive"] += 1
    for key, group in groups.items():
        if key == "baseline":
            status = "BASELINE"
        elif len(group["config"]) > 1 or group["contaminated"]:
            status = "CONFOUNDED"
        elif group["detected"] and group["not_detected"]:
            status = "MIXED"
        elif group["detected"]:
            status = "REFUTED"
        elif group["not_detected"] and not group["inconclusive"]:
            status = "SUPPORTED (in observed window)"
        else:
            status = "INCONCLUSIVE"
        yield key, status, group


def cmd_hypotheses():
    print("param-set -> status (valid detected / valid not-detected / inconclusive / contaminated)")
    for key, status, group in hypothesis_rows():
        print(
            f"  {key:40} {status:29} "
            f"{group['detected']}/{group['not_detected']}/"
            f"{group['inconclusive']}/{group['contaminated']} "
            f"({group['runs']} runs)"
        )


def main(argv):
    command = argv[0] if argv else "list"
    if command == "index":
        cmd_index()
    elif command == "list":
        cmd_list()
    elif command == "show":
        cmd_show(argv[1] if len(argv) > 1 else "latest")
    elif command == "compare" and len(argv) == 3:
        cmd_compare(argv[1], argv[2])
    elif command == "frames":
        cmd_frames()
    elif command == "hypotheses":
        cmd_hypotheses()
    else:
        raise SystemExit(__doc__)


if __name__ == "__main__":
    try:
        main(sys.argv[1:])
    except ValueError as error:
        raise SystemExit(str(error)) from error
