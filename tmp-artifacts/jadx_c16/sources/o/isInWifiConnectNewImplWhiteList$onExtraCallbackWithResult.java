package o;

import im.toss.features.cardrecommend.home.model.benefit.CardRecommendBenefitResp;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class isInWifiConnectNewImplWhiteList$onExtraCallbackWithResult extends isInWifiConnectNewImplWhiteList {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private final CardRecommendBenefitResp onNavigationEvent;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r6 instanceof o.isInWifiConnectNewImplWhiteList$onExtraCallbackWithResult) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        r2 = r2 + 11;
        o.isInWifiConnectNewImplWhiteList$onExtraCallbackWithResult.onExtraCallback = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.onNavigationEvent, ((o.isInWifiConnectNewImplWhiteList$onExtraCallbackWithResult) r6).onNavigationEvent) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        r6 = o.isInWifiConnectNewImplWhiteList$onExtraCallbackWithResult.onExtraCallbackWithResult + 41;
        o.isInWifiConnectNewImplWhiteList$onExtraCallbackWithResult.onExtraCallback = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 109;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 == 0) {
            int i4 = 9 / 0;
        }
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 33;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        CardRecommendBenefitResp cardRecommendBenefitResp = this.onNavigationEvent;
        if (i3 == 0) {
            return cardRecommendBenefitResp.hashCode();
        }
        cardRecommendBenefitResp.hashCode();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Success(data=" + this.onNavigationEvent + ")";
        int i2 = onExtraCallbackWithResult + 123;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public isInWifiConnectNewImplWhiteList$onExtraCallbackWithResult(@NotNull CardRecommendBenefitResp cardRecommendBenefitResp) {
        super((DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(cardRecommendBenefitResp, "");
        this.onNavigationEvent = cardRecommendBenefitResp;
    }

    public final CardRecommendBenefitResp onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 97;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        CardRecommendBenefitResp cardRecommendBenefitResp = this.onNavigationEvent;
        int i4 = i2 + 47;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return cardRecommendBenefitResp;
        }
        throw null;
    }
}
