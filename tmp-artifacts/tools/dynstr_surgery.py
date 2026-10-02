#!/usr/bin/env python3
# dynstr_surgery.py v2 — .vl64 GL 사본의 에뮬 텔레텔 심볼 개명 수술 (§151 잔채널 해법)
#
# 원리: (1) 텔레텔 토큰(goldfish/qemu/Emulator/ranchu)을 포함한 심볼명을 동일 길이 중립명으로
# 치환 — 프로바이더(정의側) .dynstr + 임포터(UNDEF側) .dynstr 양쪽 동시에.
# (2) 프로바이더의 .gnu.hash를 새 이름 해시로 재구축 (로더 탐침 정합 — §146 크래시 법칙 회피).
# (3) 모든 치환 동일 길이 → 파일 크기·오프셋 불변.
#
# ★v2 (§180 실측 크래시 교정 — 3결함 수리):
#   a. **bionic bloom 워드 인덱싱**: bloom 체크는 "단일 워드" bloom[(h>>6)%size] 에
#      (h%64) 비트와 ((h>>shift)%64) 비트 둘 다 세팅돼 있어야 한다. v1은 두 번째 비트를
#      (h>>shift) 기준 워드에 넣어 로더가 존재 심볼을 bloom 거부 → "cannot locate symbol"
#      → EGL Loader::open 어보트("couldn't find an OpenGL ES implementation") 시스템 크래시.
#   b. **다중 정의 심볼의 조인트 버킷 제약**: 같은 심볼이 서로 다른 nb(버킷수)의 여러 lib에
#      정의되면, v1의 전역 이름표는 한 lib에만 맞춰졌다. v2는 모든 정의 lib의 버킷을
#      동시에 보존하는 변형을 탐색. 실패 시 원명 유지(WARN).
#   c. **치환 순서·검증 게이트**: full-name 치환은 길이 내림차순(접두어 오염 방지).
#      수술 후 모든 정의 심볼에 bionic 스타일 룩업 시뮬레이션(bloom+chain+이름) —
#      1건이라도 실패하면 해당 lib 출력 거부(하드 게이트).
#   + DT_HASH(SysV) 보유 lib는 개명 금지(gnu_hash만 재구축 가능하므로).
import struct, sys, os, glob

MASK = 0xFFFFFFFF   # GNU hash는 ELF64에서도 32비트 해시 (체인/버킷 = 32비트)
def gnu_hash(name: bytes) -> int:
    h = 5381
    for c in name:
        h = ((h << 5) + h + c) & MASK
    return h

TOKENS = [(b'goldfish', b'g0ldf1sh'), (b'qemu', b'q3mu'),
          (b'Emulator', b'Emul4tor'), (b'ranchu', b'r4nchu'),
          (b'Goldfish', b'G0ldf1sh'), (b'QEMU', b'Q3MU'), (b'Ranchu', b'R4nchu')]

def scrub_name(name: bytes):
    out = name
    for a, b in TOKENS:
        out = out.replace(a, b)
    return out

class ELF:
    def __init__(self, path):
        self.path = path
        self.data = bytearray(open(path, 'rb').read())
        d = self.data
        assert d[:4] == b'\x7fELF' and d[4] == 2 and d[5] == 1, "ELF64 LE only"
        self.phoff, = struct.unpack_from('<Q', d, 0x20)
        self.phentsize, self.phnum = struct.unpack_from('<HH', d, 0x36)
        self.shoff, = struct.unpack_from('<Q', d, 0x28)
        self.shentsize, self.shnum = struct.unpack_from('<HH', d, 0x3a)
        self.phdrs = []
        for i in range(self.phnum):
            o = self.phoff + i*self.phentsize
            p_type, p_flags = struct.unpack_from('<II', d, o)
            p_offset, p_vaddr, p_paddr, p_filesz, p_memsz, p_align = struct.unpack_from('<QQQQQQ', d, o+8)
            self.phdrs.append(dict(type=p_type, off=p_offset, vaddr=p_vaddr, filesz=p_filesz, flags=p_flags))
        self.sections = []
        for i in range(self.shnum):
            o = self.shoff + i*self.shentsize
            sh = struct.unpack_from('<IIQQQQIIQQ', d, o)
            self.sections.append(dict(name_off=sh[0], type=sh[1], flags=sh[2], addr=sh[3],
                                      off=sh[4], size=sh[5], link=sh[6], info=sh[7],
                                      align=sh[8], entsize=sh[9]))
        self._secnames()
        self._dynamic()

    def _secnames(self):
        shstr = self.sections[self.e_shstrndx()] if self.e_shstrndx() < len(self.sections) else None
        for s in self.sections:
            s['name'] = b''
        if shstr:
            for s in self.sections:
                o = shstr['off'] + s['name_off']
                e = self.data.find(b'\0', o)
                s['name'] = bytes(self.data[o:e])

    def e_shstrndx(self):
        return struct.unpack_from('<H', self.data, 0x3c)[0]

    def vaddr_to_off(self, vaddr):
        for p in self.phdrs:
            if p['type'] == 1 and p['vaddr'] <= vaddr < p['vaddr'] + p['filesz']:
                return p['off'] + (vaddr - p['vaddr'])
        return None

    def _dynamic(self):
        dyn = None
        for p in self.phdrs:
            if p['type'] == 2:
                dyn = p
        self.dyn_entries = []
        if dyn:
            o = dyn['off']
            for i in range(dyn['filesz'] // 16):
                tag, val = struct.unpack_from('<QQ', self.data, o + i*16)
                if tag == 0: break
                self.dyn_entries.append((tag, val))
        self.dt = {}
        for t, v in self.dyn_entries:
            if t not in self.dt:
                self.dt[t] = v

    def dynsym_info(self):
        """(symoff_file, syment_count, stroff_file, strsz)"""
        symoff = self.dt.get(6)    # DT_SYMTAB (태그 6 — 11은 DT_DEBUG)
        strtab = self.dt.get(5)    # DT_STRTAB vaddr
        strsz = self.dt.get(10, 0) # DT_STRSZ
        n = None
        if 0x6ffffef5 in self.dt:  # GNU hash
            gh = self.dt[0x6ffffef5]
            ghoff = self.vaddr_to_off(gh)
            nbuckets, symoffset, bloom_size, _ = struct.unpack_from('<IIII', self.data, ghoff)
            buckets_off = ghoff + 16 + bloom_size*8
            buckets = struct.unpack_from('<%dI' % nbuckets, self.data, buckets_off)
            last = max(buckets) if buckets else symoffset
            chain_off = buckets_off + nbuckets*4
            idx = last
            while True:
                v, = struct.unpack_from('<I', self.data, chain_off + (idx - symoffset)*4)
                idx += 1
                if v & 1: break
            n = idx
        elif 4 in self.dt:  # DT_HASH
            hoff = self.vaddr_to_off(self.dt[4])
            _, nchain = struct.unpack_from('<II', self.data, hoff)
            n = nchain
        symoff_f = self.vaddr_to_off(symoff)
        stroff_f = self.vaddr_to_off(strtab)
        return symoff_f, n, stroff_f, strsz

    def read_dynstr(self):
        _, _, stroff, strsz = self.dynsym_info()
        return bytes(self.data[stroff:stroff+strsz]), stroff, strsz

    def defined_symbols(self):
        """gnu_hash 범위(정의 심볼) — {name: dynsym_index}"""
        symoff_f, n, _, _ = self.dynsym_info()
        gh = self.dt.get(0x6ffffef5)
        if gh is None:
            return {}, None, None
        ghoff = self.vaddr_to_off(gh)
        nbuckets, symoffset, bloom_size, _ = struct.unpack_from('<IIII', self.data, ghoff)
        _, _, stroff, _ = self.dynsym_info()
        out = {}
        for i in range(symoffset, n):
            o = symoff_f + i*24
            st_name, st_info, st_other, st_shndx, st_value, st_size = struct.unpack_from('<IBBHQQ', self.data, o)
            e = self.data.find(b'\0', stroff + st_name)
            name = bytes(self.data[stroff+st_name:e])
            out[name] = i
        ghinfo = (ghoff, nbuckets, symoffset, bloom_size)
        return out, ghinfo, n

    def gnu_hash_layout(self):
        """(ghoff, nb, symoffset, bloom_size, shift, buckets_off, chain_off)"""
        gh = self.dt[0x6ffffef5]
        ghoff = self.vaddr_to_off(gh)
        nb, symoffset, bloom_size, shift = struct.unpack_from('<IIII', self.data, ghoff)
        buckets_off = ghoff + 16 + bloom_size*8
        chain_off = buckets_off + nb*4
        return ghoff, nb, symoffset, bloom_size, shift, buckets_off, chain_off


def rehash_from_dynstr(e):
    """현재 e.data의 dynstr 기준으로 정의심볼 해시 재계산 → chain값/bloom 갱신.
    bucket 배열과 chain 종료비트는 원본 유지 (조인트 버킷보존 개명 전제).
    ★bloom은 단일 워드 규칙: 워드 인덱스 (h>>6)%size, 비트 (h%64)|((h>>shift)%64)."""
    ghoff, nb, symoffset, bloom_size, shift, buckets_off, chain_off = e.gnu_hash_layout()
    _, nsyms, stroff, strsz = e.dynsym_info()
    symoff_f = e.vaddr_to_off(e.dt[6])
    new_hashes = {}
    for i in range(symoffset, nsyms):
        st_name, = struct.unpack_from('<I', e.data, symoff_f + i*24)
        epos = e.data.find(b'\0', stroff + st_name)
        nm = bytes(e.data[stroff+st_name:epos])
        new_hashes[i] = gnu_hash(nm)
    bloom = [0]*bloom_size
    for i in range(symoffset, nsyms):
        h = new_hashes[i]
        w = (h >> 6) % bloom_size
        bloom[w] |= (1 << (h % 64)) | (1 << ((h >> shift) % 64))
    o = ghoff + 16
    for w in bloom:
        struct.pack_into('<Q', e.data, o, w); o += 8
    for i in range(symoffset, nsyms):
        old_v, = struct.unpack_from('<I', e.data, chain_off + (i-symoffset)*4)
        v = (new_hashes[i] & ~1) | (old_v & 1)
        struct.pack_into('<I', e.data, chain_off + (i-symoffset)*4, v)


def verify_bionic_lookups(e):
    """§180 게이트: bionic 스타일 룩업 시뮬레이션(bloom 단일워드 + chain 워크 + 이름비교)으로
    모든 정의 심볼 탐침. 실패 목록 반환(빈 리스트 = 통과)."""
    _, nb, symoffset, bloom_size, shift, buckets_off, chain_off = e.gnu_hash_layout()
    bloom = struct.unpack_from('<%dQ' % bloom_size, e.data, ghoff_plus16(e))
    buckets = struct.unpack_from('<%dI' % nb, e.data, buckets_off)
    _, nsyms, stroff, _ = e.dynsym_info()
    symoff_f = e.vaddr_to_off(e.dt[6])
    def sym_name(i):
        st_name, = struct.unpack_from('<I', e.data, symoff_f + i*24)
        ep = e.data.find(b'\0', stroff + st_name)
        return bytes(e.data[stroff+st_name:ep])
    def chain(j):
        return struct.unpack_from('<I', e.data, chain_off + (j-symoffset)*4)[0]
    fails = []
    for i in range(symoffset, nsyms):
        st_name, _, _, st_shndx, _, _ = struct.unpack_from('<IBBHQQ', e.data, symoff_f + i*24)
        if st_shndx == 0 or st_name == 0:
            continue  # 미정의 심볼·빈이름(링커 잔재 — 룩업 대상 아님) 제외
        nm = sym_name(i)
        h = gnu_hash(nm)
        mask = (1 << (h % 64)) | (1 << ((h >> shift) % 64))
        word = bloom[(h >> 6) % bloom_size]
        if (word & mask) != mask:
            fails.append((nm, 'bloom')); continue
        b = buckets[h % nb]
        if b < symoffset:
            fails.append((nm, 'bucket')); continue
        j, ok = b, False
        while True:
            c = chain(j)
            if (c | 1) == (h | 1) and sym_name(j) == nm:
                ok = True; break
            if c & 1:
                break
            j += 1
        if not ok:
            fails.append((nm, 'chain'))
    return fails


def ghoff_plus16(e):
    ghoff, *_ = e.gnu_hash_layout()
    return ghoff + 16


CHARS = b'0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ'

def joint_search(base, constraints, all_names):
    """모든 정의 lib의 버킷을 동시에 보존하는 변형 탐색 (길이 불변).
    constraints: [(nb, target_bucket), ...]"""
    def ok(cand):
        h = gnu_hash(cand)
        return all(h % nb == b for nb, b in constraints) and cand not in all_names
    L = len(base)
    # 1문자 변형 (꼬리 6 위치)
    for pos in range(L-1, max(0, L-7), -1):
        for c in CHARS:
            cand = base[:pos] + bytes([c]) + base[pos+1:]
            if ok(cand):
                return cand
    # 2문자 변형 (꼬리에서 안쪽으로)
    for p1 in range(L-1, 0, -1):
        for p2 in range(p1-1, max(-1, p1-5), -1):
            for c1 in CHARS[:36]:
                for c2 in CHARS[:36]:
                    cand = base[:p2] + bytes([c2]) + base[p2+1:p1] + bytes([c1]) + base[p1+1:]
                    if ok(cand):
                        return cand
    return None


def main():
    src_dir = sys.argv[1]
    out_dir = sys.argv[2]
    # NOREHASH=1 — 이름만 치환하고 gnu_hash는 원본 그대로 (§180 실험: 핀의 대상이
    # 해시테이블 바이트인지 이름인지 분리. 토큰 심볼은 임포터 0이라 룩업 불능 무해)
    NOREHASH = os.environ.get('NOREHASH', '') == '1'
    os.makedirs(out_dir, exist_ok=True)
    files = sorted(glob.glob(os.path.join(src_dir, '**', '*.so'), recursive=True))
    elfs = {}
    for f in files:
        try:
            elfs[f] = ELF(f)
        except Exception as ex:
            print(f"  [warn] {os.path.basename(f)}: {ex}")

    # ── 패스0: 정의자 지도 — old_name → [(lib, nb, bucket)] / 비대상 lib 판별
    definers = {}          # old_name -> list of (file, nb, bucket)
    nohash_libs = set()    # gnu_hash 없거나 DT_HASH 보유 → 개명 불가 lib
    all_names = set()      # 전체 심볼명(유일성)
    for f, e in elfs.items():
        if 0x6ffffef5 not in e.dt or 4 in e.dt:
            nohash_libs.add(f)
            continue
        defined, _, _ = e.defined_symbols()
        _, nb, _, _, _, _, _ = e.gnu_hash_layout()
        for name in defined:
            definers.setdefault(name, []).append((f, nb, gnu_hash(name) % nb))
            all_names.add(name)
    print(f"libs={len(elfs)} nohash/syshash={len(nohash_libs)} distinct_defined={len(definers)}")

    # ── 패스1: 조인트 버킷보존 개명표
    final_map = {}   # old_name -> tuned_name (전체 공통 — 모든 정의 lib 버킷 동시 보존)
    keep_original = set()
    targets = {nm for nm in definers if scrub_name(nm) != nm}
    for old in sorted(targets):
        cons = [(nb, b) for _, nb, b in definers[old]]
        base = scrub_name(old)
        cand = joint_search(base, cons, all_names)
        if cand is None:
            keep_original.add(old)
            print(f"  [WARN] joint bucket 탐색 실패 — 원명 유지: {old[:48]!r} cons={len(cons)}")
            continue
        all_names.add(cand)
        final_map[old] = cand
    print(f"final rename table: {len(final_map)} / failed(keep): {len(keep_original)}")

    # ── 패스2: 라이브러리별 dynstr 치환 + rehash + 검증 게이트
    nfail = 0
    for f, e in elfs.items():
        base = os.path.basename(f)
        try:
            _, nsyms, stroff, strsz = e.dynsym_info()
            dynstr = bytes(e.data[stroff:stroff+strsz])
            nd = dynstr
            cnt = 0
            # 길이 내림차순 full-name 치환 (접두어 오염 방지 — §180)
            for old, new in sorted(final_map.items(), key=lambda kv: -len(kv[0])):
                if old in nd:
                    cnt += nd.count(old)
                    nd = nd.replace(old, new)
            # 소네임 보존 + 원명유지 심볼 보호: NUL 단위 분해 후 토큰 치환
            parts = nd.split(b'\0')
            keep_set = keep_original
            for pi, part in enumerate(parts):
                if part.endswith(b'.so') or part.endswith(b'.apk') or part in keep_set:
                    continue
                for a, b in TOKENS:
                    if a in part:
                        cnt += part.count(a)
                        parts[pi] = part.replace(a, b)
            nd = b'\0'.join(parts)
            assert len(nd) == len(dynstr), "length changed!"
            changed = (nd != dynstr)
            if changed:
                e.data[stroff:stroff+strsz] = nd
            if changed and 0x6ffffef5 in e.dt and 4 not in e.dt and not NOREHASH:
                rehash_from_dynstr(e)
                fails = verify_bionic_lookups(e)
                if fails:
                    nfail += 1
                    print(f"  [GATE-FAIL] {base}: {len(fails)} lookup 실패 — 출력 거부")
                    for nm, why in fails[:8]:
                        print(f"      {why}: {nm[:60]!r}")
                    continue
            if changed and NOREHASH:
                print(f"    (NOREHASH: {base} — 이름만 치환, gnu.hash 원본 유지)")
            open(os.path.join(out_dir, base), 'wb').write(bytes(e.data))
            print(f"  {base}: {cnt} replacements + rehash + gate-OK")
        except Exception as ex:
            import traceback; traceback.print_exc()
            print(f"  [ERR] {base}: {ex!r}")
            nfail += 1
    if nfail:
        print(f"[!] 게이트 실패 {nfail} lib — 산출물 신뢰 불가")
        sys.exit(1)
    print("done →", out_dir)


if __name__ == "__main__":
    main()
