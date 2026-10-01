package o;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class requestAssetInfo$onNavigationEvent$IAuthTabCallback {
    public static final /* synthetic */ int[] onExtraCallbackWithResult;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    static {
        int[] iArr = new int[getIconPaddingTop.values().length];
        try {
            iArr[getIconPaddingTop.Stop.ordinal()] = 1;
            int i2 = onWarmupCompleted + 41;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 % 2;
            }
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[getIconPaddingTop.Hold.ordinal()] = 2;
            int i4 = onWarmupCompleted + 61;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 % 2;
            }
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[getIconPaddingTop.Start.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        onExtraCallbackWithResult = iArr;
    }
}
