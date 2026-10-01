package o;

import kotlin.jvm.internal.Intrinsics;
import o.Cacheurls1;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class deprecated_maxStaleSeconds {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;

    public static final Cacheurls1 onNavigationEvent(@NotNull accessgetORDER_BY_NAMEcp accessgetorder_by_namecp) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(accessgetorder_by_namecp, "");
        Cacheurls1.onExtraCallback onextracallback = new Cacheurls1.onExtraCallback(accessgetorder_by_namecp.onWarmupCompleted(), accessgetorder_by_namecp.asBinder(), accessgetorder_by_namecp.onNavigationEvent().IAuthTabCallback(), accessgetorder_by_namecp.onNavigationEvent().onExtraCallbackWithResult());
        int i2 = onExtraCallback + 71;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return onextracallback;
    }
}
