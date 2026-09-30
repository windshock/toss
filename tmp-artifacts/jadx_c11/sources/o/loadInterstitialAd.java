package o;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class loadInterstitialAd {
    public static final loadInterstitialAd IAuthTabCallback = new loadInterstitialAd();
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int asInterface = 1;
    private static final long onExtraCallback;
    private static final long onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static final long onWarmupCompleted;

    private loadInterstitialAd() {
    }

    static {
        gExternalSyntheticLambda0 gexternalsyntheticlambda0 = gExternalSyntheticLambda0.onExtraCallback;
        onExtraCallback = ByteOrderedDataOutputStream.onExtraCallback(gexternalsyntheticlambda0.onExtraCallbackWithResult());
        onExtraCallbackWithResult = ByteOrderedDataOutputStream.onExtraCallback(gexternalsyntheticlambda0.IAuthTabCallback());
        onWarmupCompleted = ByteOrderedDataOutputStream.onExtraCallback(gexternalsyntheticlambda0.onExtraCallback());
        int i = asInterface + 27;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public final long onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 71;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long j = onExtraCallback;
        int i4 = i3 + 53;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return j;
    }

    public final long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 107;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallbackWithResult;
        }
        throw null;
    }

    public final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 81;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        long j = onWarmupCompleted;
        int i5 = i3 + 123;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }
}
