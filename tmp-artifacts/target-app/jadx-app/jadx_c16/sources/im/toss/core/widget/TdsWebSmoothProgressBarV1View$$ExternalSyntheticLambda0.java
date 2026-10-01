package im.toss.core.widget;

import android.graphics.Canvas;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TdsWebSmoothProgressBarV1View$$ExternalSyntheticLambda0 implements Function1 {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ TdsWebSmoothProgressBarV1View f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 83;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = TdsWebSmoothProgressBarV1View.onNavigationEvent(this.f$0, (Canvas) obj);
        if (i3 == 0) {
            int i4 = 86 / 0;
        }
        return unitOnNavigationEvent;
    }
}
