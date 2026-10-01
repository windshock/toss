package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getIconPaddingTop {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ getIconPaddingTop[] $VALUES;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public static final getIconPaddingTop Hold = new getIconPaddingTop("Hold", 0);
    public static final getIconPaddingTop Start = new getIconPaddingTop("Start", 1);
    public static final getIconPaddingTop Stop = new getIconPaddingTop("Stop", 2);

    private static final /* synthetic */ getIconPaddingTop[] $values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 63;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        getIconPaddingTop geticonpaddingtop = Hold;
        if (i3 == 0) {
            return new getIconPaddingTop[]{geticonpaddingtop, Start, Stop};
        }
        getIconPaddingTop geticonpaddingtop2 = Start;
        getIconPaddingTop geticonpaddingtop3 = Stop;
        getIconPaddingTop[] geticonpaddingtopArr = new getIconPaddingTop[4];
        geticonpaddingtopArr[0] = geticonpaddingtop;
        geticonpaddingtopArr[0] = geticonpaddingtop2;
        geticonpaddingtopArr[3] = geticonpaddingtop3;
        return geticonpaddingtopArr;
    }

    public static EnumEntries<getIconPaddingTop> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 3;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        EnumEntries<getIconPaddingTop> enumEntries = $ENTRIES;
        if (i3 == 0) {
            int i4 = 27 / 0;
        }
        return enumEntries;
    }

    public static getIconPaddingTop valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 83;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        getIconPaddingTop geticonpaddingtop = (getIconPaddingTop) Enum.valueOf(getIconPaddingTop.class, str);
        int i4 = onExtraCallbackWithResult + 99;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return geticonpaddingtop;
    }

    public static getIconPaddingTop[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 81;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        getIconPaddingTop[] geticonpaddingtopArr = $VALUES;
        if (i3 != 0) {
            return (getIconPaddingTop[]) geticonpaddingtopArr.clone();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private getIconPaddingTop(String str, int i) {
    }

    static {
        getIconPaddingTop[] geticonpaddingtopArr$values = $values();
        $VALUES = geticonpaddingtopArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(geticonpaddingtopArr$values);
        int i = IAuthTabCallback + 107;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            int i2 = 11 / 0;
        }
    }
}
