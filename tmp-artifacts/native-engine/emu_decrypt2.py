#!/usr/bin/env python3
# emu_decrypt2.py — 포획 문맥 + 실측 K2 표로 복호 루프 오프라인 재생 (§172 최종 검증)
import struct
from unicorn import *
from unicorn.arm64_const import *

SO='/Users/1004276/Downloads/toss/tmp-artifacts/native-engine/libea56_live.so'
data=open(SO,'rb').read()
BASE=0x100000; SZ=0x200000
STACK=0x7f00000000; STK=0x100000
SCR=0x600000000
mu=Uc(UC_ARCH_ARM64, UC_MODE_ARM)
mu.mem_map(BASE,SZ); mu.mem_write(BASE,data[:SZ])
mu.mem_map(STACK,STK); mu.mem_map(SCR,0x100000)
TP=0x500000000; mu.mem_map(TP,0x1000); mu.mem_write(TP+40,b'\0'*8)
mu.reg_write(UC_ARM64_REG_TPIDR_EL0,TP)
e_shoff=struct.unpack_from('<Q',data,0x28)[0]; e_shes=struct.unpack_from('<H',data,0x3A)[0]; e_shn=struct.unpack_from('<H',data,0x3C)[0]
for i in range(e_shn):
    o=e_shoff+i*e_shes
    if struct.unpack_from('<I',data,o+4)[0]!=4: continue
    sa=struct.unpack_from('<Q',data,o+0x10)[0]; so=struct.unpack_from('<Q',data,o+0x18)[0]; ss=struct.unpack_from('<Q',data,o+0x20)[0]
    for k in range(ss//24):
        r_off,r_info,r_add=struct.unpack_from('<QQq',data,so+k*24)
        if (r_info&0xffffffff)==1027: mu.mem_write(BASE+r_off, struct.pack('<Q',BASE+r_add))

# ── 포획 문맥(session175, 같은 런) ──
x9=0xa708a81e; x10=3; x11=0x020c222f; x12=5; x13=4
K2_X8 = bytes.fromhex('21210cd800000000000000000000000021210cd8308950ebf71c1e664315b5560094d2d5cfd71f3e7a6f12e51b1daa4d9290c39996 21f9d3e18c52034add3353'.replace(' ',''))
K2_X19 = bytes.fromhex('9290c3999621f9d3e18c52034add335301a52df88eace6fc5157b82c862328b65827f588cc38bcdc0f0cbb4200 35cec6de79a2a18dcd554406 61ee34ecc10ded'.replace(' ',''))
mu.mem_write(SCR, K2_X8[:64])                 # x8 표
mu.mem_write(SCR+0x30, K2_X19[:64])           # x19 표 (x19=x8+0x30)
mu.reg_write(UC_ARM64_REG_X8, SCR)
mu.reg_write(UC_ARM64_REG_X19, SCR+0x30)
mu.reg_write(UC_ARM64_REG_X14, BASE+0x185758)
mu.reg_write(UC_ARM64_REG_X16, BASE+0x1747ba)
mu.reg_write(UC_ARM64_REG_X9,x9); mu.reg_write(UC_ARM64_REG_X10,x10)
mu.reg_write(UC_ARM64_REG_X11,x11); mu.reg_write(UC_ARM64_REG_X12,x12)
mu.reg_write(UC_ARM64_REG_X13,x13)
mu.reg_write(UC_ARM64_REG_SP, STACK+STK-0x10000)
writes=[]
def hook_w(uc,access,address,size,value,ud):
    if BASE+0x174000 <= address < BASE+0x186210:
        writes.append((address-BASE-0x174000,size,value&((1<<(size*8))-1)))
mu.hook_add(UC_HOOK_MEM_WRITE, hook_w)
LR=STACK+0x8000
try:
    mu.emu_start(BASE+0x93ab0, LR, timeout=30_000_000, count=5_000_000)  # 저장 직후부터 이어 실행
except UcError as e:
    print("stop:",e,"pc=0x%x"%(mu.reg_read(UC_ARM64_REG_PC)-BASE))
print(f"writes: {len(writes)}")
live=open('/Users/1004276/Downloads/toss/toss-rasp/session171/rw_live.bin','rb').read()
emu_rw=bytes(mu.mem_read(BASE+0x174000,0x12210))
# 바이트 단위 비교(쓰기 지점)
ok=0; tot=0
for a,sz,v in writes:
    exp=v.to_bytes(sz,'little')
    got=live[a:a+sz]
    tot+=sz
    ok+= sum(1 for i in range(sz) if exp[i]==got[i])
print(f"쓰기 바이트 vs live 일치: {ok}/{tot}")
for a,sz,v in writes[:8]:
    exp=v.to_bytes(sz,'little'); got=live[a:a+sz]
    print(f"  @0x{0x174000+a:x}: emu={exp.hex()} live={got.hex()} {'OK' if exp==got else 'DIFF'}")
# 앵커 레코드
print("emu anchor 0x1747ba:", emu_rw[0x7ba:0x7d2])
print("live anchor        :", live[0x7ba:0x7d2])
