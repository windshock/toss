package im.toss.features.industrialcodeselect.impl;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.PullRefreshIndicatorKtExternalSyntheticLambda5;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class IndustrialCodeSelectActivity$$ExternalSyntheticLambda9 implements Function1 {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 113;
        onExtraCallbackWithResult = i2 % 128;
        PullRefreshIndicatorKtExternalSyntheticLambda5 pullRefreshIndicatorKtExternalSyntheticLambda5 = (PullRefreshIndicatorKtExternalSyntheticLambda5) obj;
        if (i2 % 2 == 0) {
            IndustrialCodeSelectActivity.onExtraCallbackWithResult(pullRefreshIndicatorKtExternalSyntheticLambda5);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = IndustrialCodeSelectActivity.onExtraCallbackWithResult(pullRefreshIndicatorKtExternalSyntheticLambda5);
        int i3 = onExtraCallbackWithResult + 17;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallbackWithResult;
    }
}
