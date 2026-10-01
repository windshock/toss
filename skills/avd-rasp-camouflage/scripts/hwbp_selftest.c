#include <stdio.h>
#include <stdint.h>
#include <unistd.h>
static volatile uint64_t g_target = 0;
int main(void) {
    printf("target=%p pid=%d\n", (void*)&g_target, (int)getpid());
    fflush(stdout);
    for (int i = 0; i < 5000; i++) { g_target = (uint64_t)i; usleep(1000); }
    printf("done val=%lu\n", (unsigned long)g_target);
    return 0;
}
