// hook_javaclock.js — Java 시간 판독 콜사이트 특정 (가드의 타이밍 측정이 Java층이면 포착)
// 노이즈 제어: 64회마다 1회 스택 샘플, 고유 스택만 보고
var seen = {};
var counts = {};
function wrap(cls, method) {
  try {
    var C = Java.use(cls);
    var overloads = C[method].overloads;
    overloads.forEach(function (fn) {
      fn.implementation = function () {
        counts[cls + "." + method] = (counts[cls + "." + method] || 0) + 1;
        if (counts[cls + "." + method] % 64 === 1) {
          try {
            var st = Java.use("java.lang.Thread").currentThread().getStackTrace();
            var frames = [];
            for (var i = 1; i < Math.min(st.length, 7); i++) frames.push(st[i].toString());
            var key = cls + "." + method + " <- " + frames.slice(0, 3).join(" | ");
            if (!seen[key]) {
              seen[key] = 1;
              send("[JSITE] " + key + (frames.length > 3 ? " …" : "") + " [thread=" + st[0] + "]");
            }
          } catch (e) {}
        }
        return fn.apply(this, arguments);
      };
    });
  } catch (e) { send("[warn] " + cls + "." + method + ": " + e); }
}
Java.perform(function () {
  wrap("java.lang.System", "nanoTime");
  wrap("java.lang.System", "currentTimeMillis");
  wrap("android.os.SystemClock", "elapsedRealtime");
  wrap("android.os.SystemClock", "elapsedRealtimeNanos");
  wrap("android.os.SystemClock", "uptimeMillis");
  send("[init] javaclock hooks armed");
});
setInterval(function () { send("[jc-stat] " + JSON.stringify(counts)); }, 3000);
