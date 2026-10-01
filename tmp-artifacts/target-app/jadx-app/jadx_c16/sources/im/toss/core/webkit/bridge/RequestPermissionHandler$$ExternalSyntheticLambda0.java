package im.toss.core.webkit.bridge;

import kotlin.jvm.functions.Function1;
import o.setOnOutOfMemeryErrorCallback;
import o.shouldBeKeptAsChild;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class RequestPermissionHandler$$ExternalSyntheticLambda0 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ setOnOutOfMemeryErrorCallback f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 27;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback = this.f$0;
        shouldBeKeptAsChild shouldbekeptaschild = (shouldBeKeptAsChild) obj;
        if (i3 != 0) {
            return RequestPermissionHandler.onExtraCallback(setonoutofmemeryerrorcallback, shouldbekeptaschild);
        }
        RequestPermissionHandler.onExtraCallback(setonoutofmemeryerrorcallback, shouldbekeptaschild);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
