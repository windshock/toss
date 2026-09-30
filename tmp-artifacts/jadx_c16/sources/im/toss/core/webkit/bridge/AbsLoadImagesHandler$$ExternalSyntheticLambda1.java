package im.toss.core.webkit.bridge;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.ALCTimerLabel;
import o.startRunning;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AbsLoadImagesHandler$$ExternalSyntheticLambda1 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 77;
        onNavigationEvent = i2 % 128;
        Object obj2 = null;
        startRunning startrunning = (startRunning) obj;
        if (i2 % 2 == 0) {
            ALCTimerLabel.onWarmupCompleted(startrunning);
            throw null;
        }
        Unit unitOnWarmupCompleted = ALCTimerLabel.onWarmupCompleted(startrunning);
        int i3 = onNavigationEvent + 7;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        obj2.hashCode();
        throw null;
    }
}
