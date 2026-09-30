package o;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setDislikeWidth extends setLottieAdDescMaxLength<short[]> {
    private short[] IAuthTabCallback;
    private int onWarmupCompleted;

    public setDislikeWidth(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "");
        this.IAuthTabCallback = sArr;
        this.onWarmupCompleted = sArr.length;
        onWarmupCompleted(10);
    }

    @Override // o.setLottieAdDescMaxLength
    public int onExtraCallback() {
        return this.onWarmupCompleted;
    }

    @Override // o.setLottieAdDescMaxLength
    public void onWarmupCompleted(int i) {
        short[] sArr = this.IAuthTabCallback;
        if (sArr.length < i) {
            short[] sArrCopyOf = Arrays.copyOf(sArr, RangesKt___RangesKt.coerceAtLeast(i, sArr.length << 1));
            Intrinsics.checkNotNullExpressionValue(sArrCopyOf, "");
            this.IAuthTabCallback = sArrCopyOf;
        }
    }

    public final void onNavigationEvent(short s) {
        setLottieAdDescMaxLength.onExtraCallbackWithResult(this, 0, 1, null);
        short[] sArr = this.IAuthTabCallback;
        int iOnExtraCallback = onExtraCallback();
        this.onWarmupCompleted = iOnExtraCallback + 1;
        sArr[iOnExtraCallback] = s;
    }

    @Override // o.setLottieAdDescMaxLength
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public short[] onExtraCallbackWithResult() {
        short[] sArrCopyOf = Arrays.copyOf(this.IAuthTabCallback, onExtraCallback());
        Intrinsics.checkNotNullExpressionValue(sArrCopyOf, "");
        return sArrCopyOf;
    }
}
