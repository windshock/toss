package o;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class MaxErrorCodes {
    private static final long IAuthTabCallback;
    private static final long IAuthTabCallbackDefault;
    private static final long IAuthTabCallbackStub;
    private static int IAuthTabCallback_Parcel = 0;
    private static int access000 = 1;
    private static final long asBinder;
    private static int asInterface = 0;
    private static int getInterfaceDescriptor = 1;
    public static final MaxErrorCodes onExtraCallback = new MaxErrorCodes();
    private static final long onExtraCallbackWithResult;
    private static final long onNavigationEvent;
    private static final long onTransact;
    private static final long onWarmupCompleted;

    private MaxErrorCodes() {
    }

    public final long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel;
        int i3 = i2 + 41;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        long j = onWarmupCompleted;
        int i5 = i2 + 69;
        access000 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 39 / 0;
        }
        return j;
    }

    static {
        bExternalSyntheticLambda15 bexternalsyntheticlambda15 = bExternalSyntheticLambda15.onExtraCallbackWithResult;
        onWarmupCompleted = ByteOrderedDataOutputStream.onExtraCallback(bexternalsyntheticlambda15.onWarmupCompleted());
        onExtraCallbackWithResult = ByteOrderedDataOutputStream.onExtraCallback(bexternalsyntheticlambda15.onExtraCallback());
        onNavigationEvent = ByteOrderedDataOutputStream.onExtraCallback(bexternalsyntheticlambda15.onNavigationEvent());
        IAuthTabCallback = ByteOrderedDataOutputStream.onExtraCallback(bexternalsyntheticlambda15.IAuthTabCallback());
        IAuthTabCallbackDefault = ByteOrderedDataOutputStream.onExtraCallback(bexternalsyntheticlambda15.onExtraCallbackWithResult());
        onTransact = ByteOrderedDataOutputStream.onExtraCallback(bexternalsyntheticlambda15.IAuthTabCallbackStub());
        asBinder = ByteOrderedDataOutputStream.onExtraCallback(bexternalsyntheticlambda15.asBinder());
        IAuthTabCallbackStub = ByteOrderedDataOutputStream.onExtraCallback(bexternalsyntheticlambda15.IAuthTabCallbackDefault());
        int i = getInterfaceDescriptor + 69;
        asInterface = i % 128;
        int i2 = i % 2;
    }

    public final long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel;
        int i3 = i2 + 43;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        long j = onExtraCallbackWithResult;
        int i5 = i2 + 39;
        access000 = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        throw null;
    }

    public final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel;
        int i3 = i2 + 69;
        access000 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long j = onNavigationEvent;
        int i4 = i2 + 67;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return j;
    }

    public final long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 97;
        int i3 = i2 % 128;
        access000 = i3;
        int i4 = i2 % 2;
        long j = IAuthTabCallback;
        int i5 = i3 + 1;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long onExtraCallback() {
        int i = 2 % 2;
        int i2 = access000 + 7;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        long j = IAuthTabCallbackDefault;
        int i4 = i3 + 1;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return j;
    }

    public final long onTransact() {
        long j;
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel;
        int i3 = i2 + 19;
        access000 = i3 % 128;
        if (i3 % 2 == 0) {
            j = onTransact;
            int i4 = 14 / 0;
        } else {
            j = onTransact;
        }
        int i5 = i2 + 69;
        access000 = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        throw null;
    }

    public final long asBinder() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel;
        int i3 = i2 + 79;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        long j = asBinder;
        int i5 = i2 + 27;
        access000 = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 113;
        int i3 = i2 % 128;
        access000 = i3;
        int i4 = i2 % 2;
        long j = IAuthTabCallbackStub;
        int i5 = i3 + 71;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 58 / 0;
        }
        return j;
    }
}
