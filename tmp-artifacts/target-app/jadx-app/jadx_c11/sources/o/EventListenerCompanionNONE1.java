package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class EventListenerCompanionNONE1 {
    private static deprecated_followRedirects onExtraCallback = null;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    public static final deprecated_followRedirects onExtraCallback(@NotNull OkHttp okHttp) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 11;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(okHttp, "");
        if (onExtraCallback == null) {
            onExtraCallback = deprecated_authenticator.onWarmupCompleted("icon-arrow-left-small");
        }
        deprecated_followRedirects deprecated_followredirects = onExtraCallback;
        Intrinsics.checkNotNull(deprecated_followredirects);
        int i4 = onWarmupCompleted + 113;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return deprecated_followredirects;
    }
}
