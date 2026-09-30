package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class maxAge {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ maxAge[] $VALUES;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    public static final maxAge On = new maxAge("On", 0);
    public static final maxAge Off = new maxAge("Off", 1);
    public static final maxAge System = new maxAge("System", 2);

    private static final /* synthetic */ maxAge[] $values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 117;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        maxAge[] maxageArr = {On, Off, System};
        int i5 = i2 + 83;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return maxageArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static EnumEntries<maxAge> getEntries() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 5;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        EnumEntries<maxAge> enumEntries = $ENTRIES;
        int i5 = i3 + 53;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return enumEntries;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static maxAge valueOf(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 41;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        maxAge maxage = (maxAge) Enum.valueOf(maxAge.class, str);
        if (i3 != 0) {
            return maxage;
        }
        throw null;
    }

    public static maxAge[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 53;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        maxAge[] maxageArr = (maxAge[]) $VALUES.clone();
        int i4 = onWarmupCompleted + 41;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 18 / 0;
        }
        return maxageArr;
    }

    private maxAge(String str, int i) {
    }

    static {
        maxAge[] maxageArr$values = $values();
        $VALUES = maxageArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(maxageArr$values);
        int i = onExtraCallback + 101;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }
}
