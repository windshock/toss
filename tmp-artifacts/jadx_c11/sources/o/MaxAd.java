package o;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class MaxAd {
    private static final long IAuthTabCallback;
    private static int IAuthTabCallbackDefault = 0;
    private static final long IAuthTabCallbackStub;
    private static int asBinder = 1;
    private static int asInterface = 1;
    public static final MaxAd onExtraCallback = new MaxAd();
    private static final long onExtraCallbackWithResult;
    private static final long onNavigationEvent;
    private static int onTransact;
    private static final long onWarmupCompleted;

    private MaxAd() {
    }

    static {
        T0 t0 = T0.onWarmupCompleted;
        IAuthTabCallback = ByteOrderedDataOutputStream.onExtraCallback(t0.onNavigationEvent());
        onWarmupCompleted = ByteOrderedDataOutputStream.onExtraCallback(t0.onExtraCallbackWithResult());
        onNavigationEvent = ByteOrderedDataOutputStream.onExtraCallback(t0.onWarmupCompleted());
        onExtraCallbackWithResult = ByteOrderedDataOutputStream.onExtraCallback(t0.IAuthTabCallback());
        IAuthTabCallbackStub = ByteOrderedDataOutputStream.onExtraCallback(t0.onExtraCallback());
        int i = onTransact + 11;
        asBinder = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 89;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        long j = IAuthTabCallback;
        int i4 = i2 + 29;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return j;
    }

    public final long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 107;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        long j = onWarmupCompleted;
        int i5 = i2 + 67;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 45;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        long j = onNavigationEvent;
        int i5 = i2 + 45;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 97 / 0;
        }
        return j;
    }

    public final long onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 67;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        long j = onExtraCallbackWithResult;
        int i4 = i2 + 125;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return j;
    }

    public final long onExtraCallbackWithResult() {
        long j;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 123;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            j = IAuthTabCallbackStub;
            int i4 = 39 / 0;
        } else {
            j = IAuthTabCallbackStub;
        }
        int i5 = i2 + 125;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 55 / 0;
        }
        return j;
    }
}
