package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class percentDecodeokhttpdefault {
    private static int IAuthTabCallback = 1;
    private static deprecated_followRedirects onExtraCallback;
    private static int onNavigationEvent;

    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final deprecated_followRedirects IAuthTabCallback(@NotNull OkHttp okHttp) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 75;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(okHttp, "");
            int i3 = 85 / 0;
            if (onExtraCallback == null) {
                onExtraCallback = deprecated_authenticator.onWarmupCompleted("icon-scan");
                int i4 = IAuthTabCallback + 123;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
            }
        } else {
            Intrinsics.checkNotNullParameter(okHttp, "");
            if (onExtraCallback == null) {
            }
        }
        deprecated_followRedirects deprecated_followredirects = onExtraCallback;
        Intrinsics.checkNotNull(deprecated_followredirects);
        int i6 = onNavigationEvent + 15;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 95 / 0;
        }
        return deprecated_followredirects;
    }
}
