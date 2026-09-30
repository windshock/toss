package im.toss.features.alltab.feature.total_service.feature.mini_home.investment;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraPresenceProviderExternalSyntheticLambda6;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TotalServiceMiniHomeInvestmentActivity$$ExternalSyntheticLambda0 implements Function2 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ TotalServiceMiniHomeInvestmentActivity f$0;
    public final /* synthetic */ CameraPresenceProviderExternalSyntheticLambda6 f$1;

    public /* synthetic */ TotalServiceMiniHomeInvestmentActivity$$ExternalSyntheticLambda0(TotalServiceMiniHomeInvestmentActivity totalServiceMiniHomeInvestmentActivity, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6) {
        this.f$0 = totalServiceMiniHomeInvestmentActivity;
        this.f$1 = cameraPresenceProviderExternalSyntheticLambda6;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 1;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        TotalServiceMiniHomeInvestmentActivity totalServiceMiniHomeInvestmentActivity = this.f$0;
        if (i3 != 0) {
            return TotalServiceMiniHomeInvestmentActivity.onExtraCallback(totalServiceMiniHomeInvestmentActivity, this.f$1, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        }
        Unit unitOnExtraCallback = TotalServiceMiniHomeInvestmentActivity.onExtraCallback(totalServiceMiniHomeInvestmentActivity, this.f$1, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i4 = 9 / 0;
        return unitOnExtraCallback;
    }
}
