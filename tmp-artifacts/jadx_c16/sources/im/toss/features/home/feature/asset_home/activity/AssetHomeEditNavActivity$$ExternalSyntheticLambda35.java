package im.toss.features.home.feature.asset_home.activity;

import im.toss.features.home.feature.asset_home.viewmodel.edit.AssetInvestmentHomeEditViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda8;
import o.GlobalInfoRecorderUtils;
import o.setParentLayoutDirection;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetHomeEditNavActivity$$ExternalSyntheticLambda35 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ AssetInvestmentHomeEditViewModel f$0;
    public final /* synthetic */ setParentLayoutDirection f$1;
    public final /* synthetic */ AssetHomeEditNavActivity f$2;
    public final /* synthetic */ GlobalInfoRecorderUtils f$3;

    public /* synthetic */ AssetHomeEditNavActivity$$ExternalSyntheticLambda35(AssetInvestmentHomeEditViewModel assetInvestmentHomeEditViewModel, setParentLayoutDirection setparentlayoutdirection, AssetHomeEditNavActivity assetHomeEditNavActivity, GlobalInfoRecorderUtils globalInfoRecorderUtils) {
        this.f$0 = assetInvestmentHomeEditViewModel;
        this.f$1 = setparentlayoutdirection;
        this.f$2 = assetHomeEditNavActivity;
        this.f$3 = globalInfoRecorderUtils;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 85;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            AssetHomeEditNavActivity.onExtraCallback(this.f$0, this.f$1, this.f$2, this.f$3, (ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda8) obj);
            throw null;
        }
        Unit unitOnExtraCallback = AssetHomeEditNavActivity.onExtraCallback(this.f$0, this.f$1, this.f$2, this.f$3, (ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda8) obj);
        int i3 = onExtraCallback + 119;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallback;
    }
}
