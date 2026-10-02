#!/usr/bin/env python3
"""check_gnu_hash.py — 시뮬레이트 bionic gnu_hash 룩업으로 surgery lib 심볼 해석 실패 검출"""
import struct, sys

def parse_elf(path):
    d = open(path, 'rb').read()
    assert d[:4] == b'\x7fELF' and d[4] == 2, "ELF64만"
    e_shoff, = struct.unpack_from('<Q', d, 0x28)
    e_shentsize, e_shnum, e_shstrndx = struct.unpack_from('<HHH', d, 0x3a)
    shs = []
    for i in range(e_shnum):
        o = e_shoff + i * e_shentsize
        name, typ, flags, addr, off, size, link, info, align, entsize = struct.unpack_from('<IIQQQQIIQQ', d, o)
        shs.append(dict(name=name, typ=typ, addr=addr, off=off, size=size, link=link, entsize=entsize))
    shstr = shs[e_shstrndx]
    def sname(n):
        e = d.index(b'\0', shstr['off'] + n)
        return d[shstr['off'] + n:e].decode()
    for s in shs: s['sname'] = sname(s['name'])
    return d, shs

def get_sec(shs, name):
    for s in shs:
        if s['sname'] == name: return s
    return None

def gnu_hash(name):
    h = 5381
    for c in name.encode():
        h = (h * 33 + c) & 0xffffffff
    return h

def analyze(path):
    d, shs = parse_elf(path)
    dynsym, dynstr, ghash = get_sec(shs, '.dynsym'), get_sec(shs, '.dynstr'), get_sec(shs, '.gnu.hash')
    nsym = dynsym['size'] // 24
    syms = []
    for i in range(nsym):
        st_name, st_info, st_other, st_shndx, st_value, st_size = struct.unpack_from('<IBBHQQ', d, dynsym['off'] + i * 24)
        end = d.index(b'\0', dynstr['off'] + st_name)
        nm = d[dynstr['off'] + st_name:end].decode()
        syms.append((nm, st_shndx))
    o = ghash['off']
    nbuckets, symoffset, bloom_size, bloom_shift = struct.unpack_from('<IIII', d, o)
    bloom = struct.unpack_from('<%dQ' % bloom_size, d, o + 16)
    buckets = struct.unpack_from('<%dI' % nbuckets, d, o + 16 + 8 * bloom_size)
    chain_off = o + 16 + 8 * bloom_size + 4 * nbuckets
    def chain(j):
        return struct.unpack_from('<I', d, chain_off + 4 * (j - symoffset))[0]
    def lookup(name):
        h = gnu_hash(name)
        # §180: bionic bloom — 단일 워드 (h>>6)%bloom_size 에 두 비트 모두
        mask = (1 << (h % 64)) | (1 << ((h >> bloom_shift) % 64))
        word = bloom[(h >> 6) % bloom_size]
        if (word & mask) != mask: return None
        b = buckets[h % nbuckets]
        if b == 0: return None
        if b < symoffset: return None
        j = b
        while True:
            c = chain(j)
            if (c | 1) == (h | 1):
                if syms[j][0] == name: return j
            if c & 1: return None
            j += 1
    # 정의된(export) 심볼 전수 룩업 — 실패 = 로더가 못 찾는 심볼
    defined = [nm for nm, shndx in syms if shndx != 0 and nm]
    fails = [nm for nm in defined if lookup(nm) is None]
    print(f"{path}: nsym={nsym} nbuckets={nbuckets} symoffset={symoffset} bloom_size={bloom_size}")
    print(f"  defined={len(defined)} lookup_fail={len(fails)}")
    for nm in fails[:10]: print(f"    FAIL: {nm}")
    return fails

if __name__ == '__main__':
    for p in sys.argv[1:]:
        analyze(p)
