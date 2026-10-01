package im.toss.features.home.feature.asset_home.activity;

import im.toss.features.home.feature.asset_home.viewmodel.edit.AssetEtcHomeEditViewModel;
import kotlin.jvm.functions.Function1;
import o.ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda8;
import o.GlobalInfoRecorderUtils;
import o.setParentLayoutDirection;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetHomeEditNavActivity$$ExternalSyntheticLambda70 implements Function1 {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ AssetEtcHomeEditViewModel f$0;
    public final /* synthetic */ setParentLayoutDirection f$1;
    public final /* synthetic */ AssetHomeEditNavActivity f$2;
    public final /* synthetic */ GlobalInfoRecorderUtils f$3;

    public /* synthetic */ AssetHomeEditNavActivity$$ExternalSyntheticLambda70(AssetEtcHomeEditViewModel assetEtcHomeEditViewModel, setParentLayoutDirection setparentlayoutdirection, AssetHomeEditNavActivity assetHomeEditNavActivity, GlobalInfoRecorderUtils globalInfoRecorderUtils) {
        this.f$0 = assetEtcHomeEditViewModel;
        this.f$1 = setparentlayoutdirection;
        this.f$2 = assetHomeEditNavActivity;
        this.f$3 = globalInfoRecorderUtils;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 25;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        AssetEtcHomeEditViewModel assetEtcHomeEditViewModel = this.f$0;
        if (i3 == 0) {
            return AssetHomeEditNavActivity.IAuthTabCallback(assetEtcHomeEditViewModel, this.f$1, this.f$2, this.f$3, (ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda8) obj);
        }
        AssetHomeEditNavActivity.IAuthTabCallback(assetEtcHomeEditViewModel, this.f$1, this.f$2, this.f$3, (ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda8) obj);
        throw null;
    }
}
