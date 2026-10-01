package o;

import kotlin.jvm.internal.Intrinsics;
import o.onFlowLoadFailed;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class preloadCmp {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;

    public static final onFlowLoadFailed onNavigationEvent(@NotNull Throwable th) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 107;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(th, "");
            setCustomerUserId.onExtraCallbackWithResult(th);
            throw null;
        }
        Intrinsics.checkNotNullParameter(th, "");
        if (setCustomerUserId.onExtraCallbackWithResult(th)) {
            return onFlowLoadFailed.IAuthTabCallback.onExtraCallback;
        }
        if (!zzcy.onNavigationEvent(th, 0, 1, (Object) null)) {
            return new onFlowLoadFailed.onWarmupCompleted(th);
        }
        onFlowLoadFailed.onExtraCallback onextracallback = new onFlowLoadFailed.onExtraCallback(th);
        int i3 = onExtraCallback + 25;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            return onextracallback;
        }
        obj.hashCode();
        throw null;
    }
}
