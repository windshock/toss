package im.toss.ads_sdk.ui.activity;

import android.content.Context;
import im.toss.ads_sdk.model.NativeAdsDto;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.getSupportedHighSpeedResolutionsFor;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsFullPageActivity$$ExternalSyntheticLambda18 implements Function2 {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ NativeAdsDto.Creative.FullPage f$0;
    public final /* synthetic */ NativeAdsDto f$1;
    public final /* synthetic */ NativeAdsFullPageActivity f$2;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$3;
    public final /* synthetic */ int f$4;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$5;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$6;
    public final /* synthetic */ float f$7;
    public final /* synthetic */ Context f$8;

    public /* synthetic */ NativeAdsFullPageActivity$$ExternalSyntheticLambda18(NativeAdsDto.Creative.FullPage fullPage, NativeAdsDto nativeAdsDto, NativeAdsFullPageActivity nativeAdsFullPageActivity, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, int i, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3, float f, Context context) {
        this.f$0 = fullPage;
        this.f$1 = nativeAdsDto;
        this.f$2 = nativeAdsFullPageActivity;
        this.f$3 = getsupportedhighspeedresolutionsfor;
        this.f$4 = i;
        this.f$5 = getsupportedhighspeedresolutionsfor2;
        this.f$6 = getsupportedhighspeedresolutionsfor3;
        this.f$7 = f;
        this.f$8 = context;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 3;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = NativeAdsFullPageActivity.onExtraCallback(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i4 = onNavigationEvent + 89;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }
}
