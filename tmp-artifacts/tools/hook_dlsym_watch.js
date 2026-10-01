// hook_dlsym_watch.js — 가드가 dlsym으로 찾는 심볼 전수 관찰 (SafeCopy 가설 검증)
// dlsym + android_dlopen_ext 감시, 호출자 모듈명 포함
function modOf(addr) {
  const m = Process.findModuleByAddress(addr);
  return m ? m.name + "+0x" + (addr - m.base).toString(16) : String(addr);
}
const dlsymPtr = Module.findExportByName("libdl.so", "dlsym") ||
                 Module.findExportByName(null, "dlsym");
if (dlsymPtr) {
  Interceptor.attach(dlsymPtr, {
    onEnter(args) {
      this.h = args[0];
      try { this.sym = args[1].readCString(); } catch (e) { this.sym = "?"; }
      this.ret = modOf(this.returnAddress);
    },
    onLeave(retval) {
      send("[dlsym] sym=" + this.sym + " caller=" + this.ret + " -> " + retval);
    }
  });
  send("[+] dlsym hooked at " + dlsymPtr);
} else {
  send("[!] dlsym not found");
}
// dlopen 계열도 감시 (가드가 libartbase를 직접 여는지)
["android_dlopen_ext", "dlopen"].forEach(fn => {
  const p = Module.findExportByName(null, fn);
  if (p) Interceptor.attach(p, {
    onEnter(args) { try { this.n = args[0].readCString(); } catch (e) { this.n = "?"; } this.ret = modOf(this.returnAddress); },
    onLeave(retval) { send("[dlopen] " + fn + " name=" + this.n + " caller=" + this.ret + " -> " + retval); }
  });
});
send("[+] dlopen watchers set");
