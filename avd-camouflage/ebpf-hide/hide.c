// hide.c v3 — 직접 바이트 비교 (배열·루프·.rodata 없음 — raw insns 호환)
struct pt_regs {
    unsigned long long regs[31];
    unsigned long long sp;
    unsigned long long pc;
    unsigned long long pstate;
};
static void *(*bp_rustr)(void *, unsigned long, const void *) = (void *)114;
static long (*bp_wusr)(void *, const void *, unsigned long) = (void *)35;
static unsigned long long (*bp_uidgid)(void) = (void *)15;

#define SEC(x) __attribute__((section(x), used))
SEC("kprobe")
int hide_path(struct pt_regs *ctx) {
    unsigned long long id = bp_uidgid();
    if ((unsigned int)id != 10177)
        return 0;
    char *fname = (char *)ctx->regs[1];
    if (!fname)
        return 0;

    char buf[64];
    bp_rustr(buf, 63, fname);
    int hit = 0;
    if (!hit && (buf[0]=='/' && buf[1]=='s' && buf[2]=='y' && buf[3]=='s' && buf[4]=='t' && buf[5]=='e' && buf[6]=='m' && buf[7]=='/' && buf[8]=='x' && buf[9]=='b' && buf[10]=='i' && buf[11]=='n')) hit = 1; // /system/xbin
    if (!hit && (buf[0]=='/' && buf[1]=='s' && buf[2]=='y' && buf[3]=='s' && buf[4]=='t' && buf[5]=='e' && buf[6]=='m' && buf[7]=='/' && buf[8]=='b' && buf[9]=='i' && buf[10]=='n' && buf[11]=='/' && buf[12]=='s' && buf[13]=='u')) hit = 1; // /system/bin/su
    if (!hit && (buf[0]=='/' && buf[1]=='s' && buf[2]=='y' && buf[3]=='s' && buf[4]=='t' && buf[5]=='e' && buf[6]=='m' && buf[7]=='/' && buf[8]=='b' && buf[9]=='i' && buf[10]=='n' && buf[11]=='/' && buf[12]=='.' && buf[13]=='a' && buf[14]=='o')) hit = 1; // /system/bin/.ao
    if (!hit && (buf[0]=='/' && buf[1]=='s' && buf[2]=='y' && buf[3]=='s' && buf[4]=='t' && buf[5]=='e' && buf[6]=='m' && buf[7]=='/' && buf[8]=='b' && buf[9]=='i' && buf[10]=='n' && buf[11]=='/' && buf[12]=='.' && buf[13]=='e' && buf[14]=='x')) hit = 1; // /system/bin/.ex
    if (!hit && (buf[0]=='/' && buf[1]=='s' && buf[2]=='y' && buf[3]=='s' && buf[4]=='t' && buf[5]=='e' && buf[6]=='m' && buf[7]=='/' && buf[8]=='b' && buf[9]=='i' && buf[10]=='n' && buf[11]=='/' && buf[12]=='f' && buf[13]=='a' && buf[14]=='i')) hit = 1; // /system/bin/fai
    if (!hit && (buf[0]=='/' && buf[1]=='s' && buf[2]=='b' && buf[3]=='i' && buf[4]=='n' && buf[5]=='/' && buf[6]=='s' && buf[7]=='u')) hit = 1; // /sbin/su
    if (!hit && (buf[0]=='/' && buf[1]=='s' && buf[2]=='b' && buf[3]=='i' && buf[4]=='n' && buf[5]=='/' && buf[6]=='m' && buf[7]=='a' && buf[8]=='g' && buf[9]=='i' && buf[10]=='s' && buf[11]=='k')) hit = 1; // /sbin/magisk
    if (!hit && (buf[0]=='/' && buf[1]=='s' && buf[2]=='u' && buf[3]=='/' && buf[4]=='b' && buf[5]=='i' && buf[6]=='n')) hit = 1; // /su/bin
    if (!hit && (buf[0]=='/' && buf[1]=='d' && buf[2]=='a' && buf[3]=='t' && buf[4]=='a' && buf[5]=='/' && buf[6]=='l' && buf[7]=='o' && buf[8]=='c' && buf[9]=='a' && buf[10]=='l' && buf[11]=='/' && buf[12]=='s' && buf[13]=='u')) hit = 1; // /data/local/su
    if (!hit && (buf[0]=='/' && buf[1]=='s' && buf[2]=='y' && buf[3]=='s' && buf[4]=='t' && buf[5]=='e' && buf[6]=='m' && buf[7]=='/' && buf[8]=='a' && buf[9]=='p' && buf[10]=='p' && buf[11]=='/' && buf[12]=='S' && buf[13]=='u' && buf[14]=='p')) hit = 1; // /system/app/Sup
    if (!hit && (buf[0]=='/' && buf[1]=='r' && buf[2]=='e' && buf[3]=='s' && buf[4]=='/' && buf[5]=='s' && buf[6]=='u')) hit = 1; // /res/su
    if (!hit && (buf[0]=='/' && buf[1]=='t' && buf[2]=='e' && buf[3]=='g' && buf[4]=='r' && buf[5]=='a' && buf[6]=='k')) hit = 1; // /tegrak
    if (!hit && (buf[0]=='/' && buf[1]=='s' && buf[2]=='y' && buf[3]=='s' && buf[4]=='t' && buf[5]=='e' && buf[6]=='m' && buf[7]=='/' && buf[8]=='j' && buf[9]=='k' && buf[10]=='h')) hit = 1; // /system/jkh
    if (!hit && (buf[0]=='/' && buf[1]=='m' && buf[2]=='a' && buf[3]=='g' && buf[4]=='i' && buf[5]=='s' && buf[6]=='k')) hit = 1; // /magisk
    if (!hit && (buf[0]=='/' && buf[1]=='d' && buf[2]=='e' && buf[3]=='v' && buf[4]=='/' && buf[5]=='p' && buf[6]=='r' && buf[7]=='o' && buf[8]=='c' && buf[9]=='a')) hit = 1; // /dev/proca
    if (!hit && (buf[0]=='/' && buf[1]=='s' && buf[2]=='y' && buf[3]=='s' && buf[4]=='/' && buf[5]=='c' && buf[6]=='l' && buf[7]=='a' && buf[8]=='s' && buf[9]=='s' && buf[10]=='/' && buf[11]=='p' && buf[12]=='r' && buf[13]=='o' && buf[14]=='c')) hit = 1; // /sys/class/proc
    if (!hit && (buf[0]=='/' && buf[1]=='s' && buf[2]=='y' && buf[3]=='s' && buf[4]=='/' && buf[5]=='d' && buf[6]=='e' && buf[7]=='v' && buf[8]=='i' && buf[9]=='c' && buf[10]=='e' && buf[11]=='s' && buf[12]=='/' && buf[13]=='v' && buf[14]=='i')) hit = 1; // /sys/devices/vi
    if (!hit && (buf[0]=='/' && buf[1]=='d' && buf[2]=='e' && buf[3]=='v' && buf[4]=='/' && buf[5]=='q' && buf[6]=='e' && buf[7]=='m' && buf[8]=='u' && buf[9]=='_' && buf[10]=='p' && buf[11]=='i' && buf[12]=='p' && buf[13]=='e')) hit = 1; // /dev/qemu_pipe
    if (!hit && (buf[0]=='/' && buf[1]=='d' && buf[2]=='e' && buf[3]=='v' && buf[4]=='/' && buf[5]=='g' && buf[6]=='o' && buf[7]=='l' && buf[8]=='d' && buf[9]=='f' && buf[10]=='i' && buf[11]=='s' && buf[12]=='h')) hit = 1; // /dev/goldfish
    if (!hit && (buf[0]=='/' && buf[1]=='s' && buf[2]=='d' && buf[3]=='c' && buf[4]=='a' && buf[5]=='r' && buf[6]=='d' && buf[7]=='/' && buf[8]=='A' && buf[9]=='P' && buf[10]=='P' && buf[11]=='S' && buf[12]=='U' && buf[13]=='I' && buf[14]=='T')) hit = 1; // /sdcard/APPSUIT
    if (!hit && (buf[0]=='/' && buf[1]=='s' && buf[2]=='y' && buf[3]=='s' && buf[4]=='t' && buf[5]=='e' && buf[6]=='m' && buf[7]=='/' && buf[8]=='e' && buf[9]=='t' && buf[10]=='c' && buf[11]=='/' && buf[12]=='m' && buf[13]=='u' && buf[14]=='m')) hit = 1; // /system/etc/mum
    if (!hit && (buf[0]=='/' && buf[1]=='s' && buf[2]=='y' && buf[3]=='s' && buf[4]=='t' && buf[5]=='e' && buf[6]=='m' && buf[7]=='/' && buf[8]=='b' && buf[9]=='i' && buf[10]=='n' && buf[11]=='/' && buf[12]=='n' && buf[13]=='o' && buf[14]=='x')) hit = 1; // /system/bin/nox
    if (!hit && (buf[0]=='/' && buf[1]=='s' && buf[2]=='y' && buf[3]=='s' && buf[4]=='t' && buf[5]=='e' && buf[6]=='m' && buf[7]=='/' && buf[8]=='l' && buf[9]=='i' && buf[10]=='b' && buf[11]=='/' && buf[12]=='l' && buf[13]=='i' && buf[14]=='b' && buf[15]=='g')) hit = 1; // /system/lib/libg
    if (!hit && (buf[0]=='m' && buf[1]=='a' && buf[2]=='g' && buf[3]=='i' && buf[4]=='s' && buf[5]=='k')) hit = 1;
    if (!hit && (buf[1]=='m' && buf[2]=='a' && buf[3]=='g' && buf[4]=='i' && buf[5]=='s' && buf[6]=='k')) hit = 1;
    if (!hit && (buf[2]=='m' && buf[3]=='a' && buf[4]=='g' && buf[5]=='i' && buf[6]=='s' && buf[7]=='k')) hit = 1;
    if (!hit && (buf[3]=='m' && buf[4]=='a' && buf[5]=='g' && buf[6]=='i' && buf[7]=='s' && buf[8]=='k')) hit = 1;
    if (!hit && (buf[4]=='m' && buf[5]=='a' && buf[6]=='g' && buf[7]=='i' && buf[8]=='s' && buf[9]=='k')) hit = 1;
    if (!hit && (buf[5]=='m' && buf[6]=='a' && buf[7]=='g' && buf[8]=='i' && buf[9]=='s' && buf[10]=='k')) hit = 1;
    if (!hit && (buf[6]=='m' && buf[7]=='a' && buf[8]=='g' && buf[9]=='i' && buf[10]=='s' && buf[11]=='k')) hit = 1;
    if (!hit && (buf[7]=='m' && buf[8]=='a' && buf[9]=='g' && buf[10]=='i' && buf[11]=='s' && buf[12]=='k')) hit = 1;
    if (!hit && (buf[8]=='m' && buf[9]=='a' && buf[10]=='g' && buf[11]=='i' && buf[12]=='s' && buf[13]=='k')) hit = 1;
    if (!hit && (buf[9]=='m' && buf[10]=='a' && buf[11]=='g' && buf[12]=='i' && buf[13]=='s' && buf[14]=='k')) hit = 1;
    if (!hit && (buf[10]=='m' && buf[11]=='a' && buf[12]=='g' && buf[13]=='i' && buf[14]=='s' && buf[15]=='k')) hit = 1;
    if (!hit && (buf[11]=='m' && buf[12]=='a' && buf[13]=='g' && buf[14]=='i' && buf[15]=='s' && buf[16]=='k')) hit = 1;
    if (!hit && (buf[12]=='m' && buf[13]=='a' && buf[14]=='g' && buf[15]=='i' && buf[16]=='s' && buf[17]=='k')) hit = 1;
    if (!hit && (buf[13]=='m' && buf[14]=='a' && buf[15]=='g' && buf[16]=='i' && buf[17]=='s' && buf[18]=='k')) hit = 1;
    if (!hit && (buf[14]=='m' && buf[15]=='a' && buf[16]=='g' && buf[17]=='i' && buf[18]=='s' && buf[19]=='k')) hit = 1;
    if (!hit && (buf[15]=='m' && buf[16]=='a' && buf[17]=='g' && buf[18]=='i' && buf[19]=='s' && buf[20]=='k')) hit = 1;
    if (!hit && (buf[16]=='m' && buf[17]=='a' && buf[18]=='g' && buf[19]=='i' && buf[20]=='s' && buf[21]=='k')) hit = 1;
    if (!hit && (buf[17]=='m' && buf[18]=='a' && buf[19]=='g' && buf[20]=='i' && buf[21]=='s' && buf[22]=='k')) hit = 1;
    if (!hit && (buf[18]=='m' && buf[19]=='a' && buf[20]=='g' && buf[21]=='i' && buf[22]=='s' && buf[23]=='k')) hit = 1;
    if (!hit && (buf[19]=='m' && buf[20]=='a' && buf[21]=='g' && buf[22]=='i' && buf[23]=='s' && buf[24]=='k')) hit = 1;
    if (!hit && (buf[20]=='m' && buf[21]=='a' && buf[22]=='g' && buf[23]=='i' && buf[24]=='s' && buf[25]=='k')) hit = 1;
    if (!hit && (buf[21]=='m' && buf[22]=='a' && buf[23]=='g' && buf[24]=='i' && buf[25]=='s' && buf[26]=='k')) hit = 1;
    if (!hit && (buf[22]=='m' && buf[23]=='a' && buf[24]=='g' && buf[25]=='i' && buf[26]=='s' && buf[27]=='k')) hit = 1;
    if (!hit && (buf[23]=='m' && buf[24]=='a' && buf[25]=='g' && buf[26]=='i' && buf[27]=='s' && buf[28]=='k')) hit = 1;
    if (!hit && (buf[24]=='m' && buf[25]=='a' && buf[26]=='g' && buf[27]=='i' && buf[28]=='s' && buf[29]=='k')) hit = 1;
    if (!hit && (buf[25]=='m' && buf[26]=='a' && buf[27]=='g' && buf[28]=='i' && buf[29]=='s' && buf[30]=='k')) hit = 1;
    if (!hit && (buf[26]=='m' && buf[27]=='a' && buf[28]=='g' && buf[29]=='i' && buf[30]=='s' && buf[31]=='k')) hit = 1;
    if (!hit && (buf[27]=='m' && buf[28]=='a' && buf[29]=='g' && buf[30]=='i' && buf[31]=='s' && buf[32]=='k')) hit = 1;
    if (!hit && (buf[28]=='m' && buf[29]=='a' && buf[30]=='g' && buf[31]=='i' && buf[32]=='s' && buf[33]=='k')) hit = 1;
    if (!hit && (buf[29]=='m' && buf[30]=='a' && buf[31]=='g' && buf[32]=='i' && buf[33]=='s' && buf[34]=='k')) hit = 1;
    if (!hit && (buf[30]=='m' && buf[31]=='a' && buf[32]=='g' && buf[33]=='i' && buf[34]=='s' && buf[35]=='k')) hit = 1;
    if (!hit && (buf[31]=='m' && buf[32]=='a' && buf[33]=='g' && buf[34]=='i' && buf[35]=='s' && buf[36]=='k')) hit = 1;
    if (!hit && (buf[32]=='m' && buf[33]=='a' && buf[34]=='g' && buf[35]=='i' && buf[36]=='s' && buf[37]=='k')) hit = 1;
    if (!hit && (buf[33]=='m' && buf[34]=='a' && buf[35]=='g' && buf[36]=='i' && buf[37]=='s' && buf[38]=='k')) hit = 1;

    if (hit) {
        char rep[3];
        rep[0] = '/';
        rep[1] = 'Z';
        rep[2] = 0;
        bp_wusr(fname, rep, 3);
    }
    return 0;
}
char _license[] SEC("license") = "GPL";
