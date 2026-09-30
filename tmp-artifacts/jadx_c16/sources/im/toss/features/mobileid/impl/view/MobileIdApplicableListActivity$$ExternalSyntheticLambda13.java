package im.toss.features.mobileid.impl.view;

import im.toss.features.mobile.id.model.ApplicableVcs;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MobileIdApplicableListActivity$$ExternalSyntheticLambda13 implements Function2 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public final /* synthetic */ MobileIdApplicableListActivity f$0;
    public final /* synthetic */ ApplicableVcs f$1;

    public /* synthetic */ MobileIdApplicableListActivity$$ExternalSyntheticLambda13(MobileIdApplicableListActivity mobileIdApplicableListActivity, ApplicableVcs applicableVcs) {
        this.f$0 = mobileIdApplicableListActivity;
        this.f$1 = applicableVcs;
    }

    public final Object invoke(Object obj, Object obj2) {
        Unit unitOnExtraCallback;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 21;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            unitOnExtraCallback = MobileIdApplicableListActivity.onExtraCallback(this.f$0, this.f$1, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
            int i3 = 28 / 0;
        } else {
            unitOnExtraCallback = MobileIdApplicableListActivity.onExtraCallback(this.f$0, this.f$1, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        }
        int i4 = onExtraCallback + 125;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }
}
