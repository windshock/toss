package o;

import android.opengl.GLU;
import android.opengl.Matrix;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class setScrollState {
    public static final String onWarmupCompleted(int i2) {
        String hexString = Integer.toHexString(i2);
        Intrinsics.checkNotNullExpressionValue(hexString, "");
        return hexString;
    }

    public static final String onExtraCallback(int i2) {
        String strGluErrorString = GLU.gluErrorString(i2);
        Intrinsics.checkNotNullExpressionValue(strGluErrorString, "");
        return strGluErrorString;
    }

    public static final void IAuthTabCallback(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "");
        Matrix.setIdentityM(fArr, 0);
    }

    public static final float[] onExtraCallbackWithResult(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "");
        return (float[]) fArr.clone();
    }
}
