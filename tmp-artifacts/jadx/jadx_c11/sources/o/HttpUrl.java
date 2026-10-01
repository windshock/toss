package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class HttpUrl {
    private static deprecated_followRedirects IAuthTabCallback = null;
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;

    public static final deprecated_followRedirects onExtraCallback(@NotNull OkHttp okHttp) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 109;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(okHttp, "");
        if (IAuthTabCallback == null) {
            int i4 = onExtraCallback + 69;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                IAuthTabCallback = deprecated_authenticator.onWarmupCompleted("icon-chip-arrow-down-mono");
                int i5 = 36 / 0;
            } else {
                IAuthTabCallback = deprecated_authenticator.onWarmupCompleted("icon-chip-arrow-down-mono");
            }
        }
        deprecated_followRedirects deprecated_followredirects = IAuthTabCallback;
        Intrinsics.checkNotNull(deprecated_followredirects);
        int i6 = onWarmupCompleted + 93;
        onExtraCallback = i6 % 128;
        if (i6 % 2 != 0) {
            return deprecated_followredirects;
        }
        throw null;
    }
}
