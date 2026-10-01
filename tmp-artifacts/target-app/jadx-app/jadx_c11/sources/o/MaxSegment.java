package o;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class MaxSegment {
    private static int IAuthTabCallback = 1;
    private static int IAuthTabCallbackDefault = 0;
    private static int asInterface = 1;
    private static int onExtraCallback;
    public static final MaxSegment onExtraCallbackWithResult = new MaxSegment();
    private static final long onNavigationEvent;
    private static final long onWarmupCompleted;

    private MaxSegment() {
    }

    static {
        bExternalSyntheticLambda4 bexternalsyntheticlambda4 = bExternalSyntheticLambda4.onWarmupCompleted;
        onNavigationEvent = ByteOrderedDataOutputStream.onExtraCallback(bexternalsyntheticlambda4.onWarmupCompleted());
        onWarmupCompleted = ByteOrderedDataOutputStream.onExtraCallback(bexternalsyntheticlambda4.onExtraCallbackWithResult());
        int i = IAuthTabCallback + 85;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public final long onExtraCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 53;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        long j = onNavigationEvent;
        int i5 = i3 + 113;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        throw null;
    }

    public final long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 41;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        long j = onWarmupCompleted;
        int i5 = i3 + 5;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }
}
