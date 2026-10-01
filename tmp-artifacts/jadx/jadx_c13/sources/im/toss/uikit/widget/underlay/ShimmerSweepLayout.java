package im.toss.uikit.widget.underlay;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import im.toss.uikit.widget.gl.TdsAgslShaderEffectView;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ShimmerSweepLayout extends TdsAgslShaderEffectView {
    private static int IAuthTabCallbackDefault = 0;
    private static int onTransact = 1;
    private Function0<Unit> IAuthTabCallback;
    private final String onExtraCallback;
    private boolean onExtraCallbackWithResult;
    private Function0<Unit> onWarmupCompleted;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShimmerSweepLayout(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShimmerSweepLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ boolean onExtraCallback(ShimmerSweepLayout shimmerSweepLayout, View view, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = onTransact + 17;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = onExtraCallbackWithResult(shimmerSweepLayout, view, motionEvent);
        int i4 = onTransact + Imgproc.COLOR_YUV2RGB_YVYU;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return zOnExtraCallbackWithResult;
        }
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShimmerSweepLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.onExtraCallback = "shimmer_sweep.agsl";
        setDraggable(false);
        setAnimationDuration(1200L);
        setOnTouchListener(new View.OnTouchListener() { // from class: im.toss.uikit.widget.underlay.ShimmerSweepLayout$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 23;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                boolean zOnExtraCallback = ShimmerSweepLayout.onExtraCallback(this.f$0, view, motionEvent);
                int i5 = onWarmupCompleted + 11;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return zOnExtraCallback;
            }
        });
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ShimmerSweepLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = IAuthTabCallbackDefault + 87;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i6 = IAuthTabCallbackDefault + 57;
            onTransact = i6 % 128;
            i = i6 % 2 == 0 ? 1 : 0;
        }
        this(context, attributeSet, i);
    }

    @Override // im.toss.uikit.widget.gl.TdsAgslShaderEffectView
    public String asBinder() {
        int i = 2 % 2;
        int i2 = onTransact + Imgproc.COLOR_YUV2RGBA_YVYU;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        String str = this.onExtraCallback;
        int i5 = i3 + 119;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 76 / 0;
        }
        return str;
    }

    public final void setOnStart(@Nullable Function0<Unit> function0) {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 73;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        this.onWarmupCompleted = function0;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 81;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void setOnCancel(@Nullable Function0<Unit> function0) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 21;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        this.IAuthTabCallback = function0;
        int i5 = i3 + 61;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final boolean onExtraCallbackWithResult(ShimmerSweepLayout shimmerSweepLayout, View view, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + Imgproc.COLOR_YUV2RGBA_YVYU;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        boolean z = shimmerSweepLayout.onExtraCallbackWithResult;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 113;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    @Override // im.toss.uikit.widget.gl.TdsAgslShaderEffectView, im.toss.uikit.widget.gl.TdsAgslEffectView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() throws IOException {
        int i = 2 % 2;
        int i2 = onTransact + 91;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        super.onAttachedToWindow();
        IAuthTabCallbackDefault();
        int i4 = onTransact + 77;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 71 / 0;
        }
    }

    public final void IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onTransact + 37;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        this.onExtraCallbackWithResult = true;
        setVisibility(0);
        Function0<Unit> function0 = this.onWarmupCompleted;
        if (function0 != null) {
            function0.invoke();
            int i4 = IAuthTabCallbackDefault + 27;
            onTransact = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 4 / 5;
            }
        }
        IAuthTabCallback();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0027 A[PHI: r1
      0x0027: PHI (r1v7 kotlin.jvm.functions.Function0<kotlin.Unit>) = (r1v6 kotlin.jvm.functions.Function0<kotlin.Unit>), (r1v14 kotlin.jvm.functions.Function0<kotlin.Unit>) binds: [B:8:0x0025, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void IAuthTabCallbackDefault() {
        Function0<Unit> function0;
        int i = 2 % 2;
        int i2 = onTransact + 97;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            this.onExtraCallbackWithResult = true;
            setVisibility(63);
            function0 = this.IAuthTabCallback;
            if (function0 != null) {
                function0.invoke();
            }
        } else {
            this.onExtraCallbackWithResult = false;
            setVisibility(8);
            function0 = this.IAuthTabCallback;
            if (function0 != null) {
            }
        }
        onExtraCallback();
        setProgress(0.0f);
        int i3 = onTransact + 55;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
    }
}
