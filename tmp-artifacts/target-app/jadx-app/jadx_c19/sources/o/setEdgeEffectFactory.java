package o;

import android.graphics.RectF;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class setEdgeEffectFactory extends setChildImportantForAccessibilityInternal {
    private final int onNavigationEvent = 2;

    @Override // o.setChildImportantForAccessibilityInternal
    public final int onNavigationEvent() {
        return this.onNavigationEvent;
    }

    public final void IAuthTabCallback(@NotNull RectF rectF) {
        Intrinsics.checkNotNullParameter(rectF, "");
        float fMax = -3.4028235E38f;
        float fMin = Float.MAX_VALUE;
        int i2 = 0;
        float fMax2 = -3.4028235E38f;
        float fMin2 = Float.MAX_VALUE;
        while (onWarmupCompleted().hasRemaining()) {
            float f = onWarmupCompleted().get();
            if (i2 % 2 == 0) {
                fMin2 = Math.min(fMin2, f);
                fMax2 = Math.max(fMax2, f);
            } else {
                fMax = Math.max(fMax, f);
                fMin = Math.min(fMin, f);
            }
            i2++;
        }
        onWarmupCompleted().rewind();
        rectF.set(fMin2, fMax, fMax2, fMin);
    }
}
