package com.google.android.exoplayer2.util;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLU;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class GlUtil {
    private static final String EXTENSION_PROTECTED_CONTENT = "EGL_EXT_protected_content";
    private static final String EXTENSION_SURFACELESS_CONTEXT = "EGL_KHR_surfaceless_context";
    public static final int HOMOGENEOUS_COORDINATE_VECTOR_SIZE = 4;
    public static final float LENGTH_NDC = 2.0f;
    private static final String TAG = "GlUtil";
    public static boolean glAssertionsEnabled = false;
    private static final int[] EGL_WINDOW_SURFACE_ATTRIBUTES_NONE = {12344};
    private static final int EGL_GL_COLORSPACE_KHR = 12445;
    private static final int EGL_GL_COLORSPACE_BT2020_PQ_EXT = 13120;
    private static final int[] EGL_WINDOW_SURFACE_ATTRIBUTES_BT2020_PQ = {EGL_GL_COLORSPACE_KHR, EGL_GL_COLORSPACE_BT2020_PQ_EXT, 12344};
    private static final int[] EGL_CONFIG_ATTRIBUTES_RGBA_8888 = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344};
    private static final int[] EGL_CONFIG_ATTRIBUTES_RGBA_1010102 = {12352, 4, 12324, 10, 12323, 10, 12322, 10, 12321, 2, 12325, 0, 12326, 0, 12344};

    public static final class GlException extends RuntimeException {
        public GlException(String str) {
            super(str);
        }
    }

    private GlUtil() {
    }

    public static float[] getNormalizedCoordinateBounds() {
        return new float[]{-1.0f, -1.0f, 0.0f, 1.0f, 1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f};
    }

    public static float[] getTextureCoordinateBounds() {
        return new float[]{0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f};
    }

    public static float[] createVertexBuffer(List<float[]> list) {
        float[] fArr = new float[list.size() << 2];
        for (int i2 = 0; i2 < list.size(); i2++) {
            System.arraycopy(list.get(i2), 0, fArr, i2 << 2, 4);
        }
        return fArr;
    }

    public static boolean isProtectedContentExtensionSupported(Context context) {
        String strEglQueryString;
        int i2 = Util.SDK_INT;
        if (i2 < 24) {
            return false;
        }
        if (i2 >= 26 || !("samsung".equals(Util.MANUFACTURER) || "XT1650".equals(Util.MODEL))) {
            return (i2 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains(EXTENSION_PROTECTED_CONTENT);
        }
        return false;
    }

    public static boolean isSurfacelessContextExtensionSupported() {
        String strEglQueryString;
        return Util.SDK_INT >= 17 && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains(EXTENSION_SURFACELESS_CONTEXT);
    }

    public static EGLDisplay createEglDisplay() {
        return Api17.createEglDisplay();
    }

    public static EGLContext createEglContext(EGLDisplay eGLDisplay) {
        return Api17.createEglContext(eGLDisplay, 2, EGL_CONFIG_ATTRIBUTES_RGBA_8888);
    }

    public static EGLContext createEglContextEs3Rgba1010102(EGLDisplay eGLDisplay) {
        return Api17.createEglContext(eGLDisplay, 3, EGL_CONFIG_ATTRIBUTES_RGBA_1010102);
    }

    public static EGLSurface getEglSurface(EGLDisplay eGLDisplay, Object obj) {
        return Api17.getEglSurface(eGLDisplay, obj, EGL_CONFIG_ATTRIBUTES_RGBA_8888, EGL_WINDOW_SURFACE_ATTRIBUTES_NONE);
    }

    public static EGLSurface getEglSurfaceBt2020Pq(EGLDisplay eGLDisplay, Object obj) {
        return Api17.getEglSurface(eGLDisplay, obj, EGL_CONFIG_ATTRIBUTES_RGBA_1010102, EGL_WINDOW_SURFACE_ATTRIBUTES_BT2020_PQ);
    }

    private static EGLSurface createPbufferSurface(EGLDisplay eGLDisplay, int i2, int i3) {
        return Api17.createEglPbufferSurface(eGLDisplay, EGL_CONFIG_ATTRIBUTES_RGBA_8888, new int[]{12375, i2, 12374, i3, 12344});
    }

    public static EGLSurface createPlaceholderEglSurface(EGLDisplay eGLDisplay) {
        if (isSurfacelessContextExtensionSupported()) {
            return EGL14.EGL_NO_SURFACE;
        }
        return createPbufferSurface(eGLDisplay, 1, 1);
    }

    public static void focusPlaceholderEglSurface(EGLContext eGLContext, EGLDisplay eGLDisplay) {
        focusEglSurface(eGLDisplay, eGLContext, createPbufferSurface(eGLDisplay, 1, 1), 1, 1);
    }

    public static void focusPlaceholderEglSurfaceBt2020Pq(EGLContext eGLContext, EGLDisplay eGLDisplay) {
        focusEglSurface(eGLDisplay, eGLContext, Api17.createEglPbufferSurface(eGLDisplay, EGL_CONFIG_ATTRIBUTES_RGBA_1010102, new int[]{12375, 1, 12374, 1, EGL_GL_COLORSPACE_KHR, EGL_GL_COLORSPACE_BT2020_PQ_EXT, 12344}), 1, 1);
    }

    public static void checkGlError() {
        int i2 = 0;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            Log.e(TAG, "glError: " + GLU.gluErrorString(iGlGetError));
            i2 = iGlGetError;
        }
        if (i2 != 0) {
            throwGlException("glError: " + GLU.gluErrorString(i2));
        }
    }

    public static void assertValidTextureSize(int i2, int i3) {
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(3379, iArr, 0);
        int i4 = iArr[0];
        if (i2 < 0 || i3 < 0) {
            throwGlException("width or height is less than 0");
        }
        if (i2 > i4 || i3 > i4) {
            throwGlException("width or height is greater than GL_MAX_TEXTURE_SIZE " + i4);
        }
    }

    public static void focusEglSurface(EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface, int i2, int i3) {
        Api17.focusRenderTarget(eGLDisplay, eGLContext, eGLSurface, 0, i2, i3);
    }

    public static void focusFramebuffer(EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface, int i2, int i3, int i4) {
        Api17.focusRenderTarget(eGLDisplay, eGLContext, eGLSurface, i2, i3, i4);
    }

    public static void deleteTexture(int i2) {
        GLES20.glDeleteTextures(1, new int[]{i2}, 0);
        checkGlError();
    }

    public static void destroyEglContext(@Nullable EGLDisplay eGLDisplay, @Nullable EGLContext eGLContext) {
        Api17.destroyEglContext(eGLDisplay, eGLContext);
    }

    public static FloatBuffer createBuffer(float[] fArr) {
        return (FloatBuffer) createBuffer(fArr.length).put(fArr).flip();
    }

    public static FloatBuffer createBuffer(int i2) {
        return ByteBuffer.allocateDirect(i2 << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
    }

    public static String loadAsset(Context context, String str) throws IOException {
        InputStream inputStreamOpen = null;
        try {
            inputStreamOpen = context.getAssets().open(str);
            return Util.fromUtf8Bytes(Util.toByteArray(inputStreamOpen));
        } finally {
            Util.closeQuietly(inputStreamOpen);
        }
    }

    public static int createExternalTexture() {
        int iGenerateTexture = generateTexture();
        bindTexture(36197, iGenerateTexture);
        return iGenerateTexture;
    }

    public static int createTexture(int i2, int i3) {
        assertValidTextureSize(i2, i3);
        int iGenerateTexture = generateTexture();
        bindTexture(3553, iGenerateTexture);
        GLES20.glTexImage2D(3553, 0, 6408, i2, i3, 0, 6408, 5121, ByteBuffer.allocateDirect((i2 * i3) << 2));
        checkGlError();
        return iGenerateTexture;
    }

    private static int generateTexture() {
        checkEglException(!Util.areEqual(EGL14.eglGetCurrentContext(), EGL14.EGL_NO_CONTEXT), "No current context");
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        checkGlError();
        return iArr[0];
    }

    public static void bindTexture(int i2, int i3) {
        GLES20.glBindTexture(i2, i3);
        checkGlError();
        GLES20.glTexParameteri(i2, 10240, 9729);
        checkGlError();
        GLES20.glTexParameteri(i2, 10241, 9729);
        checkGlError();
        GLES20.glTexParameteri(i2, 10242, 33071);
        checkGlError();
        GLES20.glTexParameteri(i2, 10243, 33071);
        checkGlError();
    }

    public static int createFboForTexture(int i2) {
        checkEglException(!Util.areEqual(EGL14.eglGetCurrentContext(), EGL14.EGL_NO_CONTEXT), "No current context");
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        checkGlError();
        GLES20.glBindFramebuffer(36160, iArr[0]);
        checkGlError();
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i2, 0);
        checkGlError();
        return iArr[0];
    }

    static void throwGlException(String str) {
        if (glAssertionsEnabled) {
            throw new GlException(str);
        }
        Log.e(TAG, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void checkEglException(boolean z, String str) {
        if (z) {
            return;
        }
        throwGlException(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void checkEglException(String str) {
        int iEglGetError = EGL14.eglGetError();
        checkEglException(iEglGetError == 12288, str + ", error code: " + iEglGetError);
    }
}
