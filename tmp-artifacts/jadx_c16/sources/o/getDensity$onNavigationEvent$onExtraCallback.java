package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class getDensity$onNavigationEvent$onExtraCallback {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ getDensity$onNavigationEvent$onExtraCallback[] $VALUES;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public static final getDensity$onNavigationEvent$onExtraCallback Transaction = new getDensity$onNavigationEvent$onExtraCallback("Transaction", 0);
    public static final getDensity$onNavigationEvent$onExtraCallback Saving = new getDensity$onNavigationEvent$onExtraCallback("Saving", 1);
    public static final getDensity$onNavigationEvent$onExtraCallback Investment = new getDensity$onNavigationEvent$onExtraCallback("Investment", 2);
    public static final getDensity$onNavigationEvent$onExtraCallback Pension = new getDensity$onNavigationEvent$onExtraCallback("Pension", 3);

    private static final /* synthetic */ getDensity$onNavigationEvent$onExtraCallback[] $values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 103;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        getDensity$onNavigationEvent$onExtraCallback[] getdensity_onnavigationevent_onextracallbackArr = {Transaction, Saving, Investment, Pension};
        int i5 = i2 + 43;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return getdensity_onnavigationevent_onextracallbackArr;
    }

    public static EnumEntries<getDensity$onNavigationEvent$onExtraCallback> getEntries() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 11;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        EnumEntries<getDensity$onNavigationEvent$onExtraCallback> enumEntries = $ENTRIES;
        int i4 = i3 + 111;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 77 / 0;
        }
        return enumEntries;
    }

    public static getDensity$onNavigationEvent$onExtraCallback valueOf(String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 101;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        getDensity$onNavigationEvent$onExtraCallback getdensity_onnavigationevent_onextracallback = (getDensity$onNavigationEvent$onExtraCallback) Enum.valueOf(getDensity$onNavigationEvent$onExtraCallback.class, str);
        int i4 = onNavigationEvent + 63;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return getdensity_onnavigationevent_onextracallback;
    }

    public static getDensity$onNavigationEvent$onExtraCallback[] values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 41;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        getDensity$onNavigationEvent$onExtraCallback[] getdensity_onnavigationevent_onextracallbackArr = $VALUES;
        if (i3 == 0) {
            return (getDensity$onNavigationEvent$onExtraCallback[]) getdensity_onnavigationevent_onextracallbackArr.clone();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private getDensity$onNavigationEvent$onExtraCallback(String str, int i) {
    }

    static {
        getDensity$onNavigationEvent$onExtraCallback[] getdensity_onnavigationevent_onextracallbackArr$values = $values();
        $VALUES = getdensity_onnavigationevent_onextracallbackArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(getdensity_onnavigationevent_onextracallbackArr$values);
        int i = IAuthTabCallback + 105;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }
}
