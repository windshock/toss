package im.toss.features.credit.ui.plus.insurance;

import im.toss.features.credit.data.response.membership.CreditPlusFraudInsuranceResponse;
import im.toss.tds.view.compat.component.compound.top.TdsTopV2View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditPlusInsuranceActivity$$ExternalSyntheticLambda2 implements Function1 {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ CreditPlusFraudInsuranceResponse f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 1;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = CreditPlusInsuranceActivity.onExtraCallbackWithResult(this.f$0, (TdsTopV2View) obj);
        int i4 = onExtraCallbackWithResult + 113;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }
}
