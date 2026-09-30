package im.toss.feature.credit.ui.main.home.raise_edge_case;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditScoreRaiseCoolTimeActivity$$ExternalSyntheticLambda3 implements Function0 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    public final /* synthetic */ CreditScoreRaiseCoolTimeActivity f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 67;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = CreditScoreRaiseCoolTimeActivity.IAuthTabCallback(this.f$0);
        int i4 = onExtraCallback + 59;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }
}
