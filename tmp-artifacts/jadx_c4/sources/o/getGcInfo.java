package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getGcInfo {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ getGcInfo[] $VALUES;
    private static int IAuthTabCallback = 0;
    public static final getGcInfo LOWEST_INTEREST_RATE = new getGcInfo("LOWEST_INTEREST_RATE", 0);
    public static final getGcInfo MAX_LIMIT = new getGcInfo("MAX_LIMIT", 1);
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    private static final /* synthetic */ getGcInfo[] $values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 65;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        getGcInfo[] getgcinfoArr = {LOWEST_INTEREST_RATE, MAX_LIMIT};
        int i5 = i2 + 79;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return getgcinfoArr;
    }

    public static EnumEntries<getGcInfo> getEntries() {
        EnumEntries<getGcInfo> enumEntries;
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 103;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            enumEntries = $ENTRIES;
            int i4 = 37 / 0;
        } else {
            enumEntries = $ENTRIES;
        }
        int i5 = i2 + 123;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return enumEntries;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static getGcInfo valueOf(String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 89;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        getGcInfo getgcinfo = (getGcInfo) Enum.valueOf(getGcInfo.class, str);
        if (i3 != 0) {
            int i4 = 85 / 0;
        }
        int i5 = IAuthTabCallback + 43;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return getgcinfo;
    }

    public static getGcInfo[] values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 19;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        getGcInfo[] getgcinfoArr = $VALUES;
        if (i3 == 0) {
            return (getGcInfo[]) getgcinfoArr.clone();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private getGcInfo(String str, int i) {
    }

    static {
        getGcInfo[] getgcinfoArr$values = $values();
        $VALUES = getgcinfoArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(getgcinfoArr$values);
        int i = onWarmupCompleted + 33;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }
}
