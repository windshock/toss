// vdso_check.c — vvar 데이터 페이지의 mult/shift 출력 (§161 스푸핑 검증용, frida 불필요)
// vvar는 [vdso] 코드 페이지 직전 페이지(arm64 5.15: vvar 2p + vdso 1p — vdso_base-2p가 데이터).
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <fcntl.h>
#include <unistd.h>
int main(void) {
  int fd = open("/proc/self/auxv", O_RDONLY);
  if (fd < 0) { perror("auxv"); return 1; }
  unsigned long pairs[64][2]; int n = 0;
  while (n < 64) {
    ssize_t r = read(fd, pairs[n], 16);
    if (r != 16) break;
    if (pairs[n][0] == 0) break;
    n++;
  }
  close(fd);
  unsigned long at_sysinfo = 0;
  for (int i = 0; i < n; i++)
    if (pairs[i][0] == 33) at_sysinfo = pairs[i][1]; // AT_SYSINFO_EHDR
  if (!at_sysinfo) { printf("no AT_SYSINFO_EHDR\n"); return 1; }
  // [vdso] r-xp 직전: [vvar](2페이지). 데이터 페이지 = vdso_base - 0x2000
  unsigned long vvar = at_sysinfo - 0x2000;
  volatile unsigned int *p = (volatile unsigned int *)vvar;
  printf("vdso=0x%lx vvar=0x%lx\n", at_sysinfo, vvar);
  printf("HRES: seq=%u mode=%d mult=%u shift=%u\n", p[0], (int)p[1], p[6], p[7]);
  printf("RAW : seq=%u mode=%d mult=%u shift=%u\n", *(volatile unsigned int*)(vvar+240),
         *(volatile int*)(vvar+240+4), *(volatile unsigned int*)(vvar+240+24), *(volatile unsigned int*)(vvar+240+28));
  return 0;
}
