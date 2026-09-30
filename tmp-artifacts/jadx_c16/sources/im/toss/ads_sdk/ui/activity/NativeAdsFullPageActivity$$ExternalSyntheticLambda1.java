package im.toss.ads_sdk.ui.activity;

import android.content.Context;
import im.toss.ads_sdk.model.NativeAdsDto;
import kotlin.jvm.functions.Function1;
import o.getSupportedHighSpeedResolutionsFor;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsFullPageActivity$$ExternalSyntheticLambda1 implements Function1 {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ NativeAdsFullPageActivity f$0;
    public final /* synthetic */ int f$1;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$2;
    public final /* synthetic */ NativeAdsDto f$3;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$4;

    public /* synthetic */ NativeAdsFullPageActivity$$ExternalSyntheticLambda1(NativeAdsFullPageActivity nativeAdsFullPageActivity, int i, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, NativeAdsDto nativeAdsDto, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2) {
        this.f$0 = nativeAdsFullPageActivity;
        this.f$1 = i;
        this.f$2 = getsupportedhighspeedresolutionsfor;
        this.f$3 = nativeAdsDto;
        this.f$4 = getsupportedhighspeedresolutionsfor2;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 27;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return NativeAdsFullPageActivity.onWarmupCompleted(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, (Context) obj);
        }
        int i3 = 72 / 0;
        return NativeAdsFullPageActivity.onWarmupCompleted(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, (Context) obj);
    }
}
