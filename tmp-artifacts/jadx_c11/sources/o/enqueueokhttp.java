package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class enqueueokhttp {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    private static deprecated_followRedirects onNavigationEvent;

    public static final deprecated_followRedirects onExtraCallback(@NotNull OkHttp okHttp) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 81;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(okHttp, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(okHttp, "");
        if (onNavigationEvent == null) {
            int i3 = IAuthTabCallback + 9;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            onNavigationEvent = deprecated_authenticator.onWarmupCompleted("icn-bank-square-hana");
            int i5 = onExtraCallback + 91;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
        }
        deprecated_followRedirects deprecated_followredirects = onNavigationEvent;
        Intrinsics.checkNotNull(deprecated_followredirects);
        return deprecated_followredirects;
    }
}
