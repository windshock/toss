// hook_clockwatch.js — 시간 판독 콜사이트 특정: libea56 범위 caller의 clock_gettime/gettimeofday 포착
// 목적: 타이밍 채널 측정 코드의 vaddr 확보 (→ hwbp 확정용). §157.
var lib = null;
function findLib() {
  Process.enumerateModules().forEach(function (m) {
    if (m.name.indexOf("libea56") >= 0) lib = m;
  });
}
findLib();
send("[init] libea56=" + (lib ? lib.base + "+0x" + lib.size.toString(16) : "NOT_FOUND"));

var inLib = function (addr) {
  return lib && addr.compare(lib.base) >= 0 && addr.compare(lib.base.add(lib.size)) < 0;
};
var off = function (addr) { return "libea56+0x" + addr.sub(lib.base).toString(16); };

var stats = { cg: 0, gtod: 0, lib_cg: 0, lib_gtod: 0 };
var seen = {};

function hookTime(sym) {
  var p = Module.findExportByName("libc.so", sym);
  if (!p) { send("[warn] no export " + sym); return; }
  Interceptor.attach(p, {
    onEnter: function (args) {
      stats[sym === "clock_gettime" ? "cg" : "gtod"]++;
      var lr = this.returnAddress;
      if (inLib(lr)) {
        stats[sym === "clock_gettime" ? "lib_cg" : "lib_gtod"]++;
        var key = sym + "@" + off(lr);
        if (!seen[key]) {
          seen[key] = 1;
          var extra = "";
          try { if (sym === "clock_gettime") extra = " clk_id=" + args[0].toInt32(); } catch (e) {}
          send("[HIT] " + key + extra);
        }
      }
    }
  });
}
hookTime("clock_gettime");
hookTime("gettimeofday");

// 3s마다 통계 (훅 생존 확인)
var n = 0;
setInterval(function () {
  send("[stat] t+" + (++n * 3) + "s cg=" + stats.cg + " gtod=" + stats.gtod + " lib_cg=" + stats.lib_cg + " lib_gtod=" + stats.lib_gtod);
}, 3000);
