package im.toss.features.industrialcodeselect.impl;

import kotlin.Unit;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.DeviceQuirksExternalSyntheticLambda0;
import o.getBacktraceNote;
import o.setParentLayoutDirection;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class IndustrialCodeSelectActivity$$ExternalSyntheticLambda7 implements getBacktraceNote {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ setParentLayoutDirection f$0;
    public final /* synthetic */ IndustrialCodeSelectActivity f$1;

    public /* synthetic */ IndustrialCodeSelectActivity$$ExternalSyntheticLambda7(setParentLayoutDirection setparentlayoutdirection, IndustrialCodeSelectActivity industrialCodeSelectActivity) {
        this.f$0 = setparentlayoutdirection;
        this.f$1 = industrialCodeSelectActivity;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 103;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = IndustrialCodeSelectActivity.onWarmupCompleted(this.f$0, this.f$1, (DeviceQuirksExternalSyntheticLambda0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        int i4 = onExtraCallbackWithResult + 81;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 25 / 0;
        }
        return unitOnWarmupCompleted;
    }
}
