package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class queryParameterNames {
    private static int IAuthTabCallback = 1;
    private static deprecated_followRedirects onNavigationEvent;
    private static int onWarmupCompleted;

    public static final deprecated_followRedirects onExtraCallback(@NotNull OkHttp okHttp) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 51;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(okHttp, "");
        if (onNavigationEvent == null) {
            int i4 = IAuthTabCallback + 15;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            onNavigationEvent = deprecated_authenticator.onWarmupCompleted("icon-info-circle-mono");
            int i6 = IAuthTabCallback + 1;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
        }
        deprecated_followRedirects deprecated_followredirects = onNavigationEvent;
        Intrinsics.checkNotNull(deprecated_followredirects);
        int i8 = onWarmupCompleted + 17;
        IAuthTabCallback = i8 % 128;
        if (i8 % 2 != 0) {
            return deprecated_followredirects;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
