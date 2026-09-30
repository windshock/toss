package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class HandshakeCompanion {
    private static deprecated_followRedirects IAuthTabCallback = null;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    public static final deprecated_followRedirects onNavigationEvent(@NotNull OkHttp okHttp) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 5;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(okHttp, "");
        if (IAuthTabCallback == null) {
            int i4 = onNavigationEvent + 125;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            IAuthTabCallback = deprecated_authenticator.onWarmupCompleted("icon-call-green");
        }
        deprecated_followRedirects deprecated_followredirects = IAuthTabCallback;
        Intrinsics.checkNotNull(deprecated_followredirects);
        return deprecated_followredirects;
    }
}
