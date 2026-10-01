package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getIconSize {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ getIconSize[] $VALUES;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    public static final getIconSize NotDetermined = new getIconSize("NotDetermined", 0);
    public static final getIconSize Granted = new getIconSize("Granted", 1);
    public static final getIconSize Revoked = new getIconSize("Revoked", 2);

    private static final /* synthetic */ getIconSize[] $values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 1;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        getIconSize geticonsize = NotDetermined;
        if (i3 != 0) {
            return new getIconSize[]{geticonsize, Granted, Revoked};
        }
        getIconSize geticonsize2 = Granted;
        getIconSize geticonsize3 = Revoked;
        getIconSize[] geticonsizeArr = new getIconSize[4];
        geticonsizeArr[1] = geticonsize;
        geticonsizeArr[1] = geticonsize2;
        geticonsizeArr[5] = geticonsize3;
        return geticonsizeArr;
    }

    public static EnumEntries<getIconSize> getEntries() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 59;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        EnumEntries<getIconSize> enumEntries = $ENTRIES;
        int i5 = i3 + 29;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return enumEntries;
        }
        throw null;
    }

    public static getIconSize valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 43;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        getIconSize geticonsize = (getIconSize) Enum.valueOf(getIconSize.class, str);
        if (i3 != 0) {
            int i4 = 3 / 0;
        }
        return geticonsize;
    }

    public static getIconSize[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 3;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        getIconSize[] geticonsizeArr = $VALUES;
        if (i3 == 0) {
            return (getIconSize[]) geticonsizeArr.clone();
        }
        throw null;
    }

    private getIconSize(String str, int i) {
    }

    static {
        getIconSize[] geticonsizeArr$values = $values();
        $VALUES = geticonsizeArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(geticonsizeArr$values);
        int i = onWarmupCompleted + 35;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }
}
