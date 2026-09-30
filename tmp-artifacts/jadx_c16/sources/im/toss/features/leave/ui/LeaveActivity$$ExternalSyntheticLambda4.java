package im.toss.features.leave.ui;

import im.toss.features.home.core.ui.widget.sprint5.QuizVar4View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LeaveActivity$$ExternalSyntheticLambda4 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ LeaveActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 57;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Unit unit = (Unit) LeaveActivity.onExtraCallback(new Object[]{this.f$0, (String) obj}, -249721093, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), 249721106, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult());
        int i3 = onNavigationEvent + 19;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }
}
