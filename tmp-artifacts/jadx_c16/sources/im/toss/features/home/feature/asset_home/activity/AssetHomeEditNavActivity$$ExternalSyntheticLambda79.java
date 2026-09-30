package im.toss.features.home.feature.asset_home.activity;

import im.toss.features.home.feature.asset_home.viewmodel.edit.AssetEtcHomeEditViewModel;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.DeviceQuirksExternalSyntheticLambda0;
import o.getBacktraceNote;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetHomeEditNavActivity$$ExternalSyntheticLambda79 implements getBacktraceNote {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ AssetEtcHomeEditViewModel f$0;
    public final /* synthetic */ AssetHomeEditNavActivity f$1;

    public /* synthetic */ AssetHomeEditNavActivity$$ExternalSyntheticLambda79(AssetEtcHomeEditViewModel assetEtcHomeEditViewModel, AssetHomeEditNavActivity assetHomeEditNavActivity) {
        this.f$0 = assetEtcHomeEditViewModel;
        this.f$1 = assetHomeEditNavActivity;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 87;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        AssetEtcHomeEditViewModel assetEtcHomeEditViewModel = this.f$0;
        if (i3 == 0) {
            return AssetHomeEditNavActivity.onExtraCallback(assetEtcHomeEditViewModel, this.f$1, (DeviceQuirksExternalSyntheticLambda0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        }
        AssetHomeEditNavActivity.onExtraCallback(assetEtcHomeEditViewModel, this.f$1, (DeviceQuirksExternalSyntheticLambda0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        throw null;
    }
}
