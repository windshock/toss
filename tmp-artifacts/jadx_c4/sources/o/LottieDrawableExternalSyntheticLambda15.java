package o;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class LottieDrawableExternalSyntheticLambda15 {
    private static int IAuthTabCallbackDefault = 1;
    private static int asBinder = 1;
    private static int asInterface;
    private static int onTransact;
    public static final LottieDrawableExternalSyntheticLambda15 IAuthTabCallback = new LottieDrawableExternalSyntheticLambda15();
    private static final float onExtraCallbackWithResult = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(80.0f);
    private static final float onExtraCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(60.0f);
    private static final float onNavigationEvent = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(40.0f);
    private static final float onWarmupCompleted = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(64.0f);

    private LottieDrawableExternalSyntheticLambda15() {
    }

    public final float onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 47;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final float onWarmupCompleted() {
        float f;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 95;
        int i3 = i2 % 128;
        asInterface = i3;
        if (i2 % 2 != 0) {
            f = onExtraCallback;
            int i4 = 13 / 0;
        } else {
            f = onExtraCallback;
        }
        int i5 = i3 + 9;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public final float IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 115;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        float f = onNavigationEvent;
        int i5 = i3 + 59;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public final float onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 53;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        float f = onWarmupCompleted;
        if (i3 != 0) {
            int i4 = 85 / 0;
        }
        return f;
    }

    static {
        int i = asBinder + 91;
        onTransact = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }
}
