package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class accessparsePort {
    private static deprecated_followRedirects IAuthTabCallback = null;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;

    public static final deprecated_followRedirects onExtraCallback(@NotNull OkHttp okHttp) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 71;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(okHttp, "");
        if (IAuthTabCallback == null) {
            int i4 = onNavigationEvent + 37;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            IAuthTabCallback = deprecated_authenticator.onWarmupCompleted("icon-question-circle");
        }
        deprecated_followRedirects deprecated_followredirects = IAuthTabCallback;
        Intrinsics.checkNotNull(deprecated_followredirects);
        int i6 = onNavigationEvent + 17;
        onExtraCallback = i6 % 128;
        if (i6 % 2 != 0) {
            return deprecated_followredirects;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
