package im.toss.ads_sdk.ui.activity;

import im.toss.ads_sdk.model.NativeAdsDto;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.getSupportedHighSpeedResolutionsFor;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsFullPageActivity$$ExternalSyntheticLambda12 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ NativeAdsDto f$0;
    public final /* synthetic */ NativeAdsFullPageActivity f$1;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$2;

    public /* synthetic */ NativeAdsFullPageActivity$$ExternalSyntheticLambda12(NativeAdsDto nativeAdsDto, NativeAdsFullPageActivity nativeAdsFullPageActivity, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        this.f$0 = nativeAdsDto;
        this.f$1 = nativeAdsFullPageActivity;
        this.f$2 = getsupportedhighspeedresolutionsfor;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 7;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = NativeAdsFullPageActivity.onWarmupCompleted(this.f$0, this.f$1, this.f$2, ((Boolean) obj).booleanValue());
        int i4 = onNavigationEvent + 77;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 34 / 0;
        }
        return unitOnWarmupCompleted;
    }
}
