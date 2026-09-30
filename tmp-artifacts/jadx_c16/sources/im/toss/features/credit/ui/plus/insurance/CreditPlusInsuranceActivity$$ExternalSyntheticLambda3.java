package im.toss.features.credit.ui.plus.insurance;

import im.toss.features.credit.data.response.membership.CreditPlusFraudInsuranceResponse;
import im.toss.features.payment.ui.offline.compose.screen.FullPage2DCodeScreenKt$;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditPlusInsuranceActivity$$ExternalSyntheticLambda3 implements Function2 {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ CreditPlusFraudInsuranceResponse f$0;
    public final /* synthetic */ CreditPlusInsuranceActivity f$1;

    public /* synthetic */ CreditPlusInsuranceActivity$$ExternalSyntheticLambda3(CreditPlusFraudInsuranceResponse creditPlusFraudInsuranceResponse, CreditPlusInsuranceActivity creditPlusInsuranceActivity) {
        this.f$0 = creditPlusFraudInsuranceResponse;
        this.f$1 = creditPlusInsuranceActivity;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 53;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Object[] objArr = {this.f$0, this.f$1, (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(((Integer) obj2).intValue())};
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }
        Object[] objArr2 = {this.f$0, this.f$1, (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(((Integer) obj2).intValue())};
        Unit unit = (Unit) CreditPlusInsuranceActivity.IAuthTabCallback(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), 1320730183, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), -1320730181, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), objArr2);
        int i3 = onWarmupCompleted + 105;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 7 / 0;
        }
        return unit;
    }
}
