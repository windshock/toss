package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class AppLovinCmpServiceOnCompletedListener implements getORDER_BY_NAMEokhttp {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    private final CrashWhenOnDisableTooSoon onExtraCallbackWithResult;

    public AppLovinCmpServiceOnCompletedListener(@NotNull CrashWhenOnDisableTooSoon crashWhenOnDisableTooSoon) {
        Intrinsics.checkNotNullParameter(crashWhenOnDisableTooSoon, "");
        this.onExtraCallbackWithResult = crashWhenOnDisableTooSoon;
    }

    @Override // o.getORDER_BY_NAMEokhttp
    public float onNavigationEvent(float f) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 15;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        float fOnExtraCallback = this.onExtraCallbackWithResult.onExtraCallback(f);
        int i4 = onExtraCallback + 87;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return fOnExtraCallback;
    }

    @Override // o.getORDER_BY_NAMEokhttp
    public float onExtraCallback(float f) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 97;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        CrashWhenOnDisableTooSoon crashWhenOnDisableTooSoon = this.onExtraCallbackWithResult;
        if (i3 != 0) {
            return crashWhenOnDisableTooSoon.IAuthTabCallback(f);
        }
        crashWhenOnDisableTooSoon.IAuthTabCallback(f);
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
