package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class isDot {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static deprecated_followRedirects onNavigationEvent;

    public static final deprecated_followRedirects onExtraCallback(@NotNull OkHttp okHttp) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 35;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(okHttp, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(okHttp, "");
        if (onNavigationEvent == null) {
            onNavigationEvent = deprecated_authenticator.onWarmupCompleted("icon-lock");
        }
        deprecated_followRedirects deprecated_followredirects = onNavigationEvent;
        Intrinsics.checkNotNull(deprecated_followredirects);
        int i3 = onExtraCallback + 19;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return deprecated_followredirects;
    }
}
