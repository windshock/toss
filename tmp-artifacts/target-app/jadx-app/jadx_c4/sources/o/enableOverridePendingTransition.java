package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class enableOverridePendingTransition {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ enableOverridePendingTransition[] $VALUES;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public static final enableOverridePendingTransition UP = new enableOverridePendingTransition("UP", 0);
    public static final enableOverridePendingTransition DOWN = new enableOverridePendingTransition("DOWN", 1);
    public static final enableOverridePendingTransition SAME = new enableOverridePendingTransition("SAME", 2);

    private static final /* synthetic */ enableOverridePendingTransition[] $values() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 63;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        enableOverridePendingTransition[] enableoverridependingtransitionArr = {UP, DOWN, SAME};
        int i5 = i3 + 119;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return enableoverridependingtransitionArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static EnumEntries<enableOverridePendingTransition> getEntries() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 111;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        EnumEntries<enableOverridePendingTransition> enumEntries = $ENTRIES;
        int i5 = i2 + 61;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 47 / 0;
        }
        return enumEntries;
    }

    public static enableOverridePendingTransition valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 119;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        enableOverridePendingTransition enableoverridependingtransition = (enableOverridePendingTransition) Enum.valueOf(enableOverridePendingTransition.class, str);
        if (i3 != 0) {
            int i4 = 52 / 0;
        }
        return enableoverridependingtransition;
    }

    public static enableOverridePendingTransition[] values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 25;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        enableOverridePendingTransition[] enableoverridependingtransitionArr = (enableOverridePendingTransition[]) $VALUES.clone();
        int i4 = onExtraCallback + 123;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return enableoverridependingtransitionArr;
    }

    private enableOverridePendingTransition(String str, int i) {
    }

    static {
        enableOverridePendingTransition[] enableoverridependingtransitionArr$values = $values();
        $VALUES = enableoverridependingtransitionArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(enableoverridependingtransitionArr$values);
        int i = onNavigationEvent + 51;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            int i2 = 6 / 0;
        }
    }
}
