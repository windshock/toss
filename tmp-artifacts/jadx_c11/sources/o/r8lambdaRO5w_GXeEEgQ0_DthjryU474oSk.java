package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdaRO5w_GXeEEgQ0_DthjryU474oSk {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ r8lambdaRO5w_GXeEEgQ0_DthjryU474oSk[] $VALUES;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public static final r8lambdaRO5w_GXeEEgQ0_DthjryU474oSk YOUTH = new r8lambdaRO5w_GXeEEgQ0_DthjryU474oSk("YOUTH", 0);
    public static final r8lambdaRO5w_GXeEEgQ0_DthjryU474oSk LEGAL_REPRESENTATION = new r8lambdaRO5w_GXeEEgQ0_DthjryU474oSk("LEGAL_REPRESENTATION", 1);

    private static final /* synthetic */ r8lambdaRO5w_GXeEEgQ0_DthjryU474oSk[] $values() {
        r8lambdaRO5w_GXeEEgQ0_DthjryU474oSk[] r8lambdaro5w_gxeeegq0_dthjryu474oskArr;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 57;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            r8lambdaRO5w_GXeEEgQ0_DthjryU474oSk r8lambdaro5w_gxeeegq0_dthjryu474osk = YOUTH;
            r8lambdaRO5w_GXeEEgQ0_DthjryU474oSk r8lambdaro5w_gxeeegq0_dthjryu474osk2 = LEGAL_REPRESENTATION;
            r8lambdaro5w_gxeeegq0_dthjryu474oskArr = new r8lambdaRO5w_GXeEEgQ0_DthjryU474oSk[5];
            r8lambdaro5w_gxeeegq0_dthjryu474oskArr[1] = r8lambdaro5w_gxeeegq0_dthjryu474osk;
            r8lambdaro5w_gxeeegq0_dthjryu474oskArr[1] = r8lambdaro5w_gxeeegq0_dthjryu474osk2;
        } else {
            r8lambdaro5w_gxeeegq0_dthjryu474oskArr = new r8lambdaRO5w_GXeEEgQ0_DthjryU474oSk[]{YOUTH, LEGAL_REPRESENTATION};
        }
        int i4 = i2 + 99;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return r8lambdaro5w_gxeeegq0_dthjryu474oskArr;
    }

    public static EnumEntries<r8lambdaRO5w_GXeEEgQ0_DthjryU474oSk> getEntries() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 99;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        EnumEntries<r8lambdaRO5w_GXeEEgQ0_DthjryU474oSk> enumEntries = $ENTRIES;
        int i4 = i3 + 113;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return enumEntries;
        }
        obj.hashCode();
        throw null;
    }

    public static r8lambdaRO5w_GXeEEgQ0_DthjryU474oSk valueOf(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 11;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        r8lambdaRO5w_GXeEEgQ0_DthjryU474oSk r8lambdaro5w_gxeeegq0_dthjryu474osk = (r8lambdaRO5w_GXeEEgQ0_DthjryU474oSk) Enum.valueOf(r8lambdaRO5w_GXeEEgQ0_DthjryU474oSk.class, str);
        int i4 = IAuthTabCallback + 81;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return r8lambdaro5w_gxeeegq0_dthjryu474osk;
    }

    public static r8lambdaRO5w_GXeEEgQ0_DthjryU474oSk[] values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 29;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        r8lambdaRO5w_GXeEEgQ0_DthjryU474oSk[] r8lambdaro5w_gxeeegq0_dthjryu474oskArr = (r8lambdaRO5w_GXeEEgQ0_DthjryU474oSk[]) $VALUES.clone();
        int i4 = IAuthTabCallback + 77;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 20 / 0;
        }
        return r8lambdaro5w_gxeeegq0_dthjryu474oskArr;
    }

    private r8lambdaRO5w_GXeEEgQ0_DthjryU474oSk(String str, int i) {
    }

    static {
        r8lambdaRO5w_GXeEEgQ0_DthjryU474oSk[] r8lambdaro5w_gxeeegq0_dthjryu474oskArr$values = $values();
        $VALUES = r8lambdaro5w_gxeeegq0_dthjryu474oskArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(r8lambdaro5w_gxeeegq0_dthjryu474oskArr$values);
        int i = onWarmupCompleted + 5;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }
}
