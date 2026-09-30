package im.toss.uikit.widget.gl;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import o.VideoEncoderInfoImplExternalSyntheticLambda0;
import o.readIntokhttp;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class LegacyColorDimView extends View {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    private float onExtraCallback;
    private int onExtraCallbackWithResult;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegacyColorDimView(@NotNull Context context) {
        String str;
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        Configuration configuration = resources.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        if (readIntokhttp.onExtraCallback(configuration)) {
            int i = IAuthTabCallback + 57;
            onWarmupCompleted = i % 128;
            if (i % 2 != 0) {
                int i2 = 2 % 2;
            }
            str = "#ff101013";
        } else {
            int i3 = onWarmupCompleted + 115;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 5 / 4;
            } else {
                int i5 = 2 % 2;
            }
            str = "#fff2f4f6";
        }
        this.onExtraCallbackWithResult = Color.parseColor(str);
    }

    public final void setBgColor(int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 17;
        onWarmupCompleted = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            this.onExtraCallbackWithResult = i;
            IAuthTabCallback();
            int i4 = IAuthTabCallback + 9;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        this.onExtraCallbackWithResult = i;
        IAuthTabCallback();
        throw null;
    }

    public final void setBlurRadius(float f) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 25;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            this.onExtraCallback = f;
            IAuthTabCallback();
        } else {
            this.onExtraCallback = f;
            IAuthTabCallback();
            throw null;
        }
    }

    private final void IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 125;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        setBackgroundColor(VideoEncoderInfoImplExternalSyntheticLambda0.IAuthTabCallback(this.onExtraCallbackWithResult, (int) (RangesKt___RangesKt.coerceIn(this.onExtraCallback / 150.0f, 0.0f, 1.0f) * 255.0f)));
        int i4 = IAuthTabCallback + 15;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }
}
