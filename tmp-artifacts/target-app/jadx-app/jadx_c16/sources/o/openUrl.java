package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class openUrl {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ openUrl[] $VALUES;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private final String logValue;
    public static final openUrl Hide = new openUrl("Hide", 0, "hide");
    public static final openUrl Order = new openUrl("Order", 1, "order");

    private static final /* synthetic */ openUrl[] $values() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 113;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return new openUrl[]{Hide, Order};
        }
        openUrl openurl = Hide;
        openUrl openurl2 = Order;
        openUrl[] openurlArr = new openUrl[2];
        openurlArr[0] = openurl;
        openurlArr[0] = openurl2;
        return openurlArr;
    }

    public static EnumEntries<openUrl> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 73;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        EnumEntries<openUrl> enumEntries = $ENTRIES;
        int i5 = i2 + 53;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }

    public static openUrl valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 81;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        openUrl openurl = (openUrl) Enum.valueOf(openUrl.class, str);
        if (i3 == 0) {
            int i4 = 63 / 0;
        }
        return openurl;
    }

    public static openUrl[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 63;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        openUrl[] openurlArr = (openUrl[]) $VALUES.clone();
        int i4 = onExtraCallbackWithResult + 107;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return openurlArr;
    }

    private openUrl(String str, int i, String str2) {
        this.logValue = str2;
    }

    public final String getLogValue() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 117;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.logValue;
        int i4 = i2 + 17;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    static {
        openUrl[] openurlArr$values = $values();
        $VALUES = openurlArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(openurlArr$values);
        int i = onNavigationEvent + 79;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }
}
