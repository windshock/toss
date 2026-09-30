package im.toss.features.alltab.feature.total_service.feature.mini_home.investment;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TotalServiceMiniHomeInvestmentActivity$$ExternalSyntheticLambda2 implements Function2 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ TotalServiceMiniHomeInvestmentActivity f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ TotalServiceMiniHomeInvestmentActivity$$ExternalSyntheticLambda2(TotalServiceMiniHomeInvestmentActivity totalServiceMiniHomeInvestmentActivity, int i) {
        this.f$0 = totalServiceMiniHomeInvestmentActivity;
        this.f$1 = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 123;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = TotalServiceMiniHomeInvestmentActivity.onExtraCallbackWithResult(this.f$0, this.f$1, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i4 = IAuthTabCallback + 87;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }
}
