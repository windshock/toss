package im.toss.features.home.ui.dst.view.analysis.contents.asset.categorized.deposit;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeDstAnalysisAssetDepositActivity$$ExternalSyntheticLambda2 implements Function1 {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 3;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = HomeDstAnalysisAssetDepositActivity.onExtraCallbackWithResult(((Integer) obj).intValue());
        int i4 = onWarmupCompleted + 15;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 31 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }
}
