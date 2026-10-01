package im.toss.features.loan.refinancing.funnel.common;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.ImagePipelineExperimentsBuilderExternalSyntheticLambda10;
import o.r8lambda6V0YVgpvgCQzEji1GNetQSIYsE;
import viva.republica.toss.network.model.loan.LoanFunnelType;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanRefinancingFunnelBaseFragment$$ExternalSyntheticLambda17 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    public final /* synthetic */ boolean f$0;
    public final /* synthetic */ LoanRefinancingFunnelBaseFragment f$1;
    public final /* synthetic */ LoanFunnelType f$2;
    public final /* synthetic */ ImagePipelineExperimentsBuilderExternalSyntheticLambda10 f$3;

    public /* synthetic */ LoanRefinancingFunnelBaseFragment$$ExternalSyntheticLambda17(boolean z, LoanRefinancingFunnelBaseFragment loanRefinancingFunnelBaseFragment, LoanFunnelType loanFunnelType, ImagePipelineExperimentsBuilderExternalSyntheticLambda10 imagePipelineExperimentsBuilderExternalSyntheticLambda10) {
        this.f$0 = z;
        this.f$1 = loanRefinancingFunnelBaseFragment;
        this.f$2 = loanFunnelType;
        this.f$3 = imagePipelineExperimentsBuilderExternalSyntheticLambda10;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 13;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            LoanRefinancingFunnelBaseFragment.onNavigationEvent(this.f$0, this.f$1, this.f$2, this.f$3, (r8lambda6V0YVgpvgCQzEji1GNetQSIYsE) obj);
            throw null;
        }
        Unit unitOnNavigationEvent = LoanRefinancingFunnelBaseFragment.onNavigationEvent(this.f$0, this.f$1, this.f$2, this.f$3, (r8lambda6V0YVgpvgCQzEji1GNetQSIYsE) obj);
        int i3 = IAuthTabCallback + 25;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitOnNavigationEvent;
    }
}
