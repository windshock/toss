package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class peerPrincipal {
    private static deprecated_followRedirects onExtraCallback = null;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    public static final deprecated_followRedirects onExtraCallback(@NotNull OkHttp okHttp) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 45;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(okHttp, "");
        if (onExtraCallback == null) {
            int i4 = onExtraCallbackWithResult + 7;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                onExtraCallback = deprecated_authenticator.onWarmupCompleted("icon-car-new");
                int i5 = 85 / 0;
            } else {
                onExtraCallback = deprecated_authenticator.onWarmupCompleted("icon-car-new");
            }
        }
        deprecated_followRedirects deprecated_followredirects = onExtraCallback;
        Intrinsics.checkNotNull(deprecated_followredirects);
        return deprecated_followredirects;
    }
}
