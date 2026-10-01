var LIB = null;
Process.enumerateModules().forEach(function (m) { if (m.name.indexOf("libea56") >= 0) LIB = m; });
var VBASE = ptr("VDSO_BASE_PLACEHOLDER");
send("[init] libea56=" + (LIB ? LIB.base : "??") + " vdso=" + VBASE);
function cstr(p) { var s = ""; try { var b = p.readU8(); var i = 0; while (b && i < 64) { s += String.fromCharCode(b); b = p.add(++i).readU8(); } } catch (e) {} return s; }
var e_shoff = VBASE.add(0x28).readU64().toNumber();
var e_shentsize = VBASE.add(0x3A).readU16();
var e_shnum = VBASE.add(0x3C).readU16();
var secs = [];
for (var i = 0; i < e_shnum; i++) {
  var sh = VBASE.add(e_shoff + i * e_shentsize);
  secs.push({ type: sh.add(4).readU32(), link: sh.add(0x28).readU32(), off: sh.add(0x18).readU64().toNumber(), size: sh.add(0x20).readU64().toNumber() });
}
var hooked = 0;
secs.forEach(function (s) {
  if (s.type !== 11) return; // DYNSYM
  var str = secs[s.link];
  var n = s.size / 24;
  for (var k = 0; k < n; k++) {
    var sym = VBASE.add(s.off + k * 24);
    var st_name = sym.readU32();
    var st_value = sym.add(8).readU64().toNumber();
    if (!st_value) continue;
    var nm = cstr(VBASE.add(str.off + st_name));
    if (["clock_gettime", "gettimeofday", "clock_gettime64"].indexOf(nm) < 0) continue;
    send("[vdso-sym] " + nm + " @ " + VBASE.add(st_value));
    (function (name, addr) {
      Interceptor.attach(addr, {
        onEnter: function (a) {
          var lr = this.returnAddress;
          if (LIB && lr.compare(LIB.base) >= 0 && lr.compare(LIB.base.add(LIB.size)) < 0)
            send("[VDSO-HIT] " + name + " from libea56+0x" + lr.sub(LIB.base).toString(16));
        }
      });
      hooked++;
    })(nm, VBASE.add(st_value));
  }
});
send("[armed] hooked=" + hooked);
