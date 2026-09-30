package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class hc {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ hc[] $VALUES;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    public static final hc WarmupTimeout = new hc("WarmupTimeout", 0);
    public static final hc WarmupFailed = new hc("WarmupFailed", 1);

    private static final /* synthetic */ hc[] $values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 93;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        hc hcVar = WarmupTimeout;
        if (i3 == 0) {
            return new hc[]{hcVar, WarmupFailed};
        }
        hc hcVar2 = WarmupFailed;
        hc[] hcVarArr = new hc[4];
        hcVarArr[0] = hcVar;
        hcVarArr[0] = hcVar2;
        return hcVarArr;
    }

    public static EnumEntries<hc> getEntries() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 91;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return $ENTRIES;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static hc valueOf(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 77;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        hc hcVar = (hc) Enum.valueOf(hc.class, str);
        int i4 = onNavigationEvent + 95;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return hcVar;
    }

    public static hc[] values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 95;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        hc[] hcVarArr = (hc[]) $VALUES.clone();
        int i3 = IAuthTabCallback + 3;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 54 / 0;
        }
        return hcVarArr;
    }

    private hc(String str, int i) {
    }

    static {
        hc[] hcVarArr$values = $values();
        $VALUES = hcVarArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(hcVarArr$values);
        int i = onExtraCallback + 35;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            int i2 = 54 / 0;
        }
    }
}
