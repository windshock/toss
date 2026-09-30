package im.toss.features.cardrecommend.test.ui.test;

import im.toss.features.payment.ui.autopay.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CardRecommendTestActivity$$ExternalSyntheticLambda3 implements Function0 {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ CardRecommendTestActivity f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 71;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0};
        if (i3 != 0) {
            return (Unit) CardRecommendTestActivity.onNavigationEvent(-358185935, R.onWarmupCompleted(), R.onWarmupCompleted(), R.onWarmupCompleted(), R.onWarmupCompleted(), objArr, 358185937);
        }
        throw null;
    }
}
