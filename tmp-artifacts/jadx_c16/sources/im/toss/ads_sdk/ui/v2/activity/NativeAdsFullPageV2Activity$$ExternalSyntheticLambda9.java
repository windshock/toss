package im.toss.ads_sdk.ui.v2.activity;

import android.content.Context;
import im.toss.ads_sdk.model.NativeAdsDto;
import im.toss.ads_sdk.ui.view.AdsCircularCountdownLayout;
import kotlin.jvm.functions.Function1;
import o.getSupportedHighSpeedResolutionsFor;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsFullPageV2Activity$$ExternalSyntheticLambda9 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ NativeAdsFullPageV2Activity f$0;
    public final /* synthetic */ int f$1;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$2;
    public final /* synthetic */ NativeAdsDto f$3;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$4;

    public /* synthetic */ NativeAdsFullPageV2Activity$$ExternalSyntheticLambda9(NativeAdsFullPageV2Activity nativeAdsFullPageV2Activity, int i, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, NativeAdsDto nativeAdsDto, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2) {
        this.f$0 = nativeAdsFullPageV2Activity;
        this.f$1 = i;
        this.f$2 = getsupportedhighspeedresolutionsfor;
        this.f$3 = nativeAdsDto;
        this.f$4 = getsupportedhighspeedresolutionsfor2;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 57;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        NativeAdsFullPageV2Activity nativeAdsFullPageV2Activity = this.f$0;
        int i4 = this.f$1;
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = this.f$2;
        NativeAdsDto nativeAdsDto = this.f$3;
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2 = this.f$4;
        Context context = (Context) obj;
        if (i3 != 0) {
            NativeAdsFullPageV2Activity.onNavigationEvent(nativeAdsFullPageV2Activity, i4, getsupportedhighspeedresolutionsfor, nativeAdsDto, getsupportedhighspeedresolutionsfor2, context);
            obj2.hashCode();
            throw null;
        }
        AdsCircularCountdownLayout adsCircularCountdownLayoutOnNavigationEvent = NativeAdsFullPageV2Activity.onNavigationEvent(nativeAdsFullPageV2Activity, i4, getsupportedhighspeedresolutionsfor, nativeAdsDto, getsupportedhighspeedresolutionsfor2, context);
        int i5 = IAuthTabCallback + 79;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return adsCircularCountdownLayoutOnNavigationEvent;
        }
        obj2.hashCode();
        throw null;
    }
}
