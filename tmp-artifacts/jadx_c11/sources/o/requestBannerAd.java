package o;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class requestBannerAd {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;

    public static /* synthetic */ Nestfputsdk onNavigationEvent(long j, long j2, long j3, long j4, long j5, long j6, long j7, int i, Object obj) {
        long jOnExtraCallbackWithResult;
        long jOnNavigationEvent;
        long jIAuthTabCallback;
        long jOnWarmupCompleted;
        long jOnExtraCallback;
        long jIAuthTabCallbackDefault;
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            jOnExtraCallbackWithResult = MaxNativeAdAdapter.onWarmupCompleted.onExtraCallbackWithResult();
            int i3 = IAuthTabCallback + 53;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
        } else {
            jOnExtraCallbackWithResult = j;
        }
        if ((i & 2) != 0) {
            int i5 = onNavigationEvent + 17;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            jOnNavigationEvent = MaxNativeAdAdapter.onWarmupCompleted.onNavigationEvent();
        } else {
            jOnNavigationEvent = j2;
        }
        Object obj2 = null;
        if ((i & 4) != 0) {
            int i7 = IAuthTabCallback + 81;
            onNavigationEvent = i7 % 128;
            if (i7 % 2 == 0) {
                MaxNativeAdAdapter.onWarmupCompleted.IAuthTabCallback();
                obj2.hashCode();
                throw null;
            }
            jIAuthTabCallback = MaxNativeAdAdapter.onWarmupCompleted.IAuthTabCallback();
        } else {
            jIAuthTabCallback = j3;
        }
        if ((i & 8) != 0) {
            int i8 = IAuthTabCallback + 9;
            onNavigationEvent = i8 % 128;
            if (i8 % 2 == 0) {
                MaxNativeAdAdapter.onWarmupCompleted.onWarmupCompleted();
                throw null;
            }
            jOnWarmupCompleted = MaxNativeAdAdapter.onWarmupCompleted.onWarmupCompleted();
        } else {
            jOnWarmupCompleted = j4;
        }
        if ((i & 16) != 0) {
            int i9 = onNavigationEvent + 107;
            IAuthTabCallback = i9 % 128;
            if (i9 % 2 != 0) {
                jOnExtraCallback = MaxNativeAdAdapter.onWarmupCompleted.onExtraCallback();
                int i10 = 37 / 0;
            } else {
                jOnExtraCallback = MaxNativeAdAdapter.onWarmupCompleted.onExtraCallback();
            }
            int i11 = onNavigationEvent + 63;
            IAuthTabCallback = i11 % 128;
            int i12 = i11 % 2;
        } else {
            jOnExtraCallback = j5;
        }
        if ((i & 32) != 0) {
            int i13 = IAuthTabCallback + 7;
            onNavigationEvent = i13 % 128;
            if (i13 % 2 == 0) {
                MaxNativeAdAdapter.onWarmupCompleted.IAuthTabCallbackDefault();
                throw null;
            }
            jIAuthTabCallbackDefault = MaxNativeAdAdapter.onWarmupCompleted.IAuthTabCallbackDefault();
        } else {
            jIAuthTabCallbackDefault = j6;
        }
        return onExtraCallback(jOnExtraCallbackWithResult, jOnNavigationEvent, jIAuthTabCallback, jOnWarmupCompleted, jOnExtraCallback, jIAuthTabCallbackDefault, (i & 64) != 0 ? MaxNativeAdAdapter.onWarmupCompleted.IAuthTabCallbackStub() : j7);
    }

    public static final Nestfputsdk onExtraCallback(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        int i = 2 % 2;
        Nestfputsdk nestfputsdk = new Nestfputsdk(j, j2, j3, j4, j5, j6, j7, null);
        int i2 = onNavigationEvent + 9;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 13 / 0;
        }
        return nestfputsdk;
    }

    public static /* synthetic */ Nestfputsdk onWarmupCompleted(long j, long j2, long j3, long j4, long j5, long j6, long j7, int i, Object obj) {
        long jOnWarmupCompleted;
        long jOnExtraCallbackWithResult;
        long jOnTransact;
        int i2 = 2 % 2;
        long jOnExtraCallback = (i & 1) != 0 ? loadNativeAd.onNavigationEvent.onExtraCallback() : j;
        if ((i & 2) != 0) {
            int i3 = IAuthTabCallback + 107;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                jOnWarmupCompleted = loadNativeAd.onNavigationEvent.onWarmupCompleted();
                int i4 = 80 / 0;
            } else {
                jOnWarmupCompleted = loadNativeAd.onNavigationEvent.onWarmupCompleted();
            }
        } else {
            jOnWarmupCompleted = j2;
        }
        long jIAuthTabCallback = (i & 4) != 0 ? loadNativeAd.onNavigationEvent.IAuthTabCallback() : j3;
        if ((i & 8) != 0) {
            int i5 = IAuthTabCallback + 105;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                jOnExtraCallbackWithResult = loadNativeAd.onNavigationEvent.onExtraCallbackWithResult();
                int i6 = 69 / 0;
            } else {
                jOnExtraCallbackWithResult = loadNativeAd.onNavigationEvent.onExtraCallbackWithResult();
            }
        } else {
            jOnExtraCallbackWithResult = j4;
        }
        long jOnNavigationEvent = (i & 16) != 0 ? loadNativeAd.onNavigationEvent.onNavigationEvent() : j5;
        long jIAuthTabCallbackStub = (i & 32) != 0 ? loadNativeAd.onNavigationEvent.IAuthTabCallbackStub() : j6;
        if ((i & 64) != 0) {
            int i7 = onNavigationEvent + 95;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            jOnTransact = loadNativeAd.onNavigationEvent.onTransact();
        } else {
            jOnTransact = j7;
        }
        return onNavigationEvent(jOnExtraCallback, jOnWarmupCompleted, jIAuthTabCallback, jOnExtraCallbackWithResult, jOnNavigationEvent, jIAuthTabCallbackStub, jOnTransact);
    }

    public static final Nestfputsdk onNavigationEvent(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        int i = 2 % 2;
        Nestfputsdk nestfputsdk = new Nestfputsdk(j, j2, j3, j4, j5, j6, j7, null);
        int i2 = IAuthTabCallback + 3;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return nestfputsdk;
    }
}
