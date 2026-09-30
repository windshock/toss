package im.toss.features.home.feature.cashflow;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CashflowActivity$$ExternalSyntheticLambda3 implements Function1 {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ CashflowActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 75;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            CashflowActivity.IAuthTabCallback(this.f$0, (String) obj);
            throw null;
        }
        Unit unitIAuthTabCallback = CashflowActivity.IAuthTabCallback(this.f$0, (String) obj);
        int i3 = onWarmupCompleted + 21;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return unitIAuthTabCallback;
    }
}
