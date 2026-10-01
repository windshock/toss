package im.toss.ads_sdk.ui.v2.view;

import com.google.android.gms.ads.nativead.NativeAd;
import im.toss.global.features.kyc.eu.main.navigation.GlobalKycEuNavHostKt$;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsThumbnailVideoV2View$$ExternalSyntheticLambda0 implements Function1 {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ NativeAdsThumbnailVideoV2View f$0;
    public final /* synthetic */ NativeAd f$1;

    public /* synthetic */ NativeAdsThumbnailVideoV2View$$ExternalSyntheticLambda0(NativeAdsThumbnailVideoV2View nativeAdsThumbnailVideoV2View, NativeAd nativeAd) {
        this.f$0 = nativeAdsThumbnailVideoV2View;
        this.f$1 = nativeAd;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 107;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        NativeAdsThumbnailVideoV2View nativeAdsThumbnailVideoV2View = this.f$0;
        if (i3 != 0) {
            Object[] objArr = {nativeAdsThumbnailVideoV2View, this.f$1, (NativeAd) obj};
            int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
            return (Unit) NativeAdsThumbnailVideoV2View.IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), objArr, iOnWarmupCompleted, 1336715519, -1336715519, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
        }
        Object[] objArr2 = {nativeAdsThumbnailVideoV2View, this.f$1, (NativeAd) obj};
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        throw null;
    }
}
