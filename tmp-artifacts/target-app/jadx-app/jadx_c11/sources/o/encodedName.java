package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class encodedName {
    private static deprecated_followRedirects onExtraCallbackWithResult = null;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public static final deprecated_followRedirects onExtraCallback(@NotNull OkHttp okHttp) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 9;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(okHttp, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(okHttp, "");
        if (onExtraCallbackWithResult == null) {
            int i3 = onNavigationEvent + 55;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            onExtraCallbackWithResult = deprecated_authenticator.onWarmupCompleted("icon-arrow-right-sidebar-mono");
            int i5 = onWarmupCompleted + 45;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
        }
        deprecated_followRedirects deprecated_followredirects = onExtraCallbackWithResult;
        Intrinsics.checkNotNull(deprecated_followredirects);
        return deprecated_followredirects;
    }
}
