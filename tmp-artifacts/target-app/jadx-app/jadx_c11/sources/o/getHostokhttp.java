package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class getHostokhttp {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static deprecated_followRedirects onWarmupCompleted;

    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final deprecated_followRedirects IAuthTabCallback(@NotNull OkHttp okHttp) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 47;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(okHttp, "");
            int i3 = 59 / 0;
            if (onWarmupCompleted == null) {
                onWarmupCompleted = deprecated_authenticator.onWarmupCompleted("icon-pencil-line-mono");
                int i4 = onExtraCallbackWithResult + 89;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
            }
        } else {
            Intrinsics.checkNotNullParameter(okHttp, "");
            if (onWarmupCompleted == null) {
            }
        }
        deprecated_followRedirects deprecated_followredirects = onWarmupCompleted;
        Intrinsics.checkNotNull(deprecated_followredirects);
        return deprecated_followredirects;
    }
}
