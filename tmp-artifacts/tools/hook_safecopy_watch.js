// hook_safecopy_watch.js — SafeCopy/process_vm_readv 유저 측 전수 관찰 + 백트레이스
function modOf(addr) {
  const m = Process.findModuleByAddress(addr);
  return m ? m.name + "+0x" + (addr - m.base).toString(16) : "?";
}
function bt(ctx, n) {
  return Thread.backtrace(ctx, Backtracer.FUZZY).slice(0, n).map(modOf).join(" <- ");
}

// 1) libc process_vm_readv — 원격 iov 내용까지
const pvm = Module.findExportByName("libc.so", "process_vm_readv");
if (pvm) {
  Interceptor.attach(pvm, {
    onEnter(args) {
      this.pid = args[0].toInt32();
      const riovcnt = args[4].toInt32();
      let targets = [];
      try {
        const riov = args[3];
        for (let i = 0; i < Math.min(riovcnt, 4); i++) {
          const base = riov.add(i * 16).readU64();
          const len = riov.add(i * 16 + 8).readU64();
          targets.push(base + "/" + len);
        }
      } catch (e) {}
      this.info = "pid=" + this.pid + " riov=[" + targets.join(",") + "]";
      this.lr = modOf(this.returnAddress);
    },
    onLeave(retval) {
      send("[pvm] " + this.info + " lr=" + this.lr + " ret=" + retval + " bt=" + bt(this.context, 5));
    }
  });
  send("[+] process_vm_readv hooked");
}

// 2) dlsym/dlopen 감시 (기존)
const dlsymPtr = Module.findExportByName(null, "dlsym");
if (dlsymPtr) Interceptor.attach(dlsymPtr, {
  onEnter(args) {
    try { this.sym = args[1].readCString(); } catch (e) { this.sym = "?"; }
    this.ret = modOf(this.returnAddress);
  },
  onLeave(retval) { send("[dlsym] " + this.sym + " caller=" + this.ret + " -> " + retval); }
});
send("[+] dlsym hooked");

// 3) libartbase 로드되면 SafeCopy 후킹
function hookSafeCopy() {
  const m = Process.findModuleByName("libartbase.so");
  if (!m) return false;
  const sc = m.findExportByName("_ZN3art8SafeCopyEPvPKvm");
  if (!sc) { send("[!] SafeCopy not exported?"); return true; }
  Interceptor.attach(sc, {
    onEnter(args) {
      this.dst = args[0]; this.src = args[1]; this.len = args[2].toInt32();
      this.lr = modOf(this.returnAddress);
    },
    onLeave(retval) {
      let preview = "";
      try { preview = Memory.readByteArray(this.dst, Math.min(this.len, 16)); } catch (e) {}
      send("[SafeCopy] src=" + this.src + " len=" + this.len + " lr=" + this.lr +
           " ret=" + retval + " data=" + (preview ? Array.from(new Uint8Array(preview)).map(x => x.toString(16).padStart(2, '0')).join('') : "?"));
    }
  });
  send("[+] SafeCopy hooked at " + sc);
  return true;
}
if (!hookSafeCopy()) {
  const dl = Module.findExportByName(null, "android_dlopen_ext");
  Interceptor.attach(dl, { onLeave() { if (!hookSafeCopy()) return; } });
}
send("[+] setup done");
