package viva.republica.toss.network.model.home;

import kotlin.enums.EnumEntries;
import o.access15300;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class RegularExpenseUpdateOperation {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RegularExpenseUpdateOperation[] $VALUES;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    public static final RegularExpenseUpdateOperation ADD = new RegularExpenseUpdateOperation("ADD", 0);
    public static final RegularExpenseUpdateOperation REMOVE = new RegularExpenseUpdateOperation("REMOVE", 1);

    private static final /* synthetic */ RegularExpenseUpdateOperation[] $values() {
        RegularExpenseUpdateOperation[] regularExpenseUpdateOperationArr;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 81;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 != 0) {
            RegularExpenseUpdateOperation regularExpenseUpdateOperation = ADD;
            RegularExpenseUpdateOperation regularExpenseUpdateOperation2 = REMOVE;
            regularExpenseUpdateOperationArr = new RegularExpenseUpdateOperation[3];
            regularExpenseUpdateOperationArr[1] = regularExpenseUpdateOperation;
            regularExpenseUpdateOperationArr[0] = regularExpenseUpdateOperation2;
        } else {
            regularExpenseUpdateOperationArr = new RegularExpenseUpdateOperation[]{ADD, REMOVE};
        }
        int i4 = i3 + 97;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 65 / 0;
        }
        return regularExpenseUpdateOperationArr;
    }

    public static EnumEntries<RegularExpenseUpdateOperation> getEntries() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 9;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        EnumEntries<RegularExpenseUpdateOperation> enumEntries = $ENTRIES;
        int i5 = i2 + 89;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return enumEntries;
        }
        throw null;
    }

    public static RegularExpenseUpdateOperation valueOf(String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 21;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        RegularExpenseUpdateOperation regularExpenseUpdateOperation = (RegularExpenseUpdateOperation) Enum.valueOf(RegularExpenseUpdateOperation.class, str);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallback + 5;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return regularExpenseUpdateOperation;
    }

    public static RegularExpenseUpdateOperation[] values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 105;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        RegularExpenseUpdateOperation[] regularExpenseUpdateOperationArr = (RegularExpenseUpdateOperation[]) $VALUES.clone();
        int i4 = IAuthTabCallback + 65;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return regularExpenseUpdateOperationArr;
    }

    private RegularExpenseUpdateOperation(String str, int i) {
    }

    static {
        RegularExpenseUpdateOperation[] regularExpenseUpdateOperationArr$values = $values();
        $VALUES = regularExpenseUpdateOperationArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(regularExpenseUpdateOperationArr$values);
        int i = onWarmupCompleted + 53;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
