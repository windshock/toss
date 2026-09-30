package o;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class CheckMask$IAuthTabCallback {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onTransact = 1;
    private static int onWarmupCompleted;
    public static final CheckMask$IAuthTabCallback onExtraCallbackWithResult = new CheckMask$IAuthTabCallback();
    private static final AlignFaceImage onExtraCallback = new AlignFaceImage();

    private CheckMask$IAuthTabCallback() {
    }

    static {
        int i = onNavigationEvent + 55;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public final AlignFaceImage onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onTransact + 49;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        AlignFaceImage alignFaceImage = onExtraCallback;
        int i4 = i3 + 125;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return alignFaceImage;
    }
}
