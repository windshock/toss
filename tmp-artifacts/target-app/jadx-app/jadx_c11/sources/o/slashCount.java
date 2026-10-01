package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class slashCount {
    private static int IAuthTabCallback = 1;
    private static deprecated_followRedirects onExtraCallback;
    private static int onNavigationEvent;

    public static final deprecated_followRedirects IAuthTabCallback(@NotNull OkHttp okHttp) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(okHttp, "");
        if (onExtraCallback == null) {
            int i2 = IAuthTabCallback + 93;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                onExtraCallback = deprecated_authenticator.onWarmupCompleted("icon-robot");
                throw null;
            }
            onExtraCallback = deprecated_authenticator.onWarmupCompleted("icon-robot");
        }
        deprecated_followRedirects deprecated_followredirects = onExtraCallback;
        Intrinsics.checkNotNull(deprecated_followredirects);
        int i3 = onNavigationEvent + 65;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return deprecated_followredirects;
    }
}
