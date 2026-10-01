package o;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import androidx.annotation.Nullable;
import o.TextFieldDecoratorModifierNodeExternalSyntheticLambda12;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TextFieldDecoratorModifierNodeExternalSyntheticLambda13 implements SurfaceTexture.OnFrameAvailableListener, Runnable {
    private static final int[] onExtraCallback = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};
    private final onNavigationEvent IAuthTabCallback;
    private final int[] IAuthTabCallbackDefault;
    private SurfaceTexture asBinder;
    private EGLSurface asInterface;
    private EGLContext onExtraCallbackWithResult;
    private EGLDisplay onNavigationEvent;
    private final Handler onWarmupCompleted;

    public interface onNavigationEvent {
    }

    public TextFieldDecoratorModifierNodeExternalSyntheticLambda13(Handler handler) {
        this(handler, null);
    }

    public TextFieldDecoratorModifierNodeExternalSyntheticLambda13(Handler handler, @Nullable onNavigationEvent onnavigationevent) {
        this.onWarmupCompleted = handler;
        this.IAuthTabCallback = onnavigationevent;
        this.IAuthTabCallbackDefault = new int[1];
    }

    public void onNavigationEvent(int i2) throws TextFieldDecoratorModifierNodeExternalSyntheticLambda12.onWarmupCompleted {
        EGLDisplay eGLDisplayOnExtraCallbackWithResult = onExtraCallbackWithResult();
        this.onNavigationEvent = eGLDisplayOnExtraCallbackWithResult;
        EGLConfig eGLConfigOnExtraCallbackWithResult = onExtraCallbackWithResult(eGLDisplayOnExtraCallbackWithResult);
        EGLContext eGLContextOnWarmupCompleted = onWarmupCompleted(this.onNavigationEvent, eGLConfigOnExtraCallbackWithResult, i2);
        this.onExtraCallbackWithResult = eGLContextOnWarmupCompleted;
        this.asInterface = onWarmupCompleted(this.onNavigationEvent, eGLConfigOnExtraCallbackWithResult, eGLContextOnWarmupCompleted, i2);
        onNavigationEvent(this.IAuthTabCallbackDefault);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.IAuthTabCallbackDefault[0]);
        this.asBinder = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onNavigationEvent() {
        this.onWarmupCompleted.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.asBinder;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.IAuthTabCallbackDefault, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = this.onNavigationEvent;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.onNavigationEvent;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.asInterface;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.onNavigationEvent, this.asInterface);
            }
            EGLContext eGLContext = this.onExtraCallbackWithResult;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.onNavigationEvent, eGLContext);
            }
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay3 = this.onNavigationEvent;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.onNavigationEvent);
            }
            this.onNavigationEvent = null;
            this.onExtraCallbackWithResult = null;
            this.asInterface = null;
            this.asBinder = null;
        }
    }

    public SurfaceTexture onWarmupCompleted() {
        return (SurfaceTexture) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.asBinder);
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.onWarmupCompleted.post(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        SurfaceTexture surfaceTexture = this.asBinder;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }

    private static EGLDisplay onExtraCallbackWithResult() throws TextFieldDecoratorModifierNodeExternalSyntheticLambda12.onWarmupCompleted {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        TextFieldDecoratorModifierNodeExternalSyntheticLambda12.onExtraCallbackWithResult(eGLDisplayEglGetDisplay != null, "eglGetDisplay failed");
        int[] iArr = new int[2];
        TextFieldDecoratorModifierNodeExternalSyntheticLambda12.onExtraCallbackWithResult(EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1), "eglInitialize failed");
        return eGLDisplayEglGetDisplay;
    }

    private static EGLConfig onExtraCallbackWithResult(EGLDisplay eGLDisplay) throws TextFieldDecoratorModifierNodeExternalSyntheticLambda12.onWarmupCompleted {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplay, onExtraCallback, 0, eGLConfigArr, 0, 1, iArr, 0);
        boolean z = zEglChooseConfig && iArr[0] > 0 && eGLConfigArr[0] != null;
        TextFieldDecoratorModifierNodeExternalSyntheticLambda12.onExtraCallbackWithResult(z, TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", new Object[]{Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr[0]), eGLConfigArr[0]}));
        return eGLConfigArr[0];
    }

    private static EGLContext onWarmupCompleted(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i2) throws TextFieldDecoratorModifierNodeExternalSyntheticLambda12.onWarmupCompleted {
        int[] iArr;
        if (i2 == 0) {
            iArr = new int[]{12440, 2, 12344};
        } else {
            iArr = new int[]{12440, 2, 12992, 1, 12344};
        }
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, iArr, 0);
        TextFieldDecoratorModifierNodeExternalSyntheticLambda12.onExtraCallbackWithResult(eGLContextEglCreateContext != null, "eglCreateContext failed");
        return eGLContextEglCreateContext;
    }

    private static EGLSurface onWarmupCompleted(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i2) throws TextFieldDecoratorModifierNodeExternalSyntheticLambda12.onWarmupCompleted {
        int[] iArr;
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        if (i2 == 1) {
            eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            if (i2 == 2) {
                iArr = new int[]{12375, 1, 12374, 1, 12992, 1, 12344};
            } else {
                iArr = new int[]{12375, 1, 12374, 1, 12344};
            }
            eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, iArr, 0);
            TextFieldDecoratorModifierNodeExternalSyntheticLambda12.onExtraCallbackWithResult(eGLSurfaceEglCreatePbufferSurface != null, "eglCreatePbufferSurface failed");
        }
        TextFieldDecoratorModifierNodeExternalSyntheticLambda12.onExtraCallbackWithResult(EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContext), "eglMakeCurrent failed");
        return eGLSurfaceEglCreatePbufferSurface;
    }

    private static void onNavigationEvent(int[] iArr) throws TextFieldDecoratorModifierNodeExternalSyntheticLambda12.onWarmupCompleted {
        GLES20.glGenTextures(1, iArr, 0);
        TextFieldDecoratorModifierNodeExternalSyntheticLambda12.onNavigationEvent();
    }
}
