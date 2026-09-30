package im.toss.features.home.feature.cashflow;

import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CashflowAddCategoryActivity$$ExternalSyntheticLambda1 implements Function2 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ CashflowAddCategoryActivity f$0;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 7;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        CashflowAddCategoryActivity cashflowAddCategoryActivity = this.f$0;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj;
        if (i3 == 0) {
            return CashflowAddCategoryActivity.onExtraCallback(cashflowAddCategoryActivity, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj2).intValue());
        }
        CashflowAddCategoryActivity.onExtraCallback(cashflowAddCategoryActivity, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj2).intValue());
        throw null;
    }
}
