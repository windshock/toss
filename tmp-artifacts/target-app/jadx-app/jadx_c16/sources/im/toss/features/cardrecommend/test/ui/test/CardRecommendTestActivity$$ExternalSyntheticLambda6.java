package im.toss.features.cardrecommend.test.ui.test;

import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CardRecommendTestActivity$$ExternalSyntheticLambda6 implements Function0 {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ CardRecommendTestActivity f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 95;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        CardRecommendTestActivity cardRecommendTestActivity = this.f$0;
        if (i3 != 0) {
            return CardRecommendTestActivity.onExtraCallbackWithResult(cardRecommendTestActivity);
        }
        CardRecommendTestActivity.onExtraCallbackWithResult(cardRecommendTestActivity);
        throw null;
    }
}
