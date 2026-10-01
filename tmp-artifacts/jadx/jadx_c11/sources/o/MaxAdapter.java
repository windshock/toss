package o;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class MaxAdapter {
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int onWarmupCompleted = 1;
    public static final MaxAdapter onExtraCallbackWithResult = new MaxAdapter();
    private static final float onNavigationEvent = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(40.0f);
    private static final float onExtraCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(32.0f);

    private MaxAdapter() {
    }

    public final float onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 29;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent;
        }
        throw null;
    }

    public final float onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 103;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        float f = onExtraCallback;
        int i5 = i2 + 31;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 87 / 0;
        }
        return f;
    }

    static {
        int i = IAuthTabCallback + 97;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }
}
