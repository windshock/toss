package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class deprecated_localPrincipal {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static deprecated_followRedirects onExtraCallbackWithResult;

    public static final deprecated_followRedirects onExtraCallback(@NotNull OkHttp okHttp) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 89;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(okHttp, "");
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(okHttp, "");
        if (onExtraCallbackWithResult == null) {
            onExtraCallbackWithResult = deprecated_authenticator.onWarmupCompleted("icon-arrow-up-limit-mono");
        }
        deprecated_followRedirects deprecated_followredirects = onExtraCallbackWithResult;
        Intrinsics.checkNotNull(deprecated_followredirects);
        int i3 = IAuthTabCallback + 27;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return deprecated_followredirects;
        }
        throw null;
    }
}
