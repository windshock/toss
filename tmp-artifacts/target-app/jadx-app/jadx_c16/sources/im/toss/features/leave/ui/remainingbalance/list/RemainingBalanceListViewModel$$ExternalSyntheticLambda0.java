package im.toss.features.leave.ui.remainingbalance.list;

import im.toss.features.leave.domain.response.RemainingBalanceItemResponse;
import im.toss.features.payment.ui.autopay.R;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class RemainingBalanceListViewModel$$ExternalSyntheticLambda0 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 19;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {(RemainingBalanceItemResponse) obj};
        int iOnWarmupCompleted = R.onWarmupCompleted();
        int iOnWarmupCompleted2 = R.onWarmupCompleted();
        int iOnWarmupCompleted3 = R.onWarmupCompleted();
        int iOnWarmupCompleted4 = R.onWarmupCompleted();
        if (i3 != 0) {
            throw null;
        }
        CharSequence charSequence = (CharSequence) RemainingBalanceListViewModel.onExtraCallback(800224718, -800224716, objArr, iOnWarmupCompleted3, iOnWarmupCompleted4, iOnWarmupCompleted, iOnWarmupCompleted2);
        int i4 = onNavigationEvent + 111;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return charSequence;
        }
        throw null;
    }
}
