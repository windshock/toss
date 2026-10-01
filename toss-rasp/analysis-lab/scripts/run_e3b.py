#!/usr/bin/env python3
"""§143-E3 — 미훅 함수군 반환값 캡처 (redroid). VM 홀드 없음."""
import json, subprocess, sys, time

ADB = "/Users/1004276/Library/Android/sdk/platform-tools/adb"
DEV = "localhost:5556"
PKG = "viva.republica.toss"
LAB = "/Users/1004276/Downloads/toss/toss-rasp/analysis-lab"
JS = LAB + "/scripts/hook_e3b_uname.js"
OUTLOG = LAB + "/artifacts/android/e3b_frida.log"

def adb(*a, timeout=15):
    return subprocess.run([ADB, "-s", DEV] + list(a), capture_output=True, text=True, timeout=timeout)

def main():
    import frida
    adb("shell", "am force-stop %s" % PKG)
    time.sleep(1)
    dm = frida.get_device_manager()
    dev = None
    try:
        dev = dm.get_device(DEV, timeout=8)
    except Exception:
        dev = frida.get_usb_device(timeout=8)
    print("[*] device:", dev.id, flush=True)
    pid = dev.spawn([PKG])
    print("[*] spawned pid=%d" % pid, flush=True)
    session = dev.attach(pid)
    logf = open(OUTLOG, "w")
    def on_message(message, data):
        ts = time.time()
        if message["type"] == "send":
            line = "%.3f %s" % (ts, json.dumps(message["payload"], ensure_ascii=False))
        else:
            line = "%.3f [!] %s" % (ts, message.get("description", str(message)))
        logf.write(line + "\n"); logf.flush()
        p = message.get("payload") or {}
        if not isinstance(p, dict) or p.get("ev") in ("dlsymX"):
            return  # 고빈도 이벤트는 콘솔 생략
        print("[E]", line[:240], flush=True)
    script = session.create_script(open(JS).read())
    script.on("message", on_message)
    script.load()
    dev.resume(pid)
    print("[*] resumed", flush=True)
    deadline = time.time() + 40
    while time.time() < deadline:
        time.sleep(1)
        try:
            dev.get_process(PKG)
        except Exception:
            print("[*] gone", flush=True)
            time.sleep(1.5)
            break
    try: session.detach()
    except Exception: pass
    logf.close()
    print("[*] log ->", OUTLOG, flush=True)

if __name__ == "__main__":
    main()
