package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getLastRunInfo {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ getLastRunInfo[] $VALUES;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    private final String value;
    public static final getLastRunInfo StateChanged = new getLastRunInfo("StateChanged", 0, "state_changed");
    public static final getLastRunInfo ServiceRequest = new getLastRunInfo("ServiceRequest", 1, "service_request");
    public static final getLastRunInfo ErrorRetry = new getLastRunInfo("ErrorRetry", 2, "error_retry");

    private static final /* synthetic */ getLastRunInfo[] $values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 77;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        getLastRunInfo[] getlastruninfoArr = {StateChanged, ServiceRequest, ErrorRetry};
        int i5 = i2 + 63;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return getlastruninfoArr;
    }

    public static EnumEntries<getLastRunInfo> getEntries() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 71;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return $ENTRIES;
        }
        throw null;
    }

    public static getLastRunInfo valueOf(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 47;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        getLastRunInfo getlastruninfo = (getLastRunInfo) Enum.valueOf(getLastRunInfo.class, str);
        int i4 = onWarmupCompleted + 33;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return getlastruninfo;
    }

    public static getLastRunInfo[] values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 15;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        getLastRunInfo[] getlastruninfoArr = (getLastRunInfo[]) $VALUES.clone();
        int i4 = onWarmupCompleted + 27;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return getlastruninfoArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private getLastRunInfo(String str, int i, String str2) {
        this.value = str2;
    }

    public final String getValue() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 59;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = this.value;
        int i5 = i3 + 35;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        getLastRunInfo[] getlastruninfoArr$values = $values();
        $VALUES = getlastruninfoArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(getlastruninfoArr$values);
        int i = onNavigationEvent + 75;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }
}
