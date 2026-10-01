package im.toss.core.webkit;

import kotlin.jvm.functions.Function1;
import o.deserializeFloat;
import o.setBackgroundAlpha;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TossDownloadListener$$ExternalSyntheticLambda5 implements deserializeFloat {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ Function1 f$0;

    public final void accept(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 57;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        setBackgroundAlpha.onWarmupCompleted(this.f$0, obj);
        if (i3 == 0) {
            int i4 = 22 / 0;
        }
    }
}
