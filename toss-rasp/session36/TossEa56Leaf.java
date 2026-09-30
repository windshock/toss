package com.github.unidbg.android;

import com.github.unidbg.AndroidEmulator;
import com.github.unidbg.Module;
import com.github.unidbg.linux.android.AndroidEmulatorBuilder;
import com.github.unidbg.linux.android.AndroidResolver;
import com.github.unidbg.memory.Memory;
import unicorn.Arm64Const;

import java.io.File;

/**
 * 36차 — 잎(leaf) 1개당 JVM 프로세스 1개 실행(unicorn 네이티브 크래시 회피).
 * 32/35차의 in-JVM 벌크(emulator 반복 생성)는 memory_region_transaction_commit
 * SIGBUS로 7회 폭사( hs_err_pid*.log ) — 프로세스 격리가 유일한 안정 해법.
 * 모듈 데이터(0x170000+)와 재배치 스택 양쪽을 diff해 printable run(≥4, 70%+)을
 * JSONL로 stdout에 출력(드라이버가 수집).
 */
public class TossEa56Leaf {
    static final String SO =
        "/Users/1004276/Downloads/AppSuit/avd-camouflage/analysis/toss-rasp/libea56.so";
    static final long MAGIC = 0x77777000L;

    public static void main(String[] args) throws Exception {
        long entryOff = Long.parseLong(args[0], 16);
        AndroidEmulator emulator = AndroidEmulatorBuilder.for64Bit()
                .setProcessName("viva.republica.toss").build();
        Memory memory = emulator.getMemory();
        memory.setLibraryResolver(new AndroidResolver(21));
        Module module = memory.load(new File(SO), false);
        long base = module.base;
        com.github.unidbg.arm.backend.Backend backend = emulator.getBackend();

        long STACK = base + 0x3000000L;
        backend.mem_map(STACK, 0x100000, 3);
        long SP = STACK + 0xF0000;
        backend.reg_write(Arm64Const.UC_ARM64_REG_SP, SP);
        backend.reg_write(Arm64Const.UC_ARM64_REG_LR, MAGIC);

        byte[] modBefore = backend.mem_read(base, (int) module.size);
        byte[] stkBefore = backend.mem_read(SP - 0x1000, 0x11000);

        String status = "ok";
        try {
            backend.emu_start(base + entryOff, MAGIC, 3_000_000L, 0);
        } catch (Throwable e) {
            status = String.valueOf(e).substring(0, Math.min(60, String.valueOf(e).length()));
            try {
                long pc = backend.reg_read(Arm64Const.UC_ARM64_REG_PC).longValue();
                status += "@+0x" + Long.toHexString(pc - base);
            } catch (Throwable ig) {}
        }

        byte[] modAfter, stkAfter;
        try { modAfter = backend.mem_read(base, (int) module.size); }
        catch (Throwable e) { modAfter = modBefore; }
        try { stkAfter = backend.mem_read(SP - 0x1000, 0x11000); }
        catch (Throwable e) { stkAfter = stkBefore; }

        int n = scan(modBefore, modAfter, 0x170000, "module");
        n += scan(stkBefore, stkAfter, 0, "stack");
        // 덤프 모드: 인자[1] 경로에 데이터 세그먼트(0x174000~0x19e8b0) after-image 기록
        if (args.length > 1) {
            java.io.FileOutputStream fos = new java.io.FileOutputStream(args[1]);
            fos.write(modAfter, 0x174000, 0x19e8b0 - 0x174000);
            fos.close();
        }
        System.err.println("[LEAF] 0x" + Long.toHexString(entryOff) + " status=" + status + " strings=" + n);
        emulator.close();
    }

    // diff → printable run(길이≥4, printable≥70%) → JSONL stdout
    static int scan(byte[] before, byte[] after, int dataStart, String tag) {
        int count = 0, runStart = -1;
        for (int i = dataStart; i < after.length; i++) {
            boolean d = after[i] != before[i];
            if (d && runStart < 0) runStart = i;
            if ((!d || i == after.length - 1) && runStart >= 0) {
                int end = d ? i + 1 : i;
                if (end - runStart >= 4) {
                    int pr = 0; StringBuilder txt = new StringBuilder();
                    for (int k = runStart; k < end; k++) {
                        int c = after[k] & 0xFF;
                        if (c >= 0x20 && c < 0x7f) { pr++; txt.append((char) c); }
                    }
                    if (pr * 100 / (end - runStart) >= 70) {
                        System.out.println("{\"where\":\"" + tag + "\",\"at\":\"0x"
                            + Integer.toHexString(runStart) + "\",\"str\":\""
                            + txt.toString().replace("\\", "\\\\").replace("\"", "\\\"") + "\"}");
                        count++;
                    }
                }
                runStart = -1;
            }
        }
        return count;
    }
}
