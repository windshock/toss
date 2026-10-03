package viva.republica.toss.network.model.loan;

import kotlin.enums.EnumEntries;
import o.access15300;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class RefinancingStatus {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RefinancingStatus[] $VALUES;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public static final RefinancingStatus INIT = new RefinancingStatus("INIT", 0);
    public static final RefinancingStatus REFINANCING_SYSTEM_IMPOSSIBLE = new RefinancingStatus("REFINANCING_SYSTEM_IMPOSSIBLE", 1);
    public static final RefinancingStatus REFINANCING_CHECK_PENDING = new RefinancingStatus("REFINANCING_CHECK_PENDING", 2);
    public static final RefinancingStatus REFINANCING_CHECK_DONE = new RefinancingStatus("REFINANCING_CHECK_DONE", 3);
    public static final RefinancingStatus REFINANCING_PRE_SCREEN_LOADING = new RefinancingStatus("REFINANCING_PRE_SCREEN_LOADING", 4);
    public static final RefinancingStatus REFINANCING_PRE_SCREEN_DONE = new RefinancingStatus("REFINANCING_PRE_SCREEN_DONE", 5);

    private static final /* synthetic */ RefinancingStatus[] $values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 123;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        RefinancingStatus[] refinancingStatusArr = {INIT, REFINANCING_SYSTEM_IMPOSSIBLE, REFINANCING_CHECK_PENDING, REFINANCING_CHECK_DONE, REFINANCING_PRE_SCREEN_LOADING, REFINANCING_PRE_SCREEN_DONE};
        int i5 = i3 + 77;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return refinancingStatusArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static EnumEntries<RefinancingStatus> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 45;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        EnumEntries<RefinancingStatus> enumEntries = $ENTRIES;
        int i5 = i2 + 47;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 98 / 0;
        }
        return enumEntries;
    }

    public static RefinancingStatus valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 123;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        RefinancingStatus refinancingStatus = (RefinancingStatus) Enum.valueOf(RefinancingStatus.class, str);
        int i4 = onNavigationEvent + 85;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return refinancingStatus;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static RefinancingStatus[] values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 15;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        RefinancingStatus[] refinancingStatusArr = (RefinancingStatus[]) $VALUES.clone();
        int i4 = onExtraCallbackWithResult + 117;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return refinancingStatusArr;
    }

    private RefinancingStatus(String str, int i) {
    }

    static {
        RefinancingStatus[] refinancingStatusArr$values = $values();
        $VALUES = refinancingStatusArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(refinancingStatusArr$values);
        int i = onWarmupCompleted + 125;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public final boolean isLoading() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 85;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        if (this != REFINANCING_PRE_SCREEN_LOADING) {
            return false;
        }
        int i5 = i3 + 119;
        onExtraCallbackWithResult = i5 % 128;
        return i5 % 2 != 0;
    }

    public final boolean isDone() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 11;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        if (this != REFINANCING_PRE_SCREEN_DONE) {
            return false;
        }
        int i5 = i3 + 97;
        onNavigationEvent = i5 % 128;
        return i5 % 2 == 0;
    }
}
