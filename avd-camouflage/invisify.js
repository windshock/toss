/*
 * invisify.js — 원본 앱 환경 무화 레이어 (kill 방어 없음, 탐지 근거 제거가 정책)
 *
 * 클린 런 커널 추적(2026-09-19)으로 확정된 에뮬레이터 흔적:
 *   1. /dev/__properties__/u:object_r:*qemu*   — 프롭 컨텍스트 파일 자체에 qemu 라벨
 *   2. /dev/goldfish_{pipe,address_space,sync} — 앱 GL이 실사용 → 엔진 스택에서만 ENOENT
 *   3. /proc/<pid>/status·cmdline·comm 스윕     — frida/수상 데몬 탐지
 *   4. /proc/self/maps                          — frida agent 흔적
 *   (± /proc/net/unix·tcp, /proc/cpuinfo, mounts — 정적분석 §2.20 트리거)
 *
 * 레이어:
 *   A. 프로퍼티 API 위장 (guard.js 계승 + init.svc 로깅)
 *   B. 파일 경로 ENOENT (qemu 컨텍스트·root 경로·엔진 스택 goldfish/qemu_pipe)
 *   C. 내용물 리다이렉트 (maps/net/status/cpuinfo → 사전 생성 위장 파일)
 *   D. Java 계층 (telephony·network)
 *   E. 엔진 프로브 로거 (디버깅용 — 어떤 경로를 무엇이 여는지)
 *
 * 사전 준비(호스트):
 *   adb shell "mkdir -p /data/local/tmp/.camo && chmod 777 /data/local/tmp/.camo"
 * 실행: frida_spawn.py invisify.js [초]
 */

const CFG = {
  model: 'SM-S916N', brand: 'samsung', manuf: 'samsung',
  name: 'dm2qksx', device: 'dm2q', board: 'dm2q',
  fp: 'samsung/dm2qksx/dm2q:13/TP1A.220624.014/S916NKSU1AWC2:user/release-keys',
  inc: 'S916NKSU1AWC2', tags: 'release-keys', type: 'user',
  patch: '2023-08-01',
  hardware: 'qcom', serial: 'RZ8T30A1B2C',
  ip: [192, 168, 0, 37], gw: [192, 168, 0, 1],
  mac: [0x84, 0x25, 0xdb, 0x3f, 0x1c, 0x8a],
  operator: 'SK Telecom', mccmnc: '45005', country: 'kr',
  imei: '356938035643809', imsi: '450051234567890',
  iccid: '89824501234567890123'
};

const SELF = Process.id;
const CAMO = '/data/local/tmp/.camo';
const libc = 'libc.so';

/* ═══════════════ libc 헬퍼 (파일 읽기·쓰기) ═══════════════ */
const _fopen = new NativeFunction(Module.findExportByName(libc, 'fopen'), 'pointer', ['pointer', 'pointer']);
const _fread = new NativeFunction(Module.findExportByName(libc, 'fread'), 'ulong', ['pointer', 'ulong', 'ulong', 'pointer']);
const _fwrite = new NativeFunction(Module.findExportByName(libc, 'fwrite'), 'ulong', ['pointer', 'ulong', 'ulong', 'pointer']);
const _fclose = new NativeFunction(Module.findExportByName(libc, 'fclose'), 'int', ['pointer']);
const _malloc = new NativeFunction(Module.findExportByName(libc, 'malloc'), 'pointer', ['ulong']);
const _free = new NativeFunction(Module.findExportByName(libc, 'free'), 'void', ['pointer']);

/* 스냅샷 재생성 중엔 훅이 리다이렉트하지 않게 하는 재진입 가드 */
let snapBusy = false;

/* frida가 만든 스레드(gum-js-loop 등) — /proc/self/task 열거와 comm에서 은닉 */
const fridaTids = {};
const FRIDA_THREAD_RE = /gum-js-loop|gmain|gdbus|pool-spawner|frida/i;

function refreshFridaTids() {
  try {
    Process.enumerateThreads().forEach(function (t) {
      const comm = readFileStr('/proc/self/task/' + t.id + '/comm', 64);
      if (comm && FRIDA_THREAD_RE.test(comm)) fridaTids[t.id] = true;
    });
  } catch (e) {}
}

function readFileStr(path, maxBytes) {
  const p = Memory.allocUtf8String(path);
  const f = _fopen(p, Memory.allocUtf8String('r'));
  if (f.isNull()) return null;
  const cap = maxBytes || (1 << 20);
  const buf = _malloc(cap);
  const n = _fread(buf, 1, cap, f).toNumber();
  _fclose(f);
  let s = '';
  try { s = buf.readUtf8String(n); } catch (e) { s = null; }
  _free(buf);
  return s;
}

function writeFileStr(path, content) {
  const f = _fopen(Memory.allocUtf8String(path), Memory.allocUtf8String('w'));
  if (f.isNull()) return false;
  const buf = Memory.allocUtf8String(content);
  _fwrite(buf, 1, content.length, f);
  _fclose(f);
  return true;
}

/* ═══════════════ C. 내용물 위장 파일 생성 ═══════════════ */
const FAKE_CPUINFO =
  'Processor\t: AArch64 Processor rev 1 (aarch64)\n' +
  'processor\t: 0\n' +
  'BogoMIPS\t: 38.40\n' +
  'Features\t: fp asimd evtstrm aes pmull sha1 sha2 crc32 atomics fphp asimdhp\n' +
  'CPU implementer\t: 0x51\n' +
  'CPU architecture: 8\n' +
  'CPU variant\t: 0xd\n' +
  'CPU part\t: 0x001\n' +
  'CPU revision\t: 4\n\n' +
  'Hardware\t: Qualcomm Technologies, Inc SM8550\n';

const FAKE_VERSION =
  'Linux version 5.15.104-android13-4-00001-gXXXXXXXXXXXX-ab12345678 ' +
  '(build@buildhost) (clang version 17.0.0) #1 SMP PREEMPT Thu Jun 15 09:12:34 UTC 2023\n';

function genSnapshots() {
  if (snapBusy) return;
  snapBusy = true;
  try {
    // maps: frida/gum 흔적 라인 필터
    const maps = readFileStr('/proc/self/maps', 4 << 20);
    if (maps) {
      const filtered = maps.split('\n').filter(function (l) {
        return !/frida|gum-js|gmain|gdbus|gadget|linjector|\.sysd|frida-agent/i.test(l);
      }).join('\n');
      writeFileStr(CAMO + '/maps', filtered);
    }
    // status: TracerPid 강제 0 + Threads 수 정합 (frida 스레드 수만큼 차감)
    const st = readFileStr('/proc/self/status', 64 * 1024);
    if (st) {
      let s2 = st.replace(/TracerPid:\s*\d+/, 'TracerPid:\t0');
      const hidden = Object.keys(fridaTids).length;
      if (hidden > 0) {
        const tm = s2.match(/Threads:\s*(\d+)/);
        if (tm) s2 = s2.replace(/Threads:\s*\d+/, 'Threads:\t' + Math.max(1, parseInt(tm[1], 10) - hidden));
      }
      writeFileStr(CAMO + '/status', s2);
    }
    // net/unix, net/tcp, mounts: 흔적 라인 필터
    ['unix', 'tcp'].forEach(function (f) {
      const d = readFileStr('/proc/net/' + f, 1024 * 1024);
      if (d) {
        writeFileStr(CAMO + '/net_' + f, d.split('\n').filter(function (l) {
          return !/frida|gum|\.rs9|\.sysd|@frida/i.test(l) && !/:(69A2|BAA1)/.test(l);
        }).join('\n'));
      }
    });
    const mnt = readFileStr('/proc/self/mounts', 1024 * 1024);
    if (mnt) {
      writeFileStr(CAMO + '/mounts', mnt.split('\n').filter(function (l) {
        return !/magisk|worker\/|\/data\/adb/i.test(l);
      }).join('\n'));
    }
    writeFileStr(CAMO + '/cpuinfo', FAKE_CPUINFO);
    writeFileStr(CAMO + '/version', FAKE_VERSION);
    writeFileStr(CAMO + '/comm', '.android.smcard\n');
  } finally {
    snapBusy = false;
  }
}
genSnapshots();
refreshFridaTids();

/* 리다이렉트 맵 — 정확 경로 + /proc/<SELF>/... 숫자형 */
const REDIRECT = {
  '/proc/self/maps': CAMO + '/maps',
  '/proc/self/status': CAMO + '/status',
  '/proc/self/mounts': CAMO + '/mounts',
  '/proc/net/unix': CAMO + '/net_unix',
  '/proc/net/tcp': CAMO + '/net_tcp',
  '/proc/cpuinfo': CAMO + '/cpuinfo',
  '/proc/version': CAMO + '/version'
};

/* ═══════════════ B. 경로 판정 로직 ═══════════════ */
const ENOENT_PATTERNS = [
  /^\/dev\/__properties__\/.*qemu/i,             // qemu 프롭 컨텍스트 파일 (프롭 위장 불가 영역)
  /(^|\/)su$/, /(^|\/)su\//, /superuser(\.apk)?$/i, /(^|\/)busybox/,
  /(^|\/)magisk/i, /(^|\/)ranchu/i, /qemu-props/, /libc_malloc_debug_qemu/,
  /^\/system\/xbin/, /^\/vendor\/xbin/           // su 스윕 디렉터리 (실기기에도 부재)
];
const ENGINE_GATED = [                           // 앱 GL이 실사용 → 엔진이 열 때만 은닉
  /^\/dev\/goldfish_/, /^\/dev\/qemu_pipe/, /^\/dev\/qemud/
];

/* 엔진 모듈 판정: 로드된 앱 네이티브 RASP 모듈 집합 */
function isEngineModule(m) {
  if (!m) return false;
  if (m.name === 'libAppSuit.so' || m.name === 'libMagicSEv2.so' ||
      m.name === 'libDSToolkitV30Jni.so' || m.name === 'libUSToolkit.so') return true;
  return m.path && /\/ahnlab\//.test(m.path);
}

let engineProbeLogCount = 0;
let currentProbePath = null;      // 로그 컨텍스트용
const engineTids = {};          // 한 번이라도 엔진으로 식별된 tid — 이후 전부 엔진 취급
function callerIsEngine(ctx) {
  const tid = Process.getCurrentThreadId();
  if (engineTids[tid]) return true;
  try {
    const bt = Thread.backtrace(ctx, Backtracer.ACCURATE);
    for (let i = 0; i < bt.length; i++) {
      const m = Process.findModuleByAddress(bt[i]);
      if (isEngineModule(m)) {
        engineTids[tid] = true;
        if (engineProbeLogCount < 200) {
          console.log('[ENGINE-PROBE] tid=' + tid + ' ' + m.name + ' +0x' +
            bt[i].sub(m.base).toString(16) + ' ctx=' + (currentProbePath || '?'));
          engineProbeLogCount++;
        }
        return true;
      }
    }
  } catch (e) {}
  return false;
}

function decideRedirect(path) {
  if (REDIRECT[path]) return REDIRECT[path];
  const m = path.match(/^\/proc\/(\d+)\/(maps|status|mounts)$/);
  if (m && m[1] === String(SELF)) return CAMO + '/' + (m[2] === 'mounts' ? 'mounts' : m[2]);
  return null;
}

function decideDeny(path) {
  for (let i = 0; i < ENOENT_PATTERNS.length; i++) {
    if (ENOENT_PATTERNS[i].test(path)) return true;
  }
  return false;
}

/* 안티디버깅: 엔진이 커널 추적 파일을 열어 판정(실측) — 실기기처럼 EACCES */
const _errno = new NativeFunction(
  Module.findExportByName(libc, '__errno') ||
  Module.findExportByName(libc, '__errno_location'),
  'pointer', []);
const ENOENT = 2, EACCES = 13;
function isTracingProbe(path) {
  return /^\/sys\/kernel\/tracing\//.test(path) || path === '/sys/kernel/debug/tracing/trace';
}

/* ═══════════════ B+C. open/openat/faccessat/stat 계열 훅 ═══════════════ */
const taskDirFds = new Map();
/* 자기 maps/status/mounts 계열은 무조건 리다이렉트 (백트레이스 판별 실패 시
   실제 maps가 새어 1.5초 내 판정 — 2026-09-19 실측). 링커는 /proc/self/maps를
   open하지 않고 커널 내부 자료구조를 쓰므로 무조건 교체가 안전. */
const SELF_RE = new RegExp('^/proc/(?:self/' + SELF + '|self|' + SELF +
  ')/(maps|smaps|smaps_rollup|status|mounts|cmdline|net/(unix|tcp))');
const TASK_RE = new RegExp('^/proc/(?:self|' + SELF + ')/task/(\\d+)/(comm|maps|smaps|status)$');

function decideRedirectUnconditional(path) {
  const P = String(SELF);
  if (path === '/proc/self/maps' || path === '/proc/self/smaps' ||
      path === '/proc/self/smaps_rollup' ||
      path === '/proc/' + P + '/maps' || path === '/proc/' + P + '/smaps' ||
      path === '/proc/' + P + '/smaps_rollup') return CAMO + '/maps';
  if (path === '/proc/self/status' || path === '/proc/' + P + '/status') return CAMO + '/status';
  if (path === '/proc/self/mounts' || path === '/proc/' + P + '/mounts') return CAMO + '/mounts';
  if (path === '/proc/net/unix') return CAMO + '/net_unix';
  if (path === '/proc/net/tcp') return CAMO + '/net_tcp';
  if (path === '/proc/cpuinfo') return CAMO + '/cpuinfo';
  if (path === '/proc/version') return CAMO + '/version';
  const m = path.match(TASK_RE);
  if (m) {
    const tid = parseInt(m[1], 10);
    if (m[2] === 'comm') return (fridaTids[tid] ? CAMO + '/comm' : null);
    return CAMO + '/maps';   // task/<tid>/maps·smaps·status 전부 위장
  }
  return null;
}

/* 재진입 가드 — 스냅샷 재생성 중 자기 자신의 maps 읽기는 실제 파일로 통과 */
let _snapBusyUnused = 0;

['openat', 'open', 'faccessat', 'faccessat2', 'statx', 'stat', 'lstat', 'fstatat', 'fstatat64',
 '__openat', 'openat64', 'open64'].forEach(function (fn) {
  const p = Module.findExportByName(libc, fn);
  if (!p) return;
  const pathArg = (fn === 'openat' || fn === 'faccessat' || fn === 'faccessat2' ||
                   fn === 'statx' || fn === 'fstatat' || fn === 'fstatat64') ? 1 : 0;
  Interceptor.attach(p, {
    onEnter: function (a) {
      this.deny = 0;                       // 0=통과, ENOENT, EACCES
      this.redirBuf = null;
      let path = null;
      try { path = a[pathArg].readCString(); } catch (e) { return; }
      if (!path) return;
      currentProbePath = path;

      if (isTracingProbe(path)) { this.deny = EACCES; return; }
      if (decideDeny(path)) { this.deny = ENOENT; return; }

      if (ENGINE_GATED.some(function (re) { return re.test(path); })) {
        if (callerIsEngine(this.context)) { this.deny = ENOENT; return; }
      }

      /* 자기 정보 계열 — 무조건 리다이렉트 (열 때마다 스냅샷 재생성으로 최신 유지) */
      const rp = snapBusy ? null : decideRedirectUnconditional(path);
      if (rp) {
        if (path.indexOf('maps') !== -1) {
          console.log('[HOOK-MAPS] tid=' + Process.getCurrentThreadId() + ' fn=' + fn + ' path=' + path);
          genSnapshots();   // 리다이렉트 직전 재생성
        }
        this.redirBuf = Memory.allocUtf8String(rp);        // GC 앵커
        a[pathArg] = this.redirBuf;
      }
      if (path === '/proc/self/task' || path === '/proc/' + SELF + '/task') {
        this.taskDir = true;
      }
    },
    onLeave: function (r) {
      if (this.deny) {
        _errno().writeS32(this.deny);
        r.replace(-1);
      } else if (this.taskDir && r.toInt32() > 0) {
        taskDirFds.set(r.toInt32(), true);
      }
    }
  });
});

/* /proc/self/task 디렉터리 열거에서 frida 스레드 tid 제거 (dirent 수술) */
const _getdents64 = Module.findExportByName(libc, 'getdents64');
if (_getdents64) {
  const _memmove = new NativeFunction(Module.findExportByName(libc, 'memmove'),
    'pointer', ['pointer', 'pointer', 'ulong']);
  Interceptor.attach(_getdents64, {
    onEnter: function (a) {
      this.fd = a[0].toInt32();
      this.buf = a[1];
    },
    onLeave: function (r) {
      if (!taskDirFds.has(this.fd) || r.toInt32() <= 0) return;
      let total = r.toInt32();
      let off = 0;
      let removed = false;
      while (off < total) {
        const recLen = this.buf.add(off + 16).readU16();
        if (recLen === 0) break;
        const name = this.buf.add(off + 19).readCString();
        const tid = parseInt(name, 10);
        if (!isNaN(tid) && fridaTids[tid]) {
          // 이 항목 제거: 뒤쪽 내용을 앞으로 이동
          const tail = total - (off + recLen);
          if (tail > 0) _memmove(this.buf.add(off), this.buf.add(off + recLen), tail);
          total -= recLen;
          removed = true;
        } else {
          off += recLen;
        }
      }
      if (removed) r.replace(total);
    }
  });
}

/* ═══════════════ dl_iterate_phdr — 링커 soinfo 열거에서 frida 제거 ═══════════════
   파일 리다이렉트로 못 막는 무파일 채널: 엔진이 링커의 로드 모듈 리스트를 직접
   순회하면 frida-agent가 그대로 보임. 콜백을 감싸 수상 모듈 엔트리를 스킵. */
(function () {
  const dip = Module.findExportByName(null, 'dl_iterate_phdr');
  if (!dip) return;
  const orig = new NativeFunction(dip, 'int', ['pointer', 'pointer']);
  let engineCb = null;
  const myCb = new NativeCallback(function (info, size, data) {
    try {
      const name = info.add(8).readPointer().readCString();   // dl_phdr_info.dlpi_name @8
      if (name && /frida|gum|gadget|linjector/i.test(name)) return 0;   // 스킵하고 계속
    } catch (e) {}
    return engineCb(info, size, data);
  }, 'int', ['pointer', 'ulong', 'pointer']);
  const wrapper = new NativeCallback(function (cb, data) {
    engineCb = new NativeFunction(cb, 'int', ['pointer', 'ulong', 'pointer']);
    return orig(myCb, data);
  }, 'int', ['pointer', 'pointer']);
  Interceptor.replace(dip, wrapper);
  console.log('[*] dl_iterate_phdr filtered');
})();

/* ═══════════════ A. 프로퍼티 위장 (guard.js 계승) ═══════════════ */
const PROPS = {
  'ro.boot.qemu.gltransport.draw': '',
  'ro.boot.qemu.gltransport.name': '',
  'ro.boot.qemu.avd_name': '',
  'ro.kernel.qemu': '0',
  'ro.boot.hardware': CFG.hardware,
  'ro.hardware': CFG.hardware,
  'ro.serialno': CFG.serial, 'ro.boot.serialno': CFG.serial,
  'ro.bootloader': CFG.inc, 'ro.boot.bootloader': CFG.inc,
  'ro.boot.verifiedbootstate': 'green',
  'ro.boot.flash.locked': '1',
  'ro.boot.veritymode': 'enforcing',
  'ro.boot.vbmeta.device_state': 'locked',
  'ro.boot.warranty_bit': '0', 'ro.warranty_bit': '0',
  'ro.product.model': CFG.model, 'ro.product.brand': CFG.brand,
  'ro.product.manufacturer': CFG.manuf, 'ro.product.name': CFG.name,
  'ro.product.device': CFG.device, 'ro.product.board': CFG.board,
  'ro.build.product': CFG.device, 'ro.build.fingerprint': CFG.fp,
  'ro.build.tags': CFG.tags, 'ro.build.type': CFG.type,
  'ro.build.characteristics': 'nosdcard',
  'ro.build.flavor': 'dm2qksx-user',
  'ro.build.version.incremental': CFG.inc, 'ro.build.version.security_patch': CFG.patch,
  'ro.product.board': CFG.board,
  'ro.board.platform': 'kalama',
  'ro.soc.model': 'SM8550', 'ro.soc.manufacturer': 'QTI',
  'ro.hardware.egl': 'adreno', 'ro.hardware.vulkan': 'adreno',
  'ro.opengles.version': '196610',
  'ro.vendor.qmmf.enable': '0'
};

const propGet = Module.findExportByName(libc, '__system_property_get');
if (propGet) {
  Interceptor.attach(propGet, {
    onEnter(a) { this.n = a[0].readCString(); this.v = a[1]; },
    onLeave(r) {
      const n = this.n;
      const f = PROPS[n];
      if (f !== undefined) { this.v.writeUtf8String(f); r.replace(f.length); return; }
      // 제네릭 룰: 에뮬레이터 전용 프롭 이름은 무조건 빈 값 (실기기에 존재하지 않음)
      if (n && (/qemu|goldfish|ranchu/i.test(n) || n.indexOf('ro.kernel.') === 0)) {
        this.v.writeUtf8String('');
        r.replace(0);
        return;
      }
      if (n && n.indexOf('init.svc.') === 0) {
        // init.svc.* 스캔 — 실측까지 로깅 (엔진이 뭘 묻는지)
        if (engineProbeLogCount < 200) {
          console.log('[SVC-QUERY] ' + n + ' -> ' + this.v.readCString());
          engineProbeLogCount++;
        }
      }
    }
  });
}
const propCb = Module.findExportByName(null, '__system_property_read_callback');
if (propCb) {
  Interceptor.attach(propCb, {
    onEnter(a) { this.cb = a[0]; this.cookie = a[1]; this.n = a[2].readCString(); },
    onLeave() {
      const v = PROPS[this.n];
      if (v !== undefined) {
        const invoke = new NativeFunction(this.cb, 'void', ['pointer', 'pointer', 'uint32']);
        invoke(this.cookie, Memory.allocUtf8String(v), 0);
      }
    }
  });
}

/* ═══════════════ D. Java 계층 (guard.js 계승 — telephony·network) ═══════════════ */
const ip2le = (a) => (a[0] | (a[1] << 8) | (a[2] << 16) | (a[3] << 24));
Java.perform(function () {
  /* Build.* 정적 필드 — zygote가 에뮬 값으로 미리 초기화해 둔 것을 교체.
     2초 판정의 유력 원인 (Java 계층 최초 체크). */
  try {
    const Build = Java.use('android.os.Build');
    const bv = {
      MODEL: CFG.model, MANUFACTURER: CFG.manuf, BRAND: CFG.brand,
      DEVICE: CFG.device, PRODUCT: CFG.name, BOARD: CFG.board,
      HARDWARE: CFG.hardware, FINGERPRINT: CFG.fp,
      TAGS: CFG.tags, TYPE: CFG.type,
      ID: 'TP1A.220624.014', DISPLAY: CFG.inc, HOST: 'SWDD6607', USER: 'dpi', SERIAL: CFG.serial,
      TIME: 1690876800000
    };
    Object.keys(bv).forEach(function (k) {
      try { Build[k].value = bv[k]; } catch (e2) { console.log('[!] Build.' + k + ': ' + e2); }
    });
    try { Java.use('android.os.Build$VERSION').INCREMENTAL.value = CFG.inc; } catch (e2) {}
    console.log('[*] Build.* fields spoofed');
  } catch (e) { console.log('[!] Build: ' + e); }

  try {
    const TM = Java.use('android.telephony.TelephonyManager');
    const tel = {
      getNetworkOperator: CFG.mccmnc, getNetworkOperatorName: CFG.operator,
      getSimOperator: CFG.mccmnc, getSimOperatorName: CFG.operator,
      getNetworkCountryIso: CFG.country, getSimCountryIso: CFG.country,
      getImei: CFG.imei, getDeviceId: CFG.imei,
      getSubscriberId: CFG.imsi, getSimSerialNumber: CFG.iccid
    };
    Object.keys(tel).forEach((m) => {
      if (!TM[m]) return;
      TM[m].overloads.forEach((ov) => { ov.implementation = function () { return tel[m]; }; });
    });
  } catch (e) { console.log('[!] TelephonyManager: ' + e); }

  try {
    const NI = Java.use('java.net.NetworkInterface');
    const getNameOrig = NI.getName, getDispOrig = NI.getDisplayName, hwOrig = NI.getHardwareAddress;
    const fakeMac = Java.array('byte', CFG.mac.map((v) => (v > 127 ? v - 256 : v)));
    NI.getName.implementation = function () {
      const n = getNameOrig.call(this); return n === 'eth0' ? 'wlan0' : n;
    };
    NI.getDisplayName.implementation = function () {
      const n = getDispOrig.call(this); return n === 'eth0' ? 'wlan0' : n;
    };
    NI.getHardwareAddress.implementation = function () {
      const n = getNameOrig.call(this);
      return (n === 'eth0' || n === 'wlan0') ? fakeMac : hwOrig.call(this);
    };
  } catch (e) { console.log('[!] NetworkInterface: ' + e); }

  try {
    const WM = Java.use('android.net.wifi.WifiManager');
    const getDhcpOrig = WM.getDhcpInfo;
    const ipInt = ip2le(CFG.ip), gwInt = ip2le(CFG.gw), nmInt = ip2le([255, 255, 255, 0]);
    WM.getDhcpInfo.implementation = function () {
      const d = getDhcpOrig.call(this);
      if (d !== null) {
        d.ipAddress.value = ipInt; d.gateway.value = gwInt; d.netmask.value = nmInt;
        d.dns1.value = gwInt; d.dns2.value = 0; d.serverAddress.value = gwInt;
        d.leaseDuration.value = 3600;
      }
      return d;
    };
  } catch (e) { console.log('[!] DhcpInfo: ' + e); }
});

/* Java 계층 판독자 필터 — FileInputStream 경로는 무조건 내용물 필터링
   (링커는 네이티브라서 영향 없음. Java로 /proc을 읽는 정상 코드는 사실상 없음) */
Java.perform(function () {
  const WATCH_RE = [
    /^\/proc\/self\/(maps|status|mounts)$/,
    new RegExp('^/proc/' + SELF + '/(maps|status|mounts)$'),
    /^\/proc\/net\/(unix|tcp)$/,
    /^\/proc\/cpuinfo$/, /^\/proc\/version$/,
    /^\/sys\/kernel\/tracing\//
  ];
  const JString = Java.use('java.lang.String');

  function camoMode(self) {
    /* 'filter' | 'cpuinfo' | 'version' | null */
    let p = null;
    try { p = self.getPath(); } catch (e) { return null; }
    if (!p) return null;
    if (p === '/proc/cpuinfo') return 'cpuinfo';
    if (p === '/proc/version') return 'version';
    if (WATCH_RE.some(function (re) { return re.test(p); })) return 'filter';
    return null;
  }

  function filterChunk(b, off, n, carry) {
    let text = carry + JString.$new(b, off, n).toString();
    const lines = text.split('\n');
    const newCarry = lines.pop();                    // 미완 라인 보관
    const kept = lines.filter(function (l) {
      return !/frida|gum-js|gadget|\.sysd|linjector|TracerPid:\s*[1-9]/i.test(l);
    });
    return { out: kept.length ? kept.join('\n') + '\n' : '', carry: newCarry };
  }

  try {
    const FIS = Java.use('java.io.FileInputStream');
    const carryMap = new Map();   // hashCode() 기반 — 동일 인스턴스 판별용

    FIS.$init.overload('java.lang.String').implementation = function (path) {
      const r = this.$init(path);
      carryMap.set(this.hashCode(), '');
      return r;
    };
    FIS.$init.overload('java.io.File').implementation = function (file) {
      const r = this.$init(file);
      carryMap.set(this.hashCode(), '');
      return r;
    };

    function handleRead(self, b, off, n) {
      const mode = camoMode(self);
      if (!mode || n <= 0) return n;
      if (mode === 'cpuinfo' || mode === 'version') {
        const fake = mode === 'cpuinfo' ? FAKE_CPUINFO : FAKE_VERSION;
        const bytes = JString.$new(fake).getBytes();
        const k = Math.min(bytes.length, n);
        for (let i = 0; i < k; i++) b[off + i] = bytes[i];
        return k;
      }
      const key = self.hashCode();
      const res = filterChunk(b, off, n, carryMap.get(key) || '');
      carryMap.set(key, res.carry);
      const outBytes = JString.$new(res.out).getBytes();
      for (let i = 0; i < outBytes.length; i++) b[off + i] = outBytes[i];
      return outBytes.length;
    }

    FIS.read.overload('[B').implementation = function (b) {
      return handleRead(this, b, 0, this.read(b));
    };
    FIS.read.overload('[B', 'int', 'int').implementation = function (b, off, len) {
      return handleRead(this, b, off, this.read(b, off, len));
    };
  } catch (e) { console.log('[!] FileInputStream filter: ' + e); }
});

/* ═══════════════ 스냅샷 리프레시 + 하트비트 ═══════════════ */
setInterval(function () {
  genSnapshots();
  refreshFridaTids();
}, 3000);

setInterval(function () {
  console.log('[beat] pid=' + SELF + ' threads=' + Process.enumerateThreads().length);
}, 10000);

console.log('[*] invisify armed — camo dir=' + CAMO + ' self pid=' + SELF);
