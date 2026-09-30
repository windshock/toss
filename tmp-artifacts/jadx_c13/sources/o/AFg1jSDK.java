package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFg1jSDK {
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int asBinder = 0;
    private static int asInterface = 1;
    private static final float onExtraCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(40.0f);
    private static final float onExtraCallbackWithResult = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f);
    private static final float onWarmupCompleted = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f);
    private static final float onNavigationEvent = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f);
    private static final float IAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(28.0f);

    public static final /* synthetic */ float IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 25;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ float onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 25;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        float f = onNavigationEvent;
        int i5 = i2 + 15;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public static final /* synthetic */ float onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 51;
        int i3 = i2 % 128;
        asBinder = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        float f = onExtraCallback;
        int i4 = i3 + 11;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return f;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ float onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asBinder + 97;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        float f = onExtraCallbackWithResult;
        int i5 = i3 + 99;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 9 / 0;
        }
        return f;
    }

    public static final /* synthetic */ float onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asBinder + 115;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        float f = IAuthTabCallback;
        int i5 = i3 + 111;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    static {
        int i = asInterface + 59;
        IAuthTabCallbackStub = i % 128;
        int i2 = i % 2;
    }
}
