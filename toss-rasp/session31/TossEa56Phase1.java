package com.github.unidbg.android;

import com.github.unidbg.AndroidEmulator;
import com.github.unidbg.Module;
import com.github.unidbg.linux.android.AndroidEmulatorBuilder;
import com.github.unidbg.linux.android.AndroidResolver;
import com.github.unidbg.memory.Memory;


import java.io.File;
import unicorn.Arm64Const;

/**
 * 31차 Phase 1 — StringEncryption 후보(0x38718 LDAXR guard 진입부) 직접 실행.
 * 실행 전/후 모듈 메모리 diff로 복호화 plaintext를 잡는다(핸드오프 최우선 milestone).
 * 시그니처 없는 offset 실행: PC 직접 세팅 + x30=MAGIC 반환 트랩.
 */
public class TossEa56Phase1 {
    static final String SO =
        "/Users/1004276/Downloads/AppSuit/avd-camouflage/analysis/toss-rasp/libea56.so";
    static final long ENTRY_OFF = 0x38718L;   // LDAXR guard 진입부(함수 시작 추정)
    static final long MAGIC = 0x77777000L;    // 반환 트랩 주소(매핑 없음)

    public static void main(String[] args) throws Exception {
        long entryOff = args.length > 0 ? Long.parseLong(args[0], 16) : ENTRY_OFF;
        AndroidEmulator emulator = AndroidEmulatorBuilder.for64Bit()
                .setProcessName("viva.republica.toss").build();
        Memory memory = emulator.getMemory();
        memory.setLibraryResolver(new AndroidResolver(21));
        Module module = memory.load(new File(SO), false);
        long base = module.base;
        System.out.println("[P1] base=0x" + Long.toHexString(base) + " entry=+0x" + Long.toHexString(entryOff));

        // 32차: 스택 재배치 — 복호 루틴이 sp+0x1c8+idx 버퍼에 쓰므로 넉넉한 수동 매핑으로.
        long STACK = base + 0x3000000L;
        emulator.getBackend().mem_map(STACK, 0x100000, 3 /* PROT_R|W */);
        long SP = STACK + 0xF0000;
        emulator.getBackend().reg_write(Arm64Const.UC_ARM64_REG_SP, SP);
        System.out.println("[P1] stack remap: SP=0x" + Long.toHexString(SP));
        byte[] before = emulator.getBackend().mem_read(base, (int) module.size);
        byte[] stackBefore = emulator.getBackend().mem_read(SP - 0x1000, 0x11000);

        // 스택 포인터를 쓰기 가능한 곳에 (unidbg가 이미 세팅) — 그대로 사용
        // x30 = MAGIC, PC = entry
        com.github.unidbg.arm.backend.Backend backend = emulator.getBackend();
        backend.reg_write(Arm64Const.UC_ARM64_REG_LR, MAGIC);
        try {
            backend.emu_start(base + entryOff, MAGIC, 5_000_000L /*5s*/, 0);
            System.out.println("[P1] 실행 정상 종료(PC=MAGIC 도달)");
        } catch (Exception e) {
            System.out.println("[P1] 실행 예외: " + String.valueOf(e).substring(0, Math.min(140, String.valueOf(e).length())));
            try {
                long pc = backend.reg_read(Arm64Const.UC_ARM64_REG_PC).longValue();
                System.out.println("[P1] crash PC=0x" + Long.toHexString(pc) + " (+0x" + Long.toHexString(pc - base) + ")");
                int[] regs = { Arm64Const.UC_ARM64_REG_X0, Arm64Const.UC_ARM64_REG_X1,
                               Arm64Const.UC_ARM64_REG_X2, Arm64Const.UC_ARM64_REG_X8,
                               Arm64Const.UC_ARM64_REG_X9, Arm64Const.UC_ARM64_REG_SP };
                String[] names = { "x0","x1","x2","x8","x9","sp" };
                for (int i = 0; i < regs.length; i++)
                    System.out.println("[P1]   " + names[i] + "=0x" + Long.toHexString(
                        backend.reg_read(regs[i]).longValue()));
            } catch (Exception e2) { System.out.println("[P1] reg dump fail: " + e2); }
        }

        byte[] after = emulator.getBackend().mem_read(base, (int) module.size);
        byte[] stackAfter = emulator.getBackend().mem_read(SP - 0x1000, 0x11000);
        int regions = 0, changed = 0; long firstOff = -1;
        int runStart = -1;
        for (int i = 0; i < before.length; i++) {
            boolean diff = before[i] != after[i];
            if (diff) { changed++; if (firstOff < 0) firstOff = i; }
            if (diff && runStart < 0) runStart = i;
            if (!diff && runStart >= 0) {
                if (i - runStart >= 1) {
                    if (regions < 12) {
                        StringBuilder sb = new StringBuilder();
                        for (int k = runStart; k < Math.min(i, runStart + 48); k++) sb.append(String.format("%02x ", after[k]));
                        String txt = printable(after, runStart, Math.min(i, runStart + 48));
                        System.out.println(String.format("[P1] diff 0x%x-0x%x (%dB): %s | \"%s\"",
                            runStart, i, i - runStart, sb, txt));
                    }
                    regions++;
                }
                runStart = -1;
            }
        }
        System.out.println("[P1] changed bytes=" + changed + " regions=" + regions + " first=0x" + Long.toHexString(Math.max(0, firstOff)));
        // 스택 버퍼 diff — plaintext 후보
        int sreg = 0; int sstart = -1;
        for (int i = 0; i < stackBefore.length; i++) {
            boolean d = stackBefore[i] != stackAfter[i];
            if (d && sstart < 0) sstart = i;
            if ((!d || i == stackBefore.length-1) && sstart >= 0) {
                int end = d ? i+1 : i;
                if (end - sstart >= 2 && sreg < 10) {
                    StringBuilder hex = new StringBuilder(), txt = new StringBuilder();
                    for (int k = sstart; k < Math.min(end, sstart+64); k++) {
                        hex.append(String.format("%02x ", stackAfter[k]));
                        int c = stackAfter[k] & 0xFF; txt.append(c >= 0x20 && c < 0x7f ? (char) c : '.');
                    }
                    System.out.println(String.format("[P1][STACK] 0x%x (%dB): %s | \"%s\"",
                        SP - 0x1000 + sstart, end - sstart, hex, txt));
                }
                if (end - sstart >= 2) sreg++;
                sstart = -1;
            }
        }
        System.out.println("[P1] stack diff regions=" + sreg);
        emulator.close();
    }
    static String printable(byte[] b, int s, int e) {
        StringBuilder t = new StringBuilder();
        for (int i = s; i < e; i++) { int c = b[i] & 0xFF; t.append(c >= 0x20 && c < 0x7f ? (char) c : '.'); }
        return t.toString();
    }
}
