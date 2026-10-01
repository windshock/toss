package im.toss.features.home.feature.asset_home.activity.home;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraPresenceProviderExternalSyntheticLambda6;
import o.findResAndMsg;
import o.getInternalId;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetInvestmentHomeActivity$$ExternalSyntheticLambda14 implements Function2 {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ getInternalId f$0;
    public final /* synthetic */ AssetInvestmentHomeActivity f$1;
    public final /* synthetic */ findResAndMsg f$2;
    public final /* synthetic */ CameraPresenceProviderExternalSyntheticLambda6 f$3;

    public /* synthetic */ AssetInvestmentHomeActivity$$ExternalSyntheticLambda14(getInternalId getinternalid, AssetInvestmentHomeActivity assetInvestmentHomeActivity, findResAndMsg findresandmsg, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6) {
        this.f$0 = getinternalid;
        this.f$1 = assetInvestmentHomeActivity;
        this.f$2 = findresandmsg;
        this.f$3 = cameraPresenceProviderExternalSyntheticLambda6;
    }

    public final Object invoke(Object obj, Object obj2) {
        Unit unitOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 117;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            unitOnWarmupCompleted = AssetInvestmentHomeActivity.onWarmupCompleted(this.f$0, this.f$1, this.f$2, this.f$3, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
            int i3 = 3 / 0;
        } else {
            unitOnWarmupCompleted = AssetInvestmentHomeActivity.onWarmupCompleted(this.f$0, this.f$1, this.f$2, this.f$3, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        }
        int i4 = onWarmupCompleted + 15;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }
}
