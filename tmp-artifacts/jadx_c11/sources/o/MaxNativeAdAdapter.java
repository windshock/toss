package o;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class MaxNativeAdAdapter {
    private static final long IAuthTabCallback;
    private static final long IAuthTabCallbackDefault;
    private static int IAuthTabCallbackStub = 1;
    private static int IAuthTabCallback_Parcel = 1;
    private static int access100;
    private static final long asBinder;
    private static final long asInterface;
    private static final long onExtraCallback;
    private static final long onExtraCallbackWithResult;
    private static final long onNavigationEvent;
    private static int onTransact;
    public static final MaxNativeAdAdapter onWarmupCompleted = new MaxNativeAdAdapter();

    private MaxNativeAdAdapter() {
    }

    static {
        r8lambdatXcGktdjFag3O13Si37o7n7vFHg r8lambdatxcgktdjfag3o13si37o7n7vfhg = r8lambdatXcGktdjFag3O13Si37o7n7vFHg.onWarmupCompleted;
        IAuthTabCallback = ByteOrderedDataOutputStream.onExtraCallback(r8lambdatxcgktdjfag3o13si37o7n7vfhg.onExtraCallbackWithResult());
        onExtraCallbackWithResult = ByteOrderedDataOutputStream.onExtraCallback(r8lambdatxcgktdjfag3o13si37o7n7vfhg.onNavigationEvent());
        onNavigationEvent = ByteOrderedDataOutputStream.onExtraCallback(r8lambdatxcgktdjfag3o13si37o7n7vfhg.IAuthTabCallback());
        onExtraCallback = ByteOrderedDataOutputStream.onExtraCallback(r8lambdatxcgktdjfag3o13si37o7n7vfhg.onWarmupCompleted());
        IAuthTabCallbackDefault = ByteOrderedDataOutputStream.onExtraCallback(r8lambdatxcgktdjfag3o13si37o7n7vfhg.onExtraCallback());
        asBinder = ByteOrderedDataOutputStream.onExtraCallback(r8lambdatxcgktdjfag3o13si37o7n7vfhg.IAuthTabCallbackDefault());
        asInterface = ByteOrderedDataOutputStream.onExtraCallback(r8lambdatxcgktdjfag3o13si37o7n7vfhg.asBinder());
        int i = onTransact + 11;
        IAuthTabCallbackStub = i % 128;
        if (i % 2 == 0) {
            int i2 = 88 / 0;
        }
    }

    public final long onExtraCallbackWithResult() {
        long j;
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel;
        int i3 = i2 + 79;
        access100 = i3 % 128;
        if (i3 % 2 != 0) {
            j = IAuthTabCallback;
            int i4 = 19 / 0;
        } else {
            j = IAuthTabCallback;
        }
        int i5 = i2 + 59;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = access100 + 103;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        int i4 = i2 % 2;
        long j = onExtraCallbackWithResult;
        int i5 = i3 + 105;
        access100 = i5 % 128;
        if (i5 % 2 == 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 93;
        int i3 = i2 % 128;
        access100 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        long j = onNavigationEvent;
        int i4 = i3 + 37;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return j;
        }
        obj.hashCode();
        throw null;
    }

    public final long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = access100 + 113;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        int i4 = i2 % 2;
        long j = onExtraCallback;
        int i5 = i3 + 53;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 69;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallbackDefault;
        }
        throw null;
    }

    public final long IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 13;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        long j = asBinder;
        int i5 = i2 + 59;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 45;
        int i3 = i2 % 128;
        access100 = i3;
        int i4 = i2 % 2;
        long j = asInterface;
        int i5 = i3 + 83;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        throw null;
    }
}
