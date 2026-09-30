/* ANALYSIS MODE: minimal QEMU TCG plugin — basic-block trace filtered to a
 * target address range. Demonstrates non-invasive execution instrumentation
 * under upstream QEMU's stable plugin API (no PANDA needed for this primitive).
 *
 * build (macOS):
 *   clang -shared -fPIC -I/opt/homebrew/include trace.c -o libtrace.so \
 *         -Wl,-undefined,dynamic_lookup
 * use:
 *   qemu-system-aarch64 ... -accel tcg \
 *     -plugin ./libtrace.so,lo=0x40080000,hi=0x40080020,out=/tmp/bb.txt
 */
#include <stdio.h>
#include <stdint.h>
#include <string.h>
#include <stdlib.h>
#include <inttypes.h>
#include <qemu-plugin.h>

QEMU_PLUGIN_EXPORT int qemu_plugin_version = QEMU_PLUGIN_VERSION;

static uint64_t g_lo = 0, g_hi = ~0ULL;
static uint64_t g_count = 0, g_maxlog = 64;
static FILE *g_out;

static void tb_exec(unsigned int vcpu, void *ud)
{
    uint64_t pc = (uint64_t)ud;
    if (pc >= g_lo && pc < g_hi) {
        if (g_count < g_maxlog) {
            fprintf(g_out, "BB %#" PRIx64 "\n", pc);
            fflush(g_out);
        }
        g_count++;
    }
}

static void tb_trans(qemu_plugin_id_t id, struct qemu_plugin_tb *tb)
{
    uint64_t pc = qemu_plugin_tb_vaddr(tb);
    qemu_plugin_register_vcpu_tb_exec_cb(tb, tb_exec, QEMU_PLUGIN_CB_NO_REGS,
                                         (void *)pc);
}

static void atexit_cb(qemu_plugin_id_t id, void *p)
{
    fprintf(g_out, "TOTAL_BB_IN_RANGE %" PRIu64 "\n", g_count);
    fflush(g_out);
}

QEMU_PLUGIN_EXPORT int qemu_plugin_install(qemu_plugin_id_t id,
                                           const qemu_info_t *info,
                                           int argc, char **argv)
{
    g_out = stderr;
    for (int i = 0; i < argc; i++) {
        if (!strncmp(argv[i], "lo=", 3))       g_lo = strtoull(argv[i] + 3, 0, 0);
        else if (!strncmp(argv[i], "hi=", 3))  g_hi = strtoull(argv[i] + 3, 0, 0);
        else if (!strncmp(argv[i], "max=", 4)) g_maxlog = strtoull(argv[i] + 4, 0, 0);
        else if (!strncmp(argv[i], "out=", 4)) g_out = fopen(argv[i] + 4, "w");
    }
    if (!g_out) g_out = stderr;
    fprintf(g_out, "target_trace: range [%#" PRIx64 ",%#" PRIx64 ")\n", g_lo, g_hi);
    fflush(g_out);
    qemu_plugin_register_vcpu_tb_trans_cb(id, tb_trans);
    qemu_plugin_register_atexit_cb(id, atexit_cb, NULL);
    return 0;
}
