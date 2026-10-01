package im.toss.core.webkit;

import android.app.Activity;
import im.toss.features.home.core.ui.widget.sprint5.QuizVar4View;
import o.drawFocusCircle;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TossCoreJavascriptInterface$$ExternalSyntheticLambda0 implements Runnable {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ Activity f$0;

    @Override // java.lang.Runnable
    public final void run() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 55;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0};
        int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        if (i3 != 0) {
            drawFocusCircle.onWarmupCompleted(QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), objArr, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, 1062841427, iOnExtraCallbackWithResult, -1062841425);
        } else {
            drawFocusCircle.onWarmupCompleted(QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), objArr, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, 1062841427, iOnExtraCallbackWithResult, -1062841425);
            throw null;
        }
    }
}
