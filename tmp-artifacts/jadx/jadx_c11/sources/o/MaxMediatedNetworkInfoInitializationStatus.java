package o;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class MaxMediatedNetworkInfoInitializationStatus {
    private static final long IAuthTabCallback;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int asInterface = 1;
    private static int onExtraCallback;
    private static final long onExtraCallbackWithResult;
    private static final long onNavigationEvent;
    public static final MaxMediatedNetworkInfoInitializationStatus onWarmupCompleted = new MaxMediatedNetworkInfoInitializationStatus();

    private MaxMediatedNetworkInfoInitializationStatus() {
    }

    static {
        bExternalSyntheticLambda2 bexternalsyntheticlambda2 = bExternalSyntheticLambda2.onExtraCallbackWithResult;
        onExtraCallbackWithResult = ByteOrderedDataOutputStream.onExtraCallback(bexternalsyntheticlambda2.onNavigationEvent());
        onNavigationEvent = ByteOrderedDataOutputStream.onExtraCallback(bexternalsyntheticlambda2.onWarmupCompleted());
        IAuthTabCallback = ByteOrderedDataOutputStream.onExtraCallback(bexternalsyntheticlambda2.IAuthTabCallback());
        int i = IAuthTabCallbackStub + 71;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public final long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 5;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallbackWithResult;
        }
        int i3 = 86 / 0;
        return onExtraCallbackWithResult;
    }

    public final long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 115;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        long j = onNavigationEvent;
        int i5 = i2 + 27;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long onExtraCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 67;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        long j = IAuthTabCallback;
        int i5 = i3 + 101;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }
}
