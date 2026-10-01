# frida 동적 분석 상세

## 전제: 어떤 빌드에 프리다를 붙이는가

| 빌드 | 프리다 가능 여부 | 이유 |
|---|---|---|
| neutered 빌드 (debuggable 패치 + AppSuit 탐지 스레드 중화 + 재서명) | **가능** (§7 검증: 45초+ 계측, 인증 화면 도달) | 탐지 워커 스레드가 pthread_create→getpid 재지향으로 중화됨 |
| 원본 빌드 | 불가 | 에이전트가 프로세스 메모리에 상주 → mem_scanner가 스캔해 판정. 환경 위장(LKM)과 무관 |

원본 앱 동적 분석이 필요하면: frida 에이전트 문자열 커스텀 빌드(frida 소스에서
frida/gum 리터럴 리네임)가 다음 단계다.

## 러너 (scripts/frida_spawn.py)

```bash
~/.pyenv/versions/3.11.4/bin/python -u scripts/frida_spawn.py <script.js> [초=45] [resume_delay=0]
```

- `pyenv 3.11.4`에 frida 16.6.6이 설치되어 있다. 시스템 python3에는 없다.
- REMOTE = 127.0.0.1:27045, PACKAGE = net.ib.android.smcard 하드코딩 — 다른 앱이면
  PACKAGE 수정.
- frida-server는 디바이스에서 `/dev/.rs9 -l 127.0.0.1:47777` 로 실행 + 호스트에서
  `adb forward tcp:27045 tcp:47777`. (이름/포트 은닉 — §2.20 능동 프로브 대비)
- `resume_delay`를 주면 spawn~resume 사이에 호스트가 ftrace 필터를 걸 시간이 생긴다.

## spawn이 필수인 이유

AhnLab 가드 서브프로세스가 메인 프로세스를 ptrace한다(/proc/<pid>/status의
TracerPid가 가드 pid). 커널은 프로세스당 트레이서 1개라 살아있는 프로세스에
attach하면 `process not found`. spawn은 주입이 먼저고 가드는 그 뒤에 붙는다 —
에이전트는 이미 상주.

## 검증된 스크립트 패턴

```js
// Java 콜백은 러너(python)에서는 즉시 발화한다. CLI에서는 펌프 블록으로 무시됨.
Java.perform(function () {
    console.log("[+] vm=" + Java.androidVersion);
    console.log("[+] classes=" + Java.enumerateLoadedClassesSync().length);
});
setInterval(function () { console.log("[beat] " + Process.enumerateThreads().length); }, 10000);
```

- 타이머도 python 러너에서는 정상 발화한다.
- **활성 계측**(Java 열거·훅 많이 걸기)하면 neutered 빌드도 ~15초 내 SIGKILL이 올 수
  있다 — 그때만 §7의 syscall_kill_block.js(seccomp)를 얹는다. 원칙은 근거 제거.
- 원본 앱 환경에서 쓸 스크립트는 invisify_lite.js (Java-only + dl_iterate_phdr,
  libc 패치 0) — 파일 계층은 LKM이 담당.

## 유용한 커널 추적 레시피

kprobe 이벤트 등록/정리, kill 발화자 특정(`__arm64_sys_kill` + comm), openat 전수는
`references/pitfalls.md` 의 "사망 직전 시퀀스 캡처" 참조.
