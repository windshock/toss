package im.toss.features.alltab.feature.total_service.feature.mini_home.investment;

import kotlin.Unit;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraPresenceProviderExternalSyntheticLambda6;
import o.DeviceQuirksExternalSyntheticLambda0;
import o.getBacktraceNote;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TotalServiceMiniHomeInvestmentActivity$$ExternalSyntheticLambda1 implements getBacktraceNote {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ CameraPresenceProviderExternalSyntheticLambda6 f$0;
    public final /* synthetic */ TotalServiceMiniHomeInvestmentActivity f$1;

    public /* synthetic */ TotalServiceMiniHomeInvestmentActivity$$ExternalSyntheticLambda1(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, TotalServiceMiniHomeInvestmentActivity totalServiceMiniHomeInvestmentActivity) {
        this.f$0 = cameraPresenceProviderExternalSyntheticLambda6;
        this.f$1 = totalServiceMiniHomeInvestmentActivity;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Unit unitOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 109;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            unitOnExtraCallbackWithResult = TotalServiceMiniHomeInvestmentActivity.onExtraCallbackWithResult(this.f$0, this.f$1, (DeviceQuirksExternalSyntheticLambda0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            int i3 = 58 / 0;
        } else {
            unitOnExtraCallbackWithResult = TotalServiceMiniHomeInvestmentActivity.onExtraCallbackWithResult(this.f$0, this.f$1, (DeviceQuirksExternalSyntheticLambda0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        }
        int i4 = onExtraCallbackWithResult + 77;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 4 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }
}
