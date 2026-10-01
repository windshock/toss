// timing_bench.c — 에뮬레이터 vs 실기기 타이밍 지문 (ARM64 네이티브)
// 측정: ① BogoMIPS(루프 ns/iter) ② 메모리 레이턴시 ③ 시스템콜 ns/op ④ CNTVCT/CNTFRQ ⑤ 분기 예측
#include <stdio.h>
#include <time.h>
#include <stdint.h>
#include <string.h>
#include <unistd.h>
#include <sys/syscall.h>

static inline uint64_t cntvct(void) {
    uint64_t v; asm volatile("mrs %0, cntvct_el0" : "=r"(v)); return v;
}
static inline uint64_t cntfrq(void) {
    uint64_t v; asm volatile("mrs %0, cntfrq_el0" : "=r"(v)); return v;
}
static double ns(void) {
    struct timespec ts; clock_gettime(CLOCK_MONOTONIC, &ts);
    return ts.tv_sec * 1e9 + ts.tv_nsec;
}
int main() {
    uint64_t freq = cntfrq();
    printf("CNTFRQ_EL0 = %llu (%.2f MHz)\n", (unsigned long long)freq, freq / 1e6);
    uint64_t c0 = cntvct(); double t0 = ns();
    for (volatile int i = 0; i < 1000000; i++);
    uint64_t c1 = cntvct(); double t1 = ns();
    printf("CNTVCT delta=%llu (%.3f ms wall) — 일치=%.3f\n",
           (unsigned long long)(c1-c0), (t1-t0)/1e6,
           ((double)(c1-c0)/freq*1e9) / (t1-t0));

    // ① BogoMIPS
    volatile int x = 0;
    t0 = ns();
    for (int i = 0; i < 50000000; i++) x += i;
    t1 = ns();
    printf("① 루프 50M iter: %.1f ms (%.2f ns/iter)\n", (t1-t0)/1e6, (t1-t0)/50e6);

    // ② 메모리 레이턴시 — volatile 포인터 배열 완전 역참조
    static volatile char *ptrs[64];
    static char pages[64][4096];
    for (int i = 0; i < 64; i++) ptrs[i] = pages[i];
    volatile char *vp = ptrs[0];
    t0 = ns();
    for (int i = 0; i < 1000000; i++) { vp = ptrs[(i * 7) & 63]; *vp; }
    t1 = ns();
    printf("② 랜덤페이지 역참조 1M: %.1f ms (%.2f ns/op)\n", (t1-t0)/1e6, (t1-t0)/1e6);

    // ③ 시스템콜(getpid)
    t0 = ns();
    for (int i = 0; i < 100000; i++) syscall(SYS_getpid);
    t1 = ns();
    printf("③ getpid 100K: %.1f ms (%.0f ns/call)\n", (t1-t0)/1e6, (t1-t0)/1e5);

    // ④ 분기 예측 (패턴 있음 vs 무작위)
    static int pat[4096], rnd[4096];
    unsigned seed = 12345;
    for (int i = 0; i < 4096; i++) { pat[i] = i & 1; seed = seed*1103515245+12345; rnd[i] = (seed>>16)&1; }
    volatile int s1 = 0, s2 = 0; volatile int *vp1=pat, *vp2=rnd;
    t0 = ns();
    for (int i = 0; i < 10000000; i++) s1 += vp1[i & 4095];
    t1 = ns();
    double t_pat = t1-t0;
    t0 = ns();
    for (int i = 0; i < 10000000; i++) s2 += vp2[i & 4095];
    t1 = ns();
    double t_rnd = t1-t0;
    printf("④ 분기예측: 패턴 %.1fms vs 무작위 %.1fms (비율 %.2fx)\n", t_pat/1e6, t_rnd/1e6, t_rnd/t_pat);

    // ⑤ 벡터(NEON) 처리량 — uint64×2 (C 레벨, 컴파일러가 NEON 생성)
    volatile uint64_t va[2] __attribute__((aligned(16))) = {1,2}, vb[2] __attribute__((aligned(16))) = {3,4}, vr[2] __attribute__((aligned(16)));
    t0 = ns();
    for (int i = 0; i < 10000000; i++) { vr[0]=va[0]+vb[0]; vr[1]=va[1]+vb[1]; }
    t1 = ns();
    printf("⑤ u64 pair add 10M: %.1f ms (%.2f ns/op)\n", (t1-t0)/1e6, (t1-t0)/1e7);

    printf("\n== 실기기 SM-S916N(Cortex-X3@3.2GHz) 참고치 ==\n");
    printf("① ~0.31 ns/iter(3.2GHz) ② ~1.2 ns/op(L1) ③ ~200-400 ns ④ ~1.5-2.5x ⑤ ~0.31 ns/op\n");
    return 0;
}
