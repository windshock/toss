package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLES30;
import android.opengl.GLSurfaceView;
import android.opengl.GLUtils;
import im.toss.features.home.ui.dst.view.cardbill.detail.HomeDstCardBillDetailFilterActivity$;
import im.toss.uikit.widget.gl.render.TouchBlurEffectRenderer$;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AnrDetailsCollectorcollectAnrErrorDetails1;
import o.applyokhttp;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AnrDetailsCollectorcollectAnrErrorDetails1 implements GLSurfaceView.Renderer {
    private static int access000 = 1;
    private static int access100;
    private Bitmap IAuthTabCallback;
    private final Lazy IAuthTabCallbackDefault;
    private int IAuthTabCallbackStub;
    private FloatBuffer IAuthTabCallbackStubProxy;
    private int IAuthTabCallback_Parcel;
    private int asBinder;
    private boolean asInterface;
    private final CopyOnWriteArrayList<onWarmupCompleted> getInterfaceDescriptor;
    private final GLSurfaceView onExtraCallback;
    private float onExtraCallbackWithResult;
    private float onNavigationEvent;
    private int onTransact;
    private final boolean onWarmupCompleted;

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        AnrDetailsCollectorcollectAnrErrorDetails1 anrDetailsCollectorcollectAnrErrorDetails1 = (AnrDetailsCollectorcollectAnrErrorDetails1) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = access000 + 73;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(anrDetailsCollectorcollectAnrErrorDetails1, str);
        if (i3 == 0) {
            return null;
        }
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallback(float f, AnrDetailsCollectorcollectAnrErrorDetails1 anrDetailsCollectorcollectAnrErrorDetails1, float f2, String str) {
        int i = 2 % 2;
        int i2 = access100 + 45;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(f, anrDetailsCollectorcollectAnrErrorDetails1, f2, str);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = access100 + 3;
        access000 = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void IAuthTabCallback(AnrDetailsCollectorcollectAnrErrorDetails1 anrDetailsCollectorcollectAnrErrorDetails1, Bitmap bitmap, float f, float f2) {
        int i = 2 % 2;
        int i2 = access000 + 95;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(anrDetailsCollectorcollectAnrErrorDetails1, bitmap, f, f2);
        int i4 = access100 + 45;
        access000 = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void IAuthTabCallback(AnrDetailsCollectorcollectAnrErrorDetails1 anrDetailsCollectorcollectAnrErrorDetails1, String str, float f, float f2, float f3) {
        int i = 2 % 2;
        int i2 = access100 + 83;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(anrDetailsCollectorcollectAnrErrorDetails1, str, f, f2, f3);
        int i4 = access100 + 9;
        access000 = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ boolean onExtraCallback(String str, onWarmupCompleted onwarmupcompleted) {
        int i = 2 % 2;
        int i2 = access100 + 5;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(str, onwarmupcompleted);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zOnExtraCallbackWithResult = onExtraCallbackWithResult(str, onwarmupcompleted);
        int i3 = access000 + 87;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        return zOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~((~i5) | i3);
        int i8 = ~((~i2) | i3);
        int i9 = i7 | i8;
        int i10 = i8 | (~((~i3) | i5)) | i7;
        int i11 = i3 + i5 + i6 + ((-1814252664) * i) + (2073254503 * i4);
        int i12 = i11 * i11;
        int i13 = ((-223937157) * i3) + 1943797760 + (1745420935 * i5) + (i9 * 1162804602) + (1162804602 * i7) + ((-1162804602) * i10) + ((-1386741760) * i6) + ((-1631584256) * i) + ((-1368915968) * i4) + ((-1053032448) * i12);
        int i14 = (i3 * (-1919122223)) + 1408767311 + (i5 * (-1919121035)) + (i9 * (-594)) + (i7 * (-594)) + (i10 * 594) + (i6 * (-1919121629)) + (i * (-390511720)) + (i4 * 1804971285) + (i12 * 255066112);
        int i15 = i13 + (i14 * i14 * 379846656);
        return i15 != 1 ? i15 != 2 ? i15 != 3 ? IAuthTabCallback(objArr) : onNavigationEvent(objArr) : onWarmupCompleted(objArr) : onExtraCallbackWithResult(objArr);
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        AnrDetailsCollectorcollectAnrErrorDetails1 anrDetailsCollectorcollectAnrErrorDetails1 = (AnrDetailsCollectorcollectAnrErrorDetails1) objArr[0];
        int i = 2 % 2;
        int i2 = access000 + 113;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        float fOnExtraCallback = onExtraCallback(anrDetailsCollectorcollectAnrErrorDetails1);
        int i4 = access100 + 109;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return Float.valueOf(fOnExtraCallback);
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        AnrDetailsCollectorcollectAnrErrorDetails1 anrDetailsCollectorcollectAnrErrorDetails1 = (AnrDetailsCollectorcollectAnrErrorDetails1) objArr[0];
        int i = 2 % 2;
        int i2 = access100 + 101;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(anrDetailsCollectorcollectAnrErrorDetails1);
        if (i3 != 0) {
            return null;
        }
        throw null;
    }

    public AnrDetailsCollectorcollectAnrErrorDetails1(@NotNull GLSurfaceView gLSurfaceView, boolean z) {
        Intrinsics.checkNotNullParameter(gLSurfaceView, "");
        this.onExtraCallback = gLSurfaceView;
        this.onWarmupCompleted = z;
        this.IAuthTabCallback_Parcel = -1;
        this.getInterfaceDescriptor = new CopyOnWriteArrayList<>();
        int iIAuthTabCallback = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback2 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        this.IAuthTabCallbackStubProxy = (FloatBuffer) onExtraCallbackWithResult(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback, 156016837, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -156016835, iIAuthTabCallback2, new Object[]{this});
        this.onNavigationEvent = 1.0f;
        this.onExtraCallbackWithResult = 1.0f;
        this.IAuthTabCallbackDefault = LazyKt__LazyJVMKt.lazy(new TouchBlurEffectRenderer$.ExternalSyntheticLambda3(this));
    }

    private final float onExtraCallback() {
        float fFloatValue;
        int i = 2 % 2;
        int i2 = access100 + 7;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            fFloatValue = ((Number) this.IAuthTabCallbackDefault.getValue()).floatValue();
            int i3 = 33 / 0;
        } else {
            fFloatValue = ((Number) this.IAuthTabCallbackDefault.getValue()).floatValue();
        }
        int i4 = access000 + 9;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 52 / 0;
        }
        return fFloatValue;
    }

    private static final float onExtraCallback(AnrDetailsCollectorcollectAnrErrorDetails1 anrDetailsCollectorcollectAnrErrorDetails1) {
        int i = 2 % 2;
        int i2 = access000 + 71;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Context context = anrDetailsCollectorcollectAnrErrorDetails1.onExtraCallback.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        float fIAuthTabCallback = varyMatches.IAuthTabCallback(214, context);
        int i4 = access000 + 63;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return fIAuthTabCallback;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(@Nullable GL10 gl10, @Nullable EGLConfig eGLConfig) {
        int i = 2 % 2;
        int i2 = access000 + 57;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            Bitmap bitmap = this.IAuthTabCallback;
            if (bitmap != null) {
                onNavigationEvent(bitmap, onExtraCallback(), onExtraCallback());
                int i3 = access100 + 81;
                access000 = i3 % 128;
                int i4 = i3 % 2;
            }
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            applyokhttp.onWarmupCompleted onwarmupcompleted = applyokhttp.Companion;
            Context context = this.onExtraCallback.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            this.onTransact = onwarmupcompleted.onExtraCallback(context, "raw/touch_blur_vertex.glsl", "raw/touch_blur_fragment.glsl");
            this.IAuthTabCallback_Parcel = IAuthTabCallback();
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glUseProgram(0);
            return;
        }
        throw null;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(@Nullable GL10 gl10, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = access100 + 69;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glViewport(0, 0, i, i2);
        this.asBinder = i;
        this.IAuthTabCallbackStub = i2;
        int i6 = access100 + 65;
        access000 = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 45 / 0;
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(@Nullable GL10 gl10) {
        int i = 2 % 2;
        GLES20.glClear(16640);
        if (this.onTransact <= 0 || !this.asInterface || this.getInterfaceDescriptor.isEmpty()) {
            return;
        }
        GLES20.glUseProgram(this.onTransact);
        GLES20.glUniform1i(GLES20.glGetUniformLocation(this.onTransact, "uNightMode"), this.onWarmupCompleted ? 1 : 0);
        List list = CollectionsKt___CollectionsKt.toList(this.getInterfaceDescriptor);
        int size = list.size();
        int i2 = size << 1;
        float[] fArr = new float[i2];
        float[] fArr2 = new float[i2];
        float[] fArr3 = new float[size];
        float[] fArr4 = new float[size];
        Iterator it = list.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            int i4 = access000 + 17;
            access100 = i4 % 128;
            if (i4 % 2 != 0) {
                it.next();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object next = it.next();
            if (i3 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
                int i5 = access000 + 125;
                access100 = i5 % 128;
                int i6 = i5 % 2;
            }
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) next;
            int i7 = i3 << 1;
            fArr[i7] = onwarmupcompleted.onExtraCallbackWithResult();
            int i8 = i7 + 1;
            fArr[i8] = onwarmupcompleted.IAuthTabCallbackDefault();
            fArr2[i7] = this.onNavigationEvent * onwarmupcompleted.onWarmupCompleted();
            fArr2[i8] = this.onExtraCallbackWithResult * onwarmupcompleted.onWarmupCompleted();
            fArr3[i3] = onwarmupcompleted.onExtraCallback();
            fArr4[i3] = onwarmupcompleted.onNavigationEvent();
            i3++;
            int i9 = access000 + 21;
            access100 = i9 % 128;
            int i10 = i9 % 2;
        }
        GLES20.glUniform1i(GLES20.glGetUniformLocation(this.onTransact, "uInstanceCount"), size);
        if (size > 0) {
            GLES20.glUniform2fv(GLES20.glGetUniformLocation(this.onTransact, "uPosition"), size, fArr, 0);
            GLES20.glUniform2fv(GLES20.glGetUniformLocation(this.onTransact, "uSize"), size, fArr2, 0);
            GLES20.glUniform1fv(GLES20.glGetUniformLocation(this.onTransact, "uRotation"), size, fArr3, 0);
            GLES20.glUniform1fv(GLES20.glGetUniformLocation(this.onTransact, "uAlpha"), size, fArr4, 0);
        }
        GLES20.glEnable(3042);
        GLES20.glBlendFuncSeparate(770, 771, 1, 771);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.IAuthTabCallback_Parcel);
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glVertexAttribPointer(0, 2, 5126, false, 0, (Buffer) this.IAuthTabCallbackStubProxy);
        GLES30.glDrawArraysInstanced(5, 0, 4, size);
        GLES20.glDisableVertexAttribArray(0);
        GLES20.glUseProgram(0);
    }

    private static final void onExtraCallback(float f, AnrDetailsCollectorcollectAnrErrorDetails1 anrDetailsCollectorcollectAnrErrorDetails1, float f2, String str) {
        float f3 = f / anrDetailsCollectorcollectAnrErrorDetails1.asBinder;
        float f4 = f2 / anrDetailsCollectorcollectAnrErrorDetails1.IAuthTabCallbackStub;
        synchronized (anrDetailsCollectorcollectAnrErrorDetails1.getInterfaceDescriptor) {
            if (anrDetailsCollectorcollectAnrErrorDetails1.getInterfaceDescriptor.size() >= 100) {
                anrDetailsCollectorcollectAnrErrorDetails1.getInterfaceDescriptor.remove(0);
            }
            anrDetailsCollectorcollectAnrErrorDetails1.getInterfaceDescriptor.add(new onWarmupCompleted(str, (f3 * 2.0f) - 1.0f, 1.0f - (f4 * 2.0f), 0.0f, 0.0f, 0.0f, false, 120, null));
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void onNavigationEvent(@NotNull final String str, final float f, final float f2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.onExtraCallback.queueEvent(new Runnable() { // from class: im.toss.uikit.widget.gl.render.TouchBlurEffectRenderer$$ExternalSyntheticLambda2
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 91;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 != 0) {
                    AnrDetailsCollectorcollectAnrErrorDetails1.IAuthTabCallback(f, this, f2, str);
                    int i4 = 5 / 0;
                } else {
                    AnrDetailsCollectorcollectAnrErrorDetails1.IAuthTabCallback(f, this, f2, str);
                }
                int i5 = IAuthTabCallback + 77;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
            }
        });
        this.onExtraCallback.requestRender();
        int i2 = access100 + 33;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallback(AnrDetailsCollectorcollectAnrErrorDetails1 anrDetailsCollectorcollectAnrErrorDetails1, String str, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = access100 + 125;
            access000 = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            str = null;
        }
        anrDetailsCollectorcollectAnrErrorDetails1.onNavigationEvent(str);
        int i4 = access100 + 61;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 35 / 0;
        }
    }

    private static final void IAuthTabCallback(AnrDetailsCollectorcollectAnrErrorDetails1 anrDetailsCollectorcollectAnrErrorDetails1, final String str) {
        synchronized (anrDetailsCollectorcollectAnrErrorDetails1.getInterfaceDescriptor) {
            if (str == null) {
                anrDetailsCollectorcollectAnrErrorDetails1.getInterfaceDescriptor.clear();
            } else {
                CollectionsKt__MutableCollectionsKt.removeAll((List) anrDetailsCollectorcollectAnrErrorDetails1.getInterfaceDescriptor, new Function1() { // from class: im.toss.uikit.widget.gl.render.TouchBlurEffectRenderer$$ExternalSyntheticLambda4
                    private static int IAuthTabCallback = 0;
                    private static int onWarmupCompleted = 1;

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int i = 2 % 2;
                        int i2 = IAuthTabCallback + 7;
                        onWarmupCompleted = i2 % 128;
                        int i3 = i2 % 2;
                        boolean zOnExtraCallback = AnrDetailsCollectorcollectAnrErrorDetails1.onExtraCallback(str, (AnrDetailsCollectorcollectAnrErrorDetails1.onWarmupCompleted) obj);
                        if (i3 != 0) {
                            return Boolean.valueOf(zOnExtraCallback);
                        }
                        Boolean.valueOf(zOnExtraCallback);
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                });
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    private static final boolean onExtraCallbackWithResult(String str, onWarmupCompleted onwarmupcompleted) {
        int i = 2 % 2;
        int i2 = access000 + 15;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        boolean zAreEqual = Intrinsics.areEqual(onwarmupcompleted.IAuthTabCallback(), str);
        int i4 = access100 + 107;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return zAreEqual;
    }

    public final void onNavigationEvent(@Nullable final String str) {
        int i = 2 % 2;
        this.onExtraCallback.queueEvent(new Runnable() { // from class: im.toss.uikit.widget.gl.render.TouchBlurEffectRenderer$$ExternalSyntheticLambda0
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 107;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                AnrDetailsCollectorcollectAnrErrorDetails1 anrDetailsCollectorcollectAnrErrorDetails1 = this.f$0;
                if (i4 != 0) {
                    Object[] objArr = {anrDetailsCollectorcollectAnrErrorDetails1, str};
                    AnrDetailsCollectorcollectAnrErrorDetails1.onExtraCallbackWithResult(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -207509582, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 207509582, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), objArr);
                    return;
                }
                Object[] objArr2 = {anrDetailsCollectorcollectAnrErrorDetails1, str};
                AnrDetailsCollectorcollectAnrErrorDetails1.onExtraCallbackWithResult(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -207509582, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 207509582, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), objArr2);
                throw null;
            }
        });
        this.onExtraCallback.requestRender();
        int i2 = access100 + 75;
        access000 = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final void onNavigationEvent(AnrDetailsCollectorcollectAnrErrorDetails1 anrDetailsCollectorcollectAnrErrorDetails1, String str, float f, float f2, float f3) {
        Object next;
        int i = 2 % 2;
        Iterator<T> it = anrDetailsCollectorcollectAnrErrorDetails1.getInterfaceDescriptor.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            int i2 = access000 + 11;
            access100 = i2 % 128;
            int i3 = i2 % 2;
            next = it.next();
            if (Intrinsics.areEqual(((onWarmupCompleted) next).IAuthTabCallback(), str)) {
                break;
            }
        }
        onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) next;
        if (onwarmupcompleted != null) {
            int i4 = access000 + 1;
            access100 = i4 % 128;
            if (i4 % 2 == 0) {
                onwarmupcompleted.IAuthTabCallback(f);
                onwarmupcompleted.onExtraCallbackWithResult(f2);
                onwarmupcompleted.onNavigationEvent(f3);
            } else {
                onwarmupcompleted.IAuthTabCallback(f);
                onwarmupcompleted.onExtraCallbackWithResult(f2);
                onwarmupcompleted.onNavigationEvent(f3);
                throw null;
            }
        }
    }

    public final void onWarmupCompleted(@NotNull final String str, final float f, final float f2, final float f3) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.onExtraCallback.queueEvent(new Runnable() { // from class: im.toss.uikit.widget.gl.render.TouchBlurEffectRenderer$$ExternalSyntheticLambda5
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 85;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                AnrDetailsCollectorcollectAnrErrorDetails1.IAuthTabCallback(this.f$0, str, f, f2, f3);
                int i5 = onNavigationEvent + 69;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        this.onExtraCallback.requestRender();
        int i2 = access100 + 17;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onNavigationEvent(@NotNull final Bitmap bitmap, final float f, final float f2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(bitmap, "");
        this.onExtraCallback.queueEvent(new Runnable() { // from class: im.toss.uikit.widget.gl.render.TouchBlurEffectRenderer$$ExternalSyntheticLambda6
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 55;
                onWarmupCompleted = i3 % 128;
                Object obj = null;
                if (i3 % 2 != 0) {
                    AnrDetailsCollectorcollectAnrErrorDetails1.IAuthTabCallback(this.f$0, bitmap, f, f2);
                    throw null;
                }
                AnrDetailsCollectorcollectAnrErrorDetails1.IAuthTabCallback(this.f$0, bitmap, f, f2);
                int i4 = onWarmupCompleted + 105;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
        });
        int i2 = access000 + 35;
        access100 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0052 A[PHI: r1
      0x0052: PHI (r1v11 android.graphics.Bitmap) = (r1v10 android.graphics.Bitmap), (r1v24 android.graphics.Bitmap) binds: [B:8:0x0050, B:5:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onNavigationEvent(AnrDetailsCollectorcollectAnrErrorDetails1 anrDetailsCollectorcollectAnrErrorDetails1, Bitmap bitmap, float f, float f2) {
        Bitmap bitmap2;
        int i = 2 % 2;
        int i2 = access100 + 115;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            anrDetailsCollectorcollectAnrErrorDetails1.IAuthTabCallback = bitmap;
            anrDetailsCollectorcollectAnrErrorDetails1.onNavigationEvent = (anrDetailsCollectorcollectAnrErrorDetails1.asBinder * f) / 2.0f;
            anrDetailsCollectorcollectAnrErrorDetails1.onExtraCallbackWithResult = (f2 - anrDetailsCollectorcollectAnrErrorDetails1.IAuthTabCallbackStub) - 0.0f;
            GLES20.glBindTexture(17588, anrDetailsCollectorcollectAnrErrorDetails1.IAuthTabCallback_Parcel);
            bitmap2 = anrDetailsCollectorcollectAnrErrorDetails1.IAuthTabCallback;
            if (bitmap2 == null) {
                GLES20.glTexImage2D(3553, 0, 6408, 1, 1, 0, 6408, 5121, null);
            } else {
                int i3 = access000 + 79;
                access100 = i3 % 128;
                if (i3 % 2 != 0) {
                    GLUtils.texImage2D(21174, 1, bitmap2, 1);
                } else {
                    GLUtils.texImage2D(3553, 0, bitmap2, 0);
                }
            }
        } else {
            anrDetailsCollectorcollectAnrErrorDetails1.IAuthTabCallback = bitmap;
            anrDetailsCollectorcollectAnrErrorDetails1.onNavigationEvent = (f / anrDetailsCollectorcollectAnrErrorDetails1.asBinder) * 2.0f;
            anrDetailsCollectorcollectAnrErrorDetails1.onExtraCallbackWithResult = (f2 / anrDetailsCollectorcollectAnrErrorDetails1.IAuthTabCallbackStub) * 2.0f;
            GLES20.glBindTexture(3553, anrDetailsCollectorcollectAnrErrorDetails1.IAuthTabCallback_Parcel);
            bitmap2 = anrDetailsCollectorcollectAnrErrorDetails1.IAuthTabCallback;
            if (bitmap2 != null) {
            }
        }
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        anrDetailsCollectorcollectAnrErrorDetails1.asInterface = true;
        int i4 = access100 + 21;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 33 / 0;
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        FloatBuffer floatBufferAsFloatBuffer;
        FloatBuffer floatBufferPut;
        int i = 2 % 2;
        int i2 = access000 + 25;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(85).order(ByteOrder.nativeOrder()).asFloatBuffer();
            floatBufferPut = floatBufferAsFloatBuffer.put(new float[]{-0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, 0.5f, 0.5f});
        } else {
            floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
            floatBufferPut = floatBufferAsFloatBuffer.put(new float[]{-0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, 0.5f, 0.5f});
        }
        floatBufferPut.position(0);
        Intrinsics.checkNotNullExpressionValue(floatBufferAsFloatBuffer, "");
        int i3 = access100 + 103;
        access000 = i3 % 128;
        if (i3 % 2 != 0) {
            return floatBufferAsFloatBuffer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final int IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = access000 + 89;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(3553, iArr[0]);
        int i4 = iArr[0];
        int i5 = access100 + 115;
        access000 = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    private static final void onExtraCallbackWithResult(AnrDetailsCollectorcollectAnrErrorDetails1 anrDetailsCollectorcollectAnrErrorDetails1) {
        int i = 2 % 2;
        int i2 = access100 + 73;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        GLES20.glDeleteTextures(1, new int[]{anrDetailsCollectorcollectAnrErrorDetails1.IAuthTabCallback_Parcel}, 0);
        GLES20.glDeleteProgram(anrDetailsCollectorcollectAnrErrorDetails1.onTransact);
        int i4 = access000 + 41;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void onExtraCallbackWithResult() {
        int i = 2 % 2;
        this.onExtraCallback.queueEvent(new Runnable() { // from class: im.toss.uikit.widget.gl.render.TouchBlurEffectRenderer$$ExternalSyntheticLambda1
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 37;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                Object[] objArr = {this.f$0};
                AnrDetailsCollectorcollectAnrErrorDetails1.onExtraCallbackWithResult(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 1690613731, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -1690613728, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), objArr);
                int i5 = onExtraCallbackWithResult + 97;
                onExtraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
            }
        });
        Bitmap bitmap = this.IAuthTabCallback;
        if (bitmap != null) {
            int i2 = access100 + 123;
            access000 = i2 % 128;
            int i3 = i2 % 2;
            bitmap.recycle();
        }
        int i4 = access100 + 43;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onWarmupCompleted {
        private static int asBinder = 0;
        private static int onTransact = 1;
        private final String IAuthTabCallback;
        private final float IAuthTabCallbackDefault;
        private final float asInterface;
        private boolean onExtraCallback;
        private float onExtraCallbackWithResult;
        private float onNavigationEvent;
        private float onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onWarmupCompleted)) {
                return false;
            }
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) obj;
            if (!Intrinsics.areEqual(this.IAuthTabCallback, onwarmupcompleted.IAuthTabCallback)) {
                int i2 = onTransact + 9;
                asBinder = i2 % 128;
                return i2 % 2 != 0;
            }
            if (Float.compare(this.IAuthTabCallbackDefault, onwarmupcompleted.IAuthTabCallbackDefault) != 0 || Float.compare(this.asInterface, onwarmupcompleted.asInterface) != 0 || Float.compare(this.onExtraCallbackWithResult, onwarmupcompleted.onExtraCallbackWithResult) != 0) {
                return false;
            }
            if (Float.compare(this.onNavigationEvent, onwarmupcompleted.onNavigationEvent) != 0) {
                int i3 = asBinder + 97;
                onTransact = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }
            if (Float.compare(this.onWarmupCompleted, onwarmupcompleted.onWarmupCompleted) != 0) {
                return false;
            }
            if (this.onExtraCallback == onwarmupcompleted.onExtraCallback) {
                return true;
            }
            int i5 = onTransact + 21;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = asBinder + 39;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (((((((((((this.IAuthTabCallback.hashCode() * 31) + Float.hashCode(this.IAuthTabCallbackDefault)) * 31) + Float.hashCode(this.asInterface)) * 31) + Float.hashCode(this.onExtraCallbackWithResult)) * 31) + Float.hashCode(this.onNavigationEvent)) * 31) + Float.hashCode(this.onWarmupCompleted)) * 31) + Boolean.hashCode(this.onExtraCallback);
            int i4 = asBinder + 55;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "TouchPoint(id=" + this.IAuthTabCallback + ", x=" + this.IAuthTabCallbackDefault + ", y=" + this.asInterface + ", scale=" + this.onExtraCallbackWithResult + ", alpha=" + this.onNavigationEvent + ", rotation=" + this.onWarmupCompleted + ", isActive=" + this.onExtraCallback + ")";
            int i2 = asBinder + 67;
            onTransact = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            throw null;
        }

        public onWarmupCompleted(@NotNull String str, float f, float f2, float f3, float f4, float f5, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            this.IAuthTabCallback = str;
            this.IAuthTabCallbackDefault = f;
            this.asInterface = f2;
            this.onExtraCallbackWithResult = f3;
            this.onNavigationEvent = f4;
            this.onWarmupCompleted = f5;
            this.onExtraCallback = z;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ onWarmupCompleted(String str, float f, float f2, float f3, float f4, float f5, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            float f6;
            float f7;
            float f8;
            boolean z2;
            if ((i & 8) != 0) {
                int i2 = asBinder + 51;
                onTransact = i2 % 128;
                int i3 = i2 % 2;
                f6 = 1.0f;
            } else {
                f6 = f3;
            }
            if ((i & 16) != 0) {
                int i4 = asBinder + 53;
                onTransact = i4 % 128;
                float f9 = i4 % 2 == 0 ? 0.0f : 1.0f;
                int i5 = 2 % 2;
                f7 = f9;
            } else {
                f7 = f4;
            }
            if ((i & 32) != 0) {
                int i6 = 2 % 2;
                f8 = 0.0f;
            } else {
                f8 = f5;
            }
            if ((i & 64) != 0) {
                int i7 = onTransact + 13;
                asBinder = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 2 % 2;
                }
                z2 = true;
            } else {
                z2 = z;
            }
            this(str, f, f2, f6, f7, f8, z2);
        }

        public final String IAuthTabCallback() {
            String str;
            int i = 2 % 2;
            int i2 = onTransact;
            int i3 = i2 + 109;
            asBinder = i3 % 128;
            if (i3 % 2 != 0) {
                str = this.IAuthTabCallback;
                int i4 = 42 / 0;
            } else {
                str = this.IAuthTabCallback;
            }
            int i5 = i2 + 69;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final float onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onTransact + 9;
            int i3 = i2 % 128;
            asBinder = i3;
            int i4 = i2 % 2;
            float f = this.IAuthTabCallbackDefault;
            int i5 = i3 + 3;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            return f;
        }

        public final float IAuthTabCallbackDefault() {
            int i = 2 % 2;
            int i2 = onTransact;
            int i3 = i2 + 45;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            float f = this.asInterface;
            int i5 = i2 + 89;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            return f;
        }

        public final void IAuthTabCallback(float f) {
            int i = 2 % 2;
            int i2 = asBinder + 89;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            this.onExtraCallbackWithResult = f;
            if (i3 == 0) {
                throw null;
            }
        }

        public final float onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = asBinder + 25;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            float f = this.onExtraCallbackWithResult;
            if (i3 == 0) {
                int i4 = 11 / 0;
            }
            return f;
        }

        public final void onExtraCallbackWithResult(float f) {
            int i = 2 % 2;
            int i2 = onTransact + 123;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            this.onNavigationEvent = f;
            if (i3 != 0) {
                int i4 = 61 / 0;
            }
        }

        public final float onNavigationEvent() {
            float f;
            int i = 2 % 2;
            int i2 = asBinder + 97;
            int i3 = i2 % 128;
            onTransact = i3;
            if (i2 % 2 == 0) {
                f = this.onNavigationEvent;
                int i4 = 91 / 0;
            } else {
                f = this.onNavigationEvent;
            }
            int i5 = i3 + 85;
            asBinder = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 96 / 0;
            }
            return f;
        }

        public final float onExtraCallback() {
            int i = 2 % 2;
            int i2 = asBinder + 125;
            onTransact = i2 % 128;
            if (i2 % 2 != 0) {
                return this.onWarmupCompleted;
            }
            throw null;
        }

        public final void onNavigationEvent(float f) {
            int i = 2 % 2;
            int i2 = onTransact;
            int i3 = i2 + 125;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            this.onWarmupCompleted = f;
            int i5 = i2 + 13;
            asBinder = i5 % 128;
            if (i5 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static /* synthetic */ float onNavigationEvent(AnrDetailsCollectorcollectAnrErrorDetails1 anrDetailsCollectorcollectAnrErrorDetails1) {
        int iIAuthTabCallback = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback2 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        return ((Float) onExtraCallbackWithResult(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback, 1103161494, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -1103161493, iIAuthTabCallback2, new Object[]{anrDetailsCollectorcollectAnrErrorDetails1})).floatValue();
    }

    public static /* synthetic */ void onExtraCallback(AnrDetailsCollectorcollectAnrErrorDetails1 anrDetailsCollectorcollectAnrErrorDetails1, String str) {
        int iIAuthTabCallback = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback2 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        onExtraCallbackWithResult(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback, -207509582, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 207509582, iIAuthTabCallback2, new Object[]{anrDetailsCollectorcollectAnrErrorDetails1, str});
    }

    public static /* synthetic */ void onWarmupCompleted(AnrDetailsCollectorcollectAnrErrorDetails1 anrDetailsCollectorcollectAnrErrorDetails1) {
        int iIAuthTabCallback = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback2 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        onExtraCallbackWithResult(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback, 1690613731, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -1690613728, iIAuthTabCallback2, new Object[]{anrDetailsCollectorcollectAnrErrorDetails1});
    }

    private final FloatBuffer onNavigationEvent() {
        int iIAuthTabCallback = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback2 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        return (FloatBuffer) onExtraCallbackWithResult(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback, 156016837, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -156016835, iIAuthTabCallback2, new Object[]{this});
    }
}
