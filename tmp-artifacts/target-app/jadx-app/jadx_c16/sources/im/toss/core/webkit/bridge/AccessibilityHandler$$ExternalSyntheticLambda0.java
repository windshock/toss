package im.toss.core.webkit.bridge;

import im.toss.core.webkit.TossCoreWebView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.ALCTimerLabel1;
import o.startRunning;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AccessibilityHandler$$ExternalSyntheticLambda0 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ TossCoreWebView f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 13;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = ALCTimerLabel1.onExtraCallbackWithResult(this.f$0, (startRunning) obj);
        int i4 = onExtraCallback + 97;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
