package o;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getBackgroundDrawable extends setLottieAdDescMaxLength<int[]> {
    private int[] onExtraCallbackWithResult;
    private int onWarmupCompleted;

    public getBackgroundDrawable(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "");
        this.onExtraCallbackWithResult = iArr;
        this.onWarmupCompleted = iArr.length;
        onWarmupCompleted(10);
    }

    @Override // o.setLottieAdDescMaxLength
    public int onExtraCallback() {
        return this.onWarmupCompleted;
    }

    @Override // o.setLottieAdDescMaxLength
    public void onWarmupCompleted(int i) {
        int[] iArr = this.onExtraCallbackWithResult;
        if (iArr.length < i) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, RangesKt___RangesKt.coerceAtLeast(i, iArr.length << 1));
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "");
            this.onExtraCallbackWithResult = iArrCopyOf;
        }
    }

    public final void onExtraCallbackWithResult(int i) {
        setLottieAdDescMaxLength.onExtraCallbackWithResult(this, 0, 1, null);
        int[] iArr = this.onExtraCallbackWithResult;
        int iOnExtraCallback = onExtraCallback();
        this.onWarmupCompleted = iOnExtraCallback + 1;
        iArr[iOnExtraCallback] = i;
    }

    @Override // o.setLottieAdDescMaxLength
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public int[] onExtraCallbackWithResult() {
        int[] iArrCopyOf = Arrays.copyOf(this.onExtraCallbackWithResult, onExtraCallback());
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "");
        return iArrCopyOf;
    }
}
