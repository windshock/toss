package o;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class fromCode {
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackStub = 0;
    private static final long onExtraCallback;
    private static final long onExtraCallbackWithResult;
    public static final fromCode onNavigationEvent = new fromCode();
    private static int onTransact = 1;
    private static int onWarmupCompleted = 1;

    private fromCode() {
    }

    static {
        bExternalSyntheticLambda17 bexternalsyntheticlambda17 = bExternalSyntheticLambda17.onNavigationEvent;
        onExtraCallback = ByteOrderedDataOutputStream.onExtraCallback(bexternalsyntheticlambda17.onExtraCallback());
        onExtraCallbackWithResult = ByteOrderedDataOutputStream.onExtraCallback(bexternalsyntheticlambda17.onNavigationEvent());
        int i = IAuthTabCallback + 83;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            int i2 = 16 / 0;
        }
    }

    public final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 65;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        long j = onExtraCallback;
        if (i4 == 0) {
            int i5 = 75 / 0;
        }
        int i6 = i3 + 61;
        IAuthTabCallbackStub = i6 % 128;
        if (i6 % 2 == 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 65;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        long j = onExtraCallbackWithResult;
        int i5 = i2 + 35;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }
}
