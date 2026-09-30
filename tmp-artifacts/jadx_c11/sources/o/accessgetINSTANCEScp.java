package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class accessgetINSTANCEScp {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ accessgetINSTANCEScp[] $VALUES;
    public static final accessgetINSTANCEScp Large = new accessgetINSTANCEScp("Large", 0);
    public static final accessgetINSTANCEScp Medium = new accessgetINSTANCEScp("Medium", 1);
    public static final accessgetINSTANCEScp MediumDown = new accessgetINSTANCEScp("MediumDown", 2);
    public static final accessgetINSTANCEScp MediumUp = new accessgetINSTANCEScp("MediumUp", 3);
    public static final accessgetINSTANCEScp Small = new accessgetINSTANCEScp("Small", 4);
    public static final accessgetINSTANCEScp TinyDown = new accessgetINSTANCEScp("TinyDown", 5);
    public static final accessgetINSTANCEScp TinyUp = new accessgetINSTANCEScp("TinyUp", 6);
    public static final accessgetINSTANCEScp WeakDown = new accessgetINSTANCEScp("WeakDown", 7);
    public static final accessgetINSTANCEScp WeakUp = new accessgetINSTANCEScp("WeakUp", 8);
    public static final accessgetINSTANCEScp XSmall = new accessgetINSTANCEScp("XSmall", 9);
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    private static final /* synthetic */ accessgetINSTANCEScp[] $values() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 81;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        accessgetINSTANCEScp[] accessgetinstancescpArr = {Large, Medium, MediumDown, MediumUp, Small, TinyDown, TinyUp, WeakDown, WeakUp, XSmall};
        int i5 = i3 + 105;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return accessgetinstancescpArr;
    }

    public static EnumEntries<accessgetINSTANCEScp> getEntries() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 69;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return $ENTRIES;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static accessgetINSTANCEScp valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 117;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        accessgetINSTANCEScp accessgetinstancescp = (accessgetINSTANCEScp) Enum.valueOf(accessgetINSTANCEScp.class, str);
        int i4 = onWarmupCompleted + 79;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return accessgetinstancescp;
        }
        throw null;
    }

    public static accessgetINSTANCEScp[] values() {
        accessgetINSTANCEScp[] accessgetinstancescpArr;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 67;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            accessgetinstancescpArr = (accessgetINSTANCEScp[]) $VALUES.clone();
            int i3 = 16 / 0;
        } else {
            accessgetinstancescpArr = (accessgetINSTANCEScp[]) $VALUES.clone();
        }
        int i4 = onWarmupCompleted + 123;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return accessgetinstancescpArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private accessgetINSTANCEScp(String str, int i) {
    }

    static {
        accessgetINSTANCEScp[] accessgetinstancescpArr$values = $values();
        $VALUES = accessgetinstancescpArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(accessgetinstancescpArr$values);
        int i = onExtraCallbackWithResult + 51;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }
}
