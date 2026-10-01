package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class addPathSegments {
    private static deprecated_followRedirects onExtraCallback = null;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public static final deprecated_followRedirects onExtraCallback(@NotNull OkHttp okHttp) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(okHttp, "");
        if (onExtraCallback == null) {
            int i2 = onWarmupCompleted + 43;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                onExtraCallback = deprecated_authenticator.onWarmupCompleted("icon-line-three-dots-reddot");
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            onExtraCallback = deprecated_authenticator.onWarmupCompleted("icon-line-three-dots-reddot");
            int i3 = onNavigationEvent + 53;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
        }
        deprecated_followRedirects deprecated_followredirects = onExtraCallback;
        Intrinsics.checkNotNull(deprecated_followredirects);
        return deprecated_followredirects;
    }
}
