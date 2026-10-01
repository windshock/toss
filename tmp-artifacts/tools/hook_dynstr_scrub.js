// hook_dynstr_scrub.js — §151 P3 A/B: 로드된 모듈의 .dynstr에서 goldfish 심볼을
// 동일 길이 중립화(kgsl_dma). 링커 해석 후라 해시 무관, GL 기능 무영향.
// 대상: §142 램덤명 7종 + adreno 트윈 + CodecCommon.
const TARGETS = [
  "libcf2rn4pmt62k5jkc.so", "libgxvvbxdgj4.so", "lib7c7c8tkjlj.so",
  "libq892nk5ptwmbggc8xx.so", "libwpgwctvx5g.so", "libpc24gwzjqm.so",
  "lib456b9nt2vkw78xzlxx.so",
  "libEGL_adreno.so", "libGLESv1_CM_adreno.so", "libGLESv2_adreno.so",
  "libOpenglCodecCommon.so", "libqti_adreno.so"
];
const SUBST = [ ["goldfish", "kgsl_dma"], ["Goldfish", "KgslDma0"],
                ["GOLDFISH", "KGSL_DMA"] ];

function strtabOf(base) {
  const e_phoff = base.add(0x20).readU64();
  const e_phentsize = base.add(0x36).readU16();
  const e_phnum = base.add(0x38).readU16();
  let dyn = null;
  for (let i = 0; i < e_phnum; i++) {
    const ph = base.add(e_phoff).add(i * e_phentsize);
    if (ph.readU32() === 2) { dyn = ph.add(8).readU64(); break; } // PT_DYNAMIC p_vaddr
  }
  if (dyn === null) return null;
  let strtab = null, strsz = 0;
  for (let o = 0; ; o += 16) {
    const tag = base.add(dyn).add(o).readU64();
    const val = base.add(dyn).add(o + 8).readU64();
    if (tag === 0n) break;
    if (tag === 5n) strtab = val;      // DT_STRTAB
    if (tag === 10n) strsz = Number(val); // DT_STRSZ
  }
  if (strtab === null || strsz === 0) return null;
  // d_val는 런타임에 이미 절대주소로 재배치되는 경우와 vaddr인 경우 혼재 — 판별
  if (strtab < 0x10000n) strtab = base.add(strtab); else strtab = ptr(strtab);
  return { strtab, strsz };
}
function scrub(modName) {
  const m = Process.findModuleByName(modName);
  if (!m) return -1;
  const st = strtabOf(m.base);
  if (!st) return -2;
  let hits = 0;
  const buf = Memory.readByteArray(st.strtab, st.strsz);
  const u8 = new Uint8Array(buf);
  for (const [from, to] of SUBST) {
    const f = Array.from(from).map(c => c.charCodeAt(0));
    for (let i = 0; i + f.length <= u8.length; i++) {
      let ok = true;
      for (let k = 0; k < f.length; k++) if (u8[i + k] !== f[k]) { ok = false; break; }
      if (ok) {
        const addr = st.strtab.add(i);
        Memory.protect(addr, f.length, 'rw-');
        addr.writeUtf8String(to); // 동일 길이
        Memory.protect(addr, f.length, 'r--');
        hits++;
        for (let k = 0; k < f.length; k++) u8[i + k] = to.charCodeAt(k);
      }
    }
  }
  return hits;
}
let total = 0;
for (const name of TARGETS) {
  const r = scrub(name);
  send("[scrub] " + name + " → " + r);
  if (r > 0) total += r;
}
send("[scrub] TOTAL=" + total);
// 지연 로드 대비: 2초 후 1회 재스크럽
setTimeout(() => {
  let t2 = 0;
  for (const name of TARGETS) { const r = scrub(name); if (r > 0) t2 += r; }
  send("[scrub] pass2=" + t2);
}, 2000);
