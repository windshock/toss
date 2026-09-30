package com.github.unidbg.android;

import com.github.unidbg.AndroidEmulator;
import com.github.unidbg.Emulator;
import com.github.unidbg.Module;
import com.github.unidbg.linux.android.AndroidEmulatorBuilder;
import com.github.unidbg.linux.android.AndroidResolver;
import com.github.unidbg.memory.Memory;

import java.io.File;

/**
 * 30차 Phase 0 — 토스 libea56.so ELF-only 최소 로드.
 * 목적: JNI_OnLoad/DT_INIT 전체 실행 없이 매핑+relocation만 확인하고,
 * 이후 StringEncryption 후보(LDAXR/STLXR 진입부) 등 원하는 offset을 직접 실행할
 * 최소 harness. (전체 init 금지 — /proc·JNI·thread stub 요구 폭발 방지, 핸드오프 전략)
 */
public class TossEa56Test {
    static final String SO =
        "/Users/1004276/Downloads/AppSuit/avd-camouflage/analysis/toss-rasp/libea56.so";

    public static void main(String[] args) throws Exception {
        AndroidEmulator emulator = AndroidEmulatorBuilder.for64Bit()
                .setProcessName("viva.republica.toss")
                .build();
        Memory memory = emulator.getMemory();
        memory.setLibraryResolver(new AndroidResolver(21));
        // forceCallInit=false — DT_INIT/JNI_OnLoad 미실행 (Phase 0 원칙)
        Module module = memory.load(new File(SO), false);
        System.out.println("[P0] loaded  : libea56.so");
        System.out.println("[P0] base    : 0x" + Long.toHexString(module.base));
        System.out.println("[P0] size    : 0x" + Long.toHexString(module.size));

        // Phase 1 예비: LDAXR/STLXR 후보 진입부(0x38718 주변 — 핸드오프 Fingerprint B 예시)
        long[] probes = { 0x38718L, 0xb0284L };
        for (long off : probes) {
            byte[] code = emulator.getBackend().mem_read(module.base + off, 16);
            StringBuilder sb = new StringBuilder();
            for (byte b : code) sb.append(String.format("%02x", b));
            System.out.println(String.format("[P0] code@0x%x: %s", off, sb));
        }
        System.out.println("[P0] OK — Phase 1(StringEncryption 후보 실행) 준비 완료");
        emulator.close();
    }
}
