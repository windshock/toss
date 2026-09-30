package o;

import im.toss.core.biometric.data.ResultData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class IconRoundCornerProgressBar implements ResultData {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final String IAuthTabCallback;

    public IconRoundCornerProgressBar(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.IAuthTabCallback = str;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 17;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return this.IAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
