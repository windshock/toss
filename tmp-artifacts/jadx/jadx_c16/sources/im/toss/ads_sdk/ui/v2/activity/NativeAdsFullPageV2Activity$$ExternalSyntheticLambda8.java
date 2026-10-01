package im.toss.ads_sdk.ui.v2.activity;

import com.iap.ac.android.biz.common.rpc.request.MobilePaymentInquireQuoteRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsFullPageV2Activity$$ExternalSyntheticLambda8 implements Function0 {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ NativeAdsFullPageV2Activity f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 89;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        Unit unit = (Unit) NativeAdsFullPageV2Activity.onNavigationEvent(MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), new Object[]{this.f$0}, -686973746, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), 686973748, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult());
        int i3 = onNavigationEvent + 85;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }
}
