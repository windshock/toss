package o;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getLottieView extends setLottieAdDescMaxLength<long[]> {
    private long[] IAuthTabCallback;
    private int onNavigationEvent;

    public getLottieView(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "");
        this.IAuthTabCallback = jArr;
        this.onNavigationEvent = jArr.length;
        onWarmupCompleted(10);
    }

    @Override // o.setLottieAdDescMaxLength
    public int onExtraCallback() {
        return this.onNavigationEvent;
    }

    @Override // o.setLottieAdDescMaxLength
    public void onWarmupCompleted(int i) {
        long[] jArr = this.IAuthTabCallback;
        if (jArr.length < i) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, RangesKt___RangesKt.coerceAtLeast(i, jArr.length << 1));
            Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "");
            this.IAuthTabCallback = jArrCopyOf;
        }
    }

    public final void onWarmupCompleted(long j) {
        setLottieAdDescMaxLength.onExtraCallbackWithResult(this, 0, 1, null);
        long[] jArr = this.IAuthTabCallback;
        int iOnExtraCallback = onExtraCallback();
        this.onNavigationEvent = iOnExtraCallback + 1;
        jArr[iOnExtraCallback] = j;
    }

    @Override // o.setLottieAdDescMaxLength
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public long[] onExtraCallbackWithResult() {
        long[] jArrCopyOf = Arrays.copyOf(this.IAuthTabCallback, onExtraCallback());
        Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "");
        return jArrCopyOf;
    }
}
