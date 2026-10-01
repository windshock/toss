package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdaDx2qqACjxtAdmiOPz_luEHKJmPE {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ r8lambdaDx2qqACjxtAdmiOPz_luEHKJmPE[] $VALUES;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    public static final r8lambdaDx2qqACjxtAdmiOPz_luEHKJmPE self = new r8lambdaDx2qqACjxtAdmiOPz_luEHKJmPE("self", 0);
    public static final r8lambdaDx2qqACjxtAdmiOPz_luEHKJmPE agent = new r8lambdaDx2qqACjxtAdmiOPz_luEHKJmPE("agent", 1);

    private static final /* synthetic */ r8lambdaDx2qqACjxtAdmiOPz_luEHKJmPE[] $values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 61;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return new r8lambdaDx2qqACjxtAdmiOPz_luEHKJmPE[]{self, agent};
        }
        r8lambdaDx2qqACjxtAdmiOPz_luEHKJmPE r8lambdadx2qqacjxtadmiopz_luehkjmpe = self;
        r8lambdaDx2qqACjxtAdmiOPz_luEHKJmPE r8lambdadx2qqacjxtadmiopz_luehkjmpe2 = agent;
        r8lambdaDx2qqACjxtAdmiOPz_luEHKJmPE[] r8lambdadx2qqacjxtadmiopz_luehkjmpeArr = new r8lambdaDx2qqACjxtAdmiOPz_luEHKJmPE[2];
        r8lambdadx2qqacjxtadmiopz_luehkjmpeArr[1] = r8lambdadx2qqacjxtadmiopz_luehkjmpe;
        r8lambdadx2qqacjxtadmiopz_luehkjmpeArr[1] = r8lambdadx2qqacjxtadmiopz_luehkjmpe2;
        return r8lambdadx2qqacjxtadmiopz_luehkjmpeArr;
    }

    public static EnumEntries<r8lambdaDx2qqACjxtAdmiOPz_luEHKJmPE> getEntries() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 71;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        EnumEntries<r8lambdaDx2qqACjxtAdmiOPz_luEHKJmPE> enumEntries = $ENTRIES;
        int i5 = i2 + 67;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }

    public static r8lambdaDx2qqACjxtAdmiOPz_luEHKJmPE valueOf(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 65;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        r8lambdaDx2qqACjxtAdmiOPz_luEHKJmPE r8lambdadx2qqacjxtadmiopz_luehkjmpe = (r8lambdaDx2qqACjxtAdmiOPz_luEHKJmPE) Enum.valueOf(r8lambdaDx2qqACjxtAdmiOPz_luEHKJmPE.class, str);
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = onWarmupCompleted + 33;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return r8lambdadx2qqacjxtadmiopz_luehkjmpe;
        }
        obj.hashCode();
        throw null;
    }

    public static r8lambdaDx2qqACjxtAdmiOPz_luEHKJmPE[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 3;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        r8lambdaDx2qqACjxtAdmiOPz_luEHKJmPE[] r8lambdadx2qqacjxtadmiopz_luehkjmpeArr = $VALUES;
        if (i3 == 0) {
            return (r8lambdaDx2qqACjxtAdmiOPz_luEHKJmPE[]) r8lambdadx2qqacjxtadmiopz_luehkjmpeArr.clone();
        }
        throw null;
    }

    private r8lambdaDx2qqACjxtAdmiOPz_luEHKJmPE(String str, int i) {
    }

    static {
        r8lambdaDx2qqACjxtAdmiOPz_luEHKJmPE[] r8lambdadx2qqacjxtadmiopz_luehkjmpeArr$values = $values();
        $VALUES = r8lambdadx2qqacjxtadmiopz_luehkjmpeArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(r8lambdadx2qqacjxtadmiopz_luehkjmpeArr$values);
        int i = IAuthTabCallback + 23;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }
}
