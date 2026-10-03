#!/usr/bin/env python3
"""sms_bridge.py — 에뮬레이터 ↔ macOS Messages.app 양방향 SMS 브릿지

송신 (emu → Mac):
  앱이 SmsManager로 보내면 프레임워크가 content://sms/sent에 기록 (라디오 불필요, 실측).
  이를 폴링해 macOS Messages.app로 전달한다 (--send 시 실제 전송, 기본 dry-run).

수신 (Mac → emu):
  macOS Messages.chat.db의 새 수신 메시지를 폴링해 `adb emu sms send`로 에뮬레이터에
  주입한다. 앱은 일반 수신 SMS와 동일하게 받는다 (broadcast + raw 테이블 + inbox).
  ※ inbox 저장은 기본 문자 앱(Google Messages)이 살아있어야 한다 —
    "process is bad"면 `adb shell pm clear com.google.android.apps.messaging`.

사용법:
  sms_bridge.py [--direction both|out|in] [--send] [--from 010...,+82...] [--interval 2] [--adb adb]
상태: ~/.cache/avd-sms-bridge/{seen.json,mac_rowid}
"""
import argparse
import glob
import json
import os
import re
import sqlite3
import subprocess
import sys
import time

STATE_DIR = os.path.expanduser("~/.cache/avd-sms-bridge")
STATE_FILE = os.path.join(STATE_DIR, "seen.json")
MAC_ROWID_FILE = os.path.join(STATE_DIR, "mac_rowid")
CHAT_DB = os.path.expanduser("~/Library/Messages/chat.db")

META_WORDS = {"streamtyped", "NSAttributedString", "NSMutableAttributedString",
              "NSObject", "NSMutableString", "NSString", "NSDictionary"}


def adb(args, adb_bin):
    return subprocess.run([adb_bin] + args, capture_output=True, text=True, timeout=15).stdout


# ── 송신 (emu → Mac) ──────────────────────────────────────────────────────────

def fetch_sent(adb_bin):
    out = adb(["shell", "content", "query", "--uri", "content://sms/sent",
               "--projection", "_id,address,body,date"], adb_bin)
    rows = []
    # 본문에 줄바꿈이 있으면 Row 블록이 여러 줄 — 블록 단위로 잘라 마지막 date까지 파싱
    for block in re.split(r"(?=Row:\s*\d+\s+_id=)", out):
        m = re.match(r"Row:\s*\d+\s+_id=(\d+),\s*address=([^,]*),\s*body=(.*),\s*date=\d+\s*$",
                     block.strip(), re.S)
        if m:
            rows.append({"id": m.group(1), "addr": m.group(2).strip(),
                         "body": m.group(3).strip()})
    return rows


def send_via_messages(addr, body):
    """osascript로 Messages.app 전송 — SMS 서비스(iPhone 문자 전달) 우선, 실패 시 iMessage.
    줄바꿈은 linefeed 연결로 보존(원본 포맷 유지)."""
    def esc(s):
        return s.replace("\\", "\\\\").replace('"', '\\"')

    parts = [esc(p) for p in body.split("\n")]
    apple_body = " & linefeed & ".join(f'"{p}"' for p in parts)
    script = f'''
    tell application "Messages"
        set smsSvc to (1st service whose service type = SMS)
        set b to buddy "{addr}" of smsSvc
        send {apple_body} to b
    end tell
    '''
    r = subprocess.run(["osascript", "-e", script], capture_output=True, text=True, timeout=25)
    if r.returncode == 0:
        return True, ""
    script2 = f'''
    tell application "Messages"
        set iSvc to (1st service whose service type = iMessage)
        set b to buddy "{addr}" of iSvc
        send {apple_body} to b
    end tell
    '''
    r2 = subprocess.run(["osascript", "-e", script2], capture_output=True, text=True, timeout=25)
    if r2.returncode == 0:
        return True, "(via iMessage)"
    return False, ((r.stderr or "") + " | " + (r2.stderr or "")).strip()[:300]


# ── 수신 (Mac → emu) ──────────────────────────────────────────────────────────

def extract_from_blob(blob):
    """attributedBody(typedstream)에서 메시지 텍스트 추출 — 최장 printable UTF-8 런."""
    if not blob:
        return ""
    runs = re.findall(rb'(?:[\x20-\x7e]|[\xc2-\xdf][\x80-\xbf]|[\xe0-\xef][\x80-\xbf]{2}|'
                      rb'[\xf0-\xf4][\x80-\xbf]{3}){2,}', blob)
    best = ""
    for r in runs:
        try:
            t = r.decode("utf8").strip()
        except Exception:
            continue
        if t in META_WORDS or any(m in t for m in META_WORDS):
            continue
        if len(t) > len(best):
            best = t
    return best


def fetch_mac_inbound(last_rowid, sender_filter):
    con = sqlite3.connect(f"file:{CHAT_DB}?mode=ro", uri=True)
    try:
        rows = con.execute(
            "SELECT message.ROWID, ifnull(handle.id,''), message.text, message.attributedBody "
            "FROM message LEFT JOIN handle ON message.handle_id = handle.ROWID "
            "WHERE message.is_from_me = 0 AND message.ROWID > ? "
            "ORDER BY message.ROWID", (last_rowid,)).fetchall()
    finally:
        con.close()
    out = []
    for rid, sender, text, blob in rows:
        body = (text or "").strip() or extract_from_blob(blob)
        if not body:
            continue
        # §191: typedstream 구조 메타가 다수 섞인 본문(사람 글 아님)은 주입하지 않는다
        meta_hits = sum(1 for w in META_WORDS if w in body)
        if meta_hits >= 2 or body.lstrip()[:2] in ("X$", ")a"):
            continue
        if sender_filter and sender not in sender_filter:
            continue
        out.append({"rowid": rid, "sender": sender or "unknown", "body": body})
    return out


def inject_sms(adb_bin, sender, body):
    body = re.sub(r"\s+", " ", body).strip()
    r = subprocess.run([adb_bin, "emu", "sms", "send", sender, body],
                       capture_output=True, text=True, timeout=15)
    return "OK" in (r.stdout + r.stderr)


# ── 상태 ──────────────────────────────────────────────────────────────────────

def load_json(path, default):
    try:
        with open(path) as f:
            return json.load(f)
    except Exception:
        return default


def save_json(path, data):
    os.makedirs(STATE_DIR, exist_ok=True)
    with open(path, "w") as f:
        json.dump(data, f)


def load_mac_rowid():
    """상태 없으면 None (첫 실행) — 0을 반환하면 chat.db 전체 히스토리가 재생된다(§191 사고)."""
    try:
        with open(MAC_ROWID_FILE) as f:
            return int(f.read().strip())
    except Exception:
        return None


def fetch_max_mac_rowid():
    con = sqlite3.connect(f"file:{CHAT_DB}?mode=ro", uri=True)
    try:
        return con.execute("SELECT ifnull(MAX(ROWID),0) FROM message").fetchone()[0]
    finally:
        con.close()


def save_mac_rowid(rid):
    os.makedirs(STATE_DIR, exist_ok=True)
    with open(MAC_ROWID_FILE, "w") as f:
        f.write(str(rid))


# ── 메인 ──────────────────────────────────────────────────────────────────────

def main():
    ap = argparse.ArgumentParser()
    ap.add_argument("--direction", choices=["both", "out", "in"], default="both")
    ap.add_argument("--send", action="store_true", help="emu→Mac 실제 전송 (기본 dry-run)")
    ap.add_argument("--from", dest="senders", default="",
                    help="Mac→emu 전달 대상 발신번호 필터 (쉼표 목록, 기본 전체)")
    ap.add_argument("--interval", type=float, default=2.0)
    ap.add_argument("--adb", default="adb")
    args = ap.parse_args()

    seen = set(load_json(STATE_FILE, []))
    last_mac = load_mac_rowid()
    if last_mac is None:
        last_mac = fetch_max_mac_rowid()
        save_mac_rowid(last_mac)
        print(f"[sms-bridge] 첫 실행 — 현재(rowid={last_mac}) 이후 신규 메시지만 처리 "
              f"(히스토리 재생 안 함)", flush=True)
    sender_filter = {s.strip() for s in args.senders.split(",") if s.strip()} or None
    print(f"[sms-bridge] 시작 (direction={args.direction}, "
          f"emu→Mac={'SEND' if args.send else 'DRY-RUN'}, interval={args.interval}s)")

    while True:
        try:
            if args.direction in ("both", "out"):
                for row in fetch_sent(args.adb):
                    if row["id"] in seen:
                        continue
                    seen.add(row["id"])
                    save_json(STATE_FILE, sorted(seen))
                    stamp = time.strftime("%H:%M:%S")
                    if args.send:
                        ok, err = send_via_messages(row["addr"], row["body"])
                        print(f"[{stamp}] {'SENT' if ok else 'SEND-FAIL'} "
                              f"{row['addr']}: {row['body']} {err}", flush=True)
                    else:
                        print(f"[{stamp}] [DRY-RUN emu→Mac] {row['addr']}: {row['body']}", flush=True)

            if args.direction in ("both", "in"):
                for row in fetch_mac_inbound(last_mac, sender_filter):
                    last_mac = max(last_mac, row["rowid"])
                    save_mac_rowid(last_mac)
                    ok = inject_sms(args.adb, row["sender"], row["body"])
                    stamp = time.strftime("%H:%M:%S")
                    print(f"[{stamp}] [{'INJECTED' if ok else 'INJECT-FAIL'} Mac→emu] "
                          f"{row['sender']}: {row['body'][:60]}", flush=True)
        except Exception as e:
            print(f"[!] {e}", file=sys.stderr, flush=True)
        time.sleep(args.interval)


if __name__ == "__main__":
    main()
