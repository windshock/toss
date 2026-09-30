package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class responseFailed {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    private static deprecated_followRedirects onExtraCallbackWithResult;

    public static final deprecated_followRedirects onWarmupCompleted(@NotNull OkHttp okHttp) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(okHttp, "");
        if (onExtraCallbackWithResult == null) {
            int i2 = IAuthTabCallback + 43;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                onExtraCallbackWithResult = deprecated_authenticator.onWarmupCompleted("icon-arrow-down-thin-mono");
                throw null;
            }
            onExtraCallbackWithResult = deprecated_authenticator.onWarmupCompleted("icon-arrow-down-thin-mono");
        }
        deprecated_followRedirects deprecated_followredirects = onExtraCallbackWithResult;
        Intrinsics.checkNotNull(deprecated_followredirects);
        int i3 = onExtraCallback + 9;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return deprecated_followredirects;
    }
}
