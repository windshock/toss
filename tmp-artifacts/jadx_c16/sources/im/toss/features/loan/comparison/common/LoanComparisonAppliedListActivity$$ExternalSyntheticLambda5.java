package im.toss.features.loan.comparison.common;

import im.toss.features.loan.refinancing.funnel.common.LoanRefinancingFunnelAdapter$;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.ImagePipelineExperimentsBuilderExternalSyntheticLambda17;
import o.ImagePipelineExperimentsBuilderExternalSyntheticLambda19;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanComparisonAppliedListActivity$$ExternalSyntheticLambda5 implements Function1 {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ LoanComparisonAppliedListActivity f$0;
    public final /* synthetic */ ImagePipelineExperimentsBuilderExternalSyntheticLambda19 f$1;

    public /* synthetic */ LoanComparisonAppliedListActivity$$ExternalSyntheticLambda5(LoanComparisonAppliedListActivity loanComparisonAppliedListActivity, ImagePipelineExperimentsBuilderExternalSyntheticLambda19 imagePipelineExperimentsBuilderExternalSyntheticLambda19) {
        this.f$0 = loanComparisonAppliedListActivity;
        this.f$1 = imagePipelineExperimentsBuilderExternalSyntheticLambda19;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 67;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        LoanComparisonAppliedListActivity loanComparisonAppliedListActivity = this.f$0;
        if (i3 == 0) {
            Object[] objArr = {loanComparisonAppliedListActivity, this.f$1, (ImagePipelineExperimentsBuilderExternalSyntheticLambda17) obj};
            return (Unit) LoanComparisonAppliedListActivity.onExtraCallbackWithResult(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), objArr, -1502073197, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), 1502073200);
        }
        Object[] objArr2 = {loanComparisonAppliedListActivity, this.f$1, (ImagePipelineExperimentsBuilderExternalSyntheticLambda17) obj};
        int i4 = 55 / 0;
        return (Unit) LoanComparisonAppliedListActivity.onExtraCallbackWithResult(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), objArr2, -1502073197, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), 1502073200);
    }
}
