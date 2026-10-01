package o;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class MaxDebuggerTcfStringActivity {
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 0;
    private static int asBinder = 1;
    public static final MaxDebuggerTcfStringActivity onExtraCallback = new MaxDebuggerTcfStringActivity();
    private static final long onExtraCallbackWithResult;
    private static int onNavigationEvent = 1;
    private static final long onWarmupCompleted;

    private MaxDebuggerTcfStringActivity() {
    }

    static {
        bExternalSyntheticLambda14 bexternalsyntheticlambda14 = bExternalSyntheticLambda14.onExtraCallback;
        onWarmupCompleted = ByteOrderedDataOutputStream.onExtraCallback(bexternalsyntheticlambda14.onWarmupCompleted());
        onExtraCallbackWithResult = ByteOrderedDataOutputStream.onExtraCallback(bexternalsyntheticlambda14.IAuthTabCallback());
        int i = IAuthTabCallback + 27;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public final long onExtraCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 47;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted;
        }
        int i3 = 18 / 0;
        return onWarmupCompleted;
    }

    public final long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 41;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        long j = onExtraCallbackWithResult;
        int i5 = i2 + 7;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            return j;
        }
        throw null;
    }
}
