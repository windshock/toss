package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class o0a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ o0a[] $VALUES;
    private static int IAuthTabCallback = 1;
    public static final o0a Service = new o0a("Service", 0);
    public static final o0a Shared = new o0a("Shared", 1);
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    private static final /* synthetic */ o0a[] $values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 59;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        o0a[] o0aVarArr = {Service, Shared};
        int i5 = i2 + 121;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return o0aVarArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static EnumEntries<o0a> getEntries() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 117;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        EnumEntries<o0a> enumEntries = $ENTRIES;
        int i5 = i2 + 67;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }

    public static o0a valueOf(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 117;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        o0a o0aVar = (o0a) Enum.valueOf(o0a.class, str);
        int i4 = onNavigationEvent + 81;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return o0aVar;
        }
        throw null;
    }

    public static o0a[] values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 17;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        o0a[] o0aVarArr = (o0a[]) $VALUES.clone();
        int i4 = IAuthTabCallback + 123;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return o0aVarArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private o0a(String str, int i) {
    }

    static {
        o0a[] o0aVarArr$values = $values();
        $VALUES = o0aVarArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(o0aVarArr$values);
        int i = onWarmupCompleted + 113;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }
}
