package im.toss.features.home.feature.asset_home.activity;

import im.toss.features.home.feature.asset_home.viewmodel.edit.AssetCardHomeEditViewModel;
import kotlin.Unit;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.DeviceQuirksExternalSyntheticLambda0;
import o.GlobalInfoRecorderUtils;
import o.getBacktraceNote;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetHomeEditNavActivity$$ExternalSyntheticLambda92 implements getBacktraceNote {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ AssetHomeEditNavActivity f$0;
    public final /* synthetic */ AssetCardHomeEditViewModel f$1;
    public final /* synthetic */ GlobalInfoRecorderUtils f$2;

    public /* synthetic */ AssetHomeEditNavActivity$$ExternalSyntheticLambda92(AssetHomeEditNavActivity assetHomeEditNavActivity, AssetCardHomeEditViewModel assetCardHomeEditViewModel, GlobalInfoRecorderUtils globalInfoRecorderUtils) {
        this.f$0 = assetHomeEditNavActivity;
        this.f$1 = assetCardHomeEditViewModel;
        this.f$2 = globalInfoRecorderUtils;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Unit unitOnNavigationEvent;
        int i = 2 % 2;
        int i2 = onExtraCallback + 63;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            unitOnNavigationEvent = AssetHomeEditNavActivity.onNavigationEvent(this.f$0, this.f$1, this.f$2, (DeviceQuirksExternalSyntheticLambda0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            int i3 = 84 / 0;
        } else {
            unitOnNavigationEvent = AssetHomeEditNavActivity.onNavigationEvent(this.f$0, this.f$1, this.f$2, (DeviceQuirksExternalSyntheticLambda0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        }
        int i4 = onExtraCallback + 7;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }
}
