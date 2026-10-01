package im.toss.features.home.ui.dst.view.analysis.contents.asset.categorized.loan;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeDstAnalysisAssetLoanActivity$$ExternalSyntheticLambda2 implements Function2 {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 117;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = HomeDstAnalysisAssetLoanActivity.onExtraCallbackWithResult(((Integer) obj).intValue(), ((Integer) obj2).intValue());
        if (i3 == 0) {
            int i4 = 81 / 0;
        }
        int i5 = onExtraCallbackWithResult + 1;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }
}
