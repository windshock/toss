package im.toss.features.cardrecommend.home.ui.benefit;

import kotlin.jvm.functions.Function1;
import o.deserializeFloat;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CardRecommendBenefitActivity$$ExternalSyntheticLambda4 implements deserializeFloat {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ Function1 f$0;

    public final void accept(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 23;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        CardRecommendBenefitActivity.onWarmupCompleted(this.f$0, obj);
        int i4 = onExtraCallback + 103;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }
}
