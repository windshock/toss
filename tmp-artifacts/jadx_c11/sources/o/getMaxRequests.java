package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class getMaxRequests {
    private static deprecated_followRedirects IAuthTabCallback = null;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;

    public static final deprecated_followRedirects IAuthTabCallback(@NotNull OkHttp okHttp) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 29;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(okHttp, "");
        if (IAuthTabCallback == null) {
            int i4 = onNavigationEvent + 5;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            IAuthTabCallback = deprecated_authenticator.onWarmupCompleted("icn-bank-square-ibk");
        }
        deprecated_followRedirects deprecated_followredirects = IAuthTabCallback;
        Intrinsics.checkNotNull(deprecated_followredirects);
        int i6 = onNavigationEvent + 3;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return deprecated_followredirects;
    }
}
