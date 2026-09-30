package o;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class checkFaceMaxSize$onNavigationEvent {
    public static final /* synthetic */ int[] IAuthTabCallback;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    static {
        int[] iArr = new int[getIconPaddingTop.values().length];
        try {
            iArr[getIconPaddingTop.Start.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[getIconPaddingTop.Stop.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[getIconPaddingTop.Hold.ordinal()] = 3;
            int i = onWarmupCompleted + 57;
            onNavigationEvent = i % 128;
            if (i % 2 != 0) {
                int i2 = 2 % 2;
            }
        } catch (NoSuchFieldError unused3) {
        }
        IAuthTabCallback = iArr;
        int i3 = onWarmupCompleted + 21;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }
}
