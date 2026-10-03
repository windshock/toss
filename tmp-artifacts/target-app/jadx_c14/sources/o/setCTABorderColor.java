package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class setCTABorderColor {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ setCTABorderColor[] $VALUES;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public static final setCTABorderColor HOME_DETAIL_ADDRESS = new setCTABorderColor("HOME_DETAIL_ADDRESS", 0);
    public static final setCTABorderColor OFFICE_DETAIL_ADDRESS = new setCTABorderColor("OFFICE_DETAIL_ADDRESS", 1);
    public static final setCTABorderColor OFFICE_PHONE = new setCTABorderColor("OFFICE_PHONE", 2);
    public static final setCTABorderColor OFFICE_NAME = new setCTABorderColor("OFFICE_NAME", 3);

    private static final /* synthetic */ setCTABorderColor[] $values() {
        setCTABorderColor[] setctabordercolorArr;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 121;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 != 0) {
            setCTABorderColor setctabordercolor = HOME_DETAIL_ADDRESS;
            setCTABorderColor setctabordercolor2 = OFFICE_DETAIL_ADDRESS;
            setCTABorderColor setctabordercolor3 = OFFICE_PHONE;
            setCTABorderColor setctabordercolor4 = OFFICE_NAME;
            setctabordercolorArr = new setCTABorderColor[3];
            setctabordercolorArr[0] = setctabordercolor;
            setctabordercolorArr[1] = setctabordercolor2;
            setctabordercolorArr[3] = setctabordercolor3;
            setctabordercolorArr[4] = setctabordercolor4;
        } else {
            setctabordercolorArr = new setCTABorderColor[]{HOME_DETAIL_ADDRESS, OFFICE_DETAIL_ADDRESS, OFFICE_PHONE, OFFICE_NAME};
        }
        int i4 = i3 + 41;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return setctabordercolorArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static EnumEntries<setCTABorderColor> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 33;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        EnumEntries<setCTABorderColor> enumEntries = $ENTRIES;
        int i5 = i3 + 109;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return enumEntries;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static setCTABorderColor valueOf(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 117;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        setCTABorderColor setctabordercolor = (setCTABorderColor) Enum.valueOf(setCTABorderColor.class, str);
        int i4 = onExtraCallbackWithResult + 93;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return setctabordercolor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static setCTABorderColor[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 97;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        setCTABorderColor[] setctabordercolorArr = (setCTABorderColor[]) $VALUES.clone();
        int i4 = onExtraCallbackWithResult + 31;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return setctabordercolorArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private setCTABorderColor(String str, int i) {
    }

    static {
        setCTABorderColor[] setctabordercolorArr$values = $values();
        $VALUES = setctabordercolorArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(setctabordercolorArr$values);
        int i = onWarmupCompleted + 13;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }
}
