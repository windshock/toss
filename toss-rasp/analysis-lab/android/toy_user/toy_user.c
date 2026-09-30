/* Static ARM64 Linux userspace toy — runs as PID 1 (/init) in a minimal
 * initramfs. Loops calling target_function so an OUTER QEMU HVF hardware
 * breakpoint on target_function's userspace VA hits repeatedly. This validates
 * the real unknown (§15/§16): a whole-system HVF HW bp landing on a specific
 * EL0 userspace process's code inside a full-MMU Linux guest (not bare-metal).
 *
 * Also writes target_function's runtime address to /dev/console (if available)
 * so we can confirm the objdump VA == runtime VA (non-PIE => fixed).
 */
#include <stdint.h>

static long sys_write(int fd, const void *buf, unsigned long n)
{
    register long x8 __asm__("x8") = 64; /* __NR_write */
    register long x0 __asm__("x0") = fd;
    register long x1 __asm__("x1") = (long)buf;
    register long x2 __asm__("x2") = n;
    __asm__ volatile("svc #0" : "+r"(x0) : "r"(x8), "r"(x1), "r"(x2) : "memory");
    return x0;
}

__attribute__((noinline)) uint64_t target_function(uint64_t a, uint64_t b)
{
    volatile uint64_t x = a + b;   /* <-- HW breakpoint target */
    return x ^ 0x12345678ULL;
}

static void put_hex(uint64_t v)
{
    char buf[19]; int i;
    buf[0] = '0'; buf[1] = 'x';
    for (i = 0; i < 16; i++)
        buf[2 + i] = "0123456789abcdef"[(v >> ((15 - i) * 4)) & 0xf];
    buf[18] = '\n';
    sys_write(1, buf, 19);
}

void _start(void)
{
    /* announce the runtime address of target_function on the console */
    sys_write(1, "TOYUSER target_function=", 24);
    put_hex((uint64_t)&target_function);

    uint64_t acc = 0, i = 1;
    for (;;) {                      /* loop so the bp hits many times */
        acc = target_function(acc, i);
        i++;
        if (i == 0) i = 1;
    }
}
