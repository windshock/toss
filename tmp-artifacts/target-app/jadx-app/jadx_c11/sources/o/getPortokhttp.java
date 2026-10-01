package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class getPortokhttp {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    private static deprecated_followRedirects onNavigationEvent;

    public static final deprecated_followRedirects onExtraCallbackWithResult(@NotNull OkHttp okHttp) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 115;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(okHttp, "");
        if (onNavigationEvent == null) {
            int i4 = IAuthTabCallback + 39;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                onNavigationEvent = deprecated_authenticator.onWarmupCompleted("icon-pause-mono");
                int i5 = 36 / 0;
            } else {
                onNavigationEvent = deprecated_authenticator.onWarmupCompleted("icon-pause-mono");
            }
        }
        deprecated_followRedirects deprecated_followredirects = onNavigationEvent;
        Intrinsics.checkNotNull(deprecated_followredirects);
        int i6 = IAuthTabCallback + 47;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return deprecated_followredirects;
    }
}
