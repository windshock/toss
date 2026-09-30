package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class queryParameterValues {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static deprecated_followRedirects onNavigationEvent;

    public static final deprecated_followRedirects onExtraCallbackWithResult(@NotNull OkHttp okHttp) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 27;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(okHttp, "");
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(okHttp, "");
        if (onNavigationEvent == null) {
            onNavigationEvent = deprecated_authenticator.onWarmupCompleted("icon-id-foreigner-card");
        }
        deprecated_followRedirects deprecated_followredirects = onNavigationEvent;
        Intrinsics.checkNotNull(deprecated_followredirects);
        int i3 = IAuthTabCallback + 21;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return deprecated_followredirects;
        }
        throw null;
    }
}
