package com.samsung.android.ssiframework.sdk.config;

import kotlin.enums.EnumEntries;
import o.access15300;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class SsiServerLevel {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SsiServerLevel[] $VALUES;
    public static final SsiServerLevel STG = new SsiServerLevel("STG", 0);
    public static final SsiServerLevel PRD = new SsiServerLevel("PRD", 1);

    private static final /* synthetic */ SsiServerLevel[] $values() {
        return new SsiServerLevel[]{STG, PRD};
    }

    static {
        SsiServerLevel[] ssiServerLevelArr$values = $values();
        $VALUES = ssiServerLevelArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(ssiServerLevelArr$values);
    }

    private SsiServerLevel(String str, int i) {
    }

    public static EnumEntries<SsiServerLevel> getEntries() {
        return $ENTRIES;
    }

    public static SsiServerLevel valueOf(String str) {
        return (SsiServerLevel) Enum.valueOf(SsiServerLevel.class, str);
    }

    public static SsiServerLevel[] values() {
        return (SsiServerLevel[]) $VALUES.clone();
    }
}
