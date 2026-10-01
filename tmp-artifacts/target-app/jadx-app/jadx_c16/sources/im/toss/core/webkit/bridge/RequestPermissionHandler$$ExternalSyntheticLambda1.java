package im.toss.core.webkit.bridge;

import kotlin.jvm.functions.Function1;
import o.deserializeFloat;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class RequestPermissionHandler$$ExternalSyntheticLambda1 implements deserializeFloat {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ Function1 f$0;

    public final void accept(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 81;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        RequestPermissionHandler.onExtraCallbackWithResult(this.f$0, obj);
        if (i3 == 0) {
            throw null;
        }
    }
}
