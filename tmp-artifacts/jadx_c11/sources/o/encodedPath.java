package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class encodedPath {
    private static deprecated_followRedirects IAuthTabCallback = null;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;

    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final deprecated_followRedirects onNavigationEvent(@NotNull OkHttp okHttp) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 95;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(okHttp, "");
            int i3 = 10 / 0;
            if (IAuthTabCallback == null) {
                int i4 = onExtraCallback + 113;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                IAuthTabCallback = deprecated_authenticator.onWarmupCompleted("icon-eye-on-line-3-mono");
                int i6 = onNavigationEvent + 73;
                onExtraCallback = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 5 / 2;
                }
            }
        } else {
            Intrinsics.checkNotNullParameter(okHttp, "");
            if (IAuthTabCallback == null) {
            }
        }
        deprecated_followRedirects deprecated_followredirects = IAuthTabCallback;
        Intrinsics.checkNotNull(deprecated_followredirects);
        return deprecated_followredirects;
    }
}
