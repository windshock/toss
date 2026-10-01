package o;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class isBeta {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onTransact = 1;
    private static int onWarmupCompleted = 1;
    public static final isBeta onNavigationEvent = new isBeta();
    private static final long onExtraCallbackWithResult = ByteOrderedDataOutputStream.onExtraCallback(bExternalSyntheticLambda9.onNavigationEvent.onExtraCallback());

    private isBeta() {
    }

    static {
        int i = IAuthTabCallback + 107;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            int i2 = 37 / 0;
        }
    }

    public final long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 87;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long j = onExtraCallbackWithResult;
        int i4 = i2 + 29;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return j;
    }
}
