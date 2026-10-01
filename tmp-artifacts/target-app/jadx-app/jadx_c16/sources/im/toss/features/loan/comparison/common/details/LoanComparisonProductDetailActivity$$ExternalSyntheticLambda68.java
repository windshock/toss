package im.toss.features.loan.comparison.common.details;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.ImagePipelineExperimentsBuilderExternalSyntheticLambda1;
import o.getBacktraceNote;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanComparisonProductDetailActivity$$ExternalSyntheticLambda68 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ LoanComparisonProductDetailActivity f$0;
    public final /* synthetic */ getBacktraceNote f$1;

    public /* synthetic */ LoanComparisonProductDetailActivity$$ExternalSyntheticLambda68(LoanComparisonProductDetailActivity loanComparisonProductDetailActivity, getBacktraceNote getbacktracenote) {
        this.f$0 = loanComparisonProductDetailActivity;
        this.f$1 = getbacktracenote;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 115;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            LoanComparisonProductDetailActivity.onExtraCallback(this.f$0, this.f$1, (ImagePipelineExperimentsBuilderExternalSyntheticLambda1) obj);
            throw null;
        }
        Unit unitOnExtraCallback = LoanComparisonProductDetailActivity.onExtraCallback(this.f$0, this.f$1, (ImagePipelineExperimentsBuilderExternalSyntheticLambda1) obj);
        int i3 = IAuthTabCallback + 73;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallback;
    }
}
