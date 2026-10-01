package o;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class onExpiredAdReloaded {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;

    public static /* synthetic */ onInitializeSuccess onExtraCallbackWithResult(long j, long j2, long j3, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            j = MaxRewardedAdapter.onWarmupCompleted.IAuthTabCallback();
        }
        long j4 = j;
        if ((i & 2) != 0) {
            j2 = MaxRewardedAdapter.onWarmupCompleted.onExtraCallback();
        }
        long j5 = j2;
        if ((i & 4) != 0) {
            int i3 = IAuthTabCallback + 69;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                MaxRewardedAdapter.onWarmupCompleted.onWarmupCompleted();
                throw null;
            }
            j3 = MaxRewardedAdapter.onWarmupCompleted.onWarmupCompleted();
        }
        onInitializeSuccess oninitializesuccessOnNavigationEvent = onNavigationEvent(j4, j5, j3);
        int i4 = onWarmupCompleted + 93;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return oninitializesuccessOnNavigationEvent;
        }
        throw null;
    }

    public static final onInitializeSuccess onNavigationEvent(long j, long j2, long j3) {
        int i = 2 % 2;
        onInitializeSuccess oninitializesuccess = new onInitializeSuccess(j, j2, j3, null);
        int i2 = IAuthTabCallback + 59;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return oninitializesuccess;
    }

    public static /* synthetic */ onInitializeSuccess onExtraCallback(long j, long j2, long j3, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = IAuthTabCallback + 109;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            j = loadInterstitialAd.IAuthTabCallback.onExtraCallback();
        }
        long j4 = j;
        if ((i & 2) != 0) {
            int i5 = onWarmupCompleted + 93;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            j2 = loadInterstitialAd.IAuthTabCallback.onWarmupCompleted();
        }
        long j5 = j2;
        if ((i & 4) != 0) {
            j3 = loadInterstitialAd.IAuthTabCallback.onNavigationEvent();
        }
        return onExtraCallback(j4, j5, j3);
    }

    public static final onInitializeSuccess onExtraCallback(long j, long j2, long j3) {
        int i = 2 % 2;
        onInitializeSuccess oninitializesuccess = new onInitializeSuccess(j, j2, j3, null);
        int i2 = IAuthTabCallback + 43;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return oninitializesuccess;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
