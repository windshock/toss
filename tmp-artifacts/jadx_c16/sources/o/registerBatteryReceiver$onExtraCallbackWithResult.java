package o;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class registerBatteryReceiver$onExtraCallbackWithResult {
    private static int onExtraCallbackWithResult = 0;
    public static final /* synthetic */ int[] onNavigationEvent;
    private static int onWarmupCompleted = 1;

    static {
        int[] iArr = new int[HCEBridgeExtension1.values().length];
        try {
            iArr[HCEBridgeExtension1.VIEW.ordinal()] = 1;
            int i = 2 % 2;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[HCEBridgeExtension1.VIEW_25P.ordinal()] = 2;
            int i2 = onWarmupCompleted + 119;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[HCEBridgeExtension1.VIEW_50P.ordinal()] = 3;
            int i5 = onWarmupCompleted + 37;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 2;
            }
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[HCEBridgeExtension1.VIEW_75P.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[HCEBridgeExtension1.VIEW_COMPLETE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[HCEBridgeExtension1.VIEW_3S.ordinal()] = 6;
            int i7 = 2 % 2;
        } catch (NoSuchFieldError unused6) {
        }
        onNavigationEvent = iArr;
        int i8 = onWarmupCompleted + 123;
        onExtraCallbackWithResult = i8 % 128;
        if (i8 % 2 != 0) {
            throw null;
        }
    }
}
