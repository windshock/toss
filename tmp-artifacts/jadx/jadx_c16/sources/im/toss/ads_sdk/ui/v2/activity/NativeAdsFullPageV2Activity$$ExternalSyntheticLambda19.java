package im.toss.ads_sdk.ui.v2.activity;

import com.iap.ac.android.biz.common.rpc.request.MobilePaymentInquireQuoteRequest;
import im.toss.ads_sdk.model.NativeAdsDto;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.getSupportedHighSpeedResolutionsFor;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsFullPageV2Activity$$ExternalSyntheticLambda19 implements Function2 {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ NativeAdsFullPageV2Activity f$0;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$1;
    public final /* synthetic */ int f$2;
    public final /* synthetic */ NativeAdsDto f$3;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$4;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$5;

    public /* synthetic */ NativeAdsFullPageV2Activity$$ExternalSyntheticLambda19(NativeAdsFullPageV2Activity nativeAdsFullPageV2Activity, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, int i, NativeAdsDto nativeAdsDto, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3) {
        this.f$0 = nativeAdsFullPageV2Activity;
        this.f$1 = getsupportedhighspeedresolutionsfor;
        this.f$2 = i;
        this.f$3 = nativeAdsDto;
        this.f$4 = getsupportedhighspeedresolutionsfor2;
        this.f$5 = getsupportedhighspeedresolutionsfor3;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 31;
        onNavigationEvent = i2 % 128;
        Object obj3 = null;
        if (i2 % 2 != 0) {
            NativeAdsFullPageV2Activity nativeAdsFullPageV2Activity = this.f$0;
            getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = this.f$1;
            int i3 = this.f$2;
            int iIntValue = ((Integer) obj2).intValue();
            throw null;
        }
        NativeAdsFullPageV2Activity nativeAdsFullPageV2Activity2 = this.f$0;
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2 = this.f$1;
        int i4 = this.f$2;
        int iIntValue2 = ((Integer) obj2).intValue();
        Unit unit = (Unit) NativeAdsFullPageV2Activity.onNavigationEvent(MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), new Object[]{nativeAdsFullPageV2Activity2, getsupportedhighspeedresolutionsfor2, Integer.valueOf(i4), this.f$3, this.f$4, this.f$5, (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(iIntValue2)}, -780955414, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), 780955415, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult());
        int i5 = onExtraCallback + 67;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return unit;
        }
        obj3.hashCode();
        throw null;
    }
}
