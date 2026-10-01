package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class setIconImageResource {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ setIconImageResource[] $VALUES;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public static final setIconImageResource KR = new setIconImageResource("KR", 0);
    public static final setIconImageResource AU = new setIconImageResource("AU", 1);
    public static final setIconImageResource EU = new setIconImageResource("EU", 2);

    private static final /* synthetic */ setIconImageResource[] $values() {
        setIconImageResource[] seticonimageresourceArr;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 69;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 == 0) {
            setIconImageResource seticonimageresource = KR;
            setIconImageResource seticonimageresource2 = AU;
            setIconImageResource seticonimageresource3 = EU;
            seticonimageresourceArr = new setIconImageResource[4];
            seticonimageresourceArr[1] = seticonimageresource;
            seticonimageresourceArr[0] = seticonimageresource2;
            seticonimageresourceArr[4] = seticonimageresource3;
        } else {
            seticonimageresourceArr = new setIconImageResource[]{KR, AU, EU};
        }
        int i4 = i3 + 95;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return seticonimageresourceArr;
        }
        throw null;
    }

    public static EnumEntries<setIconImageResource> getEntries() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 81;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        EnumEntries<setIconImageResource> enumEntries = $ENTRIES;
        int i5 = i3 + 49;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }

    public static setIconImageResource valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 3;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        setIconImageResource seticonimageresource = (setIconImageResource) Enum.valueOf(setIconImageResource.class, str);
        int i4 = IAuthTabCallback + 25;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return seticonimageresource;
        }
        throw null;
    }

    public static setIconImageResource[] values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 15;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        setIconImageResource[] seticonimageresourceArr = (setIconImageResource[]) $VALUES.clone();
        int i4 = IAuthTabCallback + 55;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return seticonimageresourceArr;
    }

    private setIconImageResource(String str, int i) {
    }

    static {
        setIconImageResource[] seticonimageresourceArr$values = $values();
        $VALUES = seticonimageresourceArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(seticonimageresourceArr$values);
        int i = onWarmupCompleted + 115;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
