package o;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class z1 {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;

    public static /* synthetic */ y7 onExtraCallbackWithResult(long j, long j2, long j3, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = onWarmupCompleted + 99;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                j = isFullscreenAd.onExtraCallback.IAuthTabCallback();
                int i4 = 73 / 0;
            } else {
                j = isFullscreenAd.onExtraCallback.IAuthTabCallback();
            }
        }
        long j4 = j;
        if ((i & 2) != 0) {
            j2 = isFullscreenAd.onExtraCallback.onNavigationEvent();
        }
        long j5 = j2;
        if ((i & 4) != 0) {
            int i5 = IAuthTabCallback + 43;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                isFullscreenAd.onExtraCallback.onExtraCallback();
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            j3 = isFullscreenAd.onExtraCallback.onExtraCallback();
        }
        return IAuthTabCallback(j4, j5, j3);
    }

    public static final y7 IAuthTabCallback(long j, long j2, long j3) {
        int i = 2 % 2;
        y7 y7Var = new y7(j, j2, j3, null);
        int i2 = onWarmupCompleted + 47;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return y7Var;
    }

    public static /* synthetic */ y7 onExtraCallback(long j, long j2, long j3, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 75;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0 && (i & 1) != 0) {
            j = MaxAdListener.onExtraCallback.onExtraCallbackWithResult();
        }
        long j4 = j;
        if ((i & 2) != 0) {
            j2 = MaxAdListener.onExtraCallback.IAuthTabCallback();
        }
        long j5 = j2;
        if ((i & 4) != 0) {
            int i4 = IAuthTabCallback + 83;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            j3 = MaxAdListener.onExtraCallback.onNavigationEvent();
        }
        return onExtraCallbackWithResult(j4, j5, j3);
    }

    public static final y7 onExtraCallbackWithResult(long j, long j2, long j3) {
        int i = 2 % 2;
        y7 y7Var = new y7(j, j2, j3, null);
        int i2 = onWarmupCompleted + 45;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return y7Var;
    }
}
