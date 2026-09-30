/* PIE ARM64 native toy for Android (static-pie musl). Prints target_function's
 * RUNTIME address (PIE/ASLR-relocated), then loops calling it so an outer QEMU
 * HVF hardware breakpoint on that userspace VA hits — proving exact HW debugging
 * of an Android native EL0 process (the Toss libea56 case). */
#include <unistd.h>
#include <stdint.h>
#include <stdio.h>

__attribute__((noinline)) uint64_t target_function(uint64_t a, uint64_t b)
{
    volatile uint64_t x = a + b;          /* <-- HW breakpoint target insn */
    return x ^ 0x12345678ULL;
}

int main(void)
{
    dprintf(1, "TOYANDROID target_function=%p pid=%d\n",
            (void *)&target_function, (int)getpid());
    uint64_t acc = 0, i = 1;
    for (;;) { acc = target_function(acc, i); i++; if (!i) i = 1; }
    return 0;
}
