package o;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class MaxAdExpirationListener {
    public static final MaxAdExpirationListener IAuthTabCallback = new MaxAdExpirationListener();
    private static final long IAuthTabCallbackDefault;
    private static int IAuthTabCallbackStub = 0;
    private static int asBinder = 0;
    private static int asInterface = 1;
    private static final long onExtraCallback;
    private static final long onExtraCallbackWithResult;
    private static final long onNavigationEvent;
    private static int onTransact = 1;
    private static final long onWarmupCompleted;

    private MaxAdExpirationListener() {
    }

    static {
        U0 u0 = U0.onNavigationEvent;
        onExtraCallbackWithResult = ByteOrderedDataOutputStream.onExtraCallback(u0.onExtraCallback());
        onNavigationEvent = ByteOrderedDataOutputStream.onExtraCallback(u0.onWarmupCompleted());
        onExtraCallback = ByteOrderedDataOutputStream.onExtraCallback(u0.onNavigationEvent());
        onWarmupCompleted = ByteOrderedDataOutputStream.onExtraCallback(u0.onExtraCallbackWithResult());
        IAuthTabCallbackDefault = ByteOrderedDataOutputStream.onExtraCallback(u0.IAuthTabCallback());
        int i = IAuthTabCallbackStub + 41;
        asInterface = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public final long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 17;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        long j = onExtraCallbackWithResult;
        int i5 = i2 + 81;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 87;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        long j = onNavigationEvent;
        int i5 = i3 + 29;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long onExtraCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 81;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long onExtraCallbackWithResult() {
        long j;
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 15;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            j = onWarmupCompleted;
            int i4 = 56 / 0;
        } else {
            j = onWarmupCompleted;
        }
        int i5 = i2 + 17;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long onNavigationEvent() {
        long j;
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 3;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            j = IAuthTabCallbackDefault;
            int i4 = 47 / 0;
        } else {
            j = IAuthTabCallbackDefault;
        }
        int i5 = i2 + 95;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
