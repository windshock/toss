package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class cacheMiss {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static deprecated_followRedirects onWarmupCompleted;

    public static final deprecated_followRedirects onNavigationEvent(@NotNull OkHttp okHttp) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 87;
        onExtraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(okHttp, "");
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(okHttp, "");
        if (onWarmupCompleted == null) {
            onWarmupCompleted = deprecated_authenticator.onWarmupCompleted("icon-account-white");
        }
        deprecated_followRedirects deprecated_followredirects = onWarmupCompleted;
        Intrinsics.checkNotNull(deprecated_followredirects);
        int i3 = onExtraCallbackWithResult + 105;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return deprecated_followredirects;
        }
        throw null;
    }
}
