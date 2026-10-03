// §186: afed8 바늘 질의 전수 캡처 — needle 문자열 + 반환값(NULL 여부) + 매치 시 값 덤프
// §172: afed8(0, 0x5c000000, needle) = 값조회기, ret=포인터(NULL=미매치), 값 비교는 Java
// §160: afed8(4) = 킬 진입. 관찰자 효과: 사망경로 네이티브 전환되나 읽은 값은 유효(§143).
var LIB = null;
Process.enumerateModules().forEach(function (m) { if (m.name.indexOf("libea56") >= 0) LIB = m; });
if (!LIB) {
  var t = setInterval(function () {
    Process.enumerateModules().forEach(function (m) {
      if (m.name.indexOf("libea56") >= 0) { LIB = m; clearInterval(t); }
    });
  }, 100);
}
send("[init] " + (LIB ? LIB.base : "pending"));

function readStr(p, max) {
  try {
    var b = Memory.readByteArray(p, max);
    var u8 = new Uint8Array(b), s = "";
    for (var i = 0; i < u8.length; i++) {
      if (u8[i] === 0) break;
      s += (u8[i] >= 32 && u8[i] < 127) ? String.fromCharCode(u8[i]) : "?";
    }
    return s;
  } catch (e) { return "<unreadable>"; }
}
function hexDump(p, n) {
  try {
    var b = Memory.readByteArray(p, n);
    var u8 = new Uint8Array(b), h = "";
    for (var i = 0; i < u8.length; i++) h += u8[i].toString(16).padStart(2, "0");
    return h;
  } catch (e) { return "<unreadable>"; }
}

var armed = false, n = 0;
function tryArm() {
  if (!LIB || armed) return;
  armed = true;
  Interceptor.attach(LIB.base.add(0xafed8), {
    onEnter: function (a) {
      this.x0 = a[0].toInt32();
      this.x1 = a[1].toString(16);
      if (this.x0 !== 0) {
        send("[KILL-ENTRY] x0=" + this.x0 + " x1=0x" + this.x1 + " tid=" + this.threadId);
        return;
      }
      n++;
      this.needle = readStr(a[2], 64);
      this.np = a[2];
      if (n <= 120 || n % 20 === 0)
        send("[Q#" + n + "] needle=\"" + this.needle + "\" tid=" + this.threadId);
    },
    onLeave: function (r) {
      if (this.x0 !== 0) return;
      var ret = r.toString(16);
      if (this.np === undefined) return;
      if (r.isNull()) {
        if (n <= 120 || n % 20 === 0)
          send("[R#" + n + "] needle=\"" + this.needle + "\" -> NULL");
      } else if (!r.isNull()) {
        var val = "";
        try { val = readStr(r, 64); } catch (e) { val = "<unreadable>"; }
        send("***[MATCH#" + n + "]*** needle=\"" + this.needle + "\" -> 0x" + ret +
             " value=\"" + val + "\" hex=" + hexDump(r, 32));
      }
    }
  });
  send("[armed] afed8 @" + LIB.base.add(0xafed8));
}
var t2 = setInterval(function () { if (LIB) { tryArm(); clearInterval(t2); } }, 100);
