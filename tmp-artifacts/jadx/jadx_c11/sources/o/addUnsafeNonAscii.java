package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class addUnsafeNonAscii {
    private static int IAuthTabCallback = 0;
    private static deprecated_followRedirects onExtraCallbackWithResult = null;
    private static int onNavigationEvent = 1;

    public static final deprecated_followRedirects onExtraCallback(@NotNull OkHttp okHttp) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(okHttp, "");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(okHttp, "");
        if (onExtraCallbackWithResult == null) {
            int i3 = IAuthTabCallback + 113;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                onExtraCallbackWithResult = deprecated_authenticator.onWarmupCompleted("icon-check-large-mono");
                int i4 = 59 / 0;
            } else {
                onExtraCallbackWithResult = deprecated_authenticator.onWarmupCompleted("icon-check-large-mono");
            }
        }
        deprecated_followRedirects deprecated_followredirects = onExtraCallbackWithResult;
        Intrinsics.checkNotNull(deprecated_followredirects);
        return deprecated_followredirects;
    }
}
