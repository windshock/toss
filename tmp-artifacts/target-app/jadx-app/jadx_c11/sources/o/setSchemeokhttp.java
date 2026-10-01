package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class setSchemeokhttp {
    private static int onExtraCallback = 1;
    private static deprecated_followRedirects onExtraCallbackWithResult;
    private static int onNavigationEvent;

    public static final deprecated_followRedirects IAuthTabCallback(@NotNull OkHttp okHttp) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 61;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(okHttp, "");
        if (onExtraCallbackWithResult == null) {
            int i4 = onNavigationEvent + 95;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                onExtraCallbackWithResult = deprecated_authenticator.onWarmupCompleted("icon-plus-thin-mono");
                int i5 = 49 / 0;
            } else {
                onExtraCallbackWithResult = deprecated_authenticator.onWarmupCompleted("icon-plus-thin-mono");
            }
        }
        deprecated_followRedirects deprecated_followredirects = onExtraCallbackWithResult;
        Intrinsics.checkNotNull(deprecated_followredirects);
        int i6 = onExtraCallback + 83;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 16 / 0;
        }
        return deprecated_followredirects;
    }
}
