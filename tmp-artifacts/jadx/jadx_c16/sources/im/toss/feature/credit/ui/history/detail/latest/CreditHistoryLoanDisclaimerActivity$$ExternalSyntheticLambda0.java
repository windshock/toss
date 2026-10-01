package im.toss.feature.credit.ui.history.detail.latest;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditHistoryLoanDisclaimerActivity$$ExternalSyntheticLambda0 implements Function0 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public final /* synthetic */ CreditHistoryLoanDisclaimerActivity f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 107;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            CreditHistoryLoanDisclaimerActivity.onExtraCallbackWithResult(this.f$0);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = CreditHistoryLoanDisclaimerActivity.onExtraCallbackWithResult(this.f$0);
        int i3 = IAuthTabCallback + 89;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 78 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }
}
