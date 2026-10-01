package im.toss.features.cardrecommend.home.ui.benefit;

import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CardRecommendBenefitActivity$$ExternalSyntheticLambda5 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 21;
        IAuthTabCallback = i2 % 128;
        Throwable th = (Throwable) obj;
        if (i2 % 2 != 0) {
            return CardRecommendBenefitActivity.onExtraCallbackWithResult(th);
        }
        CardRecommendBenefitActivity.onExtraCallbackWithResult(th);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
