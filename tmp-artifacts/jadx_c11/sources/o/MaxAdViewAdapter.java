package o;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class MaxAdViewAdapter {
    public static final MaxAdViewAdapter IAuthTabCallback = new MaxAdViewAdapter();
    private static final long IAuthTabCallbackDefault;
    private static int IAuthTabCallbackStub = 1;
    private static int IAuthTabCallback_Parcel = 0;
    private static int asBinder = 0;
    private static final long asInterface;
    private static int getInterfaceDescriptor = 1;
    private static final long onExtraCallback;
    private static final long onExtraCallbackWithResult;
    private static final long onNavigationEvent;
    private static final long onTransact;
    private static final long onWarmupCompleted;

    private MaxAdViewAdapter() {
    }

    static {
        r8lambda7HbMK3lfaMeQjoXRTDOWhH6UOeo r8lambda7hbmk3lfameqjoxrtdowhh6uoeo = r8lambda7HbMK3lfaMeQjoXRTDOWhH6UOeo.onWarmupCompleted;
        onWarmupCompleted = ByteOrderedDataOutputStream.onExtraCallback(r8lambda7hbmk3lfameqjoxrtdowhh6uoeo.onWarmupCompleted());
        onExtraCallbackWithResult = ByteOrderedDataOutputStream.onExtraCallback(r8lambda7hbmk3lfameqjoxrtdowhh6uoeo.onExtraCallback());
        onNavigationEvent = ByteOrderedDataOutputStream.onExtraCallback(r8lambda7hbmk3lfameqjoxrtdowhh6uoeo.onExtraCallbackWithResult());
        onExtraCallback = ByteOrderedDataOutputStream.onExtraCallback(r8lambda7hbmk3lfameqjoxrtdowhh6uoeo.onNavigationEvent());
        asInterface = ByteOrderedDataOutputStream.onExtraCallback(r8lambda7hbmk3lfameqjoxrtdowhh6uoeo.IAuthTabCallback());
        IAuthTabCallbackDefault = ByteOrderedDataOutputStream.onExtraCallback(r8lambda7hbmk3lfameqjoxrtdowhh6uoeo.asInterface());
        onTransact = ByteOrderedDataOutputStream.onExtraCallback(r8lambda7hbmk3lfameqjoxrtdowhh6uoeo.onTransact());
        int i = IAuthTabCallbackStub + 9;
        asBinder = i % 128;
        int i2 = i % 2;
    }

    public final long onExtraCallback() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 45;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        long j = onWarmupCompleted;
        int i5 = i2 + 79;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel;
        int i3 = i2 + 83;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        long j = onExtraCallbackWithResult;
        int i5 = i2 + 17;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 43;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        int i4 = i2 % 2;
        long j = onNavigationEvent;
        int i5 = i3 + 75;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 73;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallback;
        }
        int i3 = 34 / 0;
        return onExtraCallback;
    }

    public final long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel;
        int i3 = i2 + 57;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long j = asInterface;
        int i4 = i2 + 3;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return j;
    }

    public final long IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel;
        int i3 = i2 + 125;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        long j = IAuthTabCallbackDefault;
        int i5 = i2 + 83;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        throw null;
    }

    public final long IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 83;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        int i4 = i2 % 2;
        long j = onTransact;
        int i5 = i3 + 117;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
