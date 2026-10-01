package o;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import kotlin.Deprecated;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class isPrivate extends Drawable {
    private static int IAuthTabCallbackStub = 0;
    private static int IAuthTabCallbackStubProxy = 1;
    private float IAuthTabCallback;
    private boolean IAuthTabCallbackDefault;
    private boolean asBinder;
    private float asInterface;
    private float[] onExtraCallback;
    private int[] onExtraCallbackWithResult;
    private final Paint onNavigationEvent;
    private final float onTransact;
    private final Path onWarmupCompleted;

    public isPrivate() {
        this(null, null, false, 0.0f, 0.0f, 31, null);
    }

    @Override // android.graphics.drawable.Drawable
    @Deprecated
    public int getOpacity() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 23;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 87;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 82 / 0;
        }
        return -2;
    }

    public isPrivate(@NotNull int[] iArr, @NotNull float[] fArr, boolean z, float f, float f2) {
        Paint.Style style;
        Intrinsics.checkNotNullParameter(iArr, "");
        Intrinsics.checkNotNullParameter(fArr, "");
        this.onTransact = f2;
        this.onExtraCallbackWithResult = iArr;
        this.onExtraCallback = fArr;
        Intrinsics.checkNotNullExpressionValue(Resources.getSystem().getDisplayMetrics(), "");
        this.IAuthTabCallback = varyMatches.onNavigationEvent((Number) 16, r2);
        this.asBinder = z;
        this.asInterface = f;
        Paint paint = new Paint(1);
        if (z) {
            style = Paint.Style.STROKE;
        } else {
            style = Paint.Style.FILL;
            int i = IAuthTabCallbackStubProxy + 65;
            IAuthTabCallbackStub = i % 128;
            int i2 = i % 2;
            int i3 = 2 % 2;
        }
        paint.setStyle(style);
        paint.setStrokeWidth(this.asInterface);
        this.onNavigationEvent = paint;
        this.onWarmupCompleted = new Path();
        int i4 = IAuthTabCallbackStub + 37;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ isPrivate(int[] iArr, float[] fArr, boolean z, float f, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        int[] iArr2;
        float[] fArr2;
        float fOnNavigationEvent;
        float f3;
        boolean z2 = false;
        if ((i & 1) != 0) {
            int i2 = IAuthTabCallbackStubProxy + 1;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 != 0) {
                iArr2 = new int[]{Color.parseColor("#D0FF00"), Color.parseColor("#FF0000")};
                iArr2[4] = Color.parseColor("#00FFEA");
                iArr2[4] = Color.parseColor("#FF0080");
                iArr2[5] = Color.parseColor("#0062FF");
            } else {
                iArr2 = new int[]{Color.parseColor("#FF0000"), Color.parseColor("#D0FF00"), Color.parseColor("#00FFEA"), Color.parseColor("#FF0080"), Color.parseColor("#0062FF")};
            }
            int i3 = 2 % 2;
        } else {
            iArr2 = iArr;
        }
        if ((i & 2) != 0) {
            int i4 = IAuthTabCallbackStub + 49;
            int i5 = i4 % 128;
            IAuthTabCallbackStubProxy = i5;
            if (i4 % 2 == 0) {
                float[] fArr3 = {2.0f, 0.0f};
                fArr3[0] = 0.25f;
                fArr3[4] = 0.5f;
                fArr3[3] = 0.75f;
                fArr3[3] = 2.0f;
                fArr2 = fArr3;
            } else {
                fArr2 = new float[]{0.0f, 0.25f, 0.5f, 0.75f, 1.0f};
            }
            int i6 = i5 + 91;
            IAuthTabCallbackStub = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
        } else {
            fArr2 = fArr;
        }
        if ((i & 4) != 0) {
            int i9 = IAuthTabCallbackStubProxy + 117;
            IAuthTabCallbackStub = i9 % 128;
            int i10 = i9 % 2;
        } else {
            z2 = z;
        }
        if ((i & 8) != 0) {
            int i11 = IAuthTabCallbackStubProxy + 53;
            IAuthTabCallbackStub = i11 % 128;
            if (i11 % 2 != 0) {
                DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
                varyMatches.onNavigationEvent(Double.valueOf(1.5d), displayMetrics);
                throw null;
            }
            DisplayMetrics displayMetrics2 = Resources.getSystem().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
            fOnNavigationEvent = varyMatches.onNavigationEvent(Double.valueOf(1.5d), displayMetrics2);
            int i12 = 2 % 2;
        } else {
            fOnNavigationEvent = f;
        }
        if ((i & 16) != 0) {
            int i13 = IAuthTabCallbackStub + 65;
            IAuthTabCallbackStubProxy = i13 % 128;
            int i14 = i13 % 2;
            int i15 = 2 % 2;
            f3 = 90.0f;
        } else {
            f3 = f2;
        }
        this(iArr2, fArr2, z2, fOnNavigationEvent, f3);
    }

    public final void onExtraCallbackWithResult(float f) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 79;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        this.IAuthTabCallback = f;
        Rect bounds = getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "");
        onExtraCallback(bounds);
        invalidateSelf();
        int i4 = IAuthTabCallbackStubProxy + 5;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(@NotNull Rect rect) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 85;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(rect, "");
            super.onBoundsChange(rect);
            onExtraCallback(rect);
            onExtraCallbackWithResult(rect);
            return;
        }
        Intrinsics.checkNotNullParameter(rect, "");
        super.onBoundsChange(rect);
        onExtraCallback(rect);
        onExtraCallbackWithResult(rect);
        throw null;
    }

    private final void onExtraCallback(Rect rect) {
        int i = 2 % 2;
        this.onWarmupCompleted.reset();
        RectF rectF = new RectF(rect);
        if (!this.IAuthTabCallbackDefault) {
            this.onWarmupCompleted.addPath(deprecated_noStore.onExtraCallbackWithResult(deprecated_noStore.onExtraCallback, rectF.width(), rectF.height(), this.IAuthTabCallback, 0, false, 24, (Object) null));
            int i2 = IAuthTabCallbackStub + 123;
            IAuthTabCallbackStubProxy = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            return;
        }
        int i3 = IAuthTabCallbackStub + 55;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        Path path = this.onWarmupCompleted;
        float f = this.IAuthTabCallback;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        int i5 = IAuthTabCallbackStubProxy + 121;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
    }

    private final void onExtraCallbackWithResult(Rect rect) {
        int i = 2 % 2;
        float fExactCenterX = rect.exactCenterX();
        float fExactCenterY = rect.exactCenterY();
        SweepGradient sweepGradient = new SweepGradient(fExactCenterX, fExactCenterY, this.onExtraCallbackWithResult, this.onExtraCallback);
        Matrix matrix = new Matrix();
        matrix.setRotate(this.onTransact, fExactCenterX, fExactCenterY);
        sweepGradient.setLocalMatrix(matrix);
        this.onNavigationEvent.setShader(sweepGradient);
        int i2 = IAuthTabCallbackStubProxy + 119;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull Canvas canvas) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 1;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(canvas, "");
        canvas.drawPath(this.onWarmupCompleted, this.onNavigationEvent);
        int i4 = IAuthTabCallbackStub + 51;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 75;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        this.onNavigationEvent.setAlpha(i);
        invalidateSelf();
        int i5 = IAuthTabCallbackStub + 103;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 77;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            this.onNavigationEvent.setColorFilter(colorFilter);
            invalidateSelf();
        } else {
            this.onNavigationEvent.setColorFilter(colorFilter);
            invalidateSelf();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
