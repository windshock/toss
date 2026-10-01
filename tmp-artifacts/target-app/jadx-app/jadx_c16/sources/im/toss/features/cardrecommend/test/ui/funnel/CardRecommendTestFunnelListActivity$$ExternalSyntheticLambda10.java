package im.toss.features.cardrecommend.test.ui.funnel;

import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CardRecommendTestFunnelListActivity$$ExternalSyntheticLambda10 implements Function2 {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ CardRecommendTestFunnelListActivity f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ CardRecommendTestFunnelListActivity$$ExternalSyntheticLambda10(CardRecommendTestFunnelListActivity cardRecommendTestFunnelListActivity, int i) {
        this.f$0 = cardRecommendTestFunnelListActivity;
        this.f$1 = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 97;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        CardRecommendTestFunnelListActivity cardRecommendTestFunnelListActivity = this.f$0;
        if (i3 == 0) {
            return CardRecommendTestFunnelListActivity.onExtraCallback(cardRecommendTestFunnelListActivity, this.f$1, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        }
        CardRecommendTestFunnelListActivity.onExtraCallback(cardRecommendTestFunnelListActivity, this.f$1, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        throw null;
    }
}
