package im.toss.features.mobileid.impl.view;

import im.toss.features.mobile.id.model.AvailableVcListResponse;
import im.toss.tds.compose.component.compound.listrow.v1.RightPreset;
import kotlin.Unit;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.getBacktraceNote;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MobileIdApplicableListActivity$$ExternalSyntheticLambda6 implements getBacktraceNote {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ MobileIdApplicableListActivity f$0;
    public final /* synthetic */ AvailableVcListResponse.ApplicableVc f$1;

    public /* synthetic */ MobileIdApplicableListActivity$$ExternalSyntheticLambda6(MobileIdApplicableListActivity mobileIdApplicableListActivity, AvailableVcListResponse.ApplicableVc applicableVc) {
        this.f$0 = mobileIdApplicableListActivity;
        this.f$1 = applicableVc;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 17;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = MobileIdApplicableListActivity.onNavigationEvent(this.f$0, this.f$1, (RightPreset) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        int i4 = onExtraCallbackWithResult + 79;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 9 / 0;
        }
        return unitOnNavigationEvent;
    }
}
