package im.toss.core.webkit.bridge;

import kotlin.jvm.functions.Function1;
import o.deserializeFloat;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class RequestPermissionHandler$$ExternalSyntheticLambda3 implements deserializeFloat {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ Function1 f$0;

    public final void accept(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 89;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        RequestPermissionHandler.onWarmupCompleted(this.f$0, obj);
        int i4 = onExtraCallbackWithResult + 27;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }
}
