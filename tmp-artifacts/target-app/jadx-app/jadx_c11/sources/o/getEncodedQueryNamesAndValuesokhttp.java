package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class getEncodedQueryNamesAndValuesokhttp {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static deprecated_followRedirects onWarmupCompleted;

    public static final deprecated_followRedirects IAuthTabCallback(@NotNull OkHttp okHttp) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 31;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(okHttp, "");
        if (onWarmupCompleted == null) {
            int i4 = onNavigationEvent + 101;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            onWarmupCompleted = deprecated_authenticator.onWarmupCompleted("icon-open-chat-slash-mono");
        }
        deprecated_followRedirects deprecated_followredirects = onWarmupCompleted;
        Intrinsics.checkNotNull(deprecated_followredirects);
        return deprecated_followredirects;
    }
}
