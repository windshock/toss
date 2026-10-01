package o;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class MaxDebuggerAdUnitDetailActivity {
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int asInterface = 1;
    private static int onTransact;
    public static final MaxDebuggerAdUnitDetailActivity onExtraCallback = new MaxDebuggerAdUnitDetailActivity();
    private static final float onExtraCallbackWithResult = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(80.0f);
    private static final float IAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(64.0f);
    private static final float onNavigationEvent = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(52.0f);
    private static final float onWarmupCompleted = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(96.0f);

    private MaxDebuggerAdUnitDetailActivity() {
    }

    public final float onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 17;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        float f = onExtraCallbackWithResult;
        int i5 = i2 + 27;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public final float onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 91;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        float f = IAuthTabCallback;
        int i4 = i2 + 61;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return f;
    }

    public final float IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 95;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        float f = onNavigationEvent;
        if (i3 == 0) {
            int i4 = 34 / 0;
        }
        return f;
    }

    public final float onExtraCallback() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 79;
        IAuthTabCallbackDefault = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        float f = onWarmupCompleted;
        int i4 = i2 + 99;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return f;
        }
        obj.hashCode();
        throw null;
    }

    static {
        int i = asInterface + 103;
        IAuthTabCallbackStub = i % 128;
        int i2 = i % 2;
    }
}
