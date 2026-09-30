package com.github.unidbg.android;

import com.github.unidbg.AndroidEmulator;
import com.github.unidbg.Module;
import com.github.unidbg.linux.android.AndroidEmulatorBuilder;
import com.github.unidbg.linux.android.AndroidResolver;
import com.github.unidbg.memory.Memory;
import unicorn.Arm64Const;

import java.io.*;
import java.nio.file.*;
import java.util.*;

/**
 * 32차 Phase 2 — LDAXR guard 진입부 68개 순차 실행 → StringEncryption 평문 전수 수집.
 * 매 후보: 초기 모듈/스택 스냅샷 복원 → 실행(2s 상한) → 모듈 데이터 diff의
 * printable run(≥4) 수집. 결과를 JSONL로 출력.
 */
public class TossEa56Phase2 {
    static final String SO =
        "/Users/1004276/Downloads/AppSuit/avd-camouflage/analysis/toss-rasp/libea56.so";
    static final String ENTRIES =
        "/Users/1004276/Downloads/AppSuit/avd-camouflage/analysis/toss-rasp/session32/guard_entries.json";
    static final String OUT =
        "/Users/1004276/Downloads/AppSuit/avd-camouflage/analysis/toss-rasp/session32/strings.jsonl";
    static final long MAGIC = 0x77777000L;

    public static void main(String[] args) throws Exception {
        List<String> ent = new ArrayList<>();
        String raw = new String(Files.readAllBytes(Paths.get(ENTRIES))).replaceAll("[\\[\\]\\s\"]", "");
        for (String s : raw.split(",")) if (!s.isEmpty()) ent.add(s);
        int limit = args.length > 0 ? Integer.parseInt(args[0]) : ent.size();
        System.out.println("[P2] entries=" + ent.size() + " limit=" + limit);

        byte[] moduleInit = null;
        long base = 0;
        PrintWriter pw = new PrintWriter(new FileWriter(OUT));
        int okEntries = 0, totalStr = 0;
        for (int idx = 0; idx < Math.min(limit, ent.size()); idx++) {
            long entry = Long.parseLong(ent.get(idx), 16);
            // 매 후보 새 emulator — 반복 emu_start의 unicorn 네이티브 크래시 회피
            AndroidEmulator emulator = AndroidEmulatorBuilder.for64Bit()
                    .setProcessName("viva.republica.toss").build();
            Memory memory = emulator.getMemory();
            memory.setLibraryResolver(new AndroidResolver(21));
            Module module = memory.load(new File(SO), false);
            base = module.base;
            long STACK = base + 0x3000000L;
            emulator.getBackend().mem_map(STACK, 0x100000, 3);
            long SP = STACK + 0xF0000;
            if (moduleInit == null) moduleInit = emulator.getBackend().mem_read(base, (int) module.size);
            emulator.getBackend().reg_write(Arm64Const.UC_ARM64_REG_SP, SP);
            emulator.getBackend().reg_write(Arm64Const.UC_ARM64_REG_LR, MAGIC);
            try {
                emulator.getBackend().emu_start(base + entry, MAGIC, 2_000_000L, 0);
            } catch (Throwable e) { /* 부분 실행도 수용 */ }
            byte[] now = emulator.getBackend().mem_read(base, (int) module.size);
            // 모듈 데이터(0x170000+) diff → printable run 수집
            List<String> found = new ArrayList<>();
            int runStart = -1;
            int dataStart = 0x170000;
            for (int i = dataStart; i < now.length; i++) {
                boolean d = now[i] != moduleInit[i];
                if (d && runStart < 0) runStart = i;
                if ((!d || i == now.length - 1) && runStart >= 0) {
                    int end = d ? i + 1 : i;
                    // printable 비율 70%+ & 길이 4+ 만
                    if (end - runStart >= 4) {
                        int pr = 0; StringBuilder txt = new StringBuilder();
                        for (int k = runStart; k < end; k++) {
                            int c = now[k] & 0xFF;
                            if (c >= 0x20 && c < 0x7f) { pr++; txt.append((char) c); }
                        }
                        if (pr * 100 / (end - runStart) >= 70) {
                            found.add(String.format("0x%x:%s", runStart, txt));
                        }
                    }
                    runStart = -1;
                }
            }
            if (!found.isEmpty()) {
                okEntries++;
                for (String f : found) { pw.println("{\"entry\":\"0x" + Long.toHexString(entry) + "\",\"str\":\"" + f.split(":", 2)[1].replace("\\", "\\\\").replace("\"", "\\\"") + "\",\"at\":\"" + f.split(":", 2)[0] + "\"}"); totalStr++; }
                System.out.println("[P2] 0x" + Long.toHexString(entry) + " -> " + found.size() + " strings");
            }
            if ((idx + 1) % 10 == 0) System.out.println("[P2] progress " + (idx + 1) + "/" + limit);
            try { emulator.close(); } catch (Exception ig) {}
        }
        pw.close();
        System.out.println("[P2] DONE entries_with_strings=" + okEntries + " total_strings=" + totalStr + " -> " + OUT);
    }
}
