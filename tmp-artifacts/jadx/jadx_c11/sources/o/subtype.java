package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class subtype {
    private static deprecated_followRedirects onExtraCallback = null;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    public static final deprecated_followRedirects onNavigationEvent(@NotNull OkHttp okHttp) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 63;
        onExtraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(okHttp, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(okHttp, "");
        if (onExtraCallback == null) {
            int i3 = onExtraCallbackWithResult + 85;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                onExtraCallback = deprecated_authenticator.onWarmupCompleted("icon-store-mono");
                obj.hashCode();
                throw null;
            }
            onExtraCallback = deprecated_authenticator.onWarmupCompleted("icon-store-mono");
        }
        deprecated_followRedirects deprecated_followredirects = onExtraCallback;
        Intrinsics.checkNotNull(deprecated_followredirects);
        int i4 = onNavigationEvent + 99;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return deprecated_followredirects;
        }
        throw null;
    }
}
