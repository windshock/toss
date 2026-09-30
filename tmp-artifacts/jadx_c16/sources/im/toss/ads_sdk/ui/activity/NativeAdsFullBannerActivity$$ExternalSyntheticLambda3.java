package im.toss.ads_sdk.ui.activity;

import android.content.Context;
import im.toss.ads_sdk.model.NativeAdsDto;
import im.toss.ads_sdk.ui.view.AdsCircularCountdownLayout;
import kotlin.jvm.functions.Function1;
import o.getSupportedHighSpeedResolutionsFor;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsFullBannerActivity$$ExternalSyntheticLambda3 implements Function1 {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ NativeAdsFullBannerActivity f$0;
    public final /* synthetic */ int f$1;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$2;
    public final /* synthetic */ NativeAdsDto f$3;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$4;

    public /* synthetic */ NativeAdsFullBannerActivity$$ExternalSyntheticLambda3(NativeAdsFullBannerActivity nativeAdsFullBannerActivity, int i, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, NativeAdsDto nativeAdsDto, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2) {
        this.f$0 = nativeAdsFullBannerActivity;
        this.f$1 = i;
        this.f$2 = getsupportedhighspeedresolutionsfor;
        this.f$3 = nativeAdsDto;
        this.f$4 = getsupportedhighspeedresolutionsfor2;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 3;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        AdsCircularCountdownLayout adsCircularCountdownLayoutIAuthTabCallback = NativeAdsFullBannerActivity.IAuthTabCallback(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, (Context) obj);
        int i4 = onExtraCallbackWithResult + 57;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return adsCircularCountdownLayoutIAuthTabCallback;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
