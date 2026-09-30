package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class addPathSegment {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    private static deprecated_followRedirects onWarmupCompleted;

    public static final deprecated_followRedirects onNavigationEvent(@NotNull OkHttp okHttp) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 33;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(okHttp, "");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(okHttp, "");
        if (onWarmupCompleted == null) {
            onWarmupCompleted = deprecated_authenticator.onWarmupCompleted("icon-navigation-x-mono");
            int i3 = onNavigationEvent + 103;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
        }
        deprecated_followRedirects deprecated_followredirects = onWarmupCompleted;
        Intrinsics.checkNotNull(deprecated_followredirects);
        int i5 = onNavigationEvent + 81;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return deprecated_followredirects;
    }
}
