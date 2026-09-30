package o;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class MaxSegmentCollectionBuilder {
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 0;
    private static final long onExtraCallback;
    private static int onExtraCallbackWithResult = 1;
    public static final MaxSegmentCollectionBuilder onNavigationEvent = new MaxSegmentCollectionBuilder();
    private static final long onWarmupCompleted;

    private MaxSegmentCollectionBuilder() {
    }

    static {
        bExternalSyntheticLambda6 bexternalsyntheticlambda6 = bExternalSyntheticLambda6.onWarmupCompleted;
        onWarmupCompleted = ByteOrderedDataOutputStream.onExtraCallback(bexternalsyntheticlambda6.onExtraCallbackWithResult());
        onExtraCallback = ByteOrderedDataOutputStream.onExtraCallback(bexternalsyntheticlambda6.onExtraCallback());
        int i = IAuthTabCallback + 111;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    public final long onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 103;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        long j = onWarmupCompleted;
        int i5 = i3 + 101;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 109;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
