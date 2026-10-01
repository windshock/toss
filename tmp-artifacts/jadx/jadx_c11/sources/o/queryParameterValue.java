package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class queryParameterValue {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    private static deprecated_followRedirects onWarmupCompleted;

    public static final deprecated_followRedirects onExtraCallback(@NotNull OkHttp okHttp) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 67;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(okHttp, "");
        if (onWarmupCompleted == null) {
            int i4 = IAuthTabCallback + 47;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            onWarmupCompleted = deprecated_authenticator.onWarmupCompleted("icon-id-card");
        }
        deprecated_followRedirects deprecated_followredirects = onWarmupCompleted;
        Intrinsics.checkNotNull(deprecated_followredirects);
        int i6 = IAuthTabCallback + 117;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 34 / 0;
        }
        return deprecated_followredirects;
    }
}
