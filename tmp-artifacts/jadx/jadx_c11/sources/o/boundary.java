package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class boundary {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    private static deprecated_followRedirects onWarmupCompleted;

    public static final deprecated_followRedirects onExtraCallbackWithResult(@NotNull OkHttp okHttp) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 29;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(okHttp, "");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(okHttp, "");
        if (onWarmupCompleted == null) {
            int i3 = onExtraCallback + 49;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                onWarmupCompleted = deprecated_authenticator.onWarmupCompleted("icon-thumb-up-mono");
                int i4 = 94 / 0;
            } else {
                onWarmupCompleted = deprecated_authenticator.onWarmupCompleted("icon-thumb-up-mono");
            }
        }
        deprecated_followRedirects deprecated_followredirects = onWarmupCompleted;
        Intrinsics.checkNotNull(deprecated_followredirects);
        int i5 = onExtraCallback + 23;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return deprecated_followredirects;
    }
}
