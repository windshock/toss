package im.toss.features.cardrecommend.home.ui.benefit;

import kotlin.jvm.functions.Function1;
import o.deserializeFloat;
import o.matches;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CardRecommendBenefitActivity$$ExternalSyntheticLambda6 implements deserializeFloat {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ Function1 f$0;

    public final void accept(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 57;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Object[] objArr = {this.f$0, obj};
            int iOnExtraCallback = matches.onExtraCallback();
            CardRecommendBenefitActivity.onWarmupCompleted(objArr, matches.onExtraCallback(), matches.onExtraCallback(), 888032875, matches.onExtraCallback(), -888032874, iOnExtraCallback);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Object[] objArr2 = {this.f$0, obj};
        int iOnExtraCallback2 = matches.onExtraCallback();
        CardRecommendBenefitActivity.onWarmupCompleted(objArr2, matches.onExtraCallback(), matches.onExtraCallback(), 888032875, matches.onExtraCallback(), -888032874, iOnExtraCallback2);
        int i3 = onExtraCallback + 91;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
    }
}
