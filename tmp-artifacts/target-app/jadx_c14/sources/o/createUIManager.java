package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class createUIManager {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ createUIManager[] $VALUES;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    public static final createUIManager CHARGE = new createUIManager("CHARGE", 0);
    public static final createUIManager CHECK_BALANCE = new createUIManager("CHECK_BALANCE", 1);
    public static final createUIManager CORRECT_BALANCE = new createUIManager("CORRECT_BALANCE", 2);
    public static final createUIManager REFUND = new createUIManager("REFUND", 3);

    private static final /* synthetic */ createUIManager[] $values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 89;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        createUIManager[] createuimanagerArr = {CHARGE, CHECK_BALANCE, CORRECT_BALANCE, REFUND};
        int i5 = i3 + 91;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return createuimanagerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static EnumEntries<createUIManager> getEntries() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 99;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        EnumEntries<createUIManager> enumEntries = $ENTRIES;
        int i5 = i2 + 41;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return enumEntries;
        }
        throw null;
    }

    public static createUIManager valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 69;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        createUIManager createuimanager = (createUIManager) Enum.valueOf(createUIManager.class, str);
        int i4 = onWarmupCompleted + 107;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return createuimanager;
    }

    public static createUIManager[] values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 23;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        createUIManager[] createuimanagerArr = (createUIManager[]) $VALUES.clone();
        int i4 = onExtraCallbackWithResult + 123;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 76 / 0;
        }
        return createuimanagerArr;
    }

    private createUIManager(String str, int i) {
    }

    static {
        createUIManager[] createuimanagerArr$values = $values();
        $VALUES = createuimanagerArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(createuimanagerArr$values);
        int i = onNavigationEvent + 55;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
