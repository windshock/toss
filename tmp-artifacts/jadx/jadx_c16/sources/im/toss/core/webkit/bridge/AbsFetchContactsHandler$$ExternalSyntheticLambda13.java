package im.toss.core.webkit.bridge;

import kotlin.jvm.functions.Function1;
import o.deserializeFloat;
import o.surfaceDestroyed;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AbsFetchContactsHandler$$ExternalSyntheticLambda13 implements deserializeFloat {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ Function1 f$0;

    public final void accept(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 101;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            surfaceDestroyed.onWarmupCompleted(this.f$0, obj);
            throw null;
        }
        surfaceDestroyed.onWarmupCompleted(this.f$0, obj);
        int i3 = onExtraCallback + 41;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
    }
}
