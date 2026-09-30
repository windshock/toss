package im.toss.tosssecurities.uikit.dnd;

import kotlin.enums.EnumEntries;
import o.access15300;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class RegionDropPosition {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RegionDropPosition[] $VALUES;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    public static final RegionDropPosition Before = new RegionDropPosition("Before", 0);
    public static final RegionDropPosition After = new RegionDropPosition("After", 1);

    private static final /* synthetic */ RegionDropPosition[] $values() {
        RegionDropPosition[] regionDropPositionArr;
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 9;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            RegionDropPosition regionDropPosition = Before;
            RegionDropPosition regionDropPosition2 = After;
            regionDropPositionArr = new RegionDropPosition[5];
            regionDropPositionArr[1] = regionDropPosition;
            regionDropPositionArr[1] = regionDropPosition2;
        } else {
            regionDropPositionArr = new RegionDropPosition[]{Before, After};
        }
        int i4 = i2 + 13;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 66 / 0;
        }
        return regionDropPositionArr;
    }

    public static EnumEntries<RegionDropPosition> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 9;
        onWarmupCompleted = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        EnumEntries<RegionDropPosition> enumEntries = $ENTRIES;
        int i4 = i2 + 81;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return enumEntries;
        }
        obj.hashCode();
        throw null;
    }

    public static RegionDropPosition valueOf(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 69;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        RegionDropPosition regionDropPosition = (RegionDropPosition) Enum.valueOf(RegionDropPosition.class, str);
        if (i3 != 0) {
            throw null;
        }
        int i4 = onWarmupCompleted + 3;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return regionDropPosition;
    }

    public static RegionDropPosition[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 67;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        RegionDropPosition[] regionDropPositionArr = $VALUES;
        if (i3 != 0) {
            return (RegionDropPosition[]) regionDropPositionArr.clone();
        }
        int i4 = 14 / 0;
        return (RegionDropPosition[]) regionDropPositionArr.clone();
    }

    static {
        RegionDropPosition[] regionDropPositionArr$values = $values();
        $VALUES = regionDropPositionArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(regionDropPositionArr$values);
        int i = IAuthTabCallback + 5;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    private RegionDropPosition(String str, int i) {
    }
}
