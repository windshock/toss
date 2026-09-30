package o;

import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class thx2 extends setLottieAdDescMaxLength<TombstoneProtosRegisterBuilder> {
    private int onExtraCallback;
    private short[] onWarmupCompleted;

    public /* synthetic */ thx2(short[] sArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(sArr);
    }

    @Override // o.setLottieAdDescMaxLength
    public /* synthetic */ TombstoneProtosRegisterBuilder onExtraCallbackWithResult() {
        return TombstoneProtosRegisterBuilder.onWarmupCompleted(onNavigationEvent());
    }

    private thx2(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "");
        this.onWarmupCompleted = sArr;
        this.onExtraCallback = TombstoneProtosRegisterBuilder.onExtraCallbackWithResult(sArr);
        onWarmupCompleted(10);
    }

    @Override // o.setLottieAdDescMaxLength
    public int onExtraCallback() {
        return this.onExtraCallback;
    }

    @Override // o.setLottieAdDescMaxLength
    public void onWarmupCompleted(int i) {
        if (TombstoneProtosRegisterBuilder.onExtraCallbackWithResult(this.onWarmupCompleted) < i) {
            short[] sArr = this.onWarmupCompleted;
            short[] sArrCopyOf = Arrays.copyOf(sArr, RangesKt___RangesKt.coerceAtLeast(i, TombstoneProtosRegisterBuilder.onExtraCallbackWithResult(sArr) << 1));
            Intrinsics.checkNotNullExpressionValue(sArrCopyOf, "");
            this.onWarmupCompleted = TombstoneProtosRegisterBuilder.IAuthTabCallback(sArrCopyOf);
        }
    }

    public final void onWarmupCompleted(short s) {
        setLottieAdDescMaxLength.onExtraCallbackWithResult(this, 0, 1, null);
        short[] sArr = this.onWarmupCompleted;
        int iOnExtraCallback = onExtraCallback();
        this.onExtraCallback = iOnExtraCallback + 1;
        TombstoneProtosRegisterBuilder.onNavigationEvent(sArr, iOnExtraCallback, s);
    }

    public short[] onNavigationEvent() {
        short[] sArrCopyOf = Arrays.copyOf(this.onWarmupCompleted, onExtraCallback());
        Intrinsics.checkNotNullExpressionValue(sArrCopyOf, "");
        return TombstoneProtosRegisterBuilder.IAuthTabCallback(sArrCopyOf);
    }
}
