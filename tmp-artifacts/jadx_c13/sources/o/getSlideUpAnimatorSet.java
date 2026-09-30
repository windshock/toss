package o;

import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getSlideUpAnimatorSet extends setLottieAdDescMaxLength<access13400> {
    private int[] onExtraCallback;
    private int onNavigationEvent;

    public /* synthetic */ getSlideUpAnimatorSet(int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(iArr);
    }

    @Override // o.setLottieAdDescMaxLength
    public /* synthetic */ access13400 onExtraCallbackWithResult() {
        return access13400.onExtraCallback(IAuthTabCallback());
    }

    private getSlideUpAnimatorSet(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "");
        this.onExtraCallback = iArr;
        this.onNavigationEvent = access13400.IAuthTabCallback(iArr);
        onWarmupCompleted(10);
    }

    @Override // o.setLottieAdDescMaxLength
    public int onExtraCallback() {
        return this.onNavigationEvent;
    }

    @Override // o.setLottieAdDescMaxLength
    public void onWarmupCompleted(int i) {
        if (access13400.IAuthTabCallback(this.onExtraCallback) < i) {
            int[] iArr = this.onExtraCallback;
            int[] iArrCopyOf = Arrays.copyOf(iArr, RangesKt___RangesKt.coerceAtLeast(i, access13400.IAuthTabCallback(iArr) << 1));
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "");
            this.onExtraCallback = access13400.onExtraCallbackWithResult(iArrCopyOf);
        }
    }

    public final void onExtraCallbackWithResult(int i) {
        setLottieAdDescMaxLength.onExtraCallbackWithResult(this, 0, 1, null);
        int[] iArr = this.onExtraCallback;
        int iOnExtraCallback = onExtraCallback();
        this.onNavigationEvent = iOnExtraCallback + 1;
        access13400.onWarmupCompleted(iArr, iOnExtraCallback, i);
    }

    public int[] IAuthTabCallback() {
        int[] iArrCopyOf = Arrays.copyOf(this.onExtraCallback, onExtraCallback());
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "");
        return access13400.onExtraCallbackWithResult(iArrCopyOf);
    }
}
