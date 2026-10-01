package im.toss.features.edoc.wallet;

import im.toss.features.benefit.ui.BenefitItemAdapter$;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.CommonModule_setLeftEdgeTouchEnabled;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class DocumentWalletJoinLoadingActivity$$ExternalSyntheticLambda12 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ DocumentWalletJoinLoadingActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 99;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0, (CommonModule_setLeftEdgeTouchEnabled) obj};
        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        if (i3 == 0) {
            return (Unit) DocumentWalletJoinLoadingActivity.onWarmupCompleted(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), -1361842525, iOnExtraCallbackWithResult, objArr, 1361842530, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult());
        }
        int i4 = 55 / 0;
        return (Unit) DocumentWalletJoinLoadingActivity.onWarmupCompleted(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), -1361842525, iOnExtraCallbackWithResult, objArr, 1361842530, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult());
    }
}
