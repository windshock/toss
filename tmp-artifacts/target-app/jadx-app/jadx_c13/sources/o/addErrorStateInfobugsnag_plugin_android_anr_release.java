package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.GLUtils;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import kotlin.jvm.internal.Intrinsics;
import o.applyokhttp;
import okhttp3.internal.http2.Http2;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class addErrorStateInfobugsnag_plugin_android_anr_release implements GLSurfaceView.Renderer {
    private static int extraCallback = 1;
    private static int getInterfaceDescriptor;
    private final boolean IAuthTabCallback;
    private int IAuthTabCallbackDefault;
    private int IAuthTabCallbackStub;
    private float IAuthTabCallbackStubProxy;
    private float IAuthTabCallback_Parcel;
    private float access000;
    private FloatBuffer access100;
    private int asBinder;
    private int asInterface;
    private final Context onExtraCallback;
    private final Bitmap onExtraCallbackWithResult;
    private int onNavigationEvent;
    private int onTransact;
    private int onWarmupCompleted;

    public final float IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 33;
        extraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        float f = this.IAuthTabCallbackStubProxy;
        int i4 = i2 + 57;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        return f;
    }

    public final float onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 105;
        extraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.access000;
        }
        throw null;
    }

    public final float onExtraCallback() {
        int i = 2 % 2;
        int i2 = extraCallback;
        int i3 = i2 + 31;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        float f = this.IAuthTabCallback_Parcel;
        int i5 = i2 + 109;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    private final Bitmap onExtraCallbackWithResult(Bitmap bitmap, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = getInterfaceDescriptor + 3;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        float width = bitmap.getWidth() / bitmap.getHeight();
        float f = i;
        float f2 = i2;
        if (width > f / f2) {
            i2 = (int) (f / width);
        } else {
            i = (int) (f2 * width);
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, true);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateScaledBitmap, "");
        int i6 = extraCallback + 125;
        getInterfaceDescriptor = i6 % 128;
        int i7 = i6 % 2;
        return bitmapCreateScaledBitmap;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(@Nullable GL10 gl10, @Nullable EGLConfig eGLConfig) {
        Bitmap bitmapOnExtraCallbackWithResult;
        int i = 2 % 2;
        if (!this.IAuthTabCallback) {
            Bitmap bitmap = this.onExtraCallbackWithResult;
            int i2 = getInterfaceDescriptor + 61;
            extraCallback = i2 % 128;
            int i3 = i2 % 2;
            bitmapOnExtraCallbackWithResult = bitmap;
        } else {
            int i4 = extraCallback + 55;
            getInterfaceDescriptor = i4 % 128;
            if (i4 % 2 != 0) {
                Bitmap bitmap2 = this.onExtraCallbackWithResult;
                M_ m_ = M_.onExtraCallback;
                bitmapOnExtraCallbackWithResult = onExtraCallbackWithResult(bitmap2, m_.asInterface(), m_.IAuthTabCallbackDefault());
                int i5 = 14 / 0;
            } else {
                Bitmap bitmap3 = this.onExtraCallbackWithResult;
                M_ m_2 = M_.onExtraCallback;
                bitmapOnExtraCallbackWithResult = onExtraCallbackWithResult(bitmap3, m_2.asInterface(), m_2.IAuthTabCallbackDefault());
            }
        }
        applyokhttp.onWarmupCompleted onwarmupcompleted = applyokhttp.Companion;
        this.asBinder = onwarmupcompleted.onExtraCallback(this.onExtraCallback, "raw/vertex_shader.glsl", "raw/horizontal_blur.glsl");
        this.IAuthTabCallbackStub = onwarmupcompleted.onExtraCallback(this.onExtraCallback, "raw/vertex_shader.glsl", "raw/vertical_blur.glsl");
        this.IAuthTabCallbackDefault = onNavigationEvent(bitmapOnExtraCallbackWithResult);
        M_ m_3 = M_.onExtraCallback;
        this.asInterface = m_3.asInterface();
        this.onTransact = m_3.IAuthTabCallbackDefault();
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        this.onNavigationEvent = iArr[0];
        int[] iArr2 = new int[1];
        GLES20.glGenTextures(1, iArr2, 0);
        int i6 = iArr2[0];
        this.onWarmupCompleted = i6;
        GLES20.glBindTexture(3553, i6);
        GLES20.glTexImage2D(3553, 0, 6408, this.asInterface, this.onTransact, 0, 6408, 5121, null);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glBindTexture(3553, 0);
        GLES20.glBindFramebuffer(36160, this.onNavigationEvent);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.onWarmupCompleted, 0);
        GLES20.glBindFramebuffer(36160, 0);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(@Nullable GL10 gl10, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = getInterfaceDescriptor + 59;
        extraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            GLES20.glViewport(1, 0, i, i2);
        } else {
            GLES20.glViewport(0, 0, i, i2);
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(@Nullable GL10 gl10) {
        int i = 2 % 2;
        int i2 = extraCallback + 17;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        GLES20.glBindFramebuffer(36160, this.onNavigationEvent);
        GLES20.glViewport(0, 0, this.asInterface, this.onTransact);
        GLES20.glClear(Http2.INITIAL_MAX_FRAME_SIZE);
        GLES20.glUseProgram(this.asBinder);
        GLES20.glUniform1i(GLES20.glGetUniformLocation(this.asBinder, "uTexture"), 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.IAuthTabCallbackDefault);
        GLES20.glUniform2fv(GLES20.glGetUniformLocation(this.asBinder, "uTexelSize"), 1, new float[]{1.0f / this.asInterface, 1.0f / this.onTransact}, 0);
        GLES20.glUniform1f(GLES20.glGetUniformLocation(this.asBinder, "uBlurRadius"), 5.0f);
        GLES20.glUniform1f(GLES20.glGetUniformLocation(this.asBinder, "uSigma"), 2.5f);
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.asBinder, "aPosition");
        GLES20.glEnableVertexAttribArray(iGlGetAttribLocation);
        GLES20.glVertexAttribPointer(iGlGetAttribLocation, 2, 5126, false, 20, (Buffer) this.access100);
        this.access100.position(2);
        int iGlGetAttribLocation2 = GLES20.glGetAttribLocation(this.asBinder, "aTexCoord");
        GLES20.glEnableVertexAttribArray(iGlGetAttribLocation2);
        GLES20.glVertexAttribPointer(iGlGetAttribLocation2, 2, 5126, false, 20, (Buffer) this.access100);
        this.access100.position(0);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glDisableVertexAttribArray(iGlGetAttribLocation);
        GLES20.glDisableVertexAttribArray(iGlGetAttribLocation2);
        GLES20.glBindFramebuffer(36160, 0);
        M_ m_ = M_.onExtraCallback;
        GLES20.glViewport(0, 0, m_.asInterface(), m_.IAuthTabCallbackDefault());
        GLES20.glClear(Http2.INITIAL_MAX_FRAME_SIZE);
        GLES20.glUseProgram(this.IAuthTabCallbackStub);
        GLES20.glUniform1i(GLES20.glGetUniformLocation(this.IAuthTabCallbackStub, "uTexture"), 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.onWarmupCompleted);
        GLES20.glUniform2fv(GLES20.glGetUniformLocation(this.IAuthTabCallbackStub, "uTexelSize"), 1, new float[]{1.0f / this.asInterface, 1.0f / this.onTransact}, 0);
        GLES20.glUniform1f(GLES20.glGetUniformLocation(this.IAuthTabCallbackStub, "uBlurRadius"), 5.0f);
        GLES20.glUniform1f(GLES20.glGetUniformLocation(this.IAuthTabCallbackStub, "uSigma"), 2.5f);
        int iGlGetAttribLocation3 = GLES20.glGetAttribLocation(this.IAuthTabCallbackStub, "aPosition");
        GLES20.glEnableVertexAttribArray(iGlGetAttribLocation3);
        GLES20.glVertexAttribPointer(iGlGetAttribLocation3, 2, 5126, false, 20, (Buffer) this.access100);
        this.access100.position(2);
        int iGlGetAttribLocation4 = GLES20.glGetAttribLocation(this.IAuthTabCallbackStub, "aTexCoord");
        GLES20.glEnableVertexAttribArray(iGlGetAttribLocation4);
        GLES20.glVertexAttribPointer(iGlGetAttribLocation4, 2, 5126, false, 20, (Buffer) this.access100);
        this.access100.position(0);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glDisableVertexAttribArray(iGlGetAttribLocation3);
        GLES20.glDisableVertexAttribArray(iGlGetAttribLocation4);
        int i4 = getInterfaceDescriptor + Imgproc.COLOR_YUV2RGBA_YVYU;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void IAuthTabCallback(float f, float f2, float f3) {
        int i = 2 % 2;
        int i2 = extraCallback;
        int i3 = i2 + 109;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 != 0) {
            this.IAuthTabCallbackStubProxy = f;
            this.access000 = f2;
            this.IAuthTabCallback_Parcel = f3;
            int i4 = 34 / 0;
        } else {
            this.IAuthTabCallbackStubProxy = f;
            this.access000 = f2;
            this.IAuthTabCallback_Parcel = f3;
        }
        int i5 = i2 + 45;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
    }

    private final int onNavigationEvent(Bitmap bitmap) {
        int i = 2 % 2;
        int i2 = extraCallback + 123;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i4 = iArr[0];
        GLES20.glBindTexture(3553, i4);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLUtils.texImage2D(3553, 0, bitmap, 0);
        GLES20.glBindTexture(3553, 0);
        int i5 = extraCallback + 105;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 == 0) {
            return i4;
        }
        throw null;
    }
}
