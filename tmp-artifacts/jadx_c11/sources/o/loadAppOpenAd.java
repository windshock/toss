package o;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class loadAppOpenAd {
    private static final long IAuthTabCallback;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder = 0;
    private static final long asInterface;
    private static final long onExtraCallback;
    private static final long onExtraCallbackWithResult;
    private static final long onNavigationEvent;
    private static int onTransact = 1;
    public static final loadAppOpenAd onWarmupCompleted = new loadAppOpenAd();

    private loadAppOpenAd() {
    }

    static {
        eExternalSyntheticLambda3 eexternalsyntheticlambda3 = eExternalSyntheticLambda3.onExtraCallback;
        onNavigationEvent = ByteOrderedDataOutputStream.onExtraCallback(eexternalsyntheticlambda3.onWarmupCompleted());
        onExtraCallback = ByteOrderedDataOutputStream.onExtraCallback(eexternalsyntheticlambda3.onExtraCallback());
        onExtraCallbackWithResult = ByteOrderedDataOutputStream.onExtraCallback(eexternalsyntheticlambda3.IAuthTabCallback());
        IAuthTabCallback = ByteOrderedDataOutputStream.onExtraCallback(eexternalsyntheticlambda3.onExtraCallbackWithResult());
        asInterface = ByteOrderedDataOutputStream.onExtraCallback(eexternalsyntheticlambda3.onNavigationEvent());
        int i = onTransact + 83;
        IAuthTabCallbackDefault = i % 128;
        int i2 = i % 2;
    }

    public final long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 39;
        int i3 = i2 % 128;
        asBinder = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        long j = onNavigationEvent;
        int i4 = i3 + 75;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return j;
        }
        throw null;
    }

    public final long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 85;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        long j = onExtraCallback;
        int i5 = i3 + 69;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 81;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        long j = onExtraCallbackWithResult;
        int i5 = i3 + 107;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long onExtraCallback() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 119;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        long j = IAuthTabCallback;
        int i4 = i2 + 33;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return j;
    }

    public final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asBinder + 39;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        long j = asInterface;
        int i5 = i3 + 73;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
