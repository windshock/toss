package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class networkInfoOpt {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ networkInfoOpt[] $VALUES;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final String logParam;
    public static final networkInfoOpt UP = new networkInfoOpt("UP", 0, "score_raise");
    public static final networkInfoOpt DOWN = new networkInfoOpt("DOWN", 1, "score_fall");
    public static final networkInfoOpt SAME = new networkInfoOpt("SAME", 2, "score");

    private static final /* synthetic */ networkInfoOpt[] $values() {
        networkInfoOpt[] networkinfooptArr;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 101;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 != 0) {
            networkInfoOpt networkinfoopt = UP;
            networkInfoOpt networkinfoopt2 = DOWN;
            networkInfoOpt networkinfoopt3 = SAME;
            networkinfooptArr = new networkInfoOpt[3];
            networkinfooptArr[0] = networkinfoopt;
            networkinfooptArr[1] = networkinfoopt2;
            networkinfooptArr[4] = networkinfoopt3;
        } else {
            networkinfooptArr = new networkInfoOpt[]{UP, DOWN, SAME};
        }
        int i4 = i3 + 121;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return networkinfooptArr;
    }

    public static EnumEntries<networkInfoOpt> getEntries() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 43;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        EnumEntries<networkInfoOpt> enumEntries = $ENTRIES;
        int i5 = i2 + 33;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }

    public static networkInfoOpt valueOf(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 65;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        networkInfoOpt networkinfoopt = (networkInfoOpt) Enum.valueOf(networkInfoOpt.class, str);
        int i4 = IAuthTabCallback + 33;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return networkinfoopt;
        }
        throw null;
    }

    public static networkInfoOpt[] values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 95;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        networkInfoOpt[] networkinfooptArr = (networkInfoOpt[]) $VALUES.clone();
        int i4 = onWarmupCompleted + 9;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return networkinfooptArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private networkInfoOpt(String str, int i, String str2) {
        this.logParam = str2;
    }

    public final String getLogParam() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 69;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return this.logParam;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        networkInfoOpt[] networkinfooptArr$values = $values();
        $VALUES = networkinfooptArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(networkinfooptArr$values);
        int i = onNavigationEvent + 85;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            int i2 = 51 / 0;
        }
    }
}
