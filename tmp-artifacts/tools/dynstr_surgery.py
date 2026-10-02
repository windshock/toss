#!/usr/bin/env python3
# dynstr_surgery.py — .vl64 GL 사본의 에뮬 텔레텔 심볼 개명 수술 (§151 잔채널 해법)
#
# 원리: (1) 텔레텔 토큰(goldfish/qemu/Emulator/ranchu)을 포함한 심볼명을 동일 길이 중립명으로
# 치환 — 프로바이더(정의側) .dynstr + 임포터(UNDEF側) .dynstr 양쪽 동시에.
# (2) 프로바이더의 .gnu.hash를 새 이름 해시로 재구축 (로더 탐침 정합 — §146 크래시 법칙 회피).
# (3) 모든 치환 동일 길이 → 파일 크기·오프셋 불변.
# 임포터의 UNDEF 심볼은 gnu_hash 대상이 아니므로 문자열 치환만으로 안전.
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
        syment = self.dt.get(9, 0) if False else None
        # 심볼수: DT_HASH/DT_GNU_HASH로 계산
        n = None
        if 0x6ffffef5 in self.dt:  # GNU hash
            gh = self.dt[0x6ffffef5]
            ghoff = self.vaddr_to_off(gh)
            nbuckets, symoffset, bloom_size, _ = struct.unpack_from('<IIII', self.data, ghoff)
            buckets_off = ghoff + 16 + bloom_size*8
            buckets = struct.unpack_from('<%dI' % nbuckets, self.data, buckets_off)
            # chain 마지막 심볼 찾기: 최대 버킷부터 체인 순회
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
        return out, (ghoff, nbuckets, symoffset, bloom_size), n

def bucket_preserving_rename(elf, renames_for_lib):
    """버킷 보존 개명: 각 심볼의 새 이름이 원래 버킷(gnu_hash%nb)에 해시되도록
    끝문자를 변형 탐색. 구조(bucket/chain end-bit)는 원본 유지, chain값·bloom만 갱신.
    renames_for_lib: {dynsym_idx: old_name} — 반환 {idx: new_name}"""
    gh = elf.dt.get(0x6ffffef5)
    if gh is None:
        return {}
    ghoff = elf.vaddr_to_off(gh)
    nb, symoffset, bloom_size, shift = struct.unpack_from('<IIII', elf.data, ghoff)
    buckets_off = ghoff + 16 + bloom_size*8
    buckets = struct.unpack_from('<%dI' % nb, elf.data, buckets_off)
    chain_off = buckets_off + nb*4
    _, nsyms, stroff, strsz = elf.dynsym_info()
    symoff_f = elf.vaddr_to_off(elf.dt[6])
    # 전체 이름 집합(유일성 보장용)
    all_names = set()
    for i in range(1, nsyms):
        st_name, = struct.unpack_from('<I', elf.data, symoff_f + i*24)
        e = elf.data.find(b'\0', stroff + st_name)
        all_names.add(bytes(elf.data[stroff+st_name:e]))
    out = {}
    # 기존 chain값 배열 캡처(해시 필터값·종료비트 보존용)
    for idx, old in renames_for_lib.items():
        base = scrub_name(old)
        if base == old:
            continue
        target_bucket = gnu_hash(old) % nb
        cand = base
        # 끝에서 두번째/세번째 문자 변형 탐색 (길이 불변, 유일성·버킷 일치까지)
        tried = 0
        for pos in (len(base)-2, len(base)-3, len(base)-1):
            if pos < 1: continue
            for c in b'0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ':
                cand = base[:pos] + bytes([c]) + base[pos+1:]
                tried += 1
                if gnu_hash(cand) % nb == target_bucket and cand not in all_names:
                    break
            if gnu_hash(cand) % nb == target_bucket and cand not in all_names:
                break
        if gnu_hash(cand) % nb != target_bucket or cand in all_names:
            # 폴백: 2문자 조합
            cand = None
            for pos in range(len(base)-2, 0, -1):
                for c1 in b'abcdefghijklmnopqrstuvwxyz0123456789':
                    for c2 in b'abcdefghijklmnopqrstuvwxyz0123456789':
                        t = base[:pos] + bytes([c1]) + bytes([c2]) + base[pos+2:]
                        if gnu_hash(t) % nb == target_bucket and t not in all_names:
                            cand = t; break
                    if cand: break
                if cand: break
            if not cand:
                print(f"  [WARN] rename fail: {old[:40]!r}")
                continue
        all_names.add(cand)
        out[idx] = cand
    # chain값·bloom 갱신 (구조 불변)
    if out:
        # 모든 정의 심볼의 새 해시 계산
        new_hashes = {}
        for i in range(symoffset, nsyms):
            st_name, = struct.unpack_from('<I', elf.data, symoff_f + i*24)
            e = elf.data.find(b'\0', stroff + st_name)
            nm = bytes(elf.data[stroff+st_name:e])
            nm2 = out.get(i, nm)
            new_hashes[i] = gnu_hash(nm2)
        bloom = [0]*bloom_size
        for i in range(symoffset, nsyms):
            h = new_hashes[i]
            bloom[(h >> 6) % bloom_size] |= 1 << (h % 64)
            h2 = h >> shift
            bloom[(h2 >> 6) % bloom_size] |= 1 << (h2 % 64)
        o = ghoff + 16
        for w in bloom:
            struct.pack_into('<Q', elf.data, o, w); o += 8
        for i in range(symoffset, nsyms):
            old_v, = struct.unpack_from('<I', elf.data, chain_off + (i-symoffset)*4)
            v = (new_hashes[i] & ~1) | (old_v & 1)   # 종료비트는 원본 유지
            struct.pack_into('<I', elf.data, chain_off + (i-symoffset)*4, v)
    return out

def main():
    src_dir = sys.argv[1]
    out_dir = sys.argv[2]
    os.makedirs(out_dir, exist_ok=True)
    files = sorted(glob.glob(os.path.join(src_dir, '**', '*.so'), recursive=True))
    elfs = {}
    for f in files:
        try:
            elfs[f] = ELF(f)
        except Exception as ex:
            print(f"  [warn] {os.path.basename(f)}: {ex}")

    # 패스1: 프로바이더별 버킷보존 개명표 (최종 이름 = 변형명)
    final_map = {}   # old_name(bytes) -> final_name(bytes)  (전 라이브러리 공통)
    for f, e in elfs.items():
        if 0x6ffffef5 not in e.dt:
            continue
        try:
            defined, _, _ = e.defined_symbols()
            rl = {idx: name for name, idx in defined.items() if scrub_name(name) != name}
            if not rl:
                continue
            out = bucket_preserving_rename(e, rl)
            for idx, nm2 in out.items():
                final_map[rl[idx]] = nm2
        except Exception as ex:
            import traceback; traceback.print_exc()
            print(f"  [ERR-pass1] {os.path.basename(f)}: {ex!r}")
    print(f"final rename table: {len(final_map)} symbols")

    # 패스2: 모든 라이브러리 dynstr 치환 (최종표 + 잔여 토큰) + 프로바이더 chain/bloom 재갱신
    for f, e in elfs.items():
        base = os.path.basename(f)
        try:
            _, nsyms, stroff, strsz = e.dynsym_info()
            dynstr = bytes(e.data[stroff:stroff+strsz])
            nd = dynstr
            cnt = 0
            for old, new in final_map.items():
                if old in nd:
                    cnt += nd.count(old)
                    nd = nd.replace(old, new)
            # 소네임 보존: NUL 단위로 분해, '.so'로 끝나는 문자열(=DT_NEEDED 파일명)은 토큰 치환 제외
            parts = nd.split(b'\0')
            for pi, part in enumerate(parts):
                if part.endswith(b'.so') or part.endswith(b'.apk'):
                    continue
                for a, b in TOKENS:
                    if a in part:
                        cnt += part.count(a)
                        parts[pi] = part.replace(a, b)
            nd = b'\0'.join(parts)
            if cnt == 0:
                continue
            assert len(nd) == len(dynstr), "length changed!"
            e.data[stroff:stroff+strsz] = nd
            # 프로바이더: 최종 dynstr 기준으로 chain값/bloom 재계산 (bucket·종료비트 원본 유지)
            if 0x6ffffef5 in e.dt:
                rehash_from_dynstr(e)
            open(os.path.join(out_dir, base), 'wb').write(bytes(e.data))
            print(f"  {base}: {cnt} replacements + rehashed")
        except Exception as ex:
            import traceback; traceback.print_exc()
            print(f"  [ERR] {base}: {ex!r}")
    print("done →", out_dir)

def rehash_from_dynstr(e):
    """현재 e.data의 dynstr 기준으로 정의심볼 해시 재계산 → chain값/bloom 갱신.
    bucket 배열과 chain 종료비트는 원본 유지 (버킷보존 개명 전제)."""
    gh = e.dt[0x6ffffef5]
    ghoff = e.vaddr_to_off(gh)
    nb, symoffset, bloom_size, shift = struct.unpack_from('<IIII', e.data, ghoff)
    buckets_off = ghoff + 16 + bloom_size*8
    chain_off = buckets_off + nb*4
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
        bloom[(h >> 6) % bloom_size] |= 1 << (h % 64)
        h2 = h >> shift
        bloom[(h2 >> 6) % bloom_size] |= 1 << (h2 % 64)
    o = ghoff + 16
    for w in bloom:
        struct.pack_into('<Q', e.data, o, w); o += 8
    for i in range(symoffset, nsyms):
        old_v, = struct.unpack_from('<I', e.data, chain_off + (i-symoffset)*4)
        v = (new_hashes[i] & ~1) | (old_v & 1)
        struct.pack_into('<I', e.data, chain_off + (i-symoffset)*4, v)


if __name__ == "__main__":
    main()
