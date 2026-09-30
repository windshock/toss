package im.toss.features.industrialcodeselect.impl;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.getWholePackageUrl;
import o.setParentLayoutDirection;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class IndustrialCodeSelectActivity$$ExternalSyntheticLambda8 implements Function2 {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ IndustrialCodeSelectActivity f$0;
    public final /* synthetic */ getWholePackageUrl f$1;
    public final /* synthetic */ setParentLayoutDirection f$2;

    public /* synthetic */ IndustrialCodeSelectActivity$$ExternalSyntheticLambda8(IndustrialCodeSelectActivity industrialCodeSelectActivity, getWholePackageUrl getwholepackageurl, setParentLayoutDirection setparentlayoutdirection) {
        this.f$0 = industrialCodeSelectActivity;
        this.f$1 = getwholepackageurl;
        this.f$2 = setparentlayoutdirection;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 95;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = IndustrialCodeSelectActivity.onWarmupCompleted(this.f$0, this.f$1, this.f$2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i4 = onWarmupCompleted + 51;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }
}
