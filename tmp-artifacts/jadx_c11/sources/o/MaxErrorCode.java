package o;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class MaxErrorCode {
    private static final long IAuthTabCallback;
    private static int IAuthTabCallbackDefault = 1;
    private static int asBinder = 0;
    private static int asInterface = 1;
    public static final MaxErrorCode onExtraCallback = new MaxErrorCode();
    private static int onExtraCallbackWithResult;
    private static final long onNavigationEvent;
    private static final long onWarmupCompleted;

    private MaxErrorCode() {
    }

    static {
        bExternalSyntheticLambda3 bexternalsyntheticlambda3 = bExternalSyntheticLambda3.onExtraCallbackWithResult;
        onNavigationEvent = ByteOrderedDataOutputStream.onExtraCallback(bexternalsyntheticlambda3.onExtraCallbackWithResult());
        IAuthTabCallback = ByteOrderedDataOutputStream.onExtraCallback(bexternalsyntheticlambda3.IAuthTabCallback());
        onWarmupCompleted = ByteOrderedDataOutputStream.onExtraCallback(bexternalsyntheticlambda3.onExtraCallback());
        int i = onExtraCallbackWithResult + 55;
        asInterface = i % 128;
        int i2 = i % 2;
    }

    public final long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 59;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long j = onNavigationEvent;
        int i4 = i2 + 33;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return j;
    }

    public final long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asBinder + 105;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback;
        }
        int i3 = 78 / 0;
        return IAuthTabCallback;
    }

    public final long onExtraCallback() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 117;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        long j = onWarmupCompleted;
        int i5 = i2 + 29;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
