package im.toss.features.home.feature.asset_home.activity;

import im.toss.features.home.feature.asset_home.viewmodel.edit.AssetDepositHomeEditViewModel;
import kotlin.Unit;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.TwoLineExternalSyntheticLambda0;
import o.setDividerDrawable;
import o.setParentLayoutDirection;
import o.setTaggedAddrCtrl;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetHomeEditNavActivity$$ExternalSyntheticLambda6 implements setTaggedAddrCtrl {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ AssetDepositHomeEditViewModel f$0;
    public final /* synthetic */ setParentLayoutDirection f$1;
    public final /* synthetic */ AssetHomeEditNavActivity f$2;

    public /* synthetic */ AssetHomeEditNavActivity$$ExternalSyntheticLambda6(AssetDepositHomeEditViewModel assetDepositHomeEditViewModel, setParentLayoutDirection setparentlayoutdirection, AssetHomeEditNavActivity assetHomeEditNavActivity) {
        this.f$0 = assetDepositHomeEditViewModel;
        this.f$1 = setparentlayoutdirection;
        this.f$2 = assetHomeEditNavActivity;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 49;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = AssetHomeEditNavActivity.IAuthTabCallback(this.f$0, this.f$1, this.f$2, (setDividerDrawable) obj, (TwoLineExternalSyntheticLambda0) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
        int i4 = onNavigationEvent + 31;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 70 / 0;
        }
        return unitIAuthTabCallback;
    }
}
