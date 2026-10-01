package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class onInterstitialAdClicked {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ onInterstitialAdClicked[] $VALUES;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public static final onInterstitialAdClicked STALE = new onInterstitialAdClicked("STALE", 0);
    public static final onInterstitialAdClicked COMPLETED = new onInterstitialAdClicked("COMPLETED", 1);
    public static final onInterstitialAdClicked FAILED = new onInterstitialAdClicked("FAILED", 2);
    public static final onInterstitialAdClicked ALREADY_CLOSED = new onInterstitialAdClicked("ALREADY_CLOSED", 3);

    private static final /* synthetic */ onInterstitialAdClicked[] $values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 93;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        onInterstitialAdClicked oninterstitialadclicked = STALE;
        if (i3 == 0) {
            return new onInterstitialAdClicked[]{oninterstitialadclicked, COMPLETED, FAILED, ALREADY_CLOSED};
        }
        onInterstitialAdClicked oninterstitialadclicked2 = COMPLETED;
        onInterstitialAdClicked oninterstitialadclicked3 = FAILED;
        onInterstitialAdClicked oninterstitialadclicked4 = ALREADY_CLOSED;
        onInterstitialAdClicked[] oninterstitialadclickedArr = new onInterstitialAdClicked[4];
        oninterstitialadclickedArr[0] = oninterstitialadclicked;
        oninterstitialadclickedArr[1] = oninterstitialadclicked2;
        oninterstitialadclickedArr[3] = oninterstitialadclicked3;
        oninterstitialadclickedArr[5] = oninterstitialadclicked4;
        return oninterstitialadclickedArr;
    }

    public static EnumEntries<onInterstitialAdClicked> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 109;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        EnumEntries<onInterstitialAdClicked> enumEntries = $ENTRIES;
        if (i3 == 0) {
            int i4 = 28 / 0;
        }
        return enumEntries;
    }

    public static onInterstitialAdClicked valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 71;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        onInterstitialAdClicked oninterstitialadclicked = (onInterstitialAdClicked) Enum.valueOf(onInterstitialAdClicked.class, str);
        int i4 = onExtraCallbackWithResult + 51;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return oninterstitialadclicked;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static onInterstitialAdClicked[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 109;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        onInterstitialAdClicked[] oninterstitialadclickedArr = (onInterstitialAdClicked[]) $VALUES.clone();
        int i4 = onExtraCallback + 39;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return oninterstitialadclickedArr;
    }

    private onInterstitialAdClicked(String str, int i) {
    }

    static {
        onInterstitialAdClicked[] oninterstitialadclickedArr$values = $values();
        $VALUES = oninterstitialadclickedArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(oninterstitialadclickedArr$values);
        int i = onNavigationEvent + 35;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }
}
