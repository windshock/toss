package o;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class AppLovinUtilsServerParameterKeys {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public static /* synthetic */ isChildUser onExtraCallback(long j, long j2, long j3, long j4, int i, Object obj) {
        long jOnExtraCallbackWithResult;
        long jOnWarmupCompleted;
        long jIAuthTabCallback;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 111;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        long jOnNavigationEvent = (i & 1) != 0 ? shouldLoadAdsOnUiThread.onExtraCallback.onNavigationEvent() : j;
        Object obj2 = null;
        if ((i & 2) != 0) {
            int i5 = onWarmupCompleted + 101;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                shouldLoadAdsOnUiThread.onExtraCallback.onExtraCallbackWithResult();
                obj2.hashCode();
                throw null;
            }
            jOnExtraCallbackWithResult = shouldLoadAdsOnUiThread.onExtraCallback.onExtraCallbackWithResult();
        } else {
            jOnExtraCallbackWithResult = j2;
        }
        if ((i & 4) != 0) {
            jOnWarmupCompleted = shouldLoadAdsOnUiThread.onExtraCallback.onWarmupCompleted();
            int i6 = onWarmupCompleted + 31;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
        } else {
            jOnWarmupCompleted = j3;
        }
        if ((i & 8) != 0) {
            int i8 = onNavigationEvent + 1;
            onWarmupCompleted = i8 % 128;
            if (i8 % 2 == 0) {
                shouldLoadAdsOnUiThread.onExtraCallback.IAuthTabCallback();
                obj2.hashCode();
                throw null;
            }
            jIAuthTabCallback = shouldLoadAdsOnUiThread.onExtraCallback.IAuthTabCallback();
        } else {
            jIAuthTabCallback = j4;
        }
        return onExtraCallbackWithResult(jOnNavigationEvent, jOnExtraCallbackWithResult, jOnWarmupCompleted, jIAuthTabCallback);
    }

    public static final isChildUser onExtraCallbackWithResult(long j, long j2, long j3, long j4) {
        int i = 2 % 2;
        isChildUser ischilduser = new isChildUser(j, j2, j3, j4, null);
        int i2 = onWarmupCompleted + 83;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return ischilduser;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ isChildUser onExtraCallbackWithResult(long j, long j2, long j3, long j4, int i, Object obj) {
        long jIAuthTabCallback;
        int i2 = 2 % 2;
        long jOnWarmupCompleted = (i & 1) != 0 ? shouldShowAdsOnUiThread.onNavigationEvent.onWarmupCompleted() : j;
        long jOnNavigationEvent = (i & 2) != 0 ? shouldShowAdsOnUiThread.onNavigationEvent.onNavigationEvent() : j2;
        if ((i & 4) != 0) {
            int i3 = onWarmupCompleted + 93;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                shouldShowAdsOnUiThread.onNavigationEvent.IAuthTabCallback();
                throw null;
            }
            jIAuthTabCallback = shouldShowAdsOnUiThread.onNavigationEvent.IAuthTabCallback();
        } else {
            jIAuthTabCallback = j3;
        }
        isChildUser ischilduserIAuthTabCallback = IAuthTabCallback(jOnWarmupCompleted, jOnNavigationEvent, jIAuthTabCallback, (i & 8) != 0 ? shouldShowAdsOnUiThread.onNavigationEvent.onExtraCallback() : j4);
        int i4 = onNavigationEvent + 17;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return ischilduserIAuthTabCallback;
    }

    public static final isChildUser IAuthTabCallback(long j, long j2, long j3, long j4) {
        int i = 2 % 2;
        isChildUser ischilduser = new isChildUser(j, j2, j3, j4, null);
        int i2 = onWarmupCompleted + 15;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return ischilduser;
    }
}
