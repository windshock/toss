package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class jniHandleMemoryPressure {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ jniHandleMemoryPressure[] $VALUES;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    public static final jniHandleMemoryPressure USIM = new jniHandleMemoryPressure("USIM", 0);
    public static final jniHandleMemoryPressure ARS = new jniHandleMemoryPressure("ARS", 1);
    public static final jniHandleMemoryPressure SMS_MT = new jniHandleMemoryPressure("SMS_MT", 2);
    public static final jniHandleMemoryPressure SMS_MO = new jniHandleMemoryPressure("SMS_MO", 3);
    public static final jniHandleMemoryPressure CARD_ARS = new jniHandleMemoryPressure("CARD_ARS", 4);

    private static final /* synthetic */ jniHandleMemoryPressure[] $values() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 125;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        jniHandleMemoryPressure[] jnihandlememorypressureArr = {USIM, ARS, SMS_MT, SMS_MO, CARD_ARS};
        int i5 = i2 + 49;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 92 / 0;
        }
        return jnihandlememorypressureArr;
    }

    public static EnumEntries<jniHandleMemoryPressure> getEntries() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 105;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        EnumEntries<jniHandleMemoryPressure> enumEntries = $ENTRIES;
        int i5 = i2 + 45;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 41 / 0;
        }
        return enumEntries;
    }

    public static jniHandleMemoryPressure valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 45;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        jniHandleMemoryPressure jnihandlememorypressure = (jniHandleMemoryPressure) Enum.valueOf(jniHandleMemoryPressure.class, str);
        if (i3 == 0) {
            return jnihandlememorypressure;
        }
        throw null;
    }

    public static jniHandleMemoryPressure[] values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 39;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        jniHandleMemoryPressure[] jnihandlememorypressureArr = (jniHandleMemoryPressure[]) $VALUES.clone();
        int i4 = onNavigationEvent + 47;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return jnihandlememorypressureArr;
    }

    private jniHandleMemoryPressure(String str, int i) {
    }

    static {
        jniHandleMemoryPressure[] jnihandlememorypressureArr$values = $values();
        $VALUES = jnihandlememorypressureArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(jnihandlememorypressureArr$values);
        int i = onWarmupCompleted + 47;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }
}
