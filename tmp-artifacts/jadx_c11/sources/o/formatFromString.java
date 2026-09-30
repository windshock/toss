package o;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class formatFromString {
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int asBinder = 0;
    private static int onTransact = 1;
    public static final formatFromString onExtraCallbackWithResult = new formatFromString();
    private static final float IAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(29.0f);
    private static final float onWarmupCompleted = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(26.0f);
    private static final float onExtraCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f);
    private static final float onNavigationEvent = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(21.0f);

    private formatFromString() {
    }

    public final float onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 69;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        float f = IAuthTabCallback;
        int i5 = i2 + 71;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 63 / 0;
        }
        return f;
    }

    public final float onExtraCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 21;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        float f = onWarmupCompleted;
        int i5 = i3 + 65;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 66 / 0;
        }
        return f;
    }

    public final float IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 121;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        float f = onExtraCallback;
        int i5 = i3 + 95;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return f;
        }
        throw null;
    }

    public final float onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onTransact + 39;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        float f = onNavigationEvent;
        int i5 = i3 + 113;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    static {
        int i = asBinder + 53;
        IAuthTabCallbackDefault = i % 128;
        int i2 = i % 2;
    }
}
