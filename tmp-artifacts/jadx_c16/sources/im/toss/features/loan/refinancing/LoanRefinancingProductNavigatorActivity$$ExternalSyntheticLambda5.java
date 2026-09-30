package im.toss.features.loan.refinancing;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.ImagePipelineExperimentsBuilderExternalSyntheticLambda2;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanRefinancingProductNavigatorActivity$$ExternalSyntheticLambda5 implements Function1 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ LoanRefinancingProductNavigatorActivity f$0;

    public final Object invoke(Object obj) {
        Unit unitOnNavigationEvent;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 45;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            unitOnNavigationEvent = LoanRefinancingProductNavigatorActivity.onNavigationEvent(this.f$0, (ImagePipelineExperimentsBuilderExternalSyntheticLambda2) obj);
            int i3 = 39 / 0;
        } else {
            unitOnNavigationEvent = LoanRefinancingProductNavigatorActivity.onNavigationEvent(this.f$0, (ImagePipelineExperimentsBuilderExternalSyntheticLambda2) obj);
        }
        int i4 = onNavigationEvent + 71;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }
}
