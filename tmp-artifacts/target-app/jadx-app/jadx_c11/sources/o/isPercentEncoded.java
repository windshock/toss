package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class isPercentEncoded {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    private static deprecated_followRedirects onExtraCallbackWithResult;

    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final deprecated_followRedirects onExtraCallbackWithResult(@NotNull OkHttp okHttp) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 79;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(okHttp, "");
            int i3 = 61 / 0;
            if (onExtraCallbackWithResult == null) {
                int i4 = onExtraCallback + 17;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    onExtraCallbackWithResult = deprecated_authenticator.onWarmupCompleted("icon-scan-mono");
                    throw null;
                }
                onExtraCallbackWithResult = deprecated_authenticator.onWarmupCompleted("icon-scan-mono");
            }
        } else {
            Intrinsics.checkNotNullParameter(okHttp, "");
            if (onExtraCallbackWithResult == null) {
            }
        }
        deprecated_followRedirects deprecated_followredirects = onExtraCallbackWithResult;
        Intrinsics.checkNotNull(deprecated_followredirects);
        return deprecated_followredirects;
    }
}
