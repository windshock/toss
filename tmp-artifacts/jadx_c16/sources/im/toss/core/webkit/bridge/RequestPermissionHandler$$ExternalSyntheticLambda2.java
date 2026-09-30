package im.toss.core.webkit.bridge;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.setOnOutOfMemeryErrorCallback;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class RequestPermissionHandler$$ExternalSyntheticLambda2 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ setOnOutOfMemeryErrorCallback f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 23;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = RequestPermissionHandler.IAuthTabCallback(this.f$0, (Throwable) obj);
        int i4 = onExtraCallbackWithResult + 77;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }
}
