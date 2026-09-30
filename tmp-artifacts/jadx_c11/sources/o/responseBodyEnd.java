package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class responseBodyEnd {
    private static deprecated_followRedirects IAuthTabCallback = null;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    public static final deprecated_followRedirects IAuthTabCallback(@NotNull OkHttp okHttp) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 123;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(okHttp, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(okHttp, "");
        if (IAuthTabCallback == null) {
            IAuthTabCallback = deprecated_authenticator.onWarmupCompleted("icon-arrow-down-sidebar-mono");
            int i3 = onExtraCallbackWithResult + 67;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
        }
        deprecated_followRedirects deprecated_followredirects = IAuthTabCallback;
        Intrinsics.checkNotNull(deprecated_followredirects);
        int i5 = onWarmupCompleted + 83;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return deprecated_followredirects;
        }
        throw null;
    }
}
