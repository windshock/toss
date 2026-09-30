/*
 * invisify_lite.js — LKM v3와 짝을 이루는 최소 프리다 계층
 *
 * 파일 계층(경로 차단·내용 리다이렉트)은 전부 커널 모듈(hide_kmod v3 + camow.sh)이
 * 담당하므로 여기서는 libc 패치를 하나도 하지 않는다. 프리다 에이전트 자체의 흔적은
 * LKM이 /proc/self/maps를 위장 파일로 리다이렉트해 숨긴다.
 *
 * 남은 역할 (커널이 못 하는 것):
 *   1. Java: Build.* 정적 필드, Telephony, NetworkInterface, DhcpInfo
 *   2. dl_iterate_phdr: 링커 soinfo 열거에서 frida-agent 엔트리 스킵 (무파일 채널)
 *   3. resetprop은 실행 전 adb에서 적용 (raw property area 판독자 커버)
 *
 * 실행: frida_spawn.py invisify_lite.js [초]
 */

const CFG = {
  model: 'SM-S916N', brand: 'samsung', manuf: 'samsung',
  name: 'dm2qksx', device: 'dm2q', board: 'dm2q',
  fp: 'samsung/dm2qksx/dm2q:13/TP1A.220624.014/S916NKSU1AWC2:user/release-keys',
  inc: 'S916NKSU1AWC2', tags: 'release-keys', type: 'user',
  hardware: 'qcom', serial: 'RZ8T30A1B2C',
  ip: [192, 168, 0, 37], gw: [192, 168, 0, 1],
  mac: [0x84, 0x25, 0xdb, 0x3f, 0x1c, 0x8a],
  operator: 'SK Telecom', mccmnc: '45005', country: 'kr',
  imei: '356938035643809', imsi: '450051234567890',
  iccid: '89824501234567890123'
};

/* ── 1. dl_iterate_phdr — 모듈 열거에서 frida 제거 ────────────────────────── */
(function () {
  const dip = Module.findExportByName(null, 'dl_iterate_phdr');
  if (!dip) return;
  const orig = new NativeFunction(dip, 'int', ['pointer', 'pointer']);
  let engineCb = null;
  const myCb = new NativeCallback(function (info, size, data) {
    try {
      const name = info.add(8).readPointer().readCString();   // dl_phdr_info.dlpi_name @8
      if (name && /frida|gum|gadget|linjector/i.test(name)) return 0;
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

/* ── 2. Java 계층 ─────────────────────────────────────────────────────────── */
const ip2le = (a) => (a[0] | (a[1] << 8) | (a[2] << 16) | (a[3] << 24));
Java.perform(function () {
  try {
    const Build = Java.use('android.os.Build');
    const bv = {
      MODEL: CFG.model, MANUFACTURER: CFG.manuf, BRAND: CFG.brand,
      DEVICE: CFG.device, PRODUCT: CFG.name, BOARD: CFG.board,
      HARDWARE: CFG.hardware, FINGERPRINT: CFG.fp,
      TAGS: CFG.tags, TYPE: CFG.type,
      ID: 'TP1A.220624.014', DISPLAY: CFG.inc,
      HOST: 'SWDD6607', USER: 'dpi', SERIAL: CFG.serial,
      TIME: 1690876800000
    };
    Object.keys(bv).forEach(function (k) {
      try { Build[k].value = bv[k]; } catch (e2) {}
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
    console.log('[*] TelephonyManager spoofed');
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
    console.log('[*] NetworkInterface spoofed');
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
    console.log('[*] DhcpInfo spoofed');
  } catch (e) { console.log('[!] DhcpInfo: ' + e); }
});

/* ── 3. 하트비트 ──────────────────────────────────────────────────────────── */
setInterval(function () {
  console.log('[beat] pid=' + Process.id + ' threads=' + Process.enumerateThreads().length);
}, 10000);
console.log('[*] invisify_lite armed, self pid=' + Process.id);
