package im.toss.features.home.ui.dst.view.analysis.contents.asset.categorized.deposit;

import kotlin.jvm.functions.Function2;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeDstAnalysisAssetDepositActivity$$ExternalSyntheticLambda1 implements Function2 {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 55;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iIntValue = ((Integer) obj).intValue();
        int iIntValue2 = ((Integer) obj2).intValue();
        if (i3 == 0) {
            return HomeDstAnalysisAssetDepositActivity.onNavigationEvent(iIntValue, iIntValue2);
        }
        HomeDstAnalysisAssetDepositActivity.onNavigationEvent(iIntValue, iIntValue2);
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }
}
