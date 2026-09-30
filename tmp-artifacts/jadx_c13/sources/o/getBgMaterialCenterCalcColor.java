package o;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getBgMaterialCenterCalcColor extends setLottieAdDescMaxLength<char[]> {
    private char[] IAuthTabCallback;
    private int onNavigationEvent;

    public getBgMaterialCenterCalcColor(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "");
        this.IAuthTabCallback = cArr;
        this.onNavigationEvent = cArr.length;
        onWarmupCompleted(10);
    }

    @Override // o.setLottieAdDescMaxLength
    public int onExtraCallback() {
        return this.onNavigationEvent;
    }

    @Override // o.setLottieAdDescMaxLength
    public void onWarmupCompleted(int i) {
        char[] cArr = this.IAuthTabCallback;
        if (cArr.length < i) {
            char[] cArrCopyOf = Arrays.copyOf(cArr, RangesKt___RangesKt.coerceAtLeast(i, cArr.length << 1));
            Intrinsics.checkNotNullExpressionValue(cArrCopyOf, "");
            this.IAuthTabCallback = cArrCopyOf;
        }
    }

    public final void onWarmupCompleted(char c) {
        setLottieAdDescMaxLength.onExtraCallbackWithResult(this, 0, 1, null);
        char[] cArr = this.IAuthTabCallback;
        int iOnExtraCallback = onExtraCallback();
        this.onNavigationEvent = iOnExtraCallback + 1;
        cArr[iOnExtraCallback] = c;
    }

    @Override // o.setLottieAdDescMaxLength
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public char[] onExtraCallbackWithResult() {
        char[] cArrCopyOf = Arrays.copyOf(this.IAuthTabCallback, onExtraCallback());
        Intrinsics.checkNotNullExpressionValue(cArrCopyOf, "");
        return cArrCopyOf;
    }
}
