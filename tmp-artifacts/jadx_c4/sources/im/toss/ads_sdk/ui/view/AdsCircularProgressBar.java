package im.toss.ads_sdk.ui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class AdsCircularProgressBar extends View {
    private static int IAuthTabCallbackDefault = 1;
    private static int asBinder;
    private final Paint IAuthTabCallback;
    private final Paint onExtraCallback;
    private float onExtraCallbackWithResult;
    private float onNavigationEvent;
    private float onWarmupCompleted;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdsCircularProgressBar(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdsCircularProgressBar(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdsCircularProgressBar(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.onWarmupCompleted = varyMatches.IAuthTabCallback(this, 21);
        this.onExtraCallbackWithResult = varyMatches.IAuthTabCallback(this, 21);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStrokeWidth(varyMatches.IAuthTabCallback(this, 3));
        paint.setStrokeCap(Paint.Cap.ROUND);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(Color.parseColor("#ff3182f6"));
        this.onExtraCallback = paint;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setStrokeWidth(varyMatches.IAuthTabCallback(this, 3));
        paint2.setStyle(style);
        paint2.setColor(Color.parseColor("#ff6b7684"));
        this.IAuthTabCallback = paint2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdsCircularProgressBar(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = asBinder + 77;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i6 = asBinder + 59;
            IAuthTabCallbackDefault = i6 % 128;
            int i7 = i6 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public final void setV2Style(boolean z) {
        int i = 2 % 2;
        int i2 = asBinder + 63;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Double dValueOf = Double.valueOf(2.5d);
        if (z) {
            this.onExtraCallback.setStrokeWidth(varyMatches.IAuthTabCallback(this, dValueOf));
            this.IAuthTabCallback.setStrokeWidth(varyMatches.IAuthTabCallback(this, dValueOf));
            return;
        }
        this.onExtraCallback.setStrokeWidth(varyMatches.IAuthTabCallback(this, 3));
        this.IAuthTabCallback.setStrokeWidth(varyMatches.IAuthTabCallback(this, 3));
        int i4 = asBinder + 1;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void setPercent(float f) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 9;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        this.onNavigationEvent = RangesKt.coerceIn(f, 0.0f, 1.0f);
        invalidate();
        int i4 = asBinder + 19;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public final void setStrokeWidth(int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 15;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        this.onExtraCallback.setStrokeWidth(varyMatches.IAuthTabCallback(this, Integer.valueOf(i)));
        invalidate();
        int i5 = asBinder + 5;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 80 / 0;
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        int i6 = asBinder + 117;
        IAuthTabCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
        super.onSizeChanged(i, i2, i3, i4);
        this.onWarmupCompleted = i / 2.0f;
        this.onExtraCallbackWithResult = i2 / 2.0f;
        int i8 = asBinder + 21;
        IAuthTabCallbackDefault = i8 % 128;
        if (i8 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(canvas, "");
        super.onDraw(canvas);
        float fMin = (Math.min(getWidth(), getHeight()) / 2.0f) - (this.onExtraCallback.getStrokeWidth() / 2.0f);
        float f = this.onNavigationEvent;
        float f2 = this.onWarmupCompleted;
        float f3 = this.onExtraCallbackWithResult;
        RectF rectF = new RectF(f2 - fMin, f3 - fMin, f2 + fMin, f3 + fMin);
        this.onExtraCallback.setShader(null);
        this.onExtraCallback.setColor(Color.parseColor("#ff3182f6"));
        canvas.drawArc(rectF, -90.0f, 360.0f, false, this.IAuthTabCallback);
        canvas.drawArc(rectF, -90.0f, f * 360.0f, false, this.onExtraCallback);
        int i2 = asBinder + 27;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
    }
}
