package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class MultipartBody {
    private static deprecated_followRedirects IAuthTabCallback = null;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;

    public static final deprecated_followRedirects onExtraCallbackWithResult(@NotNull OkHttp okHttp) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(okHttp, "");
        if (IAuthTabCallback == null) {
            int i2 = onNavigationEvent + 119;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                IAuthTabCallback = deprecated_authenticator.onWarmupCompleted("icon-sun-2-mono");
                int i3 = 89 / 0;
            } else {
                IAuthTabCallback = deprecated_authenticator.onWarmupCompleted("icon-sun-2-mono");
            }
        }
        deprecated_followRedirects deprecated_followredirects = IAuthTabCallback;
        Intrinsics.checkNotNull(deprecated_followredirects);
        int i4 = onExtraCallback + 45;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return deprecated_followredirects;
        }
        throw null;
    }
}
