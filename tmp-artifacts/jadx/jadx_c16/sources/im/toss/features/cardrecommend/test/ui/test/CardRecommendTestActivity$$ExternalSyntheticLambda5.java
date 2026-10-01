package im.toss.features.cardrecommend.test.ui.test;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CardRecommendTestActivity$$ExternalSyntheticLambda5 implements Function0 {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ CardRecommendTestActivity f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 97;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            CardRecommendTestActivity.onNavigationEvent(this.f$0);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = CardRecommendTestActivity.onNavigationEvent(this.f$0);
        int i3 = onWarmupCompleted + 69;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return unitOnNavigationEvent;
    }
}
