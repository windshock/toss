package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class defaultPort {
    private static int IAuthTabCallback = 1;
    private static deprecated_followRedirects onExtraCallbackWithResult;
    private static int onNavigationEvent;

    public static final deprecated_followRedirects IAuthTabCallback(@NotNull OkHttp okHttp) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(okHttp, "");
        if (onExtraCallbackWithResult == null) {
            int i2 = onNavigationEvent + 111;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                onExtraCallbackWithResult = deprecated_authenticator.onWarmupCompleted("icon-clock");
                int i3 = 26 / 0;
            } else {
                onExtraCallbackWithResult = deprecated_authenticator.onWarmupCompleted("icon-clock");
            }
        }
        deprecated_followRedirects deprecated_followredirects = onExtraCallbackWithResult;
        Intrinsics.checkNotNull(deprecated_followredirects);
        int i4 = IAuthTabCallback + 75;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return deprecated_followredirects;
        }
        throw null;
    }
}
