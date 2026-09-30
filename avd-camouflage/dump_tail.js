/* ── 5. HANG STACK DUMP (kill_block 뒤에 append) ──────────────────────────
 * 스폰+resume 후 스플래시 hang 창(~5-20s)에 메인/워커 스레드 네이티브 스택을
 * 떠서, 메인이 무슨 락(어느 lib의 어느 호출)에 막혔는지 확인한다. */
function _sym(addr) {
  try {
    var m = Process.findModuleByAddress(addr);
    var out = m ? (m.name + '!+0x' + addr.sub(m.base).toString(16)) : addr.toString();
    var s = DebugSymbol.fromAddress(addr);
    if (s && s.name) out += ' (' + s.name + ')';
    return out;
  } catch (e) { return addr.toString(); }
}
function _comm(tid) {
  try { return File.readAllText('/proc/self/task/' + tid + '/comm').trim(); }
  catch (e) { return '?'; }
}
function _dumpAll(tag) {
  console.log('======== STACK DUMP ' + tag + ' ========');
  var ths = Process.enumerateThreads().sort(function (a, b) { return a.id - b.id; });
  console.log('[dump] threads=' + ths.length);
  ths.forEach(function (t) {
    var c = _comm(t.id);
    var isMain = (t.id === Process.id);
    var interesting = isMain || /Default|MAP|Thread-|FinalizerWatchdog|main/.test(c);
    if (interesting) {
      console.log('# tid=' + t.id + ' [' + c + '] ' + t.state + ' pc=' + _sym(t.context.pc));
      var bt = [];
      try { bt = Thread.backtrace(t.context, Backtracer.ACCURATE); } catch (e) {}
      if (!bt.length) { try { bt = Thread.backtrace(t.context, Backtracer.FUZZY); } catch (e) {} }
      bt.slice(0, 14).forEach(function (a) { console.log('    ' + _sym(a)); });
    } else {
      console.log('  tid=' + t.id + ' [' + c + '] ' + t.state + ' ' + _sym(t.context.pc));
    }
  });
  console.log('======== END ' + tag + ' ========');
}
[8000, 12000, 17000, 24000].forEach(function (ms) {
  setTimeout(function () { try { _dumpAll('t+' + ms + 'ms'); } catch (e) { console.log('dump err ' + e); } }, ms);
});
console.log('[*] hang stack dumper scheduled (8/12/17/24s)');
