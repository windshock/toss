package im.toss.features.mobileid.impl.qr;

import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MobileIdQRErrorActivity$$ExternalSyntheticLambda3 implements Function2 {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ MobileIdQRErrorActivity f$0;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 35;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        MobileIdQRErrorActivity mobileIdQRErrorActivity = this.f$0;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj;
        if (i3 != 0) {
            Object[] objArr = {mobileIdQRErrorActivity, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((Integer) obj2).intValue())};
            return (Unit) MobileIdQRErrorActivity.onExtraCallback(MaxNativeAdListener.onExtraCallbackWithResult(), objArr, MaxNativeAdListener.onExtraCallbackWithResult(), 1683673766, MaxNativeAdListener.onExtraCallbackWithResult(), -1683673766, MaxNativeAdListener.onExtraCallbackWithResult());
        }
        Object[] objArr2 = {mobileIdQRErrorActivity, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((Integer) obj2).intValue())};
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }
}
