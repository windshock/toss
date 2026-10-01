package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class onTextViewSizeChanged$onExtraCallback {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ onTextViewSizeChanged$onExtraCallback[] $VALUES;
    public static final onTextViewSizeChanged$onExtraCallback DC1 = new onTextViewSizeChanged$onExtraCallback("DC1", 0, new String[]{"117.52.3.253", "103.42.60.125"});
    public static final onTextViewSizeChanged$onExtraCallback DC2 = new onTextViewSizeChanged$onExtraCallback("DC2", 1, new String[]{"103.42.61.125", "211.115.96.253"});
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    private final String[] ipAddresses;

    private static final /* synthetic */ onTextViewSizeChanged$onExtraCallback[] $values() {
        onTextViewSizeChanged$onExtraCallback[] ontextviewsizechanged_onextracallbackArr;
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 13;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            onTextViewSizeChanged$onExtraCallback ontextviewsizechanged_onextracallback = DC1;
            onTextViewSizeChanged$onExtraCallback ontextviewsizechanged_onextracallback2 = DC2;
            ontextviewsizechanged_onextracallbackArr = new onTextViewSizeChanged$onExtraCallback[5];
            ontextviewsizechanged_onextracallbackArr[1] = ontextviewsizechanged_onextracallback;
            ontextviewsizechanged_onextracallbackArr[0] = ontextviewsizechanged_onextracallback2;
        } else {
            ontextviewsizechanged_onextracallbackArr = new onTextViewSizeChanged$onExtraCallback[]{DC1, DC2};
        }
        int i4 = i2 + 63;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return ontextviewsizechanged_onextracallbackArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static EnumEntries<onTextViewSizeChanged$onExtraCallback> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 77;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        EnumEntries<onTextViewSizeChanged$onExtraCallback> enumEntries = $ENTRIES;
        int i5 = i3 + 73;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return enumEntries;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static onTextViewSizeChanged$onExtraCallback valueOf(String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 67;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        onTextViewSizeChanged$onExtraCallback ontextviewsizechanged_onextracallback = (onTextViewSizeChanged$onExtraCallback) Enum.valueOf(onTextViewSizeChanged$onExtraCallback.class, str);
        int i4 = onExtraCallback + 109;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return ontextviewsizechanged_onextracallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static onTextViewSizeChanged$onExtraCallback[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 27;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        onTextViewSizeChanged$onExtraCallback[] ontextviewsizechanged_onextracallbackArr = (onTextViewSizeChanged$onExtraCallback[]) $VALUES.clone();
        int i3 = onExtraCallback + 23;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return ontextviewsizechanged_onextracallbackArr;
    }

    private onTextViewSizeChanged$onExtraCallback(String str, int i, String[] strArr) {
        this.ipAddresses = strArr;
    }

    public final String[] getIpAddresses() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 17;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        String[] strArr = this.ipAddresses;
        int i5 = i2 + 83;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return strArr;
    }

    static {
        onTextViewSizeChanged$onExtraCallback[] ontextviewsizechanged_onextracallbackArr$values = $values();
        $VALUES = ontextviewsizechanged_onextracallbackArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(ontextviewsizechanged_onextracallbackArr$values);
        int i = onExtraCallbackWithResult + 93;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }
}
