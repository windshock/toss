package im.toss.features.loan.comparison.common;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.ImagePipelineExperimentsBuilderExternalSyntheticLambda17;
import o.ImagePipelineExperimentsBuilderExternalSyntheticLambda19;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanComparisonAppliedListActivity$$ExternalSyntheticLambda4 implements Function1 {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ LoanComparisonAppliedListActivity f$0;
    public final /* synthetic */ ImagePipelineExperimentsBuilderExternalSyntheticLambda19 f$1;

    public /* synthetic */ LoanComparisonAppliedListActivity$$ExternalSyntheticLambda4(LoanComparisonAppliedListActivity loanComparisonAppliedListActivity, ImagePipelineExperimentsBuilderExternalSyntheticLambda19 imagePipelineExperimentsBuilderExternalSyntheticLambda19) {
        this.f$0 = loanComparisonAppliedListActivity;
        this.f$1 = imagePipelineExperimentsBuilderExternalSyntheticLambda19;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 101;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = LoanComparisonAppliedListActivity.IAuthTabCallback(this.f$0, this.f$1, (ImagePipelineExperimentsBuilderExternalSyntheticLambda17) obj);
        int i4 = onExtraCallbackWithResult + 21;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }
}
