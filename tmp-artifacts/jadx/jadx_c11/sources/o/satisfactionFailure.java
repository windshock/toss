package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class satisfactionFailure {
    private static deprecated_followRedirects onExtraCallback = null;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final deprecated_followRedirects onExtraCallbackWithResult(@NotNull OkHttp okHttp) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 27;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(okHttp, "");
            int i3 = 85 / 0;
            if (onExtraCallback == null) {
                onExtraCallback = deprecated_authenticator.onWarmupCompleted("icon-arrow-increase-red");
            }
        } else {
            Intrinsics.checkNotNullParameter(okHttp, "");
            if (onExtraCallback == null) {
            }
        }
        deprecated_followRedirects deprecated_followredirects = onExtraCallback;
        Intrinsics.checkNotNull(deprecated_followredirects);
        int i4 = onWarmupCompleted + 3;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return deprecated_followredirects;
    }
}
