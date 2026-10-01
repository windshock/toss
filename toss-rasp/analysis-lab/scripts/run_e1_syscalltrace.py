#!/usr/bin/env python3
"""§139-E1 — 스푸핑 상태 redroid에서 배터리 중 raw syscall 전수 캡처.

순서 (S103 법칙 회피 — VM 홀드 없음, adb 항상 사용 가능):
 1. 게스트 ftrace 인스턴스 s139 리셋(버퍼 32MB/cpu, 이벤트 끔)
 2. frida spawn(프로세스 시작점 홀드) → pid 확보
 3. ftrace: 이벤트 필터 common_pid == pid 설정 → sys_enter/sys_exit enable
 4. resume → 메시지 수집(타임스탬프付き)
 5. 종료 후: 이벤트 끔 → trace 덤프
"""
import json, os, subprocess, sys, time

ADB = "/Users/1004276/Library/Android/sdk/platform-tools/adb"
DEV = "localhost:5556"
PKG = "viva.republica.toss"
T = "/sys/kernel/tracing/instances/s139"
LAB = "/Users/1004276/Downloads/toss/toss-rasp/analysis-lab"
JS = LAB + "/scripts/hook_e1_syscall.js"
OUTLOG = LAB + "/artifacts/android/e1_frida.log"
OUTTRACE = LAB + "/artifacts/android/e1_syscalls.txt"

def adb(*a, timeout=15):
    return subprocess.run([ADB, "-s", DEV] + list(a), capture_output=True, text=True, timeout=timeout)

def su(sh):
    return adb("shell", "su 0 sh -c '%s'" % sh).stdout

def guest(cmd, pid=0):
    return adb("shell", "su 0 sh /data/local/tmp/e1_setup.sh %s %d" % (cmd, pid)).stdout.strip()

def main():
    import frida
    # 1. ftrace 리셋 (게스트 스크립트 — 따옴표 파손 방지)
    print("[*] ftrace reset:", guest("reset"), flush=True)

    adb("shell", "am force-stop %s" % PKG)
    time.sleep(1)

    dm = frida.get_device_manager()
    dev = None
    try:
        dev = dm.get_device(DEV, timeout=8)
    except Exception:
        for d in dm.enumerate_devices():
            if d.id == DEV:
                dev = d
                break
    if dev is None:
        dev = frida.get_usb_device(timeout=8)
    print("[*] frida device:", dev.id, flush=True)

    pid = dev.spawn([PKG])
    print("[*] spawned pid=%d" % pid, flush=True)

    # 3. pid 필터 + 이벤트 켜기 (프로세스 홀드 중 — 배터리 전에 완료됨)
    r = guest("armall", pid)
    print("[*] ftrace armed for pid=%d -> filter=%r" % (pid, r), flush=True)

    # fd 폴러를 홀드 중 선시작 (프로세스가 멈춘 사이 구동 완료)
    subprocess.run([ADB, "-s", DEV, "shell",
        "su 0 sh -c 'rm -f /data/local/tmp/fdpoll.log; nohup sh /data/local/tmp/fd_poll.sh %d >/dev/null 2>&1 &'"],
        stdout=subprocess.DEVNULL, stderr=subprocess.DEVNULL, timeout=10)
    time.sleep(2.0)
    session = dev.attach(pid)
    with open(JS) as f:
        script = session.create_script(f.read())

    logf = open(OUTLOG, "w")
    def on_message(message, data):
        ts = time.time()
        if message["type"] == "send":
            line = "%.3f %s" % (ts, json.dumps(message["payload"], ensure_ascii=False))
        else:
            line = "%.3f [!] %s" % (ts, message.get("description", str(message)))
        logf.write(line + "\n")
        logf.flush()
        print("[E] " + line, flush=True)

    script.on("message", on_message)
    script.load()
    dev.resume(pid)
    print("[*] resumed @%.3f" % time.time(), flush=True)

    deadline = time.time() + 45
    while time.time() < deadline:
        time.sleep(1)
        try:
            dev.get_process(PKG)
        except Exception:
            print("[*] process gone @%.3f" % time.time(), flush=True)
            time.sleep(2)  # sys_exit 마지막 이벤트 flush 대기
            break

    # 5. 이벤트 끔 + 덤프
    guest("stop")
    time.sleep(1)
    tr = adb("shell", "su 0 cat %s/trace" % T, timeout=30).stdout
    open(OUTTRACE, "w").write(tr)
    n = len(tr.splitlines())
    print("[*] trace lines=%d -> %s" % (n, OUTTRACE), flush=True)
    logf.close()
    try:
        session.detach()
    except Exception:
        pass

if __name__ == "__main__":
    main()
