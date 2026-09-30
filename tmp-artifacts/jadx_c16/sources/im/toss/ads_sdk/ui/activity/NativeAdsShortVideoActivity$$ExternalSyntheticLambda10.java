package im.toss.ads_sdk.ui.activity;

import android.view.MotionEvent;
import im.toss.ads_sdk.model.NativeAdsDto;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsShortVideoActivity$$ExternalSyntheticLambda10 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ NativeAdsShortVideoActivity f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ NativeAdsDto.AdAsset f$2;
    public final /* synthetic */ NativeAdsDto.Creative.ShortFormVideo f$3;

    public /* synthetic */ NativeAdsShortVideoActivity$$ExternalSyntheticLambda10(NativeAdsShortVideoActivity nativeAdsShortVideoActivity, String str, NativeAdsDto.AdAsset adAsset, NativeAdsDto.Creative.ShortFormVideo shortFormVideo) {
        this.f$0 = nativeAdsShortVideoActivity;
        this.f$1 = str;
        this.f$2 = adAsset;
        this.f$3 = shortFormVideo;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 23;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = NativeAdsShortVideoActivity.IAuthTabCallback(this.f$0, this.f$1, this.f$2, this.f$3, (MotionEvent) obj);
        int i4 = IAuthTabCallback + 1;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }
}
