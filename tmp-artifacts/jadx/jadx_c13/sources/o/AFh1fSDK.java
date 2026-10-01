package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFh1fSDK {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;

    public static final long onExtraCallbackWithResult(long j, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 83;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        long jIAuthTabCallback = VirtualCameraCaptureResult.IAuthTabCallback(j, i, i, 0, 0, 12, (Object) null);
        int i5 = onNavigationEvent + 79;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return jIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final long onWarmupCompleted(long j, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 27;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        long jIAuthTabCallback = VirtualCameraCaptureResult.IAuthTabCallback(j, 0, 0, i, i, 3, (Object) null);
        int i5 = onNavigationEvent + 1;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return jIAuthTabCallback;
    }
}
