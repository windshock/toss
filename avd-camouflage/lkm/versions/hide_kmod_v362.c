// =============================================================================
// hide_kmod.c v3 — getname_flags kretprobe 경로 차단(deny) + 위장 리다이렉트(redirect)
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
#include <linux/uaccess.h>  /* strncpy_from_user */

/* 다중 uid 지원 (v3.4) — insmod target_uids=10179,10180,10181 / 런타임 변경 가능.
 * 요소를 안 주면(n_target_uids==0) 전체 적용 — 주의해서 사용. */
static unsigned int target_uids[8] = { 10179, 0, 0, 0, 0, 0, 0, 0 };
static int n_target_uids;
module_param_array(target_uids, uint, &n_target_uids, 0644);

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

static int str_ends(const char *p, const char *suf)
{
	size_t lp = strlen(p), ls = strlen(suf);
	return lp >= ls && strcmp(p + lp - ls, suf) == 0;
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

	/* 루트 rc 파일 — /init.goldfish.rc, /ueventd.ranchu.rc 등 (AVC 실측:
	 * 엔진이 루트 열거/직접 open으로 탐지). /dev/goldfish* 는 GL 전송로라 예외 */
	if ((strstr(p, "goldfish") || strstr(p, "ranchu")) &&
	    strncmp(p, "/dev/goldfish", 13) != 0)
		return 1;

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

/* "/proc/<digits>/<suffix>" — 자기 tgid는 제외 (자기 자식 가드가 쓰는 경로 보호) */
static int is_other_proc_file(const char *p, const char *suffix)
{
	size_t ls = strlen(suffix);

	if (strncmp(p, "/proc/", 6) != 0)
		return 0;
	p += 6;
	{
		unsigned int v = 0;
		int n = 0;

		while (*p >= '0' && *p <= '9') {
			v = v * 10 + (*p - '0');
			p++;
			n++;
		}
		if (n == 0 || v == current->tgid)
			return 0;
	}
	return strncmp(p, suffix, ls) == 0 && p[ls] == '\0';
}

/* 제자리 재작성 — 원본보다 짧은 경로만 안전 (버퍼가 원본 길이만 확보됨) */
static void redirect(char *name, const char *to)
{
	if (strlen(to) <= strlen(name))
		strcpy(name, to);
}

/* ── kretprobe ───────────────────────────────────────────────────────────── */
static int uid_gate(struct kretprobe_instance *ri, struct pt_regs *regs)
{
	if (!uid_allowed())
		return 1;   /* ret 핸들러 스킵 */
	return 0;
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

	if (path_blocked(name)) {
		name[0] = '/';
		name[1] = 'Z';
		name[2] = '\0';
		return 0;
	}

	/* 자기 정보 → 위장 파일 (셸이 내용 유지) */
	if (proc_self_file(name, "maps")     || proc_self_file(name, "smaps") ||
	    proc_self_file(name, "smaps_rollup"))
		redirect(name, "/dev/.m");
	else if (proc_self_file(name, "status"))
		redirect(name, "/dev/.s");
	else if (proc_self_file(name, "mounts"))
		redirect(name, "/dev/.k");
	else if (is_self_task_comm(name))
		redirect(name, "/dev/.n");
	else if (strcmp(name, "/proc/net/unix") == 0)
		redirect(name, "/dev/.u");
	else if (strcmp(name, "/proc/net/tcp") == 0)
		redirect(name, "/dev/.t");
	else if (strcmp(name, "/proc/misc") == 0)
		redirect(name, "/dev/.mi");   /* goldfish 디바이스 등록 테이블 (§2.20) */
	else if (strncmp(name, "/sys/devices/system/cpu/", 24) == 0 &&
		 (strcmp(name + 24, "online") == 0 || strcmp(name + 24, "present") == 0 ||
		  strcmp(name + 24, "possible") == 0))
		redirect(name, "/dev/.c2");  /* 2코어 → 8코어 위장 (판정 직전 마지막 읽기 실측) */
	else if (strcmp(name, "/proc/cpuinfo") == 0)
		redirect(name, "/dev/.c");
	else if (strcmp(name, "/proc/version") == 0)
		redirect(name, "/dev/.v");
	else if (is_other_proc_file(name, "cmdline") || is_other_proc_file(name, "status"))
		redirect(name, "/dev/.e");

	return 0;
}

static struct kretprobe kp_getname = {
	.kp.symbol_name	= "getname_flags",
	.entry_handler	= uid_gate,
	.handler	= rewrite_ret,
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

static unsigned long gd_filtered, gd_calls;
module_param(gd_filtered, ulong, 0444);
module_param(gd_calls, ulong, 0444);

static int hide_gd_entry(struct kretprobe_instance *ri, struct pt_regs *regs)
{
	struct hide_gd_data *d = (struct hide_gd_data *)ri->data;

	d->buf = 0;
	d->len = 0;
	if (!uid_allowed())
		return 1;
	gd_calls++;
	d->buf = regs->regs[1];   /* user dirent buffer */
	return 0;
}

static int dirent_hidden(const char *name)
{
	if (strstr(name, "goldfish") || strstr(name, "ranchu") ||
	    strstr(name, "qemu"))
		return 1;
	if (name[0] == '.') {
		size_t l = strlen(name);
		if (l == 2 && strchr(".mskutcnev", name[1]))
			return 1;
		if (l == 3 && name[1] == 'm' && name[2] == 'i')
			return 1;
	}
	return 0;
}

static char gd_kbuf[65536];
static DEFINE_SPINLOCK(gd_lock);
static int hide_gd_ret(struct kretprobe_instance *ri, struct pt_regs *regs)
{
	struct hide_gd_data *d = (struct hide_gd_data *)ri->data;
	long total = regs_return_value(regs);
	long off = 0, kept;
	unsigned long flags;

	if (total <= 0 || (unsigned long)total > sizeof(gd_kbuf) || !d->buf)
		return 0;

	spin_lock_irqsave(&gd_lock, flags);
	if (copy_from_user(gd_kbuf, (void __user *)d->buf, total)) {
		spin_unlock_irqrestore(&gd_lock, flags);
		return 0;
	}

	kept = 0;
	off = 0;
	while (off < total) {
		u16 reclen;
		const char *name;

		reclen = *(u16 *)(gd_kbuf + off + 16);
		if (reclen == 0 || off + reclen > total)
			break;
		name = gd_kbuf + off + 19;
		if (dirent_hidden(name)) {
			long tail = total - (off + reclen);
			if (tail > 0)
				memmove(gd_kbuf + off, gd_kbuf + off + reclen, tail);
			total -= reclen;
		} else {
			off += reclen;
		}
	}
	kept = total;
	if (kept && copy_to_user((void __user *)d->buf, gd_kbuf, kept) == 0) {
		if (kept != total)
			gd_filtered++;
		regs_set_return_value(regs, kept);
	}
	spin_unlock_irqrestore(&gd_lock, flags);
	return 0;
}

static struct kretprobe kp_getdents = {
	.kp.symbol_name	= "__arm64_sys_getdents64",
	.entry_handler	= hide_gd_entry,
	.handler	= hide_gd_ret,
	.data_size	= sizeof(struct hide_gd_data),
	.maxactive	= 512,
};

static int __init hide_init(void)
{
	int ret = register_kretprobe(&kp_getname);

	if (ret) {
		pr_err("hide_kmod: getname_flags failed: %d\n", ret);
		return ret;
	}
	ret = register_kretprobe(&kp_faccessat);
	if (ret) {
		pr_err("hide_kmod: do_faccessat failed: %d\n", ret);
		unregister_kretprobe(&kp_getname);
		return ret;
	}
	ret = register_kretprobe(&kp_statx);
	if (ret)
		pr_err("hide_kmod: vfs_statx failed: %d (stat 계열 일부 미커버)\n", ret);
	ret = register_kretprobe(&kp_fstatat);
	if (ret)
		pr_err("hide_kmod: vfs_fstatat failed: %d\n", ret);
	ret = register_kretprobe(&kp_getdents);
	if (ret) {
		pr_err("hide_kmod: getdents64 failed: %d\n", ret);
		unregister_kretprobe(&kp_getname);
		unregister_kretprobe(&kp_faccessat);
		unregister_kretprobe(&kp_statx);
		unregister_kretprobe(&kp_fstatat);
		return ret;
	}

	pr_info("hide_kmod v3.6: armed (nuid=%d, deny+redirect+acc-stat+getdents 필터)\n",
		n_target_uids);
	return 0;
}

static void __exit hide_exit(void)
{
	unregister_kretprobe(&kp_getname);
	unregister_kretprobe(&kp_faccessat);
	unregister_kretprobe(&kp_statx);
	unregister_kretprobe(&kp_fstatat);
	unregister_kretprobe(&kp_getdents);
	pr_info("hide_kmod v3.6: removed (nmissed=%d)\n", kp_getname.nmissed);
}

module_init(hide_init);
module_exit(hide_exit);
MODULE_LICENSE("GPL");
MODULE_DESCRIPTION("AppSuit 탐지 무화 v3 — getname_flags 커널쪽 deny+redirect (kretprobe)");
