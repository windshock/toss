package im.toss.feature.credit.ui.main.home.raise_edge_case;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditPerfectScoreActivity$$ExternalSyntheticLambda4 implements Function0 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ CreditPerfectScoreActivity f$0;

    public final Object invoke() {
        Unit unitIAuthTabCallback;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 43;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            unitIAuthTabCallback = CreditPerfectScoreActivity.IAuthTabCallback(this.f$0);
            int i3 = 34 / 0;
        } else {
            unitIAuthTabCallback = CreditPerfectScoreActivity.IAuthTabCallback(this.f$0);
        }
        int i4 = onNavigationEvent + 7;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }
}
