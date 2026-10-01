package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class deprecated_peerCertificates {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static deprecated_followRedirects onNavigationEvent;

    public static final deprecated_followRedirects IAuthTabCallback(@NotNull OkHttp okHttp) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 61;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(okHttp, "");
        if (onNavigationEvent == null) {
            int i4 = onExtraCallback + 11;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            onNavigationEvent = deprecated_authenticator.onWarmupCompleted("icon-at");
            int i6 = onExtraCallback + 51;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
        }
        deprecated_followRedirects deprecated_followredirects = onNavigationEvent;
        Intrinsics.checkNotNull(deprecated_followredirects);
        return deprecated_followredirects;
    }
}
