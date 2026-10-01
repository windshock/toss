package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFe1jSDKAFa1tSDK {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AFe1jSDKAFa1tSDK[] $VALUES;
    public static final AFe1jSDKAFa1tSDK COMPOSABLE_PERFORMANCE_TRACKER_ENABLED;
    public static final AFe1jSDKAFa1tSDK EMPLOYEE_API_ENABLED;
    private static int IAuthTabCallback = 1;
    public static final AFe1jSDKAFa1tSDK JANK_STATS_RUM_ENABLED;
    public static final AFe1jSDKAFa1tSDK JANK_STATS_SECTION_ENABLED;
    public static final AFe1jSDKAFa1tSDK MICRO_MTS_STOCK_DETAIL_OPEN;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    private final String distributionId;
    private final AFe1jSDK3 target;

    private static final /* synthetic */ AFe1jSDKAFa1tSDK[] $values() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 43;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        AFe1jSDKAFa1tSDK[] aFe1jSDKAFa1tSDKArr = {COMPOSABLE_PERFORMANCE_TRACKER_ENABLED, MICRO_MTS_STOCK_DETAIL_OPEN, EMPLOYEE_API_ENABLED, JANK_STATS_RUM_ENABLED, JANK_STATS_SECTION_ENABLED};
        int i5 = i2 + 89;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return aFe1jSDKAFa1tSDKArr;
    }

    public static EnumEntries<AFe1jSDKAFa1tSDK> getEntries() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 15;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        EnumEntries<AFe1jSDKAFa1tSDK> enumEntries = $ENTRIES;
        if (i3 != 0) {
            int i4 = 69 / 0;
        }
        return enumEntries;
    }

    public static AFe1jSDKAFa1tSDK valueOf(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 103;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        AFe1jSDKAFa1tSDK aFe1jSDKAFa1tSDK = (AFe1jSDKAFa1tSDK) Enum.valueOf(AFe1jSDKAFa1tSDK.class, str);
        int i4 = IAuthTabCallback + 11;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 68 / 0;
        }
        return aFe1jSDKAFa1tSDK;
    }

    public static AFe1jSDKAFa1tSDK[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 109;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        AFe1jSDKAFa1tSDK[] aFe1jSDKAFa1tSDKArr = (AFe1jSDKAFa1tSDK[]) $VALUES.clone();
        int i4 = IAuthTabCallback + 11;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return aFe1jSDKAFa1tSDKArr;
    }

    private AFe1jSDKAFa1tSDK(String str, int i, String str2, AFe1jSDK3 aFe1jSDK3) {
        this.distributionId = str2;
        this.target = aFe1jSDK3;
    }

    public final String getDistributionId() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 63;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        String str = this.distributionId;
        int i5 = i3 + 81;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 36 / 0;
        }
        return str;
    }

    public final AFe1jSDK3 getTarget() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 81;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        AFe1jSDK3 aFe1jSDK3 = this.target;
        int i4 = i3 + 85;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return aFe1jSDK3;
        }
        throw null;
    }

    static {
        AFe1jSDK3 aFe1jSDK3 = AFe1jSDK3.DeviceIdAndGa;
        COMPOSABLE_PERFORMANCE_TRACKER_ENABLED = new AFe1jSDKAFa1tSDK("COMPOSABLE_PERFORMANCE_TRACKER_ENABLED", 0, "android.composable.performance.tracker", aFe1jSDK3);
        MICRO_MTS_STOCK_DETAIL_OPEN = new AFe1jSDKAFa1tSDK("MICRO_MTS_STOCK_DETAIL_OPEN", 1, "microMts.stockDetail.open", aFe1jSDK3);
        EMPLOYEE_API_ENABLED = new AFe1jSDKAFa1tSDK("EMPLOYEE_API_ENABLED", 2, "employee.api.enabled", aFe1jSDK3);
        JANK_STATS_RUM_ENABLED = new AFe1jSDKAFa1tSDK("JANK_STATS_RUM_ENABLED", 3, "android.jankstats.rum", aFe1jSDK3);
        JANK_STATS_SECTION_ENABLED = new AFe1jSDKAFa1tSDK("JANK_STATS_SECTION_ENABLED", 4, "android.jankstats.section", aFe1jSDK3);
        AFe1jSDKAFa1tSDK[] aFe1jSDKAFa1tSDKArr$values = $values();
        $VALUES = aFe1jSDKAFa1tSDKArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(aFe1jSDKAFa1tSDKArr$values);
        int i = onWarmupCompleted + 79;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }
}
