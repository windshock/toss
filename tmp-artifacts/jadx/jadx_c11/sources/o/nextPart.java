package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class nextPart {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private static deprecated_followRedirects onWarmupCompleted;

    public static final deprecated_followRedirects onNavigationEvent(@NotNull OkHttp okHttp) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(okHttp, "");
        if (onWarmupCompleted == null) {
            onWarmupCompleted = deprecated_authenticator.onWarmupCompleted("icon-warning-circle-mono");
            int i2 = onNavigationEvent + 5;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
        }
        deprecated_followRedirects deprecated_followredirects = onWarmupCompleted;
        Intrinsics.checkNotNull(deprecated_followredirects);
        int i4 = onNavigationEvent + 19;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return deprecated_followredirects;
        }
        throw null;
    }
}
