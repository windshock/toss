package im.toss.features.home.presentation.legacy_transaction_list;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;
import o.detachH5Plugin;
import viva.republica.toss.network.model.home.CardRecommendBanner;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LegacyTransactionListLogManager$$ExternalSyntheticLambda2 implements Function1 {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ CardRecommendBanner f$2;

    public /* synthetic */ LegacyTransactionListLogManager$$ExternalSyntheticLambda2(String str, String str2, CardRecommendBanner cardRecommendBanner) {
        this.f$0 = str;
        this.f$1 = str2;
        this.f$2 = cardRecommendBanner;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 119;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        String str = this.f$0;
        if (i3 == 0) {
            return detachH5Plugin.onNavigationEvent(str, this.f$1, this.f$2, (SetDetectableSize) obj);
        }
        Unit unitOnNavigationEvent = detachH5Plugin.onNavigationEvent(str, this.f$1, this.f$2, (SetDetectableSize) obj);
        int i4 = 18 / 0;
        return unitOnNavigationEvent;
    }
}
