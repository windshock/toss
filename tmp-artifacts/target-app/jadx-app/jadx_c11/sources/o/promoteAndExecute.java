package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class promoteAndExecute {
    private static deprecated_followRedirects onExtraCallback = null;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public static final deprecated_followRedirects onWarmupCompleted(@NotNull OkHttp okHttp) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 83;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(okHttp, "");
        if (onExtraCallback == null) {
            int i4 = onWarmupCompleted + 79;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                onExtraCallback = deprecated_authenticator.onWarmupCompleted("icn-bank-fill-bc");
                int i5 = 99 / 0;
            } else {
                onExtraCallback = deprecated_authenticator.onWarmupCompleted("icn-bank-fill-bc");
            }
        }
        deprecated_followRedirects deprecated_followredirects = onExtraCallback;
        Intrinsics.checkNotNull(deprecated_followredirects);
        return deprecated_followredirects;
    }
}
