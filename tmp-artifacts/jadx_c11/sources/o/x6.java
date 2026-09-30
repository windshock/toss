package o;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class x6 {
    private static int IAuthTabCallbackDefault = 1;
    private static int asBinder = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public static final x6 IAuthTabCallback = new x6();
    private static final float onWarmupCompleted = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f);
    private static final float onExtraCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f);

    private x6() {
    }

    public static /* synthetic */ DeviceQuirksExternalSyntheticLambda0 onExtraCallbackWithResult(x6 x6Var, float f, float f2, float f3, float f4, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault;
        int i4 = i3 + 125;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            int i6 = i3 + 25;
            asBinder = i6 % 128;
            if (i6 % 2 != 0) {
                f = onExtraCallback;
                int i7 = 35 / 0;
            } else {
                f = onExtraCallback;
            }
        }
        if ((i & 2) != 0) {
            f2 = onWarmupCompleted;
        }
        if ((i & 4) != 0) {
            f3 = onExtraCallback;
        }
        if ((i & 8) != 0) {
            f4 = onWarmupCompleted;
            int i8 = asBinder + 59;
            IAuthTabCallbackDefault = i8 % 128;
            int i9 = i8 % 2;
        }
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0OnWarmupCompleted = x6Var.onWarmupCompleted(f, f2, f3, f4);
        int i10 = IAuthTabCallbackDefault + 121;
        asBinder = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 78 / 0;
        }
        return deviceQuirksExternalSyntheticLambda0OnWarmupCompleted;
    }

    public final DeviceQuirksExternalSyntheticLambda0 onWarmupCompleted(float f, float f2, float f3, float f4) {
        int i = 2 % 2;
        int i2 = asBinder + 91;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.IAuthTabCallback(f, f2, f3, f4);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0IAuthTabCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.IAuthTabCallback(f, f2, f3, f4);
        int i3 = asBinder + 75;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return deviceQuirksExternalSyntheticLambda0IAuthTabCallback;
    }

    static {
        int i = onNavigationEvent + 71;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }
}
