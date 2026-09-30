package o;

import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getShakeLayout extends setLottieAdDescMaxLength<access13200> {
    private byte[] IAuthTabCallback;
    private int onExtraCallbackWithResult;

    public /* synthetic */ getShakeLayout(byte[] bArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(bArr);
    }

    @Override // o.setLottieAdDescMaxLength
    public /* synthetic */ access13200 onExtraCallbackWithResult() {
        return access13200.onExtraCallback(IAuthTabCallback());
    }

    private getShakeLayout(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        this.IAuthTabCallback = bArr;
        this.onExtraCallbackWithResult = access13200.onWarmupCompleted(bArr);
        onWarmupCompleted(10);
    }

    @Override // o.setLottieAdDescMaxLength
    public int onExtraCallback() {
        return this.onExtraCallbackWithResult;
    }

    @Override // o.setLottieAdDescMaxLength
    public void onWarmupCompleted(int i) {
        if (access13200.onWarmupCompleted(this.IAuthTabCallback) < i) {
            byte[] bArr = this.IAuthTabCallback;
            byte[] bArrCopyOf = Arrays.copyOf(bArr, RangesKt___RangesKt.coerceAtLeast(i, access13200.onWarmupCompleted(bArr) << 1));
            Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "");
            this.IAuthTabCallback = access13200.onExtraCallbackWithResult(bArrCopyOf);
        }
    }

    public final void onWarmupCompleted(byte b) {
        setLottieAdDescMaxLength.onExtraCallbackWithResult(this, 0, 1, null);
        byte[] bArr = this.IAuthTabCallback;
        int iOnExtraCallback = onExtraCallback();
        this.onExtraCallbackWithResult = iOnExtraCallback + 1;
        access13200.onExtraCallback(bArr, iOnExtraCallback, b);
    }

    public byte[] IAuthTabCallback() {
        byte[] bArrCopyOf = Arrays.copyOf(this.IAuthTabCallback, onExtraCallback());
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "");
        return access13200.onExtraCallbackWithResult(bArrCopyOf);
    }
}
