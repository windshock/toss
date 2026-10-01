package im.toss.features.mobileid.impl.view;

import im.toss.features.mobile.id.model.ApplicableVcs;
import kotlin.Unit;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.DeviceQuirksExternalSyntheticLambda0;
import o.getBacktraceNote;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MobileIdApplicableListActivity$$ExternalSyntheticLambda12 implements getBacktraceNote {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ ApplicableVcs f$0;
    public final /* synthetic */ MobileIdApplicableListActivity f$1;

    public /* synthetic */ MobileIdApplicableListActivity$$ExternalSyntheticLambda12(ApplicableVcs applicableVcs, MobileIdApplicableListActivity mobileIdApplicableListActivity) {
        this.f$0 = applicableVcs;
        this.f$1 = mobileIdApplicableListActivity;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 117;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = MobileIdApplicableListActivity.onExtraCallback(this.f$0, this.f$1, (DeviceQuirksExternalSyntheticLambda0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        int i4 = IAuthTabCallback + 55;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }
}
