package o;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class aeu1 extends setLottieAdDescMaxLength<float[]> {
    private int onExtraCallbackWithResult;
    private float[] onNavigationEvent;

    public aeu1(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "");
        this.onNavigationEvent = fArr;
        this.onExtraCallbackWithResult = fArr.length;
        onWarmupCompleted(10);
    }

    @Override // o.setLottieAdDescMaxLength
    public int onExtraCallback() {
        return this.onExtraCallbackWithResult;
    }

    @Override // o.setLottieAdDescMaxLength
    public void onWarmupCompleted(int i) {
        float[] fArr = this.onNavigationEvent;
        if (fArr.length < i) {
            float[] fArrCopyOf = Arrays.copyOf(fArr, RangesKt___RangesKt.coerceAtLeast(i, fArr.length << 1));
            Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "");
            this.onNavigationEvent = fArrCopyOf;
        }
    }

    public final void onWarmupCompleted(float f) {
        setLottieAdDescMaxLength.onExtraCallbackWithResult(this, 0, 1, null);
        float[] fArr = this.onNavigationEvent;
        int iOnExtraCallback = onExtraCallback();
        this.onExtraCallbackWithResult = iOnExtraCallback + 1;
        fArr[iOnExtraCallback] = f;
    }

    @Override // o.setLottieAdDescMaxLength
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public float[] onExtraCallbackWithResult() {
        float[] fArrCopyOf = Arrays.copyOf(this.onNavigationEvent, onExtraCallback());
        Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "");
        return fArrCopyOf;
    }
}
