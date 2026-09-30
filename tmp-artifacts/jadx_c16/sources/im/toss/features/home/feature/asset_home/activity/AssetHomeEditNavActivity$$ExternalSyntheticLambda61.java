package im.toss.features.home.feature.asset_home.activity;

import im.toss.features.home.feature.asset_home.viewmodel.edit.AssetCardHomeEditViewModel;
import kotlin.Unit;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.DeviceQuirksExternalSyntheticLambda0;
import o.getBacktraceNote;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetHomeEditNavActivity$$ExternalSyntheticLambda61 implements getBacktraceNote {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ AssetCardHomeEditViewModel f$0;
    public final /* synthetic */ AssetHomeEditNavActivity f$1;

    public /* synthetic */ AssetHomeEditNavActivity$$ExternalSyntheticLambda61(AssetCardHomeEditViewModel assetCardHomeEditViewModel, AssetHomeEditNavActivity assetHomeEditNavActivity) {
        this.f$0 = assetCardHomeEditViewModel;
        this.f$1 = assetHomeEditNavActivity;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Unit unitOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = onExtraCallback + 121;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            unitOnWarmupCompleted = AssetHomeEditNavActivity.onWarmupCompleted(this.f$0, this.f$1, (DeviceQuirksExternalSyntheticLambda0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            int i3 = 55 / 0;
        } else {
            unitOnWarmupCompleted = AssetHomeEditNavActivity.onWarmupCompleted(this.f$0, this.f$1, (DeviceQuirksExternalSyntheticLambda0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        }
        int i4 = onExtraCallbackWithResult + 9;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }
}
