package o;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class NestfputadView {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;

    public static /* synthetic */ NestfputzoneId onNavigationEvent(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, int i, Object obj) {
        long jIAuthTabCallback;
        long jOnNavigationEvent;
        long jOnExtraCallbackWithResult;
        long jAsBinder;
        long jIAuthTabCallbackStub;
        long jIAuthTabCallbackDefault;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback;
        int i4 = i3 + 81;
        onExtraCallback = i4 % 128;
        Object obj2 = null;
        if (i4 % 2 == 0 ? (i & 1) == 0 : (i & 1) == 0) {
            jIAuthTabCallback = j;
        } else {
            int i5 = i3 + 73;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                MaxRewardedAdViewAdapter.onWarmupCompleted.IAuthTabCallback();
                obj2.hashCode();
                throw null;
            }
            jIAuthTabCallback = MaxRewardedAdViewAdapter.onWarmupCompleted.IAuthTabCallback();
        }
        long jOnWarmupCompleted = (i & 2) != 0 ? MaxRewardedAdViewAdapter.onWarmupCompleted.onWarmupCompleted() : j2;
        if ((i & 4) != 0) {
            int i6 = onExtraCallback + 87;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            jOnNavigationEvent = MaxRewardedAdViewAdapter.onWarmupCompleted.onNavigationEvent();
        } else {
            jOnNavigationEvent = j3;
        }
        long jOnExtraCallback = (i & 8) != 0 ? MaxRewardedAdViewAdapter.onWarmupCompleted.onExtraCallback() : j4;
        if ((i & 16) != 0) {
            int i8 = IAuthTabCallback + 47;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            jOnExtraCallbackWithResult = MaxRewardedAdViewAdapter.onWarmupCompleted.onExtraCallbackWithResult();
        } else {
            jOnExtraCallbackWithResult = j5;
        }
        if ((i & 32) != 0) {
            int i10 = IAuthTabCallback + 41;
            onExtraCallback = i10 % 128;
            if (i10 % 2 != 0) {
                MaxRewardedAdViewAdapter.onWarmupCompleted.asBinder();
                obj2.hashCode();
                throw null;
            }
            jAsBinder = MaxRewardedAdViewAdapter.onWarmupCompleted.asBinder();
        } else {
            jAsBinder = j6;
        }
        if ((i & 64) != 0) {
            int i11 = IAuthTabCallback + 67;
            onExtraCallback = i11 % 128;
            int i12 = i11 % 2;
            jIAuthTabCallbackStub = MaxRewardedAdViewAdapter.onWarmupCompleted.IAuthTabCallbackStub();
        } else {
            jIAuthTabCallbackStub = j7;
        }
        if ((i & 128) != 0) {
            int i13 = onExtraCallback + 119;
            IAuthTabCallback = i13 % 128;
            int i14 = i13 % 2;
            jIAuthTabCallbackDefault = MaxRewardedAdViewAdapter.onWarmupCompleted.IAuthTabCallbackDefault();
        } else {
            jIAuthTabCallbackDefault = j8;
        }
        return onNavigationEvent(jIAuthTabCallback, jOnWarmupCompleted, jOnNavigationEvent, jOnExtraCallback, jOnExtraCallbackWithResult, jAsBinder, jIAuthTabCallbackStub, jIAuthTabCallbackDefault);
    }

    public static final NestfputzoneId onNavigationEvent(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        int i = 2 % 2;
        NestfputzoneId nestfputzoneId = new NestfputzoneId(j, j2, j3, j4, j5, j6, j7, j8, null);
        int i2 = onExtraCallback + 31;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return nestfputzoneId;
    }

    public static /* synthetic */ NestfputzoneId onExtraCallbackWithResult(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, int i, Object obj) {
        long jOnWarmupCompleted;
        long jIAuthTabCallback;
        long jOnNavigationEvent;
        long jIAuthTabCallbackStub;
        long j9;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 105;
        onExtraCallback = i3 % 128;
        long jOnExtraCallbackWithResult = (i3 % 2 == 0 && (i & 1) != 0) ? MaxInterstitialAdapter.onExtraCallback.onExtraCallbackWithResult() : j;
        long jOnExtraCallback = (i & 2) != 0 ? MaxInterstitialAdapter.onExtraCallback.onExtraCallback() : j2;
        if ((i & 4) != 0) {
            int i4 = IAuthTabCallback + 27;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            jOnWarmupCompleted = MaxInterstitialAdapter.onExtraCallback.onWarmupCompleted();
        } else {
            jOnWarmupCompleted = j3;
        }
        if ((i & 8) != 0) {
            int i6 = onExtraCallback + 49;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            jIAuthTabCallback = MaxInterstitialAdapter.onExtraCallback.IAuthTabCallback();
            int i8 = onExtraCallback + 115;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
        } else {
            jIAuthTabCallback = j4;
        }
        if ((i & 16) != 0) {
            jOnNavigationEvent = MaxInterstitialAdapter.onExtraCallback.onNavigationEvent();
            int i10 = onExtraCallback + 23;
            IAuthTabCallback = i10 % 128;
            int i11 = i10 % 2;
        } else {
            jOnNavigationEvent = j5;
        }
        if ((i & 32) != 0) {
            int i12 = IAuthTabCallback + 67;
            onExtraCallback = i12 % 128;
            if (i12 % 2 != 0) {
                MaxInterstitialAdapter.onExtraCallback.IAuthTabCallbackStub();
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            jIAuthTabCallbackStub = MaxInterstitialAdapter.onExtraCallback.IAuthTabCallbackStub();
        } else {
            jIAuthTabCallbackStub = j6;
        }
        if ((i & 64) != 0) {
            long jAsBinder = MaxInterstitialAdapter.onExtraCallback.asBinder();
            int i13 = IAuthTabCallback + 89;
            onExtraCallback = i13 % 128;
            int i14 = i13 % 2;
            j9 = jAsBinder;
        } else {
            j9 = j7;
        }
        return onExtraCallback(jOnExtraCallbackWithResult, jOnExtraCallback, jOnWarmupCompleted, jIAuthTabCallback, jOnNavigationEvent, jIAuthTabCallbackStub, j9, (i & 128) != 0 ? MaxInterstitialAdapter.onExtraCallback.asInterface() : j8);
    }

    public static final NestfputzoneId onExtraCallback(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        int i = 2 % 2;
        NestfputzoneId nestfputzoneId = new NestfputzoneId(j, j2, j3, j4, j5, j6, j7, j8, null);
        int i2 = onExtraCallback + 117;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return nestfputzoneId;
    }
}
