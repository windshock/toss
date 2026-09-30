package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class u5b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ u5b[] $VALUES;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    public static final u5b Hidden = new u5b("Hidden", 0);
    public static final u5b PartiallyExpanded = new u5b("PartiallyExpanded", 1);
    public static final u5b Expanded = new u5b("Expanded", 2);

    private static final /* synthetic */ u5b[] $values() {
        u5b[] u5bVarArr;
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 55;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            u5b u5bVar = Hidden;
            u5b u5bVar2 = PartiallyExpanded;
            u5b u5bVar3 = Expanded;
            u5bVarArr = new u5b[4];
            u5bVarArr[0] = u5bVar;
            u5bVarArr[1] = u5bVar2;
            u5bVarArr[2] = u5bVar3;
        } else {
            u5bVarArr = new u5b[]{Hidden, PartiallyExpanded, Expanded};
        }
        int i4 = i2 + 61;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return u5bVarArr;
    }

    public static EnumEntries<u5b> getEntries() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 3;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        EnumEntries<u5b> enumEntries = $ENTRIES;
        int i5 = i2 + 77;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 72 / 0;
        }
        return enumEntries;
    }

    public static u5b valueOf(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 83;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        u5b u5bVar = (u5b) Enum.valueOf(u5b.class, str);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onWarmupCompleted + 125;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return u5bVar;
    }

    public static u5b[] values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 87;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        u5b[] u5bVarArr = $VALUES;
        if (i3 == 0) {
            return (u5b[]) u5bVarArr.clone();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private u5b(String str, int i) {
    }

    static {
        u5b[] u5bVarArr$values = $values();
        $VALUES = u5bVarArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(u5bVarArr$values);
        int i = onNavigationEvent + 39;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
