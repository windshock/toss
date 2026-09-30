package im.toss.features.home.ui.dst.view.analysis.contents.asset.categorized.loan;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeDstAnalysisAssetLoanActivity$$ExternalSyntheticLambda1 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ int f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 57;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = HomeDstAnalysisAssetLoanActivity.onWarmupCompleted(this.f$0, (SetDetectableSize) obj);
        int i4 = onNavigationEvent + 105;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }
}
