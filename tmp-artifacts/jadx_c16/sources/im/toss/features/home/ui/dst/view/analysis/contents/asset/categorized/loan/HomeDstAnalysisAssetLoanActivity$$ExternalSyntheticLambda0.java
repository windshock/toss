package im.toss.features.home.ui.dst.view.analysis.contents.asset.categorized.loan;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeDstAnalysisAssetLoanActivity$$ExternalSyntheticLambda0 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ int f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 115;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = HomeDstAnalysisAssetLoanActivity.IAuthTabCallback(this.f$0, (SetDetectableSize) obj);
        int i4 = IAuthTabCallback + 121;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }
}
