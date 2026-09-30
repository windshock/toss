package im.toss.core.webkit;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.setCircleColor;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TossWebChromeClient$$ExternalSyntheticLambda12 implements Function1 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 87;
        onExtraCallbackWithResult = i2 % 128;
        Object obj2 = null;
        Throwable th = (Throwable) obj;
        if (i2 % 2 != 0) {
            setCircleColor.onWarmupCompleted(th);
            obj2.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = setCircleColor.onWarmupCompleted(th);
        int i3 = onNavigationEvent + 79;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }
}
