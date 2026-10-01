package im.toss.features.leave.ui;

import im.toss.features.home.core.ui.widget.sprint5.QuizVar4View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.setParentLayoutDirection;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LeaveActivity$$ExternalSyntheticLambda2 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ LeaveActivity f$0;
    public final /* synthetic */ setParentLayoutDirection f$1;

    public /* synthetic */ LeaveActivity$$ExternalSyntheticLambda2(LeaveActivity leaveActivity, setParentLayoutDirection setparentlayoutdirection) {
        this.f$0 = leaveActivity;
        this.f$1 = setparentlayoutdirection;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 83;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        Unit unit = (Unit) LeaveActivity.onExtraCallback(new Object[]{this.f$0, this.f$1, (String) obj}, -1715594311, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), 1715594317, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult());
        int i3 = onWarmupCompleted + 89;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }
}
