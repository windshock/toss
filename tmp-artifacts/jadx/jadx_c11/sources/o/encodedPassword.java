package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class encodedPassword {
    private static deprecated_followRedirects IAuthTabCallback = null;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    public static final deprecated_followRedirects onExtraCallbackWithResult(@NotNull OkHttp okHttp) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 121;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(okHttp, "");
        if (IAuthTabCallback == null) {
            IAuthTabCallback = deprecated_authenticator.onWarmupCompleted("icon-exclamation-mono");
        }
        deprecated_followRedirects deprecated_followredirects = IAuthTabCallback;
        Intrinsics.checkNotNull(deprecated_followredirects);
        int i4 = onExtraCallbackWithResult + 65;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 0 / 0;
        }
        return deprecated_followredirects;
    }
}
