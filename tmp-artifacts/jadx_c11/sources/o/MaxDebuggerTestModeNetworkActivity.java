package o;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class MaxDebuggerTestModeNetworkActivity {
    private static final long IAuthTabCallback;
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder = 0;
    public static final MaxDebuggerTestModeNetworkActivity onExtraCallback = new MaxDebuggerTestModeNetworkActivity();
    private static final long onExtraCallbackWithResult;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    private MaxDebuggerTestModeNetworkActivity() {
    }

    static {
        bExternalSyntheticLambda12 bexternalsyntheticlambda12 = bExternalSyntheticLambda12.onWarmupCompleted;
        onExtraCallbackWithResult = ByteOrderedDataOutputStream.onExtraCallback(bexternalsyntheticlambda12.onExtraCallbackWithResult());
        IAuthTabCallback = ByteOrderedDataOutputStream.onExtraCallback(bexternalsyntheticlambda12.IAuthTabCallback());
        int i = onNavigationEvent + 25;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    public final long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 121;
        asBinder = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        long j = onExtraCallbackWithResult;
        int i4 = i2 + 103;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return j;
        }
        throw null;
    }

    public final long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asBinder + 49;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
