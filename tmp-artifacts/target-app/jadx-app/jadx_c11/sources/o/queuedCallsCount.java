package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class queuedCallsCount {
    private static deprecated_followRedirects IAuthTabCallback = null;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public static final deprecated_followRedirects onWarmupCompleted(@NotNull OkHttp okHttp) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 23;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(okHttp, "");
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(okHttp, "");
        if (IAuthTabCallback == null) {
            int i3 = onNavigationEvent + 97;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                IAuthTabCallback = deprecated_authenticator.onWarmupCompleted("icn-bank-square-lotte");
                obj.hashCode();
                throw null;
            }
            IAuthTabCallback = deprecated_authenticator.onWarmupCompleted("icn-bank-square-lotte");
        }
        deprecated_followRedirects deprecated_followredirects = IAuthTabCallback;
        Intrinsics.checkNotNull(deprecated_followredirects);
        return deprecated_followredirects;
    }
}
