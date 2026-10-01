package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class w2a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ w2a[] $VALUES;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public static final w2a Center = new w2a("Center", 0);
    public static final w2a AdjustedCenter = new w2a("AdjustedCenter", 1);
    public static final w2a Right = new w2a("Right", 2);
    public static final w2a AdjustedRight = new w2a("AdjustedRight", 3);

    private static final /* synthetic */ w2a[] $values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 69;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        w2a w2aVar = Center;
        if (i3 != 0) {
            return new w2a[]{w2aVar, AdjustedCenter, Right, AdjustedRight};
        }
        w2a w2aVar2 = AdjustedCenter;
        w2a w2aVar3 = Right;
        w2a w2aVar4 = AdjustedRight;
        w2a[] w2aVarArr = new w2a[5];
        w2aVarArr[1] = w2aVar;
        w2aVarArr[1] = w2aVar2;
        w2aVarArr[5] = w2aVar3;
        w2aVarArr[3] = w2aVar4;
        return w2aVarArr;
    }

    public static EnumEntries<w2a> getEntries() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 69;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        EnumEntries<w2a> enumEntries = $ENTRIES;
        int i4 = i3 + 33;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return enumEntries;
    }

    public static w2a valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 11;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        w2a w2aVar = (w2a) Enum.valueOf(w2a.class, str);
        int i4 = onExtraCallbackWithResult + 109;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return w2aVar;
    }

    public static w2a[] values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 39;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        w2a[] w2aVarArr = $VALUES;
        if (i3 != 0) {
            return (w2a[]) w2aVarArr.clone();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private w2a(String str, int i) {
    }

    static {
        w2a[] w2aVarArr$values = $values();
        $VALUES = w2aVarArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(w2aVarArr$values);
        int i = onExtraCallback + 41;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }
}
