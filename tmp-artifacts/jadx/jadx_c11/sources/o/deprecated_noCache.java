package o;

import com.google.android.material.shape.RoundedCornerTreatment;
import com.google.android.material.shape.ShapePath;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class deprecated_noCache extends RoundedCornerTreatment {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    public void getCornerPath(@NotNull ShapePath shapePath, float f, float f2, float f3) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 79;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(shapePath, "");
        shapePath.reset(0.0f, f3 * f2, 180.0f, 180.0f - f);
        float f4 = f3 * 2.0f * f2;
        shapePath.quadToPoint(0.0f, 0.0f, f4, f4);
        int i4 = onExtraCallbackWithResult + 25;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }
}
