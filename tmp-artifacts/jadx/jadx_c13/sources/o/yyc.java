package o;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class yyc extends setLottieAdDescMaxLength<boolean[]> {
    private int onExtraCallbackWithResult;
    private boolean[] onNavigationEvent;

    public yyc(@NotNull boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "");
        this.onNavigationEvent = zArr;
        this.onExtraCallbackWithResult = zArr.length;
        onWarmupCompleted(10);
    }

    @Override // o.setLottieAdDescMaxLength
    public int onExtraCallback() {
        return this.onExtraCallbackWithResult;
    }

    @Override // o.setLottieAdDescMaxLength
    public void onWarmupCompleted(int i) {
        boolean[] zArr = this.onNavigationEvent;
        if (zArr.length < i) {
            boolean[] zArrCopyOf = Arrays.copyOf(zArr, RangesKt___RangesKt.coerceAtLeast(i, zArr.length << 1));
            Intrinsics.checkNotNullExpressionValue(zArrCopyOf, "");
            this.onNavigationEvent = zArrCopyOf;
        }
    }

    public final void onNavigationEvent(boolean z) {
        setLottieAdDescMaxLength.onExtraCallbackWithResult(this, 0, 1, null);
        boolean[] zArr = this.onNavigationEvent;
        int iOnExtraCallback = onExtraCallback();
        this.onExtraCallbackWithResult = iOnExtraCallback + 1;
        zArr[iOnExtraCallback] = z;
    }

    @Override // o.setLottieAdDescMaxLength
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public boolean[] onExtraCallbackWithResult() {
        boolean[] zArrCopyOf = Arrays.copyOf(this.onNavigationEvent, onExtraCallback());
        Intrinsics.checkNotNullExpressionValue(zArrCopyOf, "");
        return zArrCopyOf;
    }
}
