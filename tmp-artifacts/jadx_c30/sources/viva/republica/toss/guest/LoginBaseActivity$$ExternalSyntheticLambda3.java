package viva.republica.toss.guest;

import im.toss.features.loan.refinancing.funnel.common.LoanRefinancingFunnelAdapter$;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class LoginBaseActivity$$ExternalSyntheticLambda3 implements Function1 {
    public final /* synthetic */ LoginBaseActivity f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ LoginBaseActivity$$ExternalSyntheticLambda3(LoginBaseActivity loginBaseActivity, Function1 function1) {
        this.f$0 = loginBaseActivity;
        this.f$1 = function1;
    }

    public final Object invoke(Object obj) {
        Object[] objArr = {this.f$0, this.f$1, (SetDetectableSize) obj};
        int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        return (Unit) LoginBaseActivity.asBinder(559774433, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), -559774428, objArr, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), iOnExtraCallback);
    }
}
