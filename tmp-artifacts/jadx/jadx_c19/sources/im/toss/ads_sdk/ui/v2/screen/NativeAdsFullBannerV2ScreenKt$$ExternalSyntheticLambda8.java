package im.toss.ads_sdk.ui.v2.screen;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.HighSpeedResolverExternalSyntheticLambda2;
import o.addRearDisplayStatusListener;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class NativeAdsFullBannerV2ScreenKt$$ExternalSyntheticLambda8 implements Function2 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ HighSpeedResolverExternalSyntheticLambda2 f$0;

    public final Object invoke(Object obj, Object obj2) {
        Unit unitOnExtraCallback;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 75;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            unitOnExtraCallback = addRearDisplayStatusListener.onExtraCallback(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
            int i4 = 51 / 0;
        } else {
            unitOnExtraCallback = addRearDisplayStatusListener.onExtraCallback(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        }
        int i5 = onNavigationEvent + 121;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }
}
