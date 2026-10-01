package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class deprecated_subtype {
    private static int IAuthTabCallback = 0;
    private static deprecated_followRedirects onNavigationEvent = null;
    private static int onWarmupCompleted = 1;

    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final deprecated_followRedirects onNavigationEvent(@NotNull OkHttp okHttp) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 125;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(okHttp, "");
            int i3 = 65 / 0;
            if (onNavigationEvent == null) {
                int i4 = onWarmupCompleted + 3;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    onNavigationEvent = deprecated_authenticator.onWarmupCompleted("icon-store-food-blue");
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                onNavigationEvent = deprecated_authenticator.onWarmupCompleted("icon-store-food-blue");
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
