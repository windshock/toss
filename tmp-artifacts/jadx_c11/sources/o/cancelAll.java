package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class cancelAll {
    private static int IAuthTabCallback = 0;
    private static deprecated_followRedirects onExtraCallbackWithResult = null;
    private static int onWarmupCompleted = 1;

    public static final deprecated_followRedirects onNavigationEvent(@NotNull OkHttp okHttp) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 57;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(okHttp, "");
        if (onExtraCallbackWithResult == null) {
            int i4 = IAuthTabCallback + 3;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            onExtraCallbackWithResult = deprecated_authenticator.onWarmupCompleted("icn-bank-square-hyundaicard");
        }
        deprecated_followRedirects deprecated_followredirects = onExtraCallbackWithResult;
        Intrinsics.checkNotNull(deprecated_followredirects);
        return deprecated_followredirects;
    }
}
