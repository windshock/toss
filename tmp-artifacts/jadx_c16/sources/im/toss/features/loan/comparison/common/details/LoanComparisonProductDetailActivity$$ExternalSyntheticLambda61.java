package im.toss.features.loan.comparison.common.details;

import kotlin.Unit;
import o.BytesRangeExternalSyntheticLambda0;
import o.ImagePipelineExperimentsBuilderExternalSyntheticLambda14;
import o.getBacktraceNote;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanComparisonProductDetailActivity$$ExternalSyntheticLambda61 implements getBacktraceNote {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ LoanComparisonProductDetailActivity f$0;

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 117;
        onNavigationEvent = i2 % 128;
        Object obj4 = null;
        if (i2 % 2 != 0) {
            LoanComparisonProductDetailActivity.onExtraCallback(this.f$0, (String) obj, (ImagePipelineExperimentsBuilderExternalSyntheticLambda14) obj2, (BytesRangeExternalSyntheticLambda0) obj3);
            obj4.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = LoanComparisonProductDetailActivity.onExtraCallback(this.f$0, (String) obj, (ImagePipelineExperimentsBuilderExternalSyntheticLambda14) obj2, (BytesRangeExternalSyntheticLambda0) obj3);
        int i3 = onNavigationEvent + 119;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }
}
