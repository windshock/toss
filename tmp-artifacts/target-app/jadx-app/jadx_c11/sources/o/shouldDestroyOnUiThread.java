package o;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class shouldDestroyOnUiThread {
    private static final long IAuthTabCallback;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder = 1;
    private static int asInterface;
    private static final long onExtraCallback;
    private static final long onExtraCallbackWithResult;
    public static final shouldDestroyOnUiThread onNavigationEvent = new shouldDestroyOnUiThread();
    private static final long onTransact;
    private static final long onWarmupCompleted;

    private shouldDestroyOnUiThread() {
    }

    static {
        dExternalSyntheticLambda0 dexternalsyntheticlambda0 = dExternalSyntheticLambda0.onWarmupCompleted;
        IAuthTabCallback = ByteOrderedDataOutputStream.onExtraCallback(dexternalsyntheticlambda0.onWarmupCompleted());
        onWarmupCompleted = ByteOrderedDataOutputStream.onExtraCallback(dexternalsyntheticlambda0.onExtraCallback());
        onExtraCallback = ByteOrderedDataOutputStream.onExtraCallback(dexternalsyntheticlambda0.onNavigationEvent());
        onExtraCallbackWithResult = ByteOrderedDataOutputStream.onExtraCallback(dexternalsyntheticlambda0.IAuthTabCallback());
        onTransact = ByteOrderedDataOutputStream.onExtraCallback(dexternalsyntheticlambda0.onExtraCallbackWithResult());
        int i = IAuthTabCallbackStub + 47;
        IAuthTabCallbackDefault = i % 128;
        int i2 = i % 2;
    }

    public final long onExtraCallback() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 111;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        long j = IAuthTabCallback;
        int i5 = i2 + 109;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 55;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        long j = onWarmupCompleted;
        int i5 = i3 + 41;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long onExtraCallbackWithResult() {
        long j;
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 101;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            j = onExtraCallback;
            int i4 = 12 / 0;
        } else {
            j = onExtraCallback;
        }
        int i5 = i2 + 9;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asBinder + 67;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        long j = onExtraCallbackWithResult;
        int i5 = i3 + 49;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asBinder + 41;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return onTransact;
        }
        throw null;
    }
}
