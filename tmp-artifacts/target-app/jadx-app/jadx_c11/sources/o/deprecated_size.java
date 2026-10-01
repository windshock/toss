package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class deprecated_size {
    private static deprecated_followRedirects IAuthTabCallback = null;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public static final deprecated_followRedirects onExtraCallbackWithResult(@NotNull OkHttp okHttp) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(okHttp, "");
        if (IAuthTabCallback == null) {
            IAuthTabCallback = deprecated_authenticator.onWarmupCompleted("icon-arrow-right-down-circle");
            int i2 = onWarmupCompleted + 1;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 4 % 4;
            }
        }
        deprecated_followRedirects deprecated_followredirects = IAuthTabCallback;
        Intrinsics.checkNotNull(deprecated_followredirects);
        int i4 = onNavigationEvent + 99;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return deprecated_followredirects;
    }
}
