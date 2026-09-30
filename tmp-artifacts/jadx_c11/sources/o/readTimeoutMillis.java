package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class readTimeoutMillis {
    private static int onExtraCallbackWithResult = 1;
    private static deprecated_followRedirects onNavigationEvent;
    private static int onWarmupCompleted;

    public static final deprecated_followRedirects onNavigationEvent(@NotNull OkHttp okHttp) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 51;
        onExtraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(okHttp, "");
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(okHttp, "");
        if (onNavigationEvent == null) {
            onNavigationEvent = deprecated_authenticator.onWarmupCompleted("icon-shield-check-fill");
        }
        deprecated_followRedirects deprecated_followredirects = onNavigationEvent;
        Intrinsics.checkNotNull(deprecated_followredirects);
        int i3 = onWarmupCompleted + 83;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return deprecated_followredirects;
        }
        obj.hashCode();
        throw null;
    }
}
