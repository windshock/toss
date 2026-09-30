package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class runningCallsCount {
    private static int onExtraCallback = 1;
    private static deprecated_followRedirects onExtraCallbackWithResult;
    private static int onWarmupCompleted;

    public static final deprecated_followRedirects onWarmupCompleted(@NotNull OkHttp okHttp) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 93;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(okHttp, "");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(okHttp, "");
        if (onExtraCallbackWithResult == null) {
            onExtraCallbackWithResult = deprecated_authenticator.onWarmupCompleted("icn-bank-square-woori");
        }
        deprecated_followRedirects deprecated_followredirects = onExtraCallbackWithResult;
        Intrinsics.checkNotNull(deprecated_followredirects);
        int i3 = onExtraCallback + 9;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 99 / 0;
        }
        return deprecated_followredirects;
    }
}
