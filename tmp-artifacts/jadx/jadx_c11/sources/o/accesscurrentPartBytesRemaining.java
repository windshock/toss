package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class accesscurrentPartBytesRemaining {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    private static deprecated_followRedirects onWarmupCompleted;

    public static final deprecated_followRedirects onExtraCallback(@NotNull OkHttp okHttp) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 29;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(okHttp, "");
        if (onWarmupCompleted == null) {
            int i4 = onExtraCallback + 87;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            onWarmupCompleted = deprecated_authenticator.onWarmupCompleted("icon-warning-circle");
        }
        deprecated_followRedirects deprecated_followredirects = onWarmupCompleted;
        Intrinsics.checkNotNull(deprecated_followredirects);
        int i6 = IAuthTabCallback + 69;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return deprecated_followredirects;
    }
}
