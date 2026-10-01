package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class pathSize {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static deprecated_followRedirects onNavigationEvent;

    public static final deprecated_followRedirects onWarmupCompleted(@NotNull OkHttp okHttp) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(okHttp, "");
        if (onNavigationEvent == null) {
            int i2 = IAuthTabCallback + 103;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                onNavigationEvent = deprecated_authenticator.onWarmupCompleted("icon-headphone");
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            onNavigationEvent = deprecated_authenticator.onWarmupCompleted("icon-headphone");
        }
        deprecated_followRedirects deprecated_followredirects = onNavigationEvent;
        Intrinsics.checkNotNull(deprecated_followredirects);
        int i3 = onExtraCallback + 3;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return deprecated_followredirects;
    }
}
