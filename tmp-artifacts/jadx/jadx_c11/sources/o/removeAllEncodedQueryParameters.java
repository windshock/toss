package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class removeAllEncodedQueryParameters {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static deprecated_followRedirects onNavigationEvent;

    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final deprecated_followRedirects IAuthTabCallback(@NotNull OkHttp okHttp) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 125;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(okHttp, "");
            int i3 = 29 / 0;
            if (onNavigationEvent == null) {
                int i4 = onExtraCallbackWithResult + 23;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                onNavigationEvent = deprecated_authenticator.onWarmupCompleted("icon-piggybank-fill");
                int i6 = onExtraCallback + 29;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
            }
        } else {
            Intrinsics.checkNotNullParameter(okHttp, "");
            if (onNavigationEvent == null) {
            }
        }
        deprecated_followRedirects deprecated_followredirects = onNavigationEvent;
        Intrinsics.checkNotNull(deprecated_followredirects);
        return deprecated_followredirects;
    }
}
