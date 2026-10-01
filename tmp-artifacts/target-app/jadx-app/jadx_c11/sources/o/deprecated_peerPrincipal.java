package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class deprecated_peerPrincipal {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static deprecated_followRedirects onWarmupCompleted;

    public static final deprecated_followRedirects IAuthTabCallback(@NotNull OkHttp okHttp) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(okHttp, "");
        if (onWarmupCompleted == null) {
            int i2 = onExtraCallbackWithResult + 107;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                onWarmupCompleted = deprecated_authenticator.onWarmupCompleted("icon-arrow-up-sidebar-mono");
                throw null;
            }
            onWarmupCompleted = deprecated_authenticator.onWarmupCompleted("icon-arrow-up-sidebar-mono");
        }
        deprecated_followRedirects deprecated_followredirects = onWarmupCompleted;
        Intrinsics.checkNotNull(deprecated_followredirects);
        int i3 = onNavigationEvent + 5;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return deprecated_followredirects;
        }
        throw null;
    }
}
