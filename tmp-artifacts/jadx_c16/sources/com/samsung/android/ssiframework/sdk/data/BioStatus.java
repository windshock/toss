package com.samsung.android.ssiframework.sdk.data;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.access15300;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class BioStatus {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BioStatus[] $VALUES;
    public static final Companion Companion;
    public static final BioStatus NONE = new BioStatus("NONE", 0, 0);
    public static final BioStatus NORMAL = new BioStatus("NORMAL", 1, 2);
    public static final BioStatus SUSPENDED = new BioStatus("SUSPENDED", 2, 3);
    private final int id;

    private static final /* synthetic */ BioStatus[] $values() {
        return new BioStatus[]{NONE, NORMAL, SUSPENDED};
    }

    static {
        BioStatus[] bioStatusArr$values = $values();
        $VALUES = bioStatusArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(bioStatusArr$values);
        Companion = new Companion((DefaultConstructorMarker) null);
    }

    private BioStatus(String str, int i, int i2) {
        this.id = i2;
    }

    public static EnumEntries<BioStatus> getEntries() {
        return $ENTRIES;
    }

    public static BioStatus valueOf(String str) {
        return (BioStatus) Enum.valueOf(BioStatus.class, str);
    }

    public static BioStatus[] values() {
        return (BioStatus[]) $VALUES.clone();
    }

    public final int getId() {
        return this.id;
    }
}
