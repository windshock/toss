package o;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class MaxDebuggerWaterfallSegmentsActivity {
    private static final long IAuthTabCallback;
    private static final long IAuthTabCallbackDefault;
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder = 1;
    private static int asInterface;
    public static final MaxDebuggerWaterfallSegmentsActivity onExtraCallback = new MaxDebuggerWaterfallSegmentsActivity();
    private static final long onExtraCallbackWithResult;
    private static final long onNavigationEvent;
    private static int onTransact;
    private static final long onWarmupCompleted;

    private MaxDebuggerWaterfallSegmentsActivity() {
    }

    static {
        bExternalSyntheticLambda13 bexternalsyntheticlambda13 = bExternalSyntheticLambda13.onWarmupCompleted;
        onExtraCallbackWithResult = ByteOrderedDataOutputStream.onExtraCallback(bexternalsyntheticlambda13.onWarmupCompleted());
        IAuthTabCallback = ByteOrderedDataOutputStream.onExtraCallback(bexternalsyntheticlambda13.onExtraCallbackWithResult());
        onWarmupCompleted = ByteOrderedDataOutputStream.onExtraCallback(bexternalsyntheticlambda13.onNavigationEvent());
        onNavigationEvent = ByteOrderedDataOutputStream.onExtraCallback(bexternalsyntheticlambda13.onExtraCallback());
        IAuthTabCallbackDefault = ByteOrderedDataOutputStream.onExtraCallback(bexternalsyntheticlambda13.IAuthTabCallback());
        int i = asBinder + 69;
        asInterface = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public final long onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 11;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        long j = onExtraCallbackWithResult;
        int i5 = i3 + 45;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 101;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback;
        }
        int i3 = 68 / 0;
        return IAuthTabCallback;
    }

    public final long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 77;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 13;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        long j = onNavigationEvent;
        int i5 = i2 + 51;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 27;
        int i3 = i2 % 128;
        onTransact = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        long j = IAuthTabCallbackDefault;
        int i4 = i3 + 13;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return j;
        }
        obj.hashCode();
        throw null;
    }
}
