package o;

import im.toss.core.biometric.data.ResultData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class BuildConfig implements ResultData {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    private final String onWarmupCompleted;

    public BuildConfig(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.onWarmupCompleted = str;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 37;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
