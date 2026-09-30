#!/usr/bin/env python3
"""Parse a Toss harness run without turning missing evidence into a negative verdict.

Usage (the first six arguments are retained for older callers):
  parse_run.py RD T0 T1 LABEL PARAMS LEGACY_PID [WIN STACKS REBOOT FRESH UID LAUNCH_OK]
Set HNS_OFFLINE=1 to reparse saved artifacts without querying adb.
"""

import csv
import hashlib
import json
import os
from pathlib import Path
import re
import subprocess
import sys


PKG = "viva.republica.toss"
LIBEA = Path("/Users/1004276/Downloads/AppSuit/avd-camouflage/libea56.so")
START_RE = re.compile(r"Start proc (\d+):viva\.republica\.toss/")
CREATED_RE = re.compile(r"viva\.republica\.toss \((\d+)\)")
FRAME_RE = re.compile(r"pc ([0-9a-f]+)\s+\S*libea56\.so")
THREAD_RE = re.compile(r'(?m)^"[^"\n]+"(?: daemon)? prio=')


def read_text(path):
    try:
        return Path(path).read_text(errors="replace")
    except OSError:
        return ""


def adb_value(*args):
    if os.environ.get("HNS_OFFLINE") == "1":
        return None
    try:
        return subprocess.check_output(
            ["adb", "shell", *args], text=True, stderr=subprocess.DEVNULL, timeout=10
        ).strip()
    except (OSError, subprocess.SubprocessError):
        return None


def json_events(path):
    events, malformed = [], 0
    for line in read_text(path).splitlines():
        line = line.strip()
        if not line or line.startswith("@@@"):
            continue
        try:
            item = json.loads(line)
        except json.JSONDecodeError:
            malformed += 1
            continue
        if isinstance(item, dict):
            events.append(item)
    return events, malformed


def created_pid(item):
    if item.get("log_name") != "process_created":
        return None
    match = CREATED_RE.search(str(item.get("value", "")))
    return match.group(1) if match else None


def original_slice(events, launch_pid):
    """Return only the original process' events, stopping at the next creation."""
    for pos, item in enumerate(events):
        if created_pid(item) != launch_pid:
            continue
        end = next(
            (i for i in range(pos + 1, len(events)) if created_pid(events[i])),
            len(events),
        )
        return events[pos:end]
    return []


def first(events, *, value=None, name=None):
    for item in events:
        if value is not None and item.get("value") == value:
            return item
        if name is not None and item.get("log_name") == name:
            return item
    return None


def process_observations(path, t0):
    sessions = {}
    polls = {}
    text = read_text(path)
    if not text:
        return [], polls
    for row in csv.DictReader(text.splitlines(), delimiter="\t"):
        try:
            poll = int(row["poll"])
            epoch = float(row["epoch"])
        except (KeyError, TypeError, ValueError):
            continue
        pid, ticks = row.get("pid", ""), row.get("starttime_ticks", "")
        polls.setdefault(poll, []).append((pid, ticks))
        if not pid or not ticks:
            continue
        key = (pid, ticks)
        if key not in sessions:
            sessions[key] = {
                "session_id": f"session-{len(sessions)}",
                "pid": pid,
                "starttime_ticks": ticks,
                "first_seen_s": round(epoch - t0, 3),
                "last_seen_s": round(epoch - t0, 3),
                "first_poll": poll,
                "last_poll": poll,
            }
        else:
            sessions[key]["last_seen_s"] = round(epoch - t0, 3)
            sessions[key]["last_poll"] = poll
    return list(sessions.values()), polls


def parse_stacks(stack_dir, launch_pid, launch_ticks):
    presence = {
        "afed8": 0, "0xa8f70": 0, "0x95224": 0,
        "AbsAppGuard": 0, "libtg": 0, "libea56": 0,
    }
    frames, thread_groups = {}, []
    files = sorted(stack_dir.glob("*.txt")) if stack_dir.is_dir() else []
    complete = 0
    mismatched = []
    for path in files:
        content = read_text(path)
        if "sysTid=" not in content:
            continue
        complete += 1
        match = re.search(r"_pid(\d+)(?:_start(\d+))?\.txt$", path.name)
        if match and launch_pid and match.group(1) != launch_pid:
            mismatched.append(path.name)
        elif match and launch_ticks and match.group(2) and match.group(2) != launch_ticks:
            mismatched.append(path.name)
        offsets_in_sample = set()
        for thread in THREAD_RE.split(content):
            offsets = [m.group(1).lstrip("0") or "0" for m in FRAME_RE.finditer(thread)]
            if not offsets:
                continue
            tid = re.search(r"sysTid=(\d+)", thread)
            thread_groups.append({
                "sample": path.name,
                "tid": tid.group(1) if tid else None,
                "frames": [f"0x{x}" for x in offsets],
            })
            offsets_in_sample.update(offsets)
            for offset in offsets:
                frames[offset] = frames.get(offset, 0) + 1
        if "b02c4" in offsets_in_sample or "afed8" in offsets_in_sample:
            presence["afed8"] += 1
        for key, offset in (("0xa8f70", "a8f70"), ("0x95224", "95224")):
            if offset in offsets_in_sample:
                presence[key] += 1
        for key, needle in (("AbsAppGuard", "AbsAppGuard"),
                            ("libtg", "libtg.so"), ("libea56", "libea56.so")):
            if needle in content:
                presence[key] += 1
    return presence, frames, thread_groups, len(files), complete, mismatched


def parse_params(params, effective):
    requested = {}
    for token in params.split():
        if "=" not in token:
            return False
        key, value = token.split("=", 1)
        requested[key] = value
    return all(effective.get(key) == value for key, value in requested.items())


def parse_run(rd, t0, t1, label, params, win=None, stacks_requested=None,
              reboot=None, fresh=None, app_uid=None, launch_ok=None):
    rd = Path(rd)
    logcat = read_text(rd / "logcat.txt")
    start_pids = START_RE.findall(logcat)
    launch_pid = start_pids[0] if start_pids else None
    sessions, polls = process_observations(rd / "process_observations.tsv", t0)
    sessions.sort(key=lambda item: (item["pid"] != launch_pid, item["first_seen_s"]))
    for index, session in enumerate(sessions):
        session["session_id"] = f"session-{index}"
    launch_sessions = [s for s in sessions if s["pid"] == launch_pid]
    launch_session = launch_sessions[0] if len(launch_sessions) == 1 else None
    launch_ticks = launch_session["starttime_ticks"] if launch_session else None

    snapshot_dir = rd / "logstore_snapshots"
    snapshots = sorted(snapshot_dir.glob("*.txt")) if snapshot_dir.is_dir() else []
    # Old runs have only logstore_raw.txt. They retain raw evidence but cannot
    # prove PID+starttime incarnation or continuous capture.
    if not snapshots:
        snapshots = [rd / "logstore_raw.txt"] if (rd / "logstore_raw.txt").exists() else []
    parsed = [(path, *json_events(path)) for path in snapshots]
    if launch_pid is None:
        candidates = [created_pid(item) for _, items, _ in parsed for item in items]
        launch_pid = next((pid for pid in candidates if pid), None)
    selected_path, selected_events, richest_count, merged_count = None, [], 0, 0
    seen_event_keys = set()
    malformed_count = sum(bad for _, _, bad in parsed)
    all_created_pids = set()
    for path, items, _ in parsed:
        all_created_pids.update(pid for pid in (created_pid(x) for x in items) if pid)
        segment = original_slice(items, launch_pid) if launch_pid else []
        if segment:
            merged_count += 1
        if len(segment) > richest_count:
            selected_path, richest_count = path, len(segment)
        for item in segment:
            key = item.get("log_id") or json.dumps(item, sort_keys=True, ensure_ascii=False)
            if key not in seen_event_keys:
                seen_event_keys.add(key)
                selected_events.append(item)
    original_session_seen = bool(selected_events)
    restart_count = max(0, len(start_pids) - 1)
    other_logstore_session = bool(all_created_pids - {launch_pid})

    statuses = []
    for row in csv.DictReader(read_text(rd / "snapshot_status.tsv").splitlines(), delimiter="\t"):
        statuses.append(row.get("status"))
    full_window = (
        win is not None and len(statuses) == win and all(x == "ok" for x in statuses)
        and bool(parsed) and original_slice(parsed[-1][1], launch_pid)
        and launch_session is not None and launch_session["last_poll"] == win
        and restart_count == 0 and not other_logstore_session
    )

    emu_events = [x for x in selected_events if x.get("value") == "raspEmulatorCallback detected"]
    hook = first(selected_events, value="raspHookCallback detected")
    post_events = [x for x in selected_events if x.get("value") == "postRaspResult"]
    fds_events = [x for x in selected_events if x.get("log_name") == "fds_detected"]
    exit_events = [x for x in selected_events if x.get("value") == "handleExitPlan"]
    emu = emu_events[0] if emu_events else None
    post = next((x for x in post_events if "emulator" in str((x.get("params") or {}).get("detected", "")).lower()),
                post_events[-1] if post_events else None)
    fds = next((x for x in fds_events if "EMULATOR" in str((x.get("params") or {}).get("result", ""))),
               fds_events[-1] if fds_events else None)
    exit_plan = exit_events[-1] if exit_events else None
    fds_result = (fds.get("params") or {}).get("result") if fds else None
    emulator_observed = bool(emu_events) or any(
        "EMULATOR" in str((x.get("params") or {}).get("result", "")) for x in fds_events
    )
    post_params = (post.get("params") or {}) if post else {}
    # Absence of a callback in 1 Hz snapshots is not a negative verdict. Require
    # an explicit detector-result event as well as a complete sampled window.
    explicit_non_emulator_result = (
        (post_params.get("detected") not in (None, "")
         and "emulator" not in str(post_params["detected"]).lower())
        or (fds_result not in (None, "") and "EMULATOR" not in str(fds_result))
    )

    exit_lines = []
    for line in logcat.splitlines():
        if "System.exit called, status:" not in line:
            continue
        pid_match = re.search(r"\(\s*(\d+)\)", line)
        time_match = re.search(r"(\d\d:\d\d:\d\d\.\d+)", line)
        code_match = re.search(r"System\.exit called, status: (\d+)", line)
        if pid_match and time_match and code_match and pid_match.group(1) == launch_pid:
            exit_lines.append([time_match.group(1), code_match.group(1)])

    maps_identity = read_text(rd / "maps_identity.tsv").strip().split("\t")
    maps_match = None
    if len(maps_identity) == 2:
        maps_match = bool(launch_ticks and maps_identity == [launch_pid, launch_ticks])
    elif (rd / "maps.txt").exists() and not (rd / "maps_identity.tsv").exists():
        maps_match = None  # legacy run: maps captured, but PID/starttime not recorded

    lkm_params = dict(
        line.split("=", 1) for line in read_text(rd / "lkm_params.txt").splitlines() if "=" in line
    )
    params_ok = parse_params(params, lkm_params)
    target_uid_covered = (
        app_uid in lkm_params.get("target_uids", "").split(",") if app_uid else None
    )
    presence, frames, thread_groups, sample_count, completed, stack_mismatch = parse_stacks(
        rd / "stacks", launch_pid, launch_ticks
    )
    contaminated = (
        restart_count > 0 or other_logstore_session or maps_match is False
        or bool(stack_mismatch) or not params_ok
        or target_uid_covered is False or launch_ok is False
    )
    incarnation_verified = bool(start_pids and launch_session and launch_ticks)
    valid_positive = original_session_seen and incarnation_verified and emulator_observed
    valid_negative = bool(
        full_window and incarnation_verified and explicit_non_emulator_result
        and not emulator_observed and not exit_lines
    )
    if contaminated:
        state = "CONTAMINATED"
    elif valid_positive:
        state = "DETECTED"
    elif valid_negative:
        state = "NOT_DETECTED"
    else:
        state = "INCONCLUSIVE"

    quality = {
        "state": "CONTAMINATED" if contaminated else ("VALID" if state in ("DETECTED", "NOT_DETECTED") else "INCONCLUSIVE"),
        "evidence_valid": state in ("DETECTED", "NOT_DETECTED"),
        "logstore_captured": original_session_seen,
        "logstore_snapshot_count": len(snapshots),
        "logstore_merged_snapshot_count": merged_count,
        "logstore_selected_snapshot": selected_path.name if selected_path else None,
        "logstore_malformed_lines": malformed_count,
        "original_session_seen": original_session_seen,
        "incarnation_verified": incarnation_verified,
        "restart_count": restart_count,
        "other_logstore_session_seen": other_logstore_session,
        "maps_pid_matches_session": maps_match,
        "stack_samples_requested": stacks_requested if stacks_requested is not None else sample_count,
        "stack_samples_launched": sample_count,
        "stack_samples_completed": completed,
        "stack_sampling_complete": (
            completed == stacks_requested if stacks_requested is not None else None
        ),
        "stack_session_mismatches": stack_mismatch,
        "params_readback_ok": params_ok,
        "target_uid_covered": target_uid_covered,
        "launch_command_ok": launch_ok,
        "complete_sampled_window": bool(full_window),
        "explicit_non_emulator_result": explicit_non_emulator_result,
        "legacy_capture": not (rd / "process_observations.tsv").exists(),
    }
    top_activities = sorted(set(re.findall(r"top=(viva\.republica\.toss/[^\s]+)", read_text(rd / "timeline.txt"))))
    old_alive = re.findall(r"t\+(\d+)s pid=(\d+)", read_text(rd / "timeline.txt"))
    last_alive = round(launch_session["last_seen_s"], 3) if launch_session else (
        int(next((t for t, pid in reversed(old_alive) if pid == launch_pid), 0)) if launch_pid else 0
    )
    verdict = {
        "_evidence": "original-session logstore + PID-scoped logcat + same-thread debuggerd frames",
        "verdict_state": state,
        "capture_quality": quality,
        "raspEmulatorCallback": (emu.get("params") or {}).get("debugInfo") if emu else None,
        "raspEmulatorCallbacks": [(x.get("params") or {}).get("debugInfo") for x in emu_events],
        "raspHookCallback": (hook.get("params") or {}).get("debugInfo") if hook else None,
        "detected": (post.get("params") or {}).get("detected") if post else None,
        "guardLevel": (post.get("params") or {}).get("guardLevel") if post else None,
        "attendingDetectorSet": (post.get("params") or {}).get("attendingDetectorSet") if post else None,
        "fds_result": fds_result,
        "fds_results": [(x.get("params") or {}).get("result") for x in fds_events],
        "fds_from": (fds.get("params") or {}).get("from") if fds else None,
        "exit_caller": (exit_plan.get("params") or {}).get("caller") if exit_plan else None,
        "exitPlan": (exit_plan.get("params") or {}).get("exitPlan") if exit_plan else None,
        "exit_plans": [(x.get("params") or {}).get("exitPlan") for x in exit_events],
        "emulator_observed": emulator_observed,
        "emulator_detected": True if state == "DETECTED" else (False if state == "NOT_DETECTED" else None),
        "displayed_at": (m.group(1) if (m := re.search(r"(\d\d:\d\d:\d\d\.\d+).*Displayed viva\.republica\.toss", logcat)) else None),
        "system_exit": exit_lines[-1] if exit_lines else None,
        "system_exit_count": len(exit_lines),
        "stack_not_found": "Stack not found in /proc/self/maps" in logcat,
        "top_activities": top_activities,
        "last_alive_s": last_alive,
        "handler_presence": presence,
        "libea56_stack_frames": frames,
        "libea56_thread_frame_groups": thread_groups,
    }

    def sha16(path):
        try:
            return hashlib.sha256(path.read_bytes()).hexdigest()[:16]
        except OSError:
            return None

    created = first(selected_events, name="process_created")
    reported_identity = (created.get("params") or {}) if created else {}
    meta = {
        "id": rd.name,
        "timestamp": t0,
        "label": label,
        "params": params,
        "duration_s": round(t1 - t0, 1),
        "launch_pid": launch_pid,  # first AMS Start proc, never end-of-window pgrep
        "process_sessions": sessions,
        "requested_win_polls": win,
        "requested_stack_samples": stacks_requested,
        "reboot_requested": reboot,
        "fresh_identity_requested": fresh,
        "app_uid": app_uid,
        "launch_command_ok": launch_ok,
        "libea56_sha256_16": sha16(LIBEA),
        "libea56_hash_source": "host file (not verified against loaded device mapping)",
        "sdk": adb_value("getprop", "ro.build.version.sdk"),
        "kernel": adb_value("uname", "-r"),
        "model": adb_value("getprop", "ro.product.model"),
        "model_source": "post-run adb getprop; may differ from app-observed Build identity",
        "app_reported_manufacturer": reported_identity.get("manufacturer"),
        "app_reported_model": reported_identity.get("model"),
        "lkm_params": lkm_params,
    }
    (rd / "meta.json").write_text(json.dumps(meta, indent=2, ensure_ascii=False) + "\n")
    (rd / "verdict.json").write_text(json.dumps(verdict, indent=2, ensure_ascii=False) + "\n")
    return meta, verdict


def main(argv):
    if len(argv) < 6:
        raise SystemExit(__doc__)
    rd, t0, t1, label, params, _legacy_pid = argv[:6]
    extra = argv[6:]
    value = lambda i: extra[i] if i < len(extra) and extra[i] != "" else None
    parse_run(
        rd, float(t0), float(t1), label, params,
        win=int(value(0)) if value(0) else None,
        stacks_requested=int(value(1)) if value(1) else None,
        reboot=bool(int(value(2))) if value(2) else None,
        fresh=bool(int(value(3))) if value(3) else None,
        app_uid=value(4),
        launch_ok=bool(int(value(5))) if value(5) else None,
    )


if __name__ == "__main__":
    main(sys.argv[1:])
