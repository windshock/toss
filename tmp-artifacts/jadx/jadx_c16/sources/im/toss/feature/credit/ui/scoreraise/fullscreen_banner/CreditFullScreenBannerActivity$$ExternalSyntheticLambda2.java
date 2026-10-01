package im.toss.feature.credit.ui.scoreraise.fullscreen_banner;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraPresenceProviderExternalSyntheticLambda6;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditFullScreenBannerActivity$$ExternalSyntheticLambda2 implements Function2 {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ CameraPresenceProviderExternalSyntheticLambda6 f$0;
    public final /* synthetic */ CreditFullScreenBannerActivity f$1;

    public /* synthetic */ CreditFullScreenBannerActivity$$ExternalSyntheticLambda2(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, CreditFullScreenBannerActivity creditFullScreenBannerActivity) {
        this.f$0 = cameraPresenceProviderExternalSyntheticLambda6;
        this.f$1 = creditFullScreenBannerActivity;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 77;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            CreditFullScreenBannerActivity.IAuthTabCallback(this.f$0, this.f$1, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
            throw null;
        }
        Unit unitIAuthTabCallback = CreditFullScreenBannerActivity.IAuthTabCallback(this.f$0, this.f$1, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i3 = onExtraCallbackWithResult + 19;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitIAuthTabCallback;
    }
}
