package im.toss.features.mobileid.impl.view;

import kotlin.Unit;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.getBacktraceNote;
import o.u4;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MobileIdCommonErrorFinishActivity$$ExternalSyntheticLambda9 implements getBacktraceNote {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ MobileIdCommonErrorFinishActivity f$0;

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 1;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        MobileIdCommonErrorFinishActivity mobileIdCommonErrorFinishActivity = this.f$0;
        u4 u4Var = (u4) obj;
        if (i3 != 0) {
            return MobileIdCommonErrorFinishActivity.onExtraCallbackWithResult(mobileIdCommonErrorFinishActivity, u4Var, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        }
        Unit unitOnExtraCallbackWithResult = MobileIdCommonErrorFinishActivity.onExtraCallbackWithResult(mobileIdCommonErrorFinishActivity, u4Var, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        int i4 = 53 / 0;
        return unitOnExtraCallbackWithResult;
    }
}
