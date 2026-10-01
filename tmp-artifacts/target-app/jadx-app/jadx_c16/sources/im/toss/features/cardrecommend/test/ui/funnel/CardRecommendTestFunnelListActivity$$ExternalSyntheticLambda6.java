package im.toss.features.cardrecommend.test.ui.funnel;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CardRecommendTestFunnelListActivity$$ExternalSyntheticLambda6 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public final /* synthetic */ CardRecommendTestFunnelListActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 55;
        IAuthTabCallback = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            CardRecommendTestFunnelListActivity.onExtraCallback(this.f$0, (String) obj);
            obj2.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = CardRecommendTestFunnelListActivity.onExtraCallback(this.f$0, (String) obj);
        int i3 = onExtraCallback + 71;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }
}
