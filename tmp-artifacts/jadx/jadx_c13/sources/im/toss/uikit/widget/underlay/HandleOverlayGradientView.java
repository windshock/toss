package im.toss.uikit.widget.underlay;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.os.Build;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import o.VideoEncoderInfoImplExternalSyntheticLambda0;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class HandleOverlayGradientView extends View {
    private static int asBinder = 1;
    private static int onTransact;
    private final float IAuthTabCallback;
    private final int IAuthTabCallbackStub;
    private final RectF onExtraCallback;
    private final int onExtraCallbackWithResult;
    private final Paint onNavigationEvent;
    private final Path onWarmupCompleted;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandleOverlayGradientView(@NotNull Context context, int i, int i2, float f) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.onExtraCallbackWithResult = i;
        this.IAuthTabCallbackStub = i2;
        this.IAuthTabCallback = f;
        Paint paint = new Paint(1);
        this.onNavigationEvent = paint;
        this.onWarmupCompleted = new Path();
        this.onExtraCallback = new RectF();
        paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, VideoEncoderInfoImplExternalSyntheticLambda0.IAuthTabCallback(i, 0), i, Shader.TileMode.CLAMP));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        super.onSizeChanged(i, i2, i3, i4);
        float f = i2;
        this.onExtraCallback.set(0.0f, 0.0f, i, f);
        this.onWarmupCompleted.reset();
        Path path = this.onWarmupCompleted;
        RectF rectF = this.onExtraCallback;
        float f2 = this.IAuthTabCallback;
        path.addRoundRect(rectF, new float[]{0.0f, 0.0f, 0.0f, 0.0f, f2, f2, f2, f2}, Path.Direction.CW);
        this.onNavigationEvent.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, f, VideoEncoderInfoImplExternalSyntheticLambda0.IAuthTabCallback(this.onExtraCallbackWithResult, 0), this.onExtraCallbackWithResult, Shader.TileMode.CLAMP));
        int i6 = asBinder + 71;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(canvas, "");
        super.onDraw(canvas);
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            int i3 = onTransact + 115;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            canvas.clipOutPath(this.onWarmupCompleted);
            i = asBinder + 53;
        } else {
            canvas.clipPath(this.onWarmupCompleted, Region.Op.DIFFERENCE);
            i = asBinder + 81;
        }
        onTransact = i % 128;
        int i5 = i % 2;
        canvas.drawColor(this.IAuthTabCallbackStub);
        canvas.restore();
        canvas.drawPath(this.onWarmupCompleted, this.onNavigationEvent);
    }
}
