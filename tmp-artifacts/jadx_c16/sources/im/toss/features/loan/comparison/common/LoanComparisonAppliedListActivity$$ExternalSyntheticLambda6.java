package im.toss.features.loan.comparison.common;

import kotlin.jvm.functions.Function1;
import o.ImagePipelineExperimentsBuilderExternalSyntheticLambda17;
import o.ImagePipelineExperimentsBuilderExternalSyntheticLambda19;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanComparisonAppliedListActivity$$ExternalSyntheticLambda6 implements Function1 {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ LoanComparisonAppliedListActivity f$0;
    public final /* synthetic */ ImagePipelineExperimentsBuilderExternalSyntheticLambda19 f$1;

    public /* synthetic */ LoanComparisonAppliedListActivity$$ExternalSyntheticLambda6(LoanComparisonAppliedListActivity loanComparisonAppliedListActivity, ImagePipelineExperimentsBuilderExternalSyntheticLambda19 imagePipelineExperimentsBuilderExternalSyntheticLambda19) {
        this.f$0 = loanComparisonAppliedListActivity;
        this.f$1 = imagePipelineExperimentsBuilderExternalSyntheticLambda19;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 87;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        LoanComparisonAppliedListActivity loanComparisonAppliedListActivity = this.f$0;
        if (i3 == 0) {
            return LoanComparisonAppliedListActivity.onNavigationEvent(loanComparisonAppliedListActivity, this.f$1, (ImagePipelineExperimentsBuilderExternalSyntheticLambda17) obj);
        }
        LoanComparisonAppliedListActivity.onNavigationEvent(loanComparisonAppliedListActivity, this.f$1, (ImagePipelineExperimentsBuilderExternalSyntheticLambda17) obj);
        throw null;
    }
}
