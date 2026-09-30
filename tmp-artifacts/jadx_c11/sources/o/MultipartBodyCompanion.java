package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class MultipartBodyCompanion {
    private static int onExtraCallback = 0;
    private static deprecated_followRedirects onNavigationEvent = null;
    private static int onWarmupCompleted = 1;

    public static final deprecated_followRedirects onNavigationEvent(@NotNull OkHttp okHttp) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 15;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(okHttp, "");
        if (onNavigationEvent == null) {
            int i4 = onExtraCallback + 91;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            onNavigationEvent = deprecated_authenticator.onWarmupCompleted("icon-tossbank");
        }
        deprecated_followRedirects deprecated_followredirects = onNavigationEvent;
        Intrinsics.checkNotNull(deprecated_followredirects);
        int i6 = onWarmupCompleted + 29;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return deprecated_followredirects;
    }
}
