package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class accesscheckName {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static deprecated_followRedirects onNavigationEvent;

    public static final deprecated_followRedirects onExtraCallback(@NotNull OkHttp okHttp) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 69;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(okHttp, "");
        if (onNavigationEvent == null) {
            int i4 = onExtraCallback + 63;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            onNavigationEvent = deprecated_authenticator.onWarmupCompleted("icon-check-circle-green");
        }
        deprecated_followRedirects deprecated_followredirects = onNavigationEvent;
        Intrinsics.checkNotNull(deprecated_followredirects);
        return deprecated_followredirects;
    }
}
