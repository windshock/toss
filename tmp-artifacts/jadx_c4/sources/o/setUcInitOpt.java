package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class setUcInitOpt {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ setUcInitOpt[] $VALUES;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    public static final setUcInitOpt CREDIT_SERVICE = new setUcInitOpt("CREDIT_SERVICE", 0);
    public static final setUcInitOpt KCB = new setUcInitOpt("KCB", 1);
    public static final setUcInitOpt NICE = new setUcInitOpt("NICE", 2);
    public static final setUcInitOpt KCB_SCORE_RAISE = new setUcInitOpt("KCB_SCORE_RAISE", 3);
    public static final setUcInitOpt NICE_SCORE_RAISE = new setUcInitOpt("NICE_SCORE_RAISE", 4);
    public static final setUcInitOpt CSS = new setUcInitOpt("CSS", 5);

    private static final /* synthetic */ setUcInitOpt[] $values() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 69;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        setUcInitOpt[] setucinitoptArr = {CREDIT_SERVICE, KCB, NICE, KCB_SCORE_RAISE, NICE_SCORE_RAISE, CSS};
        int i5 = i2 + 87;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 7 / 0;
        }
        return setucinitoptArr;
    }

    public static EnumEntries<setUcInitOpt> getEntries() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 11;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        EnumEntries<setUcInitOpt> enumEntries = $ENTRIES;
        int i4 = i3 + 3;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return enumEntries;
        }
        throw null;
    }

    public static setUcInitOpt valueOf(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 115;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        setUcInitOpt setucinitopt = (setUcInitOpt) Enum.valueOf(setUcInitOpt.class, str);
        if (i3 == 0) {
            int i4 = 86 / 0;
        }
        int i5 = onExtraCallback + 81;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 15 / 0;
        }
        return setucinitopt;
    }

    public static setUcInitOpt[] values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 1;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        setUcInitOpt[] setucinitoptArr = (setUcInitOpt[]) $VALUES.clone();
        int i4 = onExtraCallback + 43;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return setucinitoptArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private setUcInitOpt(String str, int i) {
    }

    static {
        setUcInitOpt[] setucinitoptArr$values = $values();
        $VALUES = setucinitoptArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(setucinitoptArr$values);
        int i = IAuthTabCallback + 85;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }
}
