package o;

import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFi1kSDK {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    public static final boolean onNavigationEvent(boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + Imgproc.COLOR_YUV2RGBA_YVYU;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        boolean z2 = !z;
        int i5 = i2 + 21;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return z2;
    }
}
