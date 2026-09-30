package im.toss.features.mobileid.impl.view;

import im.toss.features.mobile.id.model.ApplicableVcs;
import kotlin.Unit;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.enableLoopMonitor;
import o.getBacktraceNote;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MobileIdApplicableListActivity$$ExternalSyntheticLambda9 implements getBacktraceNote {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public final /* synthetic */ MobileIdApplicableListActivity f$0;
    public final /* synthetic */ ApplicableVcs f$1;

    public /* synthetic */ MobileIdApplicableListActivity$$ExternalSyntheticLambda9(MobileIdApplicableListActivity mobileIdApplicableListActivity, ApplicableVcs applicableVcs) {
        this.f$0 = mobileIdApplicableListActivity;
        this.f$1 = applicableVcs;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 75;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = MobileIdApplicableListActivity.onExtraCallbackWithResult(this.f$0, this.f$1, (enableLoopMonitor) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        int i4 = onExtraCallback + 47;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }
}
