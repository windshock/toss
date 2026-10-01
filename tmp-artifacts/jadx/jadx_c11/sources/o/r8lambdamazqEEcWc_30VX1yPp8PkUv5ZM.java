package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdamazqEEcWc_30VX1yPp8PkUv5ZM {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ r8lambdamazqEEcWc_30VX1yPp8PkUv5ZM[] $VALUES;
    private static int IAuthTabCallback = 0;
    public static final r8lambdamazqEEcWc_30VX1yPp8PkUv5ZM KR = new r8lambdamazqEEcWc_30VX1yPp8PkUv5ZM("KR", 0);
    public static final r8lambdamazqEEcWc_30VX1yPp8PkUv5ZM US = new r8lambdamazqEEcWc_30VX1yPp8PkUv5ZM("US", 1);
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    private static final /* synthetic */ r8lambdamazqEEcWc_30VX1yPp8PkUv5ZM[] $values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 109;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        r8lambdamazqEEcWc_30VX1yPp8PkUv5ZM[] r8lambdamazqeecwc_30vx1ypp8pkuv5zmArr = {KR, US};
        int i5 = i3 + 89;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return r8lambdamazqeecwc_30vx1ypp8pkuv5zmArr;
    }

    public static EnumEntries<r8lambdamazqEEcWc_30VX1yPp8PkUv5ZM> getEntries() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 17;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        EnumEntries<r8lambdamazqEEcWc_30VX1yPp8PkUv5ZM> enumEntries = $ENTRIES;
        int i5 = i2 + 61;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return enumEntries;
        }
        throw null;
    }

    public static r8lambdamazqEEcWc_30VX1yPp8PkUv5ZM valueOf(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 67;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        r8lambdamazqEEcWc_30VX1yPp8PkUv5ZM r8lambdamazqeecwc_30vx1ypp8pkuv5zm = (r8lambdamazqEEcWc_30VX1yPp8PkUv5ZM) Enum.valueOf(r8lambdamazqEEcWc_30VX1yPp8PkUv5ZM.class, str);
        int i4 = onWarmupCompleted + 55;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 62 / 0;
        }
        return r8lambdamazqeecwc_30vx1ypp8pkuv5zm;
    }

    public static r8lambdamazqEEcWc_30VX1yPp8PkUv5ZM[] values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 99;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        r8lambdamazqEEcWc_30VX1yPp8PkUv5ZM[] r8lambdamazqeecwc_30vx1ypp8pkuv5zmArr = (r8lambdamazqEEcWc_30VX1yPp8PkUv5ZM[]) $VALUES.clone();
        int i4 = onWarmupCompleted + 115;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return r8lambdamazqeecwc_30vx1ypp8pkuv5zmArr;
    }

    private r8lambdamazqEEcWc_30VX1yPp8PkUv5ZM(String str, int i) {
    }

    static {
        r8lambdamazqEEcWc_30VX1yPp8PkUv5ZM[] r8lambdamazqeecwc_30vx1ypp8pkuv5zmArr$values = $values();
        $VALUES = r8lambdamazqeecwc_30vx1ypp8pkuv5zmArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(r8lambdamazqeecwc_30vx1ypp8pkuv5zmArr$values);
        int i = onExtraCallbackWithResult + 75;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
