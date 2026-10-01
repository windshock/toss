package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getPivotY {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ getPivotY[] $VALUES;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    private final String id;
    public static final getPivotY BENEFIT_LIST_1 = new getPivotY("BENEFIT_LIST_1", 0, "list_1");
    public static final getPivotY BENEFIT_LIST_2 = new getPivotY("BENEFIT_LIST_2", 1, "list_2");
    public static final getPivotY BENEFIT_FEED = new getPivotY("BENEFIT_FEED", 2, "feed");

    private static final /* synthetic */ getPivotY[] $values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 87;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return new getPivotY[]{BENEFIT_LIST_1, BENEFIT_LIST_2, BENEFIT_FEED};
        }
        getPivotY getpivoty = BENEFIT_LIST_1;
        getPivotY getpivoty2 = BENEFIT_LIST_2;
        getPivotY getpivoty3 = BENEFIT_FEED;
        getPivotY[] getpivotyArr = new getPivotY[5];
        getpivotyArr[1] = getpivoty;
        getpivotyArr[0] = getpivoty2;
        getpivotyArr[2] = getpivoty3;
        return getpivotyArr;
    }

    public static EnumEntries<getPivotY> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 103;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return $ENTRIES;
        }
        throw null;
    }

    public static getPivotY valueOf(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 23;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        getPivotY getpivoty = (getPivotY) Enum.valueOf(getPivotY.class, str);
        if (i3 == 0) {
            return getpivoty;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static getPivotY[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 5;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        getPivotY[] getpivotyArr = $VALUES;
        if (i3 != 0) {
            return (getPivotY[]) getpivotyArr.clone();
        }
        int i4 = 91 / 0;
        return (getPivotY[]) getpivotyArr.clone();
    }

    private getPivotY(String str, int i, String str2) {
        this.id = str2;
    }

    public final String getId() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 35;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        String str = this.id;
        if (i3 == 0) {
            int i4 = 92 / 0;
        }
        return str;
    }

    static {
        getPivotY[] getpivotyArr$values = $values();
        $VALUES = getpivotyArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(getpivotyArr$values);
        int i = onNavigationEvent + 77;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }
}
