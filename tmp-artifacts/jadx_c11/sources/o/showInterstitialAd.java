package o;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class showInterstitialAd {
    public static final showInterstitialAd IAuthTabCallback = new showInterstitialAd();
    private static int IAuthTabCallbackDefault = 1;
    private static final long IAuthTabCallbackStub;
    private static int asBinder = 1;
    private static int asInterface;
    private static final long onExtraCallback;
    private static final long onExtraCallbackWithResult;
    private static final long onNavigationEvent;
    private static int onTransact;
    private static final long onWarmupCompleted;

    private showInterstitialAd() {
    }

    static {
        eExternalSyntheticLambda1 eexternalsyntheticlambda1 = eExternalSyntheticLambda1.onWarmupCompleted;
        onWarmupCompleted = ByteOrderedDataOutputStream.onExtraCallback(eexternalsyntheticlambda1.onExtraCallback());
        onExtraCallback = ByteOrderedDataOutputStream.onExtraCallback(eexternalsyntheticlambda1.IAuthTabCallback());
        onNavigationEvent = ByteOrderedDataOutputStream.onExtraCallback(eexternalsyntheticlambda1.onExtraCallbackWithResult());
        onExtraCallbackWithResult = ByteOrderedDataOutputStream.onExtraCallback(eexternalsyntheticlambda1.onNavigationEvent());
        IAuthTabCallbackStub = ByteOrderedDataOutputStream.onExtraCallback(eexternalsyntheticlambda1.onWarmupCompleted());
        int i = onTransact + 113;
        IAuthTabCallbackDefault = i % 128;
        if (i % 2 == 0) {
            int i2 = 69 / 0;
        }
    }

    public final long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asBinder + 89;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted;
        }
        int i3 = 87 / 0;
        return onWarmupCompleted;
    }

    public final long onExtraCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 37;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallback;
        }
        int i3 = 89 / 0;
        return onExtraCallback;
    }

    public final long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 45;
        int i3 = i2 % 128;
        asBinder = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        long j = onNavigationEvent;
        int i4 = i3 + 121;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return j;
        }
        obj.hashCode();
        throw null;
    }

    public final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asInterface + 49;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult;
        }
        throw null;
    }

    public final long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 43;
        asInterface = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        long j = IAuthTabCallbackStub;
        int i4 = i2 + 23;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return j;
        }
        obj.hashCode();
        throw null;
    }
}
