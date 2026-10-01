#!/usr/bin/env python3
"""toss_addr_resolve.py — ftrace 캡처의 pc/lr/far/sp 주소를 모듈+오프셋으로 자동 매핑

검토 반영(20차): 오프셋은 반드시 로드베이스 기준으로 계산한다.
  /proc/PID/maps의 각 행 [start-end perm offset ... path]에서:
    vaddr 오프셋 = addr - start            (심볼 조회용)
    file 오프셋  = addr - start + offset    (ELF 파일 기반 도구용)
두 값을 모두 출력한다 (20차의 세그먼트상대/파일오프셋 혼동 +0xcf44 vs 0xC7F44 방지).

지원 프롬프트 행:
  t20_pf / t20_sp / t21_gpr : do_mem_abort kprobe (far, esr, [x16, x29, x30,] sp?, pc, lr)
  t20_exit                  : __arm64_sys_exit_group kprobe (status, pc, lr)
  signal_deliver tracepoint : sig=11 전달 시점 (커널 앵커)

사용:
  toss_addr_resolve.py <maps파일> <주소(hex) ...>
  toss_addr_resolve.py <maps파일> --trace <ftrace파일> [--proc PID]
"""
import re, sys

def load_maps(path):
    rows = []
    for line in open(path, errors="replace"):
        p = line.split()
        if len(p) < 6: continue
        s, e = p[0].split("-")
        rows.append((int(s, 16), int(e, 16), int(p[2], 16), p[5]))
    return rows

def resolve(a, rows):
    for s, e, off, path in rows:
        if s <= a < e:
            return {"path": path, "voff": a - s, "foff": a - s + off, "perm": path and ""}
    return None

def fmt(r):
    if r is None: return "NOT-MAPPED(anon/JIT/커널)"
    return f"{r['path'].split('/')[-1]} vaddr+0x{r['voff']:x} file+0x{r['foff']:x}"

DFSC = {4:"변환폴트L0", 5:"변환폴트L1", 6:"변환폴트L2", 7:"변환폴트L3",
        0xc:"권한L1", 0xd:"권한L2", 0xe:"권한L3", 0xf:"권한L3",
        0x21:"정렬", 0x11:"MTE태그"}

def esr_decode(esr):
    ec = (esr >> 26) & 0x3f; dfsc = esr & 0x3f; wnr = (esr >> 6) & 1
    ec_name = {0x24: "EL0데이터어보트", 0x25: "EL1데이터어보트",
               0x20: "EL0명령어어보트", 0x21: "EL1명령어어보트"}.get(ec, f"EC0x{ec:x}")
    return f"esr=0x{esr:x}: {ec_name}, {DFSC.get(dfsc, f'DFSC0x{dfsc:x}')}, {'쓰기' if wnr else '읽기'}"

def main():
    maps = load_maps(sys.argv[1])
    args = sys.argv[2:]
    if args and args[0] == "--trace":
        i = args.index("--trace")
        tracef = args[i + 1]
        proc = args[args.index("--proc") + 1] if "--proc" in args else None
        faults, delivers, exits = [], [], []
        for line in open(tracef, errors="replace"):
            tidm = re.search(r"(\S+)-(\d+)\s+\[", line)
            tm = re.search(r"\s(\d+\.\d{6}): ", line)
            if not tidm or not tm: continue
            tid, t = tidm.group(2), float(tm.group(1))
            if "signal_deliver" in line and "sig=11" in line:
                delivers.append((t, tid)); continue
            m = re.search(r"t2[01]_(?:pf|sp|gpr):.*?far=0x([0-9a-f]+) esr=0x([0-9a-f]+) "
                          r"(?:x16=0x([0-9a-f]+) x29=0x([0-9a-f]+) x30=0x([0-9a-f]+) )?"
                          r"(?:sp=0x([0-9a-f]+) )?pc=0x([0-9a-f]+) lr=0x([0-9a-f]+)", line)
            if m:
                g = [None if m.group(k) is None else int(m.group(k), 16) for k in range(1, 9)]
                # (t, tid, far, esr, x16, x29, x30, sp, pc, lr)
                faults.append((t, tid, g[0], g[1], g[2], g[3], g[4], g[5], g[6], g[7]))
                continue
            m = re.search(r"t20_exit:.*status=0x([0-9a-f]+) pc=0x([0-9a-f]+) lr=0x([0-9a-f]+)", line)
            if m:
                exits.append((t, tid, int(m.group(1), 16), int(m.group(2), 16), int(m.group(3), 16)))
        print("== SIGSEGV 전달(sig=11) ↔ 해당 tid의 직전 사용자 fault (±50ms, 마지막 일치) ==")
        print("   (pc=0xffffffc0... 커널 모드 어보트 제외)")
        for dt, dtid in delivers:
            cands = [f for f in faults
                     if f[1] == dtid and 0 <= dt - f[0] < 0.05 and f[9] < 0xffffff0000000000]
            if not cands:
                print(f"  deliver t={dt} tid={dtid}: 사용자 fault 미일치 — "
                      f"마커 없는 변형(시그널 직행/툼스톤) 의심")
                continue
            f = cands[-1]
            t0, _, far, esr, x16, x29, x30, sp, pc, lr = f
            print(f"  deliver t={dt} tid={dtid} (+{(dt-t0)*1e6:.0f}µs)")
            print(f"    {esr_decode(esr)}")
            print(f"    far -> {fmt(resolve(far, maps))}")
            print(f"    pc  -> {fmt(resolve(pc, maps))}")
            print(f"    lr  -> {fmt(resolve(lr, maps))}")
            if sp is not None:
                print(f"    sp  -> {fmt(resolve(sp, maps))} (값 0x{sp:x})")
            if x16 is not None:
                print(f"    x16=0x{x16:x} x29=0x{x29:x} x30=0x{x30:x}")
            if far == 0 and pc is not None and pc > 0x700000000000:
                print("    ※ far=0 + 유저 pc(OAT/JIT): 컨트롤 전이 오염 의심. "
                      "sp 정상이면 저장 컨텍스트 오염(24-C), sp도 0 근처면 sp 붕괴.")
        print("== exit_group (pc/lr 매핑, 마지막 5건) ==")
        for t, tid, st, pc, lr in exits[-5:]:
            print(f"  t={t} tid={tid} status=0x{st:x}")
            print(f"    pc -> {fmt(resolve(pc, maps))}")
            print(f"    lr -> {fmt(resolve(lr, maps))}")
    else:
        for a in args:
            print(f"0x{a} -> {fmt(resolve(int(a, 16), maps))}")

if __name__ == "__main__":
    main()
