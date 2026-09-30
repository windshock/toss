package im.toss.feature.credit.ui.main.home.raise_edge_case;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditPerfectScoreActivity$$ExternalSyntheticLambda11 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ CreditPerfectScoreActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 87;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            CreditPerfectScoreActivity.onExtraCallback(this.f$0, (SetDetectableSize) obj);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = CreditPerfectScoreActivity.onExtraCallback(this.f$0, (SetDetectableSize) obj);
        int i3 = onExtraCallback + 79;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 29 / 0;
        }
        return unitOnExtraCallback;
    }
}
