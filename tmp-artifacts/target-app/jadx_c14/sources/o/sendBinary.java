package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class sendBinary {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ sendBinary[] $VALUES;
    public static final sendBinary IMAGE = new sendBinary("IMAGE", 0);
    public static final sendBinary LOTTIE = new sendBinary("LOTTIE", 1);
    public static final sendBinary NONE = new sendBinary("NONE", 2);
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    private static final /* synthetic */ sendBinary[] $values() {
        sendBinary[] sendbinaryArr;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 67;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 == 0) {
            sendBinary sendbinary = IMAGE;
            sendBinary sendbinary2 = LOTTIE;
            sendBinary sendbinary3 = NONE;
            sendbinaryArr = new sendBinary[5];
            sendbinaryArr[1] = sendbinary;
            sendbinaryArr[0] = sendbinary2;
            sendbinaryArr[3] = sendbinary3;
        } else {
            sendbinaryArr = new sendBinary[]{IMAGE, LOTTIE, NONE};
        }
        int i4 = i3 + 43;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 13 / 0;
        }
        return sendbinaryArr;
    }

    public static EnumEntries<sendBinary> getEntries() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 17;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        EnumEntries<sendBinary> enumEntries = $ENTRIES;
        int i5 = i2 + 105;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }

    public static sendBinary valueOf(String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 95;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        sendBinary sendbinary = (sendBinary) Enum.valueOf(sendBinary.class, str);
        if (i3 == 0) {
            throw null;
        }
        int i4 = onWarmupCompleted + 75;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return sendbinary;
        }
        obj.hashCode();
        throw null;
    }

    public static sendBinary[] values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 77;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        sendBinary[] sendbinaryArr = (sendBinary[]) $VALUES.clone();
        int i4 = onWarmupCompleted + 105;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return sendbinaryArr;
    }

    private sendBinary(String str, int i) {
    }

    static {
        sendBinary[] sendbinaryArr$values = $values();
        $VALUES = sendbinaryArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(sendbinaryArr$values);
        int i = onExtraCallbackWithResult + 61;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
