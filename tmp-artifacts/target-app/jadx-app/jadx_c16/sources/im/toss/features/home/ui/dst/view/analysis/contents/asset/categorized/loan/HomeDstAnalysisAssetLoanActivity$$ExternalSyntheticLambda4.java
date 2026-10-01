package im.toss.features.home.ui.dst.view.analysis.contents.asset.categorized.loan;

import android.os.Bundle;
import im.toss.base.BaseFragment;
import kotlin.jvm.functions.Function2;
import o.FlowMeasureLazyPolicyExternalSyntheticLambda3;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeDstAnalysisAssetLoanActivity$$ExternalSyntheticLambda4 implements Function2 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 21;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        BaseFragment baseFragmentOnNavigationEvent = HomeDstAnalysisAssetLoanActivity.onNavigationEvent((FlowMeasureLazyPolicyExternalSyntheticLambda3) obj, (Bundle) obj2);
        int i4 = onNavigationEvent + 89;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return baseFragmentOnNavigationEvent;
    }
}
