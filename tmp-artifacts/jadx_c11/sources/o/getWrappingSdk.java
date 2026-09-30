package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class getWrappingSdk {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ getWrappingSdk[] $VALUES;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onWarmupCompleted;
    public static final getWrappingSdk Down = new getWrappingSdk("Down", 0);
    public static final getWrappingSdk Up = new getWrappingSdk("Up", 1);
    public static final getWrappingSdk Cancel = new getWrappingSdk("Cancel", 2);

    private static final /* synthetic */ getWrappingSdk[] $values() {
        getWrappingSdk[] getwrappingsdkArr;
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 5;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            getWrappingSdk getwrappingsdk = Down;
            getWrappingSdk getwrappingsdk2 = Up;
            getWrappingSdk getwrappingsdk3 = Cancel;
            getwrappingsdkArr = new getWrappingSdk[4];
            getwrappingsdkArr[0] = getwrappingsdk;
            getwrappingsdkArr[0] = getwrappingsdk2;
            getwrappingsdkArr[5] = getwrappingsdk3;
        } else {
            getwrappingsdkArr = new getWrappingSdk[]{Down, Up, Cancel};
        }
        int i4 = i2 + 107;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return getwrappingsdkArr;
    }

    public static EnumEntries<getWrappingSdk> getEntries() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 9;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        EnumEntries<getWrappingSdk> enumEntries = $ENTRIES;
        if (i3 != 0) {
            int i4 = 87 / 0;
        }
        return enumEntries;
    }

    public static getWrappingSdk valueOf(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 21;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        getWrappingSdk getwrappingsdk = (getWrappingSdk) Enum.valueOf(getWrappingSdk.class, str);
        if (i3 == 0) {
            return getwrappingsdk;
        }
        throw null;
    }

    public static getWrappingSdk[] values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 39;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        getWrappingSdk[] getwrappingsdkArr = (getWrappingSdk[]) $VALUES.clone();
        int i4 = IAuthTabCallback + 25;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return getwrappingsdkArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        getWrappingSdk[] getwrappingsdkArr$values = $values();
        $VALUES = getwrappingsdkArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(getwrappingsdkArr$values);
        int i = onExtraCallbackWithResult + 43;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            int i2 = 36 / 0;
        }
    }

    private getWrappingSdk(String str, int i) {
    }
}
