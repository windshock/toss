package im.toss.features.home.feature.asset_home.activity;

import im.toss.features.home.feature.asset_home.viewmodel.edit.AssetEtcHomeEditViewModel;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.GlobalInfoRecorderUtils;
import o.TwoLineExternalSyntheticLambda0;
import o.setDividerDrawable;
import o.setTaggedAddrCtrl;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetHomeEditNavActivity$$ExternalSyntheticLambda69 implements setTaggedAddrCtrl {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ AssetHomeEditNavActivity f$0;
    public final /* synthetic */ AssetEtcHomeEditViewModel f$1;
    public final /* synthetic */ GlobalInfoRecorderUtils f$2;

    public /* synthetic */ AssetHomeEditNavActivity$$ExternalSyntheticLambda69(AssetHomeEditNavActivity assetHomeEditNavActivity, AssetEtcHomeEditViewModel assetEtcHomeEditViewModel, GlobalInfoRecorderUtils globalInfoRecorderUtils) {
        this.f$0 = assetHomeEditNavActivity;
        this.f$1 = assetEtcHomeEditViewModel;
        this.f$2 = globalInfoRecorderUtils;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 59;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return AssetHomeEditNavActivity.onWarmupCompleted(this.f$0, this.f$1, this.f$2, (setDividerDrawable) obj, (TwoLineExternalSyntheticLambda0) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
        }
        AssetHomeEditNavActivity.onWarmupCompleted(this.f$0, this.f$1, this.f$2, (setDividerDrawable) obj, (TwoLineExternalSyntheticLambda0) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
        throw null;
    }
}
