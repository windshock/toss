// hook_vdso_plus.js — §158 E4: vDSO 직접호출 + libc PLT 시간 API를 동시에 감시(libea56 범위 필터)
// + exit_trap(§25차 레시피)로 60s 스로틀 만료 틱까지 생존. VDSO_BASE_PLACEHOLDER는 러너가 치환.
'use strict';
var LIB = null;
Process.enumerateModules().forEach(function (m) { if (m.name.indexOf("libea56") >= 0) LIB = m; });
// §159: 조기 attach 시 libea56 미로드 → 100ms 폴링으로 지연 해석 (LIB=null이면 필터가 전부 탈락시킴)
if (!LIB) {
  var libTimer = setInterval(function () {
    Process.enumerateModules().forEach(function (m) { if (m.name.indexOf("libea56") >= 0) LIB = m; });
    if (LIB) { clearInterval(libTimer); send("[lib-resolved] libea56=" + LIB.base + "+0x" + LIB.size.toString(16)); }
  }, 100);
}
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

// --- vDSO 파싱: 섹션헤더가 없으므로 PT_DYNAMIC → DT_SYMTAB/STRTAB 경로 (§158) ---
function cstr(p, max) { var s = "", b = p.readU8(), i = 0; while (b && i < (max||64)) { s += String.fromCharCode(b); b = p.add(++i).readU8(); } return s; }
var armed = 0;
try {
  var e_phoff = VBASE.add(0x20).readU64().toNumber();
  var e_phentsize = VBASE.add(0x36).readU16(), e_phnum = VBASE.add(0x38).readU16();
  var dynva = null;
  for (var i = 0; i < e_phnum; i++) {
    var ph = VBASE.add(e_phoff + i * e_phentsize);
    if (ph.readU32() === 2) dynva = ph.add(0x10).readU64().toNumber();
  }
  if (dynva !== null) {
    var symtab = null, strtab = null, strsz = 0xfffffff;
    for (var d = VBASE.add(dynva); ; d = d.add(16)) {
      var tag = d.readU64().toNumber(), val = d.add(8).readU64().toNumber();
      if (tag === 0) break;
      if (tag === 6) symtab = val;
      if (tag === 5) strtab = val;
      if (tag === 10) strsz = val;
    }
    send("[vdso-dyn] symtab=0x" + symtab.toString(16) + " strtab=0x" + strtab.toString(16) + " strsz=" + strsz);
    if (symtab !== null && strtab !== null) {
      for (var k = 0; k < 64; k++) {
        var sym = VBASE.add(symtab + k * 24);
        var st_name = sym.readU32();
        if (st_name >= strsz) break;
        var st_value = sym.add(8).readU64().toNumber();
        if (!st_value) continue;
        var nm = cstr(VBASE.add(strtab + st_name), 48);
        if (!/clock|gettime|timeof/.test(nm)) continue;
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
    }
  } else send("[warn] PT_DYNAMIC 없음");
} catch (e) { send("[warn] vdso dynamic parse: " + e); }
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
setInterval(function () { send("[stat] " + JSON.stringify(stats)); }, 3000);
