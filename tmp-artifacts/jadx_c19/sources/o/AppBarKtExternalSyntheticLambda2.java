package o;

import android.media.MediaCodecInfo;
import android.os.Build;
import java.util.List;
import o.AppBarKtExternalSyntheticLambda9;
import o.BasicTextContextMenuProviderKtExternalSyntheticLambda4;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class AppBarKtExternalSyntheticLambda2 {
    private static Boolean onExtraCallbackWithResult;

    public static int onWarmupCompleted(MediaCodecInfo.VideoCapabilities videoCapabilities, int i2, int i3, double d) {
        if (Build.VERSION.SDK_INT < 29) {
            return 0;
        }
        Boolean bool = onExtraCallbackWithResult;
        if (bool == null || !bool.booleanValue()) {
            return onExtraCallback.onWarmupCompleted(videoCapabilities, i2, i3, d);
        }
        return 0;
    }

    static final class onExtraCallback {
        public static int onWarmupCompleted(MediaCodecInfo.VideoCapabilities videoCapabilities, int i2, int i3, double d) {
            List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
            if (supportedPerformancePoints == null || supportedPerformancePoints.isEmpty()) {
                return 0;
            }
            AppBarKtExternalSyntheticLambda3.onExtraCallback();
            int iNX_ = nX_(supportedPerformancePoints, AppBarKtExternalSyntheticLambda11.nZ_(i2, i3, (int) d));
            if (iNX_ == 1 && AppBarKtExternalSyntheticLambda2.onExtraCallbackWithResult == null) {
                Boolean unused = AppBarKtExternalSyntheticLambda2.onExtraCallbackWithResult = Boolean.valueOf(onExtraCallbackWithResult());
                if (AppBarKtExternalSyntheticLambda2.onExtraCallbackWithResult.booleanValue()) {
                    return 0;
                }
            }
            return iNX_;
        }

        private static boolean onExtraCallbackWithResult() {
            if (Build.VERSION.SDK_INT >= 35) {
                return false;
            }
            int iOnExtraCallback = onExtraCallback(false);
            int iOnExtraCallback2 = onExtraCallback(true);
            if (iOnExtraCallback == 0) {
                return true;
            }
            return iOnExtraCallback2 == 0 ? iOnExtraCallback != 2 : (iOnExtraCallback == 2 && iOnExtraCallback2 == 2) ? false : true;
        }

        private static int onExtraCallback(boolean z) {
            MediaCodecInfo.VideoCapabilities videoCapabilities;
            List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints;
            try {
                BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent = new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult().IAuthTabCallbackDefault("video/avc").onNavigationEvent();
                if (basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent.isEngagementSignalsApiAvailable != null) {
                    List<AppBarKtExternalSyntheticLambda5> listOnExtraCallbackWithResult = AppBarKtExternalSyntheticLambda9.onExtraCallbackWithResult(AppBarKtExternalSyntheticLambda6.onExtraCallback, basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent, z, false);
                    for (int i2 = 0; i2 < listOnExtraCallbackWithResult.size(); i2++) {
                        if (listOnExtraCallbackWithResult.get(i2).onNavigationEvent != null && (videoCapabilities = listOnExtraCallbackWithResult.get(i2).onNavigationEvent.getVideoCapabilities()) != null && (supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                            AppBarKtExternalSyntheticLambda3.onExtraCallback();
                            return nX_(supportedPerformancePoints, AppBarKtExternalSyntheticLambda11.nZ_(1280, 720, 60));
                        }
                    }
                }
            } catch (AppBarKtExternalSyntheticLambda9.onExtraCallback unused) {
            }
            return 0;
        }

        private static int nX_(List<MediaCodecInfo.VideoCapabilities.PerformancePoint> list, MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                if (AppBarKtExternalSyntheticLambda4.nY_(list.get(i2)).covers(performancePoint)) {
                    return 2;
                }
            }
            return 1;
        }
    }
}
