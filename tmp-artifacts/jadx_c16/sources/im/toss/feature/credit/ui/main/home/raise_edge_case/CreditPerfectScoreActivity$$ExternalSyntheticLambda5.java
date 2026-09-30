package im.toss.feature.credit.ui.main.home.raise_edge_case;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditPerfectScoreActivity$$ExternalSyntheticLambda5 implements Function0 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ CreditPerfectScoreActivity f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 121;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            CreditPerfectScoreActivity.onExtraCallback(this.f$0);
            throw null;
        }
        Unit unitOnExtraCallback = CreditPerfectScoreActivity.onExtraCallback(this.f$0);
        int i3 = onExtraCallbackWithResult + 61;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnExtraCallback;
        }
        obj.hashCode();
        throw null;
    }
}
