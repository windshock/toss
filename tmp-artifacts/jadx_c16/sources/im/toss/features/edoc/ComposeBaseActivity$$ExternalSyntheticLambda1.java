package im.toss.features.edoc;

import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.DeviceQuirksExternalSyntheticLambda0;
import o.getBacktraceNote;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ComposeBaseActivity$$ExternalSyntheticLambda1 implements getBacktraceNote {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ ComposeBaseActivity f$0;

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 35;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        ComposeBaseActivity composeBaseActivity = this.f$0;
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0 = (DeviceQuirksExternalSyntheticLambda0) obj;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        if (i3 != 0) {
            return ComposeBaseActivity.onWarmupCompleted(composeBaseActivity, deviceQuirksExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        }
        ComposeBaseActivity.onWarmupCompleted(composeBaseActivity, deviceQuirksExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        Object obj4 = null;
        obj4.hashCode();
        throw null;
    }
}
