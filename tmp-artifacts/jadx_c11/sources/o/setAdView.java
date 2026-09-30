package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class setAdView {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ setAdView[] $VALUES;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    public static final setAdView Playing = new setAdView("Playing", 0);
    public static final setAdView Paused = new setAdView("Paused", 1);
    public static final setAdView Stopped = new setAdView("Stopped", 2);

    private static final /* synthetic */ setAdView[] $values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 3;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        setAdView[] setadviewArr = {Playing, Paused, Stopped};
        int i5 = i3 + 101;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return setadviewArr;
    }

    public static EnumEntries<setAdView> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 91;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        EnumEntries<setAdView> enumEntries = $ENTRIES;
        int i5 = i2 + 121;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }

    public static setAdView valueOf(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 49;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        setAdView setadview = (setAdView) Enum.valueOf(setAdView.class, str);
        if (i3 != 0) {
            throw null;
        }
        int i4 = onExtraCallbackWithResult + 17;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return setadview;
        }
        obj.hashCode();
        throw null;
    }

    public static setAdView[] values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 75;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        setAdView[] setadviewArr = (setAdView[]) $VALUES.clone();
        int i3 = onExtraCallbackWithResult + 91;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return setadviewArr;
    }

    static {
        setAdView[] setadviewArr$values = $values();
        $VALUES = setadviewArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(setadviewArr$values);
        int i = onNavigationEvent + 87;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 97 / 0;
        }
    }

    private setAdView(String str, int i) {
    }
}
