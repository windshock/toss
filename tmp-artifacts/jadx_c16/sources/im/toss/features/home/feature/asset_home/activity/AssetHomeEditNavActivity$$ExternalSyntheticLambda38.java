package im.toss.features.home.feature.asset_home.activity;

import im.toss.features.home.feature.asset_home.viewmodel.edit.AssetDepositHomeEditViewModel;
import kotlin.Unit;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.DeviceQuirksExternalSyntheticLambda0;
import o.getBacktraceNote;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetHomeEditNavActivity$$ExternalSyntheticLambda38 implements getBacktraceNote {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ AssetDepositHomeEditViewModel f$0;
    public final /* synthetic */ AssetHomeEditNavActivity f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ AssetHomeEditNavActivity$$ExternalSyntheticLambda38(AssetDepositHomeEditViewModel assetDepositHomeEditViewModel, AssetHomeEditNavActivity assetHomeEditNavActivity, int i) {
        this.f$0 = assetDepositHomeEditViewModel;
        this.f$1 = assetHomeEditNavActivity;
        this.f$2 = i;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 9;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = AssetHomeEditNavActivity.onNavigationEvent(this.f$0, this.f$1, this.f$2, (DeviceQuirksExternalSyntheticLambda0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        if (i3 != 0) {
            int i4 = 9 / 0;
        }
        int i5 = onExtraCallback + 5;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return unitOnNavigationEvent;
    }
}
