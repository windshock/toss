package im.toss.features.credit.ui.legacy.detail;

import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditDetailActivity$$ExternalSyntheticLambda3 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ int f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 55;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.f$0;
        int iIntValue = ((Integer) obj).intValue();
        if (i3 == 0) {
            return CreditDetailActivity.IAuthTabCallback(i4, iIntValue);
        }
        CreditDetailActivity.IAuthTabCallback(i4, iIntValue);
        throw null;
    }
}
