package im.toss.feature.credit.ui.main.home.raise_edge_case;

import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditPerfectScoreActivity$$ExternalSyntheticLambda8 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ CreditPerfectScoreActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 75;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        CreditPerfectScoreActivity creditPerfectScoreActivity = this.f$0;
        SetDetectableSize setDetectableSize = (SetDetectableSize) obj;
        if (i3 != 0) {
            return CreditPerfectScoreActivity.onExtraCallbackWithResult(creditPerfectScoreActivity, setDetectableSize);
        }
        CreditPerfectScoreActivity.onExtraCallbackWithResult(creditPerfectScoreActivity, setDetectableSize);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
