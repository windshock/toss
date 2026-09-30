package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class accessportColonOffset {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    private static deprecated_followRedirects onNavigationEvent;

    public static final deprecated_followRedirects onWarmupCompleted(@NotNull OkHttp okHttp) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 99;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(okHttp, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(okHttp, "");
        if (onNavigationEvent == null) {
            int i3 = onExtraCallbackWithResult + 59;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            onNavigationEvent = deprecated_authenticator.onWarmupCompleted("icon-question-primary-blue");
        }
        deprecated_followRedirects deprecated_followredirects = onNavigationEvent;
        Intrinsics.checkNotNull(deprecated_followredirects);
        return deprecated_followredirects;
    }
}
