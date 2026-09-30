/*
 * guard.js — AVD 위장 런타임 레이어 (camouflage.sh 와 짝)
 *
 * 담당 범위 (camouflage.sh 가 못 고치는 것들):
 *   1. 커널 cmdline 유래 props : ro.boot.qemu.*, ro.kernel.qemu, ro.hardware, ro.boot.*
 *   2. 파일 프로브             : su / busybox / Superuser / qemu·goldfish 아티팩트 → ENOENT
 *   3. 네트워크 지문           : 10.0.2.x → 192.168.0.x, eth0 → wlan0, QEMU MAC → 실기기 MAC
 *   4. Telephony               : 통신사명/MCC+MNC/IMEI/IMSI/ICCID (에뮬 "T-Mobile" → SKT)
 *
 * 실행 (spawn 필수 — Build.* 가 프롭에서 초기화되기 전에 훅을 걸어야 IPInside 수집값이 바뀜):
 *   frida -U -f <패키지명> -l guard.js
 */

const CFG = {
  model: 'SM-S916N', brand: 'samsung', manuf: 'samsung',
  name: 'dm2qksx', device: 'dm2q', board: 'dm2q',
  fp: 'samsung/dm2qksx/dm2q:13/TP1A.220624.014/S916NKSU1AWC2:user/release-keys',
  inc: 'S916NKSU1AWC2', tags: 'release-keys', type: 'user',
  patch: '2023-08-01',
  hardware: 'qcom', serial: 'RZ8T30A1B2C',
  ip: [192, 168, 0, 37], gw: [192, 168, 0, 1],
  mac: [0x84, 0x25, 0xdb, 0x3f, 0x1c, 0x8a],      // Samsung OUI 계열 (아무 실기기 대역)
  operator: 'SK Telecom', mccmnc: '45005',        // SKT (KT=45008, LGU+=45006)
  country: 'kr',
  imei: '356938035643809',                        // Luhn 유효 15자리
  imsi: '450051234567890',
  iccid: '89824501234567890123'
};

/* ───────────────────────── 1. 시스템 프로퍼티 위장 ───────────────────────── */
const PROPS = {
  // QEMU 시그니처 (관측된 탐지 발화점)
  'ro.boot.qemu.gltransport.draw': '',
  'ro.boot.qemu.gltransport.name': '',
  'ro.kernel.qemu': '0',
  // 하드웨어/부트로더/부트 상태
  'ro.boot.hardware': CFG.hardware,
  'ro.hardware': CFG.hardware,
  'ro.serialno': CFG.serial, 'ro.boot.serialno': CFG.serial,
  'ro.bootloader': CFG.inc, 'ro.boot.bootloader': CFG.inc,
  'ro.boot.verifiedbootstate': 'green',
  'ro.boot.flash.locked': '1',
  'ro.boot.veritymode': 'enforcing',
  'ro.boot.vbmeta.device_state': 'locked',
  'ro.boot.warranty_bit': '0', 'ro.warranty_bit': '0',
  // build.prop 계열 (스크립트 미적용 상태에서 단독 사용 시의 백업 커버)
  'ro.product.model': CFG.model, 'ro.product.brand': CFG.brand,
  'ro.product.manufacturer': CFG.manuf, 'ro.product.name': CFG.name,
  'ro.product.device': CFG.device, 'ro.product.board': CFG.board,
  'ro.build.product': CFG.device, 'ro.build.fingerprint': CFG.fp,
  'ro.build.tags': CFG.tags, 'ro.build.type': CFG.type,
  'ro.build.version.incremental': CFG.inc, 'ro.build.version.security_patch': CFG.patch
};

// 구식 API (문자열 직접 조회)
const propGet = Module.findExportByName('libc.so', '__system_property_get');
if (propGet) {
  Interceptor.attach(propGet, {
    onEnter(a) { this.n = a[0].readCString(); this.v = a[1]; },
    onLeave(r) {
      const f = PROPS[this.n];
      if (f !== undefined) { this.v.writeUtf8String(f); r.replace(f.length); }
    }
  });
}

// 신식 API (API 26+ 네이티브 코드가 주로 사용 — 콜백에 가짜값 재전달)
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

/* ───────────────────────── 2. 파일 프로브 은닉 ───────────────────────────── */
const SUS = [
  /\/su$/, /\/su\//, /superuser(\.apk)?$/i, /(^|\/)busybox/, /(^|\/)magisk/,
  /qemu[_-]pipe/, /goldfish/, /(^|\/)ranchu/, /qemu-props/, /libc_malloc_debug_qemu/,
  /^\/system\/xbin/                          // 관측된 발화 디렉터리
];
const isSus = (p) => !!p && SUS.some((re) => re.test(p));

['access', 'fopen', 'open', 'openat', 'stat', 'lstat'].forEach((fn) => {
  const p = Module.findExportByName('libc.so', fn);
  if (!p) return;
  Interceptor.attach(p, {
    onEnter(a) {
      this.b = false;
      try {
        const path = (fn === 'openat') ? a[1].readCString() : a[0].readCString();
        if (isSus(path)) this.b = true;
      } catch (e) {}
    },
    onLeave(r) { if (this.b) r.replace(-1); }   // ENOENT
  });
});

/* ───────────────────────── 3. 네트워크 지문 위장 ─────────────────────────── */
// getifaddrs: 10.0.2.x → 192.168.0.x, eth0 → wlan0, QEMU MAC(52:54:00..) → 실기기 MAC
const ip2le = (a) => (a[0] | (a[1] << 8) | (a[2] << 16) | (a[3] << 24)); // little-endian int

const gifa = Module.findExportByName(null, 'getifaddrs');
if (gifa) {
  const P = Process.pointerSize;
  const rewriteSock = (sa) => {
    if (sa.isNull()) return;
    const fam = sa.readU16();
    if (fam === 2) {                                    // AF_INET
      const b0 = sa.add(4).readU8(), b1 = sa.add(5).readU8(),
            b2 = sa.add(6).readU8();
      if (b0 === 10 && b1 === 0 && b2 === 2) {          // 10.0.2.x
        sa.add(4).writeU8(CFG.ip[0]);
        sa.add(5).writeU8(CFG.ip[1]);
        sa.add(6).writeU8(CFG.ip[2]);                   // 마지막 옥텟은 유지
      }
    } else if (fam === 17) {                            // AF_PACKET (MAC)
      for (let i = 0; i < 6; i++) sa.add(8 + i).writeU8(CFG.mac[i]);
    }
  };
  Interceptor.attach(gifa, {
    onEnter(a) { this.out = a[0]; },
    onLeave(r) {
      if (r.toInt32() !== 0 || this.out.isNull()) return;
      let cur = this.out.readPointer();
      while (!cur.isNull()) {
        const nameOff = cur.add(2 * P), addrOff = cur.add(3 * P),
              maskOff = cur.add(4 * P), ifuOff  = cur.add(5 * P);
        const namePtr = nameOff.readPointer();
        if (!namePtr.isNull() && namePtr.readCString() === 'eth0') {
          nameOff.writePointer(Memory.allocUtf8String('wlan0'));
        }
        rewriteSock(addrOff.readPointer());
        rewriteSock(maskOff.readPointer());
        rewriteSock(ifuOff.readPointer());
        cur = cur.readPointer();
      }
    }
  });
}

/* ───────────────────────── 4. Java 레이어 위장 ───────────────────────────── */
Java.perform(function () {
  // TelephonyManager: "T-Mobile"(310260 가상심) → 실제 통신사 패턴
  try {
    const TM = Java.use('android.telephony.TelephonyManager');
    const tel = {
      getNetworkOperator: CFG.mccmnc,
      getNetworkOperatorName: CFG.operator,
      getSimOperator: CFG.mccmnc,
      getSimOperatorName: CFG.operator,
      getNetworkCountryIso: CFG.country,
      getSimCountryIso: CFG.country,
      getImei: CFG.imei,
      getDeviceId: CFG.imei,
      getSubscriberId: CFG.imsi,
      getSimSerialNumber: CFG.iccid
    };
    Object.keys(tel).forEach((m) => {
      if (!TM[m]) return;
      TM[m].overloads.forEach((ov) => {
        ov.implementation = function () { return tel[m]; };
      });
    });
  } catch (e) { console.log('[!] TelephonyManager: ' + e); }

  // NetworkInterface: eth0 → wlan0 표시, QEMU MAC → 실기기 MAC
  try {
    const NI = Java.use('java.net.NetworkInterface');
    const getNameOrig = NI.getName;
    const getDispOrig = NI.getDisplayName;
    const hwOrig = NI.getHardwareAddress;
    const fakeMac = Java.array('byte',
      CFG.mac.map((v) => (v > 127 ? v - 256 : v)));
    NI.getName.implementation = function () {
      const n = getNameOrig.call(this);
      return n === 'eth0' ? 'wlan0' : n;
    };
    NI.getDisplayName.implementation = function () {
      const n = getDispOrig.call(this);
      return n === 'eth0' ? 'wlan0' : n;
    };
    NI.getHardwareAddress.implementation = function () {
      const n = getNameOrig.call(this);
      return (n === 'eth0' || n === 'wlan0') ? fakeMac : hwOrig.call(this);
    };
  } catch (e) { console.log('[!] NetworkInterface: ' + e); }

  // DhcpInfo: 10.0.2.x 게이트웨이/DNS → 192.168.0.x
  try {
    const WM = Java.use('android.net.wifi.WifiManager');
    const getDhcpOrig = WM.getDhcpInfo;
    const ipInt = ip2le(CFG.ip), gwInt = ip2le(CFG.gw), nmInt = ip2le([255, 255, 255, 0]);
    WM.getDhcpInfo.implementation = function () {
      const d = getDhcpOrig.call(this);
      if (d !== null) {
        d.ipAddress.value = ipInt;
        d.gateway.value = gwInt;
        d.netmask.value = nmInt;
        d.dns1.value = gwInt;
        d.dns2.value = 0;
        d.serverAddress.value = gwInt;
        d.leaseDuration.value = 3600;
      }
      return d;
    };
  } catch (e) { console.log('[!] DhcpInfo: ' + e); }

  console.log('[*] guard.js loaded — ' + CFG.model + ' / ' + CFG.operator +
              ' / ' + CFG.ip.join('.'));
});
