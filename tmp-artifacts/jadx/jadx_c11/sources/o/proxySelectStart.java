package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class proxySelectStart {
    private static deprecated_followRedirects IAuthTabCallback = null;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;

    public static final deprecated_followRedirects onExtraCallbackWithResult(@NotNull OkHttp okHttp) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 43;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(okHttp, "");
        if (IAuthTabCallback == null) {
            int i4 = onExtraCallback + 53;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                IAuthTabCallback = deprecated_authenticator.onWarmupCompleted("icon-android-fill");
                int i5 = 41 / 0;
            } else {
                IAuthTabCallback = deprecated_authenticator.onWarmupCompleted("icon-android-fill");
            }
        }
        deprecated_followRedirects deprecated_followredirects = IAuthTabCallback;
        Intrinsics.checkNotNull(deprecated_followredirects);
        return deprecated_followredirects;
    }
}
