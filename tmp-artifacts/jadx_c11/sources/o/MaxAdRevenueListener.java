package o;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class MaxAdRevenueListener {
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    public static final MaxAdRevenueListener onNavigationEvent = new MaxAdRevenueListener();
    private static final long onExtraCallbackWithResult = ByteOrderedDataOutputStream.onExtraCallback(Y0.IAuthTabCallback.IAuthTabCallback());

    private MaxAdRevenueListener() {
    }

    static {
        int i = IAuthTabCallback + 25;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public final long onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 103;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long j = onExtraCallbackWithResult;
        int i4 = i3 + 85;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return j;
    }
}
