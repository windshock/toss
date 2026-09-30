package o;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class getAdaptiveSize {
    private static int IAuthTabCallback = 0;
    private static int asBinder = 1;
    public static final getAdaptiveSize onExtraCallback = new getAdaptiveSize();
    private static final long onExtraCallbackWithResult = ByteOrderedDataOutputStream.onExtraCallback(W0.IAuthTabCallback.onExtraCallbackWithResult());
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    private getAdaptiveSize() {
    }

    static {
        int i = onWarmupCompleted + 19;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public final long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asBinder + 3;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        long j = onExtraCallbackWithResult;
        int i5 = i3 + 1;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }
}
