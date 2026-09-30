package o;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class z6 {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;

    public static /* synthetic */ z7 onWarmupCompleted(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, int i, Object obj) {
        long jOnExtraCallbackWithResult;
        long jOnTransact;
        int i2 = 2 % 2;
        long jIAuthTabCallback = (i & 1) != 0 ? MaxErrorCodes.onExtraCallback.IAuthTabCallback() : j;
        long jOnWarmupCompleted = (i & 2) != 0 ? MaxErrorCodes.onExtraCallback.onWarmupCompleted() : j2;
        long jOnNavigationEvent = (i & 4) != 0 ? MaxErrorCodes.onExtraCallback.onNavigationEvent() : j3;
        if ((i & 8) != 0) {
            int i3 = onNavigationEvent + 37;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            jOnExtraCallbackWithResult = MaxErrorCodes.onExtraCallback.onExtraCallbackWithResult();
            int i5 = onNavigationEvent + 57;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
        } else {
            jOnExtraCallbackWithResult = j4;
        }
        long jOnExtraCallback = (i & 16) != 0 ? MaxErrorCodes.onExtraCallback.onExtraCallback() : j5;
        if ((i & 32) != 0) {
            jOnTransact = MaxErrorCodes.onExtraCallback.onTransact();
            int i7 = onExtraCallback + 77;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
        } else {
            jOnTransact = j6;
        }
        z7 z7VarOnExtraCallback = onExtraCallback(jIAuthTabCallback, jOnWarmupCompleted, jOnNavigationEvent, jOnExtraCallbackWithResult, jOnExtraCallback, jOnTransact, (i & 64) != 0 ? MaxErrorCodes.onExtraCallback.asBinder() : j7, (i & 128) != 0 ? MaxErrorCodes.onExtraCallback.IAuthTabCallbackStub() : j8);
        int i9 = onNavigationEvent + 111;
        onExtraCallback = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 48 / 0;
        }
        return z7VarOnExtraCallback;
    }

    public static final z7 onExtraCallback(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        int i = 2 % 2;
        z7 z7Var = new z7(j, j2, j3, j4, j5, j6, j7, j8, null);
        int i2 = onExtraCallback + 91;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return z7Var;
    }

    public static /* synthetic */ z7 onExtraCallbackWithResult(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, int i, Object obj) {
        long jOnNavigationEvent;
        long jOnWarmupCompleted;
        long jOnExtraCallbackWithResult;
        long jAsBinder;
        long j9;
        long jIAuthTabCallbackDefault;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 107;
        onNavigationEvent = i3 % 128;
        long jIAuthTabCallback = (i3 % 2 != 0 ? (i & 1) == 0 : (i & 1) == 0) ? j : MaxMediatedNetworkInfo.onNavigationEvent.IAuthTabCallback();
        Object obj2 = null;
        if ((i & 2) != 0) {
            int i4 = onExtraCallback + 103;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                MaxMediatedNetworkInfo.onNavigationEvent.onNavigationEvent();
                throw null;
            }
            jOnNavigationEvent = MaxMediatedNetworkInfo.onNavigationEvent.onNavigationEvent();
        } else {
            jOnNavigationEvent = j2;
        }
        if ((i & 4) != 0) {
            int i5 = onNavigationEvent + 119;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            jOnWarmupCompleted = MaxMediatedNetworkInfo.onNavigationEvent.onWarmupCompleted();
        } else {
            jOnWarmupCompleted = j3;
        }
        long jOnExtraCallback = (i & 8) != 0 ? MaxMediatedNetworkInfo.onNavigationEvent.onExtraCallback() : j4;
        if ((i & 16) != 0) {
            jOnExtraCallbackWithResult = MaxMediatedNetworkInfo.onNavigationEvent.onExtraCallbackWithResult();
            int i7 = onNavigationEvent + 33;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
        } else {
            jOnExtraCallbackWithResult = j5;
        }
        if ((i & 32) != 0) {
            int i9 = onNavigationEvent + 109;
            onExtraCallback = i9 % 128;
            if (i9 % 2 != 0) {
                MaxMediatedNetworkInfo.onNavigationEvent.asBinder();
                obj2.hashCode();
                throw null;
            }
            jAsBinder = MaxMediatedNetworkInfo.onNavigationEvent.asBinder();
        } else {
            jAsBinder = j6;
        }
        long jIAuthTabCallbackStub = (i & 64) != 0 ? MaxMediatedNetworkInfo.onNavigationEvent.IAuthTabCallbackStub() : j7;
        if ((i & 128) != 0) {
            int i10 = onNavigationEvent + 109;
            j9 = jIAuthTabCallbackStub;
            onExtraCallback = i10 % 128;
            if (i10 % 2 != 0) {
                jIAuthTabCallbackDefault = MaxMediatedNetworkInfo.onNavigationEvent.IAuthTabCallbackDefault();
                int i11 = 55 / 0;
            } else {
                jIAuthTabCallbackDefault = MaxMediatedNetworkInfo.onNavigationEvent.IAuthTabCallbackDefault();
            }
        } else {
            j9 = jIAuthTabCallbackStub;
            jIAuthTabCallbackDefault = j8;
        }
        return onWarmupCompleted(jIAuthTabCallback, jOnNavigationEvent, jOnWarmupCompleted, jOnExtraCallback, jOnExtraCallbackWithResult, jAsBinder, j9, jIAuthTabCallbackDefault);
    }

    public static final z7 onWarmupCompleted(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        int i = 2 % 2;
        z7 z7Var = new z7(j, j2, j3, j4, j5, j6, j7, j8, null);
        int i2 = onNavigationEvent + 83;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return z7Var;
    }
}
