package im.toss.core.webkit.bridge.image.crop;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.extractFile;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class FocusView extends View {
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder;
    private final int IAuthTabCallback;
    private float onExtraCallback;
    private Path onExtraCallbackWithResult;
    private Paint onNavigationEvent;
    private extractFile onTransact;
    private Paint onWarmupCompleted;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FocusView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FocusView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.onExtraCallbackWithResult = new Path();
        this.onTransact = extractFile.CIRCLE;
        Intrinsics.checkNotNullExpressionValue(context.getResources().getDisplayMetrics(), "");
        this.onExtraCallback = varyMatches.onNavigationEvent(Float.valueOf(256.0f), r2);
        onNavigationEvent();
        this.IAuthTabCallback = Color.parseColor("#B2000000");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ FocusView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = IAuthTabCallbackStub + 43;
            int i4 = i3 % 128;
            asBinder = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 87;
            IAuthTabCallbackStub = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i9 = asBinder + 51;
            IAuthTabCallbackStub = i9 % 128;
            int i10 = i9 % 2;
            int i11 = 2 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }

    private final void onNavigationEvent() {
        int i = 2 % 2;
        Paint paint = new Paint(7);
        paint.setColor(0);
        this.onNavigationEvent = paint;
        Paint paint2 = new Paint(7);
        paint2.setColor(0);
        this.onWarmupCompleted = paint2;
        int i2 = asBinder + 49;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 64 / 0;
        }
    }

    public final void setTypeAndSize(@NotNull extractFile extractfile, float f) {
        int i = 2 % 2;
        int i2 = asBinder + 7;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(extractfile, "");
            this.onTransact = extractfile;
            this.onExtraCallback = f;
            invalidate();
            return;
        }
        Intrinsics.checkNotNullParameter(extractfile, "");
        this.onTransact = extractfile;
        this.onExtraCallback = f;
        invalidate();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(canvas, "");
        super.onDraw(canvas);
        this.onExtraCallbackWithResult.reset();
        int i2 = onNavigationEvent.onExtraCallback[this.onTransact.ordinal()];
        if (i2 != 1) {
            int i3 = IAuthTabCallbackStub + 63;
            asBinder = i3 % 128;
            if (i3 % 2 == 0 ? i2 == 2 : i2 == 4) {
                float width = getWidth() / 2.0f;
                float height = getHeight() / 2.0f;
                float f = this.onExtraCallback;
                float f2 = f / 2.0f;
                float f3 = width - f2;
                float f4 = width + f2;
                float f5 = f / 1.414f;
                float f6 = height - f5;
                float f7 = height + f5;
                this.onExtraCallbackWithResult.addRect(f3, f6, f4, f7, Path.Direction.CW);
                this.onExtraCallbackWithResult.setFillType(Path.FillType.INVERSE_EVEN_ODD);
                Paint paint = this.onNavigationEvent;
                if (paint != null) {
                    int i4 = IAuthTabCallbackStub + 89;
                    asBinder = i4 % 128;
                    int i5 = i4 % 2;
                    canvas.drawRect(f3, f6, f4, f7, paint);
                }
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                float f8 = this.onExtraCallback / 2.0f;
                float width2 = getWidth() / 2.0f;
                this.onExtraCallbackWithResult.addCircle(width2, getHeight() / 2.0f, f8, Path.Direction.CW);
                this.onExtraCallbackWithResult.setFillType(Path.FillType.INVERSE_EVEN_ODD);
                Paint paint2 = this.onNavigationEvent;
                if (paint2 != null) {
                    canvas.drawCircle(width2, width2, f8, paint2);
                }
            }
        } else {
            float width3 = getWidth() / 2.0f;
            float height2 = getHeight() / 2.0f;
            float f9 = this.onExtraCallback / 2.0f;
            float f10 = width3 - f9;
            float f11 = width3 + f9;
            float f12 = height2 - f9;
            float f13 = height2 + f9;
            this.onExtraCallbackWithResult.addRect(f10, f12, f11, f13, Path.Direction.CW);
            this.onExtraCallbackWithResult.setFillType(Path.FillType.INVERSE_EVEN_ODD);
            Paint paint3 = this.onNavigationEvent;
            if (paint3 != null) {
                canvas.drawRect(f10, f12, f11, f13, paint3);
            }
        }
        Paint paint4 = this.onWarmupCompleted;
        if (paint4 != null) {
            int i6 = IAuthTabCallbackStub + 35;
            asBinder = i6 % 128;
            if (i6 % 2 != 0) {
                canvas.drawPath(this.onExtraCallbackWithResult, paint4);
                int i7 = 48 / 0;
            } else {
                canvas.drawPath(this.onExtraCallbackWithResult, paint4);
            }
        }
        canvas.clipPath(this.onExtraCallbackWithResult);
        canvas.drawColor(this.IAuthTabCallback);
    }
}
