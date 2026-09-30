package o;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class MaxMediatedNetworkInfo {
    private static final long IAuthTabCallback;
    private static final long IAuthTabCallbackDefault;
    private static int IAuthTabCallbackStub = 0;
    private static int IAuthTabCallbackStubProxy = 1;
    private static int access000 = 1;
    private static int access100;
    private static final long asBinder;
    private static final long asInterface;
    private static final long onExtraCallback;
    private static final long onExtraCallbackWithResult;
    public static final MaxMediatedNetworkInfo onNavigationEvent = new MaxMediatedNetworkInfo();
    private static final long onTransact;
    private static final long onWarmupCompleted;

    private MaxMediatedNetworkInfo() {
    }

    public final long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 107;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        long j = onExtraCallbackWithResult;
        int i5 = i2 + 43;
        access000 = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    static {
        bExternalSyntheticLambda11 bexternalsyntheticlambda11 = bExternalSyntheticLambda11.onExtraCallbackWithResult;
        onExtraCallbackWithResult = ByteOrderedDataOutputStream.onExtraCallback(bexternalsyntheticlambda11.onExtraCallback());
        onExtraCallback = ByteOrderedDataOutputStream.onExtraCallback(bexternalsyntheticlambda11.onExtraCallbackWithResult());
        onWarmupCompleted = ByteOrderedDataOutputStream.onExtraCallback(bexternalsyntheticlambda11.onNavigationEvent());
        IAuthTabCallback = ByteOrderedDataOutputStream.onExtraCallback(bexternalsyntheticlambda11.IAuthTabCallback());
        IAuthTabCallbackDefault = ByteOrderedDataOutputStream.onExtraCallback(bexternalsyntheticlambda11.onWarmupCompleted());
        asInterface = ByteOrderedDataOutputStream.onExtraCallback(bexternalsyntheticlambda11.asInterface());
        asBinder = ByteOrderedDataOutputStream.onExtraCallback(bexternalsyntheticlambda11.IAuthTabCallbackDefault());
        onTransact = ByteOrderedDataOutputStream.onExtraCallback(bexternalsyntheticlambda11.asBinder());
        int i = IAuthTabCallbackStub + 71;
        IAuthTabCallbackStubProxy = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = access000 + 43;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallback;
        }
        throw null;
    }

    public final long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = access000 + 77;
        int i3 = i2 % 128;
        access100 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long j = onWarmupCompleted;
        int i4 = i3 + 15;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return j;
    }

    public final long onExtraCallback() {
        int i = 2 % 2;
        int i2 = access100 + 19;
        int i3 = i2 % 128;
        access000 = i3;
        int i4 = i2 % 2;
        long j = IAuthTabCallback;
        int i5 = i3 + 13;
        access100 = i5 % 128;
        if (i5 % 2 == 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 77;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        long j = IAuthTabCallbackDefault;
        int i5 = i2 + 17;
        access000 = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long asBinder() {
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 59;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        long j = asInterface;
        int i5 = i2 + 49;
        access000 = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = access000 + 95;
        int i3 = i2 % 128;
        access100 = i3;
        int i4 = i2 % 2;
        long j = asBinder;
        int i5 = i3 + 75;
        access000 = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = access000;
        int i3 = i2 + 19;
        access100 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        long j = onTransact;
        int i4 = i2 + 65;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return j;
        }
        throw null;
    }
}
