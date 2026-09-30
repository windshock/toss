package im.toss.features.home.feature.asset_home.activity;

import im.toss.features.home.feature.asset_home.viewmodel.edit.AssetLoanHomeEditViewModel;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.DeviceQuirksExternalSyntheticLambda0;
import o.GlobalInfoRecorderUtils;
import o.getBacktraceNote;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetHomeEditNavActivity$$ExternalSyntheticLambda19 implements getBacktraceNote {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ AssetHomeEditNavActivity f$0;
    public final /* synthetic */ AssetLoanHomeEditViewModel f$1;
    public final /* synthetic */ GlobalInfoRecorderUtils f$2;

    public /* synthetic */ AssetHomeEditNavActivity$$ExternalSyntheticLambda19(AssetHomeEditNavActivity assetHomeEditNavActivity, AssetLoanHomeEditViewModel assetLoanHomeEditViewModel, GlobalInfoRecorderUtils globalInfoRecorderUtils) {
        this.f$0 = assetHomeEditNavActivity;
        this.f$1 = assetLoanHomeEditViewModel;
        this.f$2 = globalInfoRecorderUtils;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 7;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return AssetHomeEditNavActivity.IAuthTabCallback(this.f$0, this.f$1, this.f$2, (DeviceQuirksExternalSyntheticLambda0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        }
        AssetHomeEditNavActivity.IAuthTabCallback(this.f$0, this.f$1, this.f$2, (DeviceQuirksExternalSyntheticLambda0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        Object obj4 = null;
        obj4.hashCode();
        throw null;
    }
}
