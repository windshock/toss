package im.toss.ads_sdk.ui.v2.activity;

import android.view.View;
import com.google.zxing.datamatrix.encoder.C40Encoder;
import im.toss.ads_sdk.model.NativeAdsDto;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsShortVideoV2Activity$$ExternalSyntheticLambda18 implements View.OnClickListener {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public final /* synthetic */ NativeAdsShortVideoV2Activity f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ NativeAdsDto.AdAsset f$2;
    public final /* synthetic */ NativeAdsDto.Creative.ShortFormVideo f$3;

    public /* synthetic */ NativeAdsShortVideoV2Activity$$ExternalSyntheticLambda18(NativeAdsShortVideoV2Activity nativeAdsShortVideoV2Activity, String str, NativeAdsDto.AdAsset adAsset, NativeAdsDto.Creative.ShortFormVideo shortFormVideo) {
        this.f$0 = nativeAdsShortVideoV2Activity;
        this.f$1 = str;
        this.f$2 = adAsset;
        this.f$3 = shortFormVideo;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 81;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        NativeAdsShortVideoV2Activity.onExtraCallbackWithResult(C40Encoder.onExtraCallback(), -128877873, new Object[]{this.f$0, this.f$1, this.f$2, this.f$3, view}, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), 128877883, C40Encoder.onExtraCallback());
        int i4 = onExtraCallback + 23;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }
}
