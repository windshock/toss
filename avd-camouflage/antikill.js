/*
 * antikill.js — 탐지기 자기파괴 차단 + 발화자 관찰
 *
 * 배경: 원본/neutered 모두 AhnLab 엔진(libMagicSE/랜덤명, files/ahnlab/engine/log2/*)
 * 이 에뮬 판정 시 libc kill(9)로 자기파괴. in-process libc kill 차단으로 관찰 유지.
 *
 * 실행: frida_spawn.py antikill.js [초]  (spawn 필수 — 늦은 attach는 가드 ptrace로 불가)
 */

const SELF = Process.id;

function sym(ctx) {
  try {
    return Thread.backtrace(ctx, Backtracer.ACCURATE)
      .map(function (a) {
        var m = Process.findModuleByAddress(a);
        var s = DebugSymbol.fromAddress(a);
        return (m ? m.name : s.moduleName || '?') + '!' + (m ? '+0x' + a.sub(m.base).toString(16) : s.name);
      }).join(' <- ');
  } catch (e) { return '<bt fail>'; }
}

function fatal(sig) { return sig === 9 || sig === 6; }

/* kill(pid, sig) — SIGKILL/ABORT 자기대상 차단 */
Interceptor.attach(Module.findExportByName('libc.so', 'kill'), {
  onEnter: function (a) {
    this.pid = a[0].toInt32(); this.sig = a[1].toInt32();
    this.self = (this.pid === SELF || this.pid === 0 || this.pid === -1);
  },
  onLeave: function (r) {
    if (fatal(this.sig) && this.self) {
      console.log('[BLOCKED] kill(' + this.pid + ',' + this.sig + ')  ' + sym(this.context));
      r.replace(-1);
    } else if (fatal(this.sig)) {
      console.log('[KILL-EXT] kill(' + this.pid + ',' + this.sig + ')  ' + sym(this.context));
    }
  }
});

/* tgkill(tgid, tid, sig) */
Interceptor.attach(Module.findExportByName('libc.so', 'tgkill'), {
  onEnter: function (a) {
    this.tgid = a[0].toInt32(); this.sig = a[2].toInt32();
  },
  onLeave: function (r) {
    if (fatal(this.sig) && this.tgid === SELF) {
      console.log('[BLOCKED] tgkill(' + this.tgid + ',,' + this.sig + ')  ' + sym(this.context));
      r.replace(-1);
    }
  }
});

/* pthread_kill / raise — fatal 시그널만 차단 */
['pthread_kill', 'raise'].forEach(function (fn) {
  const p = Module.findExportByName('libc.so', fn);
  if (!p) return;
  Interceptor.attach(p, {
    onEnter: function (a) {
      this.sig = (fn === 'pthread_kill') ? a[1].toInt32() : a[0].toInt32();
    },
    onLeave: function (r) {
      if (fatal(this.sig)) {
        console.log('[BLOCKED] ' + fn + '(' + this.sig + ')  ' + sym(this.context));
        r.replace(-1);
      }
    }
  });
});

/* exit / _exit / exit_group 시도 관찰 (차단은 abort 류만 — exit 차단은 교착 유발) */
['exit', '_exit'].forEach(function (fn) {
  const p = Module.findExportByName('libc.so', fn);
  if (!p) return;
  Interceptor.attach(p, {
    onEnter: function (a) {
      console.log('[EXIT-CALL] ' + fn + '(' + a[0].toInt32() + ')  ' + sym(this.context));
    }
  });
});

Interceptor.attach(Module.findExportByName('libc.so', 'abort'), {
  onLeave: function () { console.log('[BLOCKED] abort  ' + sym(this.context)); }
});

console.log('[*] antikill armed, self pid=' + SELF);
