package o;

import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class syc2 extends setLottieAdDescMaxLength<access13100> {
    private int onExtraCallback;
    private long[] onWarmupCompleted;

    public /* synthetic */ syc2(long[] jArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(jArr);
    }

    @Override // o.setLottieAdDescMaxLength
    public /* bridge */ /* synthetic */ access13100 onExtraCallbackWithResult() {
        return access13100.onExtraCallbackWithResult(onWarmupCompleted());
    }

    private syc2(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "");
        this.onWarmupCompleted = jArr;
        this.onExtraCallback = access13100.onWarmupCompleted(jArr);
        onWarmupCompleted(10);
    }

    @Override // o.setLottieAdDescMaxLength
    public int onExtraCallback() {
        return this.onExtraCallback;
    }

    @Override // o.setLottieAdDescMaxLength
    public void onWarmupCompleted(int i) {
        if (access13100.onWarmupCompleted(this.onWarmupCompleted) < i) {
            long[] jArr = this.onWarmupCompleted;
            long[] jArrCopyOf = Arrays.copyOf(jArr, RangesKt___RangesKt.coerceAtLeast(i, access13100.onWarmupCompleted(jArr) << 1));
            Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "");
            this.onWarmupCompleted = access13100.onExtraCallback(jArrCopyOf);
        }
    }

    public final void onNavigationEvent(long j) {
        setLottieAdDescMaxLength.onExtraCallbackWithResult(this, 0, 1, null);
        long[] jArr = this.onWarmupCompleted;
        int iOnExtraCallback = onExtraCallback();
        this.onExtraCallback = iOnExtraCallback + 1;
        access13100.onExtraCallbackWithResult(jArr, iOnExtraCallback, j);
    }

    public long[] onWarmupCompleted() {
        long[] jArrCopyOf = Arrays.copyOf(this.onWarmupCompleted, onExtraCallback());
        Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "");
        return access13100.onExtraCallback(jArrCopyOf);
    }
}
