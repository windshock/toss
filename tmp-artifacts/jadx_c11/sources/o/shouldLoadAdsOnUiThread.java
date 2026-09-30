package o;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class shouldLoadAdsOnUiThread {
    private static final long IAuthTabCallback;
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int asBinder = 1;
    public static final shouldLoadAdsOnUiThread onExtraCallback = new shouldLoadAdsOnUiThread();
    private static final long onExtraCallbackWithResult;
    private static final long onNavigationEvent;
    private static int onTransact;
    private static final long onWarmupCompleted;

    private shouldLoadAdsOnUiThread() {
    }

    public final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onTransact + 85;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        long j = IAuthTabCallback;
        int i5 = i3 + 87;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    static {
        dExternalSyntheticLambda1 dexternalsyntheticlambda1 = dExternalSyntheticLambda1.IAuthTabCallback;
        IAuthTabCallback = ByteOrderedDataOutputStream.onExtraCallback(dexternalsyntheticlambda1.IAuthTabCallback());
        onExtraCallbackWithResult = ByteOrderedDataOutputStream.onExtraCallback(dexternalsyntheticlambda1.onExtraCallback());
        onWarmupCompleted = ByteOrderedDataOutputStream.onExtraCallback(dexternalsyntheticlambda1.onExtraCallbackWithResult());
        onNavigationEvent = ByteOrderedDataOutputStream.onExtraCallback(dexternalsyntheticlambda1.onWarmupCompleted());
        int i = IAuthTabCallbackDefault + 3;
        IAuthTabCallbackStub = i % 128;
        int i2 = i % 2;
    }

    public final long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asBinder + 47;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallbackWithResult;
        }
        throw null;
    }

    public final long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 19;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        long j = onWarmupCompleted;
        int i4 = i2 + 9;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return j;
        }
        throw null;
    }

    public final long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 103;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return onNavigationEvent;
        }
        int i3 = 79 / 0;
        return onNavigationEvent;
    }
}
