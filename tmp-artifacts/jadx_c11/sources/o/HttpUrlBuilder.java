package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class HttpUrlBuilder {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    private static deprecated_followRedirects onWarmupCompleted;

    public static final deprecated_followRedirects onNavigationEvent(@NotNull OkHttp okHttp) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(okHttp, "");
        if (onWarmupCompleted == null) {
            int i2 = onNavigationEvent + 101;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                onWarmupCompleted = deprecated_authenticator.onWarmupCompleted("icon-kakaotalk-fill");
                int i3 = 21 / 0;
            } else {
                onWarmupCompleted = deprecated_authenticator.onWarmupCompleted("icon-kakaotalk-fill");
            }
        }
        deprecated_followRedirects deprecated_followredirects = onWarmupCompleted;
        Intrinsics.checkNotNull(deprecated_followredirects);
        int i4 = IAuthTabCallback + 19;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return deprecated_followredirects;
    }
}
