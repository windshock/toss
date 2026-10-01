package im.toss.features.home.feature.asset_home.activity;

import im.toss.features.home.feature.asset_home.viewmodel.edit.AssetLoanHomeEditViewModel;
import kotlin.Unit;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.DeviceQuirksExternalSyntheticLambda0;
import o.getBacktraceNote;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetHomeEditNavActivity$$ExternalSyntheticLambda94 implements getBacktraceNote {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public final /* synthetic */ AssetLoanHomeEditViewModel f$0;
    public final /* synthetic */ AssetHomeEditNavActivity f$1;

    public /* synthetic */ AssetHomeEditNavActivity$$ExternalSyntheticLambda94(AssetLoanHomeEditViewModel assetLoanHomeEditViewModel, AssetHomeEditNavActivity assetHomeEditNavActivity) {
        this.f$0 = assetLoanHomeEditViewModel;
        this.f$1 = assetHomeEditNavActivity;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 77;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        AssetLoanHomeEditViewModel assetLoanHomeEditViewModel = this.f$0;
        if (i3 == 0) {
            return AssetHomeEditNavActivity.onExtraCallbackWithResult(assetLoanHomeEditViewModel, this.f$1, (DeviceQuirksExternalSyntheticLambda0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        }
        Unit unitOnExtraCallbackWithResult = AssetHomeEditNavActivity.onExtraCallbackWithResult(assetLoanHomeEditViewModel, this.f$1, (DeviceQuirksExternalSyntheticLambda0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        int i4 = 94 / 0;
        return unitOnExtraCallbackWithResult;
    }
}
