package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class setMinAndMaxFrame {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ setMinAndMaxFrame[] $VALUES;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public static final setMinAndMaxFrame OPEN_GL = new setMinAndMaxFrame("OPEN_GL", 0);
    public static final setMinAndMaxFrame RENDER_EFFECT = new setMinAndMaxFrame("RENDER_EFFECT", 1);
    public static final setMinAndMaxFrame NONE = new setMinAndMaxFrame("NONE", 2);

    private static final /* synthetic */ setMinAndMaxFrame[] $values() {
        int i2 = 2 % 2;
        int i3 = onExtraCallback;
        int i4 = i3 + 125;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        setMinAndMaxFrame[] setminandmaxframeArr = {OPEN_GL, RENDER_EFFECT, NONE};
        int i6 = i3 + 23;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 1 / 0;
        }
        return setminandmaxframeArr;
    }

    public static EnumEntries<setMinAndMaxFrame> getEntries() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 41;
        int i4 = i3 % 128;
        onExtraCallback = i4;
        int i5 = i3 % 2;
        EnumEntries<setMinAndMaxFrame> enumEntries = $ENTRIES;
        int i6 = i4 + 27;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 55 / 0;
        }
        return enumEntries;
    }

    public static setMinAndMaxFrame valueOf(String str) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 115;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        setMinAndMaxFrame setminandmaxframe = (setMinAndMaxFrame) Enum.valueOf(setMinAndMaxFrame.class, str);
        int i5 = onExtraCallback + 3;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return setminandmaxframe;
    }

    public static setMinAndMaxFrame[] values() {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 45;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        setMinAndMaxFrame[] setminandmaxframeArr = (setMinAndMaxFrame[]) $VALUES.clone();
        int i5 = IAuthTabCallback + 37;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 32 / 0;
        }
        return setminandmaxframeArr;
    }

    private setMinAndMaxFrame(String str, int i2) {
    }

    static {
        setMinAndMaxFrame[] setminandmaxframeArr$values = $values();
        $VALUES = setminandmaxframeArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(setminandmaxframeArr$values);
        int i2 = onNavigationEvent + 111;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 53 / 0;
        }
    }
}
