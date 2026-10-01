package im.toss.features.mobileid.impl.view;

import im.toss.features.mobile.id.model.ApplicableVcs;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MobileIdApplicableListActivity$$ExternalSyntheticLambda1 implements Function2 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ MobileIdApplicableListActivity f$0;
    public final /* synthetic */ ApplicableVcs f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ MobileIdApplicableListActivity$$ExternalSyntheticLambda1(MobileIdApplicableListActivity mobileIdApplicableListActivity, ApplicableVcs applicableVcs, int i) {
        this.f$0 = mobileIdApplicableListActivity;
        this.f$1 = applicableVcs;
        this.f$2 = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 87;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = MobileIdApplicableListActivity.onExtraCallback(this.f$0, this.f$1, this.f$2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i4 = IAuthTabCallback + 51;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }
}
