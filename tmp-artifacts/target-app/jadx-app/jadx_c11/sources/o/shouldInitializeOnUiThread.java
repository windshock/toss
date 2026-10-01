package o;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class shouldInitializeOnUiThread {
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public static final shouldInitializeOnUiThread onExtraCallback = new shouldInitializeOnUiThread();
    private static final long onWarmupCompleted = ByteOrderedDataOutputStream.onExtraCallback(r8lambdaNCVYwOmQlsg8t5U1lRrxuy5S94.IAuthTabCallback.onExtraCallbackWithResult());

    private shouldInitializeOnUiThread() {
    }

    static {
        int i = onNavigationEvent + 23;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    public final long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 107;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        long j = onWarmupCompleted;
        int i5 = i3 + 7;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
