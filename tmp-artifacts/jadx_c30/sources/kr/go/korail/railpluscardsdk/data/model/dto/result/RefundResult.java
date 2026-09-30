package kr.go.korail.railpluscardsdk.data.model.dto.result;

import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class RefundResult {
    private final int IAuthTabCallback;
    private final int asInterface;
    private final int onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final int onNavigationEvent;
    private boolean onWarmupCompleted;

    public RefundResult(String str, int i, int i2, int i3, int i4, boolean z) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        this.onExtraCallbackWithResult = str;
        this.IAuthTabCallback = i;
        this.onExtraCallback = i2;
        this.onNavigationEvent = i3;
        this.asInterface = i4;
        this.onWarmupCompleted = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RefundResult)) {
            return false;
        }
        RefundResult refundResult = (RefundResult) obj;
        return Intrinsics.areEqual(this.onExtraCallbackWithResult, refundResult.onExtraCallbackWithResult) && this.IAuthTabCallback == refundResult.IAuthTabCallback && this.onExtraCallback == refundResult.onExtraCallback && this.onNavigationEvent == refundResult.onNavigationEvent && this.asInterface == refundResult.asInterface && this.onWarmupCompleted == refundResult.onWarmupCompleted;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = this.onExtraCallbackWithResult.hashCode();
        int iHashCode2 = Integer.hashCode(this.IAuthTabCallback);
        int iHashCode3 = Integer.hashCode(this.onExtraCallback);
        int iHashCode4 = Integer.hashCode(this.onNavigationEvent);
        int iHashCode5 = Integer.hashCode(this.asInterface);
        boolean z = this.onWarmupCompleted;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((iHashCode5 + ((iHashCode4 + ((iHashCode3 + ((iHashCode2 + (iHashCode * 31)) * 31)) * 31)) * 31)) * 31) + i;
    }

    public String toString() {
        return "RefundResult(cardNumber=" + this.onExtraCallbackWithResult + ", afterTradeCounter=" + this.IAuthTabCallback + ", beforeBalance=" + this.onExtraCallback + ", currentBalance=" + this.onNavigationEvent + ", refundAmount=" + this.asInterface + ", isNotMissingRefundStatus=" + this.onWarmupCompleted + ')';
    }
}
