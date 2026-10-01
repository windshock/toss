package o;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class AppLovinExtrasKeys {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;

    public static /* synthetic */ getChildUserError IAuthTabCallback(long j, long j2, long j3, long j4, long j5, long j6, long j7, int i, Object obj) {
        long jOnWarmupCompleted;
        long jIAuthTabCallback;
        long jOnExtraCallbackWithResult;
        long j8;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 71;
        onNavigationEvent = i3 % 128;
        long jOnNavigationEvent = (i3 % 2 == 0 || (i & 1) == 0) ? j : loadAdViewAd.onNavigationEvent.onNavigationEvent();
        if ((i & 2) != 0) {
            int i4 = onNavigationEvent + 61;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            jOnWarmupCompleted = loadAdViewAd.onNavigationEvent.onWarmupCompleted();
        } else {
            jOnWarmupCompleted = j2;
        }
        if ((i & 4) != 0) {
            jIAuthTabCallback = loadAdViewAd.onNavigationEvent.IAuthTabCallback();
            int i6 = onNavigationEvent + 53;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
        } else {
            jIAuthTabCallback = j3;
        }
        long jOnExtraCallback = (i & 8) != 0 ? loadAdViewAd.onNavigationEvent.onExtraCallback() : j4;
        if ((i & 16) != 0) {
            jOnExtraCallbackWithResult = loadAdViewAd.onNavigationEvent.onExtraCallbackWithResult();
            int i8 = IAuthTabCallback + 91;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
        } else {
            jOnExtraCallbackWithResult = j5;
        }
        long jAsBinder = (i & 32) != 0 ? loadAdViewAd.onNavigationEvent.asBinder() : j6;
        if ((i & 64) != 0) {
            long jAsInterface = loadAdViewAd.onNavigationEvent.asInterface();
            int i10 = onNavigationEvent + 67;
            IAuthTabCallback = i10 % 128;
            int i11 = i10 % 2;
            j8 = jAsInterface;
        } else {
            j8 = j7;
        }
        return onNavigationEvent(jOnNavigationEvent, jOnWarmupCompleted, jIAuthTabCallback, jOnExtraCallback, jOnExtraCallbackWithResult, jAsBinder, j8);
    }

    public static final getChildUserError onNavigationEvent(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        int i = 2 % 2;
        getChildUserError getchildusererror = new getChildUserError(j, j2, j3, j4, j5, j6, j7, null);
        int i2 = onNavigationEvent + 93;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return getchildusererror;
    }

    public static /* synthetic */ getChildUserError onExtraCallbackWithResult(long j, long j2, long j3, long j4, long j5, long j6, long j7, int i, Object obj) {
        long jOnExtraCallback;
        long jOnWarmupCompleted;
        long jIAuthTabCallback;
        long jIAuthTabCallbackDefault;
        long jIAuthTabCallbackStub;
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = onNavigationEvent + 97;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                jOnExtraCallback = MaxAdViewAdapter.IAuthTabCallback.onExtraCallback();
                int i4 = 25 / 0;
            } else {
                jOnExtraCallback = MaxAdViewAdapter.IAuthTabCallback.onExtraCallback();
            }
        } else {
            jOnExtraCallback = j;
        }
        long jOnExtraCallbackWithResult = (i & 2) != 0 ? MaxAdViewAdapter.IAuthTabCallback.onExtraCallbackWithResult() : j2;
        if ((i & 4) != 0) {
            int i5 = onNavigationEvent + 15;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            jOnWarmupCompleted = MaxAdViewAdapter.IAuthTabCallback.onWarmupCompleted();
        } else {
            jOnWarmupCompleted = j3;
        }
        long jOnNavigationEvent = (i & 8) != 0 ? MaxAdViewAdapter.IAuthTabCallback.onNavigationEvent() : j4;
        Object obj2 = null;
        if ((i & 16) != 0) {
            int i7 = IAuthTabCallback + 117;
            onNavigationEvent = i7 % 128;
            if (i7 % 2 == 0) {
                MaxAdViewAdapter.IAuthTabCallback.IAuthTabCallback();
                throw null;
            }
            jIAuthTabCallback = MaxAdViewAdapter.IAuthTabCallback.IAuthTabCallback();
        } else {
            jIAuthTabCallback = j5;
        }
        if ((i & 32) != 0) {
            int i8 = IAuthTabCallback + 21;
            onNavigationEvent = i8 % 128;
            if (i8 % 2 == 0) {
                jIAuthTabCallbackDefault = MaxAdViewAdapter.IAuthTabCallback.IAuthTabCallbackDefault();
                int i9 = 96 / 0;
            } else {
                jIAuthTabCallbackDefault = MaxAdViewAdapter.IAuthTabCallback.IAuthTabCallbackDefault();
            }
        } else {
            jIAuthTabCallbackDefault = j6;
        }
        if ((i & 64) != 0) {
            int i10 = onNavigationEvent + 93;
            IAuthTabCallback = i10 % 128;
            if (i10 % 2 != 0) {
                MaxAdViewAdapter.IAuthTabCallback.IAuthTabCallbackStub();
                obj2.hashCode();
                throw null;
            }
            jIAuthTabCallbackStub = MaxAdViewAdapter.IAuthTabCallback.IAuthTabCallbackStub();
        } else {
            jIAuthTabCallbackStub = j7;
        }
        getChildUserError getchildusererrorIAuthTabCallback = IAuthTabCallback(jOnExtraCallback, jOnExtraCallbackWithResult, jOnWarmupCompleted, jOnNavigationEvent, jIAuthTabCallback, jIAuthTabCallbackDefault, jIAuthTabCallbackStub);
        int i11 = IAuthTabCallback + 119;
        onNavigationEvent = i11 % 128;
        int i12 = i11 % 2;
        return getchildusererrorIAuthTabCallback;
    }

    public static final getChildUserError IAuthTabCallback(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        int i = 2 % 2;
        getChildUserError getchildusererror = new getChildUserError(j, j2, j3, j4, j5, j6, j7, null);
        int i2 = onNavigationEvent + 109;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return getchildusererror;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
