package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class onAdViewAdClicked {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ onAdViewAdClicked[] $VALUES;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    public static final onAdViewAdClicked NONE = new onAdViewAdClicked("NONE", 0);
    public static final onAdViewAdClicked SCHEDULE = new onAdViewAdClicked("SCHEDULE", 1);
    public static final onAdViewAdClicked CANCEL = new onAdViewAdClicked("CANCEL", 2);

    private static final /* synthetic */ onAdViewAdClicked[] $values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 47;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        onAdViewAdClicked[] onadviewadclickedArr = {NONE, SCHEDULE, CANCEL};
        int i5 = i3 + 123;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return onadviewadclickedArr;
    }

    public static EnumEntries<onAdViewAdClicked> getEntries() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 99;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        EnumEntries<onAdViewAdClicked> enumEntries = $ENTRIES;
        int i5 = i2 + 79;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return enumEntries;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static onAdViewAdClicked valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 99;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        onAdViewAdClicked onadviewadclicked = (onAdViewAdClicked) Enum.valueOf(onAdViewAdClicked.class, str);
        int i4 = onWarmupCompleted + 45;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return onadviewadclicked;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static onAdViewAdClicked[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 103;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        onAdViewAdClicked[] onadviewadclickedArr = (onAdViewAdClicked[]) $VALUES.clone();
        int i4 = onExtraCallbackWithResult + 3;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return onadviewadclickedArr;
    }

    private onAdViewAdClicked(String str, int i) {
    }

    static {
        onAdViewAdClicked[] onadviewadclickedArr$values = $values();
        $VALUES = onadviewadclickedArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(onadviewadclickedArr$values);
        int i = IAuthTabCallback + 3;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            int i2 = 5 / 0;
        }
    }
}
