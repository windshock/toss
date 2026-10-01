package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class schemeDelimiterOffset {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    private static deprecated_followRedirects onWarmupCompleted;

    public static final deprecated_followRedirects onWarmupCompleted(@NotNull OkHttp okHttp) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 69;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(okHttp, "");
        if (onWarmupCompleted == null) {
            int i4 = IAuthTabCallback + 111;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                onWarmupCompleted = deprecated_authenticator.onWarmupCompleted("icon-refresh-mono");
                throw null;
            }
            onWarmupCompleted = deprecated_authenticator.onWarmupCompleted("icon-refresh-mono");
        }
        deprecated_followRedirects deprecated_followredirects = onWarmupCompleted;
        Intrinsics.checkNotNull(deprecated_followredirects);
        int i5 = IAuthTabCallback + 83;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return deprecated_followredirects;
    }
}
