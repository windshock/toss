package o;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class MaxRewardedAdListener {
    private static int IAuthTabCallbackDefault = 0;
    private static int asInterface = 1;
    private static int onExtraCallback = 0;
    private static int onTransact = 1;
    public static final MaxRewardedAdListener IAuthTabCallback = new MaxRewardedAdListener();
    private static final float onNavigationEvent = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f);
    private static final float onWarmupCompleted = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(5.0f);
    private static final float onExtraCallbackWithResult = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(2.0f);

    private MaxRewardedAdListener() {
    }

    public final float onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 45;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        float f = onNavigationEvent;
        int i4 = i2 + 93;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 11 / 0;
        }
        return f;
    }

    public final float onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asInterface + 35;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final float IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 49;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        float f = onExtraCallbackWithResult;
        int i4 = i2 + 99;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 41 / 0;
        }
        return f;
    }

    static {
        int i = onExtraCallback + 115;
        onTransact = i % 128;
        int i2 = i % 2;
    }
}
