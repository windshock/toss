#!/bin/bash
# trace_run.sh — controlled-run collector for Toss RASP analysis harness.
# One command: baseline -> launch -> detection window (debuggerd -j stack sampling)
# -> structured evidence collection -> runs/<ID>/.
#
# Usage:
#   trace_run.sh [--reboot] [--label NAME] [--win POLLS] [--stacks N]
#                [--fresh] [--params "k=v k=v ..."]
#
# Evidence collected per run (runs/<ID>/):
#   meta.json verdict.json lkm_params.txt timeline.txt logcat.txt dmesg.txt
#   maps.txt maps_identity.tsv process_observations.tsv snapshot_status.tsv
#   logstore_snapshots/*.txt logstore_raw.txt stacks/*.txt
#
# Reliability rules baked in (per FINDINGS §78/§82):
#   - never uses "pid alive" as success metric (AMS auto-restart + zombies)
#   - trusts fresh-run logstore raspEmulatorCallback + debuggerd stacks
#   - pgrep -f (wrapped process argv0=app_process64 defeats pidof), with UID
#     and /proc/<pid>/stat starttime checks; logcat Start proc identifies launch PID
set -u
export PATH="$HOME/Library/Android/sdk/platform-tools:$PATH"
PKG=viva.republica.toss
HDIR="$(cd "$(dirname "$0")" && pwd)"
ROOT="$(cd "$HDIR/.." && pwd)"
RUNS="$ROOT/runs"
LS=/data/data/$PKG/files/logstore/logitems
SKILL="$HOME/.agents/skills/avd-rasp-camouflage/scripts"
dsh(){ adb shell "$@"; }
observe_processes(){
  # A process incarnation is PID + starttime (field 22 of /proc/PID/stat).
  # The UID check removes adb shell/pgrep self-matches. Disguised argv0 may
  # still evade pgrep; the parser marks missing observations inconclusive.
  dsh "for p in \$(pgrep -f '$PKG' 2>/dev/null); do
    [ -r /proc/\$p/stat ] || continue
    uid=\$(sed -n 's/^Uid:[[:space:]]*\\([0-9]*\\).*/\\1/p' /proc/\$p/status 2>/dev/null)
    [ \"\$uid\" = '$APP_UID' ] || continue
    stat_tail=\$(sed 's/.*) //' /proc/\$p/stat)
    [ \"\${stat_tail%% *}\" != Z ] || continue
    ticks=\$(printf '%s\\n' \"\$stat_tail\" | awk '{print \$20}')
    [ -n \"\$ticks\" ] && printf '%s:%s\\n' \"\$p\" \"\$ticks\"
  done" 2>/dev/null | tr -d '\r'
}

REBOOT=0; LABEL="run"; WIN=14; FRESH=0; PARAMS=""; STACKS=3
while [ $# -gt 0 ]; do case "$1" in
  --reboot) REBOOT=1;;
  --label) LABEL="$2"; shift;;
  --win) WIN="$2"; shift;;
  --stacks) STACKS="$2"; shift;;
  --fresh) FRESH=1;;
  --params) PARAMS="$2"; shift;;
  *) echo "unknown arg: $1"; exit 2;;
esac; shift; done
case "$WIN:$STACKS" in *[!0-9:]*|:*|*:) echo "--win and --stacks must be nonnegative integers" >&2; exit 2;; esac
[ "$WIN" -ge 1 ] || { echo "--win (poll count) must be >= 1" >&2; exit 2; }
case "$LABEL" in *[!a-zA-Z0-9_-]*|'') echo "--label must contain only letters, digits, _ or -" >&2; exit 2;; esac

ID="$(date +%Y%m%d-%H%M%S)-$LABEL"
RD="$RUNS/$ID"
[ ! -e "$RD" ] || { echo "run directory already exists: $RD" >&2; exit 1; }
mkdir -p "$RD/stacks" "$RD/logstore_snapshots"
echo "[run] $ID"

adb root > "$RD/adb_root.log" 2>&1 || { echo "adb root failed" >&2; exit 1; }

if [ "$REBOOT" = 1 ]; then
  echo "[baseline] reboot + boot_recover"
  adb reboot || exit 1
  adb wait-for-device 2>/dev/null || exit 1
  for i in $(seq 1 40); do [ "$(dsh getprop sys.boot_completed 2>/dev/null|tr -d '\r')" = 1 ] && break; sleep 3; done
  [ "$(dsh getprop sys.boot_completed 2>/dev/null|tr -d '\r')" = 1 ] || { echo "boot timeout" >&2; exit 1; }
  sleep 3; adb root >> "$RD/adb_root.log" 2>&1 || exit 1; sleep 2
  BOOT_UID=$(dsh "dumpsys package $PKG 2>/dev/null | sed -n 's/.*userId=\\([0-9][0-9]*\\).*/\\1/p' | head -1" 2>/dev/null | tr -d '\r')
  [ -n "$BOOT_UID" ] || { echo "could not resolve package UID after reboot" >&2; exit 1; }
  bash "$SKILL/boot_recover.sh" "$BOOT_UID,10179,10181" > "$RD/boot_recover.log" 2>&1 || { echo "boot_recover failed; see $RD/boot_recover.log" >&2; exit 1; }
fi
dsh "setenforce 0" >/dev/null 2>&1 || { echo "setenforce failed" >&2; exit 1; }
[ "$FRESH" = 1 ] && { echo "[fresh_identity]"; bash "$SKILL/fresh_identity.sh" > "$RD/fresh_identity.log" 2>&1 || exit 1; }
APP_UID=$(dsh "dumpsys package $PKG 2>/dev/null | sed -n 's/.*userId=\\([0-9][0-9]*\\).*/\\1/p' | head -1" 2>/dev/null | tr -d '\r')
[ -n "$APP_UID" ] || { echo "could not resolve $PKG UID" >&2; exit 1; }

# apply LKM param overrides
dsh 'for p in /sys/module/hide_kmod/parameters/*; do echo "$(basename $p)=$(cat $p 2>/dev/null)"; done' 2>/dev/null | tr -d '\r' > "$RD/lkm_params_before.txt"
if [ -n "$PARAMS" ]; then
  for kv in $PARAMS; do
    case "$kv" in *=*) ;; *) echo "invalid --params token: $kv" >&2; exit 2;; esac
    k="${kv%%=*}"; v="${kv#*=}"
    case "$k" in ''|*[!a-zA-Z0-9_]*) echo "invalid LKM parameter name: $k" >&2; exit 2;; esac
    case "$v" in ''|*[!a-zA-Z0-9_.,:-]*) echo "invalid LKM parameter value for $k" >&2; exit 2;; esac
  done
  for kv in $PARAMS; do k="${kv%%=*}"; v="${kv#*=}"
    dsh "echo $v > /sys/module/hide_kmod/parameters/$k" >/dev/null 2>&1 || { echo "LKM parameter write failed: $k" >&2; exit 1; }
  done
fi
dsh 'for p in /sys/module/hide_kmod/parameters/*; do echo "$(basename $p)=$(cat $p 2>/dev/null)"; done' 2>/dev/null | tr -d '\r' > "$RD/lkm_params.txt"
[ -s "$RD/lkm_params.txt" ] || { echo "LKM parameters unavailable" >&2; exit 1; }
for kv in $PARAMS; do k="${kv%%=*}"; v="${kv#*=}"
  actual=$(sed -n "s/^$k=//p" "$RD/lkm_params.txt" | head -1)
  [ "$actual" = "$v" ] || { echo "LKM parameter readback mismatch: $k" >&2; exit 1; }
done

# clean slate
dsh "am force-stop net.ib.android.smcard 2>/dev/null; am force-stop com.hanabank.oqf 2>/dev/null; am force-stop $PKG" >/dev/null 2>&1
sleep 1
dsh "rm -f $LS/*.json" >/dev/null 2>&1 || { echo "logstore clear failed" >&2; exit 1; }
dsh "logcat -c" >/dev/null 2>&1 || { echo "logcat clear failed" >&2; exit 1; }
dsh "dmesg -c" >/dev/null 2>&1 || { echo "dmesg clear failed" >&2; exit 1; }

# launch (AMS may still restart it; the parser tracks each incarnation)
T0=$(python3 -c 'import time;print(repr(time.time()))')
if dsh "am start -n $PKG/.splash.SplashActivity" > "$RD/launch.txt" 2>&1; then
  LAUNCH_OK=1
else
  LAUNCH_OK=0
fi

# Capture every live logstore state: the first callback snapshot often precedes
# postRaspResult/FDS/EXIT, while AMS may clear the store at the next launch.
: > "$RD/timeline.txt"
printf 'poll\tepoch\tpid\tstarttime_ticks\n' > "$RD/process_observations.tsv"
printf 'poll\tepoch\tstatus\tfile\n' > "$RD/snapshot_status.tsv"
SAMPLED=0; LPID=""; DBG_PID=""
for i in $(seq 1 "$WIN"); do
  # tombstoned accepts only one debuggerd intercept per target at a time.
  # Reap a finished request before considering the next; do not overlap them.
  if [ -n "$DBG_PID" ] && ! kill -0 "$DBG_PID" 2>/dev/null; then
    wait "$DBG_PID" || true
    DBG_PID=""
  fi
  NOW=$(python3 -c 'import time;print(repr(time.time()))')
  OBS=$(observe_processes)
  P=""; ST=""
  EVENTS=$(dsh "logcat -d -v time 2>/dev/null | grep -E 'Start proc [0-9]+:$PKG/|System.exit called'" 2>/dev/null | tr -d '\r')
  STARTPID=$(printf '%s\n' "$EVENTS" | sed -n "s/.*Start proc \([0-9][0-9]*\):$PKG\/.*/\1/p" | head -1)
  while IFS=: read -r op os; do
    [ -n "$op" ] || continue
    printf '%s\t%s\t%s\t%s\n' "$i" "$NOW" "$op" "$os" >> "$RD/process_observations.tsv"
    if [ -z "$P" ] || [ "$op" = "$STARTPID" ]; then P="$op"; ST="$os"; fi
  done <<< "$OBS"
  [ -n "$P" ] || printf '%s\t%s\t\t\n' "$i" "$NOW" >> "$RD/process_observations.tsv"
  TOP=$(dsh "dumpsys activity activities 2>/dev/null|grep -m1 topResumedActivity|grep -oE '$PKG/[^ }]*'"|tr -d '\r')
  EX=$(printf '%s\n' "$EVENTS" | grep -c 'System.exit called')
  echo "t+${i}s pid=${P:-DEAD} start=${ST:-none} top=${TOP:-none} exits=${EX:-0}" >> "$RD/timeline.txt"
  SNAP="$RD/logstore_snapshots/t$(printf '%04d' "$i")_pid${P:-none}_start${ST:-none}.txt"
  if dsh "cd $LS || exit 1; for f in *.json; do [ -f \"\$f\" ] || continue; echo \"@@@\$f\"; cat \"\$f\"; echo; done" > "$SNAP" 2>/dev/null; then
    printf '%s\t%s\tok\t%s\n' "$i" "$NOW" "$(basename "$SNAP")" >> "$RD/snapshot_status.tsv"
    if [ ! -s "$RD/logstore_raw.txt" ] && grep -qE 'raspEmulatorCallback|raspHookCallback|fds_detected' "$SNAP"; then
      cp "$SNAP" "$RD/logstore_raw.txt"
    fi
  else
    printf '%s\t%s\terror\t%s\n' "$i" "$NOW" "$(basename "$SNAP")" >> "$RD/snapshot_status.tsv"
  fi
  [ -n "$P" ] && LPID="$P"
  # capture maps WHILE ALIVE (needed for offset<->VA join) at first live poll
  if [ -n "$P" ] && [ ! -s "$RD/maps.txt" ]; then
    dsh "cat /proc/$P/maps 2>/dev/null" > "$RD/maps.txt" 2>/dev/null
    [ -s "$RD/maps.txt" ] && printf '%s\t%s\n' "$P" "$ST" > "$RD/maps_identity.tsv"
  fi
  # Non-code-patching stack sampling; debuggerd timing perturbation is NOT ruled out.
  if [ -n "$P" ] && [ "$SAMPLED" -lt "$STACKS" ] && [ "$i" -ge 2 ] && [ -z "$DBG_PID" ]; then
    dsh "debuggerd -j $P 2>/dev/null" > "$RD/stacks/t${i}s_pid${P}_start${ST}.txt" 2>/dev/null &
    DBG_PID=$!
    SAMPLED=$((SAMPLED+1))
  fi
  sleep 1
done
wait

# collect artifacts (maps were captured only while an identified process lived)
dsh "logcat -d -v time 2>/dev/null" > "$RD/logcat.txt" 2>/dev/null
dsh "dmesg 2>/dev/null" > "$RD/dmesg.txt" 2>/dev/null
# Legacy convenience file; per-poll snapshots are authoritative.
if [ ! -s "$RD/logstore_raw.txt" ]; then
  dsh "cd $LS || exit 1; for f in *.json; do [ -f \"\$f\" ] || continue; echo \"@@@\$f\"; cat \"\$f\"; echo; done" > "$RD/logstore_raw.txt" 2>/dev/null
fi
T1=$(python3 -c 'import time;print(repr(time.time()))')

# leave app stopped (deterministic end)
dsh "am force-stop $PKG" >/dev/null 2>&1

# parse -> verdict.json + meta.json
python3 "$HDIR/parse_run.py" "$RD" "$T0" "$T1" "$LABEL" "$PARAMS" "" "$WIN" "$STACKS" "$REBOOT" "$FRESH" "$APP_UID" "$LAUNCH_OK"
echo "[done] $RD"
[ -f "$RD/verdict.json" ] && cat "$RD/verdict.json"
