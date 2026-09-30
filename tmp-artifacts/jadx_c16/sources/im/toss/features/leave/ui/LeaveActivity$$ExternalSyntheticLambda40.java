package im.toss.features.leave.ui;

import im.toss.features.home.core.ui.widget.sprint5.QuizVar4View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import o.setParentLayoutDirection;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LeaveActivity$$ExternalSyntheticLambda40 implements Function0 {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ setParentLayoutDirection f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 67;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        setParentLayoutDirection setparentlayoutdirection = this.f$0;
        if (i3 != 0) {
            return (Unit) LeaveActivity.onExtraCallback(new Object[]{setparentlayoutdirection}, -2036896121, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), 2036896126, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult());
        }
        throw null;
    }
}
