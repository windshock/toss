package im.toss.features.home.feature.asset_home.activity;

import im.toss.features.home.feature.asset_home.viewmodel.edit.AssetEtcHomeEditViewModel;
import kotlin.Unit;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.TwoLineExternalSyntheticLambda0;
import o.setDividerDrawable;
import o.setParentLayoutDirection;
import o.setTaggedAddrCtrl;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetHomeEditNavActivity$$ExternalSyntheticLambda68 implements setTaggedAddrCtrl {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ AssetEtcHomeEditViewModel f$0;
    public final /* synthetic */ setParentLayoutDirection f$1;
    public final /* synthetic */ AssetHomeEditNavActivity f$2;

    public /* synthetic */ AssetHomeEditNavActivity$$ExternalSyntheticLambda68(AssetEtcHomeEditViewModel assetEtcHomeEditViewModel, setParentLayoutDirection setparentlayoutdirection, AssetHomeEditNavActivity assetHomeEditNavActivity) {
        this.f$0 = assetEtcHomeEditViewModel;
        this.f$1 = setparentlayoutdirection;
        this.f$2 = assetHomeEditNavActivity;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 35;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = AssetHomeEditNavActivity.onExtraCallback(this.f$0, this.f$1, this.f$2, (setDividerDrawable) obj, (TwoLineExternalSyntheticLambda0) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
        int i4 = onExtraCallback + 89;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }
}
