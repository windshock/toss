package im.toss.uikit.widget.underlay;

import android.app.Activity;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import o.setInForeground;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class HandleBarGlowView extends View {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private final Paint onExtraCallbackWithResult;
    private final float onNavigationEvent;
    private final int onWarmupCompleted;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandleBarGlowView(@NotNull Activity activity, int i, float f) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "");
        this.onWarmupCompleted = i;
        this.onNavigationEvent = f;
        Paint paint = new Paint(1);
        paint.setMaskFilter(new BlurMaskFilter(f, BlurMaskFilter.Blur.NORMAL));
        this.onExtraCallbackWithResult = paint;
        setLayerType(1, null);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        super.onSizeChanged(i, i2, i3, i4);
        float f = i;
        float f2 = this.onNavigationEvent * 2.0f;
        float f3 = i2;
        this.onExtraCallbackWithResult.setShader(new RadialGradient(f / 2.0f, f3 / 2.0f, Math.max(RangesKt___RangesKt.coerceAtLeast(f - f2, 1.0f) / 2.0f, RangesKt___RangesKt.coerceAtLeast(f3 - f2, 1.0f) / 2.0f), new int[]{this.onWarmupCompleted, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        int i6 = onExtraCallback + 45;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 71;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(canvas, "");
        super.onDraw(canvas);
        int iSave = canvas.save();
        canvas.clipRect(0.0f, setInForeground.onWarmupCompleted(getHeight()), getWidth(), getHeight());
        float f = this.onNavigationEvent;
        canvas.drawOval(f, f, getWidth() - this.onNavigationEvent, getHeight() - this.onNavigationEvent, this.onExtraCallbackWithResult);
        canvas.restoreToCount(iSave);
        int i4 = onExtraCallback + 49;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }
}
