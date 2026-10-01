package o;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class MaxAppOpenAdapter {
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder = 0;
    private static int asInterface = 1;
    private static int onTransact;
    public static final MaxAppOpenAdapter onExtraCallbackWithResult = new MaxAppOpenAdapter();
    private static final float IAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(58.0f);
    private static final float onWarmupCompleted = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(48.0f);
    private static final float onExtraCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(64.0f);
    private static final float onNavigationEvent = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(64.0f);

    private MaxAppOpenAdapter() {
    }

    public final float IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 71;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        float f = IAuthTabCallback;
        int i4 = i2 + 73;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return f;
    }

    public final float onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 51;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted;
        }
        throw null;
    }

    public final float onExtraCallbackWithResult() {
        float f;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 13;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            f = onExtraCallback;
            int i4 = 35 / 0;
        } else {
            f = onExtraCallback;
        }
        int i5 = i2 + 69;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public final float onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 103;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return onNavigationEvent;
        }
        throw null;
    }

    static {
        int i = onTransact + 57;
        asInterface = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }
}
