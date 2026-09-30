package im.toss.features.home.feature.asset_home.activity.home;

import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.DeviceQuirksExternalSyntheticLambda0;
import o.getBacktraceNote;
import o.getInternalId;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetInvestmentHomeActivity$$ExternalSyntheticLambda15 implements getBacktraceNote {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ getInternalId f$0;
    public final /* synthetic */ AssetInvestmentHomeActivity f$1;

    public /* synthetic */ AssetInvestmentHomeActivity$$ExternalSyntheticLambda15(getInternalId getinternalid, AssetInvestmentHomeActivity assetInvestmentHomeActivity) {
        this.f$0 = getinternalid;
        this.f$1 = assetInvestmentHomeActivity;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 71;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        getInternalId getinternalid = this.f$0;
        if (i3 == 0) {
            return AssetInvestmentHomeActivity.onExtraCallbackWithResult(getinternalid, this.f$1, (DeviceQuirksExternalSyntheticLambda0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        }
        AssetInvestmentHomeActivity.onExtraCallbackWithResult(getinternalid, this.f$1, (DeviceQuirksExternalSyntheticLambda0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        Object obj4 = null;
        obj4.hashCode();
        throw null;
    }
}
