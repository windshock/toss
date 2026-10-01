package im.toss.features.leave.ui;

import im.toss.features.home.core.ui.widget.sprint5.QuizVar4View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import o.setParentLayoutDirection;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LeaveActivity$$ExternalSyntheticLambda17 implements Function0 {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ setParentLayoutDirection f$0;
    public final /* synthetic */ LeaveActivity f$1;

    public /* synthetic */ LeaveActivity$$ExternalSyntheticLambda17(setParentLayoutDirection setparentlayoutdirection, LeaveActivity leaveActivity) {
        this.f$0 = setparentlayoutdirection;
        this.f$1 = leaveActivity;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 33;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) LeaveActivity.onExtraCallback(new Object[]{this.f$0, this.f$1}, -34107626, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), 34107630, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult());
        int i4 = IAuthTabCallback + 109;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }
}
