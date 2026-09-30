package im.toss.features.alltab.feature.total_service.feature.mini_home.investment;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.appAdjusted4ReusedOperator;
import o.setContentInsetsRelative;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TotalServiceMiniHomeInvestmentActivity$$ExternalSyntheticLambda9 implements Function2 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    public final /* synthetic */ TotalServiceMiniHomeInvestmentActivity f$0;
    public final /* synthetic */ appAdjusted4ReusedOperator.onExtraCallback f$1;
    public final /* synthetic */ setContentInsetsRelative f$2;
    public final /* synthetic */ int f$3;
    public final /* synthetic */ int f$4;

    public /* synthetic */ TotalServiceMiniHomeInvestmentActivity$$ExternalSyntheticLambda9(TotalServiceMiniHomeInvestmentActivity totalServiceMiniHomeInvestmentActivity, appAdjusted4ReusedOperator.onExtraCallback onextracallback, setContentInsetsRelative setcontentinsetsrelative, int i, int i2) {
        this.f$0 = totalServiceMiniHomeInvestmentActivity;
        this.f$1 = onextracallback;
        this.f$2 = setcontentinsetsrelative;
        this.f$3 = i;
        this.f$4 = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 61;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return TotalServiceMiniHomeInvestmentActivity.onNavigationEvent(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        }
        Unit unitOnNavigationEvent = TotalServiceMiniHomeInvestmentActivity.onNavigationEvent(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i3 = 50 / 0;
        return unitOnNavigationEvent;
    }
}
