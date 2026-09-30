package im.toss.uikit.gradient;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.view.View;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.deprecated_noStore;
import o.setTagsokhttp;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TdsAngularGradientView extends View {
    private static int IAuthTabCallbackStubProxy = 1;
    private static int getInterfaceDescriptor;
    private float IAuthTabCallback;
    private final Paint IAuthTabCallbackDefault;
    private float IAuthTabCallbackStub;
    private float asBinder;
    private boolean asInterface;
    private int[] onExtraCallback;
    private float onExtraCallbackWithResult;
    private float[] onNavigationEvent;
    private final Path onTransact;
    private float onWarmupCompleted;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsAngularGradientView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsAngularGradientView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TdsAngularGradientView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.onExtraCallback = new int[]{Color.parseColor("#FF0000"), Color.parseColor("#D0FF00"), Color.parseColor("#00FFEA"), Color.parseColor("#FF0080"), Color.parseColor("#0062FF")};
        this.onNavigationEvent = new float[]{0.0f, 0.25f, 0.5f, 0.75f, 1.0f};
        this.IAuthTabCallbackStub = 90.0f;
        this.asBinder = setTagsokhttp.onExtraCallbackWithResult(this, Double.valueOf(1.5d));
        this.onWarmupCompleted = setTagsokhttp.onExtraCallbackWithResult(this, 16);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(this.asBinder);
        this.IAuthTabCallbackDefault = paint;
        this.onTransact = new Path();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TdsAngularGradientView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = getInterfaceDescriptor + 115;
            IAuthTabCallbackStubProxy = i3 % 128;
            int i4 = i3 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i5 = IAuthTabCallbackStubProxy;
            int i6 = i5 + 57;
            getInterfaceDescriptor = i6 % 128;
            int i7 = i6 % 2;
            int i8 = i5 + 107;
            getInterfaceDescriptor = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 5 / 5;
            } else {
                int i10 = 2 % 2;
            }
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public final void setUseNativePath(boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 95;
        getInterfaceDescriptor = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            this.asInterface = z;
            invalidate();
            int i3 = IAuthTabCallbackStubProxy + 109;
            getInterfaceDescriptor = i3 % 128;
            if (i3 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        this.asInterface = z;
        invalidate();
        obj.hashCode();
        throw null;
    }

    public final void setStartAngle(float f) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 45;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        this.IAuthTabCallbackStub = f;
        IAuthTabCallback();
        invalidate();
        int i4 = getInterfaceDescriptor + 23;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setColors(@NotNull int[] iArr) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 59;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iArr, "");
        int length = iArr.length;
        float[] fArr = this.onNavigationEvent;
        if (length != fArr.length) {
            throw new IllegalArgumentException(("colors 배열 크기(" + iArr.length + ")와 positions 크기(" + fArr.length + ")가 달라요.").toString());
        }
        int i4 = getInterfaceDescriptor + 13;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        this.onExtraCallback = iArr;
        IAuthTabCallback();
        invalidate();
        int i6 = getInterfaceDescriptor + 109;
        IAuthTabCallbackStubProxy = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0062, code lost:
    
        throw new java.lang.IllegalArgumentException(("positions 배열 크기(" + r6.length + ")와 colors 크기(" + r2.length + ")가 달라요.").toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
    
        if (r1 == r2.length) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        if (r1 == r2.length) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        r5.onNavigationEvent = r6;
        IAuthTabCallback();
        invalidate();
        r6 = im.toss.uikit.gradient.TdsAngularGradientView.getInterfaceDescriptor + 79;
        im.toss.uikit.gradient.TdsAngularGradientView.IAuthTabCallbackStubProxy = r6 % 128;
        r6 = r6 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setPositions(@NotNull float[] fArr) {
        int[] iArr;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 5;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(fArr, "");
            int length = fArr.length;
            iArr = this.onExtraCallback;
            int i3 = 42 / 0;
        } else {
            Intrinsics.checkNotNullParameter(fArr, "");
            int length2 = fArr.length;
            iArr = this.onExtraCallback;
        }
    }

    public final void setStrokeWidth(float f) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 67;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        this.asBinder = f;
        this.IAuthTabCallbackDefault.setStrokeWidth(f);
        invalidate();
        int i4 = IAuthTabCallbackStubProxy + 75;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 64 / 0;
        }
    }

    public final void setCornerRadius(float f) {
        int i = 2 % 2;
        this.onWarmupCompleted = f;
        this.onTransact.reset();
        RectF rectF = new RectF(0.0f, 0.0f, getWidth(), getHeight());
        Path path = this.onTransact;
        float f2 = this.onWarmupCompleted;
        path.addRoundRect(rectF, f2, f2, Path.Direction.CW);
        invalidate();
        int i2 = IAuthTabCallbackStubProxy + 85;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
    }

    public static /* synthetic */ void onWarmupCompleted(TdsAngularGradientView tdsAngularGradientView, int[] iArr, float[] fArr, float f, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 4) != 0) {
            int i3 = IAuthTabCallbackStubProxy + 65;
            int i4 = i3 % 128;
            getInterfaceDescriptor = i4;
            int i5 = i3 % 2;
            f = tdsAngularGradientView.onWarmupCompleted;
            int i6 = i4 + 41;
            IAuthTabCallbackStubProxy = i6 % 128;
            int i7 = i6 % 2;
        }
        tdsAngularGradientView.onExtraCallback(iArr, fArr, f);
    }

    public final void onExtraCallback(@NotNull int[] iArr, @NotNull float[] fArr, float f) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 19;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iArr, "");
        Intrinsics.checkNotNullParameter(fArr, "");
        this.onExtraCallback = iArr;
        this.onNavigationEvent = fArr;
        setCornerRadius(f);
        IAuthTabCallback();
        invalidate();
        int i4 = IAuthTabCallbackStubProxy + 113;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        super.onSizeChanged(i, i2, i3, i4);
        float f = i;
        this.IAuthTabCallback = f / 2.0f;
        float f2 = i2;
        this.onExtraCallbackWithResult = f2 / 2.0f;
        this.onTransact.reset();
        RectF rectF = new RectF(0.0f, 0.0f, f, f2);
        if (!this.asInterface) {
            this.onTransact.addPath(deprecated_noStore.onExtraCallbackWithResult(deprecated_noStore.onExtraCallback, f, f2, this.onWarmupCompleted, 0, false, 24, (Object) null));
            int i6 = IAuthTabCallbackStubProxy + 15;
            getInterfaceDescriptor = i6 % 128;
            int i7 = i6 % 2;
        } else {
            int i8 = IAuthTabCallbackStubProxy + 53;
            getInterfaceDescriptor = i8 % 128;
            int i9 = i8 % 2;
            Path path = this.onTransact;
            float f3 = this.onWarmupCompleted;
            path.addRoundRect(rectF, f3, f3, Path.Direction.CW);
        }
        IAuthTabCallback();
    }

    private final void IAuthTabCallback() {
        int i = 2 % 2;
        SweepGradient sweepGradient = new SweepGradient(this.IAuthTabCallback, this.onExtraCallbackWithResult, this.onExtraCallback, this.onNavigationEvent);
        Matrix matrix = new Matrix();
        matrix.setRotate(this.IAuthTabCallbackStub, this.IAuthTabCallback, this.onExtraCallbackWithResult);
        sweepGradient.setLocalMatrix(matrix);
        this.IAuthTabCallbackDefault.setShader(sweepGradient);
        int i2 = IAuthTabCallbackStubProxy + 35;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 123;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(canvas, "");
        super.onDraw(canvas);
        canvas.drawPath(this.onTransact, this.IAuthTabCallbackDefault);
        int i4 = getInterfaceDescriptor + 111;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }
}
