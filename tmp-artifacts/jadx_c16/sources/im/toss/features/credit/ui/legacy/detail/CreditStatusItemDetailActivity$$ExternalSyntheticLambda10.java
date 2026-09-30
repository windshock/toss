package im.toss.features.credit.ui.legacy.detail;

import im.toss.features.credit.data.legacy.detail.StatusDetail;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditStatusItemDetailActivity$$ExternalSyntheticLambda10 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ CreditStatusItemDetailActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 25;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        CreditStatusItemDetailActivity creditStatusItemDetailActivity = this.f$0;
        StatusDetail statusDetail = (StatusDetail) obj;
        if (i3 == 0) {
            return CreditStatusItemDetailActivity.onNavigationEvent(creditStatusItemDetailActivity, statusDetail);
        }
        CreditStatusItemDetailActivity.onNavigationEvent(creditStatusItemDetailActivity, statusDetail);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
