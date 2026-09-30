package o;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class loadAdViewAd {
    private static final long IAuthTabCallback;
    private static int IAuthTabCallbackDefault = 1;
    private static final long IAuthTabCallbackStub;
    private static int IAuthTabCallback_Parcel = 0;
    private static int access100 = 1;
    private static int asBinder;
    private static final long asInterface;
    private static final long onExtraCallback;
    private static final long onExtraCallbackWithResult;
    public static final loadAdViewAd onNavigationEvent = new loadAdViewAd();
    private static final long onTransact;
    private static final long onWarmupCompleted;

    private loadAdViewAd() {
    }

    static {
        r8lambdap9dDQbPLEvLEadDCXWAxWfiQgwA r8lambdap9ddqbplevleaddcxwaxwfiqgwa = r8lambdap9dDQbPLEvLEadDCXWAxWfiQgwA.onWarmupCompleted;
        onExtraCallbackWithResult = ByteOrderedDataOutputStream.onExtraCallback(r8lambdap9ddqbplevleaddcxwaxwfiqgwa.onExtraCallback());
        IAuthTabCallback = ByteOrderedDataOutputStream.onExtraCallback(r8lambdap9ddqbplevleaddcxwaxwfiqgwa.onNavigationEvent());
        onExtraCallback = ByteOrderedDataOutputStream.onExtraCallback(r8lambdap9ddqbplevleaddcxwaxwfiqgwa.onWarmupCompleted());
        onWarmupCompleted = ByteOrderedDataOutputStream.onExtraCallback(r8lambdap9ddqbplevleaddcxwaxwfiqgwa.onExtraCallbackWithResult());
        asInterface = ByteOrderedDataOutputStream.onExtraCallback(r8lambdap9ddqbplevleaddcxwaxwfiqgwa.IAuthTabCallback());
        onTransact = ByteOrderedDataOutputStream.onExtraCallback(r8lambdap9ddqbplevleaddcxwaxwfiqgwa.asBinder());
        IAuthTabCallbackStub = ByteOrderedDataOutputStream.onExtraCallback(r8lambdap9ddqbplevleaddcxwaxwfiqgwa.IAuthTabCallbackStub());
        int i = IAuthTabCallbackDefault + 95;
        asBinder = i % 128;
        if (i % 2 != 0) {
            int i2 = 79 / 0;
        }
    }

    public final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 87;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        long j = onExtraCallbackWithResult;
        int i4 = i2 + 57;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return j;
    }

    public final long onWarmupCompleted() {
        long j;
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel;
        int i3 = i2 + 117;
        access100 = i3 % 128;
        if (i3 % 2 == 0) {
            j = IAuthTabCallback;
            int i4 = 93 / 0;
        } else {
            j = IAuthTabCallback;
        }
        int i5 = i2 + 87;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 39;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallback;
        }
        throw null;
    }

    public final long onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 63;
        int i3 = i2 % 128;
        access100 = i3;
        int i4 = i2 % 2;
        long j = onWarmupCompleted;
        int i5 = i3 + 111;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 95 / 0;
        }
        return j;
    }

    public final long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = access100 + 9;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            return asInterface;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long asBinder() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 107;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            return onTransact;
        }
        int i3 = 34 / 0;
        return onTransact;
    }

    public final long asInterface() {
        int i = 2 % 2;
        int i2 = access100 + 21;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallbackStub;
        }
        int i3 = 34 / 0;
        return IAuthTabCallbackStub;
    }
}
