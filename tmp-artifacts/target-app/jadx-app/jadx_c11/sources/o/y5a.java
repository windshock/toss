package o;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class y5a {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    public static /* synthetic */ y5 onWarmupCompleted(long j, long j2, long j3, long j4, long j5, int i, Object obj) {
        long jOnNavigationEvent;
        long jOnExtraCallbackWithResult;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult;
        int i4 = i3 + 19;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        Object obj2 = null;
        if ((i & 1) != 0) {
            int i6 = i3 + 57;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 != 0) {
                MaxAd.onExtraCallback.onNavigationEvent();
                throw null;
            }
            jOnNavigationEvent = MaxAd.onExtraCallback.onNavigationEvent();
        } else {
            jOnNavigationEvent = j;
        }
        long jIAuthTabCallback = (i & 2) != 0 ? MaxAd.onExtraCallback.IAuthTabCallback() : j2;
        long jOnWarmupCompleted = (i & 4) != 0 ? MaxAd.onExtraCallback.onWarmupCompleted() : j3;
        long jOnExtraCallback = (i & 8) != 0 ? MaxAd.onExtraCallback.onExtraCallback() : j4;
        if ((i & 16) != 0) {
            int i7 = onWarmupCompleted + 85;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 == 0) {
                MaxAd.onExtraCallback.onExtraCallbackWithResult();
                obj2.hashCode();
                throw null;
            }
            jOnExtraCallbackWithResult = MaxAd.onExtraCallback.onExtraCallbackWithResult();
        } else {
            jOnExtraCallbackWithResult = j5;
        }
        return IAuthTabCallback(jOnNavigationEvent, jIAuthTabCallback, jOnWarmupCompleted, jOnExtraCallback, jOnExtraCallbackWithResult);
    }

    public static final y5 IAuthTabCallback(long j, long j2, long j3, long j4, long j5) {
        int i = 2 % 2;
        y5 y5Var = new y5(j, j2, j3, j4, j5, null);
        int i2 = onWarmupCompleted + 41;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return y5Var;
        }
        throw null;
    }

    public static /* synthetic */ y5 onExtraCallback(long j, long j2, long j3, long j4, long j5, int i, Object obj) {
        long jOnWarmupCompleted;
        long jOnExtraCallback;
        long jOnExtraCallbackWithResult;
        long jOnNavigationEvent;
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = onExtraCallbackWithResult + 95;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            jOnWarmupCompleted = MaxAdExpirationListener.IAuthTabCallback.onWarmupCompleted();
        } else {
            jOnWarmupCompleted = j;
        }
        long jIAuthTabCallback = (i & 2) != 0 ? MaxAdExpirationListener.IAuthTabCallback.IAuthTabCallback() : j2;
        if ((i & 4) != 0) {
            int i5 = onExtraCallbackWithResult + 53;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            jOnExtraCallback = MaxAdExpirationListener.IAuthTabCallback.onExtraCallback();
            int i7 = onWarmupCompleted + 113;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
        } else {
            jOnExtraCallback = j3;
        }
        if ((i & 8) != 0) {
            int i9 = onWarmupCompleted + 83;
            onExtraCallbackWithResult = i9 % 128;
            if (i9 % 2 == 0) {
                MaxAdExpirationListener.IAuthTabCallback.onExtraCallbackWithResult();
                throw null;
            }
            jOnExtraCallbackWithResult = MaxAdExpirationListener.IAuthTabCallback.onExtraCallbackWithResult();
        } else {
            jOnExtraCallbackWithResult = j4;
        }
        if ((i & 16) != 0) {
            int i10 = onWarmupCompleted + 91;
            onExtraCallbackWithResult = i10 % 128;
            if (i10 % 2 == 0) {
                MaxAdExpirationListener.IAuthTabCallback.onNavigationEvent();
                throw null;
            }
            jOnNavigationEvent = MaxAdExpirationListener.IAuthTabCallback.onNavigationEvent();
        } else {
            jOnNavigationEvent = j5;
        }
        return onExtraCallback(jOnWarmupCompleted, jIAuthTabCallback, jOnExtraCallback, jOnExtraCallbackWithResult, jOnNavigationEvent);
    }

    public static final y5 onExtraCallback(long j, long j2, long j3, long j4, long j5) {
        int i = 2 % 2;
        y5 y5Var = new y5(j, j2, j3, j4, j5, null);
        int i2 = onExtraCallbackWithResult + 57;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return y5Var;
    }
}
