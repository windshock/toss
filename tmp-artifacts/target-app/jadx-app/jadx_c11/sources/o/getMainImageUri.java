package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class getMainImageUri {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ getMainImageUri[] $VALUES;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public static final getMainImageUri Up = new getMainImageUri("Up", 0);
    public static final getMainImageUri Down = new getMainImageUri("Down", 1);

    private static final /* synthetic */ getMainImageUri[] $values() {
        getMainImageUri[] getmainimageuriArr;
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 59;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            getMainImageUri getmainimageuri = Up;
            getMainImageUri getmainimageuri2 = Down;
            getmainimageuriArr = new getMainImageUri[5];
            getmainimageuriArr[0] = getmainimageuri;
            getmainimageuriArr[0] = getmainimageuri2;
        } else {
            getmainimageuriArr = new getMainImageUri[]{Up, Down};
        }
        int i4 = i2 + 33;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return getmainimageuriArr;
    }

    public static EnumEntries<getMainImageUri> getEntries() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 107;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        EnumEntries<getMainImageUri> enumEntries = $ENTRIES;
        int i5 = i2 + 17;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 6 / 0;
        }
        return enumEntries;
    }

    public static getMainImageUri valueOf(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 77;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        getMainImageUri getmainimageuri = (getMainImageUri) Enum.valueOf(getMainImageUri.class, str);
        if (i3 != 0) {
            int i4 = 98 / 0;
        }
        return getmainimageuri;
    }

    public static getMainImageUri[] values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 3;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        getMainImageUri[] getmainimageuriArr = $VALUES;
        if (i3 != 0) {
            return (getMainImageUri[]) getmainimageuriArr.clone();
        }
        int i4 = 60 / 0;
        return (getMainImageUri[]) getmainimageuriArr.clone();
    }

    static {
        getMainImageUri[] getmainimageuriArr$values = $values();
        $VALUES = getmainimageuriArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(getmainimageuriArr$values);
        int i = onExtraCallback + 49;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            int i2 = 38 / 0;
        }
    }

    private getMainImageUri(String str, int i) {
    }
}
