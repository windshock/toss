package im.toss.features.cardrecommend.test.ui.funnel;

import im.toss.features.cardrecommend.test.model.FunnelItem;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CardRecommendTestFunnelListActivity$$ExternalSyntheticLambda1 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 99;
        onNavigationEvent = i2 % 128;
        FunnelItem funnelItem = (FunnelItem) obj;
        if (i2 % 2 == 0) {
            CardRecommendTestFunnelListActivity.IAuthTabCallback(funnelItem);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Object objIAuthTabCallback = CardRecommendTestFunnelListActivity.IAuthTabCallback(funnelItem);
        int i3 = onNavigationEvent + 5;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 42 / 0;
        }
        return objIAuthTabCallback;
    }
}
