package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class MapIteratorHelper {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MapIteratorHelper[] $VALUES;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted = 1;
    public static final MapIteratorHelper ELEMENTARY = new MapIteratorHelper("ELEMENTARY", 0);
    public static final MapIteratorHelper MIDDLE = new MapIteratorHelper("MIDDLE", 1);
    public static final MapIteratorHelper HIGH = new MapIteratorHelper("HIGH", 2);
    public static final MapIteratorHelper SPECIAL_EDUCATION = new MapIteratorHelper("SPECIAL_EDUCATION", 3);

    private static final /* synthetic */ MapIteratorHelper[] $values() {
        MapIteratorHelper[] mapIteratorHelperArr;
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 19;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            MapIteratorHelper mapIteratorHelper = ELEMENTARY;
            MapIteratorHelper mapIteratorHelper2 = MIDDLE;
            MapIteratorHelper mapIteratorHelper3 = HIGH;
            MapIteratorHelper mapIteratorHelper4 = SPECIAL_EDUCATION;
            mapIteratorHelperArr = new MapIteratorHelper[3];
            mapIteratorHelperArr[1] = mapIteratorHelper;
            mapIteratorHelperArr[1] = mapIteratorHelper2;
            mapIteratorHelperArr[5] = mapIteratorHelper3;
            mapIteratorHelperArr[3] = mapIteratorHelper4;
        } else {
            mapIteratorHelperArr = new MapIteratorHelper[]{ELEMENTARY, MIDDLE, HIGH, SPECIAL_EDUCATION};
        }
        int i4 = i2 + 25;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return mapIteratorHelperArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static EnumEntries<MapIteratorHelper> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 55;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        EnumEntries<MapIteratorHelper> enumEntries = $ENTRIES;
        if (i3 != 0) {
            int i4 = 15 / 0;
        }
        return enumEntries;
    }

    public static MapIteratorHelper valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 49;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        MapIteratorHelper mapIteratorHelper = (MapIteratorHelper) Enum.valueOf(MapIteratorHelper.class, str);
        int i4 = onExtraCallbackWithResult + 87;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return mapIteratorHelper;
        }
        throw null;
    }

    public static MapIteratorHelper[] values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 87;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        MapIteratorHelper[] mapIteratorHelperArr = (MapIteratorHelper[]) $VALUES.clone();
        int i4 = IAuthTabCallback + 47;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return mapIteratorHelperArr;
    }

    private MapIteratorHelper(String str, int i) {
    }

    static {
        MapIteratorHelper[] mapIteratorHelperArr$values = $values();
        $VALUES = mapIteratorHelperArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(mapIteratorHelperArr$values);
        int i = onWarmupCompleted + 79;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }
}
