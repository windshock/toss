package im.toss.features.home.core.ui.widget.sprint3;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeInventoryIncomeMainVar3View$$ExternalSyntheticLambda2 implements Function0 {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 97;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = HomeInventoryIncomeMainVar3View.onNavigationEvent();
        int i4 = onExtraCallbackWithResult + 9;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
