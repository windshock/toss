package o;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class MaxAdViewConfiguration {
    private static int IAuthTabCallback = 1;
    private static int IAuthTabCallbackStub = 1;
    private static int onExtraCallback;
    private static int onExtraCallbackWithResult;
    public static final MaxAdViewConfiguration onWarmupCompleted = new MaxAdViewConfiguration();
    private static final long onNavigationEvent = ByteOrderedDataOutputStream.onExtraCallback(Z0.IAuthTabCallback.onNavigationEvent());

    private MaxAdViewConfiguration() {
    }

    static {
        int i = IAuthTabCallback + 25;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public final long onExtraCallback() {
        long j;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 73;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            j = onNavigationEvent;
            int i4 = 91 / 0;
        } else {
            j = onNavigationEvent;
        }
        int i5 = i2 + 67;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }
}
