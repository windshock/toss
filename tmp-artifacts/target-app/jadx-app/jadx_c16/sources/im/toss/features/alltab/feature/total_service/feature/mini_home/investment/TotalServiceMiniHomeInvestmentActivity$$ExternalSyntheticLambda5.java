package im.toss.features.alltab.feature.total_service.feature.mini_home.investment;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.QuirksExternalSyntheticBackport0;
import o.switchToSearchBar;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TotalServiceMiniHomeInvestmentActivity$$ExternalSyntheticLambda5 implements Function2 {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ TotalServiceMiniHomeInvestmentActivity f$0;
    public final /* synthetic */ switchToSearchBar f$1;
    public final /* synthetic */ QuirksExternalSyntheticBackport0 f$2;
    public final /* synthetic */ int f$3;
    public final /* synthetic */ int f$4;

    public /* synthetic */ TotalServiceMiniHomeInvestmentActivity$$ExternalSyntheticLambda5(TotalServiceMiniHomeInvestmentActivity totalServiceMiniHomeInvestmentActivity, switchToSearchBar switchtosearchbar, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2) {
        this.f$0 = totalServiceMiniHomeInvestmentActivity;
        this.f$1 = switchtosearchbar;
        this.f$2 = quirksExternalSyntheticBackport0;
        this.f$3 = i;
        this.f$4 = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 53;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return TotalServiceMiniHomeInvestmentActivity.onExtraCallbackWithResult(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        }
        Unit unitOnExtraCallbackWithResult = TotalServiceMiniHomeInvestmentActivity.onExtraCallbackWithResult(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i3 = 6 / 0;
        return unitOnExtraCallbackWithResult;
    }
}
