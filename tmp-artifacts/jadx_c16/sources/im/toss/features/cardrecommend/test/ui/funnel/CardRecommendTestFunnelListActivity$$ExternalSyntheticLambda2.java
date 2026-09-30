package im.toss.features.cardrecommend.test.ui.funnel;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.AudioRestrictionControllerImplExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CardRecommendTestFunnelListActivity$$ExternalSyntheticLambda2 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    public final /* synthetic */ List f$0;
    public final /* synthetic */ CardRecommendTestFunnelListActivity f$1;

    public /* synthetic */ CardRecommendTestFunnelListActivity$$ExternalSyntheticLambda2(List list, CardRecommendTestFunnelListActivity cardRecommendTestFunnelListActivity) {
        this.f$0 = list;
        this.f$1 = cardRecommendTestFunnelListActivity;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 115;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            CardRecommendTestFunnelListActivity.onExtraCallback(this.f$0, this.f$1, (AudioRestrictionControllerImplExternalSyntheticLambda0) obj);
            throw null;
        }
        Unit unitOnExtraCallback = CardRecommendTestFunnelListActivity.onExtraCallback(this.f$0, this.f$1, (AudioRestrictionControllerImplExternalSyntheticLambda0) obj);
        int i3 = onExtraCallback + 125;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallback;
    }
}
