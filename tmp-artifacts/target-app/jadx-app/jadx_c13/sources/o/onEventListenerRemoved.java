package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.opengl.GLES20;
import android.opengl.GLES30;
import android.opengl.GLSurfaceView;
import android.opengl.GLUtils;
import java.nio.FloatBuffer;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import kotlin.jvm.internal.Intrinsics;
import o.TimeoutCompanionNONE1;
import o.onEventListenerRemoved;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class onEventListenerRemoved implements GLSurfaceView.Renderer {
    private static int onMessageChannelReady = 1;
    private static int onMinimized;
    private Bitmap IAuthTabCallback;
    private final GLSurfaceView IAuthTabCallbackDefault;
    private int IAuthTabCallbackStub;
    private int IAuthTabCallbackStubProxy;
    private int IAuthTabCallback_Parcel;
    private int ICustomTabsCallback;
    private float access000;
    private long access100;
    private final boolean asBinder;
    private int asInterface;
    private int extraCallback;
    private int extraCallbackWithResult;
    private int getInterfaceDescriptor;
    private int onActivityResized;
    private final int onExtraCallback;
    private float onExtraCallbackWithResult;
    private final Context onNavigationEvent;
    private final float[] onPostMessage;
    private boolean onTransact;
    private float onWarmupCompleted;
    private int readTypedObject;
    private float writeTypedObject;

    public static /* synthetic */ void IAuthTabCallback(onEventListenerRemoved oneventlistenerremoved, int i) {
        int i2 = 2 % 2;
        int i3 = onMinimized + 113;
        onMessageChannelReady = i3 % 128;
        int i4 = i3 % 2;
        onExtraCallbackWithResult(oneventlistenerremoved, i);
        int i5 = onMinimized + 107;
        onMessageChannelReady = i5 % 128;
        int i6 = i5 % 2;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(onEventListenerRemoved oneventlistenerremoved) {
        int i = 2 % 2;
        int i2 = onMinimized + 65;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(oneventlistenerremoved);
        int i4 = onMessageChannelReady + 61;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = i6 | i5 | i7;
        int i9 = ~i6;
        int i10 = (~i5) | i7;
        int i11 = (~i10) | i9;
        int i12 = (~(i5 | i7 | i9)) | (~(i10 | i6));
        int i13 = i3 + i6 + i4 + (2053704882 * i2) + ((-167119771) * i);
        int i14 = i13 * i13;
        int i15 = (((-385660469) * i3) - 1543503872) + (1501345335 * i6) + (1203980746 * i8) + (i11 * (-1203980746)) + ((-1203980746) * i12) + ((-1589641216) * i4) + (511705088 * i2) + ((-1639972864) * i) + (1278279680 * i14);
        int i16 = ((i3 * (-1228230693)) - 288632672) + (i6 * (-1228230521)) + (i8 * (-86)) + (i11 * 86) + (i12 * 86) + (i4 * (-1228230607)) + (i2 * 927583762) + (i * (-1784727723)) + (i14 * 1163984896);
        int i17 = i15 + (i16 * i16 * 992935936);
        return i17 != 1 ? i17 != 2 ? onNavigationEvent(objArr) : onExtraCallbackWithResult(objArr) : onWarmupCompleted(objArr);
    }

    public static /* synthetic */ void onNavigationEvent(onEventListenerRemoved oneventlistenerremoved) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 105;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(oneventlistenerremoved);
        int i4 = onMinimized + 59;
        onMessageChannelReady = i4 % 128;
        int i5 = i4 % 2;
    }

    public onEventListenerRemoved(@NotNull GLSurfaceView gLSurfaceView, @NotNull Context context, int i, int i2, boolean z) {
        Intrinsics.checkNotNullParameter(gLSurfaceView, "");
        Intrinsics.checkNotNullParameter(context, "");
        this.IAuthTabCallbackDefault = gLSurfaceView;
        this.onNavigationEvent = context;
        this.onExtraCallback = i;
        this.asInterface = i2;
        this.asBinder = z;
        this.access100 = System.currentTimeMillis();
        this.extraCallback = -1;
        this.readTypedObject = -1;
        this.extraCallbackWithResult = -1;
        this.onPostMessage = new float[]{-1.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f, -1.0f, 0.0f, 1.0f, 1.0f, -1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f};
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(@Nullable GL10 gl10, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = onMessageChannelReady + 113;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glViewport(0, 0, i, i2);
        this.getInterfaceDescriptor = i;
        this.IAuthTabCallbackStubProxy = i2;
        GLES20.glUseProgram(this.IAuthTabCallbackStub);
        GLES20.glUniform2f(GLES20.glGetUniformLocation(this.IAuthTabCallbackStub, "uScreenSize"), this.getInterfaceDescriptor, this.IAuthTabCallbackStubProxy);
        GLES20.glUseProgram(0);
        int i6 = onMessageChannelReady + 51;
        onMinimized = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 26 / 0;
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(@Nullable GL10 gl10, @Nullable EGLConfig eGLConfig) {
        int i = 2 % 2;
        int iOnExtraCallback = applyokhttp.Companion.onExtraCallback(this.onNavigationEvent, "raw/dot_vertex_shader.glsl", "raw/dot_fragment_shader.glsl");
        this.IAuthTabCallbackStub = iOnExtraCallback;
        if (iOnExtraCallback <= 0) {
            return;
        }
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glUseProgram(this.IAuthTabCallbackStub);
        Context context = this.IAuthTabCallbackDefault.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        float fOnNavigationEvent = r8lambdaHj15cOoPiWk5EBmraCDXuOEYgM.onNavigationEvent(context, 0.0f, 0.0f, 3, null);
        this.extraCallback = GLES20.glGetUniformLocation(this.IAuthTabCallbackStub, "uTransform");
        this.readTypedObject = GLES20.glGetUniformLocation(this.IAuthTabCallbackStub, "uAlphaFactor");
        this.extraCallbackWithResult = GLES20.glGetUniformLocation(this.IAuthTabCallbackStub, "uViewScale");
        GLES20.glUniform1f(GLES20.glGetUniformLocation(this.IAuthTabCallbackStub, "uDotSize"), varyMatches.IAuthTabCallback(Float.valueOf(1.5f), this.onNavigationEvent) * fOnNavigationEvent);
        GLES20.glUniform1f(GLES20.glGetUniformLocation(this.IAuthTabCallbackStub, "uDotSpacing"), varyMatches.IAuthTabCallback(Float.valueOf(5.0f), this.onNavigationEvent) * fOnNavigationEvent);
        GLES20.glUniform1i(GLES20.glGetUniformLocation(this.IAuthTabCallbackStub, "uDrawBitmap"), this.asBinder ? 1 : 0);
        int iGlGetUniformLocation = GLES20.glGetUniformLocation(this.IAuthTabCallbackStub, "uNightMode");
        Resources resources = this.onNavigationEvent.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        GLES20.glUniform1i(iGlGetUniformLocation, generateLink.IAuthTabCallback(resources) ? 1 : 0);
        int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(this.IAuthTabCallbackStub, "uDotColor");
        if (iGlGetUniformLocation2 != -1) {
            int i2 = onMinimized + 87;
            onMessageChannelReady = i2 % 128;
            if (i2 % 2 == 0) {
                GLES20.glUniform4f(iGlGetUniformLocation2, Color.red(this.asInterface) + 255.0f, Color.green(this.asInterface) * 255.0f, Color.blue(this.asInterface) - 255.0f, 0.0f);
            } else {
                GLES20.glUniform4f(iGlGetUniformLocation2, Color.red(this.asInterface) / 255.0f, Color.green(this.asInterface) / 255.0f, Color.blue(this.asInterface) / 255.0f, 1.0f);
            }
            int i3 = onMessageChannelReady + 7;
            onMinimized = i3 % 128;
            int i4 = i3 % 2;
        }
        onExtraCallbackWithResult();
        this.IAuthTabCallback_Parcel = onNavigationEvent();
        GLES20.glUseProgram(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0086  */
    @Override // android.opengl.GLSurfaceView.Renderer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onDrawFrame(@Nullable GL10 gl10) {
        int i;
        int i2 = 2 % 2;
        int i3 = onMinimized + 39;
        onMessageChannelReady = i3 % 128;
        if (i3 % 2 == 0) {
            GLES20.glClear(9397);
            i = this.IAuthTabCallbackStub;
            if (i <= 0) {
                return;
            }
        } else {
            GLES20.glClear(16640);
            i = this.IAuthTabCallbackStub;
            if (i <= 0) {
                return;
            }
        }
        int i4 = onMessageChannelReady;
        int i5 = i4 + 95;
        onMinimized = i5 % 128;
        if (i5 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.writeTypedObject <= 0.01f || (!this.onTransact)) {
            return;
        }
        int i6 = i4 + 13;
        onMinimized = i6 % 128;
        if (i6 % 2 != 0) {
            GLES20.glUseProgram(i);
            GLES20.glUniformMatrix4fv(this.extraCallback, 1, true, onWarmupCompleted(), 0);
            GLES20.glUniform1f(this.readTypedObject, this.writeTypedObject);
            int i7 = this.extraCallbackWithResult;
            float f = this.onWarmupCompleted;
            GLES20.glUniform2f(i7, f, f);
            if (!this.asBinder) {
                int i8 = onMessageChannelReady + 83;
                onMinimized = i8 % 128;
                if (i8 % 2 != 0) {
                    GLES20.glEnable(16144);
                    GLES20.glBlendFuncSeparate(24869, 15362, 0, 18452);
                } else {
                    GLES20.glEnable(3042);
                    GLES20.glBlendFuncSeparate(770, 771, 1, 771);
                }
            }
        } else {
            GLES20.glUseProgram(i);
            GLES20.glUniformMatrix4fv(this.extraCallback, 1, false, onWarmupCompleted(), 0);
            GLES20.glUniform1f(this.readTypedObject, this.writeTypedObject);
            int i9 = this.extraCallbackWithResult;
            float f2 = this.onWarmupCompleted;
            GLES20.glUniform2f(i9, f2, f2);
            if (!this.asBinder) {
            }
        }
        GLES20.glBindTexture(3553, this.IAuthTabCallback_Parcel);
        GLES30.glBindVertexArray(this.ICustomTabsCallback);
        GLES20.glDrawArrays(5, 0, 4);
        GLES30.glBindVertexArray(0);
        GLES20.glBindTexture(3553, 0);
        GLES20.glUseProgram(0);
        int i10 = onMinimized + 25;
        onMessageChannelReady = i10 % 128;
        int i11 = i10 % 2;
    }

    private final float[] onWarmupCompleted() {
        int i;
        int i2 = 2 % 2;
        int i3 = onMessageChannelReady + 47;
        onMinimized = i3 % 128;
        int i4 = i3 % 2;
        double radians = Math.toRadians(this.access000);
        float fCos = (float) Math.cos(radians);
        float fSin = (float) Math.sin(radians);
        int i5 = this.getInterfaceDescriptor;
        if (i5 == 0 || (i = this.IAuthTabCallbackStubProxy) == 0) {
            return new float[]{fCos, -fSin, 0.0f, 0.0f, fSin, fCos, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        }
        float f = this.onExtraCallback * this.onWarmupCompleted;
        float f2 = f / i5;
        float f3 = i;
        float f4 = f / f3;
        float[] fArr = {fCos * f2, (-fSin) * f4, 0.0f, 0.0f, fSin * f2, fCos * f4, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f - ((this.onExtraCallbackWithResult / f3) * 2.0f), 0.0f, 1.0f};
        int i6 = onMessageChannelReady + 91;
        onMinimized = i6 % 128;
        if (i6 % 2 == 0) {
            return fArr;
        }
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        final onEventListenerRemoved oneventlistenerremoved = (onEventListenerRemoved) objArr[0];
        Bitmap bitmap = (Bitmap) objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(bitmap, "");
        oneventlistenerremoved.IAuthTabCallback = bitmap;
        oneventlistenerremoved.onTransact = false;
        oneventlistenerremoved.IAuthTabCallbackDefault.queueEvent(new Runnable() { // from class: im.toss.uikit.widget.gl.render.AnimatedImageDotRenderer$$ExternalSyntheticLambda2
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 3;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                onEventListenerRemoved.onNavigationEvent(this.f$0);
                if (i4 != 0) {
                    int i5 = 98 / 0;
                }
            }
        });
        int i2 = onMessageChannelReady + 59;
        onMinimized = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 27 / 0;
        }
        return null;
    }

    private static final void IAuthTabCallback(onEventListenerRemoved oneventlistenerremoved) {
        int i = 2 % 2;
        int i2 = onMinimized + 43;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        GLES20.glBindTexture(3553, oneventlistenerremoved.IAuthTabCallback_Parcel);
        Bitmap bitmap = oneventlistenerremoved.IAuthTabCallback;
        if (bitmap != null) {
            int i4 = onMinimized + 99;
            onMessageChannelReady = i4 % 128;
            int i5 = i4 % 2;
            GLUtils.texImage2D(3553, 0, bitmap, 0);
            oneventlistenerremoved.onTransact = true;
            int i6 = onMessageChannelReady + 81;
            onMinimized = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 4 / 2;
            }
        } else {
            GLES20.glTexImage2D(3553, 0, 6408, 1, 1, 0, 6408, 5121, null);
            oneventlistenerremoved.onTransact = false;
        }
        int iOnWarmupCompleted = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted3 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        onNavigationEvent(TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted3, 991148091, new Object[]{oneventlistenerremoved}, iOnWarmupCompleted2, iOnWarmupCompleted, -991148089);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
    }

    public final void onWarmupCompleted(final int i) {
        int i2 = 2 % 2;
        this.asInterface = i;
        this.IAuthTabCallbackDefault.queueEvent(new Runnable() { // from class: im.toss.uikit.widget.gl.render.AnimatedImageDotRenderer$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            @Override // java.lang.Runnable
            public final void run() {
                int i3 = 2 % 2;
                int i4 = onNavigationEvent + 79;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    onEventListenerRemoved.IAuthTabCallback(this.f$0, i);
                    throw null;
                }
                onEventListenerRemoved.IAuthTabCallback(this.f$0, i);
                int i5 = onNavigationEvent + 9;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
            }
        });
        int i3 = onMinimized + 99;
        onMessageChannelReady = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 92 / 0;
        }
    }

    private static final void onExtraCallbackWithResult(onEventListenerRemoved oneventlistenerremoved, int i) {
        float fRed;
        float fGreen;
        int i2 = 2 % 2;
        int i3 = onMinimized + 35;
        onMessageChannelReady = i3 % 128;
        if (i3 % 2 != 0) {
            GLES20.glUseProgram(oneventlistenerremoved.IAuthTabCallbackStub);
            int iGlGetUniformLocation = GLES20.glGetUniformLocation(oneventlistenerremoved.IAuthTabCallbackStub, "uDotColor");
            if (iGlGetUniformLocation != -1) {
                int i4 = onMessageChannelReady + 47;
                onMinimized = i4 % 128;
                if (i4 % 2 != 0) {
                    fRed = Color.red(i) + 255.0f;
                    fGreen = Color.green(i) + 255.0f;
                } else {
                    fRed = Color.red(i) / 255.0f;
                    fGreen = Color.green(i) / 255.0f;
                }
                GLES20.glUniform4f(iGlGetUniformLocation, fRed, fGreen, Color.blue(i) / 255.0f, 1.0f);
            }
            GLES20.glUseProgram(0);
            return;
        }
        GLES20.glUseProgram(oneventlistenerremoved.IAuthTabCallbackStub);
        GLES20.glGetUniformLocation(oneventlistenerremoved.IAuthTabCallbackStub, "uDotColor");
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        final onEventListenerRemoved oneventlistenerremoved = (onEventListenerRemoved) objArr[0];
        int i = 2 % 2;
        oneventlistenerremoved.IAuthTabCallbackDefault.queueEvent(new Runnable() { // from class: im.toss.uikit.widget.gl.render.AnimatedImageDotRenderer$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 67;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                onEventListenerRemoved.onExtraCallbackWithResult(this.f$0);
                if (i4 == 0) {
                    int i5 = 47 / 0;
                }
            }
        });
        int i2 = onMinimized + 61;
        onMessageChannelReady = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 60 / 0;
        }
        return null;
    }

    private static final void onWarmupCompleted(onEventListenerRemoved oneventlistenerremoved) {
        int i;
        int i2 = 2 % 2;
        int i3 = onMessageChannelReady + 123;
        onMinimized = i3 % 128;
        if (i3 % 2 != 0) {
            GLES20.glUseProgram(oneventlistenerremoved.IAuthTabCallbackStub);
            int iGlGetUniformLocation = GLES20.glGetUniformLocation(oneventlistenerremoved.IAuthTabCallbackStub, "uTextureSize");
            float f = oneventlistenerremoved.onExtraCallback;
            GLES20.glUniform2f(iGlGetUniformLocation, f, f);
            i = 1;
        } else {
            GLES20.glUseProgram(oneventlistenerremoved.IAuthTabCallbackStub);
            int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(oneventlistenerremoved.IAuthTabCallbackStub, "uTextureSize");
            float f2 = oneventlistenerremoved.onExtraCallback;
            GLES20.glUniform2f(iGlGetUniformLocation2, f2, f2);
            i = 0;
        }
        GLES20.glUseProgram(i);
    }

    private final int onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + Imgproc.COLOR_YUV2RGB_YVYU;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(3553, iArr[0]);
        GLES20.glTexImage2D(3553, 0, 6408, 1, 1, 0, 6408, 5121, null);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        int i4 = iArr[0];
        int i5 = onMinimized + 83;
        onMessageChannelReady = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    private final void onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onMinimized + 71;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        int[] iArr = new int[2];
        GLES30.glGenVertexArrays(1, iArr, 0);
        GLES20.glGenBuffers(1, iArr, 1);
        int i4 = iArr[0];
        this.ICustomTabsCallback = i4;
        this.onActivityResized = iArr[1];
        GLES30.glBindVertexArray(i4);
        GLES20.glBindBuffer(34962, this.onActivityResized);
        float[] fArr = this.onPostMessage;
        GLES20.glBufferData(34962, fArr.length << 2, FloatBuffer.wrap(fArr), 35044);
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.IAuthTabCallbackStub, "aPosition");
        GLES20.glEnableVertexAttribArray(iGlGetAttribLocation);
        GLES20.glVertexAttribPointer(iGlGetAttribLocation, 3, 5126, false, 20, 0);
        int iGlGetAttribLocation2 = GLES20.glGetAttribLocation(this.IAuthTabCallbackStub, "aTexCoord");
        GLES20.glEnableVertexAttribArray(iGlGetAttribLocation2);
        GLES20.glVertexAttribPointer(iGlGetAttribLocation2, 2, 5126, false, 20, 12);
        GLES20.glBindBuffer(34962, 0);
        GLES30.glBindVertexArray(0);
        int i5 = onMessageChannelReady + 23;
        onMinimized = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 16 / 0;
        }
    }

    public final void IAuthTabCallback(float f) {
        int i = 2 % 2;
        Resources resources = this.onNavigationEvent.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        if (generateLink.IAuthTabCallback(resources)) {
            int i2 = onMessageChannelReady + 107;
            onMinimized = i2 % 128;
            int i3 = i2 % 2;
            this.writeTypedObject = f * 0.7f;
            return;
        }
        this.writeTypedObject = f * 0.5f;
        int i4 = onMinimized + 61;
        onMessageChannelReady = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void onExtraCallback(float f) {
        int i = 2 % 2;
        int i2 = onMinimized + 7;
        int i3 = i2 % 128;
        onMessageChannelReady = i3;
        int i4 = i2 % 2;
        this.access000 = f;
        int i5 = i3 + 125;
        onMinimized = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void onNavigationEvent(float f) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady;
        int i3 = i2 + 71;
        onMinimized = i3 % 128;
        int i4 = i3 % 2;
        this.onWarmupCompleted = f;
        int i5 = i2 + 9;
        onMinimized = i5 % 128;
        int i6 = i5 % 2;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        onEventListenerRemoved oneventlistenerremoved = (onEventListenerRemoved) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        int i = 2 % 2;
        int i2 = onMinimized + 67;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        oneventlistenerremoved.onExtraCallbackWithResult = fFloatValue;
        if (i3 != 0) {
            return null;
        }
        throw null;
    }

    public final void onExtraCallback() {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 95;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        GLES20.glDeleteTextures(1, new int[]{this.IAuthTabCallback_Parcel}, 0);
        GLES20.glDeleteBuffers(1, new int[]{this.onActivityResized}, 0);
        GLES30.glDeleteVertexArrays(1, new int[]{this.ICustomTabsCallback}, 0);
        GLES20.glDeleteProgram(this.IAuthTabCallbackStub);
        int i4 = onMinimized + 53;
        onMessageChannelReady = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private final void IAuthTabCallback() {
        int iOnWarmupCompleted = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted3 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        onNavigationEvent(TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted3, 991148091, new Object[]{this}, iOnWarmupCompleted2, iOnWarmupCompleted, -991148089);
    }

    public final void onWarmupCompleted(float f) {
        Object[] objArr = {this, Float.valueOf(f)};
        int iOnWarmupCompleted = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        onNavigationEvent(TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), -882169453, objArr, iOnWarmupCompleted2, iOnWarmupCompleted, 882169453);
    }

    public final void onNavigationEvent(@NotNull Bitmap bitmap) {
        int iOnWarmupCompleted = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted3 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        onNavigationEvent(TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted3, 1639897735, new Object[]{this, bitmap}, iOnWarmupCompleted2, iOnWarmupCompleted, -1639897734);
    }
}
