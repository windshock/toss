package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class OkHttpClient {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static deprecated_followRedirects onWarmupCompleted;

    public static final deprecated_followRedirects onExtraCallback(@NotNull OkHttp okHttp) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 41;
        IAuthTabCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(okHttp, "");
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(okHttp, "");
        if (onWarmupCompleted == null) {
            onWarmupCompleted = deprecated_authenticator.onWarmupCompleted("icon-x-mono");
        }
        deprecated_followRedirects deprecated_followredirects = onWarmupCompleted;
        Intrinsics.checkNotNull(deprecated_followredirects);
        int i3 = onExtraCallbackWithResult + 83;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return deprecated_followredirects;
        }
        obj.hashCode();
        throw null;
    }
}
