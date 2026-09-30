package im.toss.features.home.feature.asset_home.activity;

import im.toss.features.home.feature.asset_home.viewmodel.edit.AssetLoanHomeEditViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.getKekid;
import o.getPBRpcProxy;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetHomeEditNavActivity$$ExternalSyntheticLambda18 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ AssetHomeEditNavActivity f$0;
    public final /* synthetic */ AssetLoanHomeEditViewModel f$1;

    public /* synthetic */ AssetHomeEditNavActivity$$ExternalSyntheticLambda18(AssetHomeEditNavActivity assetHomeEditNavActivity, AssetLoanHomeEditViewModel assetLoanHomeEditViewModel) {
        this.f$0 = assetHomeEditNavActivity;
        this.f$1 = assetLoanHomeEditViewModel;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 43;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0, this.f$1, (getPBRpcProxy.onWarmupCompleted) obj};
        Unit unit = (Unit) AssetHomeEditNavActivity.onExtraCallbackWithResult(getKekid.onExtraCallback(), getKekid.onExtraCallback(), objArr, 1717817157, getKekid.onExtraCallback(), getKekid.onExtraCallback(), -1717817118);
        int i4 = onExtraCallbackWithResult + 61;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }
}
