package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class t4 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ t4[] $VALUES;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public static final t4 ContentSize = new t4("ContentSize", 0);
    public static final t4 Final = new t4("Final", 1);
    public static final t4 EqualHeight = new t4("EqualHeight", 2);

    private static final /* synthetic */ t4[] $values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 103;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        t4[] t4VarArr = {ContentSize, Final, EqualHeight};
        int i5 = i3 + 41;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 21 / 0;
        }
        return t4VarArr;
    }

    public static EnumEntries<t4> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 111;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        EnumEntries<t4> enumEntries = $ENTRIES;
        int i5 = i3 + 33;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 33 / 0;
        }
        return enumEntries;
    }

    public static t4 valueOf(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 99;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        t4 t4Var = (t4) Enum.valueOf(t4.class, str);
        if (i3 == 0) {
            return t4Var;
        }
        throw null;
    }

    public static t4[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 59;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        t4[] t4VarArr = $VALUES;
        if (i3 != 0) {
            return (t4[]) t4VarArr.clone();
        }
        throw null;
    }

    private t4(String str, int i) {
    }

    static {
        t4[] t4VarArr$values = $values();
        $VALUES = t4VarArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(t4VarArr$values);
        int i = onExtraCallback + 23;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            int i2 = 57 / 0;
        }
    }
}
