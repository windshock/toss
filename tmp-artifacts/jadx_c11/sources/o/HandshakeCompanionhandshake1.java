package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class HandshakeCompanionhandshake1 {
    private static int IAuthTabCallback = 0;
    private static deprecated_followRedirects onExtraCallback = null;
    private static int onWarmupCompleted = 1;

    public static final deprecated_followRedirects onExtraCallback(@NotNull OkHttp okHttp) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 89;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(okHttp, "");
        if (onExtraCallback == null) {
            onExtraCallback = deprecated_authenticator.onWarmupCompleted("icon-card-search");
        }
        deprecated_followRedirects deprecated_followredirects = onExtraCallback;
        Intrinsics.checkNotNull(deprecated_followredirects);
        int i4 = onWarmupCompleted + 91;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return deprecated_followredirects;
        }
        throw null;
    }
}
