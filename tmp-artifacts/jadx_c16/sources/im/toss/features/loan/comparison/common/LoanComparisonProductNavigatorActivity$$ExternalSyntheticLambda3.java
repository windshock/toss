package im.toss.features.loan.comparison.common;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.ImagePipelineExperimentsBuilderExternalSyntheticLambda2;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanComparisonProductNavigatorActivity$$ExternalSyntheticLambda3 implements Function1 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ LoanComparisonProductNavigatorActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 53;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            LoanComparisonProductNavigatorActivity.IAuthTabCallback(this.f$0, (ImagePipelineExperimentsBuilderExternalSyntheticLambda2) obj);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = LoanComparisonProductNavigatorActivity.IAuthTabCallback(this.f$0, (ImagePipelineExperimentsBuilderExternalSyntheticLambda2) obj);
        int i3 = onExtraCallbackWithResult + 57;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return unitIAuthTabCallback;
    }
}
