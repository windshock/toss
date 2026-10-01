package com.samsung.android.ssiframework.sdk.annotation;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.access15300;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class SsiApiLevel {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SsiApiLevel[] $VALUES;
    public static final Companion Companion;
    private static final String META_DATA_NAME_FOR_FW_MIN_API_LEVEL = "com.samsung.android.ssiframework.MIN_API_LEVEL";
    private static final String META_DATA_NAME_FOR_FW_SUPPORT_API_LEVEL = "com.samsung.android.ssiframework.SUPPORT_API_LEVEL";
    private static final String META_DATA_NAME_FOR_SDK_SUPPORT_API_LEVEL = "com.samsung.android.ssiframework.sdk.SUPPORT_API_LEVEL";
    public static final String TAG = "SsiApiLevel";
    private final int intValue;
    public static final SsiApiLevel LEVEL_0 = new SsiApiLevel("LEVEL_0", 0, 0);
    public static final SsiApiLevel LEVEL_1 = new SsiApiLevel("LEVEL_1", 1, 1);
    public static final SsiApiLevel LEVEL_2 = new SsiApiLevel("LEVEL_2", 2, 2);
    public static final SsiApiLevel LEVEL_3 = new SsiApiLevel("LEVEL_3", 3, 3);
    public static final SsiApiLevel LEVEL_4 = new SsiApiLevel("LEVEL_4", 4, 4);
    public static final SsiApiLevel LEVEL_5 = new SsiApiLevel("LEVEL_5", 5, 5);
    public static final SsiApiLevel LEVEL_6 = new SsiApiLevel("LEVEL_6", 6, 6);
    public static final SsiApiLevel LEVEL_7 = new SsiApiLevel("LEVEL_7", 7, 7);
    public static final SsiApiLevel LEVEL_8 = new SsiApiLevel("LEVEL_8", 8, 8);
    public static final SsiApiLevel LEVEL_9 = new SsiApiLevel("LEVEL_9", 9, 9);
    public static final SsiApiLevel LEVEL_10 = new SsiApiLevel("LEVEL_10", 10, 10);
    public static final SsiApiLevel LEVEL_11 = new SsiApiLevel("LEVEL_11", 11, 11);
    public static final SsiApiLevel LEVEL_12 = new SsiApiLevel("LEVEL_12", 12, 12);
    public static final SsiApiLevel LEVEL_13 = new SsiApiLevel("LEVEL_13", 13, 13);

    private static final /* synthetic */ SsiApiLevel[] $values() {
        return new SsiApiLevel[]{LEVEL_0, LEVEL_1, LEVEL_2, LEVEL_3, LEVEL_4, LEVEL_5, LEVEL_6, LEVEL_7, LEVEL_8, LEVEL_9, LEVEL_10, LEVEL_11, LEVEL_12, LEVEL_13};
    }

    static {
        SsiApiLevel[] ssiApiLevelArr$values = $values();
        $VALUES = ssiApiLevelArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(ssiApiLevelArr$values);
        Companion = new Companion((DefaultConstructorMarker) null);
    }

    private SsiApiLevel(String str, int i, int i2) {
        this.intValue = i2;
    }

    public static EnumEntries<SsiApiLevel> getEntries() {
        return $ENTRIES;
    }

    public static SsiApiLevel valueOf(String str) {
        return (SsiApiLevel) Enum.valueOf(SsiApiLevel.class, str);
    }

    public static SsiApiLevel[] values() {
        return (SsiApiLevel[]) $VALUES.clone();
    }

    public final int getIntValue() {
        return this.intValue;
    }
}
