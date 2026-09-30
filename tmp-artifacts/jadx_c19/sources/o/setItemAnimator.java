package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class setItemAnimator {
    private static final void IAuthTabCallback(float[] fArr) {
        if (fArr.length != 16) {
            throw new RuntimeException("Need a 16 values matrix.");
        }
    }

    public static final float[] onWarmupCompleted(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "");
        IAuthTabCallback(fArr);
        setScrollState.IAuthTabCallback(fArr);
        return fArr;
    }
}
