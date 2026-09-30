package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class FormBodyBuilder {
    private static int onExtraCallback = 1;
    private static deprecated_followRedirects onExtraCallbackWithResult;
    private static int onNavigationEvent;

    public static final deprecated_followRedirects onNavigationEvent(@NotNull OkHttp okHttp) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(okHttp, "");
        if (onExtraCallbackWithResult == null) {
            onExtraCallbackWithResult = deprecated_authenticator.onWarmupCompleted("icon-arrow-up-2-mono");
            int i2 = onExtraCallback + 45;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
        }
        deprecated_followRedirects deprecated_followredirects = onExtraCallbackWithResult;
        Intrinsics.checkNotNull(deprecated_followredirects);
        int i4 = onExtraCallback + 65;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return deprecated_followredirects;
        }
        throw null;
    }
}
