#!/usr/bin/env python3
"""§152 — run the narrow MediaDrm deviceUniqueId hook against Toss.

Default mode is observe-only:
  python3 scripts/run_mediadrm_device_id.py --duration 35

Spoof mode changes only android.media.MediaDrm.getPropertyByteArray("deviceUniqueId"):
  python3 scripts/run_mediadrm_device_id.py --spoof-hex 00112233445566778899aabbccddeeff

The hook emits the raw Widevine ID bytes plus MD5/SHA-1/SHA-256.  Toss's
current logstore device_id is 32 hex chars, so MD5(raw) matching
314872ec... is the expected positive confirmation.
"""

import argparse
import json
import os
import re
import subprocess
import sys
import time
from pathlib import Path

try:
    import frida
except ModuleNotFoundError:
    fallback = Path.home() / ".pyenv" / "versions" / "3.11.4" / "bin" / "python"
    if fallback.exists() and Path(sys.executable) != fallback:
        os.execv(str(fallback), [str(fallback)] + sys.argv)
    raise

ADB = "/Users/1004276/Library/Android/sdk/platform-tools/adb"
DEV = "localhost:5556"
PKG = "viva.republica.toss"
ACT = "viva.republica.toss/.splash.SplashActivity"
LAB = Path("/Users/1004276/Downloads/AppSuit/avd-camouflage/analysis/toss-rasp/analysis-lab")
JS = LAB / "scripts" / "hook_mediadrm_device_id.js"
ART = LAB / "artifacts" / "android"


def sh(args, timeout=20):
    return subprocess.run(args, capture_output=True, text=True, timeout=timeout)


def adb_shell(cmd, timeout=20):
    return sh([ADB, "-s", DEV, "shell", cmd], timeout=timeout)


def clean_hex(s):
    if not s:
        return ""
    s = re.sub(r"^0x", "", s.strip(), flags=re.I)
    s = re.sub(r"[^0-9a-fA-F]", "", s)
    if len(s) % 2:
        raise SystemExit("--spoof-hex must contain an even number of hex digits")
    return s.lower()


def get_frida_device():
    dm = frida.get_device_manager()
    try:
        return dm.get_device(DEV, timeout=8)
    except Exception:
        return frida.get_usb_device(timeout=8)


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument("--duration", type=float, default=40.0)
    ap.add_argument("--spoof-hex", default="", help="replacement raw deviceUniqueId bytes, hex")
    ap.add_argument("--attach", action="store_true", help="attach to an already-running Toss process")
    ap.add_argument("--stack", action="store_true", help="include Java stack for the MediaDrm call")
    ap.add_argument("--block-exit", action="store_true", help="block System.exit/Runtime.exit and libea56 poison for observation")
    ap.add_argument("--out", default="", help="output log path")
    ap.add_argument("--no-force-stop", action="store_true", help="do not force-stop before spawn")
    args = ap.parse_args()

    spoof_hex = clean_hex(args.spoof_hex)
    ts = time.strftime("%Y%m%d-%H%M%S")
    mode = "spoof" if spoof_hex else "observe"
    out = Path(args.out) if args.out else ART / f"mediadrm_device_id_{mode}_{ts}.log"
    out.parent.mkdir(parents=True, exist_ok=True)

    src = JS.read_text()
    src = src.replace("__SPOOF_HEX__", spoof_hex)
    src = src.replace("__WANT_STACK__", "1" if args.stack else "0")
    src = src.replace("__BLOCK_EXIT__", "1" if args.block_exit else "0")

    dev = get_frida_device()
    print(f"[*] frida device: {dev.id}", flush=True)

    pid = None
    if args.attach:
        proc = dev.get_process(PKG)
        pid = proc.pid
        print(f"[*] attaching pid={pid}", flush=True)
        session = dev.attach(pid)
    else:
        if not args.no_force_stop:
            adb_shell(f"am force-stop {PKG}", timeout=8)
            time.sleep(0.4)
        pid = dev.spawn([PKG])
        print(f"[*] spawned pid={pid}", flush=True)
        session = dev.attach(pid)

    logf = out.open("w")

    def on_message(message, data):
        now = time.time()
        payload = message.get("payload")
        if payload is None:
            payload = {"type": message.get("type"), "description": message.get("description"), "stack": message.get("stack")}
        line = f"{now:.3f} {json.dumps(payload, ensure_ascii=False)}"
        logf.write(line + "\n")
        logf.flush()
        if isinstance(payload, dict):
            print("[E]", json.dumps(payload, ensure_ascii=False)[:500], flush=True)
        else:
            print("[E]", str(payload)[:500], flush=True)

    script = session.create_script(src)
    script.on("message", on_message)
    script.load()

    if not args.attach:
        dev.resume(pid)
        print("[*] resumed", flush=True)

    deadline = time.time() + args.duration
    while time.time() < deadline:
        time.sleep(0.5)
        try:
            dev.get_process(PKG)
        except Exception:
            print("[*] process gone", flush=True)
            time.sleep(1.0)
            break

    try:
        session.detach()
    except Exception:
        pass
    logf.close()
    print(f"[*] log -> {out}", flush=True)


if __name__ == "__main__":
    main()
