package im.toss.feature.credit.ui.history.list;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditHistoryActivity$$ExternalSyntheticLambda3 implements Function1 {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ CreditHistoryActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 71;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            CreditHistoryActivity.onWarmupCompleted(this.f$0, (SetDetectableSize) obj);
            throw null;
        }
        Unit unitOnWarmupCompleted = CreditHistoryActivity.onWarmupCompleted(this.f$0, (SetDetectableSize) obj);
        int i3 = onExtraCallbackWithResult + 103;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }
}
