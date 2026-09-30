package o;

import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.rewarded.RewardedAd;
import im.toss.ads_sdk.model.NativeAdsDto;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface scrollToItem {
    NativeAdsDto.AdmobInfo onExtraCallback();

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    default String onWarmupCompleted() throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        if (this instanceof onWarmupCompleted) {
            return "REWARDED";
        }
        if (this instanceof onExtraCallbackWithResult) {
            return "INTERSTITIAL";
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final class onWarmupCompleted implements scrollToItem {
        private static int asInterface = 1;
        private static int onTransact;
        private final NativeAdsDto.Reward IAuthTabCallback;
        private final ResponseInfo onExtraCallback;
        private final NativeAdsDto.AdmobInfo onExtraCallbackWithResult;
        private final String onNavigationEvent;
        private final RewardedAd onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onWarmupCompleted)) {
                int i2 = asInterface + 39;
                onTransact = i2 % 128;
                return i2 % 2 != 0;
            }
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) obj;
            if (!Intrinsics.areEqual(this.onWarmupCompleted, onwarmupcompleted.onWarmupCompleted)) {
                int i3 = asInterface + 45;
                onTransact = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.IAuthTabCallback, onwarmupcompleted.IAuthTabCallback)) {
                int i5 = onTransact + 101;
                asInterface = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, onwarmupcompleted.onExtraCallbackWithResult)) {
                return false;
            }
            if (Intrinsics.areEqual(this.onNavigationEvent, onwarmupcompleted.onNavigationEvent)) {
                return true;
            }
            int i7 = onTransact + 73;
            asInterface = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = onTransact + 101;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode2 = this.onWarmupCompleted.hashCode();
            NativeAdsDto.Reward reward = this.IAuthTabCallback;
            if (reward == null) {
                int i4 = asInterface + 47;
                onTransact = i4 % 128;
                int i5 = i4 % 2;
                iHashCode = 0;
            } else {
                iHashCode = reward.hashCode();
            }
            return (((((iHashCode2 * 31) + iHashCode) * 31) + this.onExtraCallbackWithResult.hashCode()) * 31) + this.onNavigationEvent.hashCode();
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Rewarded(ad=" + this.onWarmupCompleted + ", reward=" + this.IAuthTabCallback + ", admobInfo=" + this.onExtraCallbackWithResult + ", spaceUnitId=" + this.onNavigationEvent + ")";
            int i2 = asInterface + 33;
            onTransact = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public onWarmupCompleted(@NotNull RewardedAd rewardedAd, @Nullable NativeAdsDto.Reward reward, @NotNull NativeAdsDto.AdmobInfo admobInfo, @NotNull String str) {
            Intrinsics.checkNotNullParameter(rewardedAd, "");
            Intrinsics.checkNotNullParameter(admobInfo, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.onWarmupCompleted = rewardedAd;
            this.IAuthTabCallback = reward;
            this.onExtraCallbackWithResult = admobInfo;
            this.onNavigationEvent = str;
            ResponseInfo responseInfo = rewardedAd.getResponseInfo();
            Intrinsics.checkNotNullExpressionValue(responseInfo, "");
            this.onExtraCallback = responseInfo;
        }

        @Override // o.scrollToItem
        public /* bridge */ String onWarmupCompleted() throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = asInterface + 13;
            onTransact = i2 % 128;
            if (i2 % 2 == 0) {
                return super.onWarmupCompleted();
            }
            super.onWarmupCompleted();
            throw null;
        }

        public final RewardedAd onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onTransact + 77;
            asInterface = i2 % 128;
            if (i2 % 2 != 0) {
                return this.onWarmupCompleted;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final NativeAdsDto.Reward IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onTransact + 89;
            int i3 = i2 % 128;
            asInterface = i3;
            int i4 = i2 % 2;
            NativeAdsDto.Reward reward = this.IAuthTabCallback;
            int i5 = i3 + 101;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            return reward;
        }

        @Override // o.scrollToItem
        public NativeAdsDto.AdmobInfo onExtraCallback() {
            NativeAdsDto.AdmobInfo admobInfo;
            int i = 2 % 2;
            int i2 = asInterface + 5;
            int i3 = i2 % 128;
            onTransact = i3;
            if (i2 % 2 != 0) {
                admobInfo = this.onExtraCallbackWithResult;
                int i4 = 70 / 0;
            } else {
                admobInfo = this.onExtraCallbackWithResult;
            }
            int i5 = i3 + 47;
            asInterface = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 14 / 0;
            }
            return admobInfo;
        }

        public ResponseInfo onNavigationEvent() {
            int i = 2 % 2;
            int i2 = asInterface + 49;
            int i3 = i2 % 128;
            onTransact = i3;
            int i4 = i2 % 2;
            ResponseInfo responseInfo = this.onExtraCallback;
            int i5 = i3 + 115;
            asInterface = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 85 / 0;
            }
            return responseInfo;
        }
    }

    public static final class onExtraCallbackWithResult implements scrollToItem {
        private static int IAuthTabCallbackStub = 1;
        private static int onNavigationEvent;
        private final ResponseInfo IAuthTabCallback;
        private final InterstitialAd onExtraCallback;
        private final String onExtraCallbackWithResult;
        private final NativeAdsDto.AdmobInfo onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onExtraCallbackWithResult)) {
                return false;
            }
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) obj;
            if (!Intrinsics.areEqual(this.onExtraCallback, onextracallbackwithresult.onExtraCallback)) {
                int i2 = onNavigationEvent + 115;
                IAuthTabCallbackStub = i2 % 128;
                return i2 % 2 == 0;
            }
            if (!Intrinsics.areEqual(this.onWarmupCompleted, onextracallbackwithresult.onWarmupCompleted)) {
                int i3 = IAuthTabCallbackStub + 23;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.onExtraCallbackWithResult, onextracallbackwithresult.onExtraCallbackWithResult)) {
                int i5 = IAuthTabCallbackStub + 51;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return true;
            }
            int i7 = onNavigationEvent + 47;
            IAuthTabCallbackStub = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 57;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (((this.onExtraCallback.hashCode() * 31) + this.onWarmupCompleted.hashCode()) * 31) + this.onExtraCallbackWithResult.hashCode();
            int i4 = onNavigationEvent + 39;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 28 / 0;
            }
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Interstitial(ad=" + this.onExtraCallback + ", admobInfo=" + this.onWarmupCompleted + ", spaceUnitId=" + this.onExtraCallbackWithResult + ")";
            int i2 = onNavigationEvent + 7;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public onExtraCallbackWithResult(@NotNull InterstitialAd interstitialAd, @NotNull NativeAdsDto.AdmobInfo admobInfo, @NotNull String str) {
            Intrinsics.checkNotNullParameter(interstitialAd, "");
            Intrinsics.checkNotNullParameter(admobInfo, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.onExtraCallback = interstitialAd;
            this.onWarmupCompleted = admobInfo;
            this.onExtraCallbackWithResult = str;
            ResponseInfo responseInfo = interstitialAd.getResponseInfo();
            Intrinsics.checkNotNullExpressionValue(responseInfo, "");
            this.IAuthTabCallback = responseInfo;
        }

        @Override // o.scrollToItem
        public /* bridge */ String onWarmupCompleted() throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 23;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            String strOnWarmupCompleted = super.onWarmupCompleted();
            int i4 = onNavigationEvent + 37;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            return strOnWarmupCompleted;
        }

        public final InterstitialAd onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 93;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            InterstitialAd interstitialAd = this.onExtraCallback;
            if (i3 != 0) {
                int i4 = 83 / 0;
            }
            return interstitialAd;
        }

        @Override // o.scrollToItem
        public NativeAdsDto.AdmobInfo onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 63;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            NativeAdsDto.AdmobInfo admobInfo = this.onWarmupCompleted;
            if (i3 != 0) {
                int i4 = 60 / 0;
            }
            return admobInfo;
        }
    }
}
