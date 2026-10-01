package o;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class loadNativeAd {
    private static final long IAuthTabCallback;
    private static int IAuthTabCallbackDefault = 1;
    private static final long IAuthTabCallbackStub;
    private static int access100 = 1;
    private static final long asBinder;
    private static int asInterface;
    private static int getInterfaceDescriptor;
    private static final long onExtraCallback;
    private static final long onExtraCallbackWithResult;
    public static final loadNativeAd onNavigationEvent = new loadNativeAd();
    private static final long onTransact;
    private static final long onWarmupCompleted;

    private loadNativeAd() {
    }

    static {
        r8lambda3Lim_XwN5uyyQLrClba_GtFumhM r8lambda3lim_xwn5uyyqlrclba_gtfumhm = r8lambda3Lim_XwN5uyyQLrClba_GtFumhM.onNavigationEvent;
        onWarmupCompleted = ByteOrderedDataOutputStream.onExtraCallback(r8lambda3lim_xwn5uyyqlrclba_gtfumhm.onExtraCallbackWithResult());
        onExtraCallbackWithResult = ByteOrderedDataOutputStream.onExtraCallback(r8lambda3lim_xwn5uyyqlrclba_gtfumhm.IAuthTabCallback());
        IAuthTabCallback = ByteOrderedDataOutputStream.onExtraCallback(r8lambda3lim_xwn5uyyqlrclba_gtfumhm.onWarmupCompleted());
        onExtraCallback = ByteOrderedDataOutputStream.onExtraCallback(r8lambda3lim_xwn5uyyqlrclba_gtfumhm.onNavigationEvent());
        asBinder = ByteOrderedDataOutputStream.onExtraCallback(r8lambda3lim_xwn5uyyqlrclba_gtfumhm.onExtraCallback());
        IAuthTabCallbackStub = ByteOrderedDataOutputStream.onExtraCallback(r8lambda3lim_xwn5uyyqlrclba_gtfumhm.IAuthTabCallbackStub());
        onTransact = ByteOrderedDataOutputStream.onExtraCallback(r8lambda3lim_xwn5uyyqlrclba_gtfumhm.asBinder());
        int i = asInterface + 59;
        IAuthTabCallbackDefault = i % 128;
        int i2 = i % 2;
    }

    public final long onExtraCallback() {
        int i = 2 % 2;
        int i2 = access100 + 121;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted;
        }
        int i3 = 34 / 0;
        return onWarmupCompleted;
    }

    public final long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 125;
        int i3 = i2 % 128;
        access100 = i3;
        int i4 = i2 % 2;
        long j = onExtraCallbackWithResult;
        if (i4 == 0) {
            int i5 = 86 / 0;
        }
        int i6 = i3 + 71;
        getInterfaceDescriptor = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 28 / 0;
        }
        return j;
    }

    public final long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = access100 + 115;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback;
        }
        throw null;
    }

    public final long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 9;
        int i3 = i2 % 128;
        access100 = i3;
        int i4 = i2 % 2;
        long j = onExtraCallback;
        int i5 = i3 + 109;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = access100 + 117;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        int i4 = i2 % 2;
        long j = asBinder;
        int i5 = i3 + 123;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 57;
        int i3 = i2 % 128;
        access100 = i3;
        int i4 = i2 % 2;
        long j = IAuthTabCallbackStub;
        int i5 = i3 + 115;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long onTransact() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 97;
        int i3 = i2 % 128;
        access100 = i3;
        int i4 = i2 % 2;
        long j = onTransact;
        int i5 = i3 + 115;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }
}
