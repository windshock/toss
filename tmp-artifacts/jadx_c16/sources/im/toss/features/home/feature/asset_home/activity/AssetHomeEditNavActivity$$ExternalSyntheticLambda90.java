package im.toss.features.home.feature.asset_home.activity;

import im.toss.features.home.feature.asset_home.viewmodel.edit.AssetLoanHomeEditViewModel;
import kotlin.jvm.functions.Function0;
import o.getSupportedHighSpeedResolutionsFor;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetHomeEditNavActivity$$ExternalSyntheticLambda90 implements Function0 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    public final /* synthetic */ AssetLoanHomeEditViewModel f$0;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$1;
    public final /* synthetic */ AssetHomeEditNavActivity f$2;

    public /* synthetic */ AssetHomeEditNavActivity$$ExternalSyntheticLambda90(AssetLoanHomeEditViewModel assetLoanHomeEditViewModel, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, AssetHomeEditNavActivity assetHomeEditNavActivity) {
        this.f$0 = assetLoanHomeEditViewModel;
        this.f$1 = getsupportedhighspeedresolutionsfor;
        this.f$2 = assetHomeEditNavActivity;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 3;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        AssetLoanHomeEditViewModel assetLoanHomeEditViewModel = this.f$0;
        if (i3 != 0) {
            return AssetHomeEditNavActivity.IAuthTabCallback(assetLoanHomeEditViewModel, this.f$1, this.f$2);
        }
        AssetHomeEditNavActivity.IAuthTabCallback(assetLoanHomeEditViewModel, this.f$1, this.f$2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
