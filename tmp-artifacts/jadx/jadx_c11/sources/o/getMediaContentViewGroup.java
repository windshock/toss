package o;

import android.view.animation.Interpolator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public class getMediaContentViewGroup implements setOnQueryTextListener {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private final Interpolator onNavigationEvent;

    public getMediaContentViewGroup(@NotNull Interpolator interpolator) {
        Intrinsics.checkNotNullParameter(interpolator, "");
        this.onNavigationEvent = interpolator;
    }

    public Interpolator IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 13;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public float transform(float f) {
        float interpolation;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 71;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            interpolation = IAuthTabCallback().getInterpolation(f);
            int i3 = 21 / 0;
        } else {
            interpolation = IAuthTabCallback().getInterpolation(f);
        }
        int i4 = onExtraCallbackWithResult + 51;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return interpolation;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if ((obj instanceof getMediaContentViewGroup) && Intrinsics.areEqual(IAuthTabCallback(), ((getMediaContentViewGroup) obj).IAuthTabCallback())) {
            int i2 = onExtraCallbackWithResult + 97;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        int i4 = onExtraCallbackWithResult + 71;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 92 / 0;
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 69;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = IAuthTabCallback().hashCode();
        int i4 = onWarmupCompleted + 63;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "InterpolatorEasing(interpolator=" + IAuthTabCallback() + ")";
        int i2 = onExtraCallbackWithResult + 55;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }
}
