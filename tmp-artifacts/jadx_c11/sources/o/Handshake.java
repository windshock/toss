package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class Handshake {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static deprecated_followRedirects onNavigationEvent;

    public static final deprecated_followRedirects onExtraCallbackWithResult(@NotNull OkHttp okHttp) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 77;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(okHttp, "");
        if (onNavigationEvent == null) {
            onNavigationEvent = deprecated_authenticator.onWarmupCompleted("icon-arrow-right-up-circle");
        }
        deprecated_followRedirects deprecated_followredirects = onNavigationEvent;
        Intrinsics.checkNotNull(deprecated_followredirects);
        int i4 = onExtraCallbackWithResult + 59;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return deprecated_followredirects;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
