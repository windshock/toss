package com.samsung.android.ssiframework.sdk.data;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.access15300;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class BioType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BioType[] $VALUES;
    public static final Companion Companion;
    public static final BioType FACE = new BioType("FACE", 0, 1);
    public static final BioType FP = new BioType("FP", 1, 2);
    private final int id;

    private static final /* synthetic */ BioType[] $values() {
        return new BioType[]{FACE, FP};
    }

    static {
        BioType[] bioTypeArr$values = $values();
        $VALUES = bioTypeArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(bioTypeArr$values);
        Companion = new Companion((DefaultConstructorMarker) null);
    }

    private BioType(String str, int i, int i2) {
        this.id = i2;
    }

    public static EnumEntries<BioType> getEntries() {
        return $ENTRIES;
    }

    public static BioType valueOf(String str) {
        return (BioType) Enum.valueOf(BioType.class, str);
    }

    public static BioType[] values() {
        return (BioType[]) $VALUES.clone();
    }

    public final int getId() {
        return this.id;
    }
}
