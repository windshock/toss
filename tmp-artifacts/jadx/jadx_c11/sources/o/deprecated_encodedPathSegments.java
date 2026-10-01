package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class deprecated_encodedPathSegments {
    private static deprecated_followRedirects onExtraCallback = null;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    public static final deprecated_followRedirects onExtraCallback(@NotNull OkHttp okHttp) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(okHttp, "");
        if (onExtraCallback == null) {
            int i2 = onWarmupCompleted + 93;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                onExtraCallback = deprecated_authenticator.onWarmupCompleted("icon-coin-mono");
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            onExtraCallback = deprecated_authenticator.onWarmupCompleted("icon-coin-mono");
        }
        deprecated_followRedirects deprecated_followredirects = onExtraCallback;
        Intrinsics.checkNotNull(deprecated_followredirects);
        int i3 = onWarmupCompleted + 27;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 20 / 0;
        }
        return deprecated_followredirects;
    }
}
