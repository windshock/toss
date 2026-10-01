#include <stdio.h>
#include <stdint.h>
#include <unistd.h>
static volatile uint64_t g_target = 0;
__attribute__((noinline)) void spin(volatile uint64_t *t) {
    for (int i = 0; i < 20000; i++) { *t = (uint64_t)i; }
}
int main(void) {
    printf("target=%p spin=%p pid=%d\n", (void*)&g_target, (void*)&spin, (int)getpid());
    fflush(stdout);
    for (int r = 0; r < 200; r++) { spin(&g_target); usleep(20000); }
    return 0;
}
