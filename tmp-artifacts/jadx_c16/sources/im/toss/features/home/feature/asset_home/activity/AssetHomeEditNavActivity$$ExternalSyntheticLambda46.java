package im.toss.features.home.feature.asset_home.activity;

import im.toss.features.home.feature.asset_home.viewmodel.edit.AssetCardHomeEditViewModel;
import kotlin.Unit;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.GlobalInfoRecorderUtils;
import o.TwoLineExternalSyntheticLambda0;
import o.setDividerDrawable;
import o.setTaggedAddrCtrl;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetHomeEditNavActivity$$ExternalSyntheticLambda46 implements setTaggedAddrCtrl {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ AssetHomeEditNavActivity f$0;
    public final /* synthetic */ AssetCardHomeEditViewModel f$1;
    public final /* synthetic */ GlobalInfoRecorderUtils f$2;

    public /* synthetic */ AssetHomeEditNavActivity$$ExternalSyntheticLambda46(AssetHomeEditNavActivity assetHomeEditNavActivity, AssetCardHomeEditViewModel assetCardHomeEditViewModel, GlobalInfoRecorderUtils globalInfoRecorderUtils) {
        this.f$0 = assetHomeEditNavActivity;
        this.f$1 = assetCardHomeEditViewModel;
        this.f$2 = globalInfoRecorderUtils;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 25;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = AssetHomeEditNavActivity.onNavigationEvent(this.f$0, this.f$1, this.f$2, (setDividerDrawable) obj, (TwoLineExternalSyntheticLambda0) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
        int i4 = onExtraCallbackWithResult + 19;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }
}
