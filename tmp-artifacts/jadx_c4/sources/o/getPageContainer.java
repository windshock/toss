package o;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getPageContainer {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public static final String onExtraCallback(@NotNull byte[] bArr) throws IOException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 73;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(bArr, "");
            String strOnWarmupCompleted = IsEnabled.onExtraCallback().onWarmupCompleted(bArr);
            Intrinsics.checkNotNullExpressionValue(strOnWarmupCompleted, "");
            return strOnWarmupCompleted;
        }
        Intrinsics.checkNotNullParameter(bArr, "");
        String strOnWarmupCompleted2 = IsEnabled.onExtraCallback().onWarmupCompleted(bArr);
        Intrinsics.checkNotNullExpressionValue(strOnWarmupCompleted2, "");
        int i3 = 33 / 0;
        return strOnWarmupCompleted2;
    }

    public static final byte[] IAuthTabCallback(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 23;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        byte[] bArrOnExtraCallbackWithResult = IsEnabled.onExtraCallback().onExtraCallbackWithResult((CharSequence) str);
        Intrinsics.checkNotNullExpressionValue(bArrOnExtraCallbackWithResult, "");
        int i4 = onWarmupCompleted + 29;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return bArrOnExtraCallbackWithResult;
        }
        throw null;
    }
}
