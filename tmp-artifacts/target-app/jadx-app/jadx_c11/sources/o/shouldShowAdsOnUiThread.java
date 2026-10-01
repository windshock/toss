package o;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class shouldShowAdsOnUiThread {
    private static final long IAuthTabCallback;
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder;
    private static int asInterface;
    private static final long onExtraCallback;
    private static final long onExtraCallbackWithResult;
    public static final shouldShowAdsOnUiThread onNavigationEvent = new shouldShowAdsOnUiThread();
    private static final long onWarmupCompleted;

    private shouldShowAdsOnUiThread() {
    }

    public final long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 111;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        r8lambdahxomZOfFyJytJDQEAYvp7ottLo r8lambdahxomzoffyjytjdqeayvp7ottlo = r8lambdahxomZOfFyJytJDQEAYvp7ottLo.onExtraCallbackWithResult;
        IAuthTabCallback = ByteOrderedDataOutputStream.onExtraCallback(r8lambdahxomzoffyjytjdqeayvp7ottlo.IAuthTabCallback());
        onExtraCallbackWithResult = ByteOrderedDataOutputStream.onExtraCallback(r8lambdahxomzoffyjytjdqeayvp7ottlo.onNavigationEvent());
        onExtraCallback = ByteOrderedDataOutputStream.onExtraCallback(r8lambdahxomzoffyjytjdqeayvp7ottlo.onExtraCallbackWithResult());
        onWarmupCompleted = ByteOrderedDataOutputStream.onExtraCallback(r8lambdahxomzoffyjytjdqeayvp7ottlo.onWarmupCompleted());
        int i = IAuthTabCallbackStub + 115;
        asInterface = i % 128;
        int i2 = i % 2;
    }

    public final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 57;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        long j = onExtraCallbackWithResult;
        int i5 = i3 + 31;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 39;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        long j = onExtraCallback;
        int i5 = i3 + 41;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 87;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
