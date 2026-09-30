package im.toss.ads_sdk.ui.activity;

import android.content.Context;
import com.facebook.imagepipeline.core.ProducerSequenceFactory$;
import im.toss.ads_sdk.model.NativeAdsDto;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.getSupportedHighSpeedResolutionsFor;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsFullPageActivity$$ExternalSyntheticLambda10 implements Function2 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ NativeAdsDto.Creative.FullPage f$0;
    public final /* synthetic */ NativeAdsDto f$1;
    public final /* synthetic */ NativeAdsFullPageActivity f$2;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$3;
    public final /* synthetic */ int f$4;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$5;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$6;
    public final /* synthetic */ float f$7;
    public final /* synthetic */ Context f$8;

    public /* synthetic */ NativeAdsFullPageActivity$$ExternalSyntheticLambda10(NativeAdsDto.Creative.FullPage fullPage, NativeAdsDto nativeAdsDto, NativeAdsFullPageActivity nativeAdsFullPageActivity, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, int i, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3, float f, Context context) {
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
        int i2 = onNavigationEvent + 89;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        NativeAdsDto.Creative.FullPage fullPage = this.f$0;
        NativeAdsDto nativeAdsDto = this.f$1;
        NativeAdsFullPageActivity nativeAdsFullPageActivity = this.f$2;
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = this.f$3;
        int i4 = this.f$4;
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2 = this.f$5;
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3 = this.f$6;
        float f = this.f$7;
        int iIntValue = ((Integer) obj2).intValue();
        Object[] objArr = {fullPage, nativeAdsDto, nativeAdsFullPageActivity, getsupportedhighspeedresolutionsfor, Integer.valueOf(i4), getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutionsfor3, Float.valueOf(f), this.f$8, (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(iIntValue)};
        Unit unit = (Unit) NativeAdsFullPageActivity.onExtraCallbackWithResult(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), -153657979, 153657984, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), objArr, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult());
        int i5 = onNavigationEvent + 89;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }
}
