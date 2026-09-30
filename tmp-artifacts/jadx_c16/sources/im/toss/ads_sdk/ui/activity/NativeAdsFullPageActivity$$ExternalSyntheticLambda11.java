package im.toss.ads_sdk.ui.activity;

import im.toss.ads_sdk.model.NativeAdsDto;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsFullPageActivity$$ExternalSyntheticLambda11 implements Function2 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    public final /* synthetic */ NativeAdsDto f$0;
    public final /* synthetic */ NativeAdsFullPageActivity f$1;
    public final /* synthetic */ NativeAdsDto.Creative.FullPage f$2;

    public /* synthetic */ NativeAdsFullPageActivity$$ExternalSyntheticLambda11(NativeAdsDto nativeAdsDto, NativeAdsFullPageActivity nativeAdsFullPageActivity, NativeAdsDto.Creative.FullPage fullPage) {
        this.f$0 = nativeAdsDto;
        this.f$1 = nativeAdsFullPageActivity;
        this.f$2 = fullPage;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 63;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = NativeAdsFullPageActivity.onNavigationEvent(this.f$0, this.f$1, this.f$2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i4 = IAuthTabCallback + 77;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }
}
