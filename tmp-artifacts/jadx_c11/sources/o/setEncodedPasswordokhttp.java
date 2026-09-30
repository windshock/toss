package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class setEncodedPasswordokhttp {
    private static deprecated_followRedirects onExtraCallback = null;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    public static final deprecated_followRedirects IAuthTabCallback(@NotNull OkHttp okHttp) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 125;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(okHttp, "");
        if (onExtraCallback == null) {
            onExtraCallback = deprecated_authenticator.onWarmupCompleted("icon-play-mono");
        }
        deprecated_followRedirects deprecated_followredirects = onExtraCallback;
        Intrinsics.checkNotNull(deprecated_followredirects);
        int i4 = onExtraCallbackWithResult + 25;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 93 / 0;
        }
        return deprecated_followredirects;
    }
}
