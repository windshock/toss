package im.toss.features.loan.comparison.common;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.ImagePipelineExperimentsBuilderExternalSyntheticLambda6;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanProductApplySuccessActivity$$ExternalSyntheticLambda4 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ LoanProductApplySuccessActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 121;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = LoanProductApplySuccessActivity.onNavigationEvent(this.f$0, (ImagePipelineExperimentsBuilderExternalSyntheticLambda6) obj);
        int i4 = onWarmupCompleted + 71;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }
}
