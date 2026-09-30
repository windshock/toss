package im.toss.ads_sdk.ui.v2.activity;

import android.content.Context;
import com.iap.ac.android.biz.common.rpc.request.MobilePaymentInquireQuoteRequest;
import im.toss.ads_sdk.model.NativeAdsDto;
import kotlin.Unit;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.DeviceQuirksExternalSyntheticLambda0;
import o.getBacktraceNote;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsFullPageV2Activity$$ExternalSyntheticLambda20 implements getBacktraceNote {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ NativeAdsDto f$0;
    public final /* synthetic */ NativeAdsDto.Creative.FullPage f$1;
    public final /* synthetic */ float f$2;
    public final /* synthetic */ NativeAdsFullPageV2Activity f$3;
    public final /* synthetic */ Context f$4;

    public /* synthetic */ NativeAdsFullPageV2Activity$$ExternalSyntheticLambda20(NativeAdsDto nativeAdsDto, NativeAdsDto.Creative.FullPage fullPage, float f, NativeAdsFullPageV2Activity nativeAdsFullPageV2Activity, Context context) {
        this.f$0 = nativeAdsDto;
        this.f$1 = fullPage;
        this.f$2 = f;
        this.f$3 = nativeAdsFullPageV2Activity;
        this.f$4 = context;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 91;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            NativeAdsDto nativeAdsDto = this.f$0;
            NativeAdsDto.Creative.FullPage fullPage = this.f$1;
            float f = this.f$2;
            int iIntValue = ((Integer) obj3).intValue();
            throw null;
        }
        NativeAdsDto nativeAdsDto2 = this.f$0;
        NativeAdsDto.Creative.FullPage fullPage2 = this.f$1;
        float f2 = this.f$2;
        int iIntValue2 = ((Integer) obj3).intValue();
        Unit unit = (Unit) NativeAdsFullPageV2Activity.onNavigationEvent(MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), new Object[]{nativeAdsDto2, fullPage2, Float.valueOf(f2), this.f$3, this.f$4, (DeviceQuirksExternalSyntheticLambda0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(iIntValue2)}, 635403766, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), -635403760, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult());
        int i3 = onExtraCallbackWithResult + 73;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return unit;
        }
        throw null;
    }
}
