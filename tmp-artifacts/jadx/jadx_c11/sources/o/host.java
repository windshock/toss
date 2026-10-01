package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class host {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static deprecated_followRedirects onWarmupCompleted;

    public static final deprecated_followRedirects onWarmupCompleted(@NotNull OkHttp okHttp) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 43;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(okHttp, "");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(okHttp, "");
        if (onWarmupCompleted == null) {
            int i3 = onExtraCallbackWithResult + 71;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            onWarmupCompleted = deprecated_authenticator.onWarmupCompleted("icon-flag-krw");
            int i5 = onNavigationEvent + 63;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
        }
        deprecated_followRedirects deprecated_followredirects = onWarmupCompleted;
        Intrinsics.checkNotNull(deprecated_followredirects);
        return deprecated_followredirects;
    }
}
