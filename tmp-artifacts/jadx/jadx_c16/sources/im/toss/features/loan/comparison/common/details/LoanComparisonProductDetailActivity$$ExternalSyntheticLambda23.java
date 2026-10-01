package im.toss.features.loan.comparison.common.details;

import kotlin.jvm.functions.Function0;
import o.ImagePipelineExperimentsBuilderExternalSyntheticLambda14;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanComparisonProductDetailActivity$$ExternalSyntheticLambda23 implements Function0 {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ LoanComparisonProductDetailActivity f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ ImagePipelineExperimentsBuilderExternalSyntheticLambda14 f$2;

    public /* synthetic */ LoanComparisonProductDetailActivity$$ExternalSyntheticLambda23(LoanComparisonProductDetailActivity loanComparisonProductDetailActivity, String str, ImagePipelineExperimentsBuilderExternalSyntheticLambda14 imagePipelineExperimentsBuilderExternalSyntheticLambda14) {
        this.f$0 = loanComparisonProductDetailActivity;
        this.f$1 = str;
        this.f$2 = imagePipelineExperimentsBuilderExternalSyntheticLambda14;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 33;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        LoanComparisonProductDetailActivity loanComparisonProductDetailActivity = this.f$0;
        if (i3 != 0) {
            return LoanComparisonProductDetailActivity.onExtraCallback(loanComparisonProductDetailActivity, this.f$1, this.f$2);
        }
        int i4 = 0 / 0;
        return LoanComparisonProductDetailActivity.onExtraCallback(loanComparisonProductDetailActivity, this.f$1, this.f$2);
    }
}
