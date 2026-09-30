package im.toss.features.credit.ui.legacy.detail;

import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditDetailActivity$$ExternalSyntheticLambda6 implements Function1 {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ CreditDetailActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 117;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        CreditDetailActivity creditDetailActivity = this.f$0;
        Integer num = (Integer) obj;
        if (i3 != 0) {
            return CreditDetailActivity.onExtraCallback(creditDetailActivity, num.intValue());
        }
        CreditDetailActivity.onExtraCallback(creditDetailActivity, num.intValue());
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
