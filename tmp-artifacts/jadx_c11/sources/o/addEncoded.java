package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class addEncoded {
    private static int IAuthTabCallback = 1;
    private static deprecated_followRedirects onExtraCallback;
    private static int onExtraCallbackWithResult;

    public static final deprecated_followRedirects onNavigationEvent(@NotNull OkHttp okHttp) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(okHttp, "");
        if (onExtraCallback == null) {
            int i2 = IAuthTabCallback + 93;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback = deprecated_authenticator.onWarmupCompleted("icon-arrow-up-down-mono");
            int i4 = onExtraCallbackWithResult + 87;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        deprecated_followRedirects deprecated_followredirects = onExtraCallback;
        Intrinsics.checkNotNull(deprecated_followredirects);
        return deprecated_followredirects;
    }
}
