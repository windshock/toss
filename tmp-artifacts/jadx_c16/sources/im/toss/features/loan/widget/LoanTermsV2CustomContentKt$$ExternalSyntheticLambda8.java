package im.toss.features.loan.widget;

import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.getErrCode;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanTermsV2CustomContentKt$$ExternalSyntheticLambda8 implements Function2 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public final /* synthetic */ Function2 f$0;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 81;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) getErrCode.onNavigationEvent(924687139, -924687134, new Object[]{this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(((Integer) obj2).intValue())}, MaxNativeAdListener.onExtraCallbackWithResult(), MaxNativeAdListener.onExtraCallbackWithResult(), MaxNativeAdListener.onExtraCallbackWithResult(), MaxNativeAdListener.onExtraCallbackWithResult());
        int i4 = onExtraCallback + 55;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }
}
