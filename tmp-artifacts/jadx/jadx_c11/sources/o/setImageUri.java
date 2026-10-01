package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class setImageUri {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ setImageUri[] $VALUES;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public static final setImageUri SUMMARY = new setImageUri("SUMMARY", 0);
    public static final setImageUri FULL = new setImageUri("FULL", 1);

    private static final /* synthetic */ setImageUri[] $values() {
        setImageUri[] setimageuriArr;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 33;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            setImageUri setimageuri = SUMMARY;
            setImageUri setimageuri2 = FULL;
            setimageuriArr = new setImageUri[5];
            setimageuriArr[0] = setimageuri;
            setimageuriArr[1] = setimageuri2;
        } else {
            setimageuriArr = new setImageUri[]{SUMMARY, FULL};
        }
        int i4 = i2 + 93;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return setimageuriArr;
    }

    public static EnumEntries<setImageUri> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 11;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        EnumEntries<setImageUri> enumEntries = $ENTRIES;
        int i4 = i2 + 65;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return enumEntries;
    }

    public static setImageUri valueOf(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 95;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        setImageUri setimageuri = (setImageUri) Enum.valueOf(setImageUri.class, str);
        int i4 = onWarmupCompleted + 3;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return setimageuri;
        }
        throw null;
    }

    public static setImageUri[] values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 101;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        setImageUri[] setimageuriArr = (setImageUri[]) $VALUES.clone();
        int i4 = onExtraCallbackWithResult + 41;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return setimageuriArr;
    }

    private setImageUri(String str, int i) {
    }

    static {
        setImageUri[] setimageuriArr$values = $values();
        $VALUES = setimageuriArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(setimageuriArr$values);
        int i = IAuthTabCallback + 31;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }
}
