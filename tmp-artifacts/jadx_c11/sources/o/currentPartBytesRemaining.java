package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class currentPartBytesRemaining {
    private static int onExtraCallback = 0;
    private static deprecated_followRedirects onNavigationEvent = null;
    private static int onWarmupCompleted = 1;

    public static final deprecated_followRedirects onNavigationEvent(@NotNull OkHttp okHttp) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 47;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(okHttp, "");
        if (onNavigationEvent == null) {
            int i4 = onWarmupCompleted + 91;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                onNavigationEvent = deprecated_authenticator.onWarmupCompleted("icon-warning-triangle-mono");
                throw null;
            }
            onNavigationEvent = deprecated_authenticator.onWarmupCompleted("icon-warning-triangle-mono");
            int i5 = onExtraCallback + 39;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
        }
        deprecated_followRedirects deprecated_followredirects = onNavigationEvent;
        Intrinsics.checkNotNull(deprecated_followredirects);
        return deprecated_followredirects;
    }
}
