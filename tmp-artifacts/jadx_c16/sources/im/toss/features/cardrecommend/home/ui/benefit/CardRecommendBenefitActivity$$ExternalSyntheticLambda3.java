package im.toss.features.cardrecommend.home.ui.benefit;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CardRecommendBenefitActivity$$ExternalSyntheticLambda3 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ CardRecommendBenefitActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 101;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = CardRecommendBenefitActivity.onExtraCallbackWithResult(this.f$0, (Integer) obj);
        int i4 = onExtraCallback + 55;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }
}
