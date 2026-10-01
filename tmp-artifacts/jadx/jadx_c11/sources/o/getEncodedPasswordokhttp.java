package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class getEncodedPasswordokhttp {
    private static int onExtraCallback = 0;
    private static deprecated_followRedirects onExtraCallbackWithResult = null;
    private static int onWarmupCompleted = 1;

    public static final deprecated_followRedirects onWarmupCompleted(@NotNull OkHttp okHttp) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(okHttp, "");
        if (onExtraCallbackWithResult == null) {
            int i2 = onExtraCallback + 39;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult = deprecated_authenticator.onWarmupCompleted("icon-moon-mono");
            int i4 = onExtraCallback + 31;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        }
        deprecated_followRedirects deprecated_followredirects = onExtraCallbackWithResult;
        Intrinsics.checkNotNull(deprecated_followredirects);
        int i6 = onExtraCallback + 67;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 != 0) {
            return deprecated_followredirects;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
