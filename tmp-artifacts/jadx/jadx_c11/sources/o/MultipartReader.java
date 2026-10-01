package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class MultipartReader {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static deprecated_followRedirects onWarmupCompleted;

    public static final deprecated_followRedirects onExtraCallback(@NotNull OkHttp okHttp) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 51;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(okHttp, "");
        if (onWarmupCompleted == null) {
            int i4 = onExtraCallback + 25;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                onWarmupCompleted = deprecated_authenticator.onWarmupCompleted("icon-user-two-fill");
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            onWarmupCompleted = deprecated_authenticator.onWarmupCompleted("icon-user-two-fill");
        }
        deprecated_followRedirects deprecated_followredirects = onWarmupCompleted;
        Intrinsics.checkNotNull(deprecated_followredirects);
        return deprecated_followredirects;
    }
}
