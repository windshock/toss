package o;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.opengl.Matrix;
import android.os.Build;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TextFieldDecoratorModifierNodeExternalSyntheticLambda12 {
    public static final int[] onExtraCallbackWithResult = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344};
    public static final int[] onExtraCallback = {12352, 4, 12324, 10, 12323, 10, 12322, 10, 12321, 2, 12325, 0, 12326, 0, 12344};
    private static final int[] onWarmupCompleted = {12445, 13120, 12344, 12344};
    private static final int[] IAuthTabCallback = {12445, 13632, 12344, 12344};
    private static final int[] onNavigationEvent = {12344};

    public static final class onWarmupCompleted extends Exception {
        public onWarmupCompleted(String str) {
            super(str);
        }
    }

    public static void onExtraCallback(float[] fArr) {
        Matrix.setIdentityM(fArr, 0);
    }

    public static boolean IAuthTabCallback(Context context) throws onWarmupCompleted {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 26 && ("samsung".equals(Build.MANUFACTURER) || "XT1650".equals(Build.MODEL))) {
            return false;
        }
        if (i2 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
            return onNavigationEvent("EGL_EXT_protected_content");
        }
        return false;
    }

    public static boolean onTransact() throws onWarmupCompleted {
        return onNavigationEvent("EGL_KHR_surfaceless_context");
    }

    public static boolean onWarmupCompleted(int i2) throws onWarmupCompleted {
        if (i2 == 6) {
            return asBinder();
        }
        if (i2 == 7) {
            return onWarmupCompleted();
        }
        return true;
    }

    public static boolean asBinder() throws onWarmupCompleted {
        return Build.VERSION.SDK_INT >= 33 && onNavigationEvent("EGL_EXT_gl_colorspace_bt2020_pq");
    }

    public static boolean onWarmupCompleted() throws onWarmupCompleted {
        return onNavigationEvent("EGL_EXT_gl_colorspace_bt2020_hlg");
    }

    public static EGLDisplay IAuthTabCallback() throws onWarmupCompleted {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        onExtraCallbackWithResult(!eGLDisplayEglGetDisplay.equals(EGL14.EGL_NO_DISPLAY), "No EGL display.");
        onExtraCallbackWithResult(EGL14.eglInitialize(eGLDisplayEglGetDisplay, new int[1], 0, new int[1], 0), "Error in eglInitialize.");
        onNavigationEvent();
        return eGLDisplayEglGetDisplay;
    }

    public static void onNavigationEvent() throws onWarmupCompleted {
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            if (z) {
                sb.append('\n');
            }
            String strGluErrorString = GLU.gluErrorString(iGlGetError);
            if (strGluErrorString == null) {
                strGluErrorString = "error code: 0x" + Integer.toHexString(iGlGetError);
            }
            sb.append("glError: ");
            sb.append(strGluErrorString);
            z = true;
        }
        if (z) {
            throw new onWarmupCompleted(sb.toString());
        }
    }

    public static FloatBuffer onWarmupCompleted(float[] fArr) {
        return (FloatBuffer) onExtraCallbackWithResult(fArr.length).put(fArr).flip();
    }

    private static FloatBuffer onExtraCallbackWithResult(int i2) {
        return ByteBuffer.allocateDirect(i2 << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
    }

    public static int onExtraCallbackWithResult() throws onWarmupCompleted {
        int iOnExtraCallback = onExtraCallback();
        onExtraCallbackWithResult(36197, iOnExtraCallback, 9729);
        return iOnExtraCallback;
    }

    public static int onExtraCallback() throws onWarmupCompleted {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        onNavigationEvent();
        return iArr[0];
    }

    public static void onExtraCallbackWithResult(int i2, int i3, int i4) throws onWarmupCompleted {
        GLES20.glBindTexture(i2, i3);
        onNavigationEvent();
        GLES20.glTexParameteri(i2, 10240, i4);
        onNavigationEvent();
        GLES20.glTexParameteri(i2, 10241, i4);
        onNavigationEvent();
        GLES20.glTexParameteri(i2, 10242, 33071);
        onNavigationEvent();
        GLES20.glTexParameteri(i2, 10243, 33071);
        onNavigationEvent();
    }

    public static void onExtraCallbackWithResult(boolean z, String str) throws onWarmupCompleted {
        if (!z) {
            throw new onWarmupCompleted(str);
        }
    }

    private static boolean onNavigationEvent(String str) throws onWarmupCompleted {
        String strEglQueryString = EGL14.eglQueryString(IAuthTabCallback(), 12373);
        return strEglQueryString != null && strEglQueryString.contains(str);
    }
}
