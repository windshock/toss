package o;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class MaxDebuggerTcfInfoListActivity {
    private static int IAuthTabCallback = 1;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int onNavigationEvent;
    public static final MaxDebuggerTcfInfoListActivity onExtraCallbackWithResult = new MaxDebuggerTcfInfoListActivity();
    private static final float onWarmupCompleted = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(64.0f);
    private static final float onExtraCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(52.0f);

    private MaxDebuggerTcfInfoListActivity() {
    }

    public final float onNavigationEvent() {
        float f;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 53;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        if (i2 % 2 != 0) {
            f = onWarmupCompleted;
            int i4 = 23 / 0;
        } else {
            f = onWarmupCompleted;
        }
        int i5 = i3 + 7;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 27 / 0;
        }
        return f;
    }

    public final float onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 99;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        float f = onExtraCallback;
        int i4 = i2 + 79;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return f;
    }

    static {
        int i = onNavigationEvent + 75;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }
}
