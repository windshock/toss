package im.toss.core.webkit.bridge;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import o.ALCTimerLabel;
import o.setOnOutOfMemeryErrorCallback;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AbsLoadImagesHandler$$ExternalSyntheticLambda4 implements Function0 {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ setOnOutOfMemeryErrorCallback f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 21;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = ALCTimerLabel.onWarmupCompleted(this.f$0);
        int i4 = onExtraCallback + 107;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
