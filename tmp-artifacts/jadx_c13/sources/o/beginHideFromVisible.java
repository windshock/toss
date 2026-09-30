package o;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class beginHideFromVisible extends setLottieAdDescMaxLength<byte[]> {
    private int onExtraCallbackWithResult;
    private byte[] onNavigationEvent;

    public beginHideFromVisible(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        this.onNavigationEvent = bArr;
        this.onExtraCallbackWithResult = bArr.length;
        onWarmupCompleted(10);
    }

    @Override // o.setLottieAdDescMaxLength
    public int onExtraCallback() {
        return this.onExtraCallbackWithResult;
    }

    @Override // o.setLottieAdDescMaxLength
    public void onWarmupCompleted(int i) {
        byte[] bArr = this.onNavigationEvent;
        if (bArr.length < i) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, RangesKt___RangesKt.coerceAtLeast(i, bArr.length << 1));
            Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "");
            this.onNavigationEvent = bArrCopyOf;
        }
    }

    public final void onExtraCallbackWithResult(byte b) {
        setLottieAdDescMaxLength.onExtraCallbackWithResult(this, 0, 1, null);
        byte[] bArr = this.onNavigationEvent;
        int iOnExtraCallback = onExtraCallback();
        this.onExtraCallbackWithResult = iOnExtraCallback + 1;
        bArr[iOnExtraCallback] = b;
    }

    @Override // o.setLottieAdDescMaxLength
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public byte[] onExtraCallbackWithResult() {
        byte[] bArrCopyOf = Arrays.copyOf(this.onNavigationEvent, onExtraCallback());
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "");
        return bArrCopyOf;
    }
}
