package im.toss.deeplink;

import kotlin.enums.EnumEntries;
import o.access15300;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class TargetRegion {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TargetRegion[] $VALUES;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final String code;
    public static final TargetRegion ALL = new TargetRegion("ALL", 0, "all");
    public static final TargetRegion GLOBAL = new TargetRegion("GLOBAL", 1, "global");
    public static final TargetRegion KR = new TargetRegion("KR", 2, "kr");
    public static final TargetRegion AU = new TargetRegion("AU", 3, "au");
    public static final TargetRegion EU = new TargetRegion("EU", 4, "eu");

    private static final /* synthetic */ TargetRegion[] $values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 89;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        TargetRegion[] targetRegionArr = {ALL, GLOBAL, KR, AU, EU};
        int i5 = i2 + 95;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return targetRegionArr;
    }

    public static EnumEntries<TargetRegion> getEntries() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 81;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        EnumEntries<TargetRegion> enumEntries = $ENTRIES;
        int i5 = i2 + 61;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return enumEntries;
        }
        throw null;
    }

    public static TargetRegion valueOf(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 103;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        TargetRegion targetRegion = (TargetRegion) Enum.valueOf(TargetRegion.class, str);
        int i4 = IAuthTabCallback + 11;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return targetRegion;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static TargetRegion[] values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 67;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        TargetRegion[] targetRegionArr = (TargetRegion[]) $VALUES.clone();
        int i4 = onNavigationEvent + 101;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return targetRegionArr;
    }

    private TargetRegion(String str, int i, String str2) {
        this.code = str2;
    }

    public final String getCode() {
        String str;
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 121;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.code;
            int i4 = 59 / 0;
        } else {
            str = this.code;
        }
        int i5 = i2 + 95;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    static {
        TargetRegion[] targetRegionArr$values = $values();
        $VALUES = targetRegionArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(targetRegionArr$values);
        int i = onExtraCallback + 115;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
