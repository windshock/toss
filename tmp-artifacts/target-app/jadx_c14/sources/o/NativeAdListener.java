package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class NativeAdListener {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ NativeAdListener[] $VALUES;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    public static final NativeAdListener WITHDRAW_AGREEMENT = new NativeAdListener("WITHDRAW_AGREEMENT", 0);
    public static final NativeAdListener ONLINE_WITHDRAW_AGREEMENT = new NativeAdListener("ONLINE_WITHDRAW_AGREEMENT", 1);

    private static final /* synthetic */ NativeAdListener[] $values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 97;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        NativeAdListener[] nativeAdListenerArr = {WITHDRAW_AGREEMENT, ONLINE_WITHDRAW_AGREEMENT};
        int i5 = i2 + 93;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return nativeAdListenerArr;
        }
        throw null;
    }

    public static EnumEntries<NativeAdListener> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 41;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return $ENTRIES;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static NativeAdListener valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 115;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        NativeAdListener nativeAdListener = (NativeAdListener) Enum.valueOf(NativeAdListener.class, str);
        int i4 = onNavigationEvent + 55;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return nativeAdListener;
    }

    public static NativeAdListener[] values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 69;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        NativeAdListener[] nativeAdListenerArr = $VALUES;
        if (i3 != 0) {
            return (NativeAdListener[]) nativeAdListenerArr.clone();
        }
        throw null;
    }

    private NativeAdListener(String str, int i) {
    }

    static {
        NativeAdListener[] nativeAdListenerArr$values = $values();
        $VALUES = nativeAdListenerArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(nativeAdListenerArr$values);
        int i = onWarmupCompleted + 57;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            int i2 = 8 / 0;
        }
    }
}
