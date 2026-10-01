package o;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ALCTimerLabel$IAuthTabCallback {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public static final /* synthetic */ int[] onWarmupCompleted;

    static {
        int[] iArr = new int[ALCTimerLabel$onWarmupCompleted.values().length];
        try {
            iArr[ALCTimerLabel$onWarmupCompleted.CAMERA.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ALCTimerLabel$onWarmupCompleted.GALLERY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ALCTimerLabel$onWarmupCompleted.BOTH.ordinal()] = 3;
            int i = IAuthTabCallback + 83;
            onExtraCallback = i % 128;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused3) {
        }
        onWarmupCompleted = iArr;
        int i4 = IAuthTabCallback + 47;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 24 / 0;
        }
    }
}
