package o;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class MaxRewardedAdViewAdapter {
    private static final long IAuthTabCallback;
    private static final long IAuthTabCallbackDefault;
    private static final long IAuthTabCallbackStub;
    private static int IAuthTabCallbackStubProxy = 1;
    private static int access000 = 0;
    private static final long asBinder;
    private static int asInterface = 0;
    private static int getInterfaceDescriptor = 1;
    private static final long onExtraCallback;
    private static final long onExtraCallbackWithResult;
    private static final long onNavigationEvent;
    private static final long onTransact;
    public static final MaxRewardedAdViewAdapter onWarmupCompleted = new MaxRewardedAdViewAdapter();

    private MaxRewardedAdViewAdapter() {
    }

    static {
        r8lambda38G_Egj1ONEXinb80ZpHRSE35s r8lambda38g_egj1onexinb80zphrse35s = r8lambda38G_Egj1ONEXinb80ZpHRSE35s.onExtraCallbackWithResult;
        onExtraCallbackWithResult = ByteOrderedDataOutputStream.onExtraCallback(r8lambda38g_egj1onexinb80zphrse35s.onWarmupCompleted());
        onExtraCallback = ByteOrderedDataOutputStream.onExtraCallback(r8lambda38g_egj1onexinb80zphrse35s.IAuthTabCallback());
        onNavigationEvent = ByteOrderedDataOutputStream.onExtraCallback(r8lambda38g_egj1onexinb80zphrse35s.onExtraCallback());
        IAuthTabCallback = ByteOrderedDataOutputStream.onExtraCallback(r8lambda38g_egj1onexinb80zphrse35s.onNavigationEvent());
        asBinder = ByteOrderedDataOutputStream.onExtraCallback(r8lambda38g_egj1onexinb80zphrse35s.onExtraCallbackWithResult());
        IAuthTabCallbackStub = ByteOrderedDataOutputStream.onExtraCallback(r8lambda38g_egj1onexinb80zphrse35s.onTransact());
        IAuthTabCallbackDefault = ByteOrderedDataOutputStream.onExtraCallback(r8lambda38g_egj1onexinb80zphrse35s.IAuthTabCallbackStub());
        onTransact = ByteOrderedDataOutputStream.onExtraCallback(r8lambda38g_egj1onexinb80zphrse35s.asInterface());
        int i = getInterfaceDescriptor + 81;
        asInterface = i % 128;
        int i2 = i % 2;
    }

    public final long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = access000 + 113;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 27;
        int i3 = i2 % 128;
        access000 = i3;
        int i4 = i2 % 2;
        long j = onExtraCallback;
        int i5 = i3 + 9;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 89;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            return onNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 23;
        int i3 = i2 % 128;
        access000 = i3;
        int i4 = i2 % 2;
        long j = IAuthTabCallback;
        int i5 = i3 + 33;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 85;
        int i3 = i2 % 128;
        access000 = i3;
        int i4 = i2 % 2;
        long j = asBinder;
        int i5 = i3 + 55;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long asBinder() {
        int i = 2 % 2;
        int i2 = access000;
        int i3 = i2 + 43;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        long j = IAuthTabCallbackStub;
        int i5 = i2 + 5;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 5;
        int i3 = i2 % 128;
        access000 = i3;
        int i4 = i2 % 2;
        long j = IAuthTabCallbackDefault;
        int i5 = i3 + 69;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 50 / 0;
        }
        return j;
    }

    public final long IAuthTabCallbackDefault() {
        long j;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 101;
        access000 = i3 % 128;
        if (i3 % 2 != 0) {
            j = onTransact;
            int i4 = 39 / 0;
        } else {
            j = onTransact;
        }
        int i5 = i2 + 11;
        access000 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 40 / 0;
        }
        return j;
    }
}
