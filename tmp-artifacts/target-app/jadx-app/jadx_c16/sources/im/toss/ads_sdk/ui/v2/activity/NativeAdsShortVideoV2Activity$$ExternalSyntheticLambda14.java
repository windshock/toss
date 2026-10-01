package im.toss.ads_sdk.ui.v2.activity;

import android.view.View;
import im.toss.ads_sdk.model.NativeAdsDto;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsShortVideoV2Activity$$ExternalSyntheticLambda14 implements View.OnClickListener {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ NativeAdsShortVideoV2Activity f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ NativeAdsDto.AdAsset f$2;
    public final /* synthetic */ NativeAdsDto.Creative.ShortFormVideo f$3;

    public /* synthetic */ NativeAdsShortVideoV2Activity$$ExternalSyntheticLambda14(NativeAdsShortVideoV2Activity nativeAdsShortVideoV2Activity, String str, NativeAdsDto.AdAsset adAsset, NativeAdsDto.Creative.ShortFormVideo shortFormVideo) {
        this.f$0 = nativeAdsShortVideoV2Activity;
        this.f$1 = str;
        this.f$2 = adAsset;
        this.f$3 = shortFormVideo;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 69;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            NativeAdsShortVideoV2Activity.onWarmupCompleted(this.f$0, this.f$1, this.f$2, this.f$3, view);
            int i3 = 46 / 0;
        } else {
            NativeAdsShortVideoV2Activity.onWarmupCompleted(this.f$0, this.f$1, this.f$2, this.f$3, view);
        }
        int i4 = onExtraCallback + 75;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }
}
