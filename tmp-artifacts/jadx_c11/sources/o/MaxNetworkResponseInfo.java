package o;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class MaxNetworkResponseInfo {
    private static final long IAuthTabCallback;
    private static int IAuthTabCallbackDefault = 1;
    private static int asBinder = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static final long onNavigationEvent;
    public static final MaxNetworkResponseInfo onWarmupCompleted = new MaxNetworkResponseInfo();

    private MaxNetworkResponseInfo() {
    }

    static {
        bExternalSyntheticLambda16 bexternalsyntheticlambda16 = bExternalSyntheticLambda16.onWarmupCompleted;
        onNavigationEvent = ByteOrderedDataOutputStream.onExtraCallback(bexternalsyntheticlambda16.onNavigationEvent());
        IAuthTabCallback = ByteOrderedDataOutputStream.onExtraCallback(bexternalsyntheticlambda16.IAuthTabCallback());
        int i = onExtraCallback + 43;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public final long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 43;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        long j = onNavigationEvent;
        int i5 = i2 + 69;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asBinder + 119;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
