package o;

import android.opengl.EGL14;
import android.opengl.GLES20;
import kotlin.UInt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class scrollByInternal {
    public static final scrollByInternal onExtraCallback = new scrollByInternal();
    public static final float[] onExtraCallbackWithResult;

    private scrollByInternal() {
    }

    static {
        float[] fArr = new float[16];
        setItemAnimator.onWarmupCompleted(fArr);
        onExtraCallbackWithResult = fArr;
    }

    @JvmStatic
    public static final void onNavigationEvent(int i2, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (i2 >= 0) {
            return;
        }
        throw new RuntimeException("Unable to locate " + str + " in program");
    }

    @JvmStatic
    public static final void IAuthTabCallback(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        int i2 = UInt.constructor-impl(GLES20.glGetError());
        if (i2 == setScrollingTouchSlop.onTransact()) {
            return;
        }
        throw new RuntimeException("Error during " + str + ": glError 0x" + setScrollState.onWarmupCompleted(i2) + ": " + setScrollState.onExtraCallback(i2));
    }

    @JvmStatic
    public static final void onExtraCallback(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError == setLayoutFrozen.ICustomTabsCallback()) {
            return;
        }
        throw new RuntimeException("Error during " + str + ": EGL error 0x" + setScrollState.onWarmupCompleted(iEglGetError));
    }
}
