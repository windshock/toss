package im.toss.features.home.feature.asset_home.activity;

import im.toss.features.home.feature.asset_home.viewmodel.edit.AssetDepositHomeEditViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda8;
import o.GlobalInfoRecorderUtils;
import o.setParentLayoutDirection;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetHomeEditNavActivity$$ExternalSyntheticLambda27 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ AssetDepositHomeEditViewModel f$0;
    public final /* synthetic */ setParentLayoutDirection f$1;
    public final /* synthetic */ AssetHomeEditNavActivity f$2;
    public final /* synthetic */ GlobalInfoRecorderUtils f$3;

    public /* synthetic */ AssetHomeEditNavActivity$$ExternalSyntheticLambda27(AssetDepositHomeEditViewModel assetDepositHomeEditViewModel, setParentLayoutDirection setparentlayoutdirection, AssetHomeEditNavActivity assetHomeEditNavActivity, GlobalInfoRecorderUtils globalInfoRecorderUtils) {
        this.f$0 = assetDepositHomeEditViewModel;
        this.f$1 = setparentlayoutdirection;
        this.f$2 = assetHomeEditNavActivity;
        this.f$3 = globalInfoRecorderUtils;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 29;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = AssetHomeEditNavActivity.onExtraCallbackWithResult(this.f$0, this.f$1, this.f$2, this.f$3, (ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda8) obj);
        int i4 = onNavigationEvent + 5;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
