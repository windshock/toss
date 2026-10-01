// hook_rw_str.js — rw 세그먼트 diff에서 변화 오프셋의 문자열(32B 창)을 누적 수집
let last = null, lastT = null;
const seen = new Set();
const OFFSET_START = 0x174000, OFFSET_END = 0x186210;
function dumpRW(base) {
  const out = {};
  const sz = OFFSET_END - OFFSET_START;
  const u8 = new Uint8Array(Memory.readByteArray(base.add(OFFSET_START), sz));
  for (let off = 0; off + 8 <= sz; off += 8) {
    let v = "";
    for (let k = 0; k < 8; k++) v += u8[off + k].toString(16).padStart(2, "0");
    out[off] = v;
  }
  return out;
}
function stringsAt(base, off) {
  try {
    const buf = Memory.readByteArray(base.add(OFFSET_START + off), 48);
    const s = new Uint8Array(buf).map ? "" : "";
    let txt = "";
    for (const c of new Uint8Array(buf)) txt += (c >= 32 && c < 127) ? String.fromCharCode(c) : "\x01";
    // printable 런(≥4) 추출
    return (txt.match(/[\x20-\x7e]{4,}/g) || []);
  } catch (e) { return []; }
}
const iv = setInterval(() => {
  const m = Process.findModuleByName("libea56.so");
  if (!m) return;
  const base = m.base;
  const cur = dumpRW(base);
  const now = Date.now();
  if (last) {
    const ch = [];
    for (const off in cur) if (last[off] !== cur[off]) ch.push(parseInt(off));
    if (ch.length > 0) {
      const fresh = [];
      for (const off of ch) {
        for (const s of stringsAt(base, off)) {
          const key = s;
          if (!seen.has(key)) { seen.add(key); fresh.push(s); }
        }
      }
      send("[rwstr] dt=" + ((now - lastT) / 1000).toFixed(1) + "s ch=" + ch.length + " new=" + fresh.length);
      // 전량 송신 — 40개씩 분할
      for (let i = 0; i < fresh.length; i += 40) {
        send("[rwstr Full] " + fresh.slice(i, i + 40).join(" | "));
      }
    }
    last = cur;
  } else { last = cur; send("[rwstr] baseline"); }
  lastT = now;
}, 500);
send("[+] rw string watcher started");
