package im.toss.core.webkit.bridge.image.crop;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import im.toss.observability.instrumentation.memory.PssReader$;
import im.toss.uikit.R;
import java.util.concurrent.Callable;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.getBacktraceNoteBytes;
import o.getWrite;
import o.writeRaw;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class PinchImageView extends AppCompatImageView {
    private static int IAuthTabCallback_Parcel = 0;
    private static int getInterfaceDescriptor = 1;
    private final boolean IAuthTabCallback;
    private final Matrix IAuthTabCallbackDefault;
    private float IAuthTabCallbackStub;
    private final ScaleGestureDetector IAuthTabCallbackStubProxy;
    private final Matrix access000;
    private final Matrix asBinder;
    private float asInterface;
    private final onWarmupCompleted onExtraCallback;
    private final GestureDetector onExtraCallbackWithResult;
    private float onNavigationEvent;
    private final Matrix onTransact;
    private View onWarmupCompleted;

    public interface onExtraCallbackWithResult {
        void onExtraCallback(float f, float f2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PinchImageView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PinchImageView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ void IAuthTabCallback(PinchImageView pinchImageView, Drawable drawable) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 119;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(pinchImageView, drawable);
        int i4 = getInterfaceDescriptor + 61;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 43 / 0;
        }
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = (~((~i) | i2)) | (~(i | i6));
        int i8 = ~i2;
        int i9 = (~(i8 | i6)) | i;
        int i10 = (~(i6 | i2)) | (~(i8 | (~i6))) | i;
        int i11 = i2 + i + i5 + ((-737137436) * i4) + ((-1840598144) * i3);
        int i12 = i11 * i11;
        int i13 = (((-699670985) * i2) - 818937856) + (24099949 * i) + (723770934 * i7) + ((-1447541868) * i9) + ((-723770934) * i10) + ((-1423441920) * i5) + (1335885824 * i4) + ((-1946157056) * i3) + ((-1593638912) * i12);
        int i14 = (i2 * 1252406331) + 1981669868 + (i * 1252405337) + (i7 * (-994)) + (i9 * 1988) + (i10 * 994) + (i5 * 1252407325) + (i4 * (-1820396076)) + (i3 * 1320834432) + (i12 * (-447283200));
        int i15 = i13 + (i14 * i14 * 1511325696);
        if (i15 == 1) {
            return onExtraCallbackWithResult(objArr);
        }
        if (i15 == 2) {
            return onWarmupCompleted(objArr);
        }
        if (i15 != 3) {
            return i15 != 4 ? i15 != 5 ? onNavigationEvent(objArr) : onExtraCallback(objArr) : IAuthTabCallback(objArr);
        }
        final PinchImageView pinchImageView = (PinchImageView) objArr[0];
        final int iIntValue = ((Number) objArr[1]).intValue();
        int i16 = 2 % 2;
        writeRaw writerawOnNavigationEvent = writeRaw.onNavigationEvent(new Callable() { // from class: im.toss.core.webkit.bridge.image.crop.PinchImageView$$ExternalSyntheticLambda1
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            @Override // java.util.concurrent.Callable
            public final Object call() {
                Bitmap bitmapOnNavigationEvent;
                int i17 = 2 % 2;
                int i18 = onWarmupCompleted + 63;
                onNavigationEvent = i18 % 128;
                if (i18 % 2 != 0) {
                    bitmapOnNavigationEvent = PinchImageView.onNavigationEvent(this.f$0, iIntValue);
                    int i19 = 11 / 0;
                } else {
                    bitmapOnNavigationEvent = PinchImageView.onNavigationEvent(this.f$0, iIntValue);
                }
                int i20 = onWarmupCompleted + 101;
                onNavigationEvent = i20 % 128;
                if (i20 % 2 == 0) {
                    return bitmapOnNavigationEvent;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        Intrinsics.checkNotNullExpressionValue(writerawOnNavigationEvent, "");
        int i17 = IAuthTabCallback_Parcel + 71;
        getInterfaceDescriptor = i17 % 128;
        int i18 = i17 % 2;
        return writerawOnNavigationEvent;
    }

    public static /* synthetic */ Bitmap onNavigationEvent(PinchImageView pinchImageView, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 105;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        Bitmap bitmapIAuthTabCallback = IAuthTabCallback(pinchImageView, i);
        if (i4 == 0) {
            int i5 = 86 / 0;
        }
        int i6 = IAuthTabCallback_Parcel + 5;
        getInterfaceDescriptor = i6 % 128;
        if (i6 % 2 != 0) {
            return bitmapIAuthTabCallback;
        }
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PinchImageView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.IAuthTabCallbackStub = 5.0f;
        this.asInterface = 0.1f;
        this.onNavigationEvent = 0.85f;
        this.onTransact = new Matrix();
        this.IAuthTabCallbackDefault = new Matrix();
        this.asBinder = new Matrix();
        this.access000 = new Matrix();
        this.IAuthTabCallbackStubProxy = new ScaleGestureDetector(context, new asBinder());
        onWarmupCompleted onwarmupcompleted = new onWarmupCompleted();
        onwarmupcompleted.onWarmupCompleted(new IAuthTabCallback());
        this.onExtraCallback = onwarmupcompleted;
        GestureDetector gestureDetector = new GestureDetector(context, new onNavigationEvent());
        gestureDetector.setOnDoubleTapListener(new onExtraCallback());
        this.onExtraCallbackWithResult = gestureDetector;
        setAdjustViewBounds(true);
        setScaleType(ImageView.ScaleType.MATRIX);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.PinchImageView, 0, 0);
        this.onNavigationEvent = typedArrayObtainStyledAttributes.getFloat(R.styleable.PinchImageView_default_scale, this.onNavigationEvent);
        int i2 = R.styleable.PinchImageView_max_scale;
        this.IAuthTabCallbackStub = typedArrayObtainStyledAttributes.getFloat(i2, this.IAuthTabCallbackStub);
        this.asInterface = typedArrayObtainStyledAttributes.getFloat(i2, this.asInterface);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static final /* synthetic */ float IAuthTabCallback(PinchImageView pinchImageView, MotionEvent motionEvent, int i, float f) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 111;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {pinchImageView, motionEvent, Integer.valueOf(i), Float.valueOf(f)};
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted2 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        float fFloatValue = ((Float) onExtraCallback(-1007694102, 1007694102, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted2, iOnWarmupCompleted, objArr)).floatValue();
        int i5 = IAuthTabCallback_Parcel + 93;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 64 / 0;
        }
        return fFloatValue;
    }

    public static final /* synthetic */ PointF IAuthTabCallback(PinchImageView pinchImageView, PointF pointF, Matrix matrix, View view) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 27;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        PointF pointFIAuthTabCallback = pinchImageView.IAuthTabCallback(pointF, matrix, view);
        int i4 = IAuthTabCallback_Parcel + 49;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            return pointFIAuthTabCallback;
        }
        throw null;
    }

    public static final /* synthetic */ Rect IAuthTabCallback(PinchImageView pinchImageView, View view) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 45;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
            int iOnWarmupCompleted2 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
            int iOnWarmupCompleted3 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
            return (Rect) onExtraCallback(-776437368, 776437370, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted3, iOnWarmupCompleted2, iOnWarmupCompleted, new Object[]{pinchImageView, view});
        }
        int iOnWarmupCompleted4 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted5 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted6 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ float onExtraCallback(PinchImageView pinchImageView) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 35;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        int i4 = i2 % 2;
        float f = pinchImageView.IAuthTabCallbackStub;
        if (i4 != 0) {
            int i5 = 8 / 0;
        }
        int i6 = i3 + 29;
        getInterfaceDescriptor = i6 % 128;
        if (i6 % 2 != 0) {
            return f;
        }
        throw null;
    }

    public static final /* synthetic */ float onExtraCallback(PinchImageView pinchImageView, MotionEvent motionEvent, int i, float f) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 51;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        float fOnNavigationEvent = pinchImageView.onNavigationEvent(motionEvent, i, f);
        int i5 = getInterfaceDescriptor + 73;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            return fOnNavigationEvent;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        PinchImageView pinchImageView = (PinchImageView) objArr[0];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 73;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        View view = pinchImageView.onWarmupCompleted;
        if (i3 == 0) {
            return view;
        }
        throw null;
    }

    public static final /* synthetic */ Matrix onExtraCallbackWithResult(PinchImageView pinchImageView) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 11;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Matrix matrix = pinchImageView.IAuthTabCallbackDefault;
        if (i3 == 0) {
            return matrix;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ PointF onExtraCallbackWithResult(PinchImageView pinchImageView, PointF pointF, Matrix matrix, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 107;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        PointF pointFOnExtraCallbackWithResult = pinchImageView.onExtraCallbackWithResult(pointF, matrix, view);
        if (i3 == 0) {
            int i4 = 1 / 0;
        }
        int i5 = getInterfaceDescriptor + 115;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 90 / 0;
        }
        return pointFOnExtraCallbackWithResult;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(PinchImageView pinchImageView, Drawable drawable) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 19;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted2 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted3 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        onExtraCallback(-107562073, 107562074, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted3, iOnWarmupCompleted2, iOnWarmupCompleted, new Object[]{pinchImageView, drawable});
        int i4 = getInterfaceDescriptor + 69;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Matrix onNavigationEvent(PinchImageView pinchImageView) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 49;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        int i4 = i2 % 2;
        Matrix matrix = pinchImageView.asBinder;
        int i5 = i3 + 113;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 90 / 0;
        }
        return matrix;
    }

    public static final /* synthetic */ Matrix onTransact(PinchImageView pinchImageView) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 107;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        Matrix matrix = pinchImageView.access000;
        if (i4 != 0) {
            int i5 = 28 / 0;
        }
        int i6 = i2 + 119;
        IAuthTabCallback_Parcel = i6 % 128;
        int i7 = i6 % 2;
        return matrix;
    }

    public static final /* synthetic */ float onWarmupCompleted(PinchImageView pinchImageView) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 9;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        float f = pinchImageView.asInterface;
        if (i3 == 0) {
            return f;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ boolean onWarmupCompleted(PinchImageView pinchImageView, View view, Matrix matrix) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 113;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted2 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted3 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        boolean zBooleanValue = ((Boolean) onExtraCallback(-1512807759, 1512807763, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted3, iOnWarmupCompleted2, iOnWarmupCompleted, new Object[]{pinchImageView, view, matrix})).booleanValue();
        int i4 = IAuthTabCallback_Parcel + 125;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PinchImageView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = IAuthTabCallback_Parcel + 23;
            getInterfaceDescriptor = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i4 = 2 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i5 = getInterfaceDescriptor + 65;
            IAuthTabCallback_Parcel = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public static final class asBinder extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        asBinder() {
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x00fe A[PHI: r1
          0x00fe: PHI (r1v8 float) = (r1v6 float), (r1v12 float) binds: [B:8:0x0090, B:5:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0092 A[PHI: r1 r2
          0x0092: PHI (r1v7 float) = (r1v6 float), (r1v12 float) binds: [B:8:0x0090, B:5:0x0050] A[DONT_GENERATE, DONT_INLINE]
          0x0092: PHI (r2v7 android.view.View) = (r2v6 android.view.View), (r2v20 android.view.View) binds: [B:8:0x0090, B:5:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Type inference failed for: r11v6, types: [android.widget.ImageView, im.toss.core.webkit.bridge.image.crop.PinchImageView] */
        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            float fMax;
            View view;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 111;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(scaleGestureDetector, "");
                fMax = Math.max(PinchImageView.onWarmupCompleted(PinchImageView.this), Math.min(scaleGestureDetector.getScaleFactor(), PinchImageView.onExtraCallback(PinchImageView.this)));
                Object[] objArr = {PinchImageView.this};
                int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
                view = (View) PinchImageView.onExtraCallback(666834653, -666834648, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted, objArr);
                int i3 = 3 / 0;
                if (view != null) {
                    PinchImageView pinchImageView = PinchImageView.this;
                    PinchImageView.onTransact(pinchImageView).set(PinchImageView.onExtraCallbackWithResult(pinchImageView));
                    Rect rectIAuthTabCallback = PinchImageView.IAuthTabCallback(pinchImageView, view);
                    float f = (rectIAuthTabCallback.left + rectIAuthTabCallback.right) / 2.0f;
                    PointF pointFOnExtraCallbackWithResult = PinchImageView.onExtraCallbackWithResult(pinchImageView, new PointF(f, f), PinchImageView.onTransact(pinchImageView), view);
                    PinchImageView.onTransact(pinchImageView).postScale(fMax, fMax, pointFOnExtraCallbackWithResult.x, pointFOnExtraCallbackWithResult.y);
                    if (PinchImageView.onWarmupCompleted(pinchImageView, view, PinchImageView.onTransact(pinchImageView))) {
                        int i4 = onNavigationEvent + 41;
                        onExtraCallbackWithResult = i4 % 128;
                        if (i4 % 2 != 0) {
                            PinchImageView.onExtraCallbackWithResult(pinchImageView).postScale(fMax, fMax, pointFOnExtraCallbackWithResult.x, pointFOnExtraCallbackWithResult.y);
                            throw null;
                        }
                        PinchImageView.onExtraCallbackWithResult(pinchImageView).postScale(fMax, fMax, pointFOnExtraCallbackWithResult.x, pointFOnExtraCallbackWithResult.y);
                    } else {
                        PinchImageView.onExtraCallbackWithResult(pinchImageView).set(PinchImageView.onNavigationEvent(pinchImageView));
                    }
                } else {
                    PinchImageView.onExtraCallbackWithResult(PinchImageView.this).postScale(fMax, fMax, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
                    int i5 = onExtraCallbackWithResult + 89;
                    onNavigationEvent = i5 % 128;
                    int i6 = i5 % 2;
                }
            } else {
                Intrinsics.checkNotNullParameter(scaleGestureDetector, "");
                fMax = Math.max(PinchImageView.onWarmupCompleted(PinchImageView.this), Math.min(scaleGestureDetector.getScaleFactor(), PinchImageView.onExtraCallback(PinchImageView.this)));
                Object[] objArr2 = {PinchImageView.this};
                int iOnWarmupCompleted2 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
                view = (View) PinchImageView.onExtraCallback(666834653, -666834648, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted2, objArr2);
                if (view != null) {
                }
            }
            ?? r11 = PinchImageView.this;
            r11.setImageMatrix(PinchImageView.onExtraCallbackWithResult((PinchImageView) r11));
            return true;
        }
    }

    public static final class IAuthTabCallback implements onExtraCallbackWithResult {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;

        IAuthTabCallback() {
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0055  */
        /* JADX WARN: Type inference failed for: r10v7, types: [android.widget.ImageView, im.toss.core.webkit.bridge.image.crop.PinchImageView] */
        @Override // im.toss.core.webkit.bridge.image.crop.PinchImageView.onExtraCallbackWithResult
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onExtraCallback(float f, float f2) {
            PointF pointF;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 63;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                Object[] objArr = {PinchImageView.this};
                int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
                int iOnWarmupCompleted2 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
                View view = (View) PinchImageView.onExtraCallback(666834653, -666834648, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted2, iOnWarmupCompleted, objArr);
                if (view != null) {
                    PinchImageView pinchImageView = PinchImageView.this;
                    PinchImageView.onTransact(pinchImageView).set(PinchImageView.onExtraCallbackWithResult(pinchImageView));
                    PinchImageView.onTransact(pinchImageView).postTranslate(f, f2);
                    pointF = PinchImageView.IAuthTabCallback(pinchImageView, new PointF(f, f2), PinchImageView.onTransact(pinchImageView), view);
                    if (pointF == null) {
                        pointF = new PointF(f, f2);
                    }
                }
                PinchImageView.onExtraCallbackWithResult(PinchImageView.this).postTranslate(pointF.x, pointF.y);
                ?? r10 = PinchImageView.this;
                r10.setImageMatrix(PinchImageView.onExtraCallbackWithResult((PinchImageView) r10));
                int i3 = onExtraCallback + 55;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 2 / 0;
                    return;
                }
                return;
            }
            Object[] objArr2 = {PinchImageView.this};
            int iOnWarmupCompleted3 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
            int iOnWarmupCompleted4 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
            throw null;
        }
    }

    public static final class onNavigationEvent extends GestureDetector.SimpleOnGestureListener {
        onNavigationEvent() {
        }
    }

    public static final class onExtraCallback implements GestureDetector.OnDoubleTapListener {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 37;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(motionEvent, "");
            int i4 = onNavigationEvent + 9;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 3;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(motionEvent, "");
            int i4 = IAuthTabCallback + 29;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        onExtraCallback() {
        }

        /* JADX WARN: Type inference failed for: r5v1, types: [android.widget.ImageView, im.toss.core.webkit.bridge.image.crop.PinchImageView] */
        @Override // android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTapEvent(MotionEvent motionEvent) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 125;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(motionEvent, "");
            ?? r5 = PinchImageView.this;
            Drawable drawable = r5.getDrawable();
            if (drawable != null) {
                int i4 = IAuthTabCallback + 47;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                PinchImageView.onExtraCallbackWithResult((PinchImageView) r5, drawable);
            }
            int i6 = IAuthTabCallback + 13;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 == 0) {
                return true;
            }
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
    
        if ((!r1) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
    
        r6 = r6 + 77;
        im.toss.core.webkit.bridge.image.crop.PinchImageView.IAuthTabCallback_Parcel = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002f, code lost:
    
        if (r1 == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(@NotNull MotionEvent motionEvent) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(motionEvent, "");
        boolean zOnTouchEvent = this.IAuthTabCallbackStubProxy.onTouchEvent(motionEvent);
        boolean zOnTouchEvent2 = this.onExtraCallbackWithResult.onTouchEvent(motionEvent);
        boolean zIAuthTabCallback = this.onExtraCallback.IAuthTabCallback(motionEvent);
        if ((!zOnTouchEvent2) && !zIAuthTabCallback) {
            int i2 = getInterfaceDescriptor;
            int i3 = i2 + 21;
            IAuthTabCallback_Parcel = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 27 / 0;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setImageDrawable(@Nullable final Drawable drawable) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 9;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            super.setImageDrawable(drawable);
            if (drawable != null) {
                post(new Runnable() { // from class: im.toss.core.webkit.bridge.image.crop.PinchImageView$$ExternalSyntheticLambda0
                    private static int onNavigationEvent = 0;
                    private static int onWarmupCompleted = 1;

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i3 = 2 % 2;
                        int i4 = onNavigationEvent + 57;
                        onWarmupCompleted = i4 % 128;
                        if (i4 % 2 == 0) {
                            PinchImageView.IAuthTabCallback(this.f$0, drawable);
                            throw null;
                        }
                        PinchImageView.IAuthTabCallback(this.f$0, drawable);
                        int i5 = onNavigationEvent + 31;
                        onWarmupCompleted = i5 % 128;
                        if (i5 % 2 == 0) {
                            int i6 = 13 / 0;
                        }
                    }
                });
            }
            int i3 = IAuthTabCallback_Parcel + 119;
            getInterfaceDescriptor = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        super.setImageDrawable(drawable);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void onWarmupCompleted(PinchImageView pinchImageView, Drawable drawable) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 39;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted2 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted3 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        onExtraCallback(-107562073, 107562074, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted3, iOnWarmupCompleted2, iOnWarmupCompleted, new Object[]{pinchImageView, drawable});
        int i4 = IAuthTabCallback_Parcel + 75;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View, android.widget.ImageView, im.toss.core.webkit.bridge.image.crop.PinchImageView] */
    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        ?? r0 = (PinchImageView) objArr[0];
        Drawable drawable = (Drawable) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 51;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = r0.IAuthTabCallback(r0);
        int iOnWarmupCompleted = r0.onWarmupCompleted(r0);
        float f = iIAuthTabCallback;
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float f2 = iOnWarmupCompleted;
        float intrinsicHeight = drawable.getIntrinsicHeight();
        float fMin = Math.min(f / intrinsicWidth, f2 / intrinsicHeight) * ((PinchImageView) r0).onNavigationEvent;
        ((PinchImageView) r0).onTransact.reset();
        ((PinchImageView) r0).onTransact.postScale(fMin, fMin);
        ((PinchImageView) r0).onTransact.postTranslate((f - (intrinsicWidth * fMin)) / 2.0f, (f2 - (intrinsicHeight * fMin)) / 2.0f);
        ((PinchImageView) r0).IAuthTabCallbackDefault.set(((PinchImageView) r0).onTransact);
        View view = ((PinchImageView) r0).onWarmupCompleted;
        if (view != null) {
            float fIAuthTabCallback = r0.IAuthTabCallback(view);
            float fOnWarmupCompleted = r0.onWarmupCompleted(view);
            float fMax = Math.max(fIAuthTabCallback / intrinsicWidth, fOnWarmupCompleted / intrinsicHeight);
            ((PinchImageView) r0).asBinder.reset();
            ((PinchImageView) r0).asBinder.postScale(fMax, fMax);
            ((PinchImageView) r0).asBinder.postTranslate(view.getLeft() + ((fIAuthTabCallback - (intrinsicWidth * fMax)) / 2.0f), view.getTop() + ((fOnWarmupCompleted - (intrinsicHeight * fMax)) / 2.0f));
            int i4 = IAuthTabCallback_Parcel + 21;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
        }
        if (r0.onNavigationEvent(((PinchImageView) r0).asBinder).contains(r0.onNavigationEvent(((PinchImageView) r0).onTransact))) {
            ((PinchImageView) r0).onTransact.set(((PinchImageView) r0).asBinder);
            ((PinchImageView) r0).IAuthTabCallbackDefault.set(((PinchImageView) r0).asBinder);
        }
        r0.setImageMatrix(((PinchImageView) r0).onTransact);
        return null;
    }

    private final int IAuthTabCallback(View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 103;
        getInterfaceDescriptor = i2 % 128;
        int width = i2 % 2 == 0 ? (view.getWidth() << view.getPaddingLeft()) / view.getPaddingRight() : (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
        int i3 = getInterfaceDescriptor + 45;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 == 0) {
            return width;
        }
        throw null;
    }

    private final int onWarmupCompleted(View view) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 85;
        IAuthTabCallback_Parcel = i2 % 128;
        int height = i2 % 2 != 0 ? (view.getHeight() % view.getPaddingTop()) / view.getPaddingBottom() : (view.getHeight() - view.getPaddingTop()) - view.getPaddingBottom();
        int i3 = IAuthTabCallback_Parcel + 79;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 14 / 0;
        }
        return height;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setBound(@NotNull View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 3;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        this.onWarmupCompleted = view;
        Drawable drawable = getDrawable();
        if (drawable != null) {
            int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
            int iOnWarmupCompleted2 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
            int iOnWarmupCompleted3 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
            onExtraCallback(-107562073, 107562074, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted3, iOnWarmupCompleted2, iOnWarmupCompleted, new Object[]{this, drawable});
            int i4 = IAuthTabCallback_Parcel + 19;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public static /* synthetic */ writeRaw onWarmupCompleted(PinchImageView pinchImageView, int i, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = getInterfaceDescriptor + 109;
        int i5 = i4 % 128;
        IAuthTabCallback_Parcel = i5;
        int i6 = i4 % 2;
        if ((i2 & 1) != 0) {
            int i7 = i5 + 73;
            getInterfaceDescriptor = i7 % 128;
            int i8 = i7 % 2;
            i = -1;
        }
        Object[] objArr = {pinchImageView, Integer.valueOf(i)};
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted2 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        return (writeRaw) onExtraCallback(-508259950, 508259953, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted2, iOnWarmupCompleted, objArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Bitmap IAuthTabCallback(PinchImageView pinchImageView, int i) {
        Rect rect;
        int i2 = 2 % 2;
        int width = pinchImageView.getWidth();
        int height = pinchImageView.getHeight();
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, config);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "");
        pinchImageView.draw(new Canvas(bitmapCreateBitmap));
        View view = pinchImageView.onWarmupCompleted;
        if (view != null) {
            int i3 = IAuthTabCallback_Parcel + 35;
            getInterfaceDescriptor = i3 % 128;
            if (i3 % 2 == 0) {
                int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
                int iOnWarmupCompleted2 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int iOnWarmupCompleted3 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
            int iOnWarmupCompleted4 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
            rect = (Rect) onExtraCallback(-776437368, 776437370, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted4, iOnWarmupCompleted3, new Object[]{pinchImageView, view});
            if (rect == null) {
                int iOnWarmupCompleted5 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
                int iOnWarmupCompleted6 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
                rect = (Rect) onExtraCallback(-776437368, 776437370, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted6, iOnWarmupCompleted5, new Object[]{pinchImageView, pinchImageView});
                int i4 = IAuthTabCallback_Parcel + 23;
                getInterfaceDescriptor = i4 % 128;
                int i5 = i4 % 2;
            }
        }
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(rect.width(), rect.height(), config);
        Canvas canvas = new Canvas(bitmapCreateBitmap2);
        Paint paint = new Paint(7);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmapCreateBitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate(-rect.left, -rect.top);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawRect(0.0f, 0.0f, rect.width(), rect.height(), paint);
        if (i > 0) {
            Matrix matrix2 = new Matrix();
            float fMax = i / Math.max(bitmapCreateBitmap2.getWidth(), bitmapCreateBitmap2.getHeight());
            matrix2.postScale(fMax, fMax);
            Bitmap bitmapCreateBitmap3 = Bitmap.createBitmap(bitmapCreateBitmap2, 0, 0, rect.width(), rect.height(), matrix2, true);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap3, "");
            bitmapCreateBitmap2.recycle();
            int i6 = IAuthTabCallback_Parcel + 11;
            getInterfaceDescriptor = i6 % 128;
            int i7 = i6 % 2;
            bitmapCreateBitmap2 = bitmapCreateBitmap3;
        } else {
            Intrinsics.checkNotNull(bitmapCreateBitmap2);
        }
        bitmapCreateBitmap.recycle();
        return bitmapCreateBitmap2;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        View view = (View) objArr[1];
        int i = 2 % 2;
        Rect rect = new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        int i2 = getInterfaceDescriptor + 35;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            return rect;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        PinchImageView pinchImageView = (PinchImageView) objArr[0];
        View view = (View) objArr[1];
        Matrix matrix = (Matrix) objArr[2];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 121;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Rect rectOnNavigationEvent = pinchImageView.onNavigationEvent(matrix);
        Object[] objArr2 = {pinchImageView, view};
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted2 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted3 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted4 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        if (i3 == 0) {
            return Boolean.valueOf(rectOnNavigationEvent.contains((Rect) onExtraCallback(-776437368, 776437370, iOnWarmupCompleted4, iOnWarmupCompleted3, iOnWarmupCompleted2, iOnWarmupCompleted, objArr2)));
        }
        rectOnNavigationEvent.contains((Rect) onExtraCallback(-776437368, 776437370, iOnWarmupCompleted4, iOnWarmupCompleted3, iOnWarmupCompleted2, iOnWarmupCompleted, objArr2));
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final PointF IAuthTabCallback(PointF pointF, Matrix matrix, View view) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 121;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted2 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        Rect rect = (Rect) onExtraCallback(-776437368, 776437370, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted2, iOnWarmupCompleted, new Object[]{this, view});
        RectF rectFOnExtraCallbackWithResult = onExtraCallbackWithResult(matrix);
        float f = pointF.x;
        float f2 = pointF.y;
        if (rect.top < rectFOnExtraCallbackWithResult.top || rect.bottom > rectFOnExtraCallbackWithResult.bottom) {
            f2 = 0.0f;
        }
        if (rect.left >= rectFOnExtraCallbackWithResult.left) {
            int i4 = IAuthTabCallback_Parcel + 29;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
            if (rect.right > rectFOnExtraCallbackWithResult.right) {
                f = 0.0f;
            }
        }
        return new PointF(f, f2);
    }

    private final PointF onExtraCallbackWithResult(PointF pointF, Matrix matrix, View view) {
        int i = 2 % 2;
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted2 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted3 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        Rect rect = (Rect) onExtraCallback(-776437368, 776437370, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted3, iOnWarmupCompleted2, iOnWarmupCompleted, new Object[]{this, view});
        RectF rectFOnExtraCallbackWithResult = onExtraCallbackWithResult(matrix);
        RectF rectF = new RectF(rectFOnExtraCallbackWithResult.left * 1.03f, rectFOnExtraCallbackWithResult.top * 1.03f, rectFOnExtraCallbackWithResult.right * 0.97f, rectFOnExtraCallbackWithResult.bottom * 0.97f);
        float f = pointF.x;
        float f2 = pointF.y;
        if (rect.top < ((int) rectF.top)) {
            int i2 = getInterfaceDescriptor + 125;
            IAuthTabCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
            f2 = rectFOnExtraCallbackWithResult.top;
        }
        if (rect.bottom > getBacktraceNoteBytes.onExtraCallback(rectF.bottom)) {
            f2 = rectFOnExtraCallbackWithResult.bottom;
        }
        if (rect.left < ((int) rectF.left)) {
            f = rectFOnExtraCallbackWithResult.left;
            int i4 = IAuthTabCallback_Parcel + 111;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
        }
        if (rect.right > getBacktraceNoteBytes.onExtraCallback(rectF.right)) {
            f = rectFOnExtraCallbackWithResult.right;
            int i6 = IAuthTabCallback_Parcel + 53;
            getInterfaceDescriptor = i6 % 128;
            int i7 = i6 % 2;
        }
        PointF pointF2 = new PointF(f, f2);
        int i8 = getInterfaceDescriptor + 43;
        IAuthTabCallback_Parcel = i8 % 128;
        int i9 = i8 % 2;
        return pointF2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final RectF onExtraCallbackWithResult(Matrix matrix) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 63;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        if (getDrawable() == null) {
            return new RectF();
        }
        RectF rectF = new RectF(0.0f, 0.0f, r1.getIntrinsicWidth(), r1.getIntrinsicHeight());
        matrix.mapRect(rectF);
        int i4 = getInterfaceDescriptor + 13;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return rectF;
    }

    private final Rect onNavigationEvent(Matrix matrix) {
        int i = 2 % 2;
        Rect rect = new Rect();
        onExtraCallbackWithResult(matrix).round(rect);
        int i2 = IAuthTabCallback_Parcel + 55;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        return rect;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setScaleType(@Nullable ImageView.ScaleType scaleType) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 61;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super/*android.widget.ImageView*/.setScaleType(ImageView.ScaleType.MATRIX);
        int i4 = IAuthTabCallback_Parcel + 123;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Matrix getImageMatrix() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel;
        int i3 = i2 + 17;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        Matrix matrix = this.IAuthTabCallbackDefault;
        int i5 = i2 + 99;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        return matrix;
    }

    public final class onWarmupCompleted {
        private static int IAuthTabCallbackDefault = 0;
        private static int IAuthTabCallbackStub = 1;
        private float IAuthTabCallback;
        private float onExtraCallbackWithResult;
        private onExtraCallbackWithResult onNavigationEvent;
        private int onWarmupCompleted = -1;

        public onWarmupCompleted() {
        }

        public final boolean IAuthTabCallback(@Nullable MotionEvent motionEvent) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 17;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            if (motionEvent == null) {
                return false;
            }
            int action = motionEvent.getAction();
            PinchImageView pinchImageView = PinchImageView.this;
            if (action == 0) {
                int actionIndex = motionEvent.getActionIndex();
                this.onExtraCallbackWithResult = PinchImageView.onExtraCallback(pinchImageView, motionEvent, actionIndex, this.onExtraCallbackWithResult);
                this.IAuthTabCallback = PinchImageView.IAuthTabCallback(pinchImageView, motionEvent, actionIndex, this.IAuthTabCallback);
                this.onWarmupCompleted = motionEvent.getPointerId(0);
                return true;
            }
            if (action != 1) {
                int i4 = IAuthTabCallbackDefault;
                int i5 = i4 + 35;
                IAuthTabCallbackStub = i5 % 128;
                int i6 = i5 % 2;
                if (action == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.onWarmupCompleted);
                    Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(Float.valueOf(PinchImageView.onExtraCallback(pinchImageView, motionEvent, iFindPointerIndex, this.IAuthTabCallback)), Float.valueOf(PinchImageView.IAuthTabCallback(pinchImageView, motionEvent, iFindPointerIndex, this.IAuthTabCallback)));
                    float fFloatValue = ((Number) pairIAuthTabCallback.onExtraCallbackWithResult()).floatValue();
                    float fFloatValue2 = ((Number) pairIAuthTabCallback.IAuthTabCallback()).floatValue();
                    float f = this.onExtraCallbackWithResult;
                    float f2 = this.IAuthTabCallback;
                    onExtraCallbackWithResult onextracallbackwithresult = this.onNavigationEvent;
                    if (onextracallbackwithresult != null) {
                        onextracallbackwithresult.onExtraCallback(fFloatValue - f, fFloatValue2 - f2);
                    }
                    this.onExtraCallbackWithResult = fFloatValue;
                    this.IAuthTabCallback = fFloatValue2;
                    return true;
                }
                int i7 = i4 + 51;
                int i8 = i7 % 128;
                IAuthTabCallbackStub = i8;
                if (i7 % 2 != 0 ? action != 3 : action != 4) {
                    if (action != 4) {
                        int i9 = i8 + 35;
                        IAuthTabCallbackDefault = i9 % 128;
                        if (i9 % 2 == 0 ? action != 6 : action != 20) {
                            return false;
                        }
                        int actionIndex2 = motionEvent.getActionIndex();
                        Integer numValueOf = Integer.valueOf(motionEvent.getPointerId(actionIndex2));
                        if ((numValueOf.intValue() == this.onWarmupCompleted ? numValueOf : null) != null) {
                            int i10 = actionIndex2 == 0 ? 1 : 0;
                            this.onExtraCallbackWithResult = PinchImageView.onExtraCallback(pinchImageView, motionEvent, i10, this.onExtraCallbackWithResult);
                            this.IAuthTabCallback = PinchImageView.IAuthTabCallback(pinchImageView, motionEvent, i10, this.IAuthTabCallback);
                            this.onWarmupCompleted = motionEvent.getPointerId(i10);
                        }
                        return true;
                    }
                }
            }
            this.onWarmupCompleted = -1;
            int i11 = IAuthTabCallbackDefault + 83;
            IAuthTabCallbackStub = i11 % 128;
            if (i11 % 2 != 0) {
                return true;
            }
            num.hashCode();
            throw null;
        }

        public final void onWarmupCompleted(@NotNull onExtraCallbackWithResult onextracallbackwithresult) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 29;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
                this.onNavigationEvent = onextracallbackwithresult;
            } else {
                Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
                this.onNavigationEvent = onextracallbackwithresult;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
    }

    private final float onNavigationEvent(MotionEvent motionEvent, int i, float f) {
        int i2 = 2 % 2;
        int i3 = getInterfaceDescriptor + 17;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        try {
            float x = motionEvent.getX(i);
            int i5 = getInterfaceDescriptor + 63;
            IAuthTabCallback_Parcel = i5 % 128;
            int i6 = i5 % 2;
            return x;
        } catch (Exception unused) {
            return f;
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        PinchImageView pinchImageView = (PinchImageView) objArr[0];
        MotionEvent motionEvent = (MotionEvent) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        float fFloatValue = ((Number) objArr[3]).floatValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 23;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        try {
            float y = motionEvent.getY(iIntValue);
            int i4 = IAuthTabCallback_Parcel + 91;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
            return Float.valueOf(y);
        } catch (Exception unused) {
            boolean z = pinchImageView.IAuthTabCallback;
            return Float.valueOf(fFloatValue);
        }
    }

    public static final /* synthetic */ View IAuthTabCallback(PinchImageView pinchImageView) {
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted2 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted3 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        return (View) onExtraCallback(666834653, -666834648, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted3, iOnWarmupCompleted2, iOnWarmupCompleted, new Object[]{pinchImageView});
    }

    private final Rect onExtraCallback(View view) {
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted2 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted3 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        return (Rect) onExtraCallback(-776437368, 776437370, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted3, iOnWarmupCompleted2, iOnWarmupCompleted, new Object[]{this, view});
    }

    private final boolean onExtraCallbackWithResult(View view, Matrix matrix) {
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted2 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted3 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        return ((Boolean) onExtraCallback(-1512807759, 1512807763, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted3, iOnWarmupCompleted2, iOnWarmupCompleted, new Object[]{this, view, matrix})).booleanValue();
    }

    private final void IAuthTabCallback(Drawable drawable) {
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted2 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted3 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        onExtraCallback(-107562073, 107562074, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted3, iOnWarmupCompleted2, iOnWarmupCompleted, new Object[]{this, drawable});
    }

    private final float onExtraCallback(MotionEvent motionEvent, int i, float f) {
        Object[] objArr = {this, motionEvent, Integer.valueOf(i), Float.valueOf(f)};
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted2 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        return ((Float) onExtraCallback(-1007694102, 1007694102, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted2, iOnWarmupCompleted, objArr)).floatValue();
    }

    public final writeRaw<Bitmap> onExtraCallbackWithResult(int i) {
        Object[] objArr = {this, Integer.valueOf(i)};
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted2 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        return (writeRaw) onExtraCallback(-508259950, 508259953, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted2, iOnWarmupCompleted, objArr);
    }
}
