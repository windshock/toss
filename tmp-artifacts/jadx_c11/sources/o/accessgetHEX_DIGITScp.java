package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class accessgetHEX_DIGITScp {
    private static deprecated_followRedirects IAuthTabCallback = null;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public static final deprecated_followRedirects onNavigationEvent(@NotNull OkHttp okHttp) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(okHttp, "");
        if (IAuthTabCallback == null) {
            int i2 = onWarmupCompleted + 15;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback = deprecated_authenticator.onWarmupCompleted("icon-chip-x-mono");
        }
        deprecated_followRedirects deprecated_followredirects = IAuthTabCallback;
        Intrinsics.checkNotNull(deprecated_followredirects);
        int i4 = onWarmupCompleted + 125;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return deprecated_followredirects;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
