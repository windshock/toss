package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class finished {
    private static int IAuthTabCallback = 1;
    private static deprecated_followRedirects onNavigationEvent;
    private static int onWarmupCompleted;

    public static final deprecated_followRedirects onExtraCallbackWithResult(@NotNull OkHttp okHttp) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 59;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(okHttp, "");
        if (onNavigationEvent == null) {
            int i4 = IAuthTabCallback + 89;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                onNavigationEvent = deprecated_authenticator.onWarmupCompleted("icn-bank-fill-nh");
                int i5 = 92 / 0;
            } else {
                onNavigationEvent = deprecated_authenticator.onWarmupCompleted("icn-bank-fill-nh");
            }
            int i6 = onWarmupCompleted + 59;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
        }
        deprecated_followRedirects deprecated_followredirects = onNavigationEvent;
        Intrinsics.checkNotNull(deprecated_followredirects);
        return deprecated_followredirects;
    }
}
