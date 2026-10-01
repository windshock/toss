package o;

import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class djExternalSyntheticApiModelOutline2 {
    public static final int onExtraCallback() {
        return uz.IAuthTabCallback();
    }

    public static final int onExtraCallback(@NotNull String str, int i, int i2, int i3) {
        return djExternalSyntheticApiModelOutline3.onExtraCallback(str, i, i2, i3);
    }

    public static final long onExtraCallback(@NotNull String str, long j, long j2, long j3) {
        return djExternalSyntheticApiModelOutline3.onNavigationEvent(str, j, j2, j3);
    }

    public static final String onNavigationEvent(@NotNull String str) {
        return uz.onExtraCallback(str);
    }

    public static final String onWarmupCompleted(@NotNull String str, @NotNull String str2) {
        return djExternalSyntheticApiModelOutline3.onExtraCallback(str, str2);
    }

    public static final boolean onWarmupCompleted(@NotNull String str, boolean z) {
        return djExternalSyntheticApiModelOutline3.onNavigationEvent(str, z);
    }
}
