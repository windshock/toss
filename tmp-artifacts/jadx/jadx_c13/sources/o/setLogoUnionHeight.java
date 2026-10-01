package o;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setLogoUnionHeight extends setLottieAdDescMaxLength<double[]> {
    private double[] IAuthTabCallback;
    private int onExtraCallback;

    public setLogoUnionHeight(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "");
        this.IAuthTabCallback = dArr;
        this.onExtraCallback = dArr.length;
        onWarmupCompleted(10);
    }

    @Override // o.setLottieAdDescMaxLength
    public int onExtraCallback() {
        return this.onExtraCallback;
    }

    @Override // o.setLottieAdDescMaxLength
    public void onWarmupCompleted(int i) {
        double[] dArr = this.IAuthTabCallback;
        if (dArr.length < i) {
            double[] dArrCopyOf = Arrays.copyOf(dArr, RangesKt___RangesKt.coerceAtLeast(i, dArr.length << 1));
            Intrinsics.checkNotNullExpressionValue(dArrCopyOf, "");
            this.IAuthTabCallback = dArrCopyOf;
        }
    }

    public final void onExtraCallback(double d) {
        setLottieAdDescMaxLength.onExtraCallbackWithResult(this, 0, 1, null);
        double[] dArr = this.IAuthTabCallback;
        int iOnExtraCallback = onExtraCallback();
        this.onExtraCallback = iOnExtraCallback + 1;
        dArr[iOnExtraCallback] = d;
    }

    @Override // o.setLottieAdDescMaxLength
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public double[] onExtraCallbackWithResult() {
        double[] dArrCopyOf = Arrays.copyOf(this.IAuthTabCallback, onExtraCallback());
        Intrinsics.checkNotNullExpressionValue(dArrCopyOf, "");
        return dArrCopyOf;
    }
}
