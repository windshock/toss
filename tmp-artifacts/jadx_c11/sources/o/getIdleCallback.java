package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class getIdleCallback {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static deprecated_followRedirects onWarmupCompleted;

    public static final deprecated_followRedirects onExtraCallbackWithResult(@NotNull OkHttp okHttp) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 77;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(okHttp, "");
        if (onWarmupCompleted == null) {
            onWarmupCompleted = deprecated_authenticator.onWarmupCompleted("icn-bank-square-nh");
        }
        deprecated_followRedirects deprecated_followredirects = onWarmupCompleted;
        Intrinsics.checkNotNull(deprecated_followredirects);
        int i4 = onExtraCallbackWithResult + 123;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 25 / 0;
        }
        return deprecated_followredirects;
    }
}
