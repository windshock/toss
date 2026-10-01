package im.toss.features.home.ui.dst.view.analysis.contents.asset.categorized.deposit;

import android.os.Bundle;
import im.toss.base.BaseFragment;
import kotlin.jvm.functions.Function2;
import o.FlowMeasureLazyPolicyExternalSyntheticLambda3;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeDstAnalysisAssetDepositActivity$$ExternalSyntheticLambda3 implements Function2 {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 101;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        BaseFragment baseFragmentOnNavigationEvent = HomeDstAnalysisAssetDepositActivity.onNavigationEvent((FlowMeasureLazyPolicyExternalSyntheticLambda3) obj, (Bundle) obj2);
        int i4 = onNavigationEvent + 95;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 68 / 0;
        }
        return baseFragmentOnNavigationEvent;
    }
}
