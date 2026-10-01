package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class makeAlignFaceBitmap {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;

    public static final String IAuthTabCallback(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 21;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            checkEyeBlink.onWarmupCompleted(str);
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        String strOnWarmupCompleted = checkEyeBlink.onWarmupCompleted(str);
        int i3 = onWarmupCompleted + 11;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return strOnWarmupCompleted;
    }

    public static final String onExtraCallback(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 87;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        String strOnExtraCallbackWithResult = checkEyeBlink.onExtraCallbackWithResult.onExtraCallbackWithResult(str);
        int i4 = onWarmupCompleted + 65;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return strOnExtraCallbackWithResult;
    }

    public static final String onExtraCallbackWithResult(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 81;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        String strOnNavigationEvent = checkEyeBlink.onExtraCallbackWithResult.onNavigationEvent(str);
        int i4 = onWarmupCompleted + 121;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return strOnNavigationEvent;
    }
}
