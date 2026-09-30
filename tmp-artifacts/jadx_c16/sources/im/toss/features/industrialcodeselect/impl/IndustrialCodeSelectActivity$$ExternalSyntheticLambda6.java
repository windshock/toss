package im.toss.features.industrialcodeselect.impl;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.getWholePackageUrl;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class IndustrialCodeSelectActivity$$ExternalSyntheticLambda6 implements Function2 {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ IndustrialCodeSelectActivity f$0;
    public final /* synthetic */ getWholePackageUrl f$1;

    public /* synthetic */ IndustrialCodeSelectActivity$$ExternalSyntheticLambda6(IndustrialCodeSelectActivity industrialCodeSelectActivity, getWholePackageUrl getwholepackageurl) {
        this.f$0 = industrialCodeSelectActivity;
        this.f$1 = getwholepackageurl;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 99;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        IndustrialCodeSelectActivity industrialCodeSelectActivity = this.f$0;
        if (i3 == 0) {
            return IndustrialCodeSelectActivity.onNavigationEvent(industrialCodeSelectActivity, this.f$1, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        }
        Unit unitOnNavigationEvent = IndustrialCodeSelectActivity.onNavigationEvent(industrialCodeSelectActivity, this.f$1, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i4 = 56 / 0;
        return unitOnNavigationEvent;
    }
}
