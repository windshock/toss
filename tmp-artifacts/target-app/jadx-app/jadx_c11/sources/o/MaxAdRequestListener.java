package o;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class MaxAdRequestListener {
    private static int asBinder = 1;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    public static final MaxAdRequestListener IAuthTabCallback = new MaxAdRequestListener();
    private static final float onExtraCallbackWithResult = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f);

    private MaxAdRequestListener() {
    }

    public final float onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asBinder + 103;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = onWarmupCompleted + 113;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
