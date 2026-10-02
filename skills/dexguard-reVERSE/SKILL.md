---
name: dexguard-reVERSE
description: DexGuard-protected Android app reverse engineering. Hidden DEX dumping (InMemoryDexClassLoader/mCookie/direct-buffer), 6-variant string decryption (tbl/tea/native-xor), OLLVM flattening static decode (SWAR constant-cancellation + reloc-addend 2D table), native guard chain tracing (GOT dispatch/16k battery), runtime observation (frida patterns/observer-effect laws/property tracing). Use when analyzing apps with DexGuard packing, string encryption, code virtualization, native RASP, environment detection, or self-destruct mechanisms.
---

# DexGuard Reverse Engineering

## When to use
- App is packed with DexGuard (hidden DEX via InMemoryDexClassLoader)
- Strings are encrypted (6 known variants)
- Native library contains OLLVM control-flow flattening
- App has environment detection / anti-emulator / anti-root logic
- App self-destructs (SIGSEGV/SIGABRT/System.exit) on detection

## Protection layers (bottom-up)

```
Main DEX (app code + trampoline lambdas)
  └── InMemoryDexClassLoader (DexGuard unpacker)
       ├── Stub/decoy DEX (empty strings, deterministic bytes)
       └── Real hidden DEX (601 classes, boot-stable)
            ├── Guard classes (renamed o/*)
            ├── String decoders (6 variants)
            └── native bridge → libea56.so (RASP engine)
                 ├── OLLVM flattening (16k loop)
                 ├── 2D dispatch table (0x17c1e0, stride 0x960)
                 └── GOT entries (system_property, dl_iterate_phdr, syscall...)
```

## 1. Dumping the hidden DEX

### Method A: invobj chain (gdbstub, most reliable)
```python
# At afed8(x0=4) stop → invobj arg1 → [0]→+0x10→[+0x10]→+0x18 = dex base
# See: dump_hidden_dex_repro.py
```

### Method B: mCookie route (frida)
```javascript
// loader → pathList.dexElements[].dexFile.mCookie (long[])
// → reflection Array.getLong(cookie, 1) = art::DexFile*
// → begin_/size_ direct read (validate: header_size==0x70 ∧ endian_tag)
// See: hook_dump_cookies.js
```

### Method C: ByteBuffer.wrap hook (frida)
```javascript
// ByteBuffer.wrap(byte[]) → arg = Java byte[] → Base64.encodeToString(arr, 2)
// Note: direct-buffer dexes (JNI/memcpy) are NOT caught by this
```

### Key facts
- Real DEX is **boot-stable** (byte-identical across boots/devices)
- Stub/decoy DEX is also deterministic but has **empty string_data**
- Header 0x00-0x38 is scrubbed (magic/checksum/sig randomized per boot)
- map_list at end of file; rebuild with 18 entries for jadx/dexdump

## 2. String decryption (6 variants)

| Variant | Algorithm | Key extraction |
|---------|-----------|----------------|
| tbl (central) | `rotl16(T[i+k],13) ^ ((k·rotl64(R,45))&0xFFFF) ^ c` | literal in class, 3363 chars |
| tea-standard | TEA 16-round char cipher | per-class 4 keys from decompiled source |
| tea-XOR | `c[k] ⊕ (k·seed) ⊕ const` | known-plaintext |
| tea-bit-select | bit-select + XOR chain | RepeatModeUtil reverse |
| v3 (alternate table) | radix div/mod + XOR | per-class key/table |
| native-xor | `(T[i+k]^XK) ^ ((k·W)&0xFFFF) ^ c` | W=rotl64(R,6)&0xFFFF; R=class long field |

### Decryption formula discovery (native-xor)
```python
# 1. Hook RegisterNatives → get fnPtr of b/c natives
# 2. Hook the native fn → capture (j, k, R, c) tuples live
# 3. Verify: out[k] = (T[i+k] ^ XK) ^ ((k * rotl64(R,6)) & 0xFFFF) ^ c
# 4. Ground truth: known plaintext (e.g. "java.lang.System")
```

### Census tool
```bash
python3 dexstr_census.py  # sweeps all classes, applies 5+ variants
python3 dexstr_sweep6.py  # native-xor variant with runtime keys
```

## 3. OLLVM static decode

### SWAR constant-cancellation pattern
```arm
ldr  x10, [key_slot]     ; load hardcoded key
neg  w10, w10            ; negate
mov  w11, #magic         ; load magic (= key_lo32 usually!)
orr  w12, w10, w11       ; SWAR add components
...
add  w10, w12, w10       ; result = (-key) + magic = CONSTANT
```
When `magic == key_lo32`, result is **always 0** → constant index.

### 2D dispatch table resolution
```python
# table_base = 0x17c1e0 (from adrp/add pairs)
# slot = base + row*0x960 + col*8
# reloc = R_AARCH64_RELATIVE → addend = function offset in libea56
# reloc = R_AARCH64_ABS64 → libc API (system_property, dlopen, etc.)
```

### Key tools
```bash
llvm-readelf -r libea56.so     # reloc table
llvm-objdump -d --start-address=0xXXXX --stop-address=0xYYYY libea56.so
```

## 4. Native guard chain

### Kill chain (confirmed)
```
Java R(0,0) → afed8(id) → state4 → b0354
  → SWAR constants → 2D table → GOT API calls
  → 16,383-iteration loop (property checks)
  → conditional dispatch (cmp x23,#0 → cset → tst/csel)
  → if detected: poison block (LR corruption → SIGSEGV)
  → if clean: normal return
```

### 2D table GOT entries (58 APIs)
- **Property**: __system_property_get/find_nth/read_callback/foreach
- **File**: opendir/readdir/closedir/stat/statfs/basename
- **Dynamic**: dl_iterate_phdr/dlopen/dlsym/dlerror
- **Process**: fork/execv/_exit/syscall/prctl/getppid
- **Memory**: malloc/calloc/realloc/free/mprotect/sysconf

## 5. Runtime observation

### Frida patterns (proven safe)
| Hook | Safety | Notes |
|------|--------|-------|
| afed8 entry (native) | ✓ safe | Light bp preserves native path 3/3 |
| RegisterNatives vtable[215] | ✓ safe | Captures native fnPtrs |
| getMethod/getDeclaredMethod | ✓ safe (signature-filtered) | After guard activation only |
| libc property_get | ✓ safe | For property trace |
| ByteBuffer.wrap | ✓ safe | For DEX dump |
| Class.forName | ✗ CRASH | Breaks loader context |
| Method.invoke (global) | ✗ kills sequence | Perturbs flow |
| Stalker | ✗ CRASH | Too invasive |

### Observer-effect laws
1. Java hooks on hidden-DEX classes: only fire on **one loader copy**
2. Long returns lose precision (>2^53) → use `NativeFunction('int64')` or Java-side `Long.toString()`
3. `ByteBuffer[]` args arrive as value-wrappers (no `$handle`)
4. frida-server zombie → restart, then `adb forward` correct port
5. Emulator port conflict: SDK emulator adb=5555 vs redroid hostfwd=5555 → use 5556+

### Property trace (libc hook)
```javascript
// Hook __system_property_get + __system_property_find + openat
// Arm at first afed8(0), capture until death
// See: hook_proptrace.js
```

## 6. Detection surface (what the guard checks)

### Property channel
- ro.kernel.qemu, qemu.sf.fake_camera, init.svc.qemu-props
- ro.product.model/device/manufacturer/brand
- build fingerprint (5 variants)
- ro.boot.redroid_net_dns1/2
- persist.vmos.root.enable

### File channel
- /proc/self/maps (goldfish/qemu device nodes)
- /proc/net/unix (qemud sockets)
- Virtual env paths: /data/data/com.gbox.android/vfs_data, /system/vphone_space

### Dynamic library channel
- dl_iterate_phdr → loaded .so names (gralloc.redroid.so etc.)

### Java API channel (NOT used by Toss guard — verified)
- Display.getOwnerPackageName: NOT in code
- Sensor list: NOT in code
- GL extensions: NOT in code (checked at native level only)

## 7. Tool inventory

| Tool | Purpose |
|------|---------|
| dexstr.py | Central tbl + TEA decryptor |
| dexstr_census.py | Multi-variant string census |
| dexstr_sweep6.py | Native-xor variant sweep |
| dex_namemap.py | Boot-stable structural class matching |
| scan_getter_args.py | Call-site (i,n,c) extraction |
| hook_dump_cookies.js | mCookie DEX dump |
| hook_dump_imdex.js | ByteBuffer.wrap DEX dump |
| hook_proptrace.js | libc property/file trace |
| hook_subchecks.js | Battery presence probe |
| hook_sigrefl.js | Signature-filtered reflection capture |
| hook_r_jni.js | RegisterNatives + JNI arg capture |
| repair_hidden_dex.py | Scrubbed header + map_list rebuild |
| hook_e1_syscall.js | Property spoof + ftrace marker syscalls |
| run_e1_syscalltrace.py | Kernel-level battery syscall capture orchestration |
| ftrace_guest_setup.sh | Guest instance reset/arm/stop (recreate, not truncate) |
| ftrace_alltid_trace.sh | All-tid syscall+getname(kprobe) trace until death |
| fd_poll.sh | Guest fd-table snapshot poller (what the fd walk sees) |
| extract_vocab.py | Full vocabulary extraction from DEX string pool (§149 decoder) |

## 7b. Kernel-level observation (when libc hooks go blind — §139)

The guard reads `/dev/__properties__/*` by direct open+mmap and calls
readlinkat/getsockopt/fgetxattr/getdents64 that no libc hook covered. Observe at the kernel:
- Tracepoints `raw_syscalls/sys_enter+sys_exit` in a dedicated instance; kprobe
  `p:a2p getname_flags path=+0(%x0):ustring` for path strings.
- Reset an instance by **rmdir+mkdir** — `echo > trace` wedges it (0 entries, per_cpu files vanish; kernel 6.8).
- `common_pid == N` filters **one tid only**; for the thread group write all tids from
  `/proc/PID/task` to `set_event_pid` and refresh periodically. Guard thread is `RxCachedThreadS` (tid ≠ pid).
- Align timelines with marker syscalls: openat(flags=0x241, mode=0x1a4) is greppable in raw args.
- Push guest scripts as files and run `su 0 sh /path` — nested quotes through adb silently no-op filters.

## 7c. Frida return-value (w0) capture — §143

libc hooks are safe on this guard (Interceptor onLeave), and gdbstub/hw-bp are unnecessary for w0:
- Hook the §139-discovered unhooked set: readlinkat (buffer on leave), uname (utsname at +130/+195/+260/+325),
  sysconf, dlsym (symbol census), getsockopt/fgetxattr, syscall wrapper.
- **uname is a live channel**: container guests leak "Ubuntu/-generic" kernel strings; hook it AND the
  /proc/version file channel (guard cross-checks — spoofing uname alone does not flip the verdict).
- frida "need Gadget / jailed Android" on spawn = a **shell-uid frida-server holding port 27042**;
  kill by `pidof frida-server` (not `pkill -f`, which self-matches) and start one root instance (-D).
- Observer effect: with frida attached the guard switches its death path (Java System.exit → native
  SIGSEGV self-destruct in RxCachedThreadS). Frida-read verdicts are valid; frida-free behavior is not.

## 7d. Static vocabulary extraction — §149

The guard's detection vocabulary can be fully decrypted from the DEX string pool:
- **Decoder**: `out[k] = rotl16(tbl[i+k], 13) ^ ((k*W)&0xFFFF) ^ c` where `W = rotl64(R, 45) & 0xFFFF`
- **Table**: DEX string #4236 (MUTF-8 4380 chars, all <256 → getBytes(ISO-8859-1) = 4380 bytes → CharBuffer BE = 2190 chars)
- **Keys**: `R = 6339512474634032604`, `W = 0x3D77`
- Each call site uses `(i, len, c)` where c must be brute-forced from jadx constant reconstruction (±2 error due to ViewConfiguration expressions)
- First-char heuristic: `/` for paths, uppercase for tags (`GENERIC`, `GOLDFISH`, `BLUESTACKS`), `g` for `generic`
- **Result**: ~35 file paths + ~12 build tags + `ro.product.{manufacturer,device,model}` value matching list

## 7e. DetectFactor enumeration — §149

5 enum checks (s8ExternalSyntheticLambda1), each with `checkUnsafeInternal(Context)`:
- **EMULATOR**: Java = `ro.product.*` value matching (Genymotion/Genymobile/vbox86p/generic/emulator/
  "Android SDK built for x86"/"App Runtime for Chrome") + native run() file checks
- **ROOT**: RootBeer library (asInterface/onExtraCallbackWithResult/onNavigationEvent)
- **HOOK**: hardcoded `return null` — always safe (disabled in release)
- **VIRTUAL_ENVIRONMENT**: static condition → always null (disabled)
- **DEBUGGER**: `== 1` gate → always null in release; reflection on `isDebuggerConnected`
- **TAMPER_CERT**: Crosscert `ToolkitManager.getAppCertList()` → remote certificate pinning

## 7f. Global kill flag — §149

The exit is gated by a single static boolean in `getBooleanFromAdObject`:
- `IAuthTabCallback` (private static boolean, default false)
- Set by `UST_CRYPT_VerifySignatureValue_NoAlgorithmInfo.onExtraCallback(z)` = cert verification result
- `onNavigationEvent()` returns it → logging + `exitPlan` decision
- This means TAMPER_CERT is the **only path** to setting the global kill flag to true

## 8. Methodology (learned the hard way)

1. **Verify environment identity first** — getprop + model after ANY emulator lifecycle change
2. **Don't trust state-id block descriptions** — flattening state IDs ≠ code addresses
3. **Check superclass_idx at +8** (not +4 which is access_flags)
4. **Use dexdump as ground truth** over custom parsers
5. **Verify strings ARE populated** — early DEX snapshots have empty string_data
6. **Reloc addend + SWAR = static table decode** — no runtime needed
7. **cmp x23,#0 after API call** is the detection gate, not error handling

## 9. Reference: Toss 5.276.0 case study (§97-§134)

### Guard architecture discovered
```
AbsAppGuard (hidden DEX "o.createFromParcel") — abstract base
  └── s3 (concrete, singleton) — execution policy: 0s/10s delay
       └── getBooleanFromFullResponse (detector manager)
            └── guardLevel gate: LOW={DEBUGGER,EMULATOR} HIGH=+HOOK MAX=+6
                 └── s8ExternalSyntheticLambda1 (enum, 6 types)
                      └── EMULATOR.checkUnsafeInternal(ctx)
                           └── DataSourceBitmapLoader…onNavigationEvent(ctx,1,3)
                                └── native run() → libea56 → 16k loop → verdict
```

### R-tick mechanics
- Scanner cache seeded -1/0 at <clinit> → first tick always mismatch → rescan
- R(0,0) → afed8(4) → state4 → constant SWAR → 2D table → GOT → property checks
- **CONDITIONAL**: `cmp x23,#0 → cset → tst/csel → br` = detection gate
  - Found (detected) → early ret → Java EXIT action
  - Not found (clean) → memset + continue loop → clean return

### Timing
- ~5s: Java-exit (if detection) = System.exit(0)
- ~15-20s: R-tick (if guard active) = native poison (LR corruption → SIGSEGV)
- Activation: lifecycle START event (AppLifecycleEventObserver, no server gate)

### Key artifacts
- `toss_hidden_fixed.dex` — repaired hidden DEX (dexdump-passing)
- `toss_hidden.jar` — jadx-decompilable JAR
- `hidden_strings.txt` — 201 decrypted strings
- `proptrace_run1.log` — complete property/file access census
- FINDINGS.md §97-§134 — full analysis chain

### Environment laws (learned)
- Emulator port 5555 conflict (SDK emulator vs redroid hostfwd) → use 5556+
- Guest identity changes after reboot → always verify getprop+model
- frida long marshaling loses >2^53 precision → NativeFunction('int64')
- Per-boot dex name randomization is FALSE — stub dexes are deterministic

## 10. Native data-layer decode — §170/§171 (Toss libea56)
- **Ghidra image base = 0x100000** (FUN_0020xxxx ↔ vaddr 0x10xxxx) — DAT_002747ba = vaddr **0x1747ba(rw!)**, .text 아님. 배치 디컴파일 결과의 DAT_ 주소는 항상 -0x100000 변환.
- **8.7KB 블롭(rw+0x10000) = JNI 문자열 풀**: [포인터 테이블 8B×N][헤더][메서드\0시그\0난독클래스 o/*]. 코드가 blob+0x110+고정오프셋으로 직접 참조 — 제자리 복호 전제.
- **복호기 패밀리 9종**(0x93aa0/0x90f38/0x90bbc/0x91ed8/0x9124c/0x919ac/0x9213c/0x928a8/0x92914): TEA족(델타 0x61C88647), 키 배열 rw 0x1747ba(4B 엔트리, 자기수정), 0x185758 글로벌 + 상수 0x940710612d39c15d SWAR 가산으로 계산주소 인출. 레코드 형식: [06][len][암호문] — 라이브에서 "/proc/self/cmdline" 등 확인.
- **needle은 네이티브 평문 미보유** — 복호 풀/JNI 공급, 힙 스크래치 통과(판정 시점 힙 strings = 바늘 인벤토리의 최종 관측면).
- **배치 디컴파일**: decomp_batch.java — dispatch_resolved.json 타깃 1,969개를 Ghidra 1회 실행으로 전량 디컴파일(1,317 실체+652 트램폴린). 발화 게이트 = afed8 내 0xaffb8(핸들러 반환 x23 → cmp #0).
- **파일↔라이브 rw diff**가 암호문/평문 쌍을 통째로 준다 — XOR 분포로 변환 종류 즉별(단일키 XOR이면 키값 분포 집중).

## 11. Offline emulation of the native engine — §172 (Unicorn)
- **libea56 전체를 Unicorn으로 오프라인 실행 가능**: ①디스크 .so는 reloc 미적용 — R_AARCH64_RELATIVE(1027) 7,327건 직접 적용 필수(안 하면 디스패치 테이블 전부 0) ②섹션헤더 문자열표 변조 → 심볼은 PT_DYNAMIC(DT_SYMTAB/STRTAB)에서 ③GOT(type 257) 56종 = 스텁 주소 기입+코드훅 ④프로퍼티 세계/VFS를 파이썬으로 주입.
- **afed8(0, 0x5c000000, needle) = 바늘 1건 값조회기**: 세계 foreach 순회 → 이름 매치 → malloc+값복사 → 포인터 반환(NULL=미매치). **값 비교는 Java** — 탐지 체인: Java 바늘→네이티브 값조회→Java 값비교→킬플래그.
- **채널 소거의 정적 방법**: 세계(프로퍼티/VFS)를 주입하고 바늘×세계 매트릭스 → NULL이면 그 채널 무죗 확정. 카모33 프로퍼티 세계 41바늘 전부 NULL — 프로퍼티 채널 소거(§163 실측과 정적 일치).
- rw 레코드: [type=06][len][암호문], 헤더 평문 — 정적 디코더 검증 앵커.

## 12. libea56 레코드 복호 — 최종 확정 알고리즘 (§178, 완전 정적 해독)
- **레코드 형식**: `[06][len][ct]` — ct가 워드 그리드(base+2+idx*4), 레코드는 파일 안에서만 존재(런타임 재구성 없음).
- **라운드(디스어셈 0x938d0/0x90c30/0x441a4 SWAR 전검증)**:
  `S1 = ((v<<2)^(K1>>5)) + ((K1<<4)^(v>>3))`, `S2 = (v^x9) + (K1^K2)`,
  `v_new = ct - (S1 ^ S2)` — K1=**아직 암호문인 아래 워드** W(idx-1)(역방향 워크 자기참조),
  K2 = tbl[(idx&3)^x10], x10=(x9>>2)&3, 에필로그 idx=0은 K1=W(n-1) 체인 순환.
- **전 파라미터 상수**: v0=ct[0] · K2표={0xd80c2121,0,0,0}(코드 movz/movk — 런 간 불변, "표 진화"는 기각)
  · 시드 x9_0=0xa708a81e=**−14×0x61c88647** → **정확히 14패스** 후 x9=0(cbz 종료).
- **검증**: Python 14패스 = Unicorn once-함수 0x441a4 실행 = 라이브 덤프 바이트 100%(3중).
  도구: `tmp-artifacts/native-engine/decode_static2.py`, `emu_run_fn.py`(임의 함수 Unicorn 실행기).
- **포획 상태 해석법**: 트리프와이어로 잡은 복호기 문맥(x9/x10/x12/x11)은 **1패스 직후** 상태 —
  최종 평문과 비교하면 불일치가 정상. 캡처값 재현으로 알고리즘을 확증하는 용법이 정석(§178).
- **★JNI blob(0x184110..0x1856c0, 5.6KB)도 완전 해독 [§178-추가]**: JNI_OnLoad **대기-타임아웃
  이후 경로**가 복호기 — 기존 에뮬의 "done"은 카운트 소진이었고 해당 경로 미실행이었음(블라인드).
  모킹 보강(VM 이중포인터/GetEnv→JNICTX/스텁슬롯=CBRET포인터) + 대기 60회차 강제탈출로
  **파일만으로 5,552B 라이브 100% 재현**. 도구 `tmp-artifacts/native-engine/emu_jol_decrypt.py`.
  → 네이티브 데이터층(레코드+blob) 난독화 전면 완결.
- **법칙: emu_start 반환 원인 구분** — 정상복귀/타임아웃/카운트소진을 확인하고, 소진 시 트레이스
  꼬리로 미실행 경로 잔존 여부 확인("done"은 완주 증거 아님).
