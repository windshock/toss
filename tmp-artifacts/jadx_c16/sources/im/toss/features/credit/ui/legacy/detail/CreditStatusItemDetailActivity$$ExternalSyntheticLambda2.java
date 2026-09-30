package im.toss.features.credit.ui.legacy.detail;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditStatusItemDetailActivity$$ExternalSyntheticLambda2 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ CreditStatusItemDetailActivity f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ CreditStatusItemDetailActivity$$ExternalSyntheticLambda2(CreditStatusItemDetailActivity creditStatusItemDetailActivity, String str, int i) {
        this.f$0 = creditStatusItemDetailActivity;
        this.f$1 = str;
        this.f$2 = i;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 37;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            CreditStatusItemDetailActivity.onExtraCallbackWithResult(this.f$0, this.f$1, this.f$2, (Boolean) obj);
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = CreditStatusItemDetailActivity.onExtraCallbackWithResult(this.f$0, this.f$1, this.f$2, (Boolean) obj);
        int i3 = onWarmupCompleted + 121;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallbackWithResult;
    }
}
