package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.opencv.core.Core;
import org.opencv.core.Mat;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ActivityAnimBean {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;

    public static final Mat onNavigationEvent(@NotNull Mat mat) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(mat, "");
        Mat mat2 = new Mat();
        Core.flip(mat, mat2, 1);
        mat.release();
        int i2 = onExtraCallbackWithResult + 9;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 88 / 0;
        }
        return mat2;
    }
}
