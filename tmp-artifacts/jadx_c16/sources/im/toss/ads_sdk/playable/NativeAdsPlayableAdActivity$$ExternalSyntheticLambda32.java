package im.toss.ads_sdk.playable;

import im.toss.ads_sdk.model.NativeAdsDto;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import o.nSetPosition;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsPlayableAdActivity$$ExternalSyntheticLambda32 implements Function0 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public final /* synthetic */ NativeAdsPlayableAdActivity f$0;
    public final /* synthetic */ NativeAdsDto f$1;
    public final /* synthetic */ NativeAdsDto.AdAsset f$2;

    public /* synthetic */ NativeAdsPlayableAdActivity$$ExternalSyntheticLambda32(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity, NativeAdsDto nativeAdsDto, NativeAdsDto.AdAsset adAsset) {
        this.f$0 = nativeAdsPlayableAdActivity;
        this.f$1 = nativeAdsDto;
        this.f$2 = adAsset;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 115;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity = this.f$0;
        if (i3 != 0) {
            Object[] objArr = {nativeAdsPlayableAdActivity, this.f$1, this.f$2};
            return (Unit) NativeAdsPlayableAdActivity.onNavigationEvent(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -1107778039, 1107778051, objArr);
        }
        Object[] objArr2 = {nativeAdsPlayableAdActivity, this.f$1, this.f$2};
        throw null;
    }
}
