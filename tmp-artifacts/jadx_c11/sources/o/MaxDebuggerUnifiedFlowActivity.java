package o;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class MaxDebuggerUnifiedFlowActivity {
    private static final long IAuthTabCallback;
    private static final long IAuthTabCallbackDefault;
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder = 0;
    private static int asInterface = 0;
    public static final MaxDebuggerUnifiedFlowActivity onExtraCallback = new MaxDebuggerUnifiedFlowActivity();
    private static final long onExtraCallbackWithResult;
    private static final long onNavigationEvent;
    private static int onTransact = 1;
    private static final long onWarmupCompleted;

    private MaxDebuggerUnifiedFlowActivity() {
    }

    static {
        bExternalSyntheticLambda10 bexternalsyntheticlambda10 = bExternalSyntheticLambda10.onExtraCallback;
        IAuthTabCallback = ByteOrderedDataOutputStream.onExtraCallback(bexternalsyntheticlambda10.onExtraCallbackWithResult());
        onNavigationEvent = ByteOrderedDataOutputStream.onExtraCallback(bexternalsyntheticlambda10.IAuthTabCallback());
        onWarmupCompleted = ByteOrderedDataOutputStream.onExtraCallback(bexternalsyntheticlambda10.onExtraCallback());
        onExtraCallbackWithResult = ByteOrderedDataOutputStream.onExtraCallback(bexternalsyntheticlambda10.onNavigationEvent());
        IAuthTabCallbackDefault = ByteOrderedDataOutputStream.onExtraCallback(bexternalsyntheticlambda10.onWarmupCompleted());
        int i = IAuthTabCallbackStub + 37;
        asInterface = i % 128;
        int i2 = i % 2;
    }

    public final long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 13;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        long j = IAuthTabCallback;
        int i4 = i2 + 117;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return j;
        }
        throw null;
    }

    public final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 9;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        long j = onNavigationEvent;
        int i5 = i2 + 115;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 73;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        long j = onWarmupCompleted;
        int i5 = i2 + 91;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long onExtraCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 21;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long onExtraCallbackWithResult() {
        long j;
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 71;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            j = IAuthTabCallbackDefault;
            int i4 = 63 / 0;
        } else {
            j = IAuthTabCallbackDefault;
        }
        int i5 = i2 + 119;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }
}
