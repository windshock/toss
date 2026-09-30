package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class setQueryParameter {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private static deprecated_followRedirects onWarmupCompleted;

    public static final deprecated_followRedirects onNavigationEvent(@NotNull OkHttp okHttp) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 123;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(okHttp, "");
        if (onWarmupCompleted == null) {
            int i4 = onExtraCallback + 15;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                onWarmupCompleted = deprecated_authenticator.onWarmupCompleted("icon-point-circle-mono");
                throw null;
            }
            onWarmupCompleted = deprecated_authenticator.onWarmupCompleted("icon-point-circle-mono");
        }
        deprecated_followRedirects deprecated_followredirects = onWarmupCompleted;
        Intrinsics.checkNotNull(deprecated_followredirects);
        int i5 = onNavigationEvent + 45;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return deprecated_followredirects;
        }
        throw null;
    }
}
