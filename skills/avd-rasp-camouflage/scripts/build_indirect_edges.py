#!/usr/bin/env python3
"""29차: Hikari IndirectBranch 타깃 복구(1차) — libea56.so의 R_AARCH64_RELATIVE
(7,314개 text-target)를 테이블 삼는 `adrp+add; ldr xN,[tbl,#off]; ... br xN`
패턴을 정적으로 연결해 (branch_site, table_entry, text_target) edge를 낸다.
산출: indirect_edges.json — Ghidra xref 주입/CFG 복구의 입력.
확장 포인트: ldr 인덱스형/간접 다단 형태(현재 unmatched 4,917)는 unidbg 실행 트레이스로 보강."""
import subprocess, re, struct, json, sys
LIB = sys.argv[1] if len(sys.argv)>1 else "libea56.so"
OUT = sys.argv[2] if len(sys.argv)>2 else "indirect_edges.json"
text_lo, text_hi = 0x34000, 0x16f090
out = subprocess.run(["/opt/homebrew/opt/llvm/bin/llvm-readelf","-r",LIB],capture_output=True,text=True).stdout
relmap = {}
for ln in out.splitlines():
    m = re.match(r"^([0-9a-f]{16})\s+[0-9a-f]{16}\s+R_AARCH64_RELATIVE\s+([0-9a-f]+)\s*$", ln)
    if m: relmap[int(m.group(1),16)] = int(m.group(2),16)
data = open(LIB,"rb").read()
def s21(v): return v-(1<<21) if v&(1<<20) else v
sites=[]
for i in range(text_lo, text_hi-20, 4):
    w=struct.unpack_from("<I",data,i)[0]
    if (w>>22)==0b1111100101:
        rt=w&31; imm=((w>>10)&0xFFF)*8
        for j in range(1,5):
            w2=struct.unpack_from("<I",data,i+4*j)[0]
            if (w2&0xFFFFFC1F)==0xD61F0000 and ((w2>>5)&31)==rt:
                sites.append((i,rt,imm)); break
matched=[]
for (site,rt,imm) in sites:
    for back in (8,12,16):
        pc=site-back
        w0=struct.unpack_from("<I",data,pc)[0]
        if (w0>>24)!=0x90: continue
        rd=w0&31
        imm21=(((w0>>29)&3))|((((w0>>5)&0x7FFFF)<<2))
        if imm21&0x80000: imm21-=0x100000
        page=(pc & ~0xFFF)+(imm21<<12)
        w1=struct.unpack_from("<I",data,pc+4)[0]
        if (w1>>24)!=0x91 or ((w1>>5)&31)!=rd: continue
        v2=(w1>>10)&0xFFF
        if v2&0x800: v2-=0x1000
        ent=(page+v2+imm)&0xFFFFFFFFFFFF
        if ent in relmap:
            matched.append((site,ent,relmap[ent])); break
json.dump(matched, open(OUT,"w"))
print("RELATIVE=%d text_targets=%d sites=%d edges=%d -> %s" % (
    len(relmap), sum(1 for a in relmap.values() if text_lo<=a<text_hi),
    len(sites), len(matched), OUT))
