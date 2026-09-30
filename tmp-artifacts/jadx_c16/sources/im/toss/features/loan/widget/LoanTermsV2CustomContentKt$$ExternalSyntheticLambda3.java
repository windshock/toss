package im.toss.features.loan.widget;

import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import kotlin.jvm.functions.Function2;
import o.VirtualCameraCaptureResult;
import o.component8;
import o.getErrCode;
import o.isExtraPreviewRequired;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanTermsV2CustomContentKt$$ExternalSyntheticLambda3 implements Function2 {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ Function2 f$0;
    public final /* synthetic */ Function2 f$1;
    public final /* synthetic */ Function2 f$2;

    public /* synthetic */ LoanTermsV2CustomContentKt$$ExternalSyntheticLambda3(Function2 function2, Function2 function22, Function2 function23) {
        this.f$0 = function2;
        this.f$1 = function22;
        this.f$2 = function23;
    }

    public final Object invoke(Object obj, Object obj2) {
        component8 component8Var;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 33;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            component8Var = (component8) getErrCode.onNavigationEvent(-619808038, 619808042, new Object[]{this.f$0, this.f$1, this.f$2, (isExtraPreviewRequired) obj, (VirtualCameraCaptureResult) obj2}, MaxNativeAdListener.onExtraCallbackWithResult(), MaxNativeAdListener.onExtraCallbackWithResult(), MaxNativeAdListener.onExtraCallbackWithResult(), MaxNativeAdListener.onExtraCallbackWithResult());
            int i3 = 68 / 0;
        } else {
            component8Var = (component8) getErrCode.onNavigationEvent(-619808038, 619808042, new Object[]{this.f$0, this.f$1, this.f$2, (isExtraPreviewRequired) obj, (VirtualCameraCaptureResult) obj2}, MaxNativeAdListener.onExtraCallbackWithResult(), MaxNativeAdListener.onExtraCallbackWithResult(), MaxNativeAdListener.onExtraCallbackWithResult(), MaxNativeAdListener.onExtraCallbackWithResult());
        }
        int i4 = onExtraCallback + 69;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return component8Var;
        }
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }
}
