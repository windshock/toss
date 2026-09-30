package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class setMaxRequestsPerHost {
    private static deprecated_followRedirects IAuthTabCallback = null;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    public static final deprecated_followRedirects onNavigationEvent(@NotNull OkHttp okHttp) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 45;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(okHttp, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(okHttp, "");
        if (IAuthTabCallback == null) {
            int i3 = onNavigationEvent + 71;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            IAuthTabCallback = deprecated_authenticator.onWarmupCompleted("icn-bank-square-shinhan");
        }
        deprecated_followRedirects deprecated_followredirects = IAuthTabCallback;
        Intrinsics.checkNotNull(deprecated_followredirects);
        int i5 = onExtraCallbackWithResult + 95;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return deprecated_followredirects;
    }
}
