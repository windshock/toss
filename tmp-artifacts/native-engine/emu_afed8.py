#!/usr/bin/env python3
# emu_afed8.py — libea56 스캔 경로의 완전 정적 에뮬레이션 (§172)
# afed8(0, 0x5c000000, buf)를 Unicorn에서 오프라인 실행 — PLT는 파이썬 스텁.
import struct, sys
from unicorn import *
from unicorn.arm64_const import *

SO = '/Users/1004276/Downloads/toss/tmp-artifacts/native-engine/libea56_live.so'
data = open(SO,'rb').read()

BASE = 0x100000          # vaddr == file offset인 매핑(관측된 로드 지도와 동일하게 0x100000 단순 베이스)
SZ   = 0x200000          # 파일 0x186210 + BSS 여유
STACK = 0x7f00000000
STACK_SZ = 0x100000
SCRATCH = 0x600000000    # 스캔 버퍼
SCRATCH_SZ = 0x100000
TP = 0x500000000         # tpidr_el0 (stack guard slot)
HEAP = 0x400000000
HEAP_SZ = 0x400000

mu = Uc(UC_ARCH_ARM64, UC_MODE_ARM)
mu.mem_map(BASE, SZ)
mu.mem_write(BASE, data[:min(len(data), SZ)])
mu.mem_map(STACK, STACK_SZ)
mu.mem_map(SCRATCH, SCRATCH_SZ)
mu.mem_map(TP, 0x1000)
mu.mem_map(HEAP, HEAP_SZ)
# tpidr_el0: [tp+40] = stack guard 값(0) 쓰기 — f85a83a9 ldur x9,[x29,#-88] 비교용
mu.mem_write(TP+40, b'\x00'*8)
mu.reg_write(UC_ARM64_REG_TPIDR_EL0, TP)

# ── 정적 재배치 적용 (R_AARCH64_RELATIVE) ──
import struct as _s
e_shoff=_s.unpack_from('<Q',data,0x28)[0]; e_shentsize=_s.unpack_from('<H',data,0x3A)[0]; e_shnum=_s.unpack_from('<H',data,0x3C)[0]
nrel=0
for i in range(e_shnum):
    o=e_shoff+i*e_shentsize
    typ=_s.unpack_from('<I',data,o+4)[0]
    if typ!=4: continue
    sh_addr=_s.unpack_from('<Q',data,o+0x10)[0]
    sh_off=_s.unpack_from('<Q',data,o+0x18)[0]
    sh_size=_s.unpack_from('<Q',data,o+0x20)[0]
    for k in range(sh_size//24):
        r_off,r_info,r_add=_s.unpack_from('<QQq',data,sh_off+k*24)
        if (r_info & 0xffffffff)==1027:  # R_AARCH64_RELATIVE
            mu.mem_write(BASE+r_off, _s.pack('<Q', BASE+r_add))
            nrel+=1
print(f"relocations applied: {nrel}")

SP = STACK + STACK_SZ - 0x10000
mu.reg_write(UC_ARM64_REG_SP, SP)

log = []
# ── PT_DYNAMIC 기반 심볼 해석 (섹션헤더는 변조됨) ──
import struct as _s
_phoff=_s.unpack_from('<Q',data,0x20)[0]; _phes=_s.unpack_from('<H',data,0x36)[0]; _phn=_s.unpack_from('<H',data,0x38)[0]
_dyn=None
for i in range(_phn):
    o=_phoff+i*_phes
    if _s.unpack_from('<I',data,o)[0]==2:
        _dyn=_s.unpack_from('<Q',data,o+0x10)[0]
_dt={}
i=_dyn
while True:
    tag,val=_s.unpack_from('<Qq',data,i)
    if tag==0: break
    _dt.setdefault(tag,val); i+=16
sym_off=_dt[6]; str_off=_dt[5]; str_sz=_dt[10]
_strtab=data[str_off:str_off+str_sz]
sym_names=[]
n=( _dt.get(11,0) if 11 in _dt else 0 )
# 심볼 수: 해시나 직접 계산 대신 strsz 상한으로
k=0
while sym_off+k*24 < 0x186210:
    st_name=_s.unpack_from('<I',data,sym_off+k*24)[0]
    if st_name>=str_sz: break
    e=_strtab.find(b'\0',st_name)
    sym_names.append(_strtab[st_name:e].decode(errors='replace'))
    k+=1
print(f"dynsym: {len(sym_names)} symbols")
# GOT 스텁
STUB = 0x30000000
mu.mem_map(STUB, 0x10000)
mu.mem_write(STUB, b'\xc0\x03\x5f\xd6'*0x4000)
got_sym = {}
for i in range(e_shnum):
    o=e_shoff+i*e_shentsize
    typ=_s.unpack_from('<I',data,o+4)[0]
    if typ!=4: continue
    sh_off=_s.unpack_from('<Q',data,o+0x18)[0]
    sh_size=_s.unpack_from('<Q',data,o+0x20)[0]
    for k in range(sh_size//24):
        r_off,r_info,r_add=_s.unpack_from('<QQq',data,sh_off+k*24)
        t=r_info&0xffffffff; symi=r_info>>32
        if t==257:
            nm=sym_names[symi] if symi<len(sym_names) else ''
            a=STUB+0x100+len(got_sym)*8
            got_sym[a]=nm
            mu.mem_write(BASE+r_off, _s.pack('<Q', a))
print(f"GOT stubs: {len(got_sym)}:", [v for v in got_sym.values()])

# 범프 힙 할당자
IMPL = {}
def impl(name):
    def deco(fn):
        IMPL[name] = fn
        return fn
    return deco
HEAP_CUR=[HEAP+0x1000]
@impl('malloc')
def _malloc(mu, lr):
    n=mu.reg_read(UC_ARM64_REG_X0)
    a=HEAP_CUR[0]; HEAP_CUR[0]=(a+n+16)&~15
    mu.reg_write(UC_ARM64_REG_X0, a); return lr
@impl('calloc')
def _calloc(mu, lr):
    n=mu.reg_read(UC_ARM64_REG_X1)
    a=HEAP_CUR[0]; HEAP_CUR[0]=(a+n+16)&~15
    mu.mem_write(a, b'\x00'*n)
    mu.reg_write(UC_ARM64_REG_X0, a); return lr
@impl('realloc')
def _realloc(mu, lr):
    n=mu.reg_read(UC_ARM64_REG_X1)
    a=HEAP_CUR[0]; HEAP_CUR[0]=(a+n+16)&~15
    mu.reg_write(UC_ARM64_REG_X0, a); return lr
@impl('free')
def _free(mu, lr):
    mu.reg_write(UC_ARM64_REG_X0, 0); return lr


# ── 프로퍼티 세계 (camo33 실측값) ──
PROPS = {}
import subprocess
out = subprocess.run(['/Users/1004276/Library/Android/sdk/platform-tools/adb','-s','emulator-5554','shell','getprop'], capture_output=True, text=True).stdout
for line in out.splitlines():
    if ': [' in line:
        k,v = line.split(': [',1); v=v.rstrip(']')
        PROPS[k.strip()] = v
print(f"properties loaded: {len(PROPS)}")
import os
if os.environ.get('EMU_WORLD'):
    EMU_PROPS = {
        'ro.kernel.qemu': '1',
        'ro.hardware': 'ranchu',
        'ro.product.model': 'Android SDK built for x86',
        'ro.product.manufacturer': 'Google',
        'ro.build.fingerprint': 'google/sdk_gphone_x86/generic_x86:13/TP1A.220624.014/userdebug/test-keys',
        'ro.boot.qemu.avd_name': 'camo33',
        'qemu.sf.fake_camera': 'back',
        'init.svc.qemu-props': 'running',
        'ro.test_harness': '1',
        'ro.boot.redroid_net_dns1': '10.0.2.3',
    }
    PROPS.update(EMU_PROPS)
    print(f"EMU_WORLD injected: {len(EMU_PROPS)} tells")
PROP_NAMES = sorted(PROPS.keys())
PROP_TABLE = HEAP_CUR[0]
HEAP_CUR[0] = PROP_TABLE + len(PROP_NAMES)*8 + 0x1000
# prop_info 더미: 이름/값을 테이블 근처에 배치, prop_info* = 값 문자열 주소로 사용
pi_addr = {}
for i,n in enumerate(PROP_NAMES):
    v = PROPS[n]
    a = HEAP_CUR[0]; mu.mem_write(a, n.encode()+b'\x00'); HEAP_CUR[0]+= len(n)+8
    b = HEAP_CUR[0]; mu.mem_write(b, v.encode()+b'\x00'); HEAP_CUR[0]+= len(v)+8
    pi_addr[i] = (a,b)
    mu.mem_write(PROP_TABLE+i*8, struct.pack('<Q', a))

CBRET = 0x31000000
mu.mem_map(CBRET, 0x1000)
mu.mem_write(CBRET, b'\xc0\x03\x5f\xd6')

@impl('__system_property_foreach')
def _foreach(mu, lr):
    cb = mu.reg_read(UC_ARM64_REG_X0); cookie = mu.reg_read(UC_ARM64_REG_X1)
    n=0
    for i,(na,va) in pi_addr.items():
        mu.reg_write(UC_ARM64_REG_X0, na); mu.reg_write(UC_ARM64_REG_X1, cookie)
        mu.reg_write(UC_ARM64_REG_LR, CBRET)
        mu.emu_start(cb, CBRET, count=100000)
        n+=1
    mu.reg_write(UC_ARM64_REG_X0, n)
    return lr

@impl('__system_property_read_callback')
def _readcb(mu, lr):
    pi = mu.reg_read(UC_ARM64_REG_X0); cb = mu.reg_read(UC_ARM64_REG_X1); cookie = mu.reg_read(UC_ARM64_REG_X2)
    # pi_addr 역검색(이름 주소 → 값)
    for i,(na,va) in pi_addr.items():
        if na==pi:
            mu.reg_write(UC_ARM64_REG_X0, cookie); mu.reg_write(UC_ARM64_REG_X1, na); mu.reg_write(UC_ARM64_REG_X2, va); mu.reg_write(UC_ARM64_REG_X3, 0)
            mu.reg_write(UC_ARM64_REG_LR, CBRET)
            mu.emu_start(cb, CBRET, count=100000)
            break
    return lr

QUERIED=[]
@impl('__system_property_get')
def _get(mu, lr):
    name_p = mu.reg_read(UC_ARM64_REG_X0); buf = mu.reg_read(UC_ARM64_REG_X1)
    name = mu.mem_read(name_p, 128).split(b'\0')[0].decode(errors='replace')
    QUERIED.append(name)
    v = PROPS.get(name, '')
    mu.mem_write(buf, v.encode()+b'\x00')
    mu.reg_write(UC_ARM64_REG_X0, len(v))
    return lr

@impl('__system_property_find_nth')
def _find_nth(mu, lr):
    n = mu.reg_read(UC_ARM64_REG_X0)
    if 0 <= n < len(PROP_NAMES):
        mu.reg_write(UC_ARM64_REG_X0, pi_addr[n][0])
    else:
        mu.reg_write(UC_ARM64_REG_X0, 0)
    return lr

@impl('read')
def _read(mu, lr):
    mu.reg_write(UC_ARM64_REG_X0, 0); return lr   # EOF — 파일채널 비활성 상태
@impl('close')
def _close(mu, lr):
    mu.reg_write(UC_ARM64_REG_X0, 0); return lr
@impl('fopen')
def _fopen(mu, lr):
    mu.reg_write(UC_ARM64_REG_X0, 0); return lr   # 파일 전부 실패(정적 세계: 파일채널 OFF)
@impl('opendir')
def _opendir(mu, lr):
    mu.reg_write(UC_ARM64_REG_X0, 0); return lr
@impl('stat')
def _stat(mu, lr):
    mu.reg_write(UC_ARM64_REG_X0, 0xffffffffffffffff); return lr  # 없음


# ── VFS 모델 (카모33: 가드 눈에 보이는 상태 — LKM 차단 반영) ──
VFS_CONTENT = {
    '/proc/asound/cards': ' 0 [SoundCard      ]: virtio-snd - VirtIO SoundCard\n                        VirtIO SoundCard at pci/0000:00:01.0/virtio7\n',
    '/proc/self/cmdline': 'viva.republica.toss\x00',
    '/proc/self/status': 'Name:\tviva.republica.toss\nState:\tR (running)\nTgid:\t1\nPid:\t1\nPPid:\t1\nTracerPid:\t0\nUid:\t10179\t10179\t10179\t10179\nGid:\t10179\t10179\t10179\t10179\nFDSize:\t128\n',
    '/proc/self/maps': '740000000000-740100000000 rw-p 00000000 00:00 0\n',
    '/proc/version': 'Linux version 5.15.104-android13-8 (build@host) #1 SMP\n',
    '/proc/cpuinfo': 'processor\t: 0\nHardware\t: Qualcomm Technologies, Inc SM8550\n',
    '/sys/qemu_trace/state': None,      # absent
    '/system/fake-libs': None,          # absent
    '/dev/qemu_pipe': None,             # absent (LKM)
    '/dev/goldfish_pipe': None,         # absent(LKM 금지 아님-GL이용, 그러나 카모 세계 absent 처리는 위험 — 실제로는 존재; 일단 absent)
    '/system/bin/noxd': None,
    '/system/xbin/su': None,
}
VFS_EXIST = set(p for p,v in VFS_CONTENT.items() if v is not None)
@impl('stat')
def _stat(mu, lr):
    p = mu.reg_read(UC_ARM64_REG_X0)
    name = mu.mem_read(p, 256).split(b'\0')[0].decode(errors='replace')
    r = 0 if name in VFS_EXIST else 0xffffffffffffffff
    mu.reg_write(UC_ARM64_REG_X0, r); return lr
@impl('fopen')
def _fopen(mu, lr):
    p = mu.reg_read(UC_ARM64_REG_X0)
    name = mu.mem_read(p, 256).split(b'\0')[0].decode(errors='replace')
    if name in VFS_CONTENT and VFS_CONTENT[name] is not None:
        a = HEAP_CUR[0]; HEAP_CUR[0]+=0x100
        mu.mem_write(a+8, name.encode()+b'\x00')
        mu.mem_write(a, struct.pack('<Q', a+8))
        mu.reg_write(UC_ARM64_REG_X0, a); return lr
    mu.reg_write(UC_ARM64_REG_X0, 0); return lr
@impl('read')
def _read(mu, lr):
    fd = mu.reg_read(UC_ARM64_REG_X0); buf = mu.reg_read(UC_ARM64_REG_X1); n = mu.reg_read(UC_ARM64_REG_X2)
    if fd in VFS_FD:
        c = VFS_FD[fd]; take = c[:n]; VFS_FD[fd]=c[len(take):]
        mu.mem_write(buf, take); mu.reg_write(UC_ARM64_REG_X0, len(take)); return lr
    mu.reg_write(UC_ARM64_REG_X0, 0); return lr
@impl('fclose')
def _fclose(mu, lr):
    mu.reg_write(UC_ARM64_REG_X0, 0); return lr
@impl('opendir')
def _opendir(mu, lr):
    mu.reg_write(UC_ARM64_REG_X0, 0); return lr
VFS_FD = {}
_orig_fopen = IMPL['fopen']
def _fopen2(mu, lr):
    r = _orig_fopen(mu, lr)
    a = mu.reg_read(UC_ARM64_REG_X0)
    if a:
        name = mu.mem_read(mu.mem_read(a,8) if False else a+8, 256).split(b'\0')[0].decode(errors='replace')
        VFS_FD[a] = VFS_CONTENT.get(name,'').encode()
    return r
IMPL['fopen'] = _fopen2

def hook_plt(mu, addr, size, ud):
    # PLT 스텁: LR로 복귀하며 파이썬 구현
    lr = mu.reg_read(UC_ARM64_REG_LR)
    pc = mu.reg_read(UC_ARM64_REG_PC)
    return

# PLT 함수 주소 → 이름 매핑(파일 심볼에서)
plt_map = {}
import re
asm = open('/tmp/ea56_full.asm', errors='ignore').read()
for m in re.finditer(r'^\s*([0-9a-f]+):\s+\S+\s+bl\s+([0-9a-f]+) <(\w+)@plt>', asm, re.M):
    plt_map[int(m.group(2),16)] = m.group(3)
print(f"PLT 함수 {len(plt_map)}종:", sorted(set(plt_map.values())))

@impl('memset')
def _memset(mu, lr):
    d = mu.reg_read(UC_ARM64_REG_X0); c = mu.reg_read(UC_ARM64_REG_X1) & 0xff
    n = mu.reg_read(UC_ARM64_REG_X2)
    mu.mem_write(d, bytes([c])*n)
    mu.reg_write(UC_ARM64_REG_X0, d)
    return lr

@impl('memcpy')
def _memcpy(mu, lr):
    d = mu.reg_read(UC_ARM64_REG_X0); s = mu.reg_read(UC_ARM64_REG_X1)
    n = mu.reg_read(UC_ARM64_REG_X2)
    try: mu.mem_write(d, mu.mem_read(s, n))
    except: pass
    mu.reg_write(UC_ARM64_REG_X0, d)
    return lr

@impl('memmove')
def _memmove(mu, lr):
    return _memcpy(mu, lr)

writes = []
def hook_mem_write(uc, access, address, size, value, ud):
    if SCRATCH <= address < SCRATCH+SCRATCH_SZ:
        writes.append((address, size))

HOOKS = {}
def hook_code(uc, address, size, ud):
    # PLT 브랜치 감지: bl <plt>
    pass

def hook_intr(uc, intno, ud):
    pass

# 코드 훅: bl 대상이 PLT면 가로채기 — Unicorn에서는 코드훅으로 PC 검사 후 LR 복귀
GATE_HITS=[]
def hook_code_full(uc, address, size, ud):
    if address-BASE == 0xaffb8:
        x23 = uc.reg_read(UC_ARM64_REG_X0)  # x23=x0 직후
        GATE_HITS.append(x23)
        return
    if address in got_sym:
        name = got_sym[address]
        fn = IMPL.get(name)
        lr = uc.reg_read(UC_ARM64_REG_LR)
        if fn:
            fn(uc, lr)
        else:
            uc.reg_write(UC_ARM64_REG_X0, 0)
            if name not in HOOKS:
                HOOKS[name]=1
                print(f"[emu] unimplemented GOT: {name}")
        uc.reg_write(UC_ARM64_REG_PC, lr)
        return
    if address in plt_map:
        name = plt_map[address]
        fn = IMPL.get(name)
        lr = uc.reg_read(UC_ARM64_REG_LR)
        if fn:
            ret = fn(uc, lr)
            uc.reg_write(UC_ARM64_REG_PC, lr)
        else:
            # 미구현: 0 반환
            uc.reg_write(UC_ARM64_REG_X0, 0)
            uc.reg_write(UC_ARM64_REG_PC, lr)
            if name not in HOOKS:
                HOOKS[name] = 1
                print(f"[emu] unimplemented PLT: {name} (return 0)")

trace=[]
def hook_block(uc, address, size, ud):
    trace.append(address-BASE)
mu.hook_add(UC_HOOK_BLOCK, hook_block)
CALL_LOG=[]
_orig_impls = dict(IMPL)
def _wrap(name, fn):
    def w(mu, lr):
        CALL_LOG.append(name)
        return fn(mu, lr)
    return w
for _n,_f in list(IMPL.items()):
    IMPL[_n] = _wrap(_n, _f)
mu.hook_add(UC_HOOK_CODE, hook_code_full)
mu.hook_add(UC_HOOK_MEM_WRITE, hook_mem_write)

def on_unmapped(uc, access, address, size, value, ud):
    print(f"[!] unmapped access @0x{address:x} pc=0x{uc.reg_read(UC_ARM64_REG_PC)-BASE:x} size={size}")
    return False
mu.hook_add(UC_HOOK_MEM_UNMAPPED, on_unmapped)

# afed8 호출: x0=0(스캔), x1=0x5c000000, x2=스크래치 버퍼
AFED8 = 0xafed8
NEEDLE = __import__('os').environ.get('NEEDLE', '')
if NEEDLE:
    mu.mem_write(SCRATCH+0x1000, NEEDLE.encode()+b'\x00\x00\x00\x00')
mu.reg_write(UC_ARM64_REG_X0, 0)
mu.reg_write(UC_ARM64_REG_X1, 0x5c000000)
mu.reg_write(UC_ARM64_REG_X2, SCRATCH + 0x1000)
LR_RET = STACK + 0x1000   # 종료 감지용 마법 주소
mu.reg_write(UC_ARM64_REG_LR, LR_RET)

try:
    mu.emu_start(BASE+AFED8, LR_RET, timeout=60_000_000, count=50_000_000)
except UcError as e:
    print(f"[emu] stop: {e} pc=0x{mu.reg_read(UC_ARM64_REG_PC)-BASE:x}")
x0=mu.reg_read(UC_ARM64_REG_X0)
print(f"NEEDLE={NEEDLE!r} WORLD={'emu' if __import__('os').environ.get('EMU_WORLD') else 'clean'} => x0={hex(x0)} blocks={len(trace)} gate={len(GATE_HITS)}")
if x0:
    try:
        blob = mu.mem_read(x0, 96)
        print("  result struct:", bytes(blob)[:64])
        print("  ascii:", ''.join(chr(b) if 32<=b<127 else '.' for b in blob[:64]))
        # 포인터 역참조
        import struct as st
        for off in (0,8,16,24):
            v=st.unpack_from('<Q', blob, off)[0]
            if 0x400000000 <= v < 0x500000000:
                s2 = mu.mem_read(v, 64).split(b'\0')[0]
                print(f"  [{off}] -> {bytes(s2)!r}")
    except Exception as e: print("  read err", e)
# 스크래치/힙에 기록된 결과 문자열
sc = mu.mem_read(SCRATCH+0x1000, 256)
print("  buf after:", sc[:96])
import collections as _cc
print("stub call surface:", _cc.Counter(CALL_LOG).most_common(25))
print(f"gate hits: {len(GATE_HITS)}, nonzero: {sum(1 for g in GATE_HITS if g)}")
import collections as _c
for g,c in _c.Counter(hex(g) for g in GATE_HITS).most_common(10): print(f"  x23={g} x{c}")
print(f"queried props via get: {len(QUERIED)}")
import collections
for n,c in collections.Counter(QUERIED).most_common(30): print(f"  {n} x{c}")
# 힙 strings
hb = mu.mem_read(HEAP, HEAP_CUR[0]-HEAP)
open('/tmp/emu_heap.bin','wb').write(bytes(hb))
print(f"heap written: {HEAP_CUR[0]-HEAP} bytes")
open('/tmp/trace_%s.txt' % ('emu' if __import__('os').environ.get('EMU_WORLD') else 'clean'), 'w').write('\n'.join(hex(b) for b in trace))
print("first 40 blocks:", [hex(b) for b in trace[:40]])
print("last 10 blocks:", [hex(b) for b in trace[-10:]])
# 스크래치 버퍼 내용 덤프
buf = mu.mem_read(SCRATCH+0x1000, 0x8000)
open('/tmp/emu_scratch.bin','wb').write(bytes(buf))
print("saved /tmp/emu_scratch.bin")
