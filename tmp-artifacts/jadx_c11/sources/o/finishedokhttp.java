package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class finishedokhttp {
    private static deprecated_followRedirects IAuthTabCallback = null;
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;

    public static final deprecated_followRedirects onExtraCallback(@NotNull OkHttp okHttp) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(okHttp, "");
        if (IAuthTabCallback == null) {
            int i2 = onExtraCallback + 83;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                IAuthTabCallback = deprecated_authenticator.onWarmupCompleted("icn-bank-googlepay");
                int i3 = 4 / 0;
            } else {
                IAuthTabCallback = deprecated_authenticator.onWarmupCompleted("icn-bank-googlepay");
            }
            int i4 = onWarmupCompleted + 89;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        deprecated_followRedirects deprecated_followredirects = IAuthTabCallback;
        Intrinsics.checkNotNull(deprecated_followredirects);
        return deprecated_followredirects;
    }
}
