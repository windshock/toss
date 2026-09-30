/*
 * syscall_kill_block.js — SIGKILL 자기파괴 커널 레벨 차단
 *
 * 실측(2026-09-19, ftrace kprobe): neutered 빌드 + frida spawn 시
 * 앱 내부 "DefaultDispatcher" 스레드(tid≠main)가 libc를 우회한 직접 svc로
 * kill(self, SIGKILL) 호출 → libc 훅으로는 못 막음.
 *
 * 대응: seccomp BPF 필터로 kill(129)/tgkill(131)/pidfd_send_signal(424)
 *       중 sig=9/6 → EPERM. 나머지 전부 ALLOW (기존 zygote 필터와 공존).
 * 관찰: libc kill/tgkill/syscall() 훅으로 우회 안 한 호출은 로그 남김.
 *
 * 실행: frida_spawn.py syscall_kill_block.js [초]
 */

const SELF = Process.id;
const NR_KILL = 129, NR_TGKILL = 131, NR_PIDFD_SIGNAL = 424;
/* 원본 앱 실측(2026-09-19 kprobe+crash): ① 워치독이 SIGTERM(15)·SIGBUS(7)를 명시
   전송 ② libAppSuit.so 내부에서 SIGSEGV(11) MAPERR 실제 폴트 (의도적 무효 점프).
   SIGUSR1/2 등은 건드리지 않음. */
const FATAL_SIGS = [9, 6, 7, 15, 11];

/* ── 1. seccomp BPF 필터 조립 ───────────────────────────────────────────── */
const BPF_LD_W_ABS = 0x20, BPF_JEQ_K = 0x15, BPF_RET_K = 0x06;
const RET_ALLOW = 0x7fff0000, RET_ERRNO = 0x00050000, EPERM = 1;
const SECCOMP_DATA_ARGS1 = 24;  // args[1] low word
const SECCOMP_DATA_ARGS2 = 32;  // args[2]
const SECCOMP_DATA_ARGS3 = 40;  // args[3]

const prog = [];
function emit(code, jt, jf, k) { prog.push([code, jt, jf, k]); return prog.length - 1; }

emit(BPF_LD_W_ABS, 0, 0, 0);                       // 0: A = nr

const sigChecks = [];                               // errno 블록 인덱스들
function checkSigThenBlock(offset) {
  emit(BPF_LD_W_ABS, 0, 0, offset);                 // A = sig
  FATAL_SIGS.forEach(function (s) {
    sigChecks.push(emit(BPF_JEQ_K, 0, 0, s));       // jt → errno (patch later)
  });
  emit(BPF_RET_K, 0, 0, RET_ALLOW);                 // 다른 시그널은 통과
}

// dispatcher: nr == KILL ? block-block : check TGKILL
const j_kill = emit(BPF_JEQ_K, 0, 0, NR_KILL);      // jt → kill sig check
const j_tgkill = emit(BPF_JEQ_K, 0, 0, NR_TGKILL);  // jt → tgkill sig check
const j_pidfd = emit(BPF_JEQ_K, 0, 0, NR_PIDFD_SIGNAL);
const j_allow0 = emit(BPF_RET_K, 0, 0, RET_ALLOW);  // 기타 syscall 전부 ALLOW

// kill: sig = args[1]
const killBlockStart = prog.length;
checkSigThenBlock(SECCOMP_DATA_ARGS1);
// tgkill: sig = args[2]
const tgkillBlockStart = prog.length;
checkSigThenBlock(SECCOMP_DATA_ARGS2);
// pidfd_send_signal: sig = args[3]
const pidfdBlockStart = prog.length;
checkSigThenBlock(SECCOMP_DATA_ARGS3);

const errnoIdx = prog.length;
emit(BPF_RET_K, 0, 0, RET_ERRNO | EPERM);
const allowEndIdx = prog.length;
emit(BPF_RET_K, 0, 0, RET_ALLOW);

// 점프 패치
prog[j_kill][1] = killBlockStart - j_kill - 1;        // jt
prog[j_kill][2] = j_tgkill - j_kill - 1;              // jf
prog[j_tgkill][1] = tgkillBlockStart - j_tgkill - 1;
prog[j_tgkill][2] = j_pidfd - j_tgkill - 1;
prog[j_pidfd][1] = pidfdBlockStart - j_pidfd - 1;
prog[j_pidfd][2] = allowEndIdx - j_pidfd - 1;
sigChecks.forEach(function (idx) { prog[idx][1] = errnoIdx - idx - 1; });

/* 메모리에 sock_fprog 구성: { u16 len; pad; sock_filter* } */
const progBuf = Memory.alloc(prog.length * 8);
prog.forEach(function (ins, i) {
  const p = progBuf.add(i * 8);
  p.writeU16(ins[0]);
  p.add(2).writeU8(ins[1]);
  p.add(3).writeU8(ins[2]);
  p.add(4).writeU32(ins[3]);
});
const fprog = Memory.alloc(16);
fprog.writeU16(prog.length);
fprog.add(8).writePointer(progBuf);

const prctl = new NativeFunction(
  Module.findExportByName('libc.so', 'prctl'),
  'int', ['int', 'ulong', 'pointer', 'ulong', 'ulong']
);
const PR_SET_NO_NEW_PRIVS = 38, PR_SET_SECCOMP = 22, SECCOMP_MODE_FILTER = 2;

/* seccomp는 스레드 단위 상속이므로 (1) 현재 스크립트 스레드 (2) 앱 메인 스레드
   (3) pthread_create 호출자 전부에 설치해 신규 스레드가 전부 상속하게 만든다. */
let installCount = 0;
function installFilter() {
  prctl(PR_SET_NO_NEW_PRIVS, 1, NULL, 0, 0);
  const r = prctl(PR_SET_SECCOMP, SECCOMP_MODE_FILTER, fprog, 0, 0);
  installCount++;
  return r;
}

installFilter();  // gum-js-loop (스크립트 스레드)

Java.perform(function () {
  Java.scheduleOnMainThread(function () {
    const r = installFilter();
    console.log('[*] seccomp installed on main thread, r=' + r);
  });
});

/* 아직 필터 없는 생성자 스레드가 만들어주는 자식까지 전부 커버 */
Interceptor.attach(Module.findExportByName('libc.so', 'pthread_create'), {
  onEnter: function () { installFilter(); }
});

console.log('[*] seccomp filter insns=' + prog.length +
            ' sigs={' + FATAL_SIGS.join(',') + '} → EPERM');

/* ── 2. 관찰용 libc 훅 (직접 svc 우회 호출은 여기 안 잡힘 — seccomp가 담당) ── */
function sym(ctx) {
  try {
    return Thread.backtrace(ctx, Backtracer.ACCURATE)
      .map(function (a) {
        var m = Process.findModuleByAddress(a);
        return (m ? m.name : '?') + (m ? '!+0x' + a.sub(m.base).toString(16) : '');
      }).slice(0, 6).join(' <- ');
  } catch (e) { return '<bt fail>'; }
}
function fatal(sig) { return FATAL_SIGS.indexOf(sig) !== -1; }

Interceptor.attach(Module.findExportByName('libc.so', 'kill'), {
  onEnter: function (a) { this.pid = a[0].toInt32(); this.sig = a[1].toInt32(); },
  onLeave: function (r) {
    if (fatal(this.sig)) {
      console.log('[SECCOMP-WILL-BLOCK] kill(' + this.pid + ',' + this.sig + ')  ' + sym(this.context));
      r.replace(-1);
    }
  }
});
Interceptor.attach(Module.findExportByName('libc.so', 'tgkill'), {
  onEnter: function (a) { this.tgid = a[0].toInt32(); this.sig = a[2].toInt32(); },
  onLeave: function (r) {
    if (fatal(this.sig) && this.tgid === SELF) {
      console.log('[SECCOMP-WILL-BLOCK] tgkill(' + this.tgid + ',,' + this.sig + ')  ' + sym(this.context));
      r.replace(-1);
    }
  }
});

/* ── 3. 신호 방어 (하드웨어 폴트 대비 + 엔진 핸들러 재등록 차단) ──────────────
   seccomp가 시그널 "전송"을 막는 반면, libAppSuit 내부 의도적 무효 점프는 커널이
   SIGSEGV(11)를 직접 발생시키므로 seccomp로 못 막는다.
   대응: SA_SIGINFO 핸들러 — 폴트 PC가 libAppSuit 범위면 해당 스레드만 파킹,
   아니면 이전 핸들러(ART fault manager)로 체이닝. */
const pauseFn = new NativeFunction(Module.findExportByName('libc.so', 'pause'), 'int', []);

/* libAppSuit.so 범위 캐시 (로드는 앱 init 이후 → 하트비트에서 갱신) */
var appSuitRange = null;
function refreshAppSuitRange() {
  if (appSuitRange) return;
  const m = Process.findModuleByName('libAppSuit.so');
  if (m) {
    appSuitRange = { base: m.base, end: m.base.add(m.size) };
    console.log('[*] libAppSuit.so cached: ' + m.base + ' size=' + m.size);
  }
}

const UCTX_MC = 48;          // aarch64 ucontext_t.uc_mcontext
const MC_PC = 8 * 33;        // mcontext.pc offset
const MC_FAULT = 0;          // mcontext.fault_address

function faultHandler(sig, info, uctx) {
  /* signal-unsafe API 금지 — 캐시된 범위와 pause()만 사용 */
  let inAppSuit = false;
  try {
    const pc = uctx.add(UCTX_MC + MC_PC).readPointer();
    inAppSuit = !!(appSuitRange && pc >= appSuitRange.base && pc < appSuitRange.end);
  } catch (e) {}
  if (inAppSuit) {
    while (true) { pauseFn(); }   /* 탐지 스레드 영구 정차 — 리턴 시 재폴트 */
  }
  if (prevFaultHandler && prevFaultHandlerFn) {
    prevFaultHandlerFn(sig, info, uctx);   /* ART fault manager로 체이닝 */
    return;
  }
  while (true) { pauseFn(); }             /* 체이닝 불가 → 안전하게 정차 */
}

const SA_SIGINFO = 4, SA_RESTART = 0x10000000, SA_ONSTACK = 0x08000000;
const SIGBUS = 7, SIGSEGV = 11, SIGTERM = 15;

const parkFaultCb = new NativeCallback(faultHandler, 'void', ['int', 'pointer', 'pointer']);
var prevFaultHandler = NULL;
var prevFaultHandlerFn = null;
[SIGBUS, SIGSEGV].forEach(function (s) {
  const old = Memory.alloc(40);
  const sa = Memory.alloc(40);
  sa.writeU32(SA_SIGINFO | SA_RESTART | SA_ONSTACK);
  sa.add(8).writePointer(parkFaultCb);
  sa.add(16).writeU64(0);
  sa.add(24).writePointer(NULL);
  const sigactionFn = new NativeFunction(
    Module.findExportByName('libc.so', 'sigaction'),
    'int', ['int', 'pointer', 'pointer']);
  const r = sigactionFn(s, sa, old);
  const prev = old.add(8).readPointer();
  if (!prev.isNull() && prev.toInt32() !== 0 && prev.toInt32() !== 1) {
    prevFaultHandler = prev;
    prevFaultHandlerFn = new NativeFunction(prev, 'void', ['int', 'pointer', 'pointer']);
  }
  console.log('[*] fault handler for sig ' + s + ' r=' + r + ' prev=' + prev);
});

/* SIGTERM — 파킹만 (전송은 이미 seccomp가 차단, 만약의 폴트용) */
const parkCb15 = new NativeCallback(function (sig) {
  while (true) { pauseFn(); }
}, 'void', ['int']);
const sigFn = new NativeFunction(Module.findExportByName('libc.so', 'signal'), 'pointer', ['int', 'pointer']);
sigFn(SIGTERM, parkCb15);
console.log('[*] park handler installed for sig ' + SIGTERM);

/* 엔진이 자기 .so 안의 핸들러로 7/11을 재등록하는 것을 가짜 성공으로 차단 */
['sigaction', '__sigaction'].forEach(function (fn) {
  const p = Module.findExportByName('libc.so', fn);
  if (!p) return;
  Interceptor.attach(p, {
    onEnter: function (a) {
      this.skip = false;
      const s = a[0].toInt32();
      if (s !== SIGBUS && s !== SIGSEGV) return;
      try {
        const h = a[1].add(8).readPointer();
        const m = Process.findModuleByAddress(h);
        if (m && m.name === 'libAppSuit.so') this.skip = true;
      } catch (e) {}
    },
    onLeave: function (r) { if (this.skip) r.replace(0); }
  });
});

/* ── 4. 하트비트 + 스레드 스냅샷 (탐지 워커 동정용) ───────────────────────── */
setInterval(function () {
  refreshAppSuitRange();
  var threads = Process.enumerateThreads().length;
  console.log('[beat] pid=' + SELF + ' threads=' + threads +
              ' appsuit=' + (appSuitRange ? 'known' : 'unknown'));
}, 5000);
console.log('[*] syscall_kill_block armed, self pid=' + SELF);
