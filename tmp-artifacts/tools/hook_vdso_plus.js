// hook_vdso_plus.js — §158 E4: vDSO 직접호출 + libc PLT 시간 API를 동시에 감시(libea56 범위 필터)
// + exit_trap(§25차 레시피)로 60s 스로틀 만료 틱까지 생존. VDSO_BASE_PLACEHOLDER는 러너가 치환.
'use strict';
var LIB = null;
Process.enumerateModules().forEach(function (m) { if (m.name.indexOf("libea56") >= 0) LIB = m; });
var VBASE = ptr("VDSO_BASE_PLACEHOLDER");
send("[init] libea56=" + (LIB ? LIB.base + "+0x" + LIB.size.toString(16) : "??") + " vdso=" + VBASE);
function inLib(a) { return LIB && a.compare(LIB.base) >= 0 && a.compare(LIB.base.add(LIB.size)) < 0; }
function offOf(a) { return "libea56+0x" + a.sub(LIB.base).toString(16); }
var stats = { libc_cg: 0, libc_gtod: 0, vdso_cg: 0, vdso_gtod: 0, libhits: 0 };

// --- libc PLT 시간 API ---
["clock_gettime", "gettimeofday"].forEach(function (nm) {
  var p = Module.findExportByName("libc.so", nm);
  if (!p) return;
  Interceptor.attach(p, {
    onEnter: function () {
      stats[nm === "clock_gettime" ? "libc_cg" : "libc_gtod"]++;
      if (inLib(this.returnAddress)) {
        stats.libhits++;
        send("[PLT-HIT] " + nm + " from " + offOf(this.returnAddress) + " tid=" + this.threadId);
      }
    }
  });
});

// --- vDSO ELF 수동 파싱 후 직접 후킹 ---
function cstr(p) { var s = "", b = p.readU8(), i = 0; while (b && i < 64) { s += String.fromCharCode(b); b = p.add(++i).readU8(); } return s; }
var e_shoff = VBASE.add(0x28).readU64().toNumber();
var e_shentsize = VBASE.add(0x3A).readU16(), e_shnum = VBASE.add(0x3C).readU16();
var secs = [];
for (var i = 0; i < e_shnum; i++) {
  var sh = VBASE.add(e_shoff + i * e_shentsize);
  secs.push({ type: sh.add(4).readU32(), link: sh.add(0x28).readU32(), off: sh.add(0x18).readU64().toNumber(), size: sh.add(0x20).readU64().toNumber() });
}
var armed = 0;
secs.forEach(function (s) {
  if (s.type !== 11) return;
  var str = secs[s.link]; if (!str) return;
  var n = s.size / 24;
  for (var k = 0; k < n; k++) {
    var sym = VBASE.add(s.off + k * 24);
    var st_name = sym.readU32(), st_value = sym.add(8).readU64().toNumber();
    if (!st_value) continue;
    var nm = cstr(VBASE.add(str.off + st_name));
    if (["clock_gettime", "gettimeofday", "clock_gettime64"].indexOf(nm) < 0) continue;
    (function (name, addr) {
      Interceptor.attach(addr, {
        onEnter: function () {
          stats[name.indexOf("gettimeofday") >= 0 ? "vdso_gtod" : "vdso_cg"]++;
          if (inLib(this.returnAddress)) {
            stats.libhits++;
            send("[VDSO-HIT] " + name + " from " + offOf(this.returnAddress) + " tid=" + this.threadId);
          }
        }
      });
      armed++;
    })(nm, VBASE.add(st_value));
  }
});
send("[armed] vdso hooks=" + armed);

// --- exit 차단 (§25차 레시피 — 60s 틱까지 생존) ---
Java.perform(function () {
  try {
    var Sys = Java.use("java.lang.System");
    Sys.exit.implementation = function (code) { send("[EXIT-BLOCKED] System.exit(" + code + ") tid=" + this.threadId); return; };
    var Rt = Java.use("java.lang.Runtime");
    Rt.exit.overload("int").implementation = function (code) { send("[EXIT-BLOCKED] Runtime.exit(" + code + ")"); return; };
    send("[+] exit trapped (survival mode)");
  } catch (e) { send("[exit-trap fail] " + e); }
});
setInterval(function () { send("[stat] " + JSON.stringify(stats)); }, 10000);
