package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class authenticate {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ authenticate[] $VALUES;
    private static int IAuthTabCallback = 1;
    public static final authenticate IN = new authenticate("IN", 0);
    public static final authenticate OUT = new authenticate("OUT", 1);
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    private static final /* synthetic */ authenticate[] $values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 121;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        authenticate authenticateVar = IN;
        if (i3 != 0) {
            return new authenticate[]{authenticateVar, OUT};
        }
        authenticate authenticateVar2 = OUT;
        authenticate[] authenticateVarArr = new authenticate[3];
        authenticateVarArr[0] = authenticateVar;
        authenticateVarArr[0] = authenticateVar2;
        return authenticateVarArr;
    }

    public static EnumEntries<authenticate> getEntries() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 113;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        EnumEntries<authenticate> enumEntries = $ENTRIES;
        if (i3 == 0) {
            int i4 = 5 / 0;
        }
        return enumEntries;
    }

    public static authenticate valueOf(String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 55;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        authenticate authenticateVar = (authenticate) Enum.valueOf(authenticate.class, str);
        int i4 = onNavigationEvent + 107;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return authenticateVar;
    }

    public static authenticate[] values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 99;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        authenticate[] authenticateVarArr = (authenticate[]) $VALUES.clone();
        int i3 = IAuthTabCallback + 35;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 71 / 0;
        }
        return authenticateVarArr;
    }

    private authenticate(String str, int i) {
    }

    static {
        authenticate[] authenticateVarArr$values = $values();
        $VALUES = authenticateVarArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(authenticateVarArr$values);
        int i = onExtraCallback + 49;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }
}
