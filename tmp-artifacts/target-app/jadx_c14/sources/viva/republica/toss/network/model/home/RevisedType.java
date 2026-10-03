package viva.republica.toss.network.model.home;

import kotlin.enums.EnumEntries;
import o.access15300;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class RevisedType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RevisedType[] $VALUES;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public static final RevisedType NONE = new RevisedType("NONE", 0);
    public static final RevisedType CAN_REVISE = new RevisedType("CAN_REVISE", 1);
    public static final RevisedType IS_REVISED = new RevisedType("IS_REVISED", 2);

    private static final /* synthetic */ RevisedType[] $values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 43;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        RevisedType[] revisedTypeArr = {NONE, CAN_REVISE, IS_REVISED};
        int i5 = i2 + 103;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return revisedTypeArr;
    }

    public static EnumEntries<RevisedType> getEntries() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 103;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        EnumEntries<RevisedType> enumEntries = $ENTRIES;
        int i5 = i3 + 15;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }

    public static RevisedType valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 33;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        RevisedType revisedType = (RevisedType) Enum.valueOf(RevisedType.class, str);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onWarmupCompleted + 31;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 98 / 0;
        }
        return revisedType;
    }

    public static RevisedType[] values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 69;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        RevisedType[] revisedTypeArr = $VALUES;
        if (i3 == 0) {
            return (RevisedType[]) revisedTypeArr.clone();
        }
        throw null;
    }

    private RevisedType(String str, int i) {
    }

    static {
        RevisedType[] revisedTypeArr$values = $values();
        $VALUES = revisedTypeArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(revisedTypeArr$values);
        int i = onExtraCallback + 11;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }
}
