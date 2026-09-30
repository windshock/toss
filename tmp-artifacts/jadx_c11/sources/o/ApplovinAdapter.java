package o;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class ApplovinAdapter {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;

    public static /* synthetic */ NestfgetzoneId onExtraCallback(long j, long j2, long j3, long j4, int i, Object obj) {
        long jOnNavigationEvent;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 83;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        long jIAuthTabCallback = (i & 1) != 0 ? MaxInterstitialAdViewAdapter.onExtraCallbackWithResult.IAuthTabCallback() : j;
        long jOnWarmupCompleted = (i & 2) != 0 ? MaxInterstitialAdViewAdapter.onExtraCallbackWithResult.onWarmupCompleted() : j2;
        if ((i & 4) != 0) {
            int i5 = IAuthTabCallback + 125;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            jOnNavigationEvent = MaxInterstitialAdViewAdapter.onExtraCallbackWithResult.onNavigationEvent();
        } else {
            jOnNavigationEvent = j3;
        }
        return onWarmupCompleted(jIAuthTabCallback, jOnWarmupCompleted, jOnNavigationEvent, (i & 8) != 0 ? MaxInterstitialAdViewAdapter.onExtraCallbackWithResult.onExtraCallbackWithResult() : j4);
    }

    public static final NestfgetzoneId onWarmupCompleted(long j, long j2, long j3, long j4) {
        int i = 2 % 2;
        NestfgetzoneId nestfgetzoneId = new NestfgetzoneId(j, j2, j3, j4, null);
        int i2 = onWarmupCompleted + 111;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return nestfgetzoneId;
    }

    public static /* synthetic */ NestfgetzoneId IAuthTabCallback(long j, long j2, long j3, long j4, int i, Object obj) {
        long jOnExtraCallback;
        long jOnWarmupCompleted;
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = IAuthTabCallback + 55;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            jOnExtraCallback = showAppOpenAd.onWarmupCompleted.onExtraCallback();
        } else {
            jOnExtraCallback = j;
        }
        if ((i & 2) != 0) {
            int i5 = onWarmupCompleted + 73;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                jOnWarmupCompleted = showAppOpenAd.onWarmupCompleted.onWarmupCompleted();
                int i6 = 48 / 0;
            } else {
                jOnWarmupCompleted = showAppOpenAd.onWarmupCompleted.onWarmupCompleted();
            }
        } else {
            jOnWarmupCompleted = j2;
        }
        return onExtraCallbackWithResult(jOnExtraCallback, jOnWarmupCompleted, (i & 4) != 0 ? showAppOpenAd.onWarmupCompleted.IAuthTabCallback() : j3, (i & 8) != 0 ? showAppOpenAd.onWarmupCompleted.onExtraCallbackWithResult() : j4);
    }

    public static final NestfgetzoneId onExtraCallbackWithResult(long j, long j2, long j3, long j4) {
        int i = 2 % 2;
        NestfgetzoneId nestfgetzoneId = new NestfgetzoneId(j, j2, j3, j4, null);
        int i2 = IAuthTabCallback + 97;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return nestfgetzoneId;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
