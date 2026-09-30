package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class lookup {
    private static int IAuthTabCallback = 1;
    private static deprecated_followRedirects onExtraCallbackWithResult;
    private static int onWarmupCompleted;

    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final deprecated_followRedirects IAuthTabCallback(@NotNull OkHttp okHttp) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 119;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(okHttp, "");
            int i3 = 43 / 0;
            if (onExtraCallbackWithResult == null) {
                onExtraCallbackWithResult = deprecated_authenticator.onWarmupCompleted("icon-account-alert");
                int i4 = IAuthTabCallback + 63;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
            }
        } else {
            Intrinsics.checkNotNullParameter(okHttp, "");
            if (onExtraCallbackWithResult == null) {
            }
        }
        deprecated_followRedirects deprecated_followredirects = onExtraCallbackWithResult;
        Intrinsics.checkNotNull(deprecated_followredirects);
        int i6 = IAuthTabCallback + 53;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return deprecated_followredirects;
    }
}
