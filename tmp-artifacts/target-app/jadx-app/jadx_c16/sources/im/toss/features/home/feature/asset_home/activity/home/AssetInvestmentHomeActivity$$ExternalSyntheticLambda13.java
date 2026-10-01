package im.toss.features.home.feature.asset_home.activity.home;

import kotlin.Unit;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraExecutorExternalSyntheticLambda0;
import o.getInternalId;
import o.setTaggedAddrCtrl;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetInvestmentHomeActivity$$ExternalSyntheticLambda13 implements setTaggedAddrCtrl {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ getInternalId f$0;
    public final /* synthetic */ AssetInvestmentHomeActivity f$1;

    public /* synthetic */ AssetInvestmentHomeActivity$$ExternalSyntheticLambda13(getInternalId getinternalid, AssetInvestmentHomeActivity assetInvestmentHomeActivity) {
        this.f$0 = getinternalid;
        this.f$1 = assetInvestmentHomeActivity;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        Unit unitOnNavigationEvent;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 119;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            unitOnNavigationEvent = AssetInvestmentHomeActivity.onNavigationEvent(this.f$0, this.f$1, (CameraExecutorExternalSyntheticLambda0) obj, ((Integer) obj2).intValue(), (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
            int i3 = 38 / 0;
        } else {
            unitOnNavigationEvent = AssetInvestmentHomeActivity.onNavigationEvent(this.f$0, this.f$1, (CameraExecutorExternalSyntheticLambda0) obj, ((Integer) obj2).intValue(), (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
        }
        int i4 = onWarmupCompleted + 99;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 71 / 0;
        }
        return unitOnNavigationEvent;
    }
}
