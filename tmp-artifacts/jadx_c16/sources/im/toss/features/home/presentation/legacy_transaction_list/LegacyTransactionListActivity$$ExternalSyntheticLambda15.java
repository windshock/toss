package im.toss.features.home.presentation.legacy_transaction_list;

import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import o.NativeReactDevToolsSettingsManagerSpec;
import viva.republica.toss.network.model.home.ConsumptionCardRecommendBannerResp;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LegacyTransactionListActivity$$ExternalSyntheticLambda15 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ NativeReactDevToolsSettingsManagerSpec f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 5;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Pair pairOnWarmupCompleted = LegacyTransactionListActivity.onWarmupCompleted(this.f$0, (ConsumptionCardRecommendBannerResp) obj);
        int i4 = onExtraCallback + 27;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 46 / 0;
        }
        return pairOnWarmupCompleted;
    }
}
