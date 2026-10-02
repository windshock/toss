#!/usr/bin/env python3
# run_fn.py — 지정 오프셋의 libea56 함수를 Unicorn에서 실행, rw 변경 보고
import struct, sys
from unicorn import *
from unicorn.arm64_const import *
SO='/Users/1004276/Downloads/toss/tmp-artifacts/native-engine/libea56_live.so'
data=open(SO,'rb').read()
BASE=0x100000; SZ=0x200000
STACK=0x7f00000000; STK=0x200000
TP=0x500000000
mu=Uc(UC_ARCH_ARM64, UC_MODE_ARM)
mu.mem_map(BASE,SZ); mu.mem_write(BASE,data[:min(len(data),SZ)])
mu.mem_map(STACK,STK); mu.mem_map(TP,0x1000)
mu.reg_write(UC_ARM64_REG_TPIDR_EL0,TP)
# relocs
e_shoff=struct.unpack_from('<Q',data,0x28)[0]; e_shes=struct.unpack_from('<H',data,0x3A)[0]; e_shn=struct.unpack_from('<H',data,0x3C)[0]
for i in range(e_shn):
    o=e_shoff+i*e_shes
    if struct.unpack_from('<I',data,o+4)[0]!=4: continue
    so_=struct.unpack_from('<Q',data,o+0x18)[0]; ss=struct.unpack_from('<Q',data,o+0x20)[0]
    for k in range(ss//24):
        r_off,r_info,r_add=struct.unpack_from('<QQq',data,so_+k*24)
        if (r_info&0xffffffff)==1027: mu.mem_write(BASE+r_off, struct.pack('<Q',BASE+r_add))
SP=STACK+STK-0x40000
mu.reg_write(UC_ARM64_REG_SP,SP)
MAGIC=STACK+0x100
mu.reg_write(UC_ARM64_REG_LR,MAGIC)
writes=[]
def hw(uc,access,address,size,value,ud):
    if BASE+0x174000 <= address < BASE+0x186210:
        writes.append((address-BASE,size,value&(1<<(size*8))-1 if size<8 else value))
mu.hook_add(UC_HOOK_MEM_WRITE,hw)
stopped=[]
def code_hook(uc, address, size, ud):
    pass
mu.hook_add(UC_HOOK_CODE, code_hook)
entry=int(sys.argv[1],0)
try:
    mu.emu_start(BASE+entry, MAGIC, timeout=120_000_000, count=30_000_000)
except UcError as e:
    print(f"[stop] {e} pc=0x{mu.reg_read(UC_ARM64_REG_PC)-BASE:x}")
rw=bytes(mu.mem_read(BASE+0x174000,0x12210))
open(f'/tmp/fn_{entry:x}_rw.bin','wb').write(rw)
live=open('/Users/1004276/Downloads/toss/toss-rasp/session171/rw_live.bin','rb').read()
so_bytes=data[0x174000:0x186210]
changed=sum(1 for i in range(len(rw)) if rw[i]!=so_bytes[i])
blob_a, blob_b = 0x184110-0x174000, 0x1856c0-0x174000
rec_a, rec_b = 0x7b8, 0x7d2
print(f"entry 0x{entry:x}: rw-bytes-changed={changed} writes={len(writes)}")
print(f"  record1 match: {sum(1 for i in range(rec_a,rec_b) if rw[i]==live[i])}/{rec_b-rec_a}  {rw[rec_a:rec_b][:24]!r}")
print(f"  blob match:    {sum(1 for i in range(blob_a,blob_b) if rw[i]==live[i])}/{blob_b-blob_a}  {rw[blob_a:blob_a+24]!r}")
