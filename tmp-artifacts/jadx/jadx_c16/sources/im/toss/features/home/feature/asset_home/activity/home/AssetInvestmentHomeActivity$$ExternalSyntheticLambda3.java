package im.toss.features.home.feature.asset_home.activity.home;

import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraPresenceProviderExternalSyntheticLambda6;
import o.HighSpeedResolverExternalSyntheticLambda2;
import o.findResAndMsg;
import o.getInternalId;
import o.setTaggedAddrCtrl;
import o.switchUserLoginRpc;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetInvestmentHomeActivity$$ExternalSyntheticLambda3 implements setTaggedAddrCtrl {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ findResAndMsg f$0;
    public final /* synthetic */ getInternalId f$1;
    public final /* synthetic */ AssetInvestmentHomeActivity f$2;
    public final /* synthetic */ CameraPresenceProviderExternalSyntheticLambda6 f$3;

    public /* synthetic */ AssetInvestmentHomeActivity$$ExternalSyntheticLambda3(findResAndMsg findresandmsg, getInternalId getinternalid, AssetInvestmentHomeActivity assetInvestmentHomeActivity, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6) {
        this.f$0 = findresandmsg;
        this.f$1 = getinternalid;
        this.f$2 = assetInvestmentHomeActivity;
        this.f$3 = cameraPresenceProviderExternalSyntheticLambda6;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 33;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return AssetInvestmentHomeActivity.onNavigationEvent(this.f$0, this.f$1, this.f$2, this.f$3, (HighSpeedResolverExternalSyntheticLambda2) obj, (switchUserLoginRpc) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
        }
        AssetInvestmentHomeActivity.onNavigationEvent(this.f$0, this.f$1, this.f$2, this.f$3, (HighSpeedResolverExternalSyntheticLambda2) obj, (switchUserLoginRpc) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
        throw null;
    }
}
