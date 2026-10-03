package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class isEnoughCapacity {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ isEnoughCapacity[] $VALUES;
    public static final isEnoughCapacity ALL = new isEnoughCapacity("ALL", 0);
    public static final isEnoughCapacity DEPOSIT = new isEnoughCapacity("DEPOSIT", 1);
    public static final isEnoughCapacity WITHDRAW = new isEnoughCapacity("WITHDRAW", 2);

    private static final /* synthetic */ isEnoughCapacity[] $values() {
        return new isEnoughCapacity[]{ALL, DEPOSIT, WITHDRAW};
    }

    public static EnumEntries<isEnoughCapacity> getEntries() {
        return $ENTRIES;
    }

    public static isEnoughCapacity valueOf(String str) {
        return (isEnoughCapacity) Enum.valueOf(isEnoughCapacity.class, str);
    }

    public static isEnoughCapacity[] values() {
        return (isEnoughCapacity[]) $VALUES.clone();
    }

    private isEnoughCapacity(String str, int i) {
    }

    static {
        isEnoughCapacity[] isenoughcapacityArr$values = $values();
        $VALUES = isenoughcapacityArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(isenoughcapacityArr$values);
    }
}
