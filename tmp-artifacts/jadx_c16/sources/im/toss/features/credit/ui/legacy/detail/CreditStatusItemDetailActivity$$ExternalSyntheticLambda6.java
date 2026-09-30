package im.toss.features.credit.ui.legacy.detail;

import kotlin.jvm.functions.Function1;
import o.deserializeUriNullableCollection;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditStatusItemDetailActivity$$ExternalSyntheticLambda6 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ CreditStatusItemDetailActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 59;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        CreditStatusItemDetailActivity creditStatusItemDetailActivity = this.f$0;
        deserializeUriNullableCollection deserializeurinullablecollection = (deserializeUriNullableCollection) obj;
        if (i3 == 0) {
            return CreditStatusItemDetailActivity.onWarmupCompleted(creditStatusItemDetailActivity, deserializeurinullablecollection);
        }
        CreditStatusItemDetailActivity.onWarmupCompleted(creditStatusItemDetailActivity, deserializeurinullablecollection);
        throw null;
    }
}
