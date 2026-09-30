package im.toss.core.webkit.bridge;

import kotlin.jvm.functions.Function1;
import o.deserializeFloat;
import o.surfaceDestroyed;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AbsFetchContactsHandler$$ExternalSyntheticLambda7 implements deserializeFloat {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ Function1 f$0;

    public final void accept(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 13;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            surfaceDestroyed.onNavigationEvent(this.f$0, obj);
            throw null;
        }
        surfaceDestroyed.onNavigationEvent(this.f$0, obj);
        int i3 = onWarmupCompleted + 37;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
    }
}
