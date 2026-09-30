package o;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class u6 {
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int asBinder = 0;
    private static int asInterface = 1;
    private static final float onWarmupCompleted = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(48.0f);
    private static final float onNavigationEvent = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f);
    private static final float onExtraCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(40.0f);
    private static final float onExtraCallbackWithResult = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f);

    public static final /* synthetic */ float IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 47;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult;
        }
        throw null;
    }

    public static final /* synthetic */ float onExtraCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 95;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallback;
        }
        throw null;
    }

    public static final /* synthetic */ float onExtraCallbackWithResult() {
        float f;
        int i = 2 % 2;
        int i2 = asBinder + 117;
        int i3 = i2 % 128;
        asInterface = i3;
        if (i2 % 2 == 0) {
            f = onNavigationEvent;
            int i4 = 13 / 0;
        } else {
            f = onNavigationEvent;
        }
        int i5 = i3 + 13;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            return f;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ float onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asBinder + 49;
        int i3 = i2 % 128;
        asInterface = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        float f = onWarmupCompleted;
        int i4 = i3 + 73;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return f;
        }
        throw null;
    }

    static {
        int i = IAuthTabCallbackDefault + 45;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }
}
