package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class RewardedInterstitialAdApi {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    private final createAdSizeApi funnelResponse;
    private final RewardedVideoAdApi status;

    /* JADX WARN: Multi-variable type inference failed */
    public RewardedInterstitialAdApi() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 11;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RewardedInterstitialAdApi)) {
            return false;
        }
        RewardedInterstitialAdApi rewardedInterstitialAdApi = (RewardedInterstitialAdApi) obj;
        if (this.status == rewardedInterstitialAdApi.status) {
            return Intrinsics.areEqual(this.funnelResponse, rewardedInterstitialAdApi.funnelResponse);
        }
        int i5 = i2 + 117;
        onExtraCallbackWithResult = i5 % 128;
        return i5 % 2 == 0;
    }

    public int hashCode() {
        RewardedVideoAdApi rewardedVideoAdApi;
        int iHashCode;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 125;
        onExtraCallbackWithResult = i2 % 128;
        int iHashCode2 = 0;
        if (i2 % 2 != 0 ? (rewardedVideoAdApi = this.status) != null : (rewardedVideoAdApi = this.status) != null) {
            iHashCode = rewardedVideoAdApi.hashCode();
            int i3 = onExtraCallbackWithResult + 65;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
        } else {
            iHashCode = 0;
        }
        createAdSizeApi createadsizeapi = this.funnelResponse;
        if (createadsizeapi != null) {
            iHashCode2 = createadsizeapi.hashCode();
            int i5 = onWarmupCompleted + 13;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
        }
        return (iHashCode * 31) + iHashCode2;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CardIssueSubmitResultResp(status=" + this.status + ", funnelResponse=" + this.funnelResponse + ")";
        int i2 = onExtraCallbackWithResult + 73;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public RewardedInterstitialAdApi(@Nullable RewardedVideoAdApi rewardedVideoAdApi, @Nullable createAdSizeApi createadsizeapi) {
        this.status = rewardedVideoAdApi;
        this.funnelResponse = createadsizeapi;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ RewardedInterstitialAdApi(RewardedVideoAdApi rewardedVideoAdApi, createAdSizeApi createadsizeapi, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Object obj = null;
        if ((i & 1) != 0) {
            int i2 = onExtraCallbackWithResult + 119;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            rewardedVideoAdApi = null;
        }
        if ((i & 2) != 0) {
            int i5 = onExtraCallbackWithResult + 73;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i6 = 2 % 2;
            createadsizeapi = null;
        }
        this(rewardedVideoAdApi, createadsizeapi);
    }

    public final RewardedVideoAdApi onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 39;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return this.status;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final createAdSizeApi onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 113;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        createAdSizeApi createadsizeapi = this.funnelResponse;
        if (i3 != 0) {
            int i4 = 49 / 0;
        }
        return createadsizeapi;
    }
}
