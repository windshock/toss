package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class getMaxRequestsPerHost {
    private static int IAuthTabCallback = 1;
    private static deprecated_followRedirects onNavigationEvent;
    private static int onWarmupCompleted;

    public static final deprecated_followRedirects onExtraCallbackWithResult(@NotNull OkHttp okHttp) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(okHttp, "");
        if (onNavigationEvent == null) {
            int i2 = IAuthTabCallback + 105;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent = deprecated_authenticator.onWarmupCompleted("icn-bank-square-samsung");
            int i4 = onWarmupCompleted + 49;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        deprecated_followRedirects deprecated_followredirects = onNavigationEvent;
        Intrinsics.checkNotNull(deprecated_followredirects);
        return deprecated_followredirects;
    }
}
