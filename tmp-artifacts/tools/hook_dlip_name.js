// hook_dlip_name.js — dl_iterate_phdr 콜백에 전달되는 dlpi_name을 위조(랜덤명→plausible)
// + 가드가 실제로 열거한 라이브러리 목록 로깅. 인과 판정용 A/B 도구.
const RANDOM_RE = /lib(?:wpgwctvx5g|cf2rn4pmt62k5jkc|gxvvbxdgj4|7c7c8tkjlj|q892nk5ptwmbggc8xx|pc24gwzjqm|456b9nt2vkw78xzlxx)\.so/;
// 신뢰성 있는 Qualcomm풍 대체명 (원본보다 짧거나 같아 안전)
const REPLACEMENT = Memory.allocUtf8String("libqti_gles.so");
const REPLACEMENT2 = Memory.allocUtf8String("libllvm-qcom.so");
let toggle = 0;

const dlip = Module.findExportByName(null, "dl_iterate_phdr");
send("[+] dl_iterate_phdr at " + dlip);
const real = new NativeFunction(dlip, 'int', ['pointer', 'pointer']);

const wrappedCallbacks = [];
Interceptor.replace(dlip, new NativeCallback((cbPtr, data) => {
  // 콜백 wrapper: info 구조체의 name 필드(+0x8)를 임시 교체 후 원 콜백 호출
  const wrapper = new NativeCallback((info, size, data2) => {
    const namePtr = info.add(8).readPointer();
    let name = "";
    try { name = namePtr.readCString() || ""; } catch (e) {}
    if (name && RANDOM_RE.test(name)) {
      const repl = (toggle++ % 2 === 0) ? REPLACEMENT : REPLACEMENT2;
      info.add(8).writePointer(repl);
      const r = new NativeFunction(cbPtr, 'int', ['pointer', 'int', 'pointer'])(info, size, data2);
      info.add(8).writePointer(namePtr);
      return r;
    }
    return new NativeFunction(cbPtr, 'int', ['pointer', 'int', 'pointer'])(info, size, data2);
  }, 'int', ['pointer', 'int', 'pointer']);
  wrappedCallbacks.push(wrapper); // GC 방지
  return real(wrapper, data);
}, 'int', ['pointer', 'pointer']));
send("[+] dl_iterate_phdr replaced — random names sanitized");

// 관측: 가드가 호출하는 원본 dlsym("dl_iterate_phdr") 시점 기록
const dlsymPtr = Module.findExportByName(null, "dlsym");
Interceptor.attach(dlsymPtr, {
  onEnter(args) { try { this.s = args[1].readCString(); } catch (e) { this.s = "?"; } },
  onLeave(r) { if (this.s === "dl_iterate_phdr") send("[guard] dlsym(dl_iterate_phdr) → " + r + " caller=" + DebugSymbol.fromAddress(this.returnAddress).toString()); }
});
send("[+] dlsym watcher set");
