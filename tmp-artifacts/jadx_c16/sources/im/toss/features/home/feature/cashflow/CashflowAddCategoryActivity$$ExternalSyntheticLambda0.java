package im.toss.features.home.feature.cashflow;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CashflowAddCategoryActivity$$ExternalSyntheticLambda0 implements Function2 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public final /* synthetic */ CashflowAddCategoryActivity f$0;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 113;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = CashflowAddCategoryActivity.onNavigationEvent(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i4 = IAuthTabCallback + 125;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 10 / 0;
        }
        return unitOnNavigationEvent;
    }
}
