package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class registerBatteryReceiver$IAuthTabCallback {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ registerBatteryReceiver$IAuthTabCallback[] $VALUES;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final String value;
    public static final registerBatteryReceiver$IAuthTabCallback CAROUSEL = new registerBatteryReceiver$IAuthTabCallback("CAROUSEL", 0, "carousel");
    public static final registerBatteryReceiver$IAuthTabCallback SUMMARY_HEADER = new registerBatteryReceiver$IAuthTabCallback("SUMMARY_HEADER", 1, "summaryHeader");

    private static final /* synthetic */ registerBatteryReceiver$IAuthTabCallback[] $values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 13;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        registerBatteryReceiver$IAuthTabCallback[] registerbatteryreceiver_iauthtabcallbackArr = {CAROUSEL, SUMMARY_HEADER};
        int i5 = i2 + 41;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 13 / 0;
        }
        return registerbatteryreceiver_iauthtabcallbackArr;
    }

    public static EnumEntries<registerBatteryReceiver$IAuthTabCallback> getEntries() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 39;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        EnumEntries<registerBatteryReceiver$IAuthTabCallback> enumEntries = $ENTRIES;
        int i5 = i2 + 43;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return enumEntries;
        }
        throw null;
    }

    public static registerBatteryReceiver$IAuthTabCallback valueOf(String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 89;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        registerBatteryReceiver$IAuthTabCallback registerbatteryreceiver_iauthtabcallback = (registerBatteryReceiver$IAuthTabCallback) Enum.valueOf(registerBatteryReceiver$IAuthTabCallback.class, str);
        if (i3 != 0) {
            return registerbatteryreceiver_iauthtabcallback;
        }
        throw null;
    }

    public static registerBatteryReceiver$IAuthTabCallback[] values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 5;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        registerBatteryReceiver$IAuthTabCallback[] registerbatteryreceiver_iauthtabcallbackArr = (registerBatteryReceiver$IAuthTabCallback[]) $VALUES.clone();
        int i4 = onExtraCallbackWithResult + 35;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return registerbatteryreceiver_iauthtabcallbackArr;
    }

    private registerBatteryReceiver$IAuthTabCallback(String str, int i, String str2) {
        this.value = str2;
    }

    public final String getValue() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 115;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        String str = this.value;
        int i5 = i3 + 57;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        registerBatteryReceiver$IAuthTabCallback[] registerbatteryreceiver_iauthtabcallbackArr$values = $values();
        $VALUES = registerbatteryreceiver_iauthtabcallbackArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(registerbatteryreceiver_iauthtabcallbackArr$values);
        int i = onWarmupCompleted + 27;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }
}
