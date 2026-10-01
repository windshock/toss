package im.toss.features.leave.ui;

import im.toss.features.home.core.ui.widget.sprint5.QuizVar4View;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.KeyBoardVisiblePoint;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LeaveActivity$$ExternalSyntheticLambda29 implements Function2 {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ LeaveActivity f$0;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 43;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        LeaveActivity leaveActivity = this.f$0;
        Boolean bool = (Boolean) obj;
        if (i3 != 0) {
            return (Unit) LeaveActivity.onExtraCallback(new Object[]{leaveActivity, bool, (KeyBoardVisiblePoint) obj2}, 987447625, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), -987447622, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult());
        }
        Unit unit = (Unit) LeaveActivity.onExtraCallback(new Object[]{leaveActivity, bool, (KeyBoardVisiblePoint) obj2}, 987447625, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), -987447622, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult());
        int i4 = 44 / 0;
        return unit;
    }
}
