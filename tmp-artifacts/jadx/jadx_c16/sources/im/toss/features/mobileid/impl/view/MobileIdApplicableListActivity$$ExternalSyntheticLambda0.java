package im.toss.features.mobileid.impl.view;

import im.toss.features.mobile.id.model.ApplicableVcs;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MobileIdApplicableListActivity$$ExternalSyntheticLambda0 implements Function2 {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ MobileIdApplicableListActivity f$0;
    public final /* synthetic */ ApplicableVcs f$1;

    public /* synthetic */ MobileIdApplicableListActivity$$ExternalSyntheticLambda0(MobileIdApplicableListActivity mobileIdApplicableListActivity, ApplicableVcs applicableVcs) {
        this.f$0 = mobileIdApplicableListActivity;
        this.f$1 = applicableVcs;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 79;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = MobileIdApplicableListActivity.onNavigationEvent(this.f$0, this.f$1, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i4 = onWarmupCompleted + 27;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }
}
