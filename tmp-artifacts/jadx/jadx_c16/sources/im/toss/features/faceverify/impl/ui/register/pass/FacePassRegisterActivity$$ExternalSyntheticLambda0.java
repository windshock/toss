package im.toss.features.faceverify.impl.ui.register.pass;

import im.toss.features.loan.comparison.result.view.LoanComparisonResultWarningNoticeView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class FacePassRegisterActivity$$ExternalSyntheticLambda0 implements Function2 {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ FacePassRegisterActivity f$0;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 45;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(((Integer) obj2).intValue())};
        Unit unit = (Unit) FacePassRegisterActivity.onExtraCallback(-1412738348, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), 1412738348, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), objArr, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted());
        int i4 = onNavigationEvent + 33;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }
}
