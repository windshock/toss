package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getObserversbugsnag_android_core_release {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private final matchExitInfo onExtraCallback;
    private final String onNavigationEvent;
    private final matchExitInfo onWarmupCompleted;

    public getObserversbugsnag_android_core_release(@NotNull String str, @NotNull matchExitInfo matchexitinfo, @NotNull matchExitInfo matchexitinfo2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(matchexitinfo, "");
        Intrinsics.checkNotNullParameter(matchexitinfo2, "");
        this.onNavigationEvent = str;
        this.onWarmupCompleted = matchexitinfo;
        this.onExtraCallback = matchexitinfo2;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 111;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String str = this.onNavigationEvent;
        int i5 = i2 + 21;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }
}
