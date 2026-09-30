package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class port {
    private static deprecated_followRedirects IAuthTabCallback = null;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public static final deprecated_followRedirects IAuthTabCallback(@NotNull OkHttp okHttp) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 23;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(okHttp, "");
        if (IAuthTabCallback == null) {
            IAuthTabCallback = deprecated_authenticator.onWarmupCompleted("icon-home-blue");
            int i4 = onNavigationEvent + 79;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        }
        deprecated_followRedirects deprecated_followredirects = IAuthTabCallback;
        Intrinsics.checkNotNull(deprecated_followredirects);
        return deprecated_followredirects;
    }
}
