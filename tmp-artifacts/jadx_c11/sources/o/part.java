package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class part {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    private static deprecated_followRedirects onWarmupCompleted;

    public static final deprecated_followRedirects IAuthTabCallback(@NotNull OkHttp okHttp) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 45;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(okHttp, "");
        if (onWarmupCompleted == null) {
            int i4 = IAuthTabCallback + 53;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                onWarmupCompleted = deprecated_authenticator.onWarmupCompleted("icon-thumb-down-mono");
                int i5 = 16 / 0;
            } else {
                onWarmupCompleted = deprecated_authenticator.onWarmupCompleted("icon-thumb-down-mono");
            }
        }
        deprecated_followRedirects deprecated_followredirects = onWarmupCompleted;
        Intrinsics.checkNotNull(deprecated_followredirects);
        return deprecated_followredirects;
    }
}
