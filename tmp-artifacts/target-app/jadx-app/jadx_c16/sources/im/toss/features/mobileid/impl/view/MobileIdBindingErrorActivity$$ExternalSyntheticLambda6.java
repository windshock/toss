package im.toss.features.mobileid.impl.view;

import kotlin.Unit;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.getBacktraceNote;
import o.y1ExternalSyntheticLambda3;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MobileIdBindingErrorActivity$$ExternalSyntheticLambda6 implements getBacktraceNote {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ MobileIdBindingErrorActivity f$0;

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Unit unitOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 71;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            unitOnExtraCallbackWithResult = MobileIdBindingErrorActivity.onExtraCallbackWithResult(this.f$0, (y1ExternalSyntheticLambda3) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            int i3 = 78 / 0;
        } else {
            unitOnExtraCallbackWithResult = MobileIdBindingErrorActivity.onExtraCallbackWithResult(this.f$0, (y1ExternalSyntheticLambda3) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        }
        int i4 = IAuthTabCallback + 103;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }
}
