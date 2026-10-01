package im.toss.tosssecurities.webview.composable;

import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class WarmUpWebViewModel_HiltModules {

    public static final class KeyModule {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;

        public static boolean onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + Imgproc.COLOR_YUV2RGB_YVYU;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 77;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                return true;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
