package o;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AccelerometerShakeSensorService1$IAuthTabCallback {
    private static int IAuthTabCallback = 1;
    public static final /* synthetic */ int[] onExtraCallback;
    private static int onNavigationEvent;

    static {
        int[] iArr = new int[access1302.values().length];
        try {
            iArr[access1302.SHARED.ordinal()] = 1;
            int i = onNavigationEvent + 7;
            IAuthTabCallback = i % 128;
            if (i % 2 != 0) {
                int i2 = 2 % 2;
            }
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[access1302.PERSONAL.ordinal()] = 2;
            int i3 = onNavigationEvent + 119;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
        } catch (NoSuchFieldError unused2) {
        }
        onExtraCallback = iArr;
    }
}
