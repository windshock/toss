#!/usr/bin/env python3
# emu_decrypt.py — 포획 문맥으로 복호 루프(0x938d0)를 오프라인 재생 → rw_live와 대조
import struct, sys
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
# 정적 재배치
e_shoff=struct.unpack_from('<Q',data,0x28)[0]; e_shes=struct.unpack_from('<H',data,0x3A)[0]; e_shn=struct.unpack_from('<H',data,0x3C)[0]
for i in range(e_shn):
    o=e_shoff+i*e_shes
    if struct.unpack_from('<I',data,o+4)[0]!=4: continue
    sa=struct.unpack_from('<Q',data,o+0x10)[0]; so=struct.unpack_from('<Q',data,o+0x18)[0]; ss=struct.unpack_from('<Q',data,o+0x20)[0]
    for k in range(ss//24):
        r_off,r_info,r_add=struct.unpack_from('<QQq',data,so+k*24)
        if (r_info&0xffffffff)==1027: mu.mem_write(BASE+r_off, struct.pack('<Q',BASE+r_add))

# 포획 문맥 (session175, 첫 PW-T)
x9=0; x10=0; x11=0; x12=1; x13=0x100
# 레지스터 세팅
mu.reg_write(UC_ARM64_REG_X9,x9); mu.reg_write(UC_ARM64_REG_X10,x10)
mu.reg_write(UC_ARM64_REG_X11,x11); mu.reg_write(UC_ARM64_REG_X12,x12)
mu.reg_write(UC_ARM64_REG_X13,x13)
NEEDLE = b'/proc/self/cmdline\x00'
mu.mem_write(SCR, NEEDLE*4)
mu.reg_write(UC_ARM64_REG_X19, SCR)      # 가설: K2 테이블 = 바늘 버퍼
mu.reg_write(UC_ARM64_REG_X8, SCR)       # x8 = 같은 버퍼
mu.reg_write(UC_ARM64_REG_X14, BASE+0x185758)
mu.reg_write(UC_ARM64_REG_X16, BASE+0x1747ba)
mu.reg_write(UC_ARM64_REG_SP, STACK+STK-0x10000)
writes=[]
def hook_w(uc,access,address,size,value,ud):
    if BASE+0x174000 <= address < BASE+0x186210:
        writes.append((address-BASE-0x174000,size,value))
mu.hook_add(UC_HOOK_MEM_WRITE, hook_w)
LR=STACK+0x8000
try:
    mu.emu_start(BASE+0x938d0, LR, timeout=30_000_000, count=5_000_000)
except UcError as e:
    print("stop:",e,"pc=0x%x"%(mu.reg_read(UC_ARM64_REG_PC)-BASE))
print(f"writes to rw: {len(writes)}")
for a,sz,v in writes[:12]:
    print(f"  @0x{0x174000+a:x} sz={sz} val={v:#x}")
# 결과 대조
live=open('/Users/1004276/Downloads/toss/toss-rasp/session171/rw_live.bin','rb').read()
emu_rw=bytes(mu.mem_read(BASE+0x174000, 0x12210))
ok=sum(1 for a,sz,v in writes if emu_rw[a:a+sz]==live[a:a+sz])
print(f"라이브 일치: {ok}/{len(writes)}")
# 앵커 레코드 상태
print("emu @0x1747ba:", emu_rw[0x7ba:0x7d2])
print("live        :", live[0x7ba:0x7d2])
