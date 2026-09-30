package im.toss.uikit.widget.gl;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class TdsAgslShaderEffectView extends TdsAgslEffectView {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsAgslShaderEffectView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsAgslShaderEffectView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    protected abstract String asBinder();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TdsAgslShaderEffectView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        setDraggable(true);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TdsAgslShaderEffectView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = onWarmupCompleted + 9;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i6 = onExtraCallback + Imgproc.COLOR_YUV2RGBA_YVYU;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }

    @Override // im.toss.uikit.widget.gl.TdsAgslEffectView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() throws IOException {
        int i = 2 % 2;
        super.onAttachedToWindow();
        if (Build.VERSION.SDK_INT >= 33) {
            int i2 = onWarmupCompleted + 19;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            TdsAgslEffectView.setAgslEffectFromFile$default(this, asBinder(), null, 2, null);
            IAuthTabCallback();
            int i4 = onWarmupCompleted + 109;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    }
}
