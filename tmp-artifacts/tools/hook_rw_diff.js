// hook_rw_diff.js — libea56 rw 세그먼트 주기 덤프·diff → 변화하는 전역(상태변수) 지도
let last = null;      // {off: hexstring}
let lastT = null;
const OFFSET_START = 0x174000, OFFSET_END = 0x186210; // rw 세그먼트
function dumpRW(base) {
  const out = {};
  const sz = OFFSET_END - OFFSET_START;
  const buf = Memory.readByteArray(base.add(OFFSET_START), sz);
  const u8 = new Uint8Array(buf);
  // 8바이트 워드 단위 해시 저장
  for (let off = 0; off + 8 <= sz; off += 8) {
    let v = "";
    for (let k = 0; k < 8; k++) v += u8[off + k].toString(16).padStart(2, "0");
    out[off] = v;
  }
  return out;
}
function diffRW(a, b) {
  const ch = [];
  for (const off in a) if (a[off] !== b[off]) ch.push(parseInt(off));
  return ch;
}
const iv = setInterval(() => {
  const m = Process.findModuleByName("libea56.so");
  if (!m) return;
  const base = m.base;
  const now = Date.now();
  const cur = dumpRW(base);
  if (last) {
    const ch = diffRW(last, cur);
    if (ch.length > 0) {
      const t = ((now - lastT) / 1000).toFixed(1);
      // 상위 20개 변화 오프셋 보고 (va 기준)
      const listing = ch.slice(0, 20).map(o => "0x" + (OFFSET_START + o).toString(16) + "=" + cur[o]).join(" ");
      send("[rwdiff] dt=" + t + "s changed=" + ch.length + " first: " + listing);
      if (ch.length > 20) send("[rwdiff] ...+" + (ch.length - 20) + " more");
    }
    last = cur;
  } else {
    last = cur;
    send("[rwdiff] baseline captured (seg " + (OFFSET_END - OFFSET_START) + "B)");
  }
  lastT = now;
}, 400);
send("[+] rw diff watcher started");
