package o;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class Nestfgetsdk {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    public static /* synthetic */ NestfgetadView onNavigationEvent(long j, long j2, long j3, long j4, long j5, int i, Object obj) {
        long jOnExtraCallback;
        long jIAuthTabCallback;
        long jOnNavigationEvent;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 117;
        onExtraCallback = i3 % 128;
        long jOnWarmupCompleted = (i3 % 2 == 0 ? (i & 1) == 0 : (i & 1) == 0) ? j : showInterstitialAd.IAuthTabCallback.onWarmupCompleted();
        if ((i & 2) != 0) {
            int i4 = onExtraCallbackWithResult + 47;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                jOnExtraCallback = showInterstitialAd.IAuthTabCallback.onExtraCallback();
                int i5 = 79 / 0;
            } else {
                jOnExtraCallback = showInterstitialAd.IAuthTabCallback.onExtraCallback();
            }
        } else {
            jOnExtraCallback = j2;
        }
        if ((i & 4) != 0) {
            int i6 = onExtraCallback + 11;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 == 0) {
                showInterstitialAd.IAuthTabCallback.IAuthTabCallback();
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            jIAuthTabCallback = showInterstitialAd.IAuthTabCallback.IAuthTabCallback();
        } else {
            jIAuthTabCallback = j3;
        }
        if ((i & 8) != 0) {
            jOnNavigationEvent = showInterstitialAd.IAuthTabCallback.onNavigationEvent();
            int i7 = onExtraCallback + 41;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 2 / 2;
            }
        } else {
            jOnNavigationEvent = j4;
        }
        return onExtraCallbackWithResult(jOnWarmupCompleted, jOnExtraCallback, jIAuthTabCallback, jOnNavigationEvent, (i & 16) != 0 ? showInterstitialAd.IAuthTabCallback.onExtraCallbackWithResult() : j5);
    }

    public static final NestfgetadView onExtraCallbackWithResult(long j, long j2, long j3, long j4, long j5) {
        int i = 2 % 2;
        NestfgetadView nestfgetadView = new NestfgetadView(j, j2, j3, j4, j5, null);
        int i2 = onExtraCallback + 115;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return nestfgetadView;
    }

    public static /* synthetic */ NestfgetadView onWarmupCompleted(long j, long j2, long j3, long j4, long j5, int i, Object obj) {
        long jOnWarmupCompleted;
        long jIAuthTabCallback;
        long jOnNavigationEvent;
        int i2 = 2 % 2;
        long jOnExtraCallbackWithResult = (i & 1) != 0 ? loadAppOpenAd.onWarmupCompleted.onExtraCallbackWithResult() : j;
        if ((i & 2) != 0) {
            int i3 = onExtraCallback + 75;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            jOnWarmupCompleted = loadAppOpenAd.onWarmupCompleted.onWarmupCompleted();
        } else {
            jOnWarmupCompleted = j2;
        }
        if ((i & 4) != 0) {
            jIAuthTabCallback = loadAppOpenAd.onWarmupCompleted.IAuthTabCallback();
            int i5 = onExtraCallbackWithResult + 47;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
        } else {
            jIAuthTabCallback = j3;
        }
        long jOnExtraCallback = (i & 8) != 0 ? loadAppOpenAd.onWarmupCompleted.onExtraCallback() : j4;
        if ((i & 16) != 0) {
            int i7 = onExtraCallbackWithResult + 65;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            jOnNavigationEvent = loadAppOpenAd.onWarmupCompleted.onNavigationEvent();
        } else {
            jOnNavigationEvent = j5;
        }
        return onNavigationEvent(jOnExtraCallbackWithResult, jOnWarmupCompleted, jIAuthTabCallback, jOnExtraCallback, jOnNavigationEvent);
    }

    public static final NestfgetadView onNavigationEvent(long j, long j2, long j3, long j4, long j5) {
        int i = 2 % 2;
        NestfgetadView nestfgetadView = new NestfgetadView(j, j2, j3, j4, j5, null);
        int i2 = onExtraCallbackWithResult + 81;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return nestfgetadView;
    }
}
