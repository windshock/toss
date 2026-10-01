package im.toss.features.home.presentation.legacy_transaction_list;

import o.deserializeIntNullableCollection;
import viva.republica.toss.network.model.home.ConsumptionCardRecommendBannerResp;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LegacyTransactionListActivity$$ExternalSyntheticLambda14 implements deserializeIntNullableCollection {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    public final Object apply(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 1;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        ConsumptionCardRecommendBannerResp consumptionCardRecommendBannerRespAsBinder = LegacyTransactionListActivity.asBinder((Throwable) obj);
        int i4 = onWarmupCompleted + 63;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return consumptionCardRecommendBannerRespAsBinder;
    }
}
