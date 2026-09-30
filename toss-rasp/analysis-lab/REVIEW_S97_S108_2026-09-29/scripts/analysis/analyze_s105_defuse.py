#!/usr/bin/env python3
"""Offline def-use analyzer for probeS105_bank campaigns.

Input: toss_s105_bank.json (full-register step records + insn_bytes + reach).
Builds the executed instruction stream, computes load/store EAs from
pre-step registers (post-state = next step's pre-state), and answers:
  (1) packed-record store EAs + values (decoder strh quad region)
  (2) every store whose EA == the VM-bank slot (x29+w3*4 at the transition
      reads) - the first writer of 4 into the bank
  (3) def-use hops: record EAs -> loads -> registers -> stores -> ... -> bank
  (4) final w8=4 inputs (w9/w8/w10) traced back to the bank load
No guessing: only executed instructions with computed EAs/values."""
import json, re, sys
import capstone

ART = sys.argv[1] if len(sys.argv) > 1 else \
    "/Users/1004276/Downloads/AppSuit/avd-camouflage/analysis/toss-rasp/analysis-lab/artifacts/android/toss_s105_bank.json"
d = json.load(open(ART))
steps = d.get("success_steps") or []
ib = (d.get("success") or {}).get("insn_bytes") or {}
if not steps:
    print("no campaign steps in artifact; verdict:", d.get("verdict"))
    sys.exit(0)

md = capstone.Cs(capstone.CS_ARCH_ARM64, capstone.CS_MODE_LITTLE_ENDIAN)
_dis = {}
def dis(pc):
    if pc in _dis:
        return _dis[pc]
    h = ib.get(hex(pc))
    ins = None
    if h:
        for i in md.disasm(bytes.fromhex(h), pc):
            ins = i
            break
    _dis[pc] = ins
    return ins

def R(st, name):
    # records hold x0-x30/sp/pc; map wN->xN (low 32), wzr/xzr->0
    if name in ("wzr", "xzr"):
        return 0
    if name.startswith("w") and name[1:].isdigit():
        name = "x" + name[1:]
    if name.startswith("sw") or name.startswith("sx"):
        return 0
    v = st.get(name)
    return int(v, 16) if v else 0

def u32(x):
    return x & 0xFFFFFFFF

# --- build executed stream with post states
stream = []
for idx, st in enumerate(steps):
    post = steps[idx + 1] if idx + 1 < len(steps) else None
    stream.append({"i": st["i"], "pc": int(st["pc"], 16), "pre": st, "post": post})

MEM_RE = re.compile(r"\[(\w+)(?:,\s*(\w+))?(?:,\s*(\w+)\s*(?:#\d+)?)?\]")

def ea_of(ins, pre, memop_index=0):
    """compute effective address of the memory operand using pre regs"""
    ops = ins.op_str.split(", ")
    # find the bracketed operand
    m = re.search(r"\[([^\]]+)\]", ins.op_str)
    if not m:
        return None
    inner = m.group(1)
    parts = [p.strip() for p in inner.split(",")]
    base = parts[0]
    if base not in pre:
        return None
    addr = R(pre, base)
    if len(parts) == 2:
        p2 = parts[1]
        mim = re.match(r"#?(-?0x[0-9a-f]+|-?\d+)", p2)
        if mim:
            addr += int(mim.group(1), 0)
        else:
            # register operand, optional shift
            sh = 0
            msh = re.search(r"lsl\s*#(\d+)", p2)
            if msh:
                sh = int(msh.group(1))
            ext = re.search(r"(uxtw|sxtw|uxtx|sxtx|lsl)", p2)
            if p2.split()[0] in pre:
                addr += R(pre, p2.split()[0]) << sh
            else:
                return None
    elif len(parts) >= 3:
        # [xN, xM, shift form] - parts joined differently; handle simply
        return None
    return addr

print("steps:", len(steps), "distinct pcs:", len(ib))

# --- (1) decoder packing region stores
print("\n=== (1) packed-record stores (decoder region) ===")
record_eas = {}
for s in stream[:400]:
    ins = dis(s["pc"])
    if not ins:
        continue
    if ins.mnemonic in ("strh", "str", "strb", "stur") and 0xfffd22718f90 <= s["pc"] <= 0xfffd22719200:
        ea = ea_of(ins, s["pre"])
        # value: source register (first operand) pre value
        src = ins.op_str.split(",")[0].strip()
        val = R(s["pre"], src)
        if ins.mnemonic == "strh":
            val = u32(val) & 0xFFFF
        print("  step %d %#x %s %s -> EA=%s val=%s" %
              (s["i"], s["pc"], ins.mnemonic, ins.op_str,
               hex(ea) if ea else None, hex(val) if val is not None else None))
        if ea and val is not None:
            record_eas[ea] = val

# --- find the VM-bank reads (x0->4 transitions of ldr w0,[x29,w3,uxtw#2])
print("\n=== (2) VM-bank reads ===")
bank_slots = {}
for s in stream:
    ins = dis(s["pc"])
    if not ins:
        continue
    if ins.mnemonic == "ldr" and re.search(r"\[x29,\s*w\d+,\s*uxtw\s*#2\]", ins.op_str):
        m = re.search(r"\[x29,\s*(w\d+),", ins.op_str)
        if not m:
            continue
        idx_reg = m.group(1)
        w3 = u32(R(s["pre"], idx_reg))
        x29 = R(s["pre"], "x29")
        ea = x29 + w3 * 4
        post_val = None
        if s["post"]:
            dst = ins.op_str.split(",")[0].strip()
            post_val = u32(R(s["post"], dst))
        key = ea
        bank_slots.setdefault(key, []).append((s["i"], w3, post_val))
for ea, hits in bank_slots.items():
    print("  bank EA=%#x : %d reads (first: step %d, idx=%d, loaded=%s)" %
          (ea, len(hits), hits[0][0], hits[0][1],
           hex(hits[0][2]) if hits[0][2] is not None else "?"))

# --- (3) stores into bank EAs anywhere in the window
print("\n=== (3) stores INTO bank EAs (the writer of the bank slot) ===")
for ea in bank_slots:
    found = False
    for s in stream:
        ins = dis(s["pc"])
        if not ins or ins.mnemonic not in ("str", "strh", "strb", "stur", "stp"):
            continue
        e = ea_of(ins, s["pre"])
        if e is None:
            continue
        hit = (e == ea) or (ins.mnemonic == "stp" and e <= ea <= e + 8) or \
              (ins.mnemonic in ("str", "stur") and e <= ea < e + 8 and ins.mnemonic == "stur")
        if e == ea or (ins.mnemonic == "stp" and e <= ea <= e + 8):
            src = ins.op_str.split(",")[0].strip()
            val = R(s["pre"], src)
            if ins.mnemonic == "strh":
                val = u32(val) & 0xFFFF
            print("  step %d %#x %s %s -> bank EA=%#x val=%s" %
                  (s["i"], s["pc"], ins.mnemonic, ins.op_str, ea,
                   hex(val) if val is not None else "?"))
            found = True
    if not found:
        print("  bank EA=%#x : NO store within the campaign window (write predates the window)" % ea)

# --- (4) record EA -> subsequent loads (first hops)
print("\n=== (4) first loads of packed-record EAs ===")
for ea, val in list(record_eas.items())[:16]:
    hits = []
    for s in stream:
        ins = dis(s["pc"])
        if not ins or ins.mnemonic not in ("ldr", "ldur", "ldrh", "ldrb", "ldp"):
            continue
        e = ea_of(ins, s["pre"])
        if e == ea or (ins.mnemonic == "ldp" and e <= ea <= e + 8):
            dst = ins.op_str.split(",")[0].strip()
            pv = u32(R(s["post"], dst)) if s["post"] else None
            hits.append((s["i"], s["pc"], ins.mnemonic, dst, pv))
        if len(hits) >= 4:
            break
    if hits:
        print("  record EA=%#x (val=%#x):" % (ea, val))
        for h in hits:
            print("     step %d %#x %s %s (loaded=%s)" %
                  (h[0], h[1], h[2], h[3], hex(h[4]) if h[4] is not None else "?"))

# --- (5) final staging inputs: last writers of w8/w9/w10 before lib+0x110cf0
lib = None
for cand in stream:
    lr = R(cand["pre"], "x30")
    ins = dis(cand["pc"])
trs = d.get("x0_transitions") or []
if trs:
    last_prev = int(trs[-1]["prev_pc"], 16)
    lo, hi = last_prev - 0x14, last_prev + 0x10
else:
    lo, hi = 0, 0
tail = [s for s in stream if lo <= s["pc"] <= hi]
print("\n=== (5) final staging steps ===")
for s in tail:
    ins = dis(s["pc"])
    print("  step %d pc=%#x %s" % (s["i"], s["pc"],
          ("%s %s" % (ins.mnemonic, ins.op_str)) if ins else "(insn bytes missing)"))
    for reg in ("w8", "w9", "w10", "x6"):
        print("      pre %-3s=%s" % (reg, s["pre"].get(reg if reg.startswith("x") else "x" + reg[1:], "?")))
# last writers of x8/x9/x10 before the final step
fin = tail[-3] if len(tail) >= 3 else None
if fin:
    print("  last writes to x8/x9/x10 before step %d:" % fin["i"])
    for reg in ("x8", "x9", "x10"):
        lastw = None
        for s in stream:
            if s["i"] >= fin["i"]:
                break
            if reg not in s["pre"]:
                continue
            ins = dis(s["pc"])
            if ins and ins.op_str.split(",")[0].strip() == reg:
                lastw = (s["i"], s["pc"], "%s %s" % (ins.mnemonic, ins.op_str))
            if s["post"] and reg in s["post"] and s["post"][reg] != s["pre"].get(reg):
                ins2 = dis(s["pc"])
                lastw = (s["i"], s["pc"], ("%s %s" % (ins2.mnemonic, ins2.op_str)) if ins2 else "?")
        print("    %s <- %s" % (reg, lastw))
