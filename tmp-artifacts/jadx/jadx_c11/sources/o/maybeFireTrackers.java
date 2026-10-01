package o;

import androidx.compose.ui.geometry.Rect;
import kotlin.jvm.internal.Intrinsics;
import o.rotate;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
final class maybeFireTrackers implements toMetersPerSecond {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private final float IAuthTabCallback;
    private final boolean onNavigationEvent;

    public maybeFireTrackers(float f, boolean z) {
        this.IAuthTabCallback = f;
        this.onNavigationEvent = z;
    }

    public rotate IAuthTabCallback(long j, @NotNull ExtensionsManagerExtensionsAvailability extensionsManagerExtensionsAvailability, @NotNull r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4) {
        float f;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(extensionsManagerExtensionsAvailability, "");
        Intrinsics.checkNotNullParameter(r8lambdanm9dm2eewl4vrptnjmesfjqky4, "");
        int i2 = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i2);
        boolean z = this.onNavigationEvent;
        if (z) {
            int i3 = onExtraCallback + 85;
            onExtraCallbackWithResult = i3 % 128;
            f = i3 % 2 == 0 ? this.IAuthTabCallback * 0.0f : 1.0f - this.IAuthTabCallback;
        } else {
            f = this.IAuthTabCallback;
        }
        float fIntBitsToFloat2 = fIntBitsToFloat * f;
        float f2 = z ? fIntBitsToFloat2 : 0.0f;
        if (z) {
            int i4 = onExtraCallbackWithResult + 105;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                fIntBitsToFloat2 = Float.intBitsToFloat(i2);
                int i5 = 32 / 0;
            } else {
                fIntBitsToFloat2 = Float.intBitsToFloat(i2);
            }
        }
        return new rotate.onWarmupCompleted(new Rect(f2, 0.0f, fIntBitsToFloat2, Float.intBitsToFloat((int) j)));
    }
}
