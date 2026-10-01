package im.toss.features.home.core.ui.widget.sprint5;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class QuizVar4View$$ExternalSyntheticLambda0 implements Function0 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 9;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = QuizVar4View.onWarmupCompleted();
        if (i3 != 0) {
            int i4 = 72 / 0;
        }
        return unitOnWarmupCompleted;
    }
}
