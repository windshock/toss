package o;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class MaxInterstitialAdViewAdapter {
    private static final long IAuthTabCallback;
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int asBinder = 1;
    private static int asInterface;
    private static final long onExtraCallback;
    public static final MaxInterstitialAdViewAdapter onExtraCallbackWithResult = new MaxInterstitialAdViewAdapter();
    private static final long onNavigationEvent;
    private static final long onWarmupCompleted;

    private MaxInterstitialAdViewAdapter() {
    }

    static {
        eExternalSyntheticLambda2 eexternalsyntheticlambda2 = eExternalSyntheticLambda2.onExtraCallbackWithResult;
        onWarmupCompleted = ByteOrderedDataOutputStream.onExtraCallback(eexternalsyntheticlambda2.onNavigationEvent());
        IAuthTabCallback = ByteOrderedDataOutputStream.onExtraCallback(eexternalsyntheticlambda2.onWarmupCompleted());
        onExtraCallback = ByteOrderedDataOutputStream.onExtraCallback(eexternalsyntheticlambda2.onExtraCallbackWithResult());
        onNavigationEvent = ByteOrderedDataOutputStream.onExtraCallback(eexternalsyntheticlambda2.onExtraCallback());
        int i = asBinder + 31;
        IAuthTabCallbackStub = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public final long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 43;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        long j = onWarmupCompleted;
        int i5 = i2 + 41;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asInterface + 103;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback;
        }
        throw null;
    }

    public final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asInterface + 25;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        long j = onExtraCallback;
        int i5 = i3 + 71;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asInterface + 41;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
