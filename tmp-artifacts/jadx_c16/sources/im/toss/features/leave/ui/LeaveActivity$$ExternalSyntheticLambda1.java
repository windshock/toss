package im.toss.features.leave.ui;

import im.toss.features.home.core.ui.widget.sprint5.QuizVar4View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.PullRefreshIndicatorKtExternalSyntheticLambda5;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LeaveActivity$$ExternalSyntheticLambda1 implements Function1 {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    public final Object invoke(Object obj) {
        Unit unit;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 27;
        onNavigationEvent = i2 % 128;
        PullRefreshIndicatorKtExternalSyntheticLambda5 pullRefreshIndicatorKtExternalSyntheticLambda5 = (PullRefreshIndicatorKtExternalSyntheticLambda5) obj;
        if (i2 % 2 != 0) {
            unit = (Unit) LeaveActivity.onExtraCallback(new Object[]{pullRefreshIndicatorKtExternalSyntheticLambda5}, 857811260, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), -857811249, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult());
            int i3 = 73 / 0;
        } else {
            unit = (Unit) LeaveActivity.onExtraCallback(new Object[]{pullRefreshIndicatorKtExternalSyntheticLambda5}, 857811260, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), -857811249, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult());
        }
        int i4 = onNavigationEvent + 121;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
