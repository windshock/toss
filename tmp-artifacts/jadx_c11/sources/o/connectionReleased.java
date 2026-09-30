package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class connectionReleased {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    private static deprecated_followRedirects onWarmupCompleted;

    public static final deprecated_followRedirects IAuthTabCallback(@NotNull OkHttp okHttp) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 111;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(okHttp, "");
        if (onWarmupCompleted == null) {
            int i4 = IAuthTabCallback + 47;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            onWarmupCompleted = deprecated_authenticator.onWarmupCompleted("icon-arm-muscle-fill");
        }
        deprecated_followRedirects deprecated_followredirects = onWarmupCompleted;
        Intrinsics.checkNotNull(deprecated_followredirects);
        return deprecated_followredirects;
    }
}
