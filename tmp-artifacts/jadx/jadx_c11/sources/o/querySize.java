package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class querySize {
    private static deprecated_followRedirects IAuthTabCallback = null;
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;

    public static final deprecated_followRedirects onExtraCallback(@NotNull OkHttp okHttp) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 59;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(okHttp, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(okHttp, "");
        if (IAuthTabCallback == null) {
            IAuthTabCallback = deprecated_authenticator.onWarmupCompleted("icon-info-circle-line-mono");
            int i3 = onWarmupCompleted + 13;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
        }
        deprecated_followRedirects deprecated_followredirects = IAuthTabCallback;
        Intrinsics.checkNotNull(deprecated_followredirects);
        return deprecated_followredirects;
    }
}
