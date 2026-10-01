package im.toss.features.home.ui.dst.view.analysis.contents.asset.categorized.deposit;

import android.os.Bundle;
import im.toss.base.BaseFragment;
import kotlin.jvm.functions.Function2;
import o.FlowMeasureLazyPolicyExternalSyntheticLambda3;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeDstAnalysisAssetDepositActivity$$ExternalSyntheticLambda4 implements Function2 {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 51;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        BaseFragment baseFragmentIAuthTabCallback = HomeDstAnalysisAssetDepositActivity.IAuthTabCallback((FlowMeasureLazyPolicyExternalSyntheticLambda3) obj, (Bundle) obj2);
        int i4 = onExtraCallback + 77;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return baseFragmentIAuthTabCallback;
    }
}
