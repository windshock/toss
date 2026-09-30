package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class n6a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ n6a[] $VALUES;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    public static final n6a NotEntered = new n6a("NotEntered", 0);
    public static final n6a Entered = new n6a("Entered", 1);
    public static final n6a Staying = new n6a("Staying", 2);
    public static final n6a Left = new n6a("Left", 3);
    public static final n6a Reentered = new n6a("Reentered", 4);

    private static final /* synthetic */ n6a[] $values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 13;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        n6a[] n6aVarArr = {NotEntered, Entered, Staying, Left, Reentered};
        int i5 = i2 + 113;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 0 / 0;
        }
        return n6aVarArr;
    }

    public static EnumEntries<n6a> getEntries() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 19;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        EnumEntries<n6a> enumEntries = $ENTRIES;
        int i5 = i2 + 99;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }

    public static n6a valueOf(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 61;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        n6a n6aVar = (n6a) Enum.valueOf(n6a.class, str);
        if (i3 == 0) {
            int i4 = 9 / 0;
        }
        return n6aVar;
    }

    public static n6a[] values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 93;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        n6a[] n6aVarArr = (n6a[]) $VALUES.clone();
        int i4 = onNavigationEvent + 107;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 36 / 0;
        }
        return n6aVarArr;
    }

    private n6a(String str, int i) {
    }

    static {
        n6a[] n6aVarArr$values = $values();
        $VALUES = n6aVarArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(n6aVarArr$values);
        int i = onExtraCallback + 49;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }
}
