package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class runningCalls {
    private static int IAuthTabCallback = 1;
    private static deprecated_followRedirects onExtraCallback;
    private static int onWarmupCompleted;

    public static final deprecated_followRedirects IAuthTabCallback(@NotNull OkHttp okHttp) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 63;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(okHttp, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(okHttp, "");
        if (onExtraCallback == null) {
            onExtraCallback = deprecated_authenticator.onWarmupCompleted("icn-bank-square-sc");
            int i3 = IAuthTabCallback + 25;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
        }
        deprecated_followRedirects deprecated_followredirects = onExtraCallback;
        Intrinsics.checkNotNull(deprecated_followredirects);
        return deprecated_followredirects;
    }
}
