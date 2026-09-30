package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class queuedCalls {
    private static deprecated_followRedirects IAuthTabCallback = null;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;

    public static final deprecated_followRedirects onExtraCallbackWithResult(@NotNull OkHttp okHttp) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 47;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(okHttp, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(okHttp, "");
        if (IAuthTabCallback == null) {
            int i3 = onExtraCallback + 21;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                IAuthTabCallback = deprecated_authenticator.onWarmupCompleted("icn-bank-square-kb");
                obj.hashCode();
                throw null;
            }
            IAuthTabCallback = deprecated_authenticator.onWarmupCompleted("icn-bank-square-kb");
        }
        deprecated_followRedirects deprecated_followredirects = IAuthTabCallback;
        Intrinsics.checkNotNull(deprecated_followredirects);
        return deprecated_followredirects;
    }
}
