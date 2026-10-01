package o;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class retrieveZoneId {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    public static /* synthetic */ appLovinAdSizeFromAdMobAdSize IAuthTabCallback(long j, long j2, long j3, long j4, long j5, int i, Object obj) {
        long jOnNavigationEvent;
        long jOnWarmupCompleted;
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            jOnNavigationEvent = shouldCollectSignalsOnUiThread.onNavigationEvent.onNavigationEvent();
            int i3 = onExtraCallbackWithResult + 39;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
        } else {
            jOnNavigationEvent = j;
        }
        if ((i & 2) != 0) {
            int i5 = onWarmupCompleted + 87;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            jOnWarmupCompleted = shouldCollectSignalsOnUiThread.onNavigationEvent.onWarmupCompleted();
        } else {
            jOnWarmupCompleted = j2;
        }
        return IAuthTabCallback(jOnNavigationEvent, jOnWarmupCompleted, (i & 4) != 0 ? shouldCollectSignalsOnUiThread.onNavigationEvent.onExtraCallbackWithResult() : j3, (i & 8) != 0 ? shouldCollectSignalsOnUiThread.onNavigationEvent.IAuthTabCallback() : j4, (i & 16) != 0 ? shouldCollectSignalsOnUiThread.onNavigationEvent.onExtraCallback() : j5);
    }

    public static final appLovinAdSizeFromAdMobAdSize IAuthTabCallback(long j, long j2, long j3, long j4, long j5) {
        int i = 2 % 2;
        appLovinAdSizeFromAdMobAdSize applovinadsizefromadmobadsize = new appLovinAdSizeFromAdMobAdSize(j, j2, j3, j4, j5, null);
        int i2 = onWarmupCompleted + 75;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return applovinadsizefromadmobadsize;
    }

    public static /* synthetic */ appLovinAdSizeFromAdMobAdSize onExtraCallbackWithResult(long j, long j2, long j3, long j4, long j5, int i, Object obj) {
        long jOnExtraCallback;
        long jIAuthTabCallback;
        long jOnExtraCallbackWithResult;
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = onWarmupCompleted + 81;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            jOnExtraCallback = shouldDestroyOnUiThread.onNavigationEvent.onExtraCallback();
        } else {
            jOnExtraCallback = j;
        }
        if ((i & 2) != 0) {
            int i5 = onExtraCallbackWithResult + 91;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            jIAuthTabCallback = shouldDestroyOnUiThread.onNavigationEvent.IAuthTabCallback();
        } else {
            jIAuthTabCallback = j2;
        }
        if ((i & 4) != 0) {
            jOnExtraCallbackWithResult = shouldDestroyOnUiThread.onNavigationEvent.onExtraCallbackWithResult();
            int i7 = onExtraCallbackWithResult + 91;
            onWarmupCompleted = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 4 / 4;
            }
        } else {
            jOnExtraCallbackWithResult = j3;
        }
        appLovinAdSizeFromAdMobAdSize applovinadsizefromadmobadsizeOnNavigationEvent = onNavigationEvent(jOnExtraCallback, jIAuthTabCallback, jOnExtraCallbackWithResult, (i & 8) != 0 ? shouldDestroyOnUiThread.onNavigationEvent.onWarmupCompleted() : j4, (i & 16) != 0 ? shouldDestroyOnUiThread.onNavigationEvent.onNavigationEvent() : j5);
        int i9 = onWarmupCompleted + 39;
        onExtraCallbackWithResult = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 3 / 0;
        }
        return applovinadsizefromadmobadsizeOnNavigationEvent;
    }

    public static final appLovinAdSizeFromAdMobAdSize onNavigationEvent(long j, long j2, long j3, long j4, long j5) {
        int i = 2 % 2;
        appLovinAdSizeFromAdMobAdSize applovinadsizefromadmobadsize = new appLovinAdSizeFromAdMobAdSize(j, j2, j3, j4, j5, null);
        int i2 = onExtraCallbackWithResult + 123;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return applovinadsizefromadmobadsize;
    }
}
