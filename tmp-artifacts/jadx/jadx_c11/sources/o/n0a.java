package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class n0a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ n0a[] $VALUES;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public static final n0a NotRequested = new n0a("NotRequested", 0);
    public static final n0a Loading = new n0a("Loading", 1);
    public static final n0a Loaded = new n0a("Loaded", 2);
    public static final n0a Failed = new n0a("Failed", 3);

    private static final /* synthetic */ n0a[] $values() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 13;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return new n0a[]{NotRequested, Loading, Loaded, Failed};
        }
        n0a n0aVar = NotRequested;
        n0a n0aVar2 = Loading;
        n0a n0aVar3 = Loaded;
        n0a n0aVar4 = Failed;
        n0a[] n0aVarArr = new n0a[2];
        n0aVarArr[0] = n0aVar;
        n0aVarArr[0] = n0aVar2;
        n0aVarArr[5] = n0aVar3;
        n0aVarArr[5] = n0aVar4;
        return n0aVarArr;
    }

    public static EnumEntries<n0a> getEntries() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 83;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        EnumEntries<n0a> enumEntries = $ENTRIES;
        if (i3 == 0) {
            int i4 = 70 / 0;
        }
        return enumEntries;
    }

    public static n0a valueOf(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 75;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        n0a n0aVar = (n0a) Enum.valueOf(n0a.class, str);
        int i4 = onExtraCallback + 125;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 22 / 0;
        }
        return n0aVar;
    }

    public static n0a[] values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 53;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        n0a[] n0aVarArr = (n0a[]) $VALUES.clone();
        int i4 = IAuthTabCallback + 89;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 92 / 0;
        }
        return n0aVarArr;
    }

    private n0a(String str, int i) {
    }

    static {
        n0a[] n0aVarArr$values = $values();
        $VALUES = n0aVarArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(n0aVarArr$values);
        int i = onWarmupCompleted + 79;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }
}
