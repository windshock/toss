package o;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class MaxInterstitialAdapter {
    private static final long IAuthTabCallback;
    private static final long IAuthTabCallbackDefault;
    private static int IAuthTabCallbackStub = 0;
    private static int IAuthTabCallback_Parcel = 0;
    private static int access000 = 1;
    private static int access100 = 1;
    private static final long asBinder;
    private static final long asInterface;
    public static final MaxInterstitialAdapter onExtraCallback = new MaxInterstitialAdapter();
    private static final long onExtraCallbackWithResult;
    private static final long onNavigationEvent;
    private static final long onTransact;
    private static final long onWarmupCompleted;

    private MaxInterstitialAdapter() {
    }

    static {
        ic icVar = ic.onNavigationEvent;
        onWarmupCompleted = ByteOrderedDataOutputStream.onExtraCallback(icVar.onNavigationEvent());
        IAuthTabCallback = ByteOrderedDataOutputStream.onExtraCallback(icVar.onExtraCallback());
        onNavigationEvent = ByteOrderedDataOutputStream.onExtraCallback(icVar.onExtraCallbackWithResult());
        onExtraCallbackWithResult = ByteOrderedDataOutputStream.onExtraCallback(icVar.onWarmupCompleted());
        asInterface = ByteOrderedDataOutputStream.onExtraCallback(icVar.IAuthTabCallback());
        IAuthTabCallbackDefault = ByteOrderedDataOutputStream.onExtraCallback(icVar.asBinder());
        asBinder = ByteOrderedDataOutputStream.onExtraCallback(icVar.IAuthTabCallbackStub());
        onTransact = ByteOrderedDataOutputStream.onExtraCallback(icVar.onTransact());
        int i = access000 + 73;
        IAuthTabCallbackStub = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 35;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 59;
        int i3 = i2 % 128;
        access100 = i3;
        int i4 = i2 % 2;
        long j = IAuthTabCallback;
        int i5 = i3 + 101;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 9;
        IAuthTabCallback_Parcel = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        long j = onNavigationEvent;
        int i4 = i2 + 101;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return j;
        }
        obj.hashCode();
        throw null;
    }

    public final long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 99;
        int i3 = i2 % 128;
        access100 = i3;
        int i4 = i2 % 2;
        long j = onExtraCallbackWithResult;
        int i5 = i3 + 17;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 41;
        int i3 = i2 % 128;
        access100 = i3;
        int i4 = i2 % 2;
        long j = asInterface;
        int i5 = i3 + 39;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 101;
        int i3 = i2 % 128;
        access100 = i3;
        int i4 = i2 % 2;
        long j = IAuthTabCallbackDefault;
        if (i4 == 0) {
            int i5 = 96 / 0;
        }
        int i6 = i3 + 33;
        IAuthTabCallback_Parcel = i6 % 128;
        if (i6 % 2 == 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long asBinder() {
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 99;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        long j = asBinder;
        int i5 = i2 + 91;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long asInterface() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel;
        int i3 = i2 + 119;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        long j = onTransact;
        int i5 = i2 + 7;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }
}
