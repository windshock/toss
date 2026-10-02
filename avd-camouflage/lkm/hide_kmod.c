// =============================================================================
// hide_kmod.c v4.1 — getname_flags/d_path kretprobe 경로 차단(deny) + 위장 리다이렉트
//
// v4.0 → v4.1 변경 (2026-09-21):
//   - d_path kretprobe 추가: HAL이 열어 binder로 넘긴 goldfish fd의
//     /proc/self/fd/N readlink 결과(readlink → proc_pid_readlink → d_path,
//     kretprobe 실측)를 표적 uid에 한해 클론 노드명으로 제자리 교체.
//     open 주체가 HAL이라 getname 훅 밖인 채널의 마지막 조각.
//
// v2 → v3 변경:
//   - REDIRECT: 자기 정보 파일(/proc/self/{maps,smaps,status,mounts}, /proc/net/
//     {unix,tcp}, /proc/cpuinfo, /proc/version, task/<tid>/comm)을 /dev/. 단문자
//     위장 파일로 커널쪽 경로 재작성. struct filename 버퍼는 원본 길이만 확보되므로
//     **더 짧은 경로로만** 제자리 재작성 (strlen(to) <= strlen(from) 보장).
//   - 타 프로세스 /proc/<pid>/{cmdline,status} → /dev/.e (빈 파일) — 데몬 스캔 무화.
//     (current->tgid == 대상 pid면 원본 통과 — 자기 자식 가드 보호용 차단 회피)
//   - deny 추가: qemu 프롭 컨텍스트 파일(/dev/__properties__/*qemu*), 커널 tracing
//     (/sys/kernel/{,debug/}tracing) — 2026-09-19 클린런 ftrace로 확인된 판정 채널.
//   - target_uids 배열 모듈파라미터 0644 (다중 uid, 런타임 변경 가능).
//     insmod target_uids=10179,10180 (재설치마다 uid 변동).
//
// 위장 파일 내용은 유저랜드(adb shell 루프)가 /proc/<pid>/maps 등을 읽어 필터링해
// 유지한다. 셸(uid 2000)은 본 모듈의 적용을 받지 않는다(uid 게이트).
//
// v2 설계 계승: getname_flags 단일 kretprobe. 모든 경로 syscall(open/access/stat/
// statx/readlink/exec, **raw svc 포함**)이 유저 경로를 커널 struct filename으로
// 복사하는 단일 지점. 유저 메모리 접근 0 → RO/COW/원자적 폴트 소거.
// /dev/goldfish* 는 앱 GL 전송로라 절대 건드리지 않는다.
// =============================================================================
#include <linux/module.h>
#include <linux/kprobes.h>
#include <linux/cred.h>
#include <linux/fs.h>       /* struct filename */
#include <linux/err.h>
#include <linux/string.h>
#include <linux/sched.h>    /* current->tgid */
#include <linux/user_namespace.h> /* init_user_ns (v4.15 reboot 로깅) */
#include <linux/atomic.h>   /* v4.10 fault_dump 카운터 */
#include <linux/uaccess.h>  /* strncpy_from_user */
#include <linux/mm.h>       /* v4.20: struct vm_area_struct (maps content-filter) */
#include <linux/mm_types.h>
#include <linux/dcache.h>   /* struct dentry, d_name */
#include <linux/file.h>     /* v4.21: fget/fput (ioctl fd 해석) */
#include <linux/perf_event.h>     /* v4.23: hw breakpoint (afed8 param 동적추적) */
#include <linux/hw_breakpoint.h>
#include <linux/sched.h>
#include <linux/pid.h>
#include <asm/sysreg.h>     /* v4.17: SYS_MIDR_EL1 (mrs 에뮬 위장) */

/* 다중 uid 지원 (v3.4) — insmod target_uids=10179,10180,10181 / 런타임 변경 가능.
 * 요소를 안 주면(n_target_uids==0) 전체 적용 — 주의해서 사용. */
static unsigned int target_uids[8] = { 10179, 0, 0, 0, 0, 0, 0, 0 };
static int dis_cpuinfo;   /* 1 = /proc/cpuinfo redirect 끔(진짜 cpuinfo 노출) — A/B 실험용 */
static int ksig_dis;      /* v4.8: 1 = kill(9)->0 위장 비활성(자식 자기정리 허용) — 20차 A/B */
module_param_named(dis_cpuinfo, dis_cpuinfo, int, 0644);
module_param_named(ksig_dis, ksig_dis, int, 0644);
static int n_target_uids;
module_param_array(target_uids, uint, &n_target_uids, 0644);

/* v4.19: log-only uid — getname 경로를 LOG만(리다이렉트 X). target_uids와 분리해
 * maps-fake로 ART를 깨지 않고 TG(libtg)의 emulator 채널을 관측한다.
 * 사용: insmod/echo log_uid=10178; target_uids=99999(리다이렉트 off). */
static unsigned int log_uid;
module_param_named(log_uid, log_uid, uint, 0644);
static ulong log_hits;
module_param(log_hits, ulong, 0444);
/* v4.19: 1 = /proc/self/maps·smaps redirect 스킵(정적 fake .q7zm4h는 [stack]이
 * 프로세스별이라 ART InitStackHwm를 깸). 다른 채널만 닫고 maps는 실값 유지. */
static int maps_off;
module_param_named(maps_off, maps_off, int, 0644);

static int uid_allowed(void)
{
	int i;
	unsigned int u = current_uid().val;

	if (n_target_uids == 0)
		return 1;
	for (i = 0; i < n_target_uids && i < 8; i++)
		if (target_uids[i] == u)
			return 1;
	return 0;
}

/* v4.20: /proc/self/maps 내용 필터 — emu lib/xhook VMA를 maps 생성 시 스킵.
 * 정적 fake(.q7zm4h)와 달리 실제 maps에서 해당 라인만 제거 → 실제 [stack]·[heap]·앱 lib 보존
 * (anon 영역은 vm_file==NULL이라 안 건드림) → ART InitStackHwm 안 깨지고 가드는 emu lib 못 봄. */
static int maps_filter = 1;
module_param_named(maps_filter, maps_filter, int, 0644);
static ulong mapfilt_hits;
module_param(mapfilt_hits, ulong, 0444);

static int is_emu_vma_name(const char *n)
{
	if (!n)
		return 0;
	return strstr(n, "_enc.so")   || strstr(n, "ranchu")      ||
	       strstr(n, "goldfish")  || strstr(n, "androidemu")  ||
	       strstr(n, "OpenglSystem") || strstr(n, "GfxPerf")  ||
	       strstr(n, "vulkan_enc") || strstr(n, "xhook")      ||
	       strstr(n, "emulation");
}

/* v4.21: emu GL 전송 lib(존재=에뮬 신호). ranchu HAL impl은 gralloc 필수라 제외,
 * 순수 전송 lib만: libandroidemu, *_enc.so, OpenglSystemCommon, GfxPerf. */
static int emu_lib_block;
module_param_named(emu_lib_block, emu_lib_block, int, 0644);
static ulong emulib_hits;
module_param(emulib_hits, ulong, 0444);
static int is_emu_gl_lib(const char *n)
{
	if (!n)
		return 0;
	return strstr(n, "libandroidemu") || strstr(n, "_enc.so") ||
	       strstr(n, "OpenglSystem")  || strstr(n, "GfxPerf");
}

/* kprobe: show_map_vma(struct seq_file *m, struct vm_area_struct *vma)
 * arg1(x1)=vma. target uid + emu-file vma면 함수 본문 스킵(pc=x30 복귀) → 그 라인 미출력. */
static int showmap_pre(struct kprobe *p, struct pt_regs *regs)
{
	struct vm_area_struct *vma;
	struct file *f;
	const char *name;

	if (!maps_filter || !uid_allowed())
		return 0;
	vma = (struct vm_area_struct *)regs->regs[1];
	if (!vma)
		return 0;
	f = vma->vm_file;
	if (!f || !f->f_path.dentry)
		return 0;
	name = f->f_path.dentry->d_name.name;
	if (is_emu_vma_name(name)) {
		mapfilt_hits++;
		instruction_pointer_set(regs, regs->regs[30]); /* pc = LR → 본문 스킵 */
		return 1;
	}
	return 0;
}
static struct kprobe kp_showmap = {
	.symbol_name = "show_map_vma",
	.pre_handler = showmap_pre,
};

/* v4.21: ioctl 트레이스 — HAL/GPU/goldfish device fingerprint 규명(early probe hunt).
 * __arm64_sys_ioctl: regs[0]=user pt_regs*, ur->regs[0]=fd, ur->regs[1]=cmd.
 * binder는 flood라 제외(필요시 ftrace binder_transaction). fget/fput은 caller가 ref 보유라 원자안전. */
static int ioctl_log;
module_param_named(ioctl_log, ioctl_log, int, 0644);
static ulong ioctl_hits;
module_param(ioctl_hits, ulong, 0444);

static int ioctl_pre(struct kprobe *p, struct pt_regs *regs)
{
	struct pt_regs *ur;
	unsigned int fd, cmd;
	struct file *f;
	const char *nm;

	if (!ioctl_log)
		return 0;
	if (!(uid_allowed() || (log_uid && current_uid().val == log_uid)))
		return 0;
	ur = (struct pt_regs *)regs->regs[0];
	if (IS_ERR_OR_NULL(ur))
		return 0;
	fd = (unsigned int)ur->regs[0];
	cmd = (unsigned int)ur->regs[1];
	f = fget(fd);
	if (!f)
		return 0;
	nm = f->f_path.dentry ? f->f_path.dentry->d_name.name : NULL;
	if (nm && !strstr(nm, "binder") &&
	    (strstr(nm, "kgsl") || strstr(nm, "goldfish") || strstr(nm, "qemu") ||
	     strstr(nm, "ion") || strstr(nm, "dri") || strstr(nm, "mali") ||
	     strstr(nm, "dma_heap") || strstr(nm, "hwrng") || strstr(nm, "input") ||
	     strstr(nm, "pipe") || strstr(nm, "fingerprint") || strstr(nm, "sensor") ||
	     strstr(nm, "nfc") || strstr(nm, "gralloc") || strstr(nm, "sw_sync") ||
	     strstr(nm, "sync") || strstr(nm, "tee") || strstr(nm, "keystore"))) {
		ioctl_hits++;
		pr_info("IOCTL comm=%s pid=%d dev=%s cmd=0x%x\n",
			current->comm, current->pid, nm, cmd);
	}
	fput(f);
	return 0;
}
static struct kprobe kp_ioctl = {
	.symbol_name = "__arm64_sys_ioctl",
	.pre_handler = ioctl_pre,
};

/* log_uid 전용: /proc·/sys·/dev open 전량 로그(fd 스윕 flood만 제외) — emulator
 * tell 규명(빠뜨린 채널 탐색). log_verbose=1이면 넓게, 0이면 curated. */
static int log_verbose;
module_param_named(log_verbose, log_verbose, int, 0644);
static void log_interesting(const char *name)
{
	int hit;
	if (log_verbose) {
		/* /proc /sys /dev 전부, 단 fd 스윕(task fd)은 제외(flood) */
		hit = (strncmp(name, "/proc", 5) == 0 || strncmp(name, "/sys", 4) == 0 ||
		       strncmp(name, "/dev", 4) == 0) &&
		      !(strstr(name, "/task/") && strstr(name, "/fd/")) &&
		      !strstr(name, "/fd/");
	} else {
		hit = strstr(name, "self/maps") || strstr(name, "cpuinfo") ||
		      strstr(name, "goldfish") || strstr(name, "qemu") ||
		      strstr(name, "ranchu") || strstr(name, "hypervisor") ||
		      strstr(name, "/proc/devices") || strstr(name, "/proc/cmdline");
	}
	if (hit) {
		log_hits++;
		pr_info("LOGUID comm=%s pid=%d: %s\n",
			current->comm, current->pid, name);
	}
}

static int str_ends(const char *p, const char *suf)
{
	size_t lp = strlen(p), ls = strlen(suf);
	return lp >= ls && strcmp(p + lp - ls, suf) == 0;
}

/* 그래픽/HAL 드라이버 .so — 에뮬에선 이름에 ranchu/goldfish/qemu가 들어가지만
 * (gralloc mapper@x-impl-ranchu.so, vulkan.ranchu.so, hwcomposer.ranchu.so,
 * libqemupipe.ranchu.so 등) 앱 자신이 dlopen해야 하는 필수 라이브러리다.
 * 이걸 차단하면 "gralloc-mapper is missing"/GL abort로 앱이 자해한다(2026-09-19
 * 실측 — v3.5 containment 강화가 넣은 회귀). 라이브러리 경로의 .so는 탐지 예외. */
static int is_driver_lib(const char *p)
{
	if (!str_ends(p, ".so"))
		return 0;
	return strncmp(p, "/vendor/lib", 11) == 0 ||
	       strncmp(p, "/system/lib", 11) == 0 ||
	       strncmp(p, "/system_ext/lib", 15) == 0 ||
	       strncmp(p, "/apex/", 6) == 0;
}

/* ── deny: 커널쪽 경로 문자열 판정 → "/Z" 재작성(ENOENT) ─────────────────── */
static int path_blocked(const char *p)
{
	if (p[0] != '/')
		return 0;

	/* root/magisk/superuser 계열 — 위치 무관 부분일치 */
	if (strstr(p, "magisk")   || strstr(p, "supolicy")  ||
	    strstr(p, "sugote")    || strstr(p, "supersu")   ||
	    strstr(p, "SuperUser") || strstr(p, "proca")     ||
	    strstr(p, "tegrak")    || strstr(p, "gcall_jni") ||
	    strstr(p, "jkh.kr")    || strstr(p, "APPSUIT_ROOTING_TEST"))
		return 1;

	/* su 바이너리 */
	if (str_ends(p, "/su") || str_ends(p, "/su1"))
		return 1;

	/* 에뮬레이터 파일 텔테일 (goldfish* 제외 — GL 전송로) */
	if (strncmp(p, "/dev/qemu_pipe", 14) == 0)
		return 1;
	if (strstr(p, "/mumu") || strstr(p, "/nox"))
		return 1;

	/* qemu 프롭 컨텍스트 파일 — 프롭 "값"이 아니라 파일명 자체가 시그니처 */
	if (strncmp(p, "/dev/__properties__/", 20) == 0 && strstr(p, "qemu"))
		return 1;

	/* 커널 tracing — 엔진이 직접 열어 안티디버깅 판정 (2026-09-19 실측) */
	if (strncmp(p, "/sys/kernel/tracing", 19) == 0 ||
	    strncmp(p, "/sys/kernel/debug/tracing", 25) == 0)
		return 1;

	/* v4.22: 가상화 커널모듈/디바이스 텔테일 직접 probe 차단(/sys·/proc만 — 앱경로 오탐방지).
	 * 실기기엔 없는 virtio/kvm/vsock/failover/intel 모듈을 개별 open해 존재확인 → ENOENT 위장. */
#if 0 /* bisectA off: v4.22 모듈 프로브 차단 */
	if ((strncmp(p, "/sys/", 5) == 0 || strncmp(p, "/proc/", 6) == 0) &&
	    (strstr(p, "virtio") || strstr(p, "/kvm") || strstr(p, "vsock") ||
	     strstr(p, "failover") || strstr(p, "nd_virtio") ||
	     strstr(p, "btintel") || strstr(p, "intel_powerclamp")))
		return 1;
#endif

	/* v4.24: /proc/net/unix — 유닉스 소켓 목록(§148 채널20: jdwp-control 등 에뮬 소켓 노출).
	 * 실기기 untrusted_app은 SELinux로 차단되는 게 정상(에뮬은 permissive로 읽힘) → ENOENT 위장이 정합. */
#if 0 /* bisectA off: v4.24 net/unix 차단 */
	if (strncmp(p, "/proc/", 6) == 0 && strstr(p, "net/unix"))
		return 1;
#endif

	/* v4.4: 에뮬 전용 vendor overlay apk (가드 dex 어휘 실측 2026-09-21.
	 * goldfish_overlay*는 goldfish 패턴에 이미 걸리고, Emulator*는 무커버였음) */
	if (strstr(p, "EmulatorTalkBackOverlay") || strstr(p, "emulation"))
		return 1;

	/* 루트 rc 파일 — /init.goldfish.rc, /ueventd.ranchu.rc 등 (AVC 실측:
	 * 엔진이 루트 열거/직접 open으로 탐지). /dev/goldfish* 는 GL 전송로라 예외 */
	if ((strstr(p, "goldfish") || strstr(p, "ranchu")) &&
	    strncmp(p, "/dev/goldfish", 13) != 0 &&
	    !is_driver_lib(p))
		return 1;

	/* S140: hw/의 ranchu/goldfish/qemu HAL .so 존재 프로브 차단. bind 중립화
	 * (qti/qcom)로 앱 로드 체인은 adreno/qti/중립명뿐(§134 maps 실측) — 이 이름들은
	 * 앱에 불필요. SF/HAL(uid 1000대)은 필터 밖이라 실서비스 무영향. */
#if 0 /* bisectA off: v4.22 hw HAL 프로브 차단 */
	if (strncmp(p, "/vendor/lib64/hw/", 17) == 0 &&
	    (strstr(p, "ranchu") || strstr(p, "goldfish") || strstr(p, "qemu")))
		return 1;
#endif

	return 0;
}

/* ── redirect 헬퍼 ───────────────────────────────────────────────────────── */
/* "/proc/self/<suffix>" 또는 "/proc/<tgid>/<suffix>" 매치 */
static int proc_self_file(const char *p, const char *suffix)
{
	size_t ls = strlen(suffix);

	if (strncmp(p, "/proc/self/", 11) == 0)
		p += 11;
	else if (strncmp(p, "/proc/", 6) == 0) {
		const char *q = p + 6;
		unsigned int v = 0;
		int n = 0;

		while (*q >= '0' && *q <= '9') {
			v = v * 10 + (*q - '0');
			q++;
			n++;
		}
		if (n == 0 || *q != '/' || v != current->tgid)
			return 0;
		p = q + 1;
	} else {
		return 0;
	}
	return strncmp(p, suffix, ls) == 0 && p[ls] == '\0';
}

/* "/proc/{self,<tgid>}/task/<tid>/comm" — frida 스레드명(gum-js-loop 등) 은닉용 */
static int is_self_task_comm(const char *p)
{
	const char *q;

	if (strncmp(p, "/proc/self/task/", 16) == 0) {
		q = p + 16;
	} else if (strncmp(p, "/proc/", 6) == 0) {
		unsigned int v = 0;
		int n = 0;

		q = p + 6;
		while (*q >= '0' && *q <= '9') {
			v = v * 10 + (*q - '0');
			q++;
			n++;
		}
		if (n == 0 || *q != '/' || v != current->tgid)
			return 0;
		if (strncmp(q, "/task/", 6) != 0)
			return 0;
		q += 6;
	} else {
		return 0;
	}
	while (*q >= '0' && *q <= '9')
		q++;
	return strcmp(q, "/comm") == 0;
}

/* v4.0: is_other_proc_file 제거 — 타 프로세스 cmdline/status 빈파일 위장이
 * tamper 신호가 됨(토스 /proc/N/cmdline 전수 스윕 실측). 실제값 노출로 전환. */

/* 제자리 재작성 — 원본보다 짧은 경로만 안전 (버퍼가 원본 길이만 확보됨) */
static void redirect(char *name, const char *to)
{
	if (strlen(to) <= strlen(name))
		strcpy(name, to);
}

/* /sys/devices/system/cpu/cpuN/... 의 N을 0으로, cpufreq/stats/cpuN도 0으로
 * 정규화 — 모든 per-cpu 파일이 존재하는 8코어처럼 보이게 한다(길이 불변). */
__maybe_unused static void normalize_cpu_path(char *name)
{
	static const char pre[] = "/sys/devices/system/cpu/";
	char *q;

	if (strncmp(name, pre, sizeof(pre) - 1) != 0)
		return;

	q = name + sizeof(pre) - 1;
	if (strncmp(q, "cpu", 3) == 0 && q[3] >= '0' && q[3] <= '9') {
		q[3] = '0';   /* cpuN/... → cpu0/... */
		return;
	}
	/* /sys/devices/system/cpu/cpufreq/stats/cpuN/... */
	if (strncmp(q, "cpufreq/stats/cpu", 17) == 0) {
		char *r = q + 17;
		if (r[0] >= '0' && r[0] <= '9')
			r[0] = '0';
	}
}

/* ── kretprobe ───────────────────────────────────────────────────────────── */
/* ── v4.4: uname(2) 위장 — GKI 커널 문자열을 삼성 실기기 형식으로. getname 훅 밖
 * 채널(토스 런타임 uname 403~463회 실측). sys_newuname의 유저 버퍼에 이미 복사된
 * new_utsname을 ret 핸들러에서 제자리 수정(페이지가 살아있어 fault 없음).
 * /proc/version은 camow3가 동일 문자열을 서비스해 정합. */
#define UTS_RELEASE_SPOOF "5.15.94-android13-8-30358670-abS916NKSU1AWC2"
#define UTS_VERSION_SPOOF "#1 SMP PREEMPT Thu Jun 8 18:11:35 KST 2023"
struct uname_data { void __user *ubuf; };

/* ── v4.6: 자가 kill(9) 무력화 — 타깃 uid의 Java 스레드가 kill(getpid(), SIGKILL)로
 * 자폭(15차 실측: Thread-44 → tgkill/kill sig=9). syscall 래퍼 진입(kprobe)에서
 * 저장 pt_regs의 sig 슬롯(regs[1])을 9→0으로 바꾸면 래퍼가 kill(pid, 0)으로
 * 실행(권한 검사만, 시그널 미전달)하고 성공을 반환한다. 타깃 uid 한정. */
static int kill_pre(struct kprobe *p, struct pt_regs *regs)
{
	struct pt_regs *ur;

	/* v4.8: 19-20차 실측 — 이 위장이 가드 fork 자식의 kill(self,9) 자기정리까지
	 * 막아 고아를 양산하고, 부모가 멈춘 자식을 보고 이탈 판정(exit(0))을 하는
	 * 것으로 추정. 17-18차 생존 런은 이 코드 배포 이전 빌드였을 가능성.
	 * ksig_dis=1 로 인슴로드하면 위장을 끄고 원래 kill 동작을 살린다. */
	if (ksig_dis)
		return 0;
	if (!uid_allowed())
		return 0;
	/* v4.14: 차단되는 모든 SIGKILL 발신자 기록(누가 누구를 죽이는가 — 21차) */
	{
		struct pt_regs *ul = (struct pt_regs *)regs->regs[0];
		if (!IS_ERR_OR_NULL(ul) && ul->regs[1] == 9)
			pr_info("kill9 intercepted: comm=%s pid=%d target=%lu\n",
				current->comm, current->pid, ul->regs[0]);
	}
	/* v4.9(20차): group leader comm이 "Thread-*"인 호출자 = fork된 헬퍼/크래시
	 * 컬렉터 프로세스 — 이들의 kill(self,9)은 정상 자기정리라 원래 동작을 허용한다.
	 * 메인 프로세스(leader comm=".republica.toss")와 그 스레드만 위장 대상. */
	{
		struct task_struct *gl = current->group_leader;
		if (gl && strncmp(gl->comm, "Thread-", 7) == 0)
			return 0;
	}
	ur = (struct pt_regs *)regs->regs[0];
	if (ur->regs[1] == 9)
		ur->regs[1] = 0;
	return 0;
}

static struct kprobe kp_ksig = {
	.symbol_name	= "__arm64_sys_kill",
	.pre_handler	= kill_pre,
};

/* ── S154 [O]-1c: process_vm_readv 차단 A/B — 가드의 ART 메타데이터/자바힙
 * 자기검사(T+2-3s, rlen=4 포인터체인 + .text 316페이지 무결성)가 판정 입력인지 시험.
 * 방법: 타깃 uid의 pvm syscall 진입에서 유저 pt_regs의 local iov(regs[1])를 0으로
 * 설정 → -EFAULT (kill 위장과 동일 패턴). pvm_block=1일 때만 동작(기본 OFF). */
static int pvm_block = 0;
module_param_named(pvm_block, pvm_block, int, 0644);
static int pvm_log = 0;
module_param_named(pvm_log, pvm_log, int, 0644);
static ulong pvm_stack_hits;
module_param(pvm_stack_hits, ulong, 0444);
static ulong pvm_hits;
module_param(pvm_hits, ulong, 0444);

static int pvm_pre(struct kprobe *p, struct pt_regs *regs)
{
	struct pt_regs *ul;

	ul = (struct pt_regs *)regs->regs[0];
	/* S154: 호출자 관측 — 유저 컨텍스트의 pc(svc 사이트)와 x30(복귀주소=호출자) */
	if (pvm_log && pvm_hits < 40)
		pr_info("pvmcall: pid=%lu lr=%px pc=%px remote_iov=%px riovcnt=%lu\n",
			ul->regs[0], ul->regs[30], ul->pc, ul->regs[3], ul->regs[4]);
	/* S154+: 유저 스택 샘플 — SafeCopy 프레임의 저장 x30 = 호출자(가드) 복귀주소.
	 * svc 진입 시 pt_regs->sp = libc wrapper 진입 시점 sp. bionic wrapper는
	 * 프레임 없이 svc하므로 [sp+8] = SafeCopy가 저장한 x30. 프레임 체인 4워드 샘플. */
	if (pvm_log && pvm_stack_hits < 40) {
		unsigned long w0 = 0, w1 = 0, w2 = 0, w3 = 0;
		unsigned long __user *sp = (unsigned long __user *)ul->sp;
		if (!get_user(w0, sp) && !get_user(w1, sp + 1) &&
		    !get_user(w2, sp + 2) && !get_user(w3, sp + 3)) {
			pvm_stack_hits++;
			pr_info("pvmstack: sp=%px w=[%px %px %px %px]\n",
				ul->sp, w0, w1, w2, w3);
		}
	}
	if (!pvm_block)
		return 0;
	if (!uid_allowed())
		return 0;
	pvm_hits++;
	ul->regs[1] = 0;   /* local_iov = NULL → EFAULT */
	return 0;
}

static struct kprobe kp_pvm = {
	.symbol_name	= "__arm64_sys_process_vm_readv",
	.pre_handler	= pvm_pre,
};

/* ── S154+: art::SafeCopy 진입 관측기 — 가드가 읽는 메모리의 전체 지도.
 * SafeCopy(dst, src, len)는 ART 공식 fault-safe 리더(dynsym export)이며 가드가
 * 런타임 구조/힙 검사에 사용(§154 추기). 진입 인자+복귀주소+호출자 comm 기록.
 * sc_log=1 활성(기본 OFF), sc_max건 후 자동 중단. 전역 kprobe라 타 프로세스 것도
 * 기록됨 — comm 필드로 분류. */
static int sc_log = 0;
module_param_named(sc_log, sc_log, int, 0644);
static int sc_max = 2048;
module_param_named(sc_max, sc_max, int, 0644);
static ulong sc_hits;
module_param(sc_hits, ulong, 0444);

static int sc_pre(struct kprobe *p, struct pt_regs *regs)
{
	struct pt_regs *ul;

	if (!sc_log || sc_hits >= (ulong)sc_max)
		return 0;
	sc_hits++;
	ul = (struct pt_regs *)regs->regs[0];
	pr_info("safecopy: comm=%s pid=%d dst=%px src=%px len=%lu lr=%px\n",
		current->comm, current->pid,
		ul->regs[0], ul->regs[1], ul->regs[2], ul->regs[30]);
	return 0;
}

static struct kprobe kp_sc = {
	.symbol_name	= "_ZN3art8SafeCopyEPvPKvm",
	.pre_handler	= sc_pre,
};

/* ── S155+ 장생(immortal) 모드 — exit_group/tgkill(SIGABRT) 관문 차단.
 * 사망 경로(§154): 메인 T+11s exit_group(0). 차단 시 가드 폴백 = abort()→tgkill(6)(§155 실측).
 * el0_svc_common(regs, scno, ...)는 scno를 인자2로 받는다 — 디스패치에 쓰이는
 * kregs->regs[1]을 재작성(getpid로). 스레드 exit(93) 허용(자식 정리), 94만 차단. */
static int exit_block = 0;
module_param_named(exit_block, exit_block, int, 0644);
static ulong exit_block_hits;
module_param(exit_block_hits, ulong, 0444);

static int svc_pre(struct kprobe *p, struct pt_regs *kregs)
{
	int scno = (int)kregs->regs[1];
	struct pt_regs *ur;

	if (!exit_block || !uid_allowed())
		return 0;
	if (scno == 94) {   /* __NR_exit_group → kill(self, SIGSTOP) 확정 동결 */
		/* v1 getpid: bionic _exit 재시도 루프(1.44M, CPU 폭탄+ANR). v3 sigsuspend/
		 * v4 nanosleep: 보류 시그널 EINTR로 즉시 깨어남(1.25M/1.39M). v5는 인자를
		 * 커널이 통제: kill(tgid, SIGSTOP) — 프로세스 전체 동결, 시그널로 안 깨어남,
		 * SIGKILL(force-stop)만 관통. 앱은 살아있고 CPU 0. */
		ur = (struct pt_regs *)kregs->regs[0];
		ur->regs[0] = (unsigned long)current->tgid;
		ur->regs[1] = 19;           /* SIGSTOP */
		kregs->regs[1] = 129;       /* __NR_kill */
		exit_block_hits++;
		if (exit_block_hits < 20)
			pr_info("EXITSTOP #%lu comm=%s pid=%d\n",
				exit_block_hits, current->comm, current->pid);
	}
	return 0;
}

static struct kprobe kp_svc = {
	.symbol_name	= "el0_svc_common",
	.pre_handler	= svc_pre,
};

/* 관문2: tgkill(tgid,tid,sig) x2=sig — 가드의 abort 폴백 중립화(Thread- 자기정리 예외) */
static int tgk_pre(struct kprobe *p, struct pt_regs *regs)
{
	struct pt_regs *ur;

	if (!exit_block || !uid_allowed())
		return 0;
	{
		struct task_struct *gl = current->group_leader;
		if (gl && strncmp(gl->comm, "Thread-", 7) == 0)
			return 0;
	}
	ur = (struct pt_regs *)regs->regs[0];
	if (ur->regs[2] == 6) {
		ur->regs[2] = 0;
		if (exit_block_hits < 40)
			pr_info("TGKABRT comm=%s pid=%d\n", current->comm, current->pid);
	}
	return 0;
}

static struct kprobe kp_tgk = {
	.symbol_name	= "__arm64_sys_tgkill",
	.pre_handler	= tgk_pre,
};

/* ── v4.10: 21차 fault 컨텍스트 덤퍼 ─────────────────────────────────
 * 대상 uid의 EL0 데이터어보트(EC=0x24) 중 far=0(널 읽기/쓰기)인 것의
 * 유저 pt_regs 전체(x0~x30, sp, pc, pstate)를 dmesg로 덤프한다.
 * 목적: "크래프트된 컨텍스트 복원" 가설 검증 — x0(ArtMethod*)·x17 값으로
 * 컨텍스트 복원 vs 오프바이-4 엔트리포인트 즉별(외부검토 3차 권고).
 * 상한 8회 덤프 후 자동 중단(스팸 방지). 끄려면 fault_dump_en=0. */
static int fault_dump_en = 1;
module_param_named(fault_dump_en, fault_dump_en, int, 0644);
static atomic_t fault_dump_cnt = ATOMIC_INIT(0);

static int fault_pre(struct kprobe *p, struct pt_regs *kregs)
{
	struct pt_regs *u;
	unsigned long far, esr, ec;
	int i;

	if (!fault_dump_en || atomic_read(&fault_dump_cnt) >= 8)
		return 0;
	if (!uid_allowed())
		return 0;
	/* do_mem_abort(unsigned long addr, unsigned int esr, struct pt_regs *regs)
	 * — kprobe pre_handler의 kregs는 함수 진입 레지스터 그대로 */
	far = kregs->regs[0];
	esr = kregs->regs[1];
	u   = (struct pt_regs *)kregs->regs[2];
	if (IS_ERR_OR_NULL(u))
		return 0;
	ec = (esr >> 26) & 0x3f;
	if (ec != 0x24)   /* EL0 데이터어보트 */
		return 0;
	/* S154+5: far!=0(보호페이지 프로브)도 덤프 — 가드 ctx(x19) 런타임 주소 확보용 */
	if (far != 0) {
		static atomic_t nz_cnt = ATOMIC_INIT(0);
		if (atomic_read(&nz_cnt) >= 8)
			return 0;
		if (atomic_inc_return(&nz_cnt) > 8)
			return 0;
		pr_info("faultdumpNZ #%d comm=%s pid=%d — EL0 DA far=0x%lx esr=0x%lx\n",
			atomic_read(&nz_cnt), current->comm, current->pid, far, esr);
		for (i = 0; i < 31; i += 3) {
			pr_info("  x%-2d=0x%016lx x%-2d=0x%016lx x%-2d=0x%016lx\n",
				i,     u->regs[i],
				i + 1 < 31 ? i + 1 : 30, u->regs[min(i + 1, 30)],
				i + 2 < 31 ? i + 2 : 30, u->regs[min(i + 2, 30)]);
		}
		pr_info("  sp=0x%016lx pc=0x%016lx pstate=0x%08lx\n", u->sp, u->pc, u->pstate);
		return 0;
	}
	if (atomic_inc_return(&fault_dump_cnt) > 8)
		return 0;
	pr_info("faultdump #%d comm=%s pid=%d —— EL0 DA far=0 esr=0x%lx\n",
		atomic_read(&fault_dump_cnt), current->comm, current->pid, esr);
	for (i = 0; i < 31; i += 3) {
		pr_info("  x%-2d=0x%016lx x%-2d=0x%016lx x%-2d=0x%016lx\n",
			i,     u->regs[i],
			i + 1 < 31 ? i + 1 : 30, u->regs[min(i + 1, 30)],
			i + 2 < 31 ? i + 2 : 30, u->regs[min(i + 2, 30)]);
	}
	pr_info("  sp=0x%016lx pc=0x%016lx pstate=0x%08lx orig_x0=0x%016lx\n",
		u->sp, u->pc, u->pstate, u->orig_x0);
	/* v4.16: caller LR 즉시 캡처 — Art quick 프롤로그 stp x23,x30,[sp,#0x20]가
	 * [sp+0x28]에 저장한 진짜 호출자 복귀주소. 유저랜드 폴링은 컬렉션이 스택을
	 * 덮쓴 뒤라 늦는다(24차 실측). copy_from_user_nofault는 exception-table로
	 * 안전 실패를 보장 — 21차 rsig BRK-oops(일반 copy_from_user)와 다른 안전 API.
	 * 추가로 sp+0x30(그 위 프레임 잔재)도 같이 캡처해 프레임 체인 확인. */
	{
		unsigned long retlr = 0, up30 = 0;
		long r1 = copy_from_user_nofault(&retlr,
				(void __user *)(u->sp + 0x28), sizeof(retlr));
		long r2 = copy_from_user_nofault(&up30,
				(void __user *)(u->sp + 0x30), sizeof(up30));
		pr_info("  caller_lr=[sp+0x28]=0x%016lx(%s) [sp+0x30]=0x%016lx(%s)\n",
			retlr, r1 ? "read-fail" : "ok", up30, r2 ? "read-fail" : "ok");
	}
	return 0;
}

static struct kprobe kp_fault = {
	.symbol_name	= "do_mem_abort",
	.pre_handler	= fault_pre,
};

/* ── v4.11: rt_sigreturn 시그프레임 덤프 ─────────────────────────────
 * 21차 가설(크래프트된 컨텍스트 복원) 검증: 대상 uid가 rt_sigreturn으로
 * 복귀할 때 복원될 sigframe(mcontext: fault_address, x16, sp, pc)을 덤프해
 * pc/lr/x16이 합성값(entry±4, 0)인 프레임을 포착한다. 상한 200회. */
static int rsig_dump_en;   /* v4.12: 기본 OFF — copy_from_user in kprobe는 게스트 패닉 위험 */
module_param_named(rsig_dump_en, rsig_dump_en, int, 0644);
static atomic_t rsig_cnt = ATOMIC_INIT(0);

static int rsig_pre(struct kprobe *p, struct pt_regs *kregs)
{
	struct pt_regs *u;
	unsigned long sp;
	u8 buf[0x170];
	unsigned long fa, x16, newsp, newpc;

	if (!rsig_dump_en || atomic_read(&rsig_cnt) >= 200)
		return 0;
	if (!uid_allowed())
		return 0;
	u = (struct pt_regs *)kregs->regs[0];   /* __arm64_sys_* 래퍼 */
	if (IS_ERR_OR_NULL(u))
		return 0;
	sp = u->sp;                              /* rt_sigreturn: sp = sigframe */
	if (!sp)
		return 0;
	/* kprobe 핸들러는 원자적 문맥 — pagefault_disable 없이 copy_from_user 하면
	 * 유저 페이지 폴트 처리 중 kprobe 재진입/수면으로 패닉(panic_on_oops=1) 가능 */
	pagefault_disable();
	if (copy_from_user(buf, (void __user *)sp, sizeof(buf))) {
		pagefault_enable();
		return 0;
	}
	pagefault_enable();
	/* arm64 rt_sigframe: siginfo(0x00,128B) | ucontext.uc_mcontext @ 0x80
	 *   fault_address@0x80, regs[i]@0x88+8i, sp(regs[31])@0x180, pc@0x188 */
	memcpy(&fa,     buf + 0x80,           8);   /* mcontext.fault_address */
	memcpy(&x16,    buf + 0x88 + 16 * 8,  8);   /* mcontext.regs[16]      */
	memcpy(&newsp,  buf + 0x88 + 31 * 8,  8);   /* mcontext.sp            */
	memcpy(&newpc,  buf + 0x88 + 32 * 8,  8);   /* mcontext.pc            */
	if (atomic_inc_return(&rsig_cnt) > 200)
		return 0;
	pr_info("rsigdump #%d comm=%s pid=%d frame=0x%lx -> fa=0x%lx x16=0x%lx newsp=0x%lx newpc=0x%lx\n",
		atomic_read(&rsig_cnt), current->comm, current->pid, sp, fa, x16, newsp, newpc);
	return 0;
}

static struct kprobe kp_rsig = {
	.symbol_name	= "__arm64_sys_rt_sigreturn",
	.pre_handler	= rsig_pre,
};

/* ── v4.13: 게스트 reboot 차단 + 발신자 특정 ─────────────────────────
 * 21차 관측: 토스 가드가 판정 후 System.exit(0)와 동시에 userspace reboot을
 * 발행해 게스트가 통째로 재부팅된다(부트사유 "reboot", panic 아님).
 * 대상 uid의 reboot syscall을 -EPERM으로 막고 발신자를 dmesg에 기록한다.
 * (연구 목적상 게스트 생존이 우선. 차단은 target uid 한정.) */
/* v4.13: reboot_pre — v4.15: 로깅(uid 무관, reboot_log_all)과 차단(target uid) 분리.
 * 21차: 발행 주체가 target uid 밖(system_server 등)일 가능성이 남아 있어
 * 비-대상 발행도 ISSUED 로그로 남긴다(차단하지 않음). */
static int reboot_block = 1;
module_param_named(reboot_block, reboot_block, int, 0644);
static int reboot_log_all = 1;
module_param_named(reboot_log_all, reboot_log_all, int, 0644);

static int reboot_pre(struct kprobe *p, struct pt_regs *kregs)
{
	struct pt_regs *u;

	if (!reboot_block && !reboot_log_all)
		return 0;
	u = (struct pt_regs *)kregs->regs[0];
	if (IS_ERR_OR_NULL(u))
		return 0;
	if (uid_allowed()) {
		pr_info("reboot BLOCKED: comm=%s pid=%d arg0=0x%lx arg1=0x%lx caller=%pS\n",
			current->comm, current->pid,
			u->regs[0], u->regs[1], (void *)u->pc);
		if (reboot_block)
			u->regs[0] = (unsigned long)-13; /* -EPERM */
	} else if (reboot_log_all) {
		pr_info("reboot ISSUED(non-target): comm=%s pid=%d uid=%u arg0=0x%lx arg1=0x%lx caller=%pS\n",
			current->comm, current->pid,
			from_kuid_munged(&init_user_ns, current_uid()),
			u->regs[0], u->regs[1], (void *)u->pc);
	}
	return 0;
}

static struct kprobe kp_reboot = {
	.symbol_name	= "__arm64_sys_reboot",
	.pre_handler	= reboot_pre,
};

/* ── v4.15: do_sigaction kprobe — SIGSEGV 핸들러 주소 커널 캡처 ────────
 * 21차 24-K: 가드는 rt_sigaction을 raw syscall로 처리(libc/Java 심볼 훅 회피)
 * → 유저랜드에서 핸들러 등록이 관찰되지 않는다.
 * sys_rt_sigaction은 act를 copy_from_user해 커널스택 k_sigaction으로 만든 뒤
 * do_sigaction(sig, act, oact)을 호출 — 이 지점의 sa_handler는 커널 메모리에
 * 있으므로 핸들러에서 유저 포인터 접근이 전혀 없다(BRK oops 위험 0,
 * 24-I-2의 rsig_pre 사고와 정반대 설계).
 * arm64 struct sigaction: sa_handler@0 — raw read로 헤더 의존 제거. */
static int sigact_log = 1;
module_param_named(sigact_log, sigact_log, int, 0644);

static int sigact_pre(struct kprobe *p, struct pt_regs *kregs)
{
	long sig = (long)kregs->regs[0];
	unsigned long *act = (unsigned long *)kregs->regs[1];

	if (!sigact_log || sig != 11 || !act)
		return 0;
	/* v4.15a: toybox/셸 도구가 sigaction(SIGSEGV)을 도배(camow3 writer 루프에서
	 * 초당 ~9건)해 dmesg를 밀어냄 — target uid로 게이트. uid 밖 등록 관찰이
	 * 필요해지면 파라미터 확장. */
	if (!uid_allowed())
		return 0;
	pr_info("SIGACT11: handler=0x%lx comm=%s pid=%d tgid=%d uid=%u caller=%pS\n",
		*act, current->comm, current->pid, current->tgid,
		from_kuid_munged(&init_user_ns, current_uid()),
		(void *)kregs->regs[30]);
	return 0;
}

static struct kprobe kp_sigact = {
	.symbol_name	= "do_sigaction",
	.pre_handler	= sigact_pre,
};

/* ── v4.15b: 시그프레임 양방향 캡처 (유저 메모리 접근 0 — rsig 사고의 안전 재구현)
 * 21차 24-E: fault 6ms 전에 rt_sigreturn(139) 관측 — "복원된 pc가 곧 fault pc"면
 * 크래프트 프레임 복귀 확정. 구 kp_rsig(유저 ptr 직접 읽기, BRK oops 13:19 실측)와
 * 달리 ACK 5.15의 restore_sigframe이 __get_user_error로 pt_regs에 복사를 **마친 뒤**
 * 호출되는 parse_user_sigframe을 kprobe — task_pt_regs()를 읽기만 한다.
 *
 * (1) kp_sigframe_in: setup_rt_frame 진입 — 시그널 "전달" 시점.
 *     인자 (usig, ksig, set, regs) 전부 커널 포인터. ksig+0x10=si_addr,
 *     ksig+0x80=ka.sa.sa_handler(수거 핸들러 주소 — B-1 목표의 커널 캡처),
 *     regs(=kregs->regs[3])는 아직 fault 순간의 원본 레지스터.
 * (2) kp_sigframe_out: parse_user_sigframe 진입 — rt_sigreturn "복원" 직후.
 *     task_pt_regs()에 복원된 pc/lr/x16/sp가 커널 메모리로 들어와 있다. */
static int sigframe_log = 1;
module_param_named(sigframe_log, sigframe_log, int, 0644);

static int sfi_pre(struct kprobe *p, struct pt_regs *kregs)
{
	unsigned long usig = kregs->regs[0];
	unsigned long ksig = kregs->regs[1];
	struct pt_regs *ur = (struct pt_regs *)kregs->regs[3];

	if (!sigframe_log || usig != 11 || !uid_allowed())
		return 0;
	/* v4.15c: struct ksignal { struct k_sigaction ka; kernel_siginfo_t info; int sig; }
	 * — ka가 offset 0(22차 실측에서 info@0으로 잘못 계산해 쓰레기값 로깐던 것 정정).
	 * sa_handler @ ka+0, si_addr @ info+0x10 = ksig+0x30. */
	pr_info("SFI11: handler=0x%lx si_addr=0x%lx comm=%s pid=%d\n"
		"  fault-ctx pc=0x%llx x16=0x%llx sp=0x%llx lr=0x%llx x0=0x%llx\n",
		*(unsigned long *)ksig,
		*(unsigned long *)(ksig + 0x30),
		current->comm, current->pid,
		ur->pc, ur->regs[16], ur->sp, ur->regs[30], ur->regs[0]);
	/* S154+5: si_code(raise된 시그널 vs 실제 fault 구별) + callee-saved(x19~x23) 추가 —
	 * 가드 ctx(x19) 런타임 주소 확보. kernel_siginfo: si_signo/errno/code(+0,+4,+8), si_addr(+0x30). */
	pr_info("  si_code=%d x19=0x%llx x20=0x%llx x21=0x%llx x22=0x%llx x23=0x%llx pstate=0x%llx\n",
		*(int *)(ksig + 8),
		ur->regs[19], ur->regs[20], ur->regs[21], ur->regs[22], ur->regs[23], ur->pstate);
	return 0;
}

static struct kprobe kp_sfi = {
	.symbol_name	= "setup_rt_frame",
	.pre_handler	= sfi_pre,
};

static int sfo_pre(struct kprobe *p, struct pt_regs *kregs)
{
	struct pt_regs *ur = task_pt_regs(current);

	if (!sigframe_log || !uid_allowed())
		return 0;
	pr_info("SFO: rt_sigreturn restored comm=%s pid=%d\n"
		"  restored pc=0x%llx x16=0x%llx sp=0x%llx lr=0x%llx x0=0x%llx\n",
		current->comm, current->pid,
		ur->pc, ur->regs[16], ur->sp, ur->regs[30], ur->regs[0]);
	return 0;
}

static struct kprobe kp_sfo = {
	.symbol_name	= "parse_user_sigframe",
	.pre_handler	= sfo_pre,
};

static int uname_entry(struct kretprobe_instance *ri, struct pt_regs *regs)
{
	struct uname_data *ud = (struct uname_data *)ri->data;

	if (!uid_allowed())
		return 1;
	/* __arm64_sys_* 랩퍼의 x0 = struct pt_regs* (원본 레지스터 저장소) —
	 * 실제 syscall 인자(new_utsname 유저 버퍼)는 inner pt_regs의 regs[0].
	 * (getdents64 버퍼 버그와 동일 패턴 — pitfalls 참조) */
	ud->ubuf = (void __user *)((struct pt_regs *)regs->regs[0])->regs[0];
	return 0;
}

static int uname_ret(struct kretprobe_instance *ri, struct pt_regs *regs)
{
	struct uname_data *ud = (struct uname_data *)ri->data;
	char buf[390]; /* new_utsname: 6 필드 × 65 */

	if (IS_ERR_OR_NULL(ud->ubuf))
		return 0;
	/* v4.12: kretprobe 핸들러 원자적 문맥 — pagefault 보호 필수 */
	pagefault_disable();
	if (copy_from_user(buf, ud->ubuf, sizeof(buf))) {
		pagefault_enable();
		return 0;
	}
	pagefault_enable();
	{ static int once; if (!once) { once = 1;
	  pr_info("uname_probe: ubuf=%px b0=%016llx b8=%016llx\n",
		  ud->ubuf, *(u64 *)buf, *(u64 *)(buf + 8)); } }
	/* new_utsname: sysname[65] nodename[65] release[65] version[65] ...
	 * → release @130, version @195 (65는 nodename — 초기 패치 오프셋 버그 수정) */
	strlcpy(buf + 130, UTS_RELEASE_SPOOF, 65); /* release */
	strlcpy(buf + 195, UTS_VERSION_SPOOF, 65); /* version */
	if (copy_to_user(ud->ubuf, buf, sizeof(buf)))
		return 0;
	return 0;
}

static int uid_gate(struct kretprobe_instance *ri, struct pt_regs *regs)
{
	if (uid_allowed())
		return 0;
	if (log_uid && current_uid().val == log_uid)
		return 0;   /* v4.19: 로그전용도 ret 핸들러 실행 */
	return 1;   /* ret 핸들러 스킵 */
}

static int rewrite_ret(struct kretprobe_instance *ri, struct pt_regs *regs)
{
	struct filename *fn = (struct filename *)regs_return_value(regs);
	char *name;

	if (IS_ERR_OR_NULL(fn))
		return 0;
	name = (char *)fn->name;
	if (!name || name[0] != '/')
		return 0;

	/* v4.19: log-only uid — 리다이렉트 없이 관측만(TG 채널 규명). */
	if (!uid_allowed()) {
		if (log_uid && current_uid().val == log_uid)
			log_interesting(name);
		return 0;
	}

	/* v4.21: emu GL lib 파일 존재 채널 테스트 — ENOENT로 차단(GL 깨질 수 있음). */
	if (emu_lib_block && is_emu_gl_lib(name)) {
		emulib_hits++;
		name[0] = '/'; name[1] = 'Z'; name[2] = '\0';
		return 0;
	}

	/* v3.8: goldfish GL 디바이스 open 세탁 — fd readlink(/proc/self/fd/N) 채널.
	 * 토스 libea56이 fd 371개를 전수 resolve해 /dev/goldfish_pipe 등을 읽는 것을
	 * 실측(2026-09-20). open을 클론 노드(mknod 동일 major/minor, camow3가 생성)
	 * 로 재지향하면 fd 링크 타깃이 /dev/.gfp 등으로 보이고 GL 동작은 동일하다.
	 * access/stat 존재체크는 acc-stat 훅이 계속 -ENOENT로 위조. path_blocked
	 * 보다 먼저 와야 qemu_pipe 차단을 우회해 클론으로 열린다. */
	/* v4.22: qemu_pipe는 clone 재지향 제거 — GL은 goldfish_pipe만 쓰고, qemu_pipe
	 * 존재 확인은 에뮬 텔테일이라 path_blocked로 ENOENT 시켜야 함(존재 누수 차단). */
	if (strcmp(name, "/dev/goldfish_pipe") == 0)
		redirect(name, "/dev/.wq517h");
	else if (strcmp(name, "/dev/goldfish_address_space") == 0)
		redirect(name, "/dev/.tr482w");
	else if (strcmp(name, "/dev/goldfish_sync") == 0)
		redirect(name, "/dev/.un394z");

	if (path_blocked(name)) {
		name[0] = '/';
		name[1] = 'Z';
		name[2] = '\0';
		return 0;
	}

	/* 자기 정보 → 위장 파일 (셸이 내용 유지)
	 * v4.0: smaps는 smaps 형식(Size:/Rss:/Pss:...) 파일로 별도 서비스 —
	 * maps 형식을 주면 파서가 판정 입력으로 삼을 수 있다(토스가 smaps 직접
	 * 읽는 것을 실측). smaps_rollup은 드물어 기존 maps 파일로 유지. */
	if (!maps_off && proc_self_file(name, "smaps"))
		redirect(name, "/dev/.pk832d");
	else if (!maps_off && (proc_self_file(name, "maps") ||
		 proc_self_file(name, "smaps_rollup")))
		redirect(name, "/dev/.q7zm4h");
	else if (proc_self_file(name, "status"))
		redirect(name, "/dev/.w2nvk9");
	else if (proc_self_file(name, "mounts"))
		redirect(name, "/dev/.jt38xs");
	else if (is_self_task_comm(name))
		redirect(name, "/dev/.ns582t");
	else if (strcmp(name, "/proc/net/unix") == 0)
		redirect(name, "/dev/.ra965d");
	else if (strcmp(name, "/proc/net/tcp") == 0)
		redirect(name, "/dev/.vy42mq");
	else if (strcmp(name, "/proc/misc") == 0)
		redirect(name, "/dev/.ew471v");   /* goldfish 디바이스 등록 테이블 (§2.20) */
	else if (strncmp(name, "/sys/devices/system/cpu/", 24) == 0 &&
		 (strcmp(name + 24, "online") == 0 || strcmp(name + 24, "present") == 0 ||
		  strcmp(name + 24, "possible") == 0))
		redirect(name, "/dev/.pl728v");  /* 2코어 → 8코어 위장 (판정 직전 마지막 읽기 실측) */
	else if (strcmp(name, "/proc/cpuinfo") == 0 && !dis_cpuinfo)
		redirect(name, "/dev/.zc7h4u");
	else if (strcmp(name, "/proc/version") == 0)
		redirect(name, "/dev/.kb913x");
	/* v4.22: 모듈/파일시스템/ioports 가상화 텔테일 — 필터된 fake로 재지향 */
	else if (strcmp(name, "/proc/modules") == 0)
		redirect(name, "/dev/.fakemod");
	else if (strcmp(name, "/proc/filesystems") == 0)
		redirect(name, "/dev/.fakefs");
	else if (strcmp(name, "/proc/ioports") == 0)
		redirect(name, "/dev/.fakeio");
	/* v4.4: uid sysstats — 실기기(삼성)엔 있고 GKI 에뮬엔 없는 3종(가드 dex 어휘
	 * 실측 2026-09-21). 존재 위장. 내용은 camow3가 생성 */
	else if (strcmp(name, "/proc/uid_time_in_state") == 0)
		redirect(name, "/dev/.r5t8yo");
	else if (strcmp(name, "/proc/uid_concurrent_policy_time") == 0)
		redirect(name, "/dev/.s2w6za");
	else if (strcmp(name, "/proc/uid_concurrent_active_time") == 0)
		redirect(name, "/dev/.t7x3ub");
	else if (proc_self_file(name, "time_in_state"))
		redirect(name, "/dev/.r5t8yo");
	/* v4.5: MIDR_EL1(호스트 Apple 0x61 노출 — 10차 실측)과 selinux enforce(0 노출)
	 * 를 값 위장. 내용은 camow3가 생성(.m8c4kd / .k3v9te) */
	else if (strcmp(name, "/sys/fs/selinux/enforce") == 0)
		redirect(name, "/dev/.k3v9te");
	/* v4.7: cpu0-7(가짜 online 범위)만 위장. wildcard 전체 매치(v4.5)는 가드의
	 * 코어수 프로브(cpuN을 N++하며 ENOENT 대기)의 ENOENT를 영원히 안 주어
	 * 무한 프로브로 만든다(19차 실측: cpu38747677+ 82만 distinct, 메인 스레드
	 * 스핀 → SystemJobService ANR). 17차 normalize_cpu_path와 동일 클래스.
	 * cpu8+는 실경로 통과 → ENOENT → 프로브 정상 종료. */
#if 0 /* bisectB off: v4.7 cpuN wildcard 위장 (§152 작업1/Build C — 회귀 범인 후보) */
	else if (strncmp(name, "/sys/devices/system/cpu/cpu", 27) == 0) {
		const char *q = name + 27;
		int core = 0;
		while (*q >= '0' && *q <= '9') {
			core = core * 10 + (*q - '0');
			if (core > 9) { core = 10; break; }
			q++;
		}
		if (core < 8 && *q == '/' &&
		    strstr(q, "/regs/identification/midr_el1"))
			redirect(name, "/dev/.m8c4kd");
	}
#endif
	/* v4.0: 타 프로세스 cmdline/status 리다이렉트(.oq306f 빈파일) 제거 —
	 * 토스 가드가 /proc/N/cmdline 전수 스윕으로 판정(실측). 전부 빈 문자열은
	 * 실기기에서 불가능한 상태라 tamper 신호가 된다. 시스템에 노출 프로세스가
	 * 없는 상태에서는 실제값을 보여주는 쪽이 안전. */

	/* v3.9 위장 파일 .oq306f는 하위호환용으로만 유지(camow3가 생성) */

	/* CPU 토폴로지 정규화 — 2코어 에뮬에서 엔진이 cpu2..7을 열어 ENOENT로
	 * 코어수 판정(52회 폴링 실측). cpuN → cpu0로 한 글자 교체(동일 길이라
	 * 제자리 재작성 안전)하면 모든 per-cpu 파일이 존재하는 8코어로 보임. */
	/* v4.6: normalize_cpu_path 제거 — 8코어 실확장(ncore=8)으로 cpu0-7이 실존.
	 * 옛 normalize(모든 cpuN→cpu0)는 가드의 코어수 프로브(cpuN++ … ENOENT 대기)를
	 * 무한 루프로 만들어 100% CPU + 스플래시 정체를 유발(17차 확정). */

	return 0;
}

static struct kretprobe kp_getname = {
	.kp.symbol_name	= "getname_flags",
	.entry_handler	= uid_gate,
	.handler	= rewrite_ret,
	.maxactive	= 256,
};

/* ── v4.1: HAL 경유 goldfish fd 링크 세탁 — d_path kretprobe ───────────────
 * allocator HAL이 열어 binder로 넘긴 fd는 open 주체가 HAL(uid 게이트 밖)이라
 * getname 훅으로 못 거른다(토스 fd 스윕에 /dev/goldfish_pipe 8개 노출 실측,
 * 2026-09-20/21). fd 링크의 내용은 readlink(2) → proc_pid_readlink → d_path가
 * 만든다(kretprobe 실측: dp: proc_pid_readlink+0xd0 <- d_path). 표적 uid가
 * readlink한 결과에 한해 제자리 교체한다 — open 자체는 건드리지 않는다. */
static ulong dp_hits;
module_param(dp_hits, ulong, 0444);

/* v4.6b: 가짜 파일명 → 원본 경로 역매핑 (readlink 누출 차단 — 16차 실측) */
static const struct { const char *fake, *real; } dmap[] = {
	{ "/dev/.zc7h4u", "/proc/cpuinfo" },
	{ "/dev/.kb913x", "/proc/version" },
	{ "/dev/.fakemod", "/proc/modules" },
	{ "/dev/.fakefs", "/proc/filesystems" },
	{ "/dev/.fakeio", "/proc/ioports" },
	{ "/dev/.q7zm4h", "/proc/self/maps" },
	{ "/dev/.pk832d", "/proc/self/smaps" },
	{ "/dev/.w2nvk9", "/proc/self/status" },
	{ "/dev/.jt38xs", "/proc/self/mounts" },
	{ "/dev/.ra965d", "/proc/net/unix" },
	{ "/dev/.vy42mq", "/proc/net/tcp" },
	{ "/dev/.ew471v", "/proc/misc" },
	{ "/dev/.r5t8yo", "/proc/uid_time_in_state" },
	{ "/dev/.k3v9te", "/sys/fs/selinux/enforce" },
	{ "/dev/.m8c4kd",
	  "/sys/devices/system/cpu/cpu0/regs/identification/midr_el1" },
	/* S155: 미등록 채널 — 가드의 /proc/self/task/%d/fd/ 스캔(§155 문자열 테이블
	 * 실측)이 readlink로 도트파일명을 수집하는 것을 차단. 세탁 대상은 실존 경로
	 * (16차 교훈: 수집 후 재open 검증 — 가짜 경로면 ENOENT로 tamper 확정). */
	{ "/dev/.wq517h", "/dev/null" },   /* goldfish_pipe 클론 */
	{ "/dev/.tr482w", "/dev/null" },   /* goldfish_address_space 클론 */
	{ "/dev/.un394z", "/dev/null" },   /* goldfish_sync 클론 */
	{ "/dev/.ns582t", "/proc/thread-self/comm" },
	{ "/dev/.pl728v", "/sys/devices/system/cpu/online" },
	{ "/dev/.s2w6za", "/proc/uid_concurrent_policy_time" },
	{ "/dev/.t7x3ub", "/proc/uid_concurrent_active_time" },
};

static int dpath_ret(struct kretprobe_instance *ri, struct pt_regs *regs)
{
	char *name = (char *)regs_return_value(regs);

	if (IS_ERR_OR_NULL(name) || name[0] != '/')
		return 0;

	if (strcmp(name, "/dev/goldfish_pipe") == 0 ||
	    strcmp(name, "/dev/qemu_pipe") == 0) {
		redirect(name, "/dev/.wq517h");
		dp_hits++;
	} else if (strcmp(name, "/dev/goldfish_address_space") == 0) {
		redirect(name, "/dev/.tr482w");
		dp_hits++;
	} else if (strcmp(name, "/dev/goldfish_sync") == 0) {
		redirect(name, "/dev/.un394z");
		dp_hits++;
	} else if (strncmp(name, "/dev/ashmem", 11) == 0) {
		/* S140: ashmem<uuid> fd — 실기기는 memfd. fd 스윕(readlinkat
		 * /proc/self/fd/N)의 노출을 memfd 형태로 세탁. */
		redirect(name, "/memfd:gpu-heap (deleted)");
		dp_hits++;
	}
	/* v4.6b: 가짜 파일명 누출 차단 — readlink가 /dev/.fake를 노출하면 가드가
	 * 이름을 수집 후 /dev에서 열어 tamper 확정(16차 실측). 접두부 매칭으로
	 * "(deleted)" 접미부가 붙어도 원본 경로로 되돌린다(페이지 버퍼 안전). */
	if (strncmp(name, "/dev/.", 6) == 0) {
		size_t mi;

		for (mi = 0; mi < ARRAY_SIZE(dmap); mi++) {
			size_t fl = strlen(dmap[mi].fake);

			if (strncmp(name, dmap[mi].fake, fl) == 0) {
				strcpy(name, dmap[mi].real);
				dp_hits++;
				break;
			}
		}
	}
	return 0;
}

static struct kretprobe kp_uname = {
	.kp.symbol_name	= "__arm64_sys_newuname",
	.handler	= uname_ret,
	.entry_handler	= uname_entry,
	.data_size	= sizeof(struct uname_data),
	.maxactive	= 256,
};

static struct kretprobe kp_dpath = {
	.kp.symbol_name	= "d_path",
	.entry_handler	= uid_gate,
	.handler	= dpath_ret,
	.maxactive	= 256,
};

/* ── access/stat 계열만의 goldfish 존재체크 위조 ───────────────────────────
 * /dev/goldfish_pipe 는 앱 GL 전송로라 open은 살려야 한다. 하지만 §3 실측상
 * 엔진 판정의 마지막 남은 트리거가 goldfish_pipe "존재 확인"이다.
 * access/faccessat, statx, fstatat 성공 호출에 한해 goldfish와 qemu_pipe 경로를
 * -ENOENT로 위조한다. (open 통과 — GL 보호)
 * v1 교훈: 유저 포인터 읽기는 페이지 폴트 시 수면 위험이 있으나, 엔진이 방금
 * 참조한 경로 문자열이라 상주 확률이 사실상 100퍼센트 — v1에서도 운용 실적 있음. */
struct hide_acc_data {
	unsigned long uptr;
};

static int hide_acc_entry(struct kretprobe_instance *ri, struct pt_regs *regs)
{
	struct hide_acc_data *d = (struct hide_acc_data *)ri->data;

	if (!uid_allowed())
		return 1;
	d->uptr = regs->regs[1];   /* x1 = pathname (user) */
	return 0;
}

static int is_goldfish_path(const char *p)
{
	/* 그래픽/HAL 드라이버 .so는 앱 필수 — access/stat도 위조하면 로더가 스킵함 */
	if (is_driver_lib(p))
		return 0;
	/* containment: /dev/goldfish*, /dev/qemu_pipe는 물론
	 * /init.goldfish.rc, /ueventd.ranchu.rc 같은 루트 rc 파일도 커버 (AVC 실측) */
	return strncmp(p, "/dev/goldfish", 13) == 0 ||
	       strncmp(p, "/dev/qemu_pipe", 14) == 0 ||
	       strstr(p, "goldfish") != NULL || strstr(p, "ranchu") != NULL ||
	       strstr(p, "qemu") != NULL;
}

static int hide_acc_ret(struct kretprobe_instance *ri, struct pt_regs *regs)
{
	struct hide_acc_data *d = (struct hide_acc_data *)ri->data;
	char buf[256];
	long n;

	if (regs_return_value(regs) != 0 || d->uptr == 0)
		return 0;   /* 실패 호출 = 이미 "없음" */
	n = strncpy_from_user(buf, (const char __user *)d->uptr, sizeof(buf) - 1);
	if (n <= 0)
		return 0;
	buf[n] = '\0';
	if (is_goldfish_path(buf))
		regs_set_return_value(regs, -ENOENT);
	return 0;
}

static struct kretprobe kp_faccessat = {
	.kp.symbol_name	= "do_faccessat",
	.entry_handler	= hide_acc_entry,
	.handler	= hide_acc_ret,
	.data_size	= sizeof(struct hide_acc_data),
	.maxactive	= 256,
};

static struct kretprobe kp_statx = {
	.kp.symbol_name	= "vfs_statx",
	.entry_handler	= hide_acc_entry,
	.handler	= hide_acc_ret,
	.data_size	= sizeof(struct hide_acc_data),
	.maxactive	= 256,
};

static struct kretprobe kp_fstatat = {
	.kp.symbol_name	= "vfs_fstatat",
	.entry_handler	= hide_acc_entry,
	.handler	= hide_acc_ret,
	.data_size	= sizeof(struct hide_acc_data),
	.maxactive	= 256,
};

/* ── 디렉터리 열거 필터 (getdents64 버퍼 수술) ──────────────────────────────
 * filldir64를 -1로 끊는 방식은 ctx->pos가 건너뛴 항목 앞에 정체되어
 * "끝까지 읽기" 루프가 무한 반복되는 결함이 있었다 (실측: 엔진 스레드+RenderThread
 * 각 100% 스핀). 대신 getdents64 syscall 반환 버퍼에서 항목을 memmove로 제거하고
 * 반환 크기를 줄인다 — 위치는 커널이 이미 전진시켜 둔 값이라 정체가 없다.
 * 버퍼는 유저 메모리이지만 직전에 커널이 채운 페이지라 fault 위험 사실상 없음. */
struct hide_gd_data {
	unsigned long buf;
	unsigned long len;
};

static unsigned long gd_filtered, gd_calls, gd_dbg;
module_param(gd_filtered, ulong, 0444);
module_param(gd_calls, ulong, 0444);
module_param(gd_dbg, ulong, 0644);   /* >0 이면 첫 N회 dirent 파싱 로그 */

static int hide_gd_entry(struct kretprobe_instance *ri, struct pt_regs *regs)
{
	struct hide_gd_data *d = (struct hide_gd_data *)ri->data;
	struct pt_regs *uregs;

	d->buf = 0;
	d->len = 0;
	if (!uid_allowed())
		return 1;
	gd_calls++;
	/* __arm64_sys_getdents64(const struct pt_regs *regs): arm64 syscall wrapper라
	 * 진입 x0(=regs->regs[0])이 유저 syscall 인자를 담은 pt_regs 포인터다.
	 * dirent 버퍼는 그 안의 2번째 인자 = uregs->regs[1]. (v3.6 버그: 래퍼의
	 * regs->regs[1]을 읽어 gd_filtered=0이었음 — 2026-09-19 수정) */
	uregs = (struct pt_regs *)regs->regs[0];
	if (uregs)
		d->buf = uregs->regs[1];
	return 0;
}

static int dirent_hidden(const char *name)
{
	/* v4.2: 텔레텔 .so도 표적 uid 열거에서는 숨긴다. 구 .so 전면 예외는
	 * 2026-09-19의 "매퍼 부재 → RenderThread SIGABRT" 회귀 방지용이었으나,
	 * 이제 매퍼/EGL 등 앱이 스캔으로 찾는 드라이버 lib는 bind 사본에서
	 * 중립명(qti/adreno)으로 바뀌어 있으므로 텔레텔 이름 항목은 숨겨도
	 * 스캔이 깨지지 않는다(2026-09-21 실측). 비표적(HAL 서비스)은 애초에
	 * 이 필터 밖이라 영향 없음. /dev 노드·rc 파일 필터는 그대로 유효. */
	if (strstr(name, "goldfish") || strstr(name, "ranchu") ||
	    strstr(name, "qemu") || strstr(name, "emulation"))
		return 1;
	/* v4.22: 가상화 커널모듈 텔테일 — /sys/module 열거에서 virtio/kvm/vsock/failover/
	 * btintel 항목 은닉(실기기 SM-S916N엔 없음). uid게이트라 toss 열거만 영향. */
	if (strstr(name, "virtio") || strstr(name, "vsock") ||
	    strstr(name, "failover") || strstr(name, "btintel") ||
	    strcmp(name, "kvm") == 0 || strstr(name, "intel_powerclamp") ||
	    strstr(name, "nd_virtio"))
		return 1;
	/* v3.9: 위장/클론 파일명 전수 은닉 — 토스 가드가 /dev/.m 등 표준 은닉
	 * 파일명을 브루트포스 open하는 채널 실측(2026-09-20). 난수명 + 열거 은닉
	 * 이중 방어. (구 단문명도 혹시 남아있을 경우 대비해 계속 은닉) */
	if (name[0] == '.') {
		size_t l = strlen(name);
		static const char *const camo[] = {
			".q7zm4h", ".w2nvk9", ".jt38xs", ".ra965d", ".vy42mq",
			".zc7h4u", ".kb913x", ".ns582t", ".ew471v", ".oq306f",
			".pl728v", ".wq517h", ".tr482w", ".un394z",
			".fakemod", ".fakefs", ".fakeio",
			".m", ".s", ".k", ".u", ".t", ".c", ".v", ".n", ".e",
			".mi", ".c2", ".gfp", ".gas", ".gsy",
		};
		size_t i;

		for (i = 0; i < ARRAY_SIZE(camo); i++)
			if (l == strlen(camo[i]) && !strcmp(name, camo[i]))
				return 1;
	}
	return 0;
}

static int hide_gd_ret(struct kretprobe_instance *ri, struct pt_regs *regs)
{
	struct hide_gd_data *d = (struct hide_gd_data *)ri->data;
	long total = regs_return_value(regs);
	char *kbuf;
	long off = 0, kept;

	if (total <= 0 || (unsigned long)total > 65536 || !d->buf)
		return 0;

	/* 주의: 스핀락 + copy_from_user 조합은 스왑 아웃된 버퍼 페이지 폴트 시
	 * 시스템 전체 행(hang)을 유발한다 (2026-09-19 실측). kmalloc(GFP_ATOMIC)
	 * per-call로 락 없이 처리한다. */
	kbuf = kmalloc(total, GFP_ATOMIC);
	if (!kbuf)
		return 0;
	if (copy_from_user(kbuf, (void __user *)d->buf, total)) {
		kfree(kbuf);
		return 0;
	}

	/* 파싱 검증: gd_dbg>0 이면 첫 dirent 이름/오프셋을 로그로 확인 (일회성 진단) */
	if (gd_dbg) {
		u16 rl0 = *(u16 *)(kbuf + 16);

		pr_info("hide_kmod gd: buf=%lx total=%ld reclen0=%u name0='%.32s'\n",
			d->buf, total, rl0, kbuf + 19);
		gd_dbg--;
	}

	{
		long orig = total;
		int removed = 0;

		off = 0;
		while (off < total) {
			u16 reclen = *(u16 *)(kbuf + off + 16);
			const char *name;

			if (reclen == 0 || off + reclen > total)
				break;
			name = kbuf + off + 19;
			if (dirent_hidden(name)) {
				long tail = total - (off + reclen);

				if (tail > 0)
					memmove(kbuf + off, kbuf + off + reclen, tail);
				total -= reclen;
				removed = 1;
			} else {
				off += reclen;
			}
		}
		kept = total;
		if (removed && kept >= 0 &&
		    copy_to_user((void __user *)d->buf, kbuf, kept) == 0) {
			gd_filtered++;
			regs_set_return_value(regs, kept);
		}
		(void)orig;
	}
	kfree(kbuf);
	return 0;
}

static struct kretprobe kp_getdents = {
	.kp.symbol_name	= "__arm64_sys_getdents64",
	.entry_handler	= hide_gd_entry,
	.handler	= hide_gd_ret,
	.data_size	= sizeof(struct hide_gd_data),
	.maxactive	= 512,
};

/* ── v4.17: mrs MIDR_EL1 EL0 에뮬레이션 위장 ──────────────────────────────
 * sysfs midr_el1 redirect(getname)로는 못 막는 채널: arm64는 EL0의
 * `mrs MIDR_EL1`을 undef 트랩 → do_emulate_mrs 로 에뮬레이트해 실 호스트(부팅 CPU)
 * MIDR을 그대로 돌려준다(uid 무관). 가드가 이 1명령으로 MIDR을 읽으면 호스트 Apple
 * 0x61이 노출된다(56차 실측: mrs=0x610f0000 vs sysfs redirect=0x411fd4e0 — 불일치
 * 자체도 tamper 텔). 표적 uid + MIDR_EL1 에 한해 반환 레지스터를 sysfs 위장값과 동일한
 * 가짜 ARM MIDR로 재작성한다. do_emulate_mrs(struct pt_regs*=x0, u32 sys_reg=x1,
 * u32 rt=x2); 성공(반환 0) 시 regs[rt]에 값이 기록되므로 그때 덮어쓴다. */
#define MRS_MIDR_FAKE 0x00000000411fd4e0UL
/* v4.22: Cortex-X3(Snapdragon 8 Gen2) ID_AA64 feature 레지스터 스푸핑값 — MIDR(X3)와 일관.
 * mrs_spoof=1 시 do_emulate_mrs 반환값을 실 X3 값으로 재작성. */
#define SYS_ID_AA64PFR0_EL1  sys_reg(3, 0, 0, 4, 0)
#define SYS_ID_AA64PFR1_EL1  sys_reg(3, 0, 0, 4, 1)
#define SYS_ID_AA64ISAR0_EL1 sys_reg(3, 0, 0, 6, 0)
#define SYS_ID_AA64ISAR1_EL1 sys_reg(3, 0, 0, 6, 1)
#define X3_PFR0  0x1100000010111112UL
#define X3_PFR1  0x0000000000000021UL
#define X3_ISAR0 0x0221111110212120UL
#define X3_ISAR1 0x0011111101211032UL
static int mrs_spoof;
module_param_named(mrs_spoof, mrs_spoof, int, 0644);
static unsigned long mrs_spoof_hits;
module_param(mrs_spoof_hits, ulong, 0444);

struct mrs_data { struct pt_regs *uregs; u32 rt; u32 sreg; int hit; };
static unsigned long mrs_midr_hits;
module_param(mrs_midr_hits, ulong, 0444);
/* v4.22: 표적 uid가 mrs로 읽는 모든 트랩 레지스터 로그(CPU feature fingerprint 규명 —
 * ID_AA64* 등 QEMU vs 실 Snapdragon 차이). */
static int mrs_log;
module_param_named(mrs_log, mrs_log, int, 0644);

static int mrs_entry(struct kretprobe_instance *ri, struct pt_regs *regs)
{
	struct mrs_data *d = (struct mrs_data *)ri->data;

	d->hit = 0;
	if (!uid_allowed())
		return 1;
	d->sreg = (u32)regs->regs[1];
	/* MIDR 스푸핑 + (mrs_spoof 시) ID_AA64 feature 스푸핑 + (mrs_log 시) 로깅 캡처 */
	if (d->sreg != SYS_MIDR_EL1 && !mrs_log && !mrs_spoof)
		return 1;
	d->uregs = (struct pt_regs *)regs->regs[0];
	d->rt    = (u32)regs->regs[2];
	d->hit   = 1;
	return 0;
}

static int mrs_ret(struct kretprobe_instance *ri, struct pt_regs *regs)
{
	struct mrs_data *d = (struct mrs_data *)ri->data;

	if (!d->hit || !d->uregs || d->rt >= 31 || regs_return_value(regs) != 0)
		return 0;
	if (d->sreg == SYS_MIDR_EL1) {
		d->uregs->regs[d->rt] = MRS_MIDR_FAKE;
		mrs_midr_hits++;
		return 0;
	}
	if (mrs_spoof) {
		unsigned long v = 0; int spoofed = 1;
		switch (d->sreg) {
		case SYS_ID_AA64PFR0_EL1:  v = X3_PFR0;  break;
		case SYS_ID_AA64PFR1_EL1:  v = X3_PFR1;  break;
		case SYS_ID_AA64ISAR0_EL1: v = X3_ISAR0; break;
		case SYS_ID_AA64ISAR1_EL1: v = X3_ISAR1; break;
		default: spoofed = 0; break;
		}
		if (spoofed) {
			d->uregs->regs[d->rt] = v;
			mrs_spoof_hits++;
			return 0;
		}
	}
	if (mrs_log)
		pr_info("MRS sys_reg=0x%x val=0x%016lx pc=0x%lx comm=%s\n",
			d->sreg, (unsigned long)d->uregs->regs[d->rt],
			(unsigned long)d->uregs->pc, current->comm);
	return 0;
}

static struct kretprobe kp_mrs = {
	.kp.symbol_name	= "do_emulate_mrs",
	.entry_handler	= mrs_entry,
	.handler	= mrs_ret,
	.data_size	= sizeof(struct mrs_data),
	.maxactive	= 64,
};

/* ── v4.23: afed8 param 동적추적 — 하드웨어 브레이크포인트 ─────────────────────
 * 코드 미수정(self-integrity 회피) + ptrace 아님(TracerPid 미설정 → 스텔스).
 * perf_event_create_kernel_counter로 per-task 실행 브레이크포인트.
 * 사용: echo <pid> > hwbp_pid; echo <afed8 런타임VA> > hwbp_addr; echo 1 > hwbp_go */
static unsigned int hwbp_pid;
module_param(hwbp_pid, uint, 0644);
static unsigned long hwbp_addr;
module_param(hwbp_addr, ulong, 0644);
/* S155: 타입 확장 — 0=X(실행, 기존 afed8용) / 1=W(쓰기 워치포인트, 가드 ctx 스택 감시용) */
static int hwbp_type = 0;
module_param(hwbp_type, int, 0644);
static int hwbp_len = 4;   /* 4 또는 8 */
module_param(hwbp_len, int, 0644);
static ulong hwbp_hits;
module_param(hwbp_hits, ulong, 0444);
static struct perf_event *hwbp_ev;              /* tid 무장(기존) */
#define HWBP_NCPU 16
static struct perf_event *hwbp_cpu_ev[HWBP_NCPU]; /* v4.25: 전-CPU 무장(pid=0 시) */
static int hwbp_ncpu_armed;

/* v4.24 §165: 406만 히트/런급 워치포인트는 printk 홍수로 링이 뭉개짐 — 샘플+꼬리버퍼 */
#define HWBP_TAIL 512
static unsigned long hwbp_tail_pc[HWBP_TAIL];
static unsigned long hwbp_tail_x0[HWBP_TAIL];
static int hwbp_tail_idx;
static int hwbp_tail_wrapped;
static void hwbp_handler(struct perf_event *bp, struct perf_sample_data *data,
			 struct pt_regs *regs)
{
	unsigned long pc = (unsigned long)regs->pc;
	unsigned long a0 = (hwbp_type == 1) ? (unsigned long)regs->regs[0] : (u32)regs->regs[0];
	hwbp_hits++;
	hwbp_tail_pc[hwbp_tail_idx] = pc;
	hwbp_tail_x0[hwbp_tail_idx] = a0;
	if (++hwbp_tail_idx >= HWBP_TAIL) { hwbp_tail_idx = 0; hwbp_tail_wrapped = 1; }
	/* 샘플: 65536회당 1회만 printk */
	if ((hwbp_hits & 0xFFFF) == 1)
		pr_info("CTXWS #%lu pc=0x%lx x0=0x%lx comm=%s\n", hwbp_hits, pc, a0, current->comm);
}
static void hwbp_dump_tail(void)
{
	int i, n = hwbp_tail_wrapped ? HWBP_TAIL : hwbp_tail_idx;
	pr_info("CTXW-TAIL begin n=%d total=%lu\n", n, hwbp_hits);
	for (i = 0; i < n; i++) {
		int k = hwbp_tail_wrapped ? (hwbp_tail_idx + i) % HWBP_TAIL : i;
		pr_info("CTXW-T pc=0x%lx x0=0x%lx\n", hwbp_tail_pc[k], hwbp_tail_x0[k]);
	}
	pr_info("CTXW-TAIL end\n");
	hwbp_tail_idx = 0; hwbp_tail_wrapped = 0;
}

static int hwbp_go_set(const char *val, const struct kernel_param *kp)
{
	struct perf_event_attr attr;
	struct task_struct *task;
	struct pid *p;

	if (hwbp_ev) {
		perf_event_release_kernel(hwbp_ev);
		hwbp_ev = NULL;
		hwbp_dump_tail();
	}
	{
		int k;
		for (k = 0; k < hwbp_ncpu_armed; k++)
			if (hwbp_cpu_ev[k])
				perf_event_release_kernel(hwbp_cpu_ev[k]);
		memset(hwbp_cpu_ev, 0, sizeof(hwbp_cpu_ev));
		hwbp_ncpu_armed = 0;
	}
	if (!hwbp_pid) {
		/* v4.25 §166: pid=0 → 전-CPU 무장(스레드 로또 제거) — addr만 유효하면 */
		int cpu;
		if (!hwbp_addr) {
			pr_info("hwbp: cleared\n");
			return 0;
		}
		for_each_possible_cpu(cpu) {
			if (hwbp_ncpu_armed >= HWBP_NCPU) break;
			hwbp_cpu_ev[hwbp_ncpu_armed] =
				perf_event_create_kernel_counter(&attr, cpu, NULL, hwbp_handler, NULL);
			if (IS_ERR_OR_NULL(hwbp_cpu_ev[hwbp_ncpu_armed])) {
				pr_err("hwbp: cpu%d create failed\n", cpu);
				hwbp_cpu_ev[hwbp_ncpu_armed] = NULL;
			} else {
				perf_event_enable(hwbp_cpu_ev[hwbp_ncpu_armed]);
				hwbp_ncpu_armed++;
			}
		}
		pr_info("hwbp: ALLCPU armed at 0x%lx on %d cpus\n", hwbp_addr, hwbp_ncpu_armed);
		return 0;
	}
	if (!hwbp_addr) {
		pr_info("hwbp: cleared\n");
		return 0;
	}
	hw_breakpoint_init(&attr);
	attr.bp_addr  = hwbp_addr;
	attr.bp_len   = (hwbp_len == 8) ? HW_BREAKPOINT_LEN_8 : HW_BREAKPOINT_LEN_4;
	attr.bp_type  = (hwbp_type == 1) ? HW_BREAKPOINT_W : HW_BREAKPOINT_X;
	attr.disabled = 0;
	/* v4.23 §165: arm64는 커널모드 워치포인트 미지원 — exclude_kernel 없으면 쓰기감시가
	 * 조용히 무장실패(selftest 실측: 5000회 쓰기에 0힛). 유저쓰기만 감시. */
	if (hwbp_type == 1)
		attr.exclude_kernel = 1;

	rcu_read_lock();
	p = find_vpid(hwbp_pid);
	task = p ? pid_task(p, PIDTYPE_PID) : NULL;
	if (task)
		get_task_struct(task);
	rcu_read_unlock();
	if (!task) {
		pr_err("hwbp: pid %u not found\n", hwbp_pid);
		return 0;
	}
	hwbp_ev = perf_event_create_kernel_counter(&attr, -1, task, hwbp_handler, NULL);
	put_task_struct(task);
	if (IS_ERR(hwbp_ev)) {
		pr_err("hwbp: create failed %ld\n", PTR_ERR(hwbp_ev));
		hwbp_ev = NULL;
		return 0;
	}
	perf_event_enable(hwbp_ev);
	pr_info("hwbp: armed at 0x%lx on pid %u\n", hwbp_addr, hwbp_pid);
	return 0;
}
static const struct kernel_param_ops hwbp_go_ops = { .set = hwbp_go_set };
module_param_cb(hwbp_go, &hwbp_go_ops, NULL, 0644);

/* ── v4.22 §161: vdso_data(vvar) 스푸핑 — 타이밍 채널(vvar 직접판독) 인과검증/대응
 * v4.22a 재설계(초판 init-데드락 사면): ① 심볼 해결을 커널에서 하지 않는다 — userspace가
 * /proc/kallsyms에서 vdso_data_store 주소를 파라미터로 전달(vdso_page_addr) ② kretprobe 대신
 * 2ms 지연워커로 재위조(커널이 매 틱 mult를 다시 쓰므로) — probe 등록 데드락 클래스 자체 제거.
 * 전제(ack-kernel 5.15 arm64): struct vdso_data 240B, store.data[CS_BASES=2]
 * (CS_HRES_COARSE=0, CS_RAW=1), mult@+24 shift@+28, vvar은 유저매핑과 동일 페이지. */
static int vdso_spoof;
module_param(vdso_spoof, int, 0644);
static uint vdso_mult;
module_param(vdso_mult, uint, 0644);
static uint vdso_shift;
module_param(vdso_shift, uint, 0644);
static int vdso_mode = -1;
module_param(vdso_mode, int, 0644);
static ulong vdso_hits;
module_param(vdso_hits, ulong, 0444);
static ulong vdso_page_addr;	/* userspace 지정: /proc/kallsyms 의 vdso_data_store */
module_param(vdso_page_addr, ulong, 0644);

#define VD_SZ        240
#define VD_SEQ_OFF   0
#define VD_MODE_OFF  4
#define VD_MULT_OFF  24
#define VD_SHIFT_OFF 28

static void vdso_patch_entry(u8 *e)
{
	u32 seq;
	seq = *(u32 *)(e + VD_SEQ_OFF);
	*(u32 *)(e + VD_SEQ_OFF) = seq + 1;
	wmb();
	if (vdso_mult)  *(u32 *)(e + VD_MULT_OFF)  = vdso_mult;
	if (vdso_shift) *(u32 *)(e + VD_SHIFT_OFF) = vdso_shift;
	if (vdso_mode >= 0) *(s32 *)(e + VD_MODE_OFF) = vdso_mode;
	wmb();
	*(u32 *)(e + VD_SEQ_OFF) = seq + 2;
	vdso_hits++;
}

static void vdso_work_fn(struct work_struct *w)
{
	if (vdso_spoof && vdso_page_addr) {
		vdso_patch_entry((u8 *)vdso_page_addr);
		vdso_patch_entry((u8 *)(vdso_page_addr + VD_SZ));
	}
	queue_delayed_work(system_wq, to_delayed_work(w), msecs_to_jiffies(2));
}
static DECLARE_DELAYED_WORK(vdso_dw, vdso_work_fn);


/* ── v4.26 §167: 페이지 RO 트리프와이어 — 스레드 무관 쓰기 관측 ──────────────
 * 무장: 타깃 VMA의 VM_WRITE|VM_MAYWRITE 클리어 + PTE 쓰기비트 클리어(+TLB flush).
 * 쓰기 폴트 → force_sig_fault 훅에서: pc 로깅 + PTE 쓰기 복원(+flush) + 2ms 후 재보호
 * (지연워커) + 시그널 스킵(kregs->pc=LR, return 1) → 유저 명령 재실행 성공.
 * 워치포인트와 달리 arm64 스레드 제약 없음. */
static int pagewatch;
module_param(pagewatch, int, 0644);
static uint pagewatch_pid;
module_param(pagewatch_pid, uint, 0644);
static ulong pagewatch_addr;
module_param(pagewatch_addr, ulong, 0644);
static ulong pagewatch_hits;
module_param(pagewatch_hits, ulong, 0444);
static ulong pwtail_pc[256];
/* v4.29 §173: 복호기 문맥 포획 — pc + 키 레지스터(x9,x10,x11,x12,x13,x16,x19) */
static ulong pwtail_r[256][8];
static int pwtail_idx, pwtail_wrapped;

static struct mm_struct *pw_mm;
static unsigned long pw_page;
static unsigned long pw_saved_flags;
static struct vm_area_struct *pw_vma;   /* flush_tlb_page용 */

#include <asm/pgtable.h>
#include <asm/tlbflush.h>

static int pw_pte_rw(struct mm_struct *mm, unsigned long addr, int writable)
{
	pgd_t *pgd; p4d_t *p4d; pud_t *pud; pmd_t *pmd; pte_t *pte, v;
	if (!mm)
		return -EINVAL;
	pgd = pgd_offset(mm, addr);
	if (pgd_none(*pgd) || pgd_bad(*pgd))
		return -ENOENT;
	p4d = p4d_offset(pgd, addr);
	if (p4d_none(*p4d) || p4d_bad(*p4d))
		return -ENOENT;
	pud = pud_offset(p4d, addr);
	if (pud_none(*pud) || pud_bad(*pud))
		return -ENOENT;
	pmd = pmd_offset(pud, addr);
	if (pmd_none(*pmd) || pmd_bad(*pmd) || pmd_trans_huge(*pmd))
		return -ENOENT;
	pte = pte_offset_map(pmd, addr);
	if (!pte)
		return -ENOENT;
	v = *pte;
	if (pte_none(v) || !pte_present(v)) {
		pte_unmap(pte);
		return -ENOENT;
	}
	if (writable)
		set_pte(pte, pte_mkwrite(v));
	else
		set_pte(pte, pte_wrprotect(v));
	pr_info("pagewatch: pte@0x%lx → %s (raw 0x%llx)\n", addr,
		writable ? "RW" : "RO", (unsigned long long)pte_val(*pte));
	pte_unmap(pte);
	if (pw_vma)
		flush_tlb_page(pw_vma, addr);
	else
		flush_tlb_mm(mm);
	return 0;
}

static void pw_reprotect_fn(struct work_struct *w)
{
	if (!pagewatch || !pw_mm)
		return;
	pw_pte_rw(pw_mm, pw_page, 0);
}
static DECLARE_DELAYED_WORK(pw_work, pw_reprotect_fn);

static int pagewatch_arm(void)
{
	struct task_struct *t;
	struct pid *p;
	struct vm_area_struct *vma;
	struct mm_struct *mm = NULL;
	unsigned long a;

	if (!pagewatch_pid || !pagewatch_addr) {
		/* 해제 — PW 꼬리 덤프(256엔트리: 마지막 쓰기 폴트 pc들) */
		{
			int i, n = pwtail_wrapped ? 256 : pwtail_idx;
			pr_info("PW-TAIL begin n=%d total=%lu\n", n, pagewatch_hits);
			for (i = 0; i < n; i++) {
				int k = pwtail_wrapped ? (pwtail_idx + i) % 256 : i;
				pr_info("PW-T pc=0x%lx x9=0x%lx x10=0x%lx x11=0x%lx x12=0x%lx x13=0x%lx x16=0x%lx x19=0x%lx x8=0x%lx\n",
					pwtail_pc[k], pwtail_r[k][0], pwtail_r[k][1], pwtail_r[k][2],
					pwtail_r[k][3], pwtail_r[k][4], pwtail_r[k][5], pwtail_r[k][6], pwtail_r[k][7]);
			}
			pr_info("PW-TAIL end\n");
			pwtail_idx = 0; pwtail_wrapped = 0;
		}
		if (pw_mm) {
			pw_pte_rw(pw_mm, pw_page, 1);
			rcu_read_lock();
			p = find_vpid(pagewatch_pid ? pagewatch_pid : 0);
			(void)p;
			rcu_read_unlock();
			pw_vma = NULL;
			mmput(pw_mm);
			pw_mm = NULL;
		}
		pr_info("pagewatch: cleared\n");
		return 0;
	}
	rcu_read_lock();
	p = find_vpid(pagewatch_pid);
	t = p ? pid_task(p, PIDTYPE_PID) : NULL;
	mm = t ? t->mm : NULL;
	if (mm && !mmget_not_zero(mm))
		mm = NULL;
	rcu_read_unlock();
	if (!mm) {
		pr_err("pagewatch: pid %u no mm\n", pagewatch_pid);
		return -ENOENT;
	}
	if (mmap_write_lock_killable(mm)) {
		mmput(mm);
		return -EINTR;
	}
	vma = find_vma(mm, pagewatch_addr);
	if (!vma || pagewatch_addr < vma->vm_start || pagewatch_addr >= vma->vm_end) {
		mmap_write_unlock(mm);
		mmput(mm);
		pr_err("pagewatch: addr 0x%lx not in any vma\n", pagewatch_addr);
		return -ENOENT;
	}
	pw_saved_flags = vma->vm_flags;
	/* v4.27 설계B: VMA 쓰기유지 + PTE만 RO → 쓰기 폴트가 do_wp_page(COW)로 —
	 * 시그널 경로 미경유(앱 무사) + do_wp_page kprobe로 전-스레드 관측 */
	pw_vma = vma;
	pw_page = pagewatch_addr & PAGE_MASK;
	a = pw_page;
	for (; a < pw_page + PAGE_SIZE * 4; a += PAGE_SIZE)
		pw_pte_rw(mm, a, 0);
	mmap_write_unlock(mm);
	pw_mm = mm;   /* mmput은 해제 시 */
	pr_info("pagewatch: armed page=0x%lx pid=%u (vma flags 0x%lx→0x%lx)\n",
		pw_page, pagewatch_pid, pw_saved_flags, vma->vm_flags);
	return 0;
}

/* v4.27: COW 경유 트리프와이어 — do_wp_page에서 타깃 페이지 쓰기 폴트 관측 */
static int wpp_pre(struct kprobe *p, struct pt_regs *kregs)
{
	struct vm_fault *vmf = (struct vm_fault *)kregs->regs[0];
	unsigned long faddr;
	struct pt_regs *u;
	if (!pagewatch || !pw_mm || current->tgid != (pid_t)pagewatch_pid || !vmf)
		return 0;
	faddr = vmf->address;              /* struct vm_fault 5.15: address 첫 필드 근방 */
	if (faddr < pw_page || faddr >= pw_page + PAGE_SIZE)
		return 0;
	u = task_pt_regs(current);
	pagewatch_hits++;
	if (u) {
		pwtail_pc[pwtail_idx] = u->pc;
		/* v4.29c §175: K2 표 내용 캡처 — 첫 폴트에서 x8/x19 유저메모리 64B (probe_user_read,
		 * kprobe 안전 유저 읽기 — 페이지는 복호기가 방금 읽어 present 상태) */
		if (pagewatch_hits == 1 && u->regs[8]) {
			unsigned char kb[64];
			if (!copy_from_user_nofault(kb, (const void __user *)u->regs[8], 64)) {
				int q;
				pr_info("PW-K2 x8=0x%llx:", (unsigned long long)u->regs[8]);
				for (q = 0; q < 64; q++) pr_cont(" %02x", kb[q]);
				pr_cont("\n");
			} else pr_info("PW-K2 x8 read FAILED\n");
			if (u->regs[19]) {
				unsigned char pb[64];
				if (!copy_from_user_nofault(pb, (const void __user *)u->regs[19], 64)) {
					int q;
					pr_info("PW-K2 x19=0x%llx:", (unsigned long long)u->regs[19]);
					for (q = 0; q < 64; q++) pr_cont(" %02x", pb[q]);
					pr_cont("\n");
				} else pr_info("PW-K2 x19 read FAILED\n");
			}
		}
		pwtail_r[pwtail_idx][0] = u->regs[9];
		pwtail_r[pwtail_idx][1] = u->regs[10];
		pwtail_r[pwtail_idx][2] = u->regs[11];
		pwtail_r[pwtail_idx][3] = u->regs[12];
		pwtail_r[pwtail_idx][4] = u->regs[13];
		pwtail_r[pwtail_idx][5] = u->regs[16];
		pwtail_r[pwtail_idx][6] = u->regs[19];
		pwtail_r[pwtail_idx][7] = u->regs[8];   /* v4.29b: x8(키2 테이블 베이스) */
	} else {
		pwtail_pc[pwtail_idx] = 0;
	}
	if (++pwtail_idx >= 256) { pwtail_idx = 0; pwtail_wrapped = 1; }
	if ((pagewatch_hits & 0x3F) == 1)
		pr_info("PW #%lu pc=0x%lx comm=%s tid=%d\n", pagewatch_hits,
			u ? u->pc : 0, current->comm, current->pid);
	mod_delayed_work(system_wq, &pw_work, msecs_to_jiffies(2));  /* COW 완료 후 재 RO */
	return 0;
}
static struct kprobe kp_wpp = {
	.symbol_name = "do_wp_page",
	.pre_handler = wpp_pre,
};

static int pagewatch_go_set(const char *val, const struct kernel_param *kp)
{
	int v, ret = kstrtoint(val, 0, &v);
	if (ret)
		return ret;
	pagewatch = v;
	return pagewatch_arm();
}
static const struct kernel_param_ops pagewatch_go_ops = { .set = pagewatch_go_set };
module_param_cb(pagewatch_go, &pagewatch_go_ops, NULL, 0644);

/* ── v4.18: 네이티브 자폭(§14 poison→PC=저주소→instr abort) 커널 복구 ───────────
 * 유저랜드 시그널 핸들러는 libsigchain이 덮어 무용(§69). 커널에서 force_sig_fault를
 * 가로채: 표적 uid + 유저 PC가 저주소(<0x10000, null 점프=자폭)면 시그널 대신
 * faulting 스레드 PC를 xpark(.xhook.so 상주 park 루프)로 돌리고 force_sig_fault 스킵.
 * xpark 주소는 .xhook.so 생성자가 prctl(0x58504b,&xpark)로 전달. */
static unsigned long segv_recover_hits;
module_param(segv_recover_hits, ulong, 0444);
static int segv_recover = 1;
module_param(segv_recover, int, 0644);
static unsigned long xpark_last;   /* 관측용 */
module_param(xpark_last, ulong, 0444);

/* per-tgid xpark 테이블 (LD_PRELOAD가 자식에 상속돼 글로벌을 덮어쓰는 문제 해결) */
#define NXP 16
static struct { pid_t tgid; unsigned long va; } xptab[NXP];
static DEFINE_SPINLOCK(xplock);
static void xp_set(pid_t tgid, unsigned long va){
	int i, free=-1; unsigned long fl;
	spin_lock_irqsave(&xplock,fl);
	for(i=0;i<NXP;i++){ if(xptab[i].tgid==tgid){ xptab[i].va=va; spin_unlock_irqrestore(&xplock,fl); return;} if(free<0&&xptab[i].tgid==0) free=i;}
	if(free>=0){ xptab[free].tgid=tgid; xptab[free].va=va; }
	spin_unlock_irqrestore(&xplock,fl);
}
static unsigned long xp_get(pid_t tgid){
	int i; unsigned long va=0, fl;
	spin_lock_irqsave(&xplock,fl);
	for(i=0;i<NXP;i++) if(xptab[i].tgid==tgid){ va=xptab[i].va; break; }
	spin_unlock_irqrestore(&xplock,fl);
	return va;
}

/* v4.18c: 유저가 자기 코드(CallExitHook)를 dcache로 패치한 뒤, EL0 icache op이 이 커널서
 * SIGILL이므로 커널(EL1)에 icache flush를 요청한다. caches_clean_inval_user_pou는 락/슬립
 * 없는 캐시 유지 명령이라 kprobe(atomic) 문맥서 안전. */
extern void caches_clean_inval_pou(unsigned long start, unsigned long end);
static unsigned long flush_hits;
module_param(flush_hits, ulong, 0444);

static int prctl_pre(struct kprobe *p, struct pt_regs *kregs)
{
	struct pt_regs *u = (struct pt_regs *)kregs->regs[0]; /* __arm64_sys_prctl 래퍼 */
	if (!uid_allowed() || IS_ERR_OR_NULL(u))
		return 0;
	if ((unsigned int)u->regs[0] == 0x58504bU) {          /* 0x58504b: xpark 등록 */
		xp_set(current->tgid, u->regs[1]);
		xpark_last = u->regs[1];
		pr_info("hide_kmod: xpark set tgid=%d va=0x%lx (comm=%s)\n",
			current->tgid, u->regs[1], current->comm);
	} else if ((unsigned int)u->regs[0] == 0x58504cU) {   /* 0x58504c: icache flush 요청 */
		unsigned long a = u->regs[1];
		caches_clean_inval_pou(a, a + 64);
		flush_hits++;
		if (flush_hits <= 8)
			pr_info("hide_kmod: icache flush @0x%lx (comm=%s)\n", a, current->comm);
	}
	return 0;
}
static struct kprobe kp_prctl = {
	.symbol_name	= "__arm64_sys_prctl",
	.pre_handler	= prctl_pre,
};

static int pw_dbg;
module_param(pw_dbg, int, 0644);
static ulong pw_dbg_n;
static int fsf_pre(struct kprobe *p, struct pt_regs *kregs)
{
	int sig = (int)kregs->regs[0];
	unsigned long addr = kregs->regs[2];   /* force_sig_fault(sig, code, addr) */
	struct pt_regs *u;
	unsigned long xv;

	if (pw_dbg && pw_dbg_n < 50) {
		pw_dbg_n++;
		pr_info("PWDBG fsf sig=%d addr=0x%lx tgid=%d comm=%s\n",
			sig, addr, current->tgid, current->comm);
	}

	/* v4.26: 페이지 트리프와이어 — 감시 페이지 쓰기 폴트는 통과+로깅 */
	if (pagewatch && pw_mm && current->tgid == (pid_t)pagewatch_pid &&
	    addr >= pw_page && addr < pw_page + PAGE_SIZE) {
		/* u는 아래에서 세팅되므로 여기서 직접 취득 */
		struct pt_regs *uu = task_pt_regs(current);
		unsigned long wpc = uu ? uu->pc : 0;
		pagewatch_hits++;
		pwtail_pc[pwtail_idx] = wpc;
		if (++pwtail_idx >= 256) { pwtail_idx = 0; pwtail_wrapped = 1; }
		if ((pagewatch_hits & 0x3F) == 1)
			pr_info("PW #%lu pc=0x%lx comm=%s tid=%d\n", pagewatch_hits, wpc, current->comm, current->pid);
		pw_pte_rw(current->mm, pw_page, 1);           /* 쓰기 허용 */
		mod_delayed_work(system_wq, &pw_work, msecs_to_jiffies(2));  /* 2ms 후 재보호 */
		kregs->pc = kregs->regs[30];                   /* 시그널 스킵 */
		kregs->regs[0] = 0;
		return 1;
	}
	if (!segv_recover || !uid_allowed())
		return 0;
	if (sig != 11 && sig != 4 && sig != 7 && sig != 6)   /* SEGV/ILL/BUS/ABRT */
		return 0;
	u = task_pt_regs(current);
	if (!u)
		return 0;
	/* 자폭 시그니처: 유저 PC(명령abort) 또는 fault addr(data abort)이 저주소(null 점프/접근) */
	if (u->pc >= 0x10000UL && addr >= 0x10000UL)
		return 0;
	xv = xp_get(current->tgid);
	if (!xv)
		return 0;
	u->pc = xv;                                          /* faulting 스레드를 park로 */
	segv_recover_hits++;
	if (segv_recover_hits <= 20)
		pr_info("hide_kmod: SELF-DESTRUCT recovered #%lu comm=%s sig=%d addr=0x%lx→park\n",
			segv_recover_hits, current->comm, sig, addr);
	kregs->pc = kregs->regs[30];   /* force_sig_fault 즉시 리턴(시그널 미발생) */
	kregs->regs[0] = 0;
	return 1;
}
static struct kprobe kp_fsf = {
	.symbol_name	= "force_sig_fault",
	.pre_handler	= fsf_pre,
};

/* v4.18b: 가드가 raw syscall(exit_group)로 자폭(libc exit·fault 우회) → 표적 uid의
 * exit_group을 park로 리다이렉트해 프로세스 생존. (legit 종료도 park되나 분석 목적상 허용;
 * segv_recover=0으로 끌 수 있음.) */
static unsigned long eg_hits;
module_param(eg_hits, ulong, 0444);
static int eg_pre(struct kprobe *p, struct pt_regs *kregs)
{
	struct pt_regs *u;
	unsigned long xv;
	if (!segv_recover || !uid_allowed())
		return 0;
	xv = xp_get(current->tgid);
	if (!xv)
		return 0;
	u = task_pt_regs(current);
	if (!u)
		return 0;
	u->pc = xv;                 /* exit_group 호출 스레드를 park로 */
	eg_hits++;
	if (eg_hits <= 20)
		pr_info("hide_kmod: exit_group→park #%lu comm=%s tid=%d\n",
			eg_hits, current->comm, current->pid);
	kregs->pc = kregs->regs[30];   /* 시스콜 본문 스킵 */
	kregs->regs[0] = 0;
	return 1;
}
static struct kprobe kp_eg = {
	.symbol_name	= "__arm64_sys_exit_group",
	.pre_handler	= eg_pre,
};

static int __init hide_init(void)
{
	int ret = register_kretprobe(&kp_getname);

	if (ret) {
		pr_err("hide_kmod: getname_flags failed: %d\n", ret);
		return ret;
	}
	ret = register_kretprobe(&kp_dpath);
	if (ret) {
		pr_err("hide_kmod: d_path failed: %d\n", ret);
		unregister_kretprobe(&kp_getname);
		return ret;
	}
	ret = register_kretprobe(&kp_faccessat);
	if (ret) {
		pr_err("hide_kmod: do_faccessat failed: %d\n", ret);
		unregister_kretprobe(&kp_dpath);
		unregister_kretprobe(&kp_getname);
		return ret;
	}
	ret = register_kretprobe(&kp_statx);
	if (ret)
		pr_err("hide_kmod: vfs_statx failed: %d (stat 계열 일부 미커버)\n", ret);
	ret = register_kretprobe(&kp_fstatat);
	if (ret)
		pr_err("hide_kmod: vfs_fstatat failed: %d\n", ret);
	ret = register_kprobe(&kp_ksig);
	if (ret)
		pr_err("hide_kmod: ksig failed: %d\n", ret);
	ret = register_kprobe(&kp_pvm);
	if (ret)
		pr_err("hide_kmod: pvm-block failed: %d\n", ret);
	ret = register_kprobe(&kp_sc);
	if (ret)
		pr_err("hide_kmod: safecopy failed: %d\n", ret);
	ret = register_kprobe(&kp_svc);
	if (ret)
		pr_err("hide_kmod: svc-exitblk failed: %d\n", ret);
	ret = register_kprobe(&kp_tgk);
	if (ret)
		pr_err("hide_kmod: tgkill-abrt failed: %d\n", ret);
	ret = register_kprobe(&kp_fault);
	if (ret)
		pr_err("hide_kmod: faultdump failed: %d\n", ret);
	/* v4.14b: rsig_dump_en=1 시에만 동작(기본 OFF). BRK 문맥 oops 이력 있음 —
	 * 활성 시 게스트 불안정 가능성을 알고 켤 것. */
	ret = register_kprobe(&kp_rsig);
	if (ret)
		pr_err("hide_kmod: rsigdump failed: %d\n", ret);
	ret = register_kprobe(&kp_reboot);
	if (ret)
		pr_err("hide_kmod: reboot-block failed: %d\n", ret);
	ret = register_kprobe(&kp_sigact);
	if (ret)
		pr_err("hide_kmod: sigact failed: %d\n", ret);
	ret = register_kprobe(&kp_sfi);
	if (ret)
		pr_err("hide_kmod: sigframe-in failed: %d\n", ret);
	ret = register_kprobe(&kp_sfo);
	if (ret)
		pr_err("hide_kmod: sigframe-out failed: %d\n", ret);
	ret = register_kretprobe(&kp_uname);
	if (ret)
		pr_err("hide_kmod: uname failed: %d\n", ret);
	ret = register_kretprobe(&kp_getdents);
	if (ret) {
		pr_err("hide_kmod: getdents64 failed: %d\n", ret);
		unregister_kretprobe(&kp_getname);
		unregister_kretprobe(&kp_dpath);
		unregister_kretprobe(&kp_faccessat);
		unregister_kretprobe(&kp_statx);
		unregister_kretprobe(&kp_fstatat);
		return ret;
	}

	/* v4.17: mrs MIDR_EL1 에뮬 위장 — 비치명(실패해도 나머지 유지) */
	ret = register_kretprobe(&kp_mrs);
	if (ret)
		pr_err("hide_kmod: mrs(do_emulate_mrs) failed: %d\n", ret);
	else
		pr_info("hide_kmod: mrs MIDR_EL1 위장 armed (fake=%#lx)\n",
			(unsigned long)MRS_MIDR_FAKE);

	/* v4.18: 자폭 커널 복구 — 비치명 */
	ret = register_kprobe(&kp_prctl);
	if (ret) pr_err("hide_kmod: prctl kprobe failed: %d\n", ret);
	ret = register_kprobe(&kp_fsf);
	if (ret) pr_err("hide_kmod: force_sig_fault kprobe failed: %d\n", ret);
	else pr_info("hide_kmod: SELF-DESTRUCT recovery armed (force_sig_fault)\n");
	ret = register_kprobe(&kp_eg);
	if (ret) pr_err("hide_kmod: exit_group kprobe failed: %d\n", ret);
	else pr_info("hide_kmod: exit_group→park armed\n");

	/* v4.20: maps 내용필터 — 비치명 */
	ret = register_kprobe(&kp_showmap);
	if (ret) pr_err("hide_kmod: show_map_vma kprobe failed: %d\n", ret);
	else pr_info("hide_kmod v4.20: maps content-filter armed (show_map_vma)\n");

	/* v4.21: ioctl 트레이스 — 비치명 */
	ret = register_kprobe(&kp_ioctl);
	if (ret) pr_err("hide_kmod: ioctl kprobe failed: %d\n", ret);
	else pr_info("hide_kmod v4.21: ioctl trace armed (__arm64_sys_ioctl)\n");

	/* v4.3 utsname 치환은 철회됨(2026-09-21): 적재 직후 게스트 재부팅 + "no symbol version
	 * for module_layout" — 빌드 환경 심볼버전 불일치 상태에서 init_uts_ns 쓰기가 메모리
	 * 손상을 일으킨 추정. uname 채널은 미해결 과제로 FINDINGS에 기록. */
	ret = register_kprobe(&kp_wpp);
	if (ret) pr_err("hide_kmod: do_wp_page kprobe failed: %d\n", ret);
	else pr_info("hide_kmod v4.27: pagewatch COW tripwire armed (do_wp_page)\n");

	/* v4.22a §161: vdso 스푸핑 상시 워커 — 플래그 OFF면 no-op. page 주소는 userspace가
	 * /proc/kallsyms의 vdso_data_store를 vdso_page_addr로 전달 (커널측 심볼해결 데드락 방지). */
	INIT_DELAYED_WORK(&vdso_dw, vdso_work_fn);
	queue_delayed_work(system_wq, &vdso_dw, msecs_to_jiffies(100));
	pr_info("hide_kmod v4.22a: armed (nuid=%d) + vdso worker (page=0x%lx)\n",
		n_target_uids, vdso_page_addr);

	pr_info("hide_kmod v4.17: armed (nuid=%d, deny+redirect+acc-stat+getdents+dpath+mrs 필터)\n",
		n_target_uids);
	return 0;
}

static void __exit hide_exit(void)
{
	unregister_kretprobe(&kp_getname);
	unregister_kretprobe(&kp_dpath);
	unregister_kretprobe(&kp_faccessat);
	unregister_kretprobe(&kp_statx);
	unregister_kretprobe(&kp_fstatat);
	unregister_kretprobe(&kp_uname);
	unregister_kprobe(&kp_ksig);
	unregister_kprobe(&kp_fault);
	unregister_kprobe(&kp_rsig);
	unregister_kprobe(&kp_reboot);
	unregister_kprobe(&kp_sigact);
	unregister_kprobe(&kp_sfi);
	unregister_kprobe(&kp_sfo);
	unregister_kretprobe(&kp_getdents);
	unregister_kretprobe(&kp_mrs);
	unregister_kprobe(&kp_prctl);
	unregister_kprobe(&kp_fsf);
	unregister_kprobe(&kp_eg);
	unregister_kprobe(&kp_showmap);
	unregister_kprobe(&kp_ioctl);
	unregister_kprobe(&kp_wpp);
	cancel_delayed_work_sync(&vdso_dw);
	if (hwbp_ev)
		perf_event_release_kernel(hwbp_ev);
	pr_info("hide_kmod v4.18: removed (nmissed=%d, mrs_hits=%lu, segv_recover=%lu)\n",
		kp_getname.nmissed, mrs_midr_hits, segv_recover_hits);
}

module_init(hide_init);
module_exit(hide_exit);
MODULE_LICENSE("GPL");
MODULE_DESCRIPTION("AppSuit 탐지 무화 v3 — getname_flags 커널쪽 deny+redirect (kretprobe)");
