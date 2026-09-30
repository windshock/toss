package im.toss.features.loan.widget;

import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.getErrCode;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanTermsV2CustomContentKt$$ExternalSyntheticLambda10 implements Function2 {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ String f$0;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 69;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) getErrCode.onNavigationEvent(-1101237541, 1101237543, new Object[]{this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(((Integer) obj2).intValue())}, MaxNativeAdListener.onExtraCallbackWithResult(), MaxNativeAdListener.onExtraCallbackWithResult(), MaxNativeAdListener.onExtraCallbackWithResult(), MaxNativeAdListener.onExtraCallbackWithResult());
        int i4 = onExtraCallbackWithResult + 35;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }
}
