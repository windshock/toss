package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class t5a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ t5a[] $VALUES;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public static final t5a Unspecified = new t5a("Unspecified", 0);
    public static final t5a Opened = new t5a("Opened", 1);
    public static final t5a Closed = new t5a("Closed", 2);

    private static final /* synthetic */ t5a[] $values() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 125;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        t5a[] t5aVarArr = {Unspecified, Opened, Closed};
        int i5 = i3 + 37;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return t5aVarArr;
    }

    public static EnumEntries<t5a> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 55;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        EnumEntries<t5a> enumEntries = $ENTRIES;
        int i4 = i3 + 1;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return enumEntries;
        }
        throw null;
    }

    public static t5a valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 49;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        t5a t5aVar = (t5a) Enum.valueOf(t5a.class, str);
        int i4 = onExtraCallback + 61;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return t5aVar;
    }

    public static t5a[] values() {
        t5a[] t5aVarArr;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 11;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            t5aVarArr = (t5a[]) $VALUES.clone();
            int i3 = 74 / 0;
        } else {
            t5aVarArr = (t5a[]) $VALUES.clone();
        }
        int i4 = onExtraCallbackWithResult + 115;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return t5aVarArr;
    }

    private t5a(String str, int i) {
    }

    static {
        t5a[] t5aVarArr$values = $values();
        $VALUES = t5aVarArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(t5aVarArr$values);
        int i = onNavigationEvent + 3;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }
}
