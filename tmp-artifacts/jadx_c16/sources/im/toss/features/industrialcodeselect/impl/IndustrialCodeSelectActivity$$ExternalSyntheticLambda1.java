package im.toss.features.industrialcodeselect.impl;

import kotlin.Unit;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.MaxRewardedInterstitialAdapterListener;
import o.getBacktraceNote;
import o.getWholePackageUrl;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class IndustrialCodeSelectActivity$$ExternalSyntheticLambda1 implements getBacktraceNote {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ getWholePackageUrl f$0;

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 77;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        getWholePackageUrl getwholepackageurl = this.f$0;
        MaxRewardedInterstitialAdapterListener maxRewardedInterstitialAdapterListener = (MaxRewardedInterstitialAdapterListener) obj;
        if (i3 != 0) {
            return IndustrialCodeSelectActivity.IAuthTabCallback(getwholepackageurl, maxRewardedInterstitialAdapterListener, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        }
        Unit unitIAuthTabCallback = IndustrialCodeSelectActivity.IAuthTabCallback(getwholepackageurl, maxRewardedInterstitialAdapterListener, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        int i4 = 47 / 0;
        return unitIAuthTabCallback;
    }
}
