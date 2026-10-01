package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class responseBodyStart {
    private static int IAuthTabCallback = 0;
    private static deprecated_followRedirects onExtraCallbackWithResult = null;
    private static int onNavigationEvent = 1;

    public static final deprecated_followRedirects onWarmupCompleted(@NotNull OkHttp okHttp) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 83;
        IAuthTabCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(okHttp, "");
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(okHttp, "");
        if (onExtraCallbackWithResult == null) {
            int i3 = IAuthTabCallback + 37;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                onExtraCallbackWithResult = deprecated_authenticator.onWarmupCompleted("icon-arrow-decrease");
                throw null;
            }
            onExtraCallbackWithResult = deprecated_authenticator.onWarmupCompleted("icon-arrow-decrease");
        }
        deprecated_followRedirects deprecated_followredirects = onExtraCallbackWithResult;
        Intrinsics.checkNotNull(deprecated_followredirects);
        return deprecated_followredirects;
    }
}
