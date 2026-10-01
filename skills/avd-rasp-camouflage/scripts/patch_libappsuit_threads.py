#!/usr/bin/env python3
"""libAppSuit의 pthread_create/pthread_detach 임포트를 getpid로 재지향.

RASP(Emulator 등) 게이트가 Java 스레드(Thread-N 이름 = JNI attach)에서 돌며
에뮬레이터에서는 포인터 재배치를 생략해 SIGBUS(PC=0x41022)로 사망하는 것을 막기 위해,
탐지 워커 스레드가 아예 생성되지 않도록 dynsym의 pthread_create·pthread_detach의
st_name을 getpid로 바꾼다 (링커 레벨 패치 — 암호화 region은 건드리지 않음).

주의:
- pthread_detach도 같이 재지향해야 한다. create만 바꾸면 bionic이
  "invalid pthread_t ... passed to pthread_detach"로 SIGABRT한다.
- dynsym/strtab 위치는 PT_DYNAMIC(DT_SYMTAB/DT_STRSZ/DT_HASH)에서 동적으로 읽는다
  (섹션 헤더 없는 stripped 빌드 대응, 교훈 #11).

사용: python3 patch_libappsuit_threads.py <in.so> <out.so>
"""
import struct
import sys


def patch(d, targets=("pthread_create", "pthread_detach"), redirect_to="getpid"):
    def u16(o): return struct.unpack_from('<H', d, o)[0]
    def u32(o): return struct.unpack_from('<I', d, o)[0]
    def u64(o): return struct.unpack_from('<Q', d, o)[0]

    e_phoff = u64(0x20); e_phentsize = u16(0x36); e_phnum = u16(0x38)
    dyn, loads = None, []
    for i in range(e_phnum):
        o = e_phoff + i * e_phentsize
        t = u32(o)
        if t == 2: dyn = u64(o + 8)
        if t == 1: loads.append((u64(o + 8), u64(o + 16), u64(o + 32)))

    def v2f(va):
        for off, v, fs in loads:
            if v <= va < v + fs:
                return off + (va - v)
        raise ValueError(f"vaddr {hex(va)} not in any PT_LOAD")

    DT = {}; o = dyn
    while True:
        tag, val = struct.unpack_from('<qQ', d, o)
        if tag == 0: break
        DT.setdefault(tag, val); o += 16
    symtab, strtab = v2f(DT[6]), v2f(DT[5])
    nbucket = u32(v2f(DT[4])); n = u32(v2f(DT[4]) + 4 + 4 * nbucket)

    name_off = {}
    for i in range(n):
        so = v2f(symtab + i * 24)
        st_name = u32(so); st_shndx = u16(so + 6)
        if st_shndx == 0 and st_name:
            name = bytes(d[strtab + st_name:]).split(b'\0')[0].decode(errors='replace')
            name_off.setdefault(name, (st_name, so))
    redir_name, redir_st = redirect_to, name_off[redirect_to][0]
    patched = []
    for t in targets:
        if t not in name_off:
            if name_off.get(t + "(already)"):
                continue
            # 이미 재지향된 파일: 해당 이름의 심볼이 없으면 건너뜀 (멱등)
            patched.append(f"{t}(not found — already redirected?)")
            continue
        st, so = name_off[t]
        struct.pack_into('<I', d, so, redir_st)
        patched.append(f"{t}(st_name {hex(st)} -> {hex(redir_st)})")
    return d, patched


def main():
    # 사용: patch_libappsuit_threads.py <in.so> <out.so> [redirect_sym]
    #   redirect_sym: pthread_create/detach를 재지향할 심볼. 반드시 대상 libAppSuit의
    #   dynsym 임포트에 존재해야 하고, -1/비-제로 반환·인자 역참조 없는 것이 안전하다.
    #   monimo=getpid, 하나=prctl (하나 dynsym엔 getpid 없음).
    #   금지: sleep(포인터를 초로 잠), getenv/gettimeofday/pthread_mutex_init(0=성공
    #   반환→가짜 성공), fork(프로세스 폭발).
    src, dst = sys.argv[1], sys.argv[2]
    redirect_to = sys.argv[3] if len(sys.argv) > 3 else "getpid"
    d = bytearray(open(src, 'rb').read())
    d, patched = patch(d, redirect_to=redirect_to)
    open(dst, 'wb').write(d)
    print(f"patched (redirect→{redirect_to}):", ", ".join(patched))


if __name__ == '__main__':
    main()
