package im.toss.ads_sdk.ui.activity;

import android.view.View;
import im.toss.ads_sdk.model.NativeAdsDto;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsShortVideoActivity$$ExternalSyntheticLambda8 implements View.OnClickListener {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ NativeAdsShortVideoActivity f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ NativeAdsDto.AdAsset f$2;
    public final /* synthetic */ NativeAdsDto.Creative.ShortFormVideo f$3;

    public /* synthetic */ NativeAdsShortVideoActivity$$ExternalSyntheticLambda8(NativeAdsShortVideoActivity nativeAdsShortVideoActivity, String str, NativeAdsDto.AdAsset adAsset, NativeAdsDto.Creative.ShortFormVideo shortFormVideo) {
        this.f$0 = nativeAdsShortVideoActivity;
        this.f$1 = str;
        this.f$2 = adAsset;
        this.f$3 = shortFormVideo;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 15;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        NativeAdsShortVideoActivity nativeAdsShortVideoActivity = this.f$0;
        if (i3 == 0) {
            NativeAdsShortVideoActivity.onNavigationEvent(nativeAdsShortVideoActivity, this.f$1, this.f$2, this.f$3, view);
            return;
        }
        NativeAdsShortVideoActivity.onNavigationEvent(nativeAdsShortVideoActivity, this.f$1, this.f$2, this.f$3, view);
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
