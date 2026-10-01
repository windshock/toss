package im.toss.features.home.feature.asset_home.activity;

import im.toss.features.home.feature.asset_home.viewmodel.edit.AssetLoanHomeEditViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda8;
import o.GlobalInfoRecorderUtils;
import o.setParentLayoutDirection;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetHomeEditNavActivity$$ExternalSyntheticLambda85 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ AssetLoanHomeEditViewModel f$0;
    public final /* synthetic */ setParentLayoutDirection f$1;
    public final /* synthetic */ AssetHomeEditNavActivity f$2;
    public final /* synthetic */ GlobalInfoRecorderUtils f$3;

    public /* synthetic */ AssetHomeEditNavActivity$$ExternalSyntheticLambda85(AssetLoanHomeEditViewModel assetLoanHomeEditViewModel, setParentLayoutDirection setparentlayoutdirection, AssetHomeEditNavActivity assetHomeEditNavActivity, GlobalInfoRecorderUtils globalInfoRecorderUtils) {
        this.f$0 = assetLoanHomeEditViewModel;
        this.f$1 = setparentlayoutdirection;
        this.f$2 = assetHomeEditNavActivity;
        this.f$3 = globalInfoRecorderUtils;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 99;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = AssetHomeEditNavActivity.onExtraCallbackWithResult(this.f$0, this.f$1, this.f$2, this.f$3, (ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda8) obj);
        int i4 = onWarmupCompleted + 97;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }
}
